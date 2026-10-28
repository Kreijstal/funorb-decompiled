/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private static int threadPriority;
    int[] mixBuffer;
    private long lastMixTimeMillis;
    private static AudioService service;
    static boolean stereo;
    private int activityLimit;
    static int sampleRate;
    private boolean closed;
    private PcmStream rootStream;
    private int maxBufferDrain;
    private PcmStream[] priorityHeads;
    private int schedulerCountdown;
    private long nextAdjustmentMillis;
    private int previousBufferDrain;
    private int capacity;
    private long reopenAtMillis;
    private int desiredBufferedSamples;
    private boolean deviceRecentlyReset;
    private PcmStream[] priorityTails;
    private int lastBufferedSamples;
    private int latencyCorrection;

    void closeDevice() {
    }

    private final void mixBlock(int[] samples, int length) {
        int var7_int;
        int var8_int;
        int var3 = length;
        if (stereo) {
          var3 = var3 << 1;
        }
        ArraySupport.clear(samples, 0, var3);
        this.schedulerCountdown = this.schedulerCountdown - length;
        if (this.rootStream != null &&
          this.schedulerCountdown <= 0) {
          this.schedulerCountdown = this.schedulerCountdown + (sampleRate >> 4);
          AudioOutput.deactivateTree(this.rootStream);
          this.enqueueByPriority(this.rootStream, this.rootStream.priority());
          int var4 = 0;
          int var5 = 255;
          int var6 = 7;
          scanLoop1: while (true) {
            if (var5 != 0) {
              if (var6 >= 0) {
                var7_int = var6;
                var8_int = 0;
              } else {
                var7_int = var6 & 3;
                var8_int = -(var6 >> 2);
              }
              int var9 = var5 >>> var7_int & 286331153;
              while (var9 != 0) {
                if ((var9 & 1) != 0) {
                  var5 = var5 & ~(1 << var7_int);
                  Object var10 = null;
                  PcmStream var11 = this.priorityHeads[var7_int];
                  PcmStream var14 = var11;
                  PcmStream var14Lifetime1 = var11;
                  while (var11 != null) {
                    AbstractPcmSample var12 = var11.sample;
                    if (var12 != null &&
                      var12.schedulerPosition > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.schedulerNext;
                      continue;
                    }
                    var11.active = true;
                    int var13 = var11.activity();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.schedulerPosition = var12.schedulerPosition + var13;
                    }
                    if (var4 >= this.activityLimit) {
                      break scanLoop1;
                    }
                    PcmStream var14Lifetime2 = var11.firstSubstream();
                    if (var14Lifetime2 != null) {
                      int var15_int = var11.schedulerPriority;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubstream();
                      }
                    }
                    PcmStream var15 = var11.schedulerNext;
                    var11.schedulerNext = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).schedulerNext = var15;
                    } else {
                      this.priorityHeads[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.priorityTails[var7_int] = (PcmStream) (var10);
                    }
                    var11 = var15;
                  }
                }
                var7_int += 4;
                var8_int++;
                var9 = var9 >>> 4;
              }
              var6--;
              continue;
            }
            break;
          }
          for (int var6Lifetime1 = 0; var6Lifetime1 < 8; var6Lifetime1++) {
            Object var7 = this.priorityHeads[var6Lifetime1];
            PcmStream[] var8 = this.priorityHeads;
            int var9Lifetime1 = var6Lifetime1;
            this.priorityTails[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              Object var10Lifetime1 = ((PcmStream) (var7)).schedulerNext;
              ((PcmStream) (var7)).schedulerNext = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.schedulerCountdown < 0) {
          this.schedulerCountdown = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.mixInto(samples, 0, length);
        }
        this.lastMixTimeMillis = td.b(128);
    }

    final static void configure(int newSampleRate, boolean newStereo, int newThreadPriority) {
        if (newSampleRate < 8000 ||
          newSampleRate > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = newSampleRate;
        stereo = newStereo ? true : false;
        threadPriority = newThreadPriority;
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.closed) {
            return;
          }
          long var1 = td.b(128);
          try {
            if (var1 > this.lastMixTimeMillis + 6000L) {
              this.lastMixTimeMillis = var1 - 6000L;
            }
            while (var1 > this.lastMixTimeMillis + 5000L) {
              this.skipSamples(256);
              this.lastMixTimeMillis = this.lastMixTimeMillis + (long)(256000 / sampleRate);
              var1 = td.b(128);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.lastMixTimeMillis = var1;
          }
          if (this.mixBuffer == null) {
            return;
          }
          try {
            if (this.reopenAtMillis != 0L) {
              if (var1 < this.reopenAtMillis) {
                return;
              }
              this.openDevice(this.capacity);
              this.reopenAtMillis = 0L;
              this.deviceRecentlyReset = true;
            }
            int var3_int = this.bufferedSamples();
            if (this.lastBufferedSamples - var3_int > this.maxBufferDrain) {
              this.maxBufferDrain = this.lastBufferedSamples - var3_int;
            }
            int var4 = this.desiredBufferedSamples + this.latencyCorrection;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.capacity) {
              this.capacity = this.capacity + 1024;
              if (this.capacity > 16384) {
                this.capacity = 16384;
              }
              this.closeDevice();
              this.openDevice(this.capacity);
              var3_int = 0;
              this.deviceRecentlyReset = true;
              if (var4 + 256 > this.capacity) {
                var4 = this.capacity - 256;
                this.latencyCorrection = var4 - this.desiredBufferedSamples;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.mixBuffer, 256);
              this.writeDeviceBlock();
              var3_int += 256;
            }
            if (var1 > this.nextAdjustmentMillis) {
              if (this.deviceRecentlyReset) {
                this.deviceRecentlyReset = false;
              } else {
                if (this.maxBufferDrain == 0 &&
                  this.previousBufferDrain == 0) {
                  this.closeDevice();
                  this.reopenAtMillis = var1 + 2000L;
                  return;
                }
                this.latencyCorrection = Math.min(this.previousBufferDrain, this.maxBufferDrain);
                this.previousBufferDrain = this.maxBufferDrain;
              }
              this.maxBufferDrain = 0;
              this.nextAdjustmentMillis = var1 + 2000L;
            }
            this.lastBufferedSamples = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.reopenAtMillis = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enqueueByPriority(PcmStream stream, int priority) {
        int var3 = priority >> 5;
        PcmStream var4 = this.priorityTails[var3];
        if (var4 == null) {
          this.priorityHeads[var3] = stream;
        } else {
          var4.schedulerNext = stream;
        }
        this.priorityTails[var3] = stream;
        stream.schedulerPriority = priority;
    }

    public static void releaseStatics() {
        service = null;
    }

    void flushDevice() throws Exception {
    }

    private final static void deactivateTree(PcmStream stream) {
        stream.active = false;
        if (stream.sample != null) {
          stream.sample.schedulerPosition = 0;
        }
        PcmStream var1 = stream.firstSubstream();
        while (var1 != null) {
          AudioOutput.deactivateTree(var1);
          var1 = stream.nextSubstream();
        }
    }

    int bufferedSamples() throws Exception {
        return this.capacity;
    }

    final synchronized void setStream(PcmStream stream) {
        this.rootStream = stream;
    }

    void openDevice(int capacity) throws Exception {
    }

    void initializeDevice(java.awt.Component component) throws Exception {
    }

    void writeDeviceBlock() throws Exception {
    }

    private final void skipSamples(int length) {
        this.schedulerCountdown = this.schedulerCountdown - length;
        if (this.schedulerCountdown < 0) {
          this.schedulerCountdown = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.skip(length);
          return;
        }
    }

    final synchronized void flush() {
        try {
          this.deviceRecentlyReset = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.reopenAtMillis = td.b(128) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static AudioOutput create(SystemTaskService tasks, java.awt.Component component, int slot, int bufferedSamples) {
        try {
          int stackIn_11_2 = 0;
          if (sampleRate == 0) {
            throw new IllegalStateException();
          }
          if (slot >= 0 &&
            slot < 2) {
            if (bufferedSamples < 256) {
              bufferedSamples = 256;
            }
            try {
              JavaSoundAudioOutput var5 = new JavaSoundAudioOutput();
              JavaSoundAudioOutput var4 = var5;
              JavaSoundAudioOutput stackIn_10_0 = var4;
              int stackIn_10_1 = 256;
              stackIn_11_2 = (!stereo) ? (1) : (2);
              ((AudioOutput) ((Object) stackIn_10_0)).mixBuffer = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).desiredBufferedSamples = bufferedSamples;
              ((AudioOutput) ((Object) var4)).initializeDevice(component);
              ((AudioOutput) ((Object) var4)).capacity = (bufferedSamples & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).capacity > 16384) {
                ((AudioOutput) ((Object) var4)).capacity = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).capacity);
              if (threadPriority > 0 &&
                service == null) {
                service = new AudioService();
                service.tasks = tasks;
                tasks.a(true, threadPriority, (Runnable) ((Object) service));
              }
              if (service != null) {
                if (service.outputs[slot] != null) {
                  throw new IllegalArgumentException();
                }
                service.outputs[slot] = (AudioOutput) ((Object) var5);
              }
              JavaSoundAudioOutput stackIn_21_0 = var4;
              return (AudioOutput) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var4_ref = decompiledCaughtException;
              return new AudioOutput();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void shutdown() {
        if (service != null) {
          boolean var1 = true;
          for (int var2 = 0; var2 < 2; var2++) {
            if (service.outputs[var2] == this) {
              service.outputs[var2] = null;
            }
            if (service.outputs[var2] != null) {
              var1 = false;
            }
          }
          if (var1) {
            service.stopRequested = true;
            while (service.running) {
              AchievementTracker.sleepMillis((byte) -46, 50L);
            }
            service = null;
          }
        }
        this.closeDevice();
        this.mixBuffer = null;
        this.closed = true;
    }

    AudioOutput() {
        this.activityLimit = 32;
        this.closed = false;
        this.lastMixTimeMillis = td.b(128);
        this.schedulerCountdown = 0;
        this.previousBufferDrain = 0;
        this.nextAdjustmentMillis = 0L;
        this.priorityHeads = new PcmStream[8];
        this.maxBufferDrain = 0;
        this.reopenAtMillis = 0L;
        this.priorityTails = new PcmStream[8];
        this.deviceRecentlyReset = true;
        this.lastBufferedSamples = 0;
    }
}
