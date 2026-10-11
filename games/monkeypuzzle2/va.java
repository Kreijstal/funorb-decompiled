/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va {
    int[] field_h;
    static boolean field_n;
    private boolean field_u;
    private static ff field_g;
    static int field_i;
    private static int field_a;
    private int field_t;
    private long field_d;
    private fh field_b;
    private int field_m;
    private int field_r;
    private fh[] field_p;
    private int field_c;
    private int field_j;
    private int field_k;
    private long field_e;
    private int field_q;
    private long field_o;
    private int field_l;
    private boolean field_s;
    private fh[] field_f;

    void f() {
    }

    void e() throws Exception {
    }

    final synchronized void b(fh param0) {
        this.field_b = param0;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_i = param0;
        field_n = param1 ? true : false;
        field_a = param2;
    }

    int a() throws Exception {
        return this.field_k;
    }

    private final void b(int param0) {
        this.field_j = this.field_j - param0;
        if (this.field_j < 0) {
          this.field_j = 0;
        }
        if (this.field_b != null) {
          this.field_b.a(param0);
          return;
        }
    }

    final synchronized void b() {
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
              em.a(50L, false);
            }
            field_g = null;
          }
        }
        this.f();
        this.field_h = null;
        this.field_u = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a(int param0) throws Exception {
    }

    final static va a(md param0, java.awt.Component param1, int param2, int param3) {
        try {
          ij var4 = null;
          Throwable var4_ref = null;
          ij var5 = null;
          ij stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          ij stackIn_21_0 = null;
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
              var5 = new ij();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_n) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((va) ((Object) stackIn_10_0)).field_h = new int[stackIn_10_1 * stackIn_11_2];
              ((va) ((Object) var4)).field_l = param3;
              ((va) ((Object) var4)).a(param1);
              ((va) ((Object) var4)).field_k = (param3 & -1024) + 1024;
              if (((va) ((Object) var4)).field_k > 16384) {
                ((va) ((Object) var4)).field_k = 16384;
              }
              ((va) ((Object) var4)).a(((va) ((Object) var4)).field_k);
              if (field_a > 0 &&
                field_g == null) {
                field_g = new ff();
                field_g.field_b = param0;
                param0.a((Runnable) ((Object) field_g), field_a, 0);
              }
              if (field_g != null) {
                if (field_g.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_g.field_c[param2] = (va) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (va) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new va();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(fh param0, int param1) {
        int var3 = param1 >> 5;
        fh var4 = this.field_p[var3];
        if (var4 == null) {
          this.field_f[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_p[var3] = param0;
        param0.field_f = param1;
    }

    public static void d() {
        field_g = null;
    }

    private final static void a(fh param0) {
        param0.field_h = false;
        if (param0.field_e != null) {
          param0.field_e.field_e = 0;
        }
        fh var1 = param0.a();
        while (var1 != null) {
          va.a(var1);
          var1 = param0.b();
        }
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        fh[] var8;
        int var9;
        Object var10;
        fh var11;
        jl var12;
        int var13;
        fh var14;
        int var15_int;
        fh var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        fh var14Lifetime1;
        fh var14Lifetime2;
        var3 = param1;
        if (field_n) {
          var3 = var3 << 1;
        }
        gl.a(param0, 0, var3);
        this.field_j = this.field_j - param1;
        if (this.field_b != null &&
          this.field_j <= 0) {
          this.field_j = this.field_j + (field_i >> 4);
          va.a(this.field_b);
          this.a(this.field_b, this.field_b.c());
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
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_e = var12.field_e + var13;
                    }
                    if (var4 >= this.field_t) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_f;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((fh) (var10)).field_g = var15;
                    } else {
                      this.field_f[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_p[var7_int] = (fh) (var10);
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
              var10Lifetime1 = ((fh) (var7)).field_g;
              ((fh) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_j < 0) {
          this.field_j = 0;
        }
        if (this.field_b != null) {
          this.field_b.b(param0, 0, param1);
        }
        this.field_d = pf.a(0);
    }

    final synchronized void c() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_u) {
            return;
          }
          var1 = pf.a(0);
          try {
            if (var1 > this.field_d + 6000L) {
              this.field_d = var1 - 6000L;
            }
            while (var1 > this.field_d + 5000L) {
              this.b(256);
              this.field_d = this.field_d + (long)(256000 / field_i);
              var1 = pf.a(0);
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
              this.a(this.field_k);
              this.field_o = 0L;
              this.field_s = true;
            }
            var3_int = this.a();
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
              this.f();
              this.a(this.field_k);
              var3_int = 0;
              this.field_s = true;
              if (var4 + 256 > this.field_k) {
                var4 = this.field_k - 256;
                this.field_q = var4 - this.field_l;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_h, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_e) {
              if (this.field_s) {
                this.field_s = false;
              } else {
                if (this.field_m == 0 &&
                  this.field_r == 0) {
                  this.f();
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
            this.f();
            this.field_o = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    va() {
        this.field_u = false;
        this.field_t = 32;
        this.field_d = pf.a(0);
        this.field_p = new fh[8];
        this.field_m = 0;
        this.field_r = 0;
        this.field_j = 0;
        this.field_c = 0;
        this.field_o = 0L;
        this.field_f = new fh[8];
        this.field_s = true;
        this.field_e = 0L;
    }
}
