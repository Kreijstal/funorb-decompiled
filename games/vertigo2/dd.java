/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dd {
    static boolean field_h;
    static int field_u;
    private boolean field_g;
    private long field_k;
    private int field_o;
    int[] field_i;
    private static jr field_j;
    private static int field_e;
    private sn field_r;
    private boolean field_f;
    private int field_d;
    private sn[] field_a;
    private int field_t;
    private long field_p;
    private int field_b;
    private sn[] field_q;
    private int field_m;
    private int field_l;
    private long field_n;
    private int field_s;
    private int field_c;

    private final void a(int param0) {
        this.field_c = this.field_c - param0;
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_r != null) {
          this.field_r.a(param0);
          return;
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
        sn[] var8;
        int var9;
        Object var10;
        sn var11;
        dr var12;
        int var13;
        sn var14;
        int var15_int;
        sn var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        sn var14Lifetime1;
        sn var14Lifetime2;
        var3 = param1;
        if (field_h) {
          var3 = var3 << 1;
        }
        qq.a(param0, 0, var3);
        this.field_c = this.field_c - param1;
        if (this.field_r != null &&
          this.field_c <= 0) {
          this.field_c = this.field_c + (field_u >> 4);
          dd.b(this.field_r);
          this.a(this.field_r, this.field_r.b());
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
                  var11 = this.field_q[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_n;
                    if (var12 != null &&
                      var12.field_n > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_q;
                      continue;
                    }
                    var11.field_p = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_n = var12.field_n + var13;
                    }
                    if (var4 >= this.field_o) {
                      break L3;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_o;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    var15 = var11.field_q;
                    var11.field_q = null;
                    if (var10 != null) {
                      ((sn) (var10)).field_q = var15;
                    } else {
                      this.field_q[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_a[var7_int] = (sn) (var10);
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
            var7 = this.field_q[var6Lifetime1];
            var8 = this.field_q;
            var9Lifetime1 = var6Lifetime1;
            this.field_a[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((sn) (var7)).field_q;
              ((sn) (var7)).field_q = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_r != null) {
          this.field_r.b(param0, 0, param1);
        }
        this.field_k = gk.a(113);
    }

    void e() throws Exception {
    }

    final synchronized void a(sn param0) {
        this.field_r = param0;
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
          var1 = gk.a(77);
          try {
            if (var1 > this.field_k + 6000L) {
              this.field_k = var1 - 6000L;
            }
            while (var1 > this.field_k + 5000L) {
              this.a(256);
              this.field_k = this.field_k + (long)(256000 / field_u);
              var1 = gk.a(99);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_k = var1;
          }
          if (this.field_i == null) {
            return;
          }
          try {
            if (this.field_n != 0L) {
              if (var1 < this.field_n) {
                return;
              }
              this.b(this.field_m);
              this.field_n = 0L;
              this.field_f = true;
            }
            var3_int = this.g();
            if (this.field_t - var3_int > this.field_b) {
              this.field_b = this.field_t - var3_int;
            }
            var4 = this.field_d + this.field_l;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_m) {
              this.field_m = this.field_m + 1024;
              if (this.field_m > 16384) {
                this.field_m = 16384;
              }
              this.h();
              this.b(this.field_m);
              var3_int = 0;
              this.field_f = true;
              if (var4 + 256 > this.field_m) {
                var4 = this.field_m - 256;
                this.field_l = var4 - this.field_d;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_i, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_p) {
              if (this.field_f) {
                this.field_f = false;
              } else {
                if (this.field_b == 0 &&
                  this.field_s == 0) {
                  this.h();
                  this.field_n = var1 + 2000L;
                  return;
                }
                this.field_l = Math.min(this.field_s, this.field_b);
                this.field_s = this.field_b;
              }
              this.field_b = 0;
              this.field_p = var1 + 2000L;
            }
            this.field_t = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.h();
            this.field_n = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void h() {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int g() throws Exception {
        return this.field_m;
    }

    void b(int param0) throws Exception {
    }

    private final void a(sn param0, int param1) {
        int var3 = param1 >> 5;
        sn var4 = this.field_a[var3];
        if (var4 == null) {
          this.field_q[var3] = param0;
        } else {
          var4.field_q = param0;
        }
        this.field_a[var3] = param0;
        param0.field_o = param1;
    }

    void f() throws Exception {
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_u = param0;
        field_h = param1 ? true : false;
        field_e = param2;
    }

    final static dd a(jj param0, java.awt.Component param1, int param2, int param3) {
        try {
          vr var4 = null;
          Throwable var4_ref = null;
          vr var5 = null;
          vr stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          vr stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_u == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new vr();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_h) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((dd) ((Object) stackIn_10_0)).field_i = new int[stackIn_10_1 * stackIn_11_2];
              ((dd) ((Object) var4)).field_d = param3;
              ((dd) ((Object) var4)).a(param1);
              ((dd) ((Object) var4)).field_m = (param3 & -1024) + 1024;
              if (((dd) ((Object) var4)).field_m > 16384) {
                ((dd) ((Object) var4)).field_m = 16384;
              }
              ((dd) ((Object) var4)).b(((dd) ((Object) var4)).field_m);
              if (field_e > 0 &&
                field_j == null) {
                field_j = new jr();
                field_j.field_c = param0;
                param0.a(field_e, (Runnable) ((Object) field_j), 0);
              }
              if (field_j != null) {
                if (field_j.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_j.field_d[param2] = (dd) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (dd) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new dd();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void c() {
        try {
          this.field_f = true;
          try {
            this.f();
          } catch (Exception exception) {
            this.h();
            this.field_n = gk.a(102) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(sn param0) {
        param0.field_p = false;
        if (param0.field_n != null) {
          param0.field_n.field_n = 0;
        }
        sn var1 = param0.c();
        while (var1 != null) {
          dd.b(var1);
          var1 = param0.a();
        }
    }

    public static void a() {
        field_j = null;
    }

    final synchronized void d() {
        int var2 = 0;
        int var1;
        if (field_j != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_j.field_d[var2] == this) {
              field_j.field_d[var2] = null;
            }
            if (field_j.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_j.field_a = true;
            while (field_j.field_b) {
              um.a(true, 50L);
            }
            field_j = null;
          }
        }
        this.h();
        this.field_i = null;
        this.field_g = true;
    }

    dd() {
        this.field_g = false;
        this.field_o = 32;
        this.field_k = gk.a(47);
        this.field_b = 0;
        this.field_a = new sn[8];
        this.field_q = new sn[8];
        this.field_f = true;
        this.field_s = 0;
        this.field_p = 0L;
        this.field_n = 0L;
        this.field_t = 0;
        this.field_c = 0;
    }
}
