/*
 * Decompiled by CFR-JS 0.4.0.
 */
class id {
    private ic field_l;
    private int field_c;
    private boolean field_e;
    static int field_d;
    int[] field_a;
    private static fb field_g;
    private static int field_o;
    private long field_p;
    static boolean field_f;
    private boolean field_m;
    private int field_s;
    private int field_n;
    private int field_q;
    private ic[] field_i;
    private int field_k;
    private ic[] field_b;
    private int field_h;
    private int field_r;
    private long field_t;
    private int field_u;
    private long field_j;

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void h() {
        int var2 = 0;
        int var1;
        if (field_g != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_g.field_i[var2] == this) {
              field_g.field_i[var2] = null;
            }
            if (field_g.field_i[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_g.field_h = true;
            while (field_g.field_f) {
              kk.a(50L, true);
            }
            field_g = null;
          }
        }
        this.f();
        this.field_a = null;
        this.field_e = true;
    }

    void f() {
    }

    void b() throws Exception {
    }

    void a(int param0) throws Exception {
    }

    public static void e() {
        field_g = null;
    }

    final synchronized void a() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_e) {
            return;
          }
          var1 = la.a(false);
          try {
            if (var1 > this.field_p + 6000L) {
              this.field_p = var1 - 6000L;
            }
            while (var1 > this.field_p + 5000L) {
              this.b(256);
              this.field_p = this.field_p + (long)(256000 / field_d);
              var1 = la.a(false);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_p = var1;
          }
          if (this.field_a == null) {
            return;
          }
          try {
            if (this.field_j != 0L) {
              if (var1 < this.field_j) {
                return;
              }
              this.a(this.field_h);
              this.field_j = 0L;
              this.field_m = true;
            }
            var3_int = this.c();
            if (this.field_n - var3_int > this.field_u) {
              this.field_u = this.field_n - var3_int;
            }
            var4 = this.field_s + this.field_r;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_h) {
              this.field_h = this.field_h + 1024;
              if (this.field_h > 16384) {
                this.field_h = 16384;
              }
              this.f();
              this.a(this.field_h);
              var3_int = 0;
              this.field_m = true;
              if (var4 + 256 > this.field_h) {
                var4 = this.field_h - 256;
                this.field_r = var4 - this.field_s;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_a, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_t) {
              if (this.field_m) {
                this.field_m = false;
              } else {
                if (this.field_u == 0 &&
                  this.field_q == 0) {
                  this.f();
                  this.field_j = var1 + 2000L;
                  return;
                }
                this.field_r = Math.min(this.field_q, this.field_u);
                this.field_q = this.field_u;
              }
              this.field_u = 0;
              this.field_t = var1 + 2000L;
            }
            this.field_n = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.f();
            this.field_j = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(ic param0) {
        param0.field_h = false;
        if (param0.field_i != null) {
          param0.field_i.field_h = 0;
        }
        ic var1 = param0.a();
        while (var1 != null) {
          id.b(var1);
          var1 = param0.c();
        }
    }

    private final void a(ic param0, int param1) {
        int var3 = param1 >> 5;
        ic var4 = this.field_i[var3];
        if (var4 == null) {
          this.field_b[var3] = param0;
        } else {
          var4.field_j = param0;
        }
        this.field_i[var3] = param0;
        param0.field_k = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        ic[] var8;
        int var9;
        Object var10;
        ic var11;
        me var12;
        int var13;
        ic var14;
        int var15_int;
        ic var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        ic var14Lifetime1;
        ic var14Lifetime2;
        var3 = param1;
        if (field_f) {
          var3 = var3 << 1;
        }
        kg.a(param0, 0, var3);
        this.field_k = this.field_k - param1;
        if (this.field_l != null &&
          this.field_k <= 0) {
          this.field_k = this.field_k + (field_d >> 4);
          id.b(this.field_l);
          this.a(this.field_l, this.field_l.b());
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
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_h > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_j;
                      continue;
                    }
                    var11.field_h = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_c) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_k;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_j;
                    var11.field_j = null;
                    if (var10 != null) {
                      ((ic) (var10)).field_j = var15;
                    } else {
                      this.field_b[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_i[var7_int] = (ic) (var10);
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
            this.field_i[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((ic) (var7)).field_j;
              ((ic) (var7)).field_j = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_k < 0) {
          this.field_k = 0;
        }
        if (this.field_l != null) {
          this.field_l.b(param0, 0, param1);
        }
        this.field_p = la.a(false);
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_d = param0;
        field_f = param1 ? true : false;
        field_o = param2;
    }

    final synchronized void g() {
        try {
          this.field_m = true;
          try {
            this.d();
          } catch (Exception exception) {
            this.f();
            this.field_j = la.a(false) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        this.field_k = this.field_k - param0;
        if (this.field_k < 0) {
          this.field_k = 0;
        }
        if (this.field_l != null) {
          this.field_l.d(param0);
          return;
        }
    }

    int c() throws Exception {
        return this.field_h;
    }

    final synchronized void a(ic param0) {
        this.field_l = param0;
    }

    final static id a(bl param0, java.awt.Component param1, int param2, int param3) {
        try {
          ed var4 = null;
          Throwable var4_ref = null;
          ed var5 = null;
          ed stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          ed stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_d == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new ed();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_f) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((id) ((Object) stackIn_10_0)).field_a = new int[stackIn_10_1 * stackIn_11_2];
              ((id) ((Object) var4)).field_s = param3;
              ((id) ((Object) var4)).a(param1);
              ((id) ((Object) var4)).field_h = (param3 & -1024) + 1024;
              if (((id) ((Object) var4)).field_h > 16384) {
                ((id) ((Object) var4)).field_h = 16384;
              }
              ((id) ((Object) var4)).a(((id) ((Object) var4)).field_h);
              if (field_o > 0 &&
                field_g == null) {
                field_g = new fb();
                field_g.field_d = param0;
                param0.a((Runnable) ((Object) field_g), field_o, (byte) -8);
              }
              if (field_g != null) {
                if (field_g.field_i[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_g.field_i[param2] = (id) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (id) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new id();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void d() throws Exception {
    }

    id() {
        this.field_e = false;
        this.field_c = 32;
        this.field_p = la.a(false);
        this.field_q = 0;
        this.field_k = 0;
        this.field_n = 0;
        this.field_b = new ic[8];
        this.field_i = new ic[8];
        this.field_m = true;
        this.field_j = 0L;
        this.field_u = 0;
        this.field_t = 0L;
    }
}
