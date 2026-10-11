/*
 * Decompiled by CFR-JS 0.4.0.
 */
class b {
    int[] field_s;
    static boolean field_j;
    private int field_u;
    private static int field_l;
    private long field_i;
    private boolean field_c;
    private static fd field_t;
    static int field_r;
    private lk field_q;
    private int field_m;
    private int field_p;
    private lk[] field_g;
    private lk[] field_e;
    private int field_d;
    private boolean field_n;
    private long field_o;
    private int field_a;
    private int field_h;
    private int field_f;
    private int field_b;
    private long field_k;

    final synchronized void b(lk param0) {
        this.field_q = param0;
    }

    final synchronized void e() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_c) {
            return;
          }
          var1 = rf.c(0);
          try {
            if (var1 > this.field_i + 6000L) {
              this.field_i = var1 - 6000L;
            }
            while (var1 > this.field_i + 5000L) {
              this.b(256);
              this.field_i = this.field_i + (long)(256000 / field_r);
              var1 = rf.c(0);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_i = var1;
          }
          if (this.field_s == null) {
            return;
          }
          try {
            if (this.field_k != 0L) {
              if (var1 < this.field_k) {
                return;
              }
              this.a(this.field_f);
              this.field_k = 0L;
              this.field_n = true;
            }
            var3_int = this.c();
            if (this.field_p - var3_int > this.field_d) {
              this.field_d = this.field_p - var3_int;
            }
            var4 = this.field_m + this.field_b;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_f) {
              this.field_f = this.field_f + 1024;
              if (this.field_f > 16384) {
                this.field_f = 16384;
              }
              this.d();
              this.a(this.field_f);
              var3_int = 0;
              this.field_n = true;
              if (var4 + 256 > this.field_f) {
                var4 = this.field_f - 256;
                this.field_b = var4 - this.field_m;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_s, 256);
              this.f();
              var3_int += 256;
            }
            if (var1 > this.field_o) {
              if (this.field_n) {
                this.field_n = false;
              } else {
                if (this.field_d == 0 &&
                  this.field_a == 0) {
                  this.d();
                  this.field_k = var1 + 2000L;
                  return;
                }
                this.field_b = Math.min(this.field_a, this.field_d);
                this.field_a = this.field_d;
              }
              this.field_d = 0;
              this.field_o = var1 + 2000L;
            }
            this.field_p = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_k = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void d() {
    }

    void f() throws Exception {
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_r = param0;
        field_j = param1 ? true : false;
        field_l = param2;
    }

    void a(int param0) throws Exception {
    }

    int c() throws Exception {
        return this.field_f;
    }

    final static b a(ab param0, java.awt.Component param1, int param2, int param3) {
        try {
          sl var4 = null;
          Throwable var4_ref = null;
          sl var5 = null;
          sl stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          sl stackIn_21_0 = null;
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
              var5 = new sl();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_j) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((b) ((Object) stackIn_10_0)).field_s = new int[stackIn_10_1 * stackIn_11_2];
              ((b) ((Object) var4)).field_m = param3;
              ((b) ((Object) var4)).a(param1);
              ((b) ((Object) var4)).field_f = (param3 & -1024) + 1024;
              if (((b) ((Object) var4)).field_f > 16384) {
                ((b) ((Object) var4)).field_f = 16384;
              }
              ((b) ((Object) var4)).a(((b) ((Object) var4)).field_f);
              if (field_l > 0 &&
                field_t == null) {
                field_t = new fd();
                field_t.field_b = param0;
                param0.a((Runnable) ((Object) field_t), false, field_l);
              }
              if (field_t != null) {
                if (field_t.field_f[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_t.field_f[param2] = (b) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (b) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new b();
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
        if (this.field_q != null) {
          this.field_q.a(param0);
          return;
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        lk[] var8;
        int var9;
        Object var10;
        lk var11;
        kh var12;
        int var13;
        lk var14;
        int var15_int;
        lk var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        lk var14Lifetime1;
        lk var14Lifetime2;
        var3 = param1;
        if (field_j) {
          var3 = var3 << 1;
        }
        o.a(param0, 0, var3);
        this.field_h = this.field_h - param1;
        if (this.field_q != null &&
          this.field_h <= 0) {
          this.field_h = this.field_h + (field_r >> 4);
          b.a(this.field_q);
          this.a(this.field_q, this.field_q.c());
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
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_h > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_i;
                      continue;
                    }
                    var11.field_j = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_u) {
                      break L3;
                    }
                    var14Lifetime2 = var11.d();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_h;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_i;
                    var11.field_i = null;
                    if (var10 != null) {
                      ((lk) (var10)).field_i = var15;
                    } else {
                      this.field_g[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_e[var7_int] = (lk) (var10);
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
            this.field_e[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((lk) (var7)).field_i;
              ((lk) (var7)).field_i = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_h < 0) {
          this.field_h = 0;
        }
        if (this.field_q != null) {
          this.field_q.b(param0, 0, param1);
        }
        this.field_i = rf.c(0);
    }

    private final void a(lk param0, int param1) {
        int var3 = param1 >> 5;
        lk var4 = this.field_e[var3];
        if (var4 == null) {
          this.field_g[var3] = param0;
        } else {
          var4.field_i = param0;
        }
        this.field_e[var3] = param0;
        param0.field_h = param1;
    }

    private final static void a(lk param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
          param0.field_k.field_h = 0;
        }
        lk var1 = param0.d();
        while (var1 != null) {
          b.a(var1);
          var1 = param0.b();
        }
    }

    public static void b() {
        field_t = null;
    }

    final synchronized void a() {
        int var2 = 0;
        int var1;
        if (field_t != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_t.field_f[var2] == this) {
              field_t.field_f[var2] = null;
            }
            if (field_t.field_f[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_t.field_d = true;
            while (field_t.field_c) {
              ge.a(0, 50L);
            }
            field_t = null;
          }
        }
        this.d();
        this.field_s = null;
        this.field_c = true;
    }

    b() {
        this.field_u = 32;
        this.field_c = false;
        this.field_i = rf.c(0);
        this.field_p = 0;
        this.field_d = 0;
        this.field_o = 0L;
        this.field_h = 0;
        this.field_e = new lk[8];
        this.field_g = new lk[8];
        this.field_n = true;
        this.field_k = 0L;
        this.field_a = 0;
    }
}
