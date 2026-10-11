/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gp {
    private static int field_b;
    static boolean field_j;
    private boolean field_r;
    private int field_e;
    private gq field_s;
    static int field_p;
    private static tg field_q;
    private long field_i;
    int[] field_l;
    private int field_a;
    private int field_f;
    private int field_h;
    private long field_d;
    private int field_u;
    private long field_o;
    private int field_n;
    private int field_m;
    private gq[] field_t;
    private gq[] field_k;
    private boolean field_g;
    private int field_c;

    private final static void b(gq param0) {
        param0.field_f = false;
        if (param0.field_i != null) {
          param0.field_i.field_f = 0;
        }
        gq var1 = param0.b();
        while (var1 != null) {
          gp.b(var1);
          var1 = param0.d();
        }
    }

    final synchronized void e() {
        try {
          this.field_g = true;
          try {
            this.f();
          } catch (Exception exception) {
            this.d();
            this.field_o = bl.a((byte) 103) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void d() {
    }

    private final void a(gq param0, int param1) {
        int var3 = param1 >> 5;
        gq var4 = this.field_k[var3];
        if (var4 == null) {
          this.field_t[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_k[var3] = param0;
        param0.field_g = param1;
    }

    final static gp a(go param0, java.awt.Component param1, int param2, int param3) {
        try {
          fp var4 = null;
          Throwable var4_ref = null;
          fp var5 = null;
          fp stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          fp stackIn_21_0 = null;
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
              var5 = new fp();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_j) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((gp) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((gp) ((Object) var4)).field_m = param3;
              ((gp) ((Object) var4)).a(param1);
              ((gp) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((gp) ((Object) var4)).field_a > 16384) {
                ((gp) ((Object) var4)).field_a = 16384;
              }
              ((gp) ((Object) var4)).a(((gp) ((Object) var4)).field_a);
              if (field_b > 0 &&
                field_q == null) {
                field_q = new tg();
                field_q.field_b = param0;
                param0.a(22, (Runnable) ((Object) field_q), field_b);
              }
              if (field_q != null) {
                if (field_q.field_f[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_f[param2] = (gp) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (gp) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new gp();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        this.field_h = this.field_h - param0;
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_s != null) {
          this.field_s.a(param0);
          return;
        }
    }

    void a(int param0) throws Exception {
    }

    final synchronized void a() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_r) {
            return;
          }
          var1 = bl.a((byte) 79);
          try {
            if (var1 > this.field_i + 6000L) {
              this.field_i = var1 - 6000L;
            }
            while (var1 > this.field_i + 5000L) {
              this.b(256);
              this.field_i = this.field_i + (long)(256000 / field_p);
              var1 = bl.a((byte) 66);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_i = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.a(this.field_a);
              this.field_o = 0L;
              this.field_g = true;
            }
            var3_int = this.c();
            if (this.field_f - var3_int > this.field_c) {
              this.field_c = this.field_f - var3_int;
            }
            var4 = this.field_m + this.field_n;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.d();
              this.a(this.field_a);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_n = var4 - this.field_m;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_l, 256);
              this.g();
              var3_int += 256;
            }
            if (var1 > this.field_d) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_c == 0 &&
                  this.field_u == 0) {
                  this.d();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_n = Math.min(this.field_u, this.field_c);
                this.field_u = this.field_c;
              }
              this.field_c = 0;
              this.field_d = var1 + 2000L;
            }
            this.field_f = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_o = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int c() throws Exception {
        return this.field_a;
    }

    final synchronized void h() {
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
            field_q.field_h = true;
            while (field_q.field_c) {
              vd.a(false, 50L);
            }
            field_q = null;
          }
        }
        this.d();
        this.field_l = null;
        this.field_r = true;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_p = param0;
        field_j = param1 ? true : false;
        field_b = param2;
    }

    void f() throws Exception {
    }

    public static void b() {
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
        gq[] var8;
        int var9;
        Object var10;
        gq var11;
        lg var12;
        int var13;
        gq var14;
        int var15_int;
        gq var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        gq var14Lifetime1;
        gq var14Lifetime2;
        var3 = param1;
        if (field_j) {
          var3 = var3 << 1;
        }
        d.a(param0, 0, var3);
        this.field_h = this.field_h - param1;
        if (this.field_s != null &&
          this.field_h <= 0) {
          this.field_h = this.field_h + (field_p >> 4);
          gp.b(this.field_s);
          this.a(this.field_s, this.field_s.c());
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
                  var11 = this.field_t[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_f > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_f = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_f = var12.field_f + var13;
                    }
                    if (var4 >= this.field_e) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_g;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((gq) (var10)).field_h = var15;
                    } else {
                      this.field_t[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_k[var7_int] = (gq) (var10);
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
            var7 = this.field_t[var6Lifetime1];
            var8 = this.field_t;
            var9Lifetime1 = var6Lifetime1;
            this.field_k[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((gq) (var7)).field_h;
              ((gq) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_s != null) {
          this.field_s.b(param0, 0, param1);
        }
        this.field_i = bl.a((byte) 108);
    }

    void g() throws Exception {
    }

    final synchronized void a(gq param0) {
        this.field_s = param0;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    gp() {
        this.field_r = false;
        this.field_e = 32;
        this.field_i = bl.a((byte) 98);
        this.field_o = 0L;
        this.field_d = 0L;
        this.field_h = 0;
        this.field_u = 0;
        this.field_k = new gq[8];
        this.field_f = 0;
        this.field_t = new gq[8];
        this.field_g = true;
        this.field_c = 0;
    }
}
