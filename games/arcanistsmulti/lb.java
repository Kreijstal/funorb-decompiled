/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb {
    private sg field_s;
    private boolean field_t;
    private static int field_f;
    private static rj field_o;
    int[] field_a;
    private int field_g;
    static int field_r;
    static boolean field_i;
    private long field_b;
    private long field_k;
    private int field_p;
    private int field_q;
    private int field_j;
    private sg[] field_h;
    private long field_c;
    private int field_e;
    private int field_l;
    private int field_d;
    private sg[] field_u;
    private boolean field_m;
    private int field_n;

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_r = param0;
        field_i = param1 ? true : false;
        field_f = param2;
    }

    void d() throws Exception {
    }

    private final static void b(sg param0) {
        param0.field_i = false;
        if (param0.field_j != null) {
          param0.field_j.field_g = 0;
        }
        sg var1 = param0.a();
        while (var1 != null) {
          lb.b(var1);
          var1 = param0.b();
        }
    }

    final static lb a(dl param0, java.awt.Component param1, int param2, int param3) {
        try {
          ek var4 = null;
          Throwable var4_ref = null;
          ek var5 = null;
          ek stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          ek stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_r == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new ek();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_i) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((lb) ((Object) stackIn_10_0)).field_a = new int[stackIn_10_1 * stackIn_11_2];
              ((lb) ((Object) var4)).field_e = param3;
              ((lb) ((Object) var4)).a(param1);
              ((lb) ((Object) var4)).field_q = (param3 & -1024) + 1024;
              if (((lb) ((Object) var4)).field_q > 16384) {
                ((lb) ((Object) var4)).field_q = 16384;
              }
              ((lb) ((Object) var4)).b(((lb) ((Object) var4)).field_q);
              if (field_f > 0 &&
                field_o == null) {
                field_o = new rj();
                field_o.field_f = param0;
                param0.a(127, field_f, (Runnable) ((Object) field_o));
              }
              if (field_o != null) {
                if (field_o.field_b[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_o.field_b[param2] = (lb) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (lb) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new lb();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a() throws Exception {
    }

    private final void a(sg param0, int param1) {
        int var3 = param1 >> 5;
        sg var4 = this.field_h[var3];
        if (var4 == null) {
          this.field_u[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_h[var3] = param0;
        param0.field_h = param1;
    }

    private final void a(int param0) {
        this.field_l = this.field_l - param0;
        if (this.field_l < 0) {
          this.field_l = 0;
        }
        if (this.field_s != null) {
          this.field_s.a(param0);
          return;
        }
    }

    final synchronized void g() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_t) {
            return;
          }
          var1 = qj.b(-26572);
          try {
            if (var1 > this.field_b + 6000L) {
              this.field_b = var1 - 6000L;
            }
            while (var1 > this.field_b + 5000L) {
              this.a(256);
              this.field_b = this.field_b + (long)(256000 / field_r);
              var1 = qj.b(-26572);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_b = var1;
          }
          if (this.field_a == null) {
            return;
          }
          try {
            if (this.field_k != 0L) {
              if (var1 < this.field_k) {
                return;
              }
              this.b(this.field_q);
              this.field_k = 0L;
              this.field_m = true;
            }
            var3_int = this.b();
            if (this.field_d - var3_int > this.field_p) {
              this.field_p = this.field_d - var3_int;
            }
            var4 = this.field_e + this.field_j;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_q) {
              this.field_q = this.field_q + 1024;
              if (this.field_q > 16384) {
                this.field_q = 16384;
              }
              this.h();
              this.b(this.field_q);
              var3_int = 0;
              this.field_m = true;
              if (var4 + 256 > this.field_q) {
                var4 = this.field_q - 256;
                this.field_j = var4 - this.field_e;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_a, 256);
              this.d();
              var3_int += 256;
            }
            if (var1 > this.field_c) {
              if (this.field_m) {
                this.field_m = false;
              } else {
                if (this.field_p == 0 &&
                  this.field_n == 0) {
                  this.h();
                  this.field_k = var1 + 2000L;
                  return;
                }
                this.field_j = Math.min(this.field_n, this.field_p);
                this.field_n = this.field_p;
              }
              this.field_p = 0;
              this.field_c = var1 + 2000L;
            }
            this.field_d = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.h();
            this.field_k = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int b() throws Exception {
        return this.field_q;
    }

    final synchronized void e() {
        int var2 = 0;
        int var1;
        if (field_o != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_o.field_b[var2] == this) {
              field_o.field_b[var2] = null;
            }
            if (field_o.field_b[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_o.field_g = true;
            while (field_o.field_a) {
              ao.a(50L, 1);
            }
            field_o = null;
          }
        }
        this.h();
        this.field_a = null;
        this.field_t = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    public static void c() {
        field_o = null;
    }

    void b(int param0) throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        sg[] var8;
        int var9;
        Object var10;
        sg var11;
        tb var12;
        int var13;
        sg var14;
        int var15_int;
        sg var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        sg var14Lifetime1;
        sg var14Lifetime2;
        var3 = param1;
        if (field_i) {
          var3 = var3 << 1;
        }
        sf.a(param0, 0, var3);
        this.field_l = this.field_l - param1;
        if (this.field_s != null &&
          this.field_l <= 0) {
          this.field_l = this.field_l + (field_r >> 4);
          lb.b(this.field_s);
          this.a(this.field_s, this.field_s.d());
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
                      var11 = var11.field_g;
                      continue;
                    }
                    var11.field_i = true;
                    var13 = var11.c();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_g = var12.field_g + var13;
                    }
                    if (var4 >= this.field_g) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_h;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((sg) (var10)).field_g = var15;
                    } else {
                      this.field_u[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_h[var7_int] = (sg) (var10);
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
            this.field_h[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((sg) (var7)).field_g;
              ((sg) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_l < 0) {
          this.field_l = 0;
        }
        if (this.field_s != null) {
          this.field_s.a(param0, 0, param1);
        }
        this.field_b = qj.b(-26572);
    }

    final synchronized void a(sg param0) {
        this.field_s = param0;
    }

    void h() {
    }

    final synchronized void f() {
        try {
          this.field_m = true;
          try {
            this.a();
          } catch (Exception exception) {
            this.h();
            this.field_k = qj.b(-26572) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    lb() {
        this.field_t = false;
        this.field_g = 32;
        this.field_b = qj.b(-26572);
        this.field_p = 0;
        this.field_k = 0L;
        this.field_h = new sg[8];
        this.field_u = new sg[8];
        this.field_d = 0;
        this.field_l = 0;
        this.field_n = 0;
        this.field_c = 0L;
        this.field_m = true;
    }
}
