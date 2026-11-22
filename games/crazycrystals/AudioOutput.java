/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AudioOutput {
    private od field_h;
    static int field_m;
    private boolean field_n;
    static boolean field_o;
    private static int field_u;
    private int field_s;
    private static rp field_q;
    private long field_k;
    int[] field_d;
    private int field_j;
    private int field_b;
    private int field_i;
    private int field_f;
    private long field_t;
    private long field_g;
    private od[] field_l;
    private boolean field_e;
    private int field_r;
    private int field_p;
    private int field_c;
    private od[] field_a;

    int getQueuedFrames() throws Exception {
        return this.field_f;
    }

    void closeDevice() {
    }

    final synchronized void serviceOutput() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_n) {
            return;
          }
          var1 = lo.a((byte) -46);
          try {
            if (var1 > this.field_k + 6000L) {
              this.field_k = var1 - 6000L;
            }
            while (var1 > this.field_k + 5000L) {
              this.skipFrames(256);
              this.field_k = this.field_k + (long)(256000 / field_m);
              var1 = lo.a((byte) 119);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_k = var1;
          }
          if (this.field_d == null) {
            return;
          }
          try {
            if (this.field_g != 0L) {
              if (var1 < this.field_g) {
                return;
              }
              this.openDevice(this.field_f);
              this.field_g = 0L;
              this.field_e = true;
            }
            var3_int = this.getQueuedFrames();
            if (this.field_j - var3_int > this.field_r) {
              this.field_r = this.field_j - var3_int;
            }
            var4 = this.field_i + this.field_b;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_f) {
              this.field_f = this.field_f + 1024;
              if (this.field_f > 16384) {
                this.field_f = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_f);
              var3_int = 0;
              this.field_e = true;
              if (var4 + 256 > this.field_f) {
                var4 = this.field_f - 256;
                this.field_b = var4 - this.field_i;
              }
            }
            while (var3_int < var4) {
              this.mixBlock(this.field_d, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_t) {
              if (this.field_e) {
                this.field_e = false;
              } else {
                if (this.field_r == 0 &&
                  this.field_c == 0) {
                  this.closeDevice();
                  this.field_g = var1 + 2000L;
                  return;
                }
                this.field_b = Math.min(this.field_c, this.field_r);
                this.field_c = this.field_r;
              }
              this.field_r = 0;
              this.field_t = var1 + 2000L;
            }
            this.field_j = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.closeDevice();
            this.field_g = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void dispose() {
        int var2 = 0;
        int var1;
        if (field_q != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_q.field_c[var2] == this) {
              field_q.field_c[var2] = null;
            }
            if (field_q.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_q.field_d = true;
            while (field_q.field_b) {
              fh.a(true, 50L);
            }
            field_q = null;
          }
        }
        this.closeDevice();
        this.field_d = null;
        this.field_n = true;
    }

    private final static void resetStreamScheduling(od param0) {
        param0.field_f = false;
        if (param0.field_h != null) {
          param0.field_h.field_f = 0;
        }
        od var1 = param0.d();
        while (var1 != null) {
          AudioOutput.resetStreamScheduling(var1);
          var1 = param0.a();
        }
    }

    final synchronized void flushAndMarkDrainCheck() {
        try {
          this.field_e = true;
          try {
            this.flushDevice();
          } catch (Exception exception) {
            this.closeDevice();
            this.field_g = lo.a((byte) -29) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    void writeMixBlock() throws Exception {
    }

    public static void clearStaticReferences() {
        field_q = null;
    }

    private final void enqueueByPriority(od param0, int param1) {
        int var3 = param1 >> 5;
        od var4 = this.field_a[var3];
        if (var4 == null) {
          this.field_l[var3] = param0;
        } else {
          var4.field_i = param0;
        }
        this.field_a[var3] = param0;
        param0.field_g = param1;
    }

    final static void configureAudio(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_m = param0;
        field_o = param1 ? true : false;
        field_u = param2;
    }

    void openDevice(int param0) throws Exception {
    }

    final synchronized void setRootStream(od param0) {
        this.field_h = param0;
    }

    private final void skipFrames(int param0) {
        this.field_p = this.field_p - param0;
        if (this.field_p < 0) {
          this.field_p = 0;
        }
        if (this.field_h != null) {
          this.field_h.a(param0);
          return;
        }
    }

    void flushDevice() throws Exception {
    }

    private final void mixBlock(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        od[] var8;
        int var9;
        Object var10;
        od var11;
        cg var12;
        int var13;
        od var14;
        int var15_int;
        od var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        od var14Lifetime1;
        od var14Lifetime2;
        var3 = param1;
        if (field_o) {
          var3 = var3 << 1;
        }
        eg.a(param0, 0, var3);
        this.field_p = this.field_p - param1;
        if (this.field_h != null &&
          this.field_p <= 0) {
          this.field_p = this.field_p + (field_m >> 4);
          AudioOutput.resetStreamScheduling(this.field_h);
          this.enqueueByPriority(this.field_h, this.field_h.b());
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
                  var11 = this.field_l[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_h;
                    if (var12 != null &&
                      var12.field_f > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_i;
                      continue;
                    }
                    var11.field_f = true;
                    var13 = var11.c();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_f = var12.field_f + var13;
                    }
                    if (var4 >= this.field_s) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.d();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_g;
                      while (var14Lifetime2 != null) {
                        this.enqueueByPriority(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    var15 = var11.field_i;
                    var11.field_i = null;
                    if (var10 != null) {
                      ((od) (var10)).field_i = var15;
                    } else {
                      this.field_l[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_a[var7_int] = (od) (var10);
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
            var7 = this.field_l[var6Lifetime1];
            var8 = this.field_l;
            var9Lifetime1 = var6Lifetime1;
            this.field_a[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((od) (var7)).field_i;
              ((od) (var7)).field_i = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_p < 0) {
          this.field_p = 0;
        }
        if (this.field_h != null) {
          this.field_h.a(param0, 0, param1);
        }
        this.field_k = lo.a((byte) -90);
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
          if (field_m == 0) {
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
              if (!field_o) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((AudioOutput) ((Object) stackIn_10_0)).field_d = new int[stackIn_10_1 * stackIn_11_2];
              ((AudioOutput) ((Object) var4)).field_i = param3;
              ((AudioOutput) ((Object) var4)).initializeDevice(param1);
              ((AudioOutput) ((Object) var4)).field_f = (param3 & -1024) + 1024;
              if (((AudioOutput) ((Object) var4)).field_f > 16384) {
                ((AudioOutput) ((Object) var4)).field_f = 16384;
              }
              ((AudioOutput) ((Object) var4)).openDevice(((AudioOutput) ((Object) var4)).field_f);
              if (field_u > 0 &&
                field_q == null) {
                field_q = new rp();
                field_q.field_e = param0;
                param0.requestThreadStart((Runnable) ((Object) field_q), 2, field_u);
              }
              if (field_q != null) {
                if (field_q.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_c[param2] = (AudioOutput) ((Object) var5);
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

    AudioOutput() {
        this.field_n = false;
        this.field_s = 32;
        this.field_k = lo.a((byte) 79);
        this.field_j = 0;
        this.field_a = new od[8];
        this.field_t = 0L;
        this.field_e = true;
        this.field_p = 0;
        this.field_c = 0;
        this.field_g = 0L;
        this.field_l = new od[8];
        this.field_r = 0;
    }
}
