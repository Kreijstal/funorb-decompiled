/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vka {
    private static mia field_e;
    private int field_g;
    private long field_k;
    private boolean field_a;
    private static int field_u;
    int[] field_b;
    private f field_m;
    private int field_o;
    private int field_l;
    private f[] field_j;
    private f[] field_i;
    private long field_f;
    private int field_h;
    private long field_t;
    static int field_s;
    private int field_n;
    private boolean field_q;
    private int field_c;
    private int field_d;
    static boolean field_r;
    private int field_p;

    public static void d() {
        field_e = null;
    }

    final static vka a(eab param0, java.awt.Component param1, int param2, int param3) {
        try {
          cob var4 = null;
          Throwable var4_ref = null;
          cob var5 = null;
          cob stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          cob stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_s == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new cob();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_r) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((vka) ((Object) stackIn_10_0)).field_b = new int[stackIn_10_1 * stackIn_11_2];
              ((vka) ((Object) var4)).field_p = param3;
              ((vka) ((Object) var4)).a(param1);
              ((vka) ((Object) var4)).field_o = (param3 & -1024) + 1024;
              if (((vka) ((Object) var4)).field_o > 16384) {
                ((vka) ((Object) var4)).field_o = 16384;
              }
              ((vka) ((Object) var4)).a(((vka) ((Object) var4)).field_o);
              if (field_u > 0 &&
                field_e == null) {
                field_e = new mia();
                field_e.field_d = param0;
                param0.a(0, field_u, (Runnable) ((Object) field_e));
              }
              if (field_e != null) {
                if (field_e.field_b[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_e.field_b[param2] = (vka) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (vka) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new vka();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void h() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_a) {
            return;
          }
          var1 = wt.a(false);
          try {
            if (var1 > this.field_k + 6000L) {
              this.field_k = var1 - 6000L;
            }
            while (var1 > this.field_k + 5000L) {
              this.b(256);
              this.field_k = this.field_k + (long)(256000 / field_s);
              var1 = wt.a(false);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_k = var1;
          }
          if (this.field_b == null) {
            return;
          }
          try {
            if (this.field_f != 0L) {
              if (var1 < this.field_f) {
                return;
              }
              this.a(this.field_o);
              this.field_f = 0L;
              this.field_q = true;
            }
            var3_int = this.g();
            if (this.field_d - var3_int > this.field_h) {
              this.field_h = this.field_d - var3_int;
            }
            var4 = this.field_p + this.field_c;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_o) {
              this.field_o = this.field_o + 1024;
              if (this.field_o > 16384) {
                this.field_o = 16384;
              }
              this.c();
              this.a(this.field_o);
              var3_int = 0;
              this.field_q = true;
              if (var4 + 256 > this.field_o) {
                var4 = this.field_o - 256;
                this.field_c = var4 - this.field_p;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_b, 256);
              this.a();
              var3_int += 256;
            }
            if (var1 > this.field_t) {
              if (this.field_q) {
                this.field_q = false;
              } else {
                if (this.field_h == 0 &&
                  this.field_n == 0) {
                  this.c();
                  this.field_f = var1 + 2000L;
                  return;
                }
                this.field_c = Math.min(this.field_n, this.field_h);
                this.field_n = this.field_h;
              }
              this.field_h = 0;
              this.field_t = var1 + 2000L;
            }
            this.field_d = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.c();
            this.field_f = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(f param0, int param1) {
        int var3 = param1 >> 5;
        f var4 = this.field_i[var3];
        if (var4 == null) {
          this.field_j[var3] = param0;
        } else {
          var4.field_d = param0;
        }
        this.field_i[var3] = param0;
        param0.field_f = param1;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_s = param0;
        field_r = param1 ? true : false;
        field_u = param2;
    }

    final synchronized void a(f param0) {
        this.field_m = param0;
    }

    void a(int param0) throws Exception {
    }

    final synchronized void f() {
        try {
          this.field_q = true;
          try {
            this.b();
          } catch (Exception exception) {
            this.c();
            this.field_f = wt.a(false) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void c() {
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        f[] var8;
        int var9;
        Object var10;
        f var11;
        dl var12;
        int var13;
        f var14;
        int var15_int;
        f var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        f var14Lifetime1;
        f var14Lifetime2;
        var3 = param1;
        if (field_r) {
          var3 = var3 << 1;
        }
        cua.a(param0, 0, var3);
        this.field_l = this.field_l - param1;
        if (this.field_m != null &&
          this.field_l <= 0) {
          this.field_l = this.field_l + (field_s >> 4);
          vka.b(this.field_m);
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
                  var11 = this.field_j[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_g;
                    if (var12 != null &&
                      var12.field_d > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_d;
                      continue;
                    }
                    var11.field_e = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_d = var12.field_d + var13;
                    }
                    if (var4 >= this.field_g) {
                      break L3;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_f;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    var15 = var11.field_d;
                    var11.field_d = null;
                    if (var10 != null) {
                      ((f) (var10)).field_d = var15;
                    } else {
                      this.field_j[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_i[var7_int] = (f) (var10);
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
            var7 = this.field_j[var6Lifetime1];
            var8 = this.field_j;
            var9Lifetime1 = var6Lifetime1;
            this.field_i[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((f) (var7)).field_d;
              ((f) (var7)).field_d = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_l < 0) {
          this.field_l = 0;
        }
        if (this.field_m != null) {
          this.field_m.a(param0, 0, param1);
        }
        this.field_k = wt.a(false);
    }

    void a() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void e() {
        int var2 = 0;
        int var1;
        if (field_e != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_e.field_b[var2] == this) {
              field_e.field_b[var2] = null;
            }
            if (field_e.field_b[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_e.field_e = true;
            while (field_e.field_c) {
              gdb.b(-109, 50L);
            }
            field_e = null;
          }
        }
        this.c();
        this.field_b = null;
        this.field_a = true;
    }

    void b() throws Exception {
    }

    private final void b(int param0) {
        this.field_l = this.field_l - param0;
        if (this.field_l < 0) {
          this.field_l = 0;
        }
        if (this.field_m != null) {
          this.field_m.a(param0);
          return;
        }
    }

    private final static void b(f param0) {
        param0.field_e = false;
        if (param0.field_g != null) {
          param0.field_g.field_d = 0;
        }
        f var1 = param0.c();
        while (var1 != null) {
          vka.b(var1);
          var1 = param0.a();
        }
    }

    int g() throws Exception {
        return this.field_o;
    }

    vka() {
        this.field_a = false;
        this.field_g = 32;
        this.field_k = wt.a(false);
        this.field_l = 0;
        this.field_f = 0L;
        this.field_h = 0;
        this.field_i = new f[8];
        this.field_n = 0;
        this.field_t = 0L;
        this.field_d = 0;
        this.field_q = true;
        this.field_j = new f[8];
    }
}
