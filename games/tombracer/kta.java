/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kta {
    private long field_n;
    private static ch field_p;
    static boolean field_h;
    private int field_l;
    private boolean field_g;
    int[] field_j;
    private static int field_q;
    static int field_d;
    private cg field_i;
    private int field_k;
    private int field_f;
    private int field_s;
    private long field_m;
    private int field_a;
    private int field_b;
    private int field_r;
    private cg[] field_u;
    private int field_t;
    private boolean field_o;
    private cg[] field_c;
    private long field_e;

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        cg[] var8;
        int var9;
        Object var10;
        cg var11;
        ud var12;
        int var13;
        cg var14;
        int var15_int;
        cg var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        cg var14Lifetime1;
        cg var14Lifetime2;
        var3 = param1;
        if (field_h) {
          var3 = var3 << 1;
        }
        lua.a(param0, 0, var3);
        this.field_r = this.field_r - param1;
        if (this.field_i != null &&
          this.field_r <= 0) {
          this.field_r = this.field_r + (field_d >> 4);
          kta.a(this.field_i);
          this.a(this.field_i, this.field_i.d());
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
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_f > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_g;
                      continue;
                    }
                    var11.field_f = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_f = var12.field_f + var13;
                    }
                    if (var4 >= this.field_l) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_h;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((cg) (var10)).field_g = var15;
                    } else {
                      this.field_c[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_u[var7_int] = (cg) (var10);
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
            this.field_u[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((cg) (var7)).field_g;
              ((cg) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_r < 0) {
          this.field_r = 0;
        }
        if (this.field_i != null) {
          this.field_i.b(param0, 0, param1);
        }
        this.field_n = bva.b((byte) -107);
    }

    int e() throws Exception {
        return this.field_s;
    }

    final static kta a(fia param0, java.awt.Component param1, int param2, int param3) {
        try {
          bu var4 = null;
          Throwable var4_ref = null;
          bu var5 = null;
          bu stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          bu stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_d == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new bu();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_h) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((kta) ((Object) stackIn_10_0)).field_j = new int[stackIn_10_1 * stackIn_11_2];
              ((kta) ((Object) var4)).field_t = param3;
              ((kta) ((Object) var4)).a(param1);
              ((kta) ((Object) var4)).field_s = (param3 & -1024) + 1024;
              if (((kta) ((Object) var4)).field_s > 16384) {
                ((kta) ((Object) var4)).field_s = 16384;
              }
              ((kta) ((Object) var4)).a(((kta) ((Object) var4)).field_s);
              if (field_q > 0 &&
                field_p == null) {
                field_p = new ch();
                field_p.field_d = param0;
                param0.a((Runnable) ((Object) field_p), 425, field_q);
              }
              if (field_p != null) {
                if (field_p.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_p.field_c[param2] = (kta) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (kta) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new kta();
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
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_g) {
            return;
          }
          var1 = bva.b((byte) -107);
          try {
            if (var1 > this.field_n + 6000L) {
              this.field_n = var1 - 6000L;
            }
            while (var1 > this.field_n + 5000L) {
              this.b(256);
              this.field_n = this.field_n + (long)(256000 / field_d);
              var1 = bva.b((byte) -107);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_n = var1;
          }
          if (this.field_j == null) {
            return;
          }
          try {
            if (this.field_e != 0L) {
              if (var1 < this.field_e) {
                return;
              }
              this.a(this.field_s);
              this.field_e = 0L;
              this.field_o = true;
            }
            var3_int = this.e();
            if (this.field_f - var3_int > this.field_a) {
              this.field_a = this.field_f - var3_int;
            }
            var4 = this.field_t + this.field_k;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_s) {
              this.field_s = this.field_s + 1024;
              if (this.field_s > 16384) {
                this.field_s = 16384;
              }
              this.d();
              this.a(this.field_s);
              var3_int = 0;
              this.field_o = true;
              if (var4 + 256 > this.field_s) {
                var4 = this.field_s - 256;
                this.field_k = var4 - this.field_t;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_j, 256);
              this.f();
              var3_int += 256;
            }
            if (var1 > this.field_m) {
              if (this.field_o) {
                this.field_o = false;
              } else {
                if (this.field_a == 0 &&
                  this.field_b == 0) {
                  this.d();
                  this.field_e = var1 + 2000L;
                  return;
                }
                this.field_k = Math.min(this.field_b, this.field_a);
                this.field_b = this.field_a;
              }
              this.field_a = 0;
              this.field_m = var1 + 2000L;
            }
            this.field_f = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_e = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(cg param0, int param1) {
        int var3 = param1 >> 5;
        cg var4 = this.field_u[var3];
        if (var4 == null) {
          this.field_c[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_u[var3] = param0;
        param0.field_h = param1;
    }

    private final static void a(cg param0) {
        param0.field_f = false;
        if (param0.field_i != null) {
          param0.field_i.field_f = 0;
        }
        cg var1 = param0.b();
        while (var1 != null) {
          kta.a(var1);
          var1 = param0.c();
        }
    }

    final synchronized void b(cg param0) {
        this.field_i = param0;
    }

    final synchronized void a() {
        int var2 = 0;
        int var1;
        if (field_p != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_p.field_c[var2] == this) {
              field_p.field_c[var2] = null;
            }
            if (field_p.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_p.field_a = true;
            while (field_p.field_b) {
              vja.a(0, 50L);
            }
            field_p = null;
          }
        }
        this.d();
        this.field_j = null;
        this.field_g = true;
    }

    void a(int param0) throws Exception {
    }

    private final void b(int param0) {
        this.field_r = this.field_r - param0;
        if (this.field_r < 0) {
          this.field_r = 0;
        }
        if (this.field_i != null) {
          this.field_i.a(param0);
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_d = param0;
        field_h = param1 ? true : false;
        field_q = param2;
    }

    public static void b() {
        field_p = null;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void d() {
    }

    void f() throws Exception {
    }

    kta() {
        this.field_l = 32;
        this.field_g = false;
        this.field_n = bva.b((byte) -107);
        this.field_f = 0;
        this.field_m = 0L;
        this.field_u = new cg[8];
        this.field_b = 0;
        this.field_a = 0;
        this.field_c = new cg[8];
        this.field_e = 0L;
        this.field_o = true;
        this.field_r = 0;
    }
}
