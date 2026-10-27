/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ie {
    private static int field_g;
    int[] field_f;
    private long field_s;
    private static ge field_j;
    static boolean field_o;
    private int field_a;
    static int field_q;
    private boolean field_i;
    private wg field_u;
    private int field_r;
    private wg[] field_c;
    private int field_b;
    private long field_t;
    private int field_h;
    private int field_d;
    private long field_n;
    private int field_p;
    private boolean field_e;
    private wg[] field_l;
    private int field_k;
    private int field_m;

    void f() {
    }

    private final void a(int[] param0, int param1) {
        int var7_int;
        int var8_int;
        int var3 = param1;
        if (field_o) {
          var3 = var3 << 1;
        }
        qg.a(param0, 0, var3);
        this.field_b = this.field_b - param1;
        if (this.field_u != null &&
          this.field_b <= 0) {
          this.field_b = this.field_b + (field_q >> 4);
          ie.a(this.field_u);
          this.a(this.field_u, this.field_u.d());
          int var4 = 0;
          int var5 = 255;
          int var6 = 7;
          scanLoop1: while (true) {
            if (var5 != 0) {
              if (var6 >= 0) {
                var7_int = var6;
                var8_int = 0;
              } else {
                var7_int = var6 & 3;
                var8_int = -(var6 >> 2);
              }
              int var9 = var5 >>> var7_int & 286331153;
              while (var9 != 0) {
                if ((var9 & 1) != 0) {
                  var5 = var5 & ~(1 << var7_int);
                  Object var10 = null;
                  wg var11 = this.field_c[var7_int];
                  wg var14 = var11;
                  wg var14Lifetime1 = var11;
                  while (var11 != null) {
                    nh var12 = var11.field_g;
                    if (var12 != null &&
                      var12.field_g > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_i = true;
                    int var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_g = var12.field_g + var13;
                    }
                    if (var4 >= this.field_a) {
                      break scanLoop1;
                    }
                    wg var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      int var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    wg var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((wg) (var10)).field_h = var15;
                    } else {
                      this.field_c[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_l[var7_int] = (wg) (var10);
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
          for (int var6Lifetime1 = 0; var6Lifetime1 < 8; var6Lifetime1++) {
            Object var7 = this.field_c[var6Lifetime1];
            wg[] var8 = this.field_c;
            int var9Lifetime1 = var6Lifetime1;
            this.field_l[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              Object var10Lifetime1 = ((wg) (var7)).field_h;
              ((wg) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_b < 0) {
          this.field_b = 0;
        }
        if (this.field_u != null) {
          this.field_u.b(param0, 0, param1);
        }
        this.field_s = td.b(128);
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_q = param0;
        field_o = param1 ? true : false;
        field_g = param2;
    }

    final synchronized void d() {
        try {
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_i) {
            return;
          }
          long var1 = td.b(128);
          try {
            if (var1 > this.field_s + 6000L) {
              this.field_s = var1 - 6000L;
            }
            while (var1 > this.field_s + 5000L) {
              this.a(256);
              this.field_s = this.field_s + (long)(256000 / field_q);
              var1 = td.b(128);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_s = var1;
          }
          if (this.field_f == null) {
            return;
          }
          try {
            if (this.field_n != 0L) {
              if (var1 < this.field_n) {
                return;
              }
              this.b(this.field_d);
              this.field_n = 0L;
              this.field_e = true;
            }
            int var3_int = this.a();
            if (this.field_k - var3_int > this.field_r) {
              this.field_r = this.field_k - var3_int;
            }
            int var4 = this.field_p + this.field_m;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_d) {
              this.field_d = this.field_d + 1024;
              if (this.field_d > 16384) {
                this.field_d = 16384;
              }
              this.f();
              this.b(this.field_d);
              var3_int = 0;
              this.field_e = true;
              if (var4 + 256 > this.field_d) {
                var4 = this.field_d - 256;
                this.field_m = var4 - this.field_p;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_f, 256);
              this.h();
              var3_int += 256;
            }
            if (var1 > this.field_t) {
              if (this.field_e) {
                this.field_e = false;
              } else {
                if (this.field_r == 0 &&
                  this.field_h == 0) {
                  this.f();
                  this.field_n = var1 + 2000L;
                  return;
                }
                this.field_m = Math.min(this.field_h, this.field_r);
                this.field_h = this.field_r;
              }
              this.field_r = 0;
              this.field_t = var1 + 2000L;
            }
            this.field_k = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.f();
            this.field_n = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(wg param0, int param1) {
        int var3 = param1 >> 5;
        wg var4 = this.field_l[var3];
        if (var4 == null) {
          this.field_c[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_l[var3] = param0;
        param0.field_j = param1;
    }

    public static void e() {
        field_j = null;
    }

    void g() throws Exception {
    }

    private final static void a(wg param0) {
        param0.field_i = false;
        if (param0.field_g != null) {
          param0.field_g.field_g = 0;
        }
        wg var1 = param0.c();
        while (var1 != null) {
          ie.a(var1);
          var1 = param0.b();
        }
    }

    int a() throws Exception {
        return this.field_d;
    }

    final synchronized void b(wg param0) {
        this.field_u = param0;
    }

    void b(int param0) throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void h() throws Exception {
    }

    private final void a(int param0) {
        this.field_b = this.field_b - param0;
        if (this.field_b < 0) {
          this.field_b = 0;
        }
        if (this.field_u != null) {
          this.field_u.d(param0);
          return;
        }
    }

    final synchronized void b() {
        try {
          this.field_e = true;
          try {
            this.g();
          } catch (Exception exception) {
            this.f();
            this.field_n = td.b(128) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ie a(lk param0, java.awt.Component param1, int param2, int param3) {
        try {
          int stackIn_11_2 = 0;
          if (field_q == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              vm var5 = new vm();
              vm var4 = var5;
              vm stackIn_10_0 = var4;
              int stackIn_10_1 = 256;
              stackIn_11_2 = (!field_o) ? (1) : (2);
              ((ie) ((Object) stackIn_10_0)).field_f = new int[stackIn_10_1 * stackIn_11_2];
              ((ie) ((Object) var4)).field_p = param3;
              ((ie) ((Object) var4)).a(param1);
              ((ie) ((Object) var4)).field_d = (param3 & -1024) + 1024;
              if (((ie) ((Object) var4)).field_d > 16384) {
                ((ie) ((Object) var4)).field_d = 16384;
              }
              ((ie) ((Object) var4)).b(((ie) ((Object) var4)).field_d);
              if (field_g > 0 &&
                field_j == null) {
                field_j = new ge();
                field_j.field_e = param0;
                param0.a(true, field_g, (Runnable) ((Object) field_j));
              }
              if (field_j != null) {
                if (field_j.field_f[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_j.field_f[param2] = (ie) ((Object) var5);
              }
              vm stackIn_21_0 = var4;
              return (ie) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var4_ref = decompiledCaughtException;
              return new ie();
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
        if (field_j != null) {
          boolean var1 = true;
          for (int var2 = 0; var2 < 2; var2++) {
            if (field_j.field_f[var2] == this) {
              field_j.field_f[var2] = null;
            }
            if (field_j.field_f[var2] != null) {
              var1 = false;
            }
          }
          if (var1) {
            field_j.field_c = true;
            while (field_j.field_g) {
              en.a((byte) -46, 50L);
            }
            field_j = null;
          }
        }
        this.f();
        this.field_f = null;
        this.field_i = true;
    }

    ie() {
        this.field_a = 32;
        this.field_i = false;
        this.field_s = td.b(128);
        this.field_b = 0;
        this.field_h = 0;
        this.field_t = 0L;
        this.field_c = new wg[8];
        this.field_r = 0;
        this.field_n = 0L;
        this.field_l = new wg[8];
        this.field_e = true;
        this.field_k = 0;
    }
}
