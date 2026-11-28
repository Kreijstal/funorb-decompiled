/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    int[] field_h;
    static boolean field_n;
    private boolean field_u;
    private static PcmOutputWorker field_g;
    static int field_i;
    private static int field_a;
    private int field_t;
    private long field_d;
    private PcmStream field_b;
    private int field_m;
    private int field_r;
    private PcmStream[] field_p;
    private int field_c;
    private int field_j;
    private int field_k;
    private long field_e;
    private int field_q;
    private long field_o;
    private int field_l;
    private boolean field_s;
    private PcmStream[] field_f;

    void closeDevice() {
    }

    void writeMixBlock() throws Exception {
    }

    final synchronized void setRootStream(PcmStream param0) {
        this.field_b = param0;
    }

    final static void configureAudio(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_i = param0;
        field_n = param1 ? true : false;
        field_a = param2;
    }

    int getQueuedFrames() throws Exception {
        return this.field_k;
    }

    private final void skipFrames(int param0) {
        this.field_j = this.field_j - param0;
        if (this.field_j < 0) {
          this.field_j = 0;
        }
        if (this.field_b != null) {
          this.field_b.skipFrames(param0);
          return;
        }
    }

    final synchronized void dispose() {
        int var2 = 0;
        int var1;
        if (field_g != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_g.field_c[var2] == this) {
              field_g.field_c[var2] = null;
            }
            if (field_g.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_g.field_f = true;
            while (field_g.field_d) {
              em.sleepMillis(50L, false);
            }
            field_g = null;
          }
        }
        this.closeDevice();
        this.field_h = null;
        this.field_u = true;
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    void openDevice(int param0) throws Exception {
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
          if (field_i == 0) {
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
              if (!field_n) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_h = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_l = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).field_k = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_k > 16384) {
                ((AudioOutput) ((Object) var4)).field_k = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_k);
              if (field_a > 0 &&
                field_g == null) {
                field_g = new PcmOutputWorker();
                field_g.field_b = param0;
                param0.requestThreadStart((Runnable) ((Object) field_g), field_a, 0);
              }
              if (field_g != null) {
                if (field_g.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_g.field_c[param2] = (AudioOutput) ((Object) var5);
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

    private final void enqueueByPriority(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_p[var3];
        if (var4 == null) {
          this.field_f[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_p[var3] = param0;
        param0.field_f = param1;
    }

    public static void clearStaticReferences() {
        field_g = null;
    }

    private final static void resetStreamScheduling(PcmStream param0) {
        param0.field_h = false;
        if (param0.field_e != null) {
          param0.field_e.field_e = 0;
        }
        PcmStream var1 = param0.firstChildStream();
        while (var1 != null) {
          AudioOutput.resetStreamScheduling(var1);
          var1 = param0.nextChildStream();
        }
    }

    private final void mixBlock(int[] param0, int param1) {
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
        if (field_n) {
          var3 = var3 << 1;
        }
        ArrayBlockSupport.clearInts(param0, 0, var3);
        this.field_j = this.field_j - param1;
        if (this.field_b != null &&
          this.field_j <= 0) {
          this.field_j = this.field_j + (field_i >> 4);
          AudioOutput.resetStreamScheduling(this.field_b);
          this.enqueueByPriority(this.field_b, this.field_b.getSchedulingPriority());
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
                  var11 = this.field_f[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_e;
                    if (var12 != null &&
                      var12.field_e > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_g;
                      continue;
                    }
                    var11.field_h = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_e = var12.field_e + var13;
                    }
                    if (var4 >= this.field_t) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.firstChildStream();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_f;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.getSchedulingPriority() >> 8);
                        var14Lifetime2 = var11.nextChildStream();
                      }
                    }
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_g = var15;
                    } else {
                      this.field_f[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_p[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_f[var6Lifetime1];
            var8 = this.field_f;
            var9Lifetime1 = var6Lifetime1;
            this.field_p[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_g;
              ((PcmStream) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_j < 0) {
          this.field_j = 0;
        }
        if (this.field_b != null) {
          this.field_b.mixInto(param0, 0, param1);
        }
        this.field_d = pf.correctedCurrentTimeMillis(0);
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_u) {
            return;
          }
          var1 = pf.correctedCurrentTimeMillis(0);
          try {
            if (var1 > this.field_d + 6000L) {
              this.field_d = var1 - 6000L;
            }
            while (var1 > this.field_d + 5000L) {
              this.skipFrames(256);
              this.field_d = this.field_d + (long)(256000 / field_i);
              var1 = pf.correctedCurrentTimeMillis(0);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_d = var1;
          }
          if (this.field_h == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.openDevice(this.field_k);
              this.field_o = 0L;
              this.field_s = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_c - var3_int > this.field_m) {
              this.field_m = this.field_c - var3_int;
            }
            var4 = this.field_l + this.field_q;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_k) {
              this.field_k = this.field_k + 1024;
              if (this.field_k > 16384) {
                this.field_k = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_k);
              var3_int = 0;
              this.field_s = true;
              if (var4 + 256 > this.field_k) {
                var4 = this.field_k - 256;
                this.field_q = var4 - this.field_l;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_h, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_e) {
              if (this.field_s) {
                this.field_s = false;
              } else {
                if (this.field_m == 0 &&
                  this.field_r == 0) {
                  this.closeDevice();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_q = Math.min(this.field_r, this.field_m);
                this.field_r = this.field_m;
              }
              this.field_m = 0;
              this.field_e = var1 + 2000L;
            }
            this.field_c = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_o = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    AudioOutput() {
        this.field_u = false;
        this.field_t = 32;
        this.field_d = pf.correctedCurrentTimeMillis(0);
        this.field_p = new PcmStream[8];
        this.field_m = 0;
        this.field_r = 0;
        this.field_j = 0;
        this.field_c = 0;
        this.field_o = 0L;
        this.field_f = new PcmStream[8];
        this.field_s = true;
        this.field_e = 0L;
    }
}
