/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk {
    private boolean field_o;
    int[] field_c;
    static boolean field_s;
    static int field_k;
    private long field_i;
    private eb field_j;
    private static pg field_q;
    private static int field_n;
    private int field_h;
    private int field_m;
    private eb[] field_f;
    private eb[] field_d;
    private int field_u;
    private int field_e;
    private int field_t;
    private int field_a;
    private boolean field_g;
    private long field_l;
    private int field_p;
    private int field_r;
    private long field_b;

    final synchronized void c() {
        try {
          this.field_g = true;
          try {
            this.h();
          } catch (Exception exception) {
            this.d();
            this.field_b = k.a(0) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void f() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_o) {
            return;
          }
          var1 = k.a(0);
          try {
            if (var1 > this.field_i + 6000L) {
              this.field_i = var1 - 6000L;
            }
            while (var1 > this.field_i + 5000L) {
              this.a(256);
              this.field_i = this.field_i + (long)(256000 / field_k);
              var1 = k.a(0);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_i = var1;
          }
          if (this.field_c == null) {
            return;
          }
          try {
            if (this.field_b != 0L) {
              if (var1 < this.field_b) {
                return;
              }
              this.b(this.field_r);
              this.field_b = 0L;
              this.field_g = true;
            }
            var3_int = this.a();
            if (this.field_a - var3_int > this.field_t) {
              this.field_t = this.field_a - var3_int;
            }
            var4 = this.field_p + this.field_m;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_r) {
              this.field_r = this.field_r + 1024;
              if (this.field_r > 16384) {
                this.field_r = 16384;
              }
              this.d();
              this.b(this.field_r);
              var3_int = 0;
              this.field_g = true;
              if (var4 + 256 > this.field_r) {
                var4 = this.field_r - 256;
                this.field_m = var4 - this.field_p;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_c, 256);
              this.g();
              var3_int += 256;
            }
            if (var1 > this.field_l) {
              if (this.field_g) {
                this.field_g = false;
              } else {
                if (this.field_t == 0 &&
                  this.field_u == 0) {
                  this.d();
                  this.field_b = var1 + 2000L;
                  return;
                }
                this.field_m = Math.min(this.field_u, this.field_t);
                this.field_u = this.field_t;
              }
              this.field_t = 0;
              this.field_l = var1 + 2000L;
            }
            this.field_a = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_b = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int a() throws Exception {
        return this.field_r;
    }

    private final static void b(eb param0) {
        param0.field_q = false;
        if (param0.field_p != null) {
          param0.field_p.field_n = 0;
        }
        eb var1 = param0.b();
        while (var1 != null) {
          nk.b(var1);
          var1 = param0.c();
        }
    }

    final synchronized void b() {
        int var2 = 0;
        int var1;
        if (field_q != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_q.field_l[var2] == this) {
              field_q.field_l[var2] = null;
            }
            if (field_q.field_l[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_q.field_g = true;
            while (field_q.field_k) {
              tb.a(false, 50L);
            }
            field_q = null;
          }
        }
        this.d();
        this.field_c = null;
        this.field_o = true;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_k = param0;
        field_s = param1 ? true : false;
        field_n = param2;
    }

    private final void a(eb param0, int param1) {
        int var3 = param1 >> 5;
        eb var4 = this.field_f[var3];
        if (var4 == null) {
          this.field_d[var3] = param0;
        } else {
          var4.field_n = param0;
        }
        this.field_f[var3] = param0;
        param0.field_o = param1;
    }

    final synchronized void a(eb param0) {
        this.field_j = param0;
    }

    final static nk a(ie param0, java.awt.Component param1, int param2, int param3) {
        try {
          vk var4 = null;
          Throwable var4_ref = null;
          vk var5 = null;
          vk stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          vk stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_k == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new vk();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_s) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((nk) ((Object) stackIn_10_0)).field_c = new int[stackIn_10_1 * stackIn_11_2];
              ((nk) ((Object) var4)).field_p = param3;
              ((nk) ((Object) var4)).a(param1);
              ((nk) ((Object) var4)).field_r = (param3 & -1024) + 1024;
              if (((nk) ((Object) var4)).field_r > 16384) {
                ((nk) ((Object) var4)).field_r = 16384;
              }
              ((nk) ((Object) var4)).b(((nk) ((Object) var4)).field_r);
              if (field_n > 0 &&
                field_q == null) {
                field_q = new pg();
                field_q.field_j = param0;
                param0.a((Runnable) ((Object) field_q), 105, field_n);
              }
              if (field_q != null) {
                if (field_q.field_l[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_q.field_l[param2] = (nk) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (nk) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new nk();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void g() throws Exception {
    }

    void h() throws Exception {
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        eb[] var8;
        int var9;
        Object var10;
        eb var11;
        ff var12;
        int var13;
        eb var14;
        int var15_int;
        eb var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        eb var14Lifetime1;
        eb var14Lifetime2;
        var3 = param1;
        if (field_s) {
          var3 = var3 << 1;
        }
        rd.a(param0, 0, var3);
        this.field_e = this.field_e - param1;
        if (this.field_j != null &&
          this.field_e <= 0) {
          this.field_e = this.field_e + (field_k >> 4);
          nk.b(this.field_j);
          this.a(this.field_j, this.field_j.d());
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
                  var11 = this.field_d[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_p;
                    if (var12 != null &&
                      var12.field_n > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_n;
                      continue;
                    }
                    var11.field_q = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_n = var12.field_n + var13;
                    }
                    if (var4 >= this.field_h) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_o;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.d() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_n;
                    var11.field_n = null;
                    if (var10 != null) {
                      ((eb) (var10)).field_n = var15;
                    } else {
                      this.field_d[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_f[var7_int] = (eb) (var10);
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
            var7 = this.field_d[var6Lifetime1];
            var8 = this.field_d;
            var9Lifetime1 = var6Lifetime1;
            this.field_f[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((eb) (var7)).field_n;
              ((eb) (var7)).field_n = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_e < 0) {
          this.field_e = 0;
        }
        if (this.field_j != null) {
          this.field_j.b(param0, 0, param1);
        }
        this.field_i = k.a(0);
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void d() {
    }

    private final void a(int param0) {
        this.field_e = this.field_e - param0;
        if (this.field_e < 0) {
          this.field_e = 0;
        }
        if (this.field_j != null) {
          this.field_j.a(param0);
          return;
        }
    }

    void b(int param0) throws Exception {
    }

    public static void e() {
        field_q = null;
    }

    nk() {
        this.field_o = false;
        this.field_h = 32;
        this.field_i = k.a(0);
        this.field_d = new eb[8];
        this.field_f = new eb[8];
        this.field_u = 0;
        this.field_e = 0;
        this.field_a = 0;
        this.field_g = true;
        this.field_b = 0L;
        this.field_t = 0;
        this.field_l = 0L;
    }
}
