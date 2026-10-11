/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vn {
    int[] field_q;
    private boolean field_u;
    private static int field_l;
    static boolean field_g;
    private static bk field_e;
    private long field_b;
    private int field_d;
    static int field_t;
    private qb field_h;
    private long field_o;
    private int field_a;
    private qb[] field_n;
    private int field_j;
    private long field_m;
    private int field_i;
    private int field_r;
    private qb[] field_p;
    private int field_s;
    private int field_f;
    private int field_c;
    private boolean field_k;

    final synchronized void a() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_u) {
            return;
          }
          var1 = kd.c(-2456);
          try {
            if (var1 > this.field_b + 6000L) {
              this.field_b = var1 - 6000L;
            }
            while (var1 > this.field_b + 5000L) {
              this.a(256);
              this.field_b = this.field_b + (long)(256000 / field_t);
              var1 = kd.c(-2456);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_b = var1;
          }
          if (this.field_q == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.b(this.field_j);
              this.field_o = 0L;
              this.field_k = true;
            }
            var3_int = this.f();
            if (this.field_c - var3_int > this.field_a) {
              this.field_a = this.field_c - var3_int;
            }
            var4 = this.field_f + this.field_s;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_j) {
              this.field_j = this.field_j + 1024;
              if (this.field_j > 16384) {
                this.field_j = 16384;
              }
              this.d();
              this.b(this.field_j);
              var3_int = 0;
              this.field_k = true;
              if (var4 + 256 > this.field_j) {
                var4 = this.field_j - 256;
                this.field_s = var4 - this.field_f;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_q, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_m) {
              if (this.field_k) {
                this.field_k = false;
              } else {
                if (this.field_a == 0 &&
                  this.field_i == 0) {
                  this.d();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_s = Math.min(this.field_i, this.field_a);
                this.field_i = this.field_a;
              }
              this.field_a = 0;
              this.field_m = var1 + 2000L;
            }
            this.field_c = var3_int;
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

    final synchronized void c() {
        int var2 = 0;
        int var1;
        if (field_e != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_e.field_g[var2] == this) {
              field_e.field_g[var2] = null;
            }
            if (field_e.field_g[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_e.field_a = true;
            while (field_e.field_d) {
              pj.a(0, 50L);
            }
            field_e = null;
          }
        }
        this.d();
        this.field_q = null;
        this.field_u = true;
    }

    void d() {
    }

    final synchronized void a(qb param0) {
        this.field_h = param0;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        qb[] var8;
        int var9;
        Object var10;
        qb var11;
        ap var12;
        int var13;
        qb var14;
        int var15_int;
        qb var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        qb var14Lifetime1;
        qb var14Lifetime2;
        var3 = param1;
        if (field_g) {
          var3 = var3 << 1;
        }
        cj.a(param0, 0, var3);
        this.field_r = this.field_r - param1;
        if (this.field_h != null &&
          this.field_r <= 0) {
          this.field_r = this.field_r + (field_t >> 4);
          vn.b(this.field_h);
          this.a(this.field_h, this.field_h.b());
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
                  var11 = this.field_p[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_i > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_l;
                      continue;
                    }
                    var11.field_i = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.field_d) {
                      break L3;
                    }
                    var14Lifetime2 = var11.d();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_j;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((qb) (var10)).field_l = var15;
                    } else {
                      this.field_p[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_n[var7_int] = (qb) (var10);
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
            var7 = this.field_p[var6Lifetime1];
            var8 = this.field_p;
            var9Lifetime1 = var6Lifetime1;
            this.field_n[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((qb) (var7)).field_l;
              ((qb) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_r < 0) {
          this.field_r = 0;
        }
        if (this.field_h != null) {
          this.field_h.b(param0, 0, param1);
        }
        this.field_b = kd.c(-2456);
    }

    int f() throws Exception {
        return this.field_j;
    }

    private final static void b(qb param0) {
        param0.field_i = false;
        if (param0.field_k != null) {
          param0.field_k.field_i = 0;
        }
        qb var1 = param0.d();
        while (var1 != null) {
          vn.b(var1);
          var1 = param0.c();
        }
    }

    void b(int param0) throws Exception {
    }

    final static vn a(qg param0, java.awt.Component param1, int param2, int param3) {
        try {
          wn var4 = null;
          Throwable var4_ref = null;
          wn var5 = null;
          wn stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          wn stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_t == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new wn();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_g) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((vn) ((Object) stackIn_10_0)).field_q = new int[stackIn_10_1 * stackIn_11_2];
              ((vn) ((Object) var4)).field_f = param3;
              ((vn) ((Object) var4)).a(param1);
              ((vn) ((Object) var4)).field_j = (param3 & -1024) + 1024;
              if (((vn) ((Object) var4)).field_j > 16384) {
                ((vn) ((Object) var4)).field_j = 16384;
              }
              ((vn) ((Object) var4)).b(((vn) ((Object) var4)).field_j);
              if (field_l > 0 &&
                field_e == null) {
                field_e = new bk();
                field_e.field_h = param0;
                param0.a(-21432, field_l, (Runnable) ((Object) field_e));
              }
              if (field_e != null) {
                if (field_e.field_g[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_e.field_g[param2] = (vn) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (vn) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new vn();
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
        field_t = param0;
        field_g = param1 ? true : false;
        field_l = param2;
    }

    private final void a(int param0) {
        this.field_r = this.field_r - param0;
        if (this.field_r < 0) {
          this.field_r = 0;
        }
        if (this.field_h != null) {
          this.field_h.a(param0);
          return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    public static void e() {
        field_e = null;
    }

    private final void a(qb param0, int param1) {
        int var3 = param1 >> 5;
        qb var4 = this.field_n[var3];
        if (var4 == null) {
          this.field_p[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_n[var3] = param0;
        param0.field_j = param1;
    }

    void b() throws Exception {
    }

    vn() {
        this.field_d = 32;
        this.field_u = false;
        this.field_b = kd.c(-2456);
        this.field_n = new qb[8];
        this.field_p = new qb[8];
        this.field_o = 0L;
        this.field_m = 0L;
        this.field_a = 0;
        this.field_i = 0;
        this.field_r = 0;
        this.field_c = 0;
        this.field_k = true;
    }
}
