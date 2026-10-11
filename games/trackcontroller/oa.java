/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oa {
    private boolean field_d;
    static int field_h;
    static boolean field_k;
    private static int field_o;
    int[] field_s;
    private wh field_i;
    private static hj field_q;
    private int field_n;
    private long field_u;
    private long field_c;
    private int field_p;
    private int field_a;
    private boolean field_g;
    private wh[] field_l;
    private wh[] field_j;
    private int field_e;
    private int field_b;
    private int field_m;
    private int field_f;
    private int field_t;
    private long field_r;

    final synchronized void b() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_d) {
            return;
          }
          var1 = qg.a(false);
          try {
            if (var1 > this.field_u + 6000L) {
              this.field_u = var1 - 6000L;
            }
            while (var1 > this.field_u + 5000L) {
              this.a(256);
              this.field_u = this.field_u + (long)(256000 / field_h);
              var1 = qg.a(false);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_u = var1;
          }
          if (this.field_s == null) {
            return;
          }
          try {
            if (this.field_c != 0L) {
              if (var1 < this.field_c) {
                return;
              }
              this.b(this.field_b);
              this.field_c = 0L;
              this.field_g = true;
            }
            var3_int = this.h();
            if (this.field_p - var3_int > this.field_t) {
              this.field_t = this.field_p - var3_int;
            }
            var4 = this.field_f + this.field_e;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_b) {
              this.field_b = this.field_b + 1024;
              if (this.field_b > 16384) {
                this.field_b = 16384;
              }
              this.g();
              this.b(this.field_b);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_b) {
                var4 = this.field_b - 256;
                this.field_e = var4 - this.field_f;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_s, 256);
              this.a();
              var3_int += 256;
            }
            if (var1 > this.field_r) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_t == 0 &&
                  this.field_a == 0) {
                  this.g();
                  this.field_c = var1 + 2000L;
                  return;
                }
                this.field_e = Math.min(this.field_a, this.field_t);
                this.field_a = this.field_t;
              }
              this.field_t = 0;
              this.field_r = var1 + 2000L;
            }
            this.field_p = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.g();
            this.field_c = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(wh param0) {
        param0.field_k = false;
        if (param0.field_i != null) {
          param0.field_i.field_i = 0;
        }
        wh var1 = param0.b();
        while (var1 != null) {
          oa.b(var1);
          var1 = param0.a();
        }
    }

    void d() throws Exception {
    }

    public static void e() {
        field_q = null;
    }

    private final void a(int param0) {
        this.field_m = this.field_m - param0;
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_i != null) {
          this.field_i.d(param0);
          return;
        }
    }

    private final void a(wh param0, int param1) {
        int var3 = param1 >> 5;
        wh var4 = this.field_l[var3];
        if (var4 == null) {
          this.field_j[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_l[var3] = param0;
        param0.field_j = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void g() {
    }

    final synchronized void a(wh param0) {
        this.field_i = param0;
    }

    int h() throws Exception {
        return this.field_b;
    }

    void a() throws Exception {
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_q != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_q.field_a[var2] == this) {
              field_q.field_a[var2] = null;
            }
            if (field_q.field_a[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_q.field_b = true;
            while (field_q.field_e) {
              wl.a(50L, false);
            }
            field_q = null;
          }
        }
        this.g();
        this.field_s = null;
        this.field_d = true;
    }

    final synchronized void c() {
        try {
          this.field_g = true;
          try {
            this.d();
          } catch (Exception exception) {
            this.g();
            this.field_c = qg.a(false) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0) throws Exception {
    }

    final static oa a(uf param0, java.awt.Component param1, int param2, int param3) {
        try {
          pk var4 = null;
          Throwable var4_ref = null;
          pk var5 = null;
          pk stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          pk stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_h == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new pk();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_k) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((oa) ((Object) stackIn_10_0)).field_s = new int[stackIn_10_1 * stackIn_11_2];
              ((oa) ((Object) var4)).field_f = param3;
              ((oa) ((Object) var4)).a(param1);
              ((oa) ((Object) var4)).field_b = (param3 & -1024) + 1024;
              if (((oa) ((Object) var4)).field_b > 16384) {
                ((oa) ((Object) var4)).field_b = 16384;
              }
              ((oa) ((Object) var4)).b(((oa) ((Object) var4)).field_b);
              if (field_o > 0 &&
                field_q == null) {
                field_q = new hj();
                field_q.field_d = param0;
                param0.a(field_o, (Runnable) ((Object) field_q), 43);
              }
              if (field_q != null) {
                if (field_q.field_a[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_a[param2] = (oa) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (oa) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new oa();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_h = param0;
        field_k = param1 ? true : false;
        field_o = param2;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        wh[] var8;
        int var9;
        Object var10;
        wh var11;
        lk var12;
        int var13;
        wh var14;
        int var15_int;
        wh var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        wh var14Lifetime1;
        wh var14Lifetime2;
        var3 = param1;
        if (field_k) {
          var3 = var3 << 1;
        }
        pd.a(param0, 0, var3);
        this.field_m = this.field_m - param1;
        if (this.field_i != null &&
          this.field_m <= 0) {
          this.field_m = this.field_m + (field_h >> 4);
          oa.b(this.field_i);
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
                  var11 = this.field_j[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_i > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_l;
                      continue;
                    }
                    var11.field_k = true;
                    var13 = var11.c();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.field_n) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((wh) (var10)).field_l = var15;
                    } else {
                      this.field_j[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_l[var7_int] = (wh) (var10);
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
            this.field_l[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((wh) (var7)).field_l;
              ((wh) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_i != null) {
          this.field_i.a(param0, 0, param1);
        }
        this.field_u = qg.a(false);
    }

    oa() {
        this.field_d = false;
        this.field_n = 32;
        this.field_u = qg.a(false);
        this.field_p = 0;
        this.field_c = 0L;
        this.field_m = 0;
        this.field_l = new wh[8];
        this.field_j = new wh[8];
        this.field_g = true;
        this.field_t = 0;
        this.field_r = 0L;
        this.field_a = 0;
    }
}
