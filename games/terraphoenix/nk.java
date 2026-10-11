/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nk {
    private long field_h;
    private static int field_m;
    static boolean field_r;
    int[] field_t;
    private boolean field_p;
    private lj field_i;
    private int field_l;
    private static nf field_g;
    static int field_u;
    private boolean field_o;
    private long field_j;
    private int field_n;
    private int field_k;
    private int field_s;
    private lj[] field_e;
    private long field_f;
    private lj[] field_c;
    private int field_q;
    private int field_a;
    private int field_d;
    private int field_b;

    private final static void a(lj param0) {
        param0.field_j = false;
        if (param0.field_i != null) {
          param0.field_i.field_h = 0;
        }
        lj var1 = param0.c();
        while (var1 != null) {
          nk.a(var1);
          var1 = param0.a();
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_u = param0;
        field_r = param1 ? true : false;
        field_m = param2;
    }

    private final void a(lj param0, int param1) {
        int var3 = param1 >> 5;
        lj var4 = this.field_c[var3];
        if (var4 == null) {
          this.field_e[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_c[var3] = param0;
        param0.field_k = param1;
    }

    final synchronized void b(lj param0) {
        this.field_i = param0;
    }

    void d() {
    }

    private final void a(int param0) {
        this.field_a = this.field_a - param0;
        if (this.field_a < 0) {
          this.field_a = 0;
        }
        if (this.field_i != null) {
          this.field_i.a(param0);
          return;
        }
    }

    final static nk a(he param0, java.awt.Component param1, int param2, int param3) {
        try {
          ul var4 = null;
          Throwable var4_ref = null;
          ul var5 = null;
          ul stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          ul stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_u == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new ul();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_r) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((nk) ((Object) stackIn_10_0)).field_t = new int[stackIn_10_1 * stackIn_11_2];
              ((nk) ((Object) var4)).field_s = param3;
              ((nk) ((Object) var4)).a(param1);
              ((nk) ((Object) var4)).field_b = (param3 & -1024) + 1024;
              if (((nk) ((Object) var4)).field_b > 16384) {
                ((nk) ((Object) var4)).field_b = 16384;
              }
              ((nk) ((Object) var4)).b(((nk) ((Object) var4)).field_b);
              if (field_m > 0 &&
                field_g == null) {
                field_g = new nf();
                field_g.field_e = param0;
                param0.a((Runnable) ((Object) field_g), (byte) -21, field_m);
              }
              if (field_g != null) {
                if (field_g.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_g.field_d[param2] = (nk) ((Object) var5);
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

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        lj[] var8;
        int var9;
        Object var10;
        lj var11;
        id var12;
        int var13;
        lj var14;
        int var15_int;
        lj var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        lj var14Lifetime1;
        lj var14Lifetime2;
        var3 = param1;
        if (field_r) {
          var3 = var3 << 1;
        }
        ka.a(param0, 0, var3);
        this.field_a = this.field_a - param1;
        if (this.field_i != null &&
          this.field_a <= 0) {
          this.field_a = this.field_a + (field_u >> 4);
          nk.a(this.field_i);
          this.a(this.field_i, this.field_i.b());
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
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_h > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_j = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_l) {
                      break L3;
                    }
                    var14Lifetime2 = var11.c();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_k;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.a();
                      }
                    }
                    var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((lj) (var10)).field_h = var15;
                    } else {
                      this.field_e[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_c[var7_int] = (lj) (var10);
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
            this.field_c[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((lj) (var7)).field_h;
              ((lj) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_a < 0) {
          this.field_a = 0;
        }
        if (this.field_i != null) {
          this.field_i.a(param0, 0, param1);
        }
        this.field_h = ll.a(1000);
    }

    void b() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    int a() throws Exception {
        return this.field_b;
    }

    final synchronized void c() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_p) {
            return;
          }
          var1 = ll.a(1000);
          try {
            if (var1 > this.field_h + 6000L) {
              this.field_h = var1 - 6000L;
            }
            while (var1 > this.field_h + 5000L) {
              this.a(256);
              this.field_h = this.field_h + (long)(256000 / field_u);
              var1 = ll.a(1000);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_h = var1;
          }
          if (this.field_t == null) {
            return;
          }
          try {
            if (this.field_f != 0L) {
              if (var1 < this.field_f) {
                return;
              }
              this.b(this.field_b);
              this.field_f = 0L;
              this.field_o = true;
            }
            var3_int = this.a();
            if (this.field_n - var3_int > this.field_k) {
              this.field_k = this.field_n - var3_int;
            }
            var4 = this.field_s + this.field_q;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_b) {
              this.field_b = this.field_b + 1024;
              if (this.field_b > 16384) {
                this.field_b = 16384;
              }
              this.d();
              this.b(this.field_b);
              var3_int = 0;
              this.field_o = true;
              if (var4 + 256 > this.field_b) {
                var4 = this.field_b - 256;
                this.field_q = var4 - this.field_s;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_t, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_j) {
              if (this.field_o) {
                this.field_o = false;
              } else {
                if (this.field_k == 0 &&
                  this.field_d == 0) {
                  this.d();
                  this.field_f = var1 + 2000L;
                  return;
                }
                this.field_q = Math.min(this.field_d, this.field_k);
                this.field_d = this.field_k;
              }
              this.field_k = 0;
              this.field_j = var1 + 2000L;
            }
            this.field_n = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_f = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0) throws Exception {
    }

    public static void e() {
        field_g = null;
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_g != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_g.field_d[var2] == this) {
              field_g.field_d[var2] = null;
            }
            if (field_g.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_g.field_b = true;
            while (field_g.field_i) {
              gi.a((byte) -66, 50L);
            }
            field_g = null;
          }
        }
        this.d();
        this.field_t = null;
        this.field_p = true;
    }

    nk() {
        this.field_p = false;
        this.field_l = 32;
        this.field_h = ll.a(1000);
        this.field_n = 0;
        this.field_e = new lj[8];
        this.field_k = 0;
        this.field_f = 0L;
        this.field_j = 0L;
        this.field_c = new lj[8];
        this.field_a = 0;
        this.field_o = true;
        this.field_d = 0;
    }
}
