/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ua {
    static int field_p;
    private static lm field_b;
    private static int field_i;
    private int field_e;
    int[] field_a;
    static boolean field_q;
    private long field_r;
    private in field_d;
    private boolean field_c;
    private long field_k;
    private in[] field_t;
    private long field_s;
    private int field_g;
    private int field_f;
    private int field_h;
    private boolean field_n;
    private int field_m;
    private in[] field_u;
    private int field_j;
    private int field_l;
    private int field_o;

    final static ua a(pd param0, java.awt.Component param1, int param2, int param3) {
        try {
          tc var4 = null;
          Throwable var4_ref = null;
          tc var5 = null;
          tc stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          tc stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_p == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new tc();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_q) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((ua) ((Object) stackIn_10_0)).field_a = new int[stackIn_10_1 * stackIn_11_2];
              ((ua) ((Object) var4)).field_f = param3;
              ((ua) ((Object) var4)).a(param1);
              ((ua) ((Object) var4)).field_h = (param3 & -1024) + 1024;
              if (((ua) ((Object) var4)).field_h > 16384) {
                ((ua) ((Object) var4)).field_h = 16384;
              }
              ((ua) ((Object) var4)).b(((ua) ((Object) var4)).field_h);
              if (field_i > 0 &&
                field_b == null) {
                field_b = new lm();
                field_b.field_b = param0;
                param0.a(field_i, (Runnable) ((Object) field_b), 255);
              }
              if (field_b != null) {
                if (field_b.field_h[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_b.field_h[param2] = (ua) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (ua) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new ua();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        try {
          this.field_n = true;
          try {
            this.f();
          } catch (Exception exception) {
            this.g();
            this.field_k = hc.a(-9986) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void d() {
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
            field_b.field_d = true;
            while (field_b.field_f) {
              mm.a(-83, 50L);
            }
            field_b = null;
          }
        }
        this.g();
        this.field_a = null;
        this.field_c = true;
    }

    final synchronized void a(in param0) {
        this.field_d = param0;
    }

    private final void a(in param0, int param1) {
        int var3 = param1 >> 5;
        in var4 = this.field_t[var3];
        if (var4 == null) {
          this.field_u[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_t[var3] = param0;
        param0.field_i = param1;
    }

    private final static void b(in param0) {
        param0.field_g = false;
        if (param0.field_j != null) {
          param0.field_j.field_g = 0;
        }
        in var1 = param0.c();
        while (var1 != null) {
          ua.b(var1);
          var1 = param0.b();
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_p = param0;
        field_q = param1 ? true : false;
        field_i = param2;
    }

    void f() throws Exception {
    }

    void a() throws Exception {
    }

    public static void b() {
        field_b = null;
    }

    private final void a(int param0) {
        this.field_j = this.field_j - param0;
        if (this.field_j < 0) {
          this.field_j = 0;
        }
        if (this.field_d != null) {
          this.field_d.a(param0);
          return;
        }
    }

    void g() {
    }

    void b(int param0) throws Exception {
    }

    int e() throws Exception {
        return this.field_h;
    }

    final synchronized void c() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_c) {
            return;
          }
          var1 = hc.a(-9986);
          try {
            if (var1 > this.field_r + 6000L) {
              this.field_r = var1 - 6000L;
            }
            while (var1 > this.field_r + 5000L) {
              this.a(256);
              this.field_r = this.field_r + (long)(256000 / field_p);
              var1 = hc.a(-9986);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_r = var1;
          }
          if (this.field_a == null) {
            return;
          }
          try {
            if (this.field_k != 0L) {
              if (var1 < this.field_k) {
                return;
              }
              this.b(this.field_h);
              this.field_k = 0L;
              this.field_n = true;
            }
            var3_int = this.e();
            if (this.field_g - var3_int > this.field_m) {
              this.field_m = this.field_g - var3_int;
            }
            var4 = this.field_f + this.field_o;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_h) {
              this.field_h = this.field_h + 1024;
              if (this.field_h > 16384) {
                this.field_h = 16384;
              }
              this.g();
              this.b(this.field_h);
              var3_int = 0;
              this.field_n = true;
              if (var4 + 256 > this.field_h) {
                var4 = this.field_h - 256;
                this.field_o = var4 - this.field_f;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_a, 256);
              this.a();
              var3_int += 256;
            }
            if (var1 > this.field_s) {
              if (this.field_n) {
                this.field_n = false;
              } else {
                if (this.field_m == 0 &&
                  this.field_l == 0) {
                  this.g();
                  this.field_k = var1 + 2000L;
                  return;
                }
                this.field_o = Math.min(this.field_l, this.field_m);
                this.field_l = this.field_m;
              }
              this.field_m = 0;
              this.field_s = var1 + 2000L;
            }
            this.field_g = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.g();
            this.field_k = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
        in[] var8;
        int var9;
        Object var10;
        in var11;
        tj var12;
        int var13;
        in var14;
        int var15_int;
        in var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        in var14Lifetime1;
        in var14Lifetime2;
        var3 = param1;
        if (field_q) {
          var3 = var3 << 1;
        }
        ek.a(param0, 0, var3);
        this.field_j = this.field_j - param1;
        if (this.field_d != null &&
          this.field_j <= 0) {
          this.field_j = this.field_j + (field_p >> 4);
          ua.b(this.field_d);
          this.a(this.field_d, this.field_d.a());
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
                  var11 = this.field_u[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_j;
                    if (var12 != null &&
                      var12.field_g > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_g = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_g = var12.field_g + var13;
                    }
                    if (var4 >= this.field_e) {
                      break L3;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_i;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.a() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((in) (var10)).field_h = var15;
                    } else {
                      this.field_u[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_t[var7_int] = (in) (var10);
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
            var7 = this.field_u[var6Lifetime1];
            var8 = this.field_u;
            var9Lifetime1 = var6Lifetime1;
            this.field_t[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((in) (var7)).field_h;
              ((in) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_j < 0) {
          this.field_j = 0;
        }
        if (this.field_d != null) {
          this.field_d.b(param0, 0, param1);
        }
        this.field_r = hc.a(-9986);
    }

    ua() {
        this.field_e = 32;
        this.field_c = false;
        this.field_r = hc.a(-9986);
        this.field_g = 0;
        this.field_s = 0L;
        this.field_u = new in[8];
        this.field_n = true;
        this.field_m = 0;
        this.field_l = 0;
        this.field_t = new in[8];
        this.field_k = 0L;
        this.field_j = 0;
    }
}
