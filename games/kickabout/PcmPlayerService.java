/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PcmPlayerService {
    private int field_j;
    private boolean field_s;
    private long field_t;
    static boolean field_o;
    int[] field_k;
    static int field_i;
    private static AudioService field_d;
    private PcmStream field_c;
    private static int field_h;
    private int field_m;
    private int field_u;
    private int field_r;
    private int field_l;
    private PcmStream[] field_f;
    private long field_q;
    private long field_g;
    private int field_n;
    private boolean field_a;
    private int field_p;
    private PcmStream[] field_b;
    private int field_e;

    private final void a(int[] param0, int param1) {
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
        AbstractPcmSample var12;
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
        if (field_o) {
          var3 = var3 << 1;
        }
        ArrayOperations.clearInts(param0, 0, var3);
        this.field_u = this.field_u - param1;
        if (this.field_c != null &&
          this.field_u <= 0) {
          this.field_u = this.field_u + (field_i >> 4);
          PcmPlayerService.b(this.field_c);
          this.a(this.field_c, this.field_c.a());
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
                  var11 = this.field_b[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_h;
                    if (var12 != null &&
                      var12.field_e > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_f;
                      continue;
                    }
                    var11.field_e = true;
                    var13 = var11.getSchedulingCost();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_e = var12.field_e + var13;
                    }
                    if (var4 >= this.field_j) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_g;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.a() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_f;
                    var11.field_f = null;
                    if (var10 != null) {
                      ((PcmStream) (var10)).field_f = var15;
                    } else {
                      this.field_b[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_f[var7_int] = (PcmStream) (var10);
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
            var7 = this.field_b[var6Lifetime1];
            var8 = this.field_b;
            var9Lifetime1 = var6Lifetime1;
            this.field_f[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((PcmStream) (var7)).field_f;
              ((PcmStream) (var7)).field_f = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_u < 0) {
          this.field_u = 0;
        }
        if (this.field_c != null) {
          this.field_c.mixInto(param0, 0, param1);
        }
        this.field_t = nj.monotonicMillis(-96);
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_i = param0;
        field_o = param1 ? true : false;
        field_h = param2;
    }

    final synchronized void a(PcmStream param0) {
        this.field_c = param0;
    }

    private final static void b(PcmStream param0) {
        param0.field_e = false;
        if (param0.field_h != null) {
          param0.field_h.field_e = 0;
        }
        PcmStream var1 = param0.c();
        while (var1 != null) {
          PcmPlayerService.b(var1);
          var1 = param0.b();
        }
    }

    final static PcmPlayerService a(PlatformTaskDispatcher param0, java.awt.Component param1, int param2, int param3) {
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
              if (!field_o) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((PcmPlayerService) ((Object) stackIn_10_0)).field_k = new int[stackIn_10_1 * stackIn_11_2];
              ((PcmPlayerService) ((Object) var4)).field_p = param3;
              ((PcmPlayerService) ((Object) var4)).initializeDevice(param1);
              ((PcmPlayerService) ((Object) var4)).field_r = (param3 & -1024) + 1024;
              if (((PcmPlayerService) ((Object) var4)).field_r > 16384) {
                ((PcmPlayerService) ((Object) var4)).field_r = 16384;
              }
              ((PcmPlayerService) ((Object) var4)).openDevice(((PcmPlayerService) ((Object) var4)).field_r);
              if (field_h > 0 &&
                field_d == null) {
                field_d = new AudioService();
                field_d.field_f = param0;
                param0.a(field_h, (byte) 125, (Runnable) ((Object) field_d));
              }
              if (field_d != null) {
                if (field_d.field_b[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_d.field_b[param2] = (PcmPlayerService) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (PcmPlayerService) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new PcmPlayerService();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(PcmStream param0, int param1) {
        int var3 = param1 >> 5;
        PcmStream var4 = this.field_f[var3];
        if (var4 == null) {
          this.field_b[var3] = param0;
        } else {
          var4.field_f = param0;
        }
        this.field_f[var3] = param0;
        param0.field_g = param1;
    }

    void initializeDevice(java.awt.Component param0) throws Exception {
    }

    final synchronized void d() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_s) {
            return;
          }
          var1 = nj.monotonicMillis(-92);
          try {
            if (var1 > this.field_t + 6000L) {
              this.field_t = var1 - 6000L;
            }
            while (var1 > this.field_t + 5000L) {
              this.a(256);
              this.field_t = this.field_t + (long)(256000 / field_i);
              var1 = nj.monotonicMillis(109);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_t = var1;
          }
          if (this.field_k == null) {
            return;
          }
          try {
            if (this.field_g != 0L) {
              if (var1 < this.field_g) {
                return;
              }
              this.openDevice(this.field_r);
              this.field_g = 0L;
              this.field_a = true;
            }
            var3_int = this.b();
            if (this.field_e - var3_int > this.field_l) {
              this.field_l = this.field_e - var3_int;
            }
            var4 = this.field_p + this.field_m;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_r) {
              this.field_r = this.field_r + 1024;
              if (this.field_r > 16384) {
                this.field_r = 16384;
              }
              this.closeDevice();
              this.openDevice(this.field_r);
              var3_int = 0;
              this.field_a = true;
              if (var4 + 256 > this.field_r) {
                var4 = this.field_r - 256;
                this.field_m = var4 - this.field_p;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_k, 256);
              this.writeMixBlock();
              var3_int += 256;
            }
            if (var1 > this.field_q) {
              if (this.field_a) {
                this.field_a = false;
              } else {
                if (this.field_l == 0 &&
                  this.field_n == 0) {
                  this.closeDevice();
                  this.field_g = var1 + 2000L;
                  return;
                }
                this.field_m = Math.min(this.field_n, this.field_l);
                this.field_n = this.field_l;
              }
              this.field_l = 0;
              this.field_q = var1 + 2000L;
            }
            this.field_e = var3_int;
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

    private final void a(int param0) {
        this.field_u = this.field_u - param0;
        if (this.field_u < 0) {
          this.field_u = 0;
        }
        if (this.field_c != null) {
          this.field_c.skipFrames(param0);
          return;
        }
    }

    int b() throws Exception {
        return this.field_r;
    }

    void writeMixBlock() throws Exception {
    }

    public static void releaseStatics() {
        field_d = null;
    }

    void openDevice(int param0) throws Exception {
    }

    void closeDevice() {
    }

    final synchronized void c() {
        int var2 = 0;
        int var1;
        if (field_d != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_d.field_b[var2] == this) {
              field_d.field_b[var2] = null;
            }
            if (field_d.field_b[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_d.field_e = true;
            while (field_d.field_c) {
              aj.a(50L, 1);
            }
            field_d = null;
          }
        }
        this.closeDevice();
        this.field_k = null;
        this.field_s = true;
    }

    PcmPlayerService() {
        this.field_s = false;
        this.field_j = 32;
        this.field_t = nj.monotonicMillis(24);
        this.field_u = 0;
        this.field_f = new PcmStream[8];
        this.field_g = 0L;
        this.field_l = 0;
        this.field_n = 0;
        this.field_a = true;
        this.field_q = 0L;
        this.field_b = new PcmStream[8];
        this.field_e = 0;
    }
}
