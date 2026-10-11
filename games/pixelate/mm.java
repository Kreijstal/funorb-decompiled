/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mm {
    private sj field_a;
    private int field_u;
    static boolean field_o;
    private static ao field_b;
    static int field_h;
    private boolean field_j;
    private long field_f;
    private static int field_s;
    int[] field_d;
    private sj[] field_r;
    private int field_e;
    private sj[] field_n;
    private int field_l;
    private int field_k;
    private boolean field_g;
    private int field_t;
    private long field_i;
    private long field_c;
    private int field_q;
    private int field_p;
    private int field_m;

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        sj[] var8;
        int var9;
        Object var10;
        sj var11;
        tb var12;
        int var13;
        sj var14;
        int var15_int;
        sj var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        sj var14Lifetime1;
        sj var14Lifetime2;
        var3 = param1;
        if (field_o) {
          var3 = var3 << 1;
        }
        qb.a(param0, 0, var3);
        this.field_m = this.field_m - param1;
        if (this.field_a != null &&
          this.field_m <= 0) {
          this.field_m = this.field_m + (field_h >> 4);
          mm.a(this.field_a);
          this.a(this.field_a, this.field_a.c());
          var4 = 0;
          var5 = 255;
          var6 = 7;
          L3: while (true) {
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
                  var11 = this.field_n[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_k > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_l;
                      continue;
                    }
                    var11.field_n = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_k = var12.field_k + var13;
                    }
                    if (var4 >= this.field_u) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_m;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((sj) (var10)).field_l = var15;
                    } else {
                      this.field_n[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_r[var7_int] = (sj) (var10);
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
            var7 = this.field_n[var6Lifetime1];
            var8 = this.field_n;
            var9Lifetime1 = var6Lifetime1;
            this.field_r[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((sj) (var7)).field_l;
              ((sj) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_a != null) {
          this.field_a.b(param0, 0, param1);
        }
        this.field_f = hm.a(64);
    }

    void e() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    private final void a(sj param0, int param1) {
        int var3 = param1 >> 5;
        sj var4 = this.field_r[var3];
        if (var4 == null) {
          this.field_n[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_r[var3] = param0;
        param0.field_m = param1;
    }

    final static mm a(cb param0, java.awt.Component param1, int param2, int param3) {
        try {
          je var4 = null;
          Throwable var4_ref = null;
          je var5 = null;
          je stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          je stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_h == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new je();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_o) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((mm) ((Object) stackIn_10_0)).field_d = new int[stackIn_10_1 * stackIn_11_2];
              ((mm) ((Object) var4)).field_t = param3;
              ((mm) ((Object) var4)).a(param1);
              ((mm) ((Object) var4)).field_l = (param3 & -1024) + 1024;
              if (((mm) ((Object) var4)).field_l > 16384) {
                ((mm) ((Object) var4)).field_l = 16384;
              }
              ((mm) ((Object) var4)).a(((mm) ((Object) var4)).field_l);
              if (field_s > 0 &&
                field_b == null) {
                field_b = new ao();
                field_b.field_g = param0;
                param0.a(field_s, (Runnable) ((Object) field_b), (byte) -123);
              }
              if (field_b != null) {
                if (field_b.field_h[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_b.field_h[param2] = (mm) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (mm) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new mm();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int a() throws Exception {
        return this.field_l;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_j) {
            return;
          }
          var1 = hm.a(64);
          try {
            if (var1 > this.field_f + 6000L) {
              this.field_f = var1 - 6000L;
            }
            while (var1 > this.field_f + 5000L) {
              this.b(256);
              this.field_f = this.field_f + (long)(256000 / field_h);
              var1 = hm.a(64);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_f = var1;
          }
          if (this.field_d == null) {
            return;
          }
          try {
            if (this.field_i != 0L) {
              if (var1 < this.field_i) {
                return;
              }
              this.a(this.field_l);
              this.field_i = 0L;
              this.field_g = true;
            }
            var3_int = this.a();
            if (this.field_q - var3_int > this.field_p) {
              this.field_p = this.field_q - var3_int;
            }
            var4 = this.field_t + this.field_e;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_l) {
              this.field_l = this.field_l + 1024;
              if (this.field_l > 16384) {
                this.field_l = 16384;
              }
              this.c();
              this.a(this.field_l);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_l) {
                var4 = this.field_l - 256;
                this.field_e = var4 - this.field_t;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_d, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_c) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_p == 0 &&
                  this.field_k == 0) {
                  this.c();
                  this.field_i = var1 + 2000L;
                  return;
                }
                this.field_e = Math.min(this.field_k, this.field_p);
                this.field_k = this.field_p;
              }
              this.field_p = 0;
              this.field_c = var1 + 2000L;
            }
            this.field_q = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.c();
            this.field_i = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d() {
        field_b = null;
    }

    void c() {
    }

    final synchronized void b(sj param0) {
        this.field_a = param0;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_h = param0;
        field_o = param1 ? true : false;
        field_s = param2;
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_b != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_b.field_h[var2] == this) {
              field_b.field_h[var2] = null;
            }
            if (field_b.field_h[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_b.field_a = true;
            while (field_b.field_f) {
              vg.a(50L, (byte) 23);
            }
            field_b = null;
          }
        }
        this.c();
        this.field_d = null;
        this.field_j = true;
    }

    private final void b(int param0) {
        this.field_m = this.field_m - param0;
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_a != null) {
          this.field_a.a(param0);
          return;
        }
    }

    private final static void a(sj param0) {
        param0.field_n = false;
        if (param0.field_k != null) {
          param0.field_k.field_k = 0;
        }
        sj var1 = param0.b();
        while (var1 != null) {
          mm.a(var1);
          var1 = param0.d();
        }
    }

    mm() {
        this.field_u = 32;
        this.field_j = false;
        this.field_f = hm.a(64);
        this.field_n = new sj[8];
        this.field_k = 0;
        this.field_g = true;
        this.field_r = new sj[8];
        this.field_c = 0L;
        this.field_p = 0;
        this.field_m = 0;
        this.field_i = 0L;
        this.field_q = 0;
    }
}
