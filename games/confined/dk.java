/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dk {
    static int field_k;
    private gf field_m;
    private static sb field_f;
    private boolean field_n;
    private static int field_g;
    static boolean field_j;
    private long field_h;
    private int field_r;
    int[] field_l;
    private boolean field_u;
    private long field_t;
    private int field_p;
    private int field_b;
    private int field_i;
    private int field_a;
    private gf[] field_e;
    private gf[] field_c;
    private long field_d;
    private int field_o;
    private int field_s;
    private int field_q;

    int b() throws Exception {
        return this.field_i;
    }

    private final static void a(gf param0) {
        param0.field_o = false;
        if (param0.field_n != null) {
          param0.field_n.field_m = 0;
        }
        gf var1 = param0.a();
        while (var1 != null) {
          dk.a(var1);
          var1 = param0.d();
        }
    }

    final synchronized void d() {
        int var2 = 0;
        int var1;
        if (field_f != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_f.field_k[var2] == this) {
              field_f.field_k[var2] = null;
            }
            if (field_f.field_k[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_f.field_d = true;
            while (field_f.field_j) {
              jd.a(1, 50L);
            }
            field_f = null;
          }
        }
        this.a();
        this.field_l = null;
        this.field_n = true;
    }

    private final void a(gf param0, int param1) {
        int var3 = param1 >> 5;
        gf var4 = this.field_e[var3];
        if (var4 == null) {
          this.field_c[var3] = param0;
        } else {
          var4.field_p = param0;
        }
        this.field_e[var3] = param0;
        param0.field_m = param1;
    }

    final static dk a(df param0, java.awt.Component param1, int param2, int param3) {
        try {
          hg var4 = null;
          Throwable var4_ref = null;
          hg var5 = null;
          hg stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          hg stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_k == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new hg();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_j) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((dk) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((dk) ((Object) var4)).field_s = param3;
              ((dk) ((Object) var4)).a(param1);
              ((dk) ((Object) var4)).field_i = (param3 & -1024) + 1024;
              if (((dk) ((Object) var4)).field_i > 16384) {
                ((dk) ((Object) var4)).field_i = 16384;
              }
              ((dk) ((Object) var4)).b(((dk) ((Object) var4)).field_i);
              if (field_g > 0 &&
                field_f == null) {
                field_f = new sb();
                field_f.field_c = param0;
                param0.a((byte) 50, (Runnable) ((Object) field_f), field_g);
              }
              if (field_f != null) {
                if (field_f.field_k[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_f.field_k[param2] = (dk) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (dk) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new dk();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a() {
    }

    private final void a(int param0) {
        this.field_q = this.field_q - param0;
        if (this.field_q < 0) {
          this.field_q = 0;
        }
        if (this.field_m != null) {
          this.field_m.b(param0);
          return;
        }
    }

    final synchronized void c() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_n) {
            return;
          }
          var1 = ri.a(-3);
          try {
            if (var1 > this.field_h + 6000L) {
              this.field_h = var1 - 6000L;
            }
            while (var1 > this.field_h + 5000L) {
              this.a(256);
              this.field_h = this.field_h + (long)(256000 / field_k);
              var1 = ri.a(-3);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_h = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_t != 0L) {
              if (var1 < this.field_t) {
                return;
              }
              this.b(this.field_i);
              this.field_t = 0L;
              this.field_u = true;
            }
            var3_int = this.b();
            if (this.field_o - var3_int > this.field_p) {
              this.field_p = this.field_o - var3_int;
            }
            var4 = this.field_s + this.field_a;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_i) {
              this.field_i = this.field_i + 1024;
              if (this.field_i > 16384) {
                this.field_i = 16384;
              }
              this.a();
              this.b(this.field_i);
              var3_int = 0;
              this.field_u = true;
              if (var4 + 256 > this.field_i) {
                var4 = this.field_i - 256;
                this.field_a = var4 - this.field_s;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_l, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_d) {
              if (this.field_u) {
                this.field_u = false;
              } else {
                if (this.field_p == 0 &&
                  this.field_b == 0) {
                  this.a();
                  this.field_t = var1 + 2000L;
                  return;
                }
                this.field_a = Math.min(this.field_b, this.field_p);
                this.field_b = this.field_p;
              }
              this.field_p = 0;
              this.field_d = var1 + 2000L;
            }
            this.field_o = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.a();
            this.field_t = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_k = param0;
        field_j = param1 ? true : false;
        field_g = param2;
    }

    public static void f() {
        field_f = null;
    }

    final synchronized void b(gf param0) {
        this.field_m = param0;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        gf[] var8;
        int var9;
        Object var10;
        gf var11;
        ob var12;
        int var13;
        gf var14;
        int var15_int;
        gf var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        gf var14Lifetime1;
        gf var14Lifetime2;
        var3 = param1;
        if (field_j) {
          var3 = var3 << 1;
        }
        lj.a(param0, 0, var3);
        this.field_q = this.field_q - param1;
        if (this.field_m != null &&
          this.field_q <= 0) {
          this.field_q = this.field_q + (field_k >> 4);
          dk.a(this.field_m);
          this.a(this.field_m, this.field_m.b());
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
                  var11 = this.field_c[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_n;
                    if (var12 != null &&
                      var12.field_m > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_p;
                      continue;
                    }
                    var11.field_o = true;
                    var13 = var11.c();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_m = var12.field_m + var13;
                    }
                    if (var4 >= this.field_r) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_m;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_p;
                    var11.field_p = null;
                    if (var10 != null) {
                      ((gf) (var10)).field_p = var15;
                    } else {
                      this.field_c[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_e[var7_int] = (gf) (var10);
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
            var7 = this.field_c[var6Lifetime1];
            var8 = this.field_c;
            var9Lifetime1 = var6Lifetime1;
            this.field_e[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((gf) (var7)).field_p;
              ((gf) (var7)).field_p = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_q < 0) {
          this.field_q = 0;
        }
        if (this.field_m != null) {
          this.field_m.a(param0, 0, param1);
        }
        this.field_h = ri.a(-3);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void e() throws Exception {
    }

    void b(int param0) throws Exception {
    }

    dk() {
        this.field_n = false;
        this.field_r = 32;
        this.field_h = ri.a(-3);
        this.field_p = 0;
        this.field_b = 0;
        this.field_c = new gf[8];
        this.field_d = 0L;
        this.field_o = 0;
        this.field_e = new gf[8];
        this.field_u = true;
        this.field_t = 0L;
        this.field_q = 0;
    }
}
