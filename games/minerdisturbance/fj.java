/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj {
    private um field_k;
    private static j field_b;
    static int field_r;
    static boolean field_u;
    int[] field_s;
    private static int field_d;
    private boolean field_p;
    private long field_g;
    private int field_q;
    private int field_l;
    private um[] field_j;
    private int field_e;
    private int field_a;
    private long field_o;
    private boolean field_t;
    private int field_m;
    private int field_h;
    private int field_c;
    private long field_n;
    private int field_i;
    private um[] field_f;

    void g() {
    }

    public static void d() {
        field_b = null;
    }

    void h() throws Exception {
    }

    final synchronized void f() {
        try {
          this.field_t = true;
          try {
            this.c();
          } catch (Exception exception) {
            this.g();
            this.field_o = sf.a((byte) 100) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int b() throws Exception {
        return this.field_l;
    }

    final synchronized void e() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_p) {
            return;
          }
          var1 = sf.a((byte) -55);
          try {
            if (var1 > this.field_g + 6000L) {
              this.field_g = var1 - 6000L;
            }
            while (var1 > this.field_g + 5000L) {
              this.a(256);
              this.field_g = this.field_g + (long)(256000 / field_r);
              var1 = sf.a((byte) 99);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_g = var1;
          }
          if (this.field_s == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.b(this.field_l);
              this.field_o = 0L;
              this.field_t = true;
            }
            var3_int = this.b();
            if (this.field_h - var3_int > this.field_e) {
              this.field_e = this.field_h - var3_int;
            }
            var4 = this.field_m + this.field_i;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_l) {
              this.field_l = this.field_l + 1024;
              if (this.field_l > 16384) {
                this.field_l = 16384;
              }
              this.g();
              this.b(this.field_l);
              var3_int = 0;
              this.field_t = true;
              if (var4 + 256 > this.field_l) {
                var4 = this.field_l - 256;
                this.field_i = var4 - this.field_m;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_s, 256);
              this.h();
              var3_int += 256;
            }
            if (var1 > this.field_n) {
              if (this.field_t) {
                this.field_t = false;
              } else {
                if (this.field_e == 0 &&
                  this.field_a == 0) {
                  this.g();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_i = Math.min(this.field_a, this.field_e);
                this.field_a = this.field_e;
              }
              this.field_e = 0;
              this.field_n = var1 + 2000L;
            }
            this.field_h = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.g();
            this.field_o = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void a(um param0) {
        param0.field_n = false;
        if (param0.field_q != null) {
          param0.field_q.field_n = 0;
        }
        um var1 = param0.b();
        while (var1 != null) {
          fj.a(var1);
          var1 = param0.c();
        }
    }

    final synchronized void a() {
        int var2 = 0;
        int var1;
        if (field_b != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_b.field_g[var2] == this) {
              field_b.field_g[var2] = null;
            }
            if (field_b.field_g[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_b.field_b = true;
            while (field_b.field_i) {
              gf.a(50L, -10309);
            }
            field_b = null;
          }
        }
        this.g();
        this.field_s = null;
        this.field_p = true;
    }

    final static fj a(vf param0, java.awt.Component param1, int param2, int param3) {
        try {
          sm var4 = null;
          Throwable var4_ref = null;
          sm var5 = null;
          sm stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          sm stackIn_21_0 = null;
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
              var5 = new sm();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_u) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((fj) ((Object) stackIn_10_0)).field_s = new int[stackIn_10_1 * stackIn_11_2];
              ((fj) ((Object) var4)).field_m = param3;
              ((fj) ((Object) var4)).a(param1);
              ((fj) ((Object) var4)).field_l = (param3 & -1024) + 1024;
              if (((fj) ((Object) var4)).field_l > 16384) {
                ((fj) ((Object) var4)).field_l = 16384;
              }
              ((fj) ((Object) var4)).b(((fj) ((Object) var4)).field_l);
              if (field_d > 0 &&
                field_b == null) {
                field_b = new j();
                field_b.field_c = param0;
                param0.a((Runnable) ((Object) field_b), (byte) 18, field_d);
              }
              if (field_b != null) {
                if (field_b.field_g[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_b.field_g[param2] = (fj) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (fj) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new fj();
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
        um[] var8;
        int var9;
        Object var10;
        um var11;
        gg var12;
        int var13;
        um var14;
        int var15_int;
        um var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        um var14Lifetime1;
        um var14Lifetime2;
        var3 = param1;
        if (field_u) {
          var3 = var3 << 1;
        }
        ai.a(param0, 0, var3);
        this.field_c = this.field_c - param1;
        if (this.field_k != null &&
          this.field_c <= 0) {
          this.field_c = this.field_c + (field_r >> 4);
          fj.a(this.field_k);
          this.a(this.field_k, this.field_k.a());
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
                    var12 = var11.field_q;
                    if (var12 != null &&
                      var12.field_n > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_o;
                      continue;
                    }
                    var11.field_n = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_n = var12.field_n + var13;
                    }
                    if (var4 >= this.field_q) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_p;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.a() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_o;
                    var11.field_o = null;
                    if (var10 != null) {
                      ((um) (var10)).field_o = var15;
                    } else {
                      this.field_f[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_j[var7_int] = (um) (var10);
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
            this.field_j[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((um) (var7)).field_o;
              ((um) (var7)).field_o = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_k != null) {
          this.field_k.a(param0, 0, param1);
        }
        this.field_g = sf.a((byte) 107);
    }

    void b(int param0) throws Exception {
    }

    private final void a(int param0) {
        this.field_c = this.field_c - param0;
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_k != null) {
          this.field_k.a(param0);
          return;
        }
    }

    final synchronized void b(um param0) {
        this.field_k = param0;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_r = param0;
        field_u = param1 ? true : false;
        field_d = param2;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final void a(um param0, int param1) {
        int var3 = param1 >> 5;
        um var4 = this.field_j[var3];
        if (var4 == null) {
          this.field_f[var3] = param0;
        } else {
          var4.field_o = param0;
        }
        this.field_j[var3] = param0;
        param0.field_p = param1;
    }

    void c() throws Exception {
    }

    fj() {
        this.field_p = false;
        this.field_q = 32;
        this.field_g = sf.a((byte) 114);
        this.field_j = new um[8];
        this.field_o = 0L;
        this.field_e = 0;
        this.field_t = true;
        this.field_h = 0;
        this.field_n = 0L;
        this.field_a = 0;
        this.field_c = 0;
        this.field_f = new um[8];
    }
}
