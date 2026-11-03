/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private long field_g;
    private static int serviceThreadPriority;
    private int field_e;
    private static AudioService field_u;
    int[] field_l;
    private PcmStream rootStream;
    static boolean stereo;
    private boolean field_s;
    private int field_t;
    private long field_b;
    private long field_d;
    private PcmStream[] priorityTails;
    private int framesUntilScheduling;
    private int field_c;
    private PcmStream[] priorityHeads;
    private int field_i;
    private int field_a;
    private int field_q;
    static int sampleRate;
    private boolean field_n;
    private int field_k;

    void writeFrames() throws Exception {
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

    void openDevice(int param0) throws Exception {
    }

    private final void enqueueByPriority(PcmStream stream, int priority) {
        int var3 = priority >> 5;
        PcmStream var4 = this.priorityTails[var3];
        if (var4 == null) {
          this.priorityHeads[var3] = stream;
        } else {
          var4.field_o = stream;
        }
        this.priorityTails[var3] = stream;
        stream.field_m = priority;
    }

    void initDevice(java.awt.Component param0) throws Exception {
    }

    void closeDevice() {
    }

    final static AudioOutput createOutput(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
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
              ((AudioOutput) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_t = param3;
              ((AudioOutput) ((Object) var4)).initDevice(param1);
              ((AudioOutput) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_a > 16384) {
                ((AudioOutput) ((Object) var4)).field_a = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_a);
              if (serviceThreadPriority > 0 &&
                field_u == null) {
                field_u = new AudioService();
                field_u.tasks = param0;
                param0.startThread(102, serviceThreadPriority, (Runnable) ((Object) field_u));
              }
              if (field_u != null) {
                if (field_u.outputs[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_u.outputs[param2] = (AudioOutput) ((Object) var5);
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

    final synchronized void setRootStream(PcmStream param0) {
        this.rootStream = param0;
    }

    public static void releaseStatics() {
        field_u = null;
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_s) {
            return;
          }
          var1 = rl.monotonicTimeMillis((byte) -127);
          try {
            if (var1 > this.field_g + 6000L) {
              this.field_g = var1 - 6000L;
            }
            while (var1 > this.field_g + 5000L) {
              this.skipFrames(256);
              this.field_g = this.field_g + (long)(256000 / sampleRate);
              var1 = rl.monotonicTimeMillis((byte) -120);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_g = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_b != 0L) {
              if (var1 < this.field_b) {
                return;
              }
              this.openDevice(this.field_a);
              this.field_b = 0L;
              this.field_n = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_i - var3_int > this.field_k) {
              this.field_k = this.field_i - var3_int;
            }
            var4 = this.field_t + this.field_q;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_a);
              var3_int = 0;
              this.field_n = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_q = var4 - this.field_t;
              }
            }
            while (var3_int < var4) {
              this.mixFrames(this.field_l, 256);
              this.writeFrames();
              var3_int += 256;
            }
            if (var1 > this.field_d) {
              if (this.field_n) {
                this.field_n = false;
              } else {
                if (this.field_k == 0 &&
                  this.field_c == 0) {
                  this.closeDevice();
                  this.field_b = var1 + 2000L;
                  return;
                }
                this.field_q = Math.min(this.field_c, this.field_k);
                this.field_c = this.field_k;
              }
              this.field_k = 0;
              this.field_d = var1 + 2000L;
            }
            this.field_i = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_b = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void skipFrames(int frameCount) {
        this.framesUntilScheduling = this.framesUntilScheduling - frameCount;
        if (this.framesUntilScheduling < 0) {
          this.framesUntilScheduling = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.skip(frameCount);
          return;
        }
    }

    private final void mixFrames(int[] param0, int param1) {
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
        this.framesUntilScheduling = this.framesUntilScheduling - param1;
        if (this.rootStream != null &&
          this.framesUntilScheduling <= 0) {
          this.framesUntilScheduling = this.framesUntilScheduling + (sampleRate >> 4);
          AudioOutput.resetStreamTree(this.rootStream);
          this.enqueueByPriority(this.rootStream, this.rootStream.priority());
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
                    var12 = var11.field_n;
                    if (var12 != null &&
                      var12.field_l > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_o;
                      continue;
                    }
                    var11.field_l = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_l = var12.field_l + var13;
                    }
                    if (var4 >= this.field_e) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstChildStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_m;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.priority() >> 8);
                        var14Lifetime2 = var11.nextChildStream();
                      }
                    }
                    var15 = var11.field_o;
                    var11.field_o = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_o = var15;
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
              var10Lifetime1 = ((PcmStream) (var7)).field_o;
              ((PcmStream) (var7)).field_o = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.framesUntilScheduling < 0) {
          this.framesUntilScheduling = 0;
        }
        if (this.rootStream != null) {
          this.rootStream.mixInto(param0, 0, param1);
        }
        this.field_g = rl.monotonicTimeMillis((byte) -125);
    }

    private final static void resetStreamTree(PcmStream param0) {
        param0.field_l = false;
        if (param0.field_n != null) {
          param0.field_n.field_l = 0;
        }
        PcmStream var1 = param0.firstChildStream();
        while (var1 != null) {
          AudioOutput.resetStreamTree(var1);
          var1 = param0.nextChildStream();
        }
    }

    final synchronized void shutdown() {
        int var2 = 0;
        int var1;
        if (field_u != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_u.outputs[var2] == this) {
              field_u.outputs[var2] = null;
            }
            if (field_u.outputs[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_u.stopRequested = true;
            while (field_u.running) {
              SoundCache.a(-127, 50L);
            }
            field_u = null;
          }
        }
        this.closeDevice();
        this.field_l = null;
        this.field_s = true;
    }

    int getQueuedFrames() throws Exception {
        return this.field_a;
    }

    AudioOutput() {
        this.field_e = 32;
        this.field_s = false;
        this.field_g = rl.monotonicTimeMillis((byte) -104);
        this.field_b = 0L;
        this.field_d = 0L;
        this.field_c = 0;
        this.framesUntilScheduling = 0;
        this.priorityTails = new PcmStream[8];
        this.field_n = true;
        this.field_k = 0;
        this.priorityHeads = new PcmStream[8];
        this.field_i = 0;
    }
}
