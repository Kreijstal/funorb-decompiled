/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c {
    private int field_g;
    static int field_l;
    private k field_s;
    int[] field_p;
    private boolean field_e;
    private long field_a;
    private static bk field_q;
    private static int field_n;
    private int field_d;
    private int field_t;
    private k[] field_b;
    private long field_k;
    private int field_i;
    private int field_j;
    private long field_f;
    private int field_c;
    private boolean field_m;
    private int field_u;
    static boolean field_r;
    private k[] field_o;
    private int field_h;

    int a() throws Exception {
        return this.field_t;
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_q != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_q.field_f[var2] == this) {
              field_q.field_f[var2] = null;
            }
            if (field_q.field_f[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_q.field_g = true;
            while (field_q.field_e) {
              tg.a(50L, false);
            }
            field_q = null;
          }
        }
        this.c();
        this.field_p = null;
        this.field_e = true;
    }

    void b() throws Exception {
    }

    final static c a(vh param0, java.awt.Component param1, int param2, int param3) {
        try {
          ch var4 = null;
          Throwable var4_ref = null;
          ch var5 = null;
          ch stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          ch stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_l == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new ch();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_r) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((c) ((Object) stackIn_10_0)).field_p = new int[stackIn_10_1 * stackIn_11_2];
              ((c) ((Object) var4)).field_c = param3;
              ((c) ((Object) var4)).a(param1);
              ((c) ((Object) var4)).field_t = (param3 & -1024) + 1024;
              if (((c) ((Object) var4)).field_t > 16384) {
                ((c) ((Object) var4)).field_t = 16384;
              }
              ((c) ((Object) var4)).b(((c) ((Object) var4)).field_t);
              if (field_n > 0 &&
                field_q == null) {
                field_q = new bk();
                field_q.field_c = param0;
                param0.a((byte) -68, (Runnable) ((Object) field_q), field_n);
              }
              if (field_q != null) {
                if (field_q.field_f[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_f[param2] = (c) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (c) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new c();
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
        field_q = null;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        k[] var8;
        int var9;
        Object var10;
        k var11;
        kf var12;
        int var13;
        k var14;
        int var15_int;
        k var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        k var14Lifetime1;
        k var14Lifetime2;
        var3 = param1;
        if (field_r) {
          var3 = var3 << 1;
        }
        g.a(param0, 0, var3);
        this.field_h = this.field_h - param1;
        if (this.field_s != null &&
          this.field_h <= 0) {
          this.field_h = this.field_h + (field_l >> 4);
          c.b(this.field_s);
          this.a(this.field_s, this.field_s.b());
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
                  var11 = this.field_b[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_i > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_j;
                      continue;
                    }
                    var11.field_i = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.field_g) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_l;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_j;
                    var11.field_j = null;
                    if (var10 != null) {
                      ((k) (var10)).field_j = var15;
                    } else {
                      this.field_b[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_o[var7_int] = (k) (var10);
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
            var7 = this.field_b[var6Lifetime1];
            var8 = this.field_b;
            var9Lifetime1 = var6Lifetime1;
            this.field_o[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((k) (var7)).field_j;
              ((k) (var7)).field_j = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_s != null) {
          this.field_s.a(param0, 0, param1);
        }
        this.field_a = d.a((byte) 102);
    }

    private final void a(int param0) {
        this.field_h = this.field_h - param0;
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_s != null) {
          this.field_s.a(param0);
          return;
        }
    }

    final synchronized void a(k param0) {
        this.field_s = param0;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_l = param0;
        field_r = param1 ? true : false;
        field_n = param2;
    }

    void c() {
    }

    final synchronized void e() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_e) {
            return;
          }
          var1 = d.a((byte) 64);
          try {
            if (var1 > this.field_a + 6000L) {
              this.field_a = var1 - 6000L;
            }
            while (var1 > this.field_a + 5000L) {
              this.a(256);
              this.field_a = this.field_a + (long)(256000 / field_l);
              var1 = d.a((byte) 87);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_a = var1;
          }
          if (this.field_p == null) {
            return;
          }
          try {
            if (this.field_f != 0L) {
              if (var1 < this.field_f) {
                return;
              }
              this.b(this.field_t);
              this.field_f = 0L;
              this.field_m = true;
            }
            var3_int = this.a();
            if (this.field_d - var3_int > this.field_u) {
              this.field_u = this.field_d - var3_int;
            }
            var4 = this.field_c + this.field_i;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_t) {
              this.field_t = this.field_t + 1024;
              if (this.field_t > 16384) {
                this.field_t = 16384;
              }
              this.c();
              this.b(this.field_t);
              var3_int = 0;
              this.field_m = true;
              if (var4 + 256 > this.field_t) {
                var4 = this.field_t - 256;
                this.field_i = var4 - this.field_c;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_p, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_k) {
              if (this.field_m) {
                this.field_m = false;
              } else {
                if (this.field_u == 0 &&
                  this.field_j == 0) {
                  this.c();
                  this.field_f = var1 + 2000L;
                  return;
                }
                this.field_i = Math.min(this.field_j, this.field_u);
                this.field_j = this.field_u;
              }
              this.field_u = 0;
              this.field_k = var1 + 2000L;
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

    private final void a(k param0, int param1) {
        int var3 = param1 >> 5;
        k var4 = this.field_o[var3];
        if (var4 == null) {
          this.field_b[var3] = param0;
        } else {
          var4.field_j = param0;
        }
        this.field_o[var3] = param0;
        param0.field_l = param1;
    }

    private final static void b(k param0) {
        param0.field_i = false;
        if (param0.field_k != null) {
          param0.field_k.field_i = 0;
        }
        k var1 = param0.a();
        while (var1 != null) {
          c.b(var1);
          var1 = param0.c();
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void b(int param0) throws Exception {
    }

    c() {
        this.field_g = 32;
        this.field_e = false;
        this.field_a = d.a((byte) 120);
        this.field_j = 0;
        this.field_d = 0;
        this.field_f = 0L;
        this.field_k = 0L;
        this.field_b = new k[8];
        this.field_u = 0;
        this.field_m = true;
        this.field_o = new k[8];
        this.field_h = 0;
    }
}
