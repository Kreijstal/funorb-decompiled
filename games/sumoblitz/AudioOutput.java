/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private static AudioServiceThread serviceThread;
    int[] mixBuffer;
    static boolean stereo;
    private int activityLimit;
    private static int threadPriority;
    private boolean closed;
    static int sampleRate;
    private PcmStream stream;
    private long lastMixMillis;
    private PcmStream[] priorityHeads;
    private int queueAdjustment;
    private boolean recentlyOpened;
    private int previousMaxDrain;
    private PcmStream[] priorityTails;
    private int maxDrain;
    private int scheduleCountdown;
    private int lastQueuedSamples;
    private int targetQueuedSamples;
    private long nextQueueCheckMillis;
    private long reopenAtMillis;
    private int capacitySamples;

    final synchronized void flush() {
        try {
          this.recentlyOpened = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.reopenAtMillis = wq.a(-20) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static AudioOutput create(PlatformTaskDispatcher taskDispatcher, java.awt.Component component, int outputIndex, int targetSamples) {
        try {
          JavaSoundAudioOutput var4 = null;
          Throwable var4_ref = null;
          JavaSoundAudioOutput var5 = null;
          JavaSoundAudioOutput stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          JavaSoundAudioOutput stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (sampleRate == 0) {
            throw new IllegalStateException();
          }
          if (outputIndex >= 0 &&
            outputIndex < 2) {
            if (targetSamples < 256) {
              targetSamples = 256;
            }
            try {
              var5 = new JavaSoundAudioOutput();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!stereo) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).mixBuffer = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).targetQueuedSamples = targetSamples;
              ((AudioOutput) ((Object) var4)).initializeDevice(component);
              ((AudioOutput) ((Object) var4)).capacitySamples = (targetSamples & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).capacitySamples > 16384) {
                ((AudioOutput) ((Object) var4)).capacitySamples = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).capacitySamples);
              if (threadPriority > 0 &&
                serviceThread == null) {
                serviceThread = new AudioServiceThread();
                serviceThread.taskDispatcher = taskDispatcher;
                taskDispatcher.a(true, (Runnable) ((Object) serviceThread), threadPriority);
              }
              if (serviceThread != null) {
                if (serviceThread.outputs[outputIndex] != null) {
                  throw new IllegalArgumentException();
                }
                serviceThread.outputs[outputIndex] = (AudioOutput) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (AudioOutput) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
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

    private final static void deactivateSubstreams(PcmStream param0) {
        param0.active = false;
        if (param0.sample != null) {
          param0.sample.schedulerWeight = 0;
        }
        PcmStream var1 = param0.firstSubstream();
        while (var1 != null) {
          AudioOutput.deactivateSubstreams(var1);
          var1 = param0.nextSubstream();
        }
    }

    void writeBlock() throws Exception {
    }

    int queuedSamples() throws Exception {
        return this.capacitySamples;
    }

    final synchronized void setStream(PcmStream stream) {
        this.stream = stream;
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (serviceThread != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (serviceThread.outputs[var2] == this) {
              serviceThread.outputs[var2] = null;
            }
            if (serviceThread.outputs[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            serviceThread.stopRequested = true;
            while (serviceThread.running) {
              tg.a(50L, (byte) 112);
            }
            serviceThread = null;
          }
        }
        this.closeDevice();
        this.mixBuffer = null;
        this.closed = true;
    }

    private final void mixBlock(int[] output, int sampleCount) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        PcmStream[] var8;
        int var9;
        Object var10;
        PcmStream var11;
        AbstractAudioSample var12;
        int var13;
        PcmStream var14;
        int var15_int;
        PcmStream var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        PcmStream var14Lifetime1;
        PcmStream var14Lifetime2;
        var3 = sampleCount;
        if (stereo) {
          var3 = var3 << 1;
        }
        la.a(output, 0, var3);
        this.scheduleCountdown = this.scheduleCountdown - sampleCount;
        if (this.stream != null &&
          this.scheduleCountdown <= 0) {
          this.scheduleCountdown = this.scheduleCountdown + (sampleRate >> 4);
          AudioOutput.deactivateSubstreams(this.stream);
          this.scheduleStream(this.stream, this.stream.priority());
          var4 = 0;
          var5 = 255;
          var6 = 7;
          scanLoop1: while (true) {
            if (var5 != 0) {
              if (var6 >= 0) {
                var7_int = var6;
                var8_int = 0;
              } else {
                var7_int = var6 & 3;
                var8_int = -(var6 >> 2);
              }
              var9 = var5 >>> var7_int & 286331153;
              while (var9 != 0) {
                if ((var9 & 1) != 0) {
                  var5 = var5 & ~(1 << var7_int);
                  var10 = null;
                  var11 = this.priorityHeads[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.sample;
                    if (var12 != null &&
                      var12.schedulerWeight > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.schedulerNext;
                      continue;
                    }
                    var11.active = true;
                    var13 = var11.activityWeight();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.schedulerWeight = var12.schedulerWeight + var13;
                    }
                    if (var4 >= this.activityLimit) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubstream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.schedulerPriority;
                      while (var14Lifetime2 != null) {
                        this.scheduleStream(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextSubstream();
                      }
                    }
                    var15 = var11.schedulerNext;
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
          for (var6Lifetime1 = 0; var6Lifetime1 < 8; var6Lifetime1++) {
            var7 = this.priorityHeads[var6Lifetime1];
            var8 = this.priorityHeads;
            var9Lifetime1 = var6Lifetime1;
            this.priorityTails[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).schedulerNext;
              ((PcmStream) (var7)).schedulerNext = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.scheduleCountdown < 0) {
          this.scheduleCountdown = 0;
        }
        if (this.stream != null) {
          this.stream.mixInto(output, 0, sampleCount);
        }
        this.lastMixMillis = wq.a(-54);
    }

    private final void skipSamples(int param0) {
        this.scheduleCountdown = this.scheduleCountdown - param0;
        if (this.scheduleCountdown < 0) {
          this.scheduleCountdown = 0;
        }
        if (this.stream != null) {
          this.stream.skip(param0);
          return;
        }
    }

    final static void configure(int requestedSampleRate, boolean stereoEnabled, int servicePriority) {
        if (requestedSampleRate < 8000 ||
          requestedSampleRate > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = requestedSampleRate;
        stereo = stereoEnabled ? true : false;
        threadPriority = servicePriority;
    }

    void flushDevice() throws Exception {
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.closed) {
            return;
          }
          var1 = wq.a(-124);
          try {
            if (var1 > this.lastMixMillis + 6000L) {
              this.lastMixMillis = var1 - 6000L;
            }
            while (var1 > this.lastMixMillis + 5000L) {
              this.skipSamples(256);
              this.lastMixMillis = this.lastMixMillis + (long)(256000 / sampleRate);
              var1 = wq.a(-119);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.lastMixMillis = var1;
          }
          if (this.mixBuffer == null) {
            return;
          }
          try {
            if (this.reopenAtMillis != 0L) {
              if (var1 < this.reopenAtMillis) {
                return;
              }
              this.openDevice(this.capacitySamples);
              this.reopenAtMillis = 0L;
              this.recentlyOpened = true;
            }
            var3_int = this.queuedSamples();
            if (this.lastQueuedSamples - var3_int > this.maxDrain) {
              this.maxDrain = this.lastQueuedSamples - var3_int;
            }
            var4 = this.targetQueuedSamples + this.queueAdjustment;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.capacitySamples) {
              this.capacitySamples = this.capacitySamples + 1024;
              if (this.capacitySamples > 16384) {
                this.capacitySamples = 16384;
              }
              this.closeDevice();
              this.openDevice(this.capacitySamples);
              var3_int = 0;
              this.recentlyOpened = true;
              if (var4 + 256 > this.capacitySamples) {
                var4 = this.capacitySamples - 256;
                this.queueAdjustment = var4 - this.targetQueuedSamples;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.mixBuffer, 256);
              this.writeBlock();
              var3_int += 256;
            }
            if (var1 > this.nextQueueCheckMillis) {
              if (this.recentlyOpened) {
                this.recentlyOpened = false;
              } else {
                if (this.maxDrain == 0 &&
                  this.previousMaxDrain == 0) {
                  this.closeDevice();
                  this.reopenAtMillis = var1 + 2000L;
                  return;
                }
                this.queueAdjustment = Math.min(this.previousMaxDrain, this.maxDrain);
                this.previousMaxDrain = this.maxDrain;
              }
              this.maxDrain = 0;
              this.nextQueueCheckMillis = var1 + 2000L;
            }
            this.lastQueuedSamples = var3_int;
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

    private final void scheduleStream(PcmStream stream, int priority) {
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

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    void openDevice(int param0) throws Exception {
    }

    public static void releaseStatics() {
        serviceThread = null;
    }

    void closeDevice() {
    }

    AudioOutput() {
        this.closed = false;
        this.activityLimit = 32;
        this.lastMixMillis = wq.a(-12);
        this.recentlyOpened = true;
        this.priorityHeads = new PcmStream[8];
        this.previousMaxDrain = 0;
        this.priorityTails = new PcmStream[8];
        this.scheduleCountdown = 0;
        this.maxDrain = 0;
        this.nextQueueCheckMillis = 0L;
        this.lastQueuedSamples = 0;
        this.reopenAtMillis = 0L;
    }
}
