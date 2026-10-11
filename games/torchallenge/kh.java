/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kh {
    private qd field_u;
    private boolean field_k;
    static int field_p;
    private static int field_i;
    private int field_l;
    private long field_h;
    int[] field_b;
    static boolean field_g;
    private static bb field_n;
    private int field_r;
    private int field_e;
    private qd[] field_f;
    private boolean field_a;
    private int field_c;
    private qd[] field_s;
    private int field_t;
    private long field_j;
    private int field_q;
    private long field_o;
    private int field_m;
    private int field_d;

    private final static void a(qd param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
          param0.field_k.field_i = 0;
        }
        qd var1 = param0.c();
        while (var1 != null) {
          kh.a(var1);
          var1 = param0.b();
        }
    }

    void d() {
    }

    public static void a() {
        field_n = null;
    }

    final synchronized void g() {
        try {
          this.field_a = true;
          try {
            this.c();
          } catch (Exception exception) {
            this.d();
            this.field_o = ol.a(256) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int e() throws Exception {
        return this.field_t;
    }

    void c() throws Exception {
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_p = param0;
        field_g = param1 ? true : false;
        field_i = param2;
    }

    final static kh a(uj param0, java.awt.Component param1, int param2, int param3) {
        try {
          sk var4 = null;
          Throwable var4_ref = null;
          sk var5 = null;
          sk stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          sk stackIn_21_0 = null;
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
              var5 = new sk();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_g) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((kh) ((Object) stackIn_10_0)).field_b = new int[stackIn_10_1 * stackIn_11_2];
              ((kh) ((Object) var4)).field_r = param3;
              ((kh) ((Object) var4)).a(param1);
              ((kh) ((Object) var4)).field_t = (param3 & -1024) + 1024;
              if (((kh) ((Object) var4)).field_t > 16384) {
                ((kh) ((Object) var4)).field_t = 16384;
              }
              ((kh) ((Object) var4)).b(((kh) ((Object) var4)).field_t);
              if (field_i > 0 &&
                field_n == null) {
                field_n = new bb();
                field_n.field_b = param0;
                param0.a((Runnable) ((Object) field_n), true, field_i);
              }
              if (field_n != null) {
                if (field_n.field_a[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_n.field_a[param2] = (kh) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (kh) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new kh();
            }
          }
          throw new IllegalArgumentException();
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
        qd[] var8;
        int var9;
        Object var10;
        qd var11;
        se var12;
        int var13;
        qd var14;
        int var15_int;
        qd var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        qd var14Lifetime1;
        qd var14Lifetime2;
        var3 = param1;
        if (field_g) {
          var3 = var3 << 1;
        }
        he.a(param0, 0, var3);
        this.field_e = this.field_e - param1;
        if (this.field_u != null &&
          this.field_e <= 0) {
          this.field_e = this.field_e + (field_p >> 4);
          kh.a(this.field_u);
          this.a(this.field_u, this.field_u.d());
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
                  var11 = this.field_f[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_i > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_i;
                      continue;
                    }
                    var11.field_j = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.field_l) {
                      break L3;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_l;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_i;
                    var11.field_i = null;
                    if (var10 != null) {
                      ((qd) (var10)).field_i = var15;
                    } else {
                      this.field_f[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_s[var7_int] = (qd) (var10);
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
            var7 = this.field_f[var6Lifetime1];
            var8 = this.field_f;
            var9Lifetime1 = var6Lifetime1;
            this.field_s[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((qd) (var7)).field_i;
              ((qd) (var7)).field_i = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_e < 0) {
          this.field_e = 0;
        }
        if (this.field_u != null) {
          this.field_u.b(param0, 0, param1);
        }
        this.field_h = ol.a(256);
    }

    void f() throws Exception {
    }

    final synchronized void b(qd param0) {
        this.field_u = param0;
    }

    final synchronized void b() {
        int var2 = 0;
        int var1;
        if (field_n != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_n.field_a[var2] == this) {
              field_n.field_a[var2] = null;
            }
            if (field_n.field_a[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_n.field_e = true;
            while (field_n.field_f) {
              c.a(-105, 50L);
            }
            field_n = null;
          }
        }
        this.d();
        this.field_b = null;
        this.field_k = true;
    }

    private final void a(qd param0, int param1) {
        int var3 = param1 >> 5;
        qd var4 = this.field_s[var3];
        if (var4 == null) {
          this.field_f[var3] = param0;
        } else {
          var4.field_i = param0;
        }
        this.field_s[var3] = param0;
        param0.field_l = param1;
    }

    void b(int param0) throws Exception {
    }

    private final void a(int param0) {
        this.field_e = this.field_e - param0;
        if (this.field_e < 0) {
          this.field_e = 0;
        }
        if (this.field_u != null) {
          this.field_u.a(param0);
          return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_k) {
            return;
          }
          var1 = ol.a(256);
          try {
            if (var1 > this.field_h + 6000L) {
              this.field_h = var1 - 6000L;
            }
            while (var1 > this.field_h + 5000L) {
              this.a(256);
              this.field_h = this.field_h + (long)(256000 / field_p);
              var1 = ol.a(256);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_h = var1;
          }
          if (this.field_b == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.b(this.field_t);
              this.field_o = 0L;
              this.field_a = true;
            }
            var3_int = this.e();
            if (this.field_m - var3_int > this.field_d) {
              this.field_d = this.field_m - var3_int;
            }
            var4 = this.field_r + this.field_c;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_t) {
              this.field_t = this.field_t + 1024;
              if (this.field_t > 16384) {
                this.field_t = 16384;
              }
              this.d();
              this.b(this.field_t);
              var3_int = 0;
              this.field_a = true;
              if (var4 + 256 > this.field_t) {
                var4 = this.field_t - 256;
                this.field_c = var4 - this.field_r;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_b, 256);
              this.f();
              var3_int += 256;
            }
            if (var1 > this.field_j) {
              if (this.field_a) {
                this.field_a = false;
              } else {
                if (this.field_d == 0 &&
                  this.field_q == 0) {
                  this.d();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_c = Math.min(this.field_q, this.field_d);
                this.field_q = this.field_d;
              }
              this.field_d = 0;
              this.field_j = var1 + 2000L;
            }
            this.field_m = var3_int;
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

    kh() {
        this.field_k = false;
        this.field_l = 32;
        this.field_h = ol.a(256);
        this.field_a = true;
        this.field_e = 0;
        this.field_q = 0;
        this.field_j = 0L;
        this.field_o = 0L;
        this.field_f = new qd[8];
        this.field_s = new qd[8];
        this.field_m = 0;
        this.field_d = 0;
    }
}
