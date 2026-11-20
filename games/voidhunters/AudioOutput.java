/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private static AudioPump pump;
    private int activityBudget;
    private long mixTimeMillis;
    private boolean closed;
    private static int field_u;
    int[] samples;
    private PcmStream stream;
    private int capacity;
    private int rescheduleSamplesRemaining;
    private PcmStream[] priorityHeads;
    private PcmStream[] priorityTails;
    private long reopenAfterMillis;
    private int maxConsumedSamples;
    private long nextBufferCheckMillis;
    static int sampleRate;
    private int previousConsumedSamples;
    private boolean recentlyOpened;
    private int adaptiveBufferSamples;
    private int previousBufferedSamples;
    static boolean stereo;
    private int requestedBufferSamples;

    public static void clearSharedReferences() {
        pump = null;
    }

    final static AudioOutput create(PlatformService param0, java.awt.Component param1, int param2, int param3) {
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
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
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
              ((AudioOutput) ((Object) stackIn_10_0)).samples = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).requestedBufferSamples = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).capacity = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).capacity > 16384) {
                ((AudioOutput) ((Object) var4)).capacity = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).capacity);
              if (field_u > 0 &&
                pump == null) {
                pump = new AudioPump();
                pump.platform = param0;
                param0.startThread(0, field_u, (Runnable) ((Object) pump));
              }
              if (pump != null) {
                if (pump.outputs[param2] != null) {
                  throw new IllegalArgumentException();
                }
                pump.outputs[param2] = (AudioOutput) ((Object) var5);
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

    final synchronized void service() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.closed) {
            return;
          }
          var1 = MonotonicMillisClock.currentTimeMillis(false);
          try {
            if (var1 > this.mixTimeMillis + 6000L) {
              this.mixTimeMillis = var1 - 6000L;
            }
            while (var1 > this.mixTimeMillis + 5000L) {
              this.skipSamples(256);
              this.mixTimeMillis = this.mixTimeMillis + (long)(256000 / sampleRate);
              var1 = MonotonicMillisClock.currentTimeMillis(false);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.mixTimeMillis = var1;
          }
          if (this.samples == null) {
            return;
          }
          try {
            if (this.reopenAfterMillis != 0L) {
              if (var1 < this.reopenAfterMillis) {
                return;
              }
              this.openDevice(this.capacity);
              this.reopenAfterMillis = 0L;
              this.recentlyOpened = true;
            }
            var3_int = this.getBufferedSamples();
            if (this.previousBufferedSamples - var3_int > this.maxConsumedSamples) {
              this.maxConsumedSamples = this.previousBufferedSamples - var3_int;
            }
            var4 = this.requestedBufferSamples + this.adaptiveBufferSamples;
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
              this.recentlyOpened = true;
              if (var4 + 256 > this.capacity) {
                var4 = this.capacity - 256;
                this.adaptiveBufferSamples = var4 - this.requestedBufferSamples;
              }
            }
            while (var3_int < var4) {
              this.mixBuffer(this.samples, 256);
              this.writeDevice();
              var3_int += 256;
            }
            if (var1 > this.nextBufferCheckMillis) {
              if (this.recentlyOpened) {
                this.recentlyOpened = false;
              } else {
                if (this.maxConsumedSamples == 0 &&
                  this.previousConsumedSamples == 0) {
                  this.closeDevice();
                  this.reopenAfterMillis = var1 + 2000L;
                  return;
                }
                this.adaptiveBufferSamples = Math.min(this.previousConsumedSamples, this.maxConsumedSamples);
                this.previousConsumedSamples = this.maxConsumedSamples;
              }
              this.maxConsumedSamples = 0;
              this.nextBufferCheckMillis = var1 + 2000L;
            }
            this.previousBufferedSamples = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.reopenAfterMillis = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void enqueueStream(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.priorityTails[var3];
        if (var4 == null) {
          this.priorityHeads[var3] = param0;
        } else {
          var4.schedulerNext = param0;
        }
        this.priorityTails[var3] = param0;
        param0.schedulingPriority = param1;
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = param0;
        stereo = param1 ? true : false;
        field_u = param2;
    }

    final synchronized void setStream(PcmStream param0) {
        this.stream = param0;
    }

    void openDevice(int param0) throws Exception {
    }

    final synchronized void flush() {
        try {
          this.recentlyOpened = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.reopenAfterMillis = MonotonicMillisClock.currentTimeMillis(false) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void closeDevice() {
    }

    private final void mixBuffer(int[] param0, int param1) {
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
        SoundNode var12;
        int var13;
        PcmStream var14;
        int var15_int;
        PcmStream var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        PcmStream var14Lifetime1;
        PcmStream var14Lifetime2;
        var3 = param1;
        if (stereo) {
          var3 = var3 << 1;
        }
        ArrayOperations.clear(param0, 0, var3);
        this.rescheduleSamplesRemaining = this.rescheduleSamplesRemaining - param1;
        if (this.stream != null &&
          this.rescheduleSamplesRemaining <= 0) {
          this.rescheduleSamplesRemaining = this.rescheduleSamplesRemaining + (sampleRate >> 4);
          AudioOutput.deactivateStreamTree(this.stream);
          this.enqueueStream(this.stream, this.stream.getPriority());
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
                    var12 = var11.sound;
                    if (var12 != null &&
                      var12.schedulingWeight > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.schedulerNext;
                      continue;
                    }
                    var11.active = true;
                    var13 = var11.getActivityWeight();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.schedulingWeight = var12.schedulingWeight + var13;
                    }
                    if (var4 >= this.activityBudget) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.schedulingPriority;
                      while (var14Lifetime2 != null) {
                        this.enqueueStream(var14Lifetime2, var15_int * var14Lifetime2.getPriority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
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
        if (this.rescheduleSamplesRemaining < 0) {
          this.rescheduleSamplesRemaining = 0;
        }
        if (this.stream != null) {
          this.stream.mix(param0, 0, param1);
        }
        this.mixTimeMillis = MonotonicMillisClock.currentTimeMillis(false);
    }

    void writeDevice() throws Exception {
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (pump != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (pump.outputs[var2] == this) {
              pump.outputs[var2] = null;
            }
            if (pump.outputs[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            pump.stopRequested = true;
            while (pump.running) {
              BufferedFile.sleep(-109, 50L);
            }
            pump = null;
          }
        }
        this.closeDevice();
        this.samples = null;
        this.closed = true;
    }

    void flushDevice() throws Exception {
    }

    private final void skipSamples(int param0) {
        this.rescheduleSamplesRemaining = this.rescheduleSamplesRemaining - param0;
        if (this.rescheduleSamplesRemaining < 0) {
          this.rescheduleSamplesRemaining = 0;
        }
        if (this.stream != null) {
          this.stream.skip(param0);
          return;
        }
    }

    private final static void deactivateStreamTree(PcmStream param0) {
        param0.active = false;
        if (param0.sound != null) {
          param0.sound.schedulingWeight = 0;
        }
        PcmStream var1 = param0.firstSubStream();
        while (var1 != null) {
          AudioOutput.deactivateStreamTree(var1);
          var1 = param0.nextSubStream();
        }
    }

    int getBufferedSamples() throws Exception {
        return this.capacity;
    }

    AudioOutput() {
        this.closed = false;
        this.activityBudget = 32;
        this.mixTimeMillis = MonotonicMillisClock.currentTimeMillis(false);
        this.rescheduleSamplesRemaining = 0;
        this.reopenAfterMillis = 0L;
        this.maxConsumedSamples = 0;
        this.priorityTails = new PcmStream[8];
        this.previousConsumedSamples = 0;
        this.nextBufferCheckMillis = 0L;
        this.previousBufferedSamples = 0;
        this.recentlyOpened = true;
        this.priorityHeads = new PcmStream[8];
    }
}
