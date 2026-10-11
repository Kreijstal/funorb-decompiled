/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pb {
    private boolean field_t;
    static boolean field_q;
    private tda field_n;
    private static int field_k;
    private long field_m;
    private int field_b;
    static int field_j;
    int[] field_i;
    private boolean field_c;
    private int field_e;
    private int field_s;
    private tda[] field_f;
    private static kc field_u;
    private long field_p;
    private int field_o;
    private int field_a;
    private long field_l;
    private int field_h;
    private int field_d;
    private int field_r;
    private tda[] field_g;

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_j = param0;
        field_q = param1 ? true : false;
        field_k = param2;
    }

    final synchronized void b() {
        int var2 = 0;
        int var1;
        if (field_u != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_u.field_b[var2] == this) {
              field_u.field_b[var2] = null;
            }
            if (field_u.field_b[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_u.field_e = true;
            while (field_u.field_d) {
              gda.a(false, 50L);
            }
            field_u = null;
          }
        }
        this.h();
        this.field_i = null;
        this.field_t = true;
    }

    private final static void b(tda param0) {
        param0.field_f = false;
        if (param0.field_h != null) {
          param0.field_h.field_f = 0;
        }
        tda var1 = param0.b();
        while (var1 != null) {
          pb.b(var1);
          var1 = param0.a();
        }
    }

    void e() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    void g() throws Exception {
    }

    void h() {
    }

    private final void a(tda param0, int param1) {
        int var3 = param1 >> 5;
        tda var4 = this.field_f[var3];
        if (var4 == null) {
          this.field_g[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_f[var3] = param0;
        param0.field_i = param1;
    }

    final static pb a(ht param0, java.awt.Component param1, int param2, int param3) {
        try {
          na var4 = null;
          Throwable var4_ref = null;
          na var5 = null;
          na stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          na stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_j == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new na();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_q) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((pb) ((Object) stackIn_10_0)).field_i = new int[stackIn_10_1 * stackIn_11_2];
              ((pb) ((Object) var4)).field_o = param3;
              ((pb) ((Object) var4)).a(param1);
              ((pb) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((pb) ((Object) var4)).field_a > 16384) {
                ((pb) ((Object) var4)).field_a = 16384;
              }
              ((pb) ((Object) var4)).a(((pb) ((Object) var4)).field_a);
              if (field_k > 0 &&
                field_u == null) {
                field_u = new kc();
                field_u.field_c = param0;
                param0.a((Runnable) ((Object) field_u), 2, field_k);
              }
              if (field_u != null) {
                if (field_u.field_b[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_u.field_b[param2] = (pb) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (pb) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new pb();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d() {
        field_u = null;
    }

    private final void b(int param0) {
        this.field_s = this.field_s - param0;
        if (this.field_s < 0) {
          this.field_s = 0;
        }
        if (this.field_n != null) {
          this.field_n.a(param0);
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
        tda[] var8;
        int var9;
        Object var10;
        tda var11;
        lj var12;
        int var13;
        tda var14;
        int var15_int;
        tda var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        tda var14Lifetime1;
        tda var14Lifetime2;
        var3 = param1;
        if (field_q) {
          var3 = var3 << 1;
        }
        bl.a(param0, 0, var3);
        this.field_s = this.field_s - param1;
        if (this.field_n != null &&
          this.field_s <= 0) {
          this.field_s = this.field_s + (field_j >> 4);
          pb.b(this.field_n);
          this.a(this.field_n, this.field_n.c());
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
                  var11 = this.field_g[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_h;
                    if (var12 != null &&
                      var12.field_f > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_g;
                      continue;
                    }
                    var11.field_f = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_f = var12.field_f + var13;
                    }
                    if (var4 >= this.field_b) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_i;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((tda) (var10)).field_g = var15;
                    } else {
                      this.field_g[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_f[var7_int] = (tda) (var10);
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
            var7 = this.field_g[var6Lifetime1];
            var8 = this.field_g;
            var9Lifetime1 = var6Lifetime1;
            this.field_f[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((tda) (var7)).field_g;
              ((tda) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_s < 0) {
          this.field_s = 0;
        }
        if (this.field_n != null) {
          this.field_n.a(param0, 0, param1);
        }
        this.field_m = f.b((byte) 73);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void c() {
        try {
          this.field_c = true;
          try {
            this.e();
          } catch (Exception exception) {
            this.h();
            this.field_p = f.b((byte) 73) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int a() throws Exception {
        return this.field_a;
    }

    final synchronized void f() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_t) {
            return;
          }
          var1 = f.b((byte) 73);
          try {
            if (var1 > this.field_m + 6000L) {
              this.field_m = var1 - 6000L;
            }
            while (var1 > this.field_m + 5000L) {
              this.b(256);
              this.field_m = this.field_m + (long)(256000 / field_j);
              var1 = f.b((byte) 73);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_m = var1;
          }
          if (this.field_i == null) {
            return;
          }
          try {
            if (this.field_p != 0L) {
              if (var1 < this.field_p) {
                return;
              }
              this.a(this.field_a);
              this.field_p = 0L;
              this.field_c = true;
            }
            var3_int = this.a();
            if (this.field_h - var3_int > this.field_e) {
              this.field_e = this.field_h - var3_int;
            }
            var4 = this.field_o + this.field_r;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.h();
              this.a(this.field_a);
              var3_int = 0;
              this.field_c = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_r = var4 - this.field_o;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_i, 256);
              this.g();
              var3_int += 256;
            }
            if (var1 > this.field_l) {
              if (this.field_c) {
                this.field_c = false;
              } else {
                if (this.field_e == 0 &&
                  this.field_d == 0) {
                  this.h();
                  this.field_p = var1 + 2000L;
                  return;
                }
                this.field_r = Math.min(this.field_d, this.field_e);
                this.field_d = this.field_e;
              }
              this.field_e = 0;
              this.field_l = var1 + 2000L;
            }
            this.field_h = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.h();
            this.field_p = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void a(tda param0) {
        this.field_n = param0;
    }

    pb() {
        this.field_t = false;
        this.field_b = 32;
        this.field_m = f.b((byte) 73);
        this.field_p = 0L;
        this.field_e = 0;
        this.field_s = 0;
        this.field_f = new tda[8];
        this.field_d = 0;
        this.field_c = true;
        this.field_l = 0L;
        this.field_h = 0;
        this.field_g = new tda[8];
    }
}
