/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    int[] sampleBuffer;
    private PcmStream stream;
    private static AudioServiceThread serviceThread;
    static boolean stereo;
    private static int serviceThreadPriority;
    private boolean closed;
    private int activityBudget;
    private long streamTimeMillis;
    static int sampleRate;
    private int field_d;
    private int field_u;
    private int samplesUntilSchedule;
    private PcmStream[] priorityTails;
    private int targetBufferFrames;
    private PcmStream[] priorityHeads;
    private long field_i;
    private boolean field_j;
    private long reopenAtMillis;
    private int field_a;
    private int field_g;
    private int capacityFrames;

    void openDevice(int param0) throws Exception {
    }

    private final void mixSamples(int[] param0, int param1) {
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
        var3 = param1;
        if (stereo) {
          var3 = var3 << 1;
        }
        ArrayOperations.clearInts(param0, 0, var3);
        this.samplesUntilSchedule = this.samplesUntilSchedule - param1;
        if (this.stream != null &&
          this.samplesUntilSchedule <= 0) {
          this.samplesUntilSchedule = this.samplesUntilSchedule + (sampleRate >> 4);
          AudioOutput.disableStreamTree(this.stream);
          this.enqueuePriorityStream(this.stream, this.stream.getPriority());
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
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_i > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_k;
                      continue;
                    }
                    var11.field_l = true;
                    var13 = var11.getActivityWeight();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.activityBudget) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstSubStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.enqueuePriorityStream(var14Lifetime2, var15_int * var14Lifetime2.getPriority() >> 8);
                        var14Lifetime2 = var11.nextSubStream();
                      }
                    }
                    var15 = var11.field_k;
                    var11.field_k = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_k = var15;
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
              var10Lifetime1 = ((PcmStream) (var7)).field_k;
              ((PcmStream) (var7)).field_k = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.samplesUntilSchedule < 0) {
          this.samplesUntilSchedule = 0;
        }
        if (this.stream != null) {
          this.stream.mix(param0, 0, param1);
        }
        this.streamTimeMillis = BoundaryLoopTracer.monotonicTimeMillis(-1);
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (serviceThread != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (serviceThread.field_d[var2] == this) {
              serviceThread.field_d[var2] = null;
            }
            if (serviceThread.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            serviceThread.field_f = true;
            while (serviceThread.field_e) {
              SocketConnector.sleepMillis(50L, (byte) 45);
            }
            serviceThread = null;
          }
        }
        this.closeDevice();
        this.sampleBuffer = null;
        this.closed = true;
    }

    void closeDevice() {
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    private final static void disableStreamTree(PcmStream param0) {
        param0.field_l = false;
        if (param0.field_i != null) {
          param0.field_i.field_i = 0;
        }
        PcmStream var1 = param0.firstSubStream();
        while (var1 != null) {
          AudioOutput.disableStreamTree(var1);
          var1 = param0.nextSubStream();
        }
    }

    void writeDevice() throws Exception {
    }

    private final void skipSamples(int param0) {
        this.samplesUntilSchedule = this.samplesUntilSchedule - param0;
        if (this.samplesUntilSchedule < 0) {
          this.samplesUntilSchedule = 0;
        }
        if (this.stream != null) {
          this.stream.skip(param0);
          return;
        }
    }

    public static void clearSharedReferences() {
        serviceThread = null;
    }

    final static AudioOutput create(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
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
              ((AudioOutput) ((Object) stackIn_10_0)).sampleBuffer = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).targetBufferFrames = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).capacityFrames = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).capacityFrames > 16384) {
                ((AudioOutput) ((Object) var4)).capacityFrames = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).capacityFrames);
              if (serviceThreadPriority > 0 &&
                serviceThread == null) {
                serviceThread = new AudioServiceThread();
                serviceThread.field_c = param0;
                param0.startThread((byte) -28, serviceThreadPriority, (Runnable) ((Object) serviceThread));
              }
              if (serviceThread != null) {
                if (serviceThread.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                serviceThread.field_d[param2] = (AudioOutput) ((Object) var5);
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

    final synchronized void setStream(PcmStream param0) {
        this.stream = param0;
    }

    final static void configure(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        sampleRate = param0;
        stereo = param1 ? true : false;
        serviceThreadPriority = param2;
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
          var1 = BoundaryLoopTracer.monotonicTimeMillis(-1);
          try {
            if (var1 > this.streamTimeMillis + 6000L) {
              this.streamTimeMillis = var1 - 6000L;
            }
            while (var1 > this.streamTimeMillis + 5000L) {
              this.skipSamples(256);
              this.streamTimeMillis = this.streamTimeMillis + (long)(256000 / sampleRate);
              var1 = BoundaryLoopTracer.monotonicTimeMillis(-1);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.streamTimeMillis = var1;
          }
          if (this.sampleBuffer == null) {
            return;
          }
          try {
            if (this.reopenAtMillis != 0L) {
              if (var1 < this.reopenAtMillis) {
                return;
              }
              this.openDevice(this.capacityFrames);
              this.reopenAtMillis = 0L;
              this.field_j = true;
            }
            var3_int = this.getBufferedFrames();
            if (this.field_u - var3_int > this.field_g) {
              this.field_g = this.field_u - var3_int;
            }
            var4 = this.targetBufferFrames + this.field_a;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.capacityFrames) {
              this.capacityFrames = this.capacityFrames + 1024;
              if (this.capacityFrames > 16384) {
                this.capacityFrames = 16384;
              }
              this.closeDevice();
              this.openDevice(this.capacityFrames);
              var3_int = 0;
              this.field_j = true;
              if (var4 + 256 > this.capacityFrames) {
                var4 = this.capacityFrames - 256;
                this.field_a = var4 - this.targetBufferFrames;
              }
            }
            while (var3_int < var4) {
              this.mixSamples(this.sampleBuffer, 256);
              this.writeDevice();
              var3_int += 256;
            }
            if (var1 > this.field_i) {
              if (this.field_j) {
                this.field_j = false;
              } else {
                if (this.field_g == 0 &&
                  this.field_d == 0) {
                  this.closeDevice();
                  this.reopenAtMillis = var1 + 2000L;
                  return;
                }
                this.field_a = Math.min(this.field_d, this.field_g);
                this.field_d = this.field_g;
              }
              this.field_g = 0;
              this.field_i = var1 + 2000L;
            }
            this.field_u = var3_int;
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

    int getBufferedFrames() throws Exception {
        return this.capacityFrames;
    }

    private final void enqueuePriorityStream(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.priorityTails[var3];
        if (var4 == null) {
          this.priorityHeads[var3] = param0;
        } else {
          var4.field_k = param0;
        }
        this.priorityTails[var3] = param0;
        param0.field_j = param1;
    }

    AudioOutput() {
        this.closed = false;
        this.activityBudget = 32;
        this.streamTimeMillis = BoundaryLoopTracer.monotonicTimeMillis(-1);
        this.priorityTails = new PcmStream[8];
        this.field_d = 0;
        this.field_u = 0;
        this.field_i = 0L;
        this.priorityHeads = new PcmStream[8];
        this.field_g = 0;
        this.samplesUntilSchedule = 0;
        this.field_j = true;
        this.reopenAtMillis = 0L;
    }
}
