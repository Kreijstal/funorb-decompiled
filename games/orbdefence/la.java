/*
 * Decompiled by CFR-JS 0.4.0.
 */
class la {
    private static oa field_u;
    int[] field_r;
    static int field_c;
    private static int field_l;
    private di field_n;
    static boolean field_g;
    private boolean field_j;
    private long field_t;
    private int field_b;
    private long field_o;
    private di[] field_e;
    private int field_q;
    private int field_i;
    private int field_h;
    private int field_d;
    private int field_a;
    private boolean field_f;
    private di[] field_s;
    private int field_k;
    private long field_p;
    private int field_m;

    final synchronized void a() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_j) {
            return;
          }
          var1 = ji.b(124);
          try {
            if (var1 > this.field_t + 6000L) {
              this.field_t = var1 - 6000L;
            }
            while (var1 > this.field_t + 5000L) {
              this.b(256);
              this.field_t = this.field_t + (long)(256000 / field_c);
              var1 = ji.b(-117);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_t = var1;
          }
          if (this.field_r == null) {
            return;
          }
          try {
            if (this.field_p != 0L) {
              if (var1 < this.field_p) {
                return;
              }
              this.a(this.field_a);
              this.field_p = 0L;
              this.field_f = true;
            }
            var3_int = this.f();
            if (this.field_i - var3_int > this.field_q) {
              this.field_q = this.field_i - var3_int;
            }
            var4 = this.field_d + this.field_k;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.b();
              this.a(this.field_a);
              var3_int = 0;
              this.field_f = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_k = var4 - this.field_d;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_r, 256);
              this.d();
              var3_int += 256;
            }
            if (var1 > this.field_o) {
              if (this.field_f) {
                this.field_f = false;
              } else {
                if (this.field_q == 0 &&
                  this.field_h == 0) {
                  this.b();
                  this.field_p = var1 + 2000L;
                  return;
                }
                this.field_k = Math.min(this.field_h, this.field_q);
                this.field_h = this.field_q;
              }
              this.field_q = 0;
              this.field_o = var1 + 2000L;
            }
            this.field_i = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.b();
            this.field_p = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void a(di param0) {
        this.field_n = param0;
    }

    final synchronized void c() {
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
            field_u.field_h = true;
            while (field_u.field_b) {
              hb.a(50L, 121);
            }
            field_u = null;
          }
        }
        this.b();
        this.field_r = null;
        this.field_j = true;
    }

    void b() {
    }

    int f() throws Exception {
        return this.field_a;
    }

    void a(int param0) throws Exception {
    }

    void d() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_c = param0;
        field_g = param1 ? true : false;
        field_l = param2;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        di[] var8;
        int var9;
        Object var10;
        di var11;
        ng var12;
        int var13;
        di var14;
        int var15_int;
        di var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        di var14Lifetime1;
        di var14Lifetime2;
        var3 = param1;
        if (field_g) {
          var3 = var3 << 1;
        }
        mk.a(param0, 0, var3);
        this.field_m = this.field_m - param1;
        if (this.field_n != null &&
          this.field_m <= 0) {
          this.field_m = this.field_m + (field_c >> 4);
          la.b(this.field_n);
          this.a(this.field_n, this.field_n.b());
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
                  var11 = this.field_e[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_h;
                    if (var12 != null &&
                      var12.field_f > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_f;
                      continue;
                    }
                    var11.field_g = true;
                    var13 = var11.c();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_f = var12.field_f + var13;
                    }
                    if (var4 >= this.field_b) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_i;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_f;
                    var11.field_f = null;
                    if (var10 != null) {
                      ((di) (var10)).field_f = var15;
                    } else {
                      this.field_e[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_s[var7_int] = (di) (var10);
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
            var7 = this.field_e[var6Lifetime1];
            var8 = this.field_e;
            var9Lifetime1 = var6Lifetime1;
            this.field_s[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((di) (var7)).field_f;
              ((di) (var7)).field_f = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_n != null) {
          this.field_n.b(param0, 0, param1);
        }
        this.field_t = ji.b(109);
    }

    public static void e() {
        field_u = null;
    }

    private final static void b(di param0) {
        param0.field_g = false;
        if (param0.field_h != null) {
          param0.field_h.field_f = 0;
        }
        di var1 = param0.a();
        while (var1 != null) {
          la.b(var1);
          var1 = param0.d();
        }
    }

    private final void b(int param0) {
        this.field_m = this.field_m - param0;
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_n != null) {
          this.field_n.c(param0);
          return;
        }
    }

    private final void a(di param0, int param1) {
        int var3 = param1 >> 5;
        di var4 = this.field_s[var3];
        if (var4 == null) {
          this.field_e[var3] = param0;
        } else {
          var4.field_f = param0;
        }
        this.field_s[var3] = param0;
        param0.field_i = param1;
    }

    final static la a(be param0, java.awt.Component param1, int param2, int param3) {
        try {
          ni var4 = null;
          Throwable var4_ref = null;
          ni var5 = null;
          ni stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          ni stackIn_21_0 = null;
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
              var5 = new ni();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_g) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((la) ((Object) stackIn_10_0)).field_r = new int[stackIn_10_1 * stackIn_11_2];
              ((la) ((Object) var4)).field_d = param3;
              ((la) ((Object) var4)).a(param1);
              ((la) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((la) ((Object) var4)).field_a > 16384) {
                ((la) ((Object) var4)).field_a = 16384;
              }
              ((la) ((Object) var4)).a(((la) ((Object) var4)).field_a);
              if (field_l > 0 &&
                field_u == null) {
                field_u = new oa();
                field_u.field_g = param0;
                param0.a(314572800, field_l, (Runnable) ((Object) field_u));
              }
              if (field_u != null) {
                if (field_u.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_u.field_c[param2] = (la) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (la) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new la();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    la() {
        this.field_j = false;
        this.field_b = 32;
        this.field_t = ji.b(124);
        this.field_o = 0L;
        this.field_h = 0;
        this.field_f = true;
        this.field_e = new di[8];
        this.field_i = 0;
        this.field_m = 0;
        this.field_p = 0L;
        this.field_s = new di[8];
        this.field_q = 0;
    }
}
