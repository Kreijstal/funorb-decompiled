/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pi {
    int[] field_l;
    private int field_n;
    private long field_k;
    private boolean field_g;
    private static int field_o;
    static int field_c;
    private lf field_t;
    private int field_a;
    private int field_b;
    private int field_m;
    private lf[] field_i;
    private boolean field_h;
    static boolean field_r;
    private int field_q;
    private int field_s;
    private int field_e;
    private lf[] field_f;
    private long field_d;
    private static sa field_u;
    private int field_p;
    private long field_j;

    final synchronized void e() {
        try {
          this.field_h = true;
          try {
            this.g();
          } catch (Exception exception) {
            this.h();
            this.field_d = km.b(-1) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h() {
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        lf[] var8;
        int var9;
        Object var10;
        lf var11;
        fb var12;
        int var13;
        lf var14;
        int var15_int;
        lf var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        lf var14Lifetime1;
        lf var14Lifetime2;
        var3 = param1;
        if (field_r) {
          var3 = var3 << 1;
        }
        dk.a(param0, 0, var3);
        this.field_p = this.field_p - param1;
        if (this.field_t != null &&
          this.field_p <= 0) {
          this.field_p = this.field_p + (field_c >> 4);
          pi.b(this.field_t);
          this.a(this.field_t, this.field_t.d());
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
                  var11 = this.field_i[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_m;
                    if (var12 != null &&
                      var12.field_j > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_l;
                      continue;
                    }
                    var11.field_k = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_j = var12.field_j + var13;
                    }
                    if (var4 >= this.field_n) {
                      break L3;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((lf) (var10)).field_l = var15;
                    } else {
                      this.field_i[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_f[var7_int] = (lf) (var10);
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
            var7 = this.field_i[var6Lifetime1];
            var8 = this.field_i;
            var9Lifetime1 = var6Lifetime1;
            this.field_f[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((lf) (var7)).field_l;
              ((lf) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_p < 0) {
          this.field_p = 0;
        }
        if (this.field_t != null) {
          this.field_t.b(param0, 0, param1);
        }
        this.field_k = km.b(-1);
    }

    int a() throws Exception {
        return this.field_e;
    }

    void a(int param0) throws Exception {
    }

    final static pi a(vh param0, java.awt.Component param1, int param2, int param3) {
        try {
          vj var4 = null;
          Throwable var4_ref = null;
          vj var5 = null;
          vj stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          vj stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_c == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new vj();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_r) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((pi) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((pi) ((Object) var4)).field_b = param3;
              ((pi) ((Object) var4)).a(param1);
              ((pi) ((Object) var4)).field_e = (param3 & -1024) + 1024;
              if (((pi) ((Object) var4)).field_e > 16384) {
                ((pi) ((Object) var4)).field_e = 16384;
              }
              ((pi) ((Object) var4)).a(((pi) ((Object) var4)).field_e);
              if (field_o > 0 &&
                field_u == null) {
                field_u = new sa();
                field_u.field_b = param0;
                param0.a((byte) -66, field_o, (Runnable) ((Object) field_u));
              }
              if (field_u != null) {
                if (field_u.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_u.field_c[param2] = (pi) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (pi) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new pi();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void c() throws Exception {
    }

    void g() throws Exception {
    }

    private final void a(lf param0, int param1) {
        int var3 = param1 >> 5;
        lf var4 = this.field_f[var3];
        if (var4 == null) {
          this.field_i[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_f[var3] = param0;
        param0.field_j = param1;
    }

    final synchronized void a(lf param0) {
        this.field_t = param0;
    }

    public static void d() {
        field_u = null;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_c = param0;
        field_r = param1 ? true : false;
        field_o = param2;
    }

    private final static void b(lf param0) {
        param0.field_k = false;
        if (param0.field_m != null) {
          param0.field_m.field_j = 0;
        }
        lf var1 = param0.c();
        while (var1 != null) {
          pi.b(var1);
          var1 = param0.b();
        }
    }

    final synchronized void b() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_g) {
            return;
          }
          var1 = km.b(-1);
          try {
            if (var1 > this.field_k + 6000L) {
              this.field_k = var1 - 6000L;
            }
            while (var1 > this.field_k + 5000L) {
              this.b(256);
              this.field_k = this.field_k + (long)(256000 / field_c);
              var1 = km.b(-1);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_k = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_d != 0L) {
              if (var1 < this.field_d) {
                return;
              }
              this.a(this.field_e);
              this.field_d = 0L;
              this.field_h = true;
            }
            var3_int = this.a();
            if (this.field_a - var3_int > this.field_m) {
              this.field_m = this.field_a - var3_int;
            }
            var4 = this.field_b + this.field_s;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_e) {
              this.field_e = this.field_e + 1024;
              if (this.field_e > 16384) {
                this.field_e = 16384;
              }
              this.h();
              this.a(this.field_e);
              var3_int = 0;
              this.field_h = true;
              if (var4 + 256 > this.field_e) {
                var4 = this.field_e - 256;
                this.field_s = var4 - this.field_b;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_l, 256);
              this.c();
              var3_int += 256;
            }
            if (var1 > this.field_j) {
              if (this.field_h) {
                this.field_h = false;
              } else {
                if (this.field_m == 0 &&
                  this.field_q == 0) {
                  this.h();
                  this.field_d = var1 + 2000L;
                  return;
                }
                this.field_s = Math.min(this.field_q, this.field_m);
                this.field_q = this.field_m;
              }
              this.field_m = 0;
              this.field_j = var1 + 2000L;
            }
            this.field_a = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.h();
            this.field_d = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        this.field_p = this.field_p - param0;
        if (this.field_p < 0) {
          this.field_p = 0;
        }
        if (this.field_t != null) {
          this.field_t.a(param0);
          return;
        }
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_u != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_u.field_c[var2] == this) {
              field_u.field_c[var2] = null;
            }
            if (field_u.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_u.field_f = true;
            while (field_u.field_e) {
              ub.a(1976, 50L);
            }
            field_u = null;
          }
        }
        this.h();
        this.field_l = null;
        this.field_g = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    pi() {
        this.field_n = 32;
        this.field_g = false;
        this.field_k = km.b(-1);
        this.field_i = new lf[8];
        this.field_a = 0;
        this.field_q = 0;
        this.field_h = true;
        this.field_m = 0;
        this.field_f = new lf[8];
        this.field_p = 0;
        this.field_d = 0L;
        this.field_j = 0L;
    }
}
