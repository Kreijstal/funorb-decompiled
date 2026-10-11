/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gd {
    int[] field_e;
    private boolean field_p;
    private static ga field_o;
    private long field_l;
    private je field_h;
    static int field_m;
    private static int field_n;
    private int field_i;
    static boolean field_q;
    private int field_g;
    private long field_a;
    private int field_d;
    private boolean field_c;
    private int field_u;
    private int field_b;
    private long field_j;
    private int field_r;
    private je[] field_k;
    private int field_s;
    private int field_f;
    private je[] field_t;

    void d() {
    }

    final synchronized void f() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_p) {
            return;
          }
          var1 = id.a(45);
          try {
            if (var1 > this.field_l + 6000L) {
              this.field_l = var1 - 6000L;
            }
            while (var1 > this.field_l + 5000L) {
              this.b(256);
              this.field_l = this.field_l + (long)(256000 / field_m);
              var1 = id.a(97);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_l = var1;
          }
          if (this.field_e == null) {
            return;
          }
          try {
            if (this.field_j != 0L) {
              if (var1 < this.field_j) {
                return;
              }
              this.a(this.field_s);
              this.field_j = 0L;
              this.field_c = true;
            }
            var3_int = this.b();
            if (this.field_b - var3_int > this.field_r) {
              this.field_r = this.field_b - var3_int;
            }
            var4 = this.field_d + this.field_f;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_s) {
              this.field_s = this.field_s + 1024;
              if (this.field_s > 16384) {
                this.field_s = 16384;
              }
              this.d();
              this.a(this.field_s);
              var3_int = 0;
              this.field_c = true;
              if (var4 + 256 > this.field_s) {
                var4 = this.field_s - 256;
                this.field_f = var4 - this.field_d;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_e, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_a) {
              if (this.field_c) {
                this.field_c = false;
              } else {
                if (this.field_r == 0 &&
                  this.field_g == 0) {
                  this.d();
                  this.field_j = var1 + 2000L;
                  return;
                }
                this.field_f = Math.min(this.field_g, this.field_r);
                this.field_g = this.field_r;
              }
              this.field_r = 0;
              this.field_a = var1 + 2000L;
            }
            this.field_b = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_j = var1 + 2000L;
          }
          return;
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
        field_m = param0;
        field_q = param1 ? true : false;
        field_n = param2;
    }

    int b() throws Exception {
        return this.field_s;
    }

    void e() throws Exception {
    }

    private final static void a(je param0) {
        param0.field_h = false;
        if (param0.field_i != null) {
          param0.field_i.field_g = 0;
        }
        je var1 = param0.b();
        while (var1 != null) {
          gd.a(var1);
          var1 = param0.a();
        }
    }

    final synchronized void c() {
        int var2 = 0;
        int var1;
        if (field_o != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_o.field_e[var2] == this) {
              field_o.field_e[var2] = null;
            }
            if (field_o.field_e[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_o.field_d = true;
            while (field_o.field_c) {
              wk.a((byte) -118, 50L);
            }
            field_o = null;
          }
        }
        this.d();
        this.field_e = null;
        this.field_p = true;
    }

    private final void a(je param0, int param1) {
        int var3 = param1 >> 5;
        je var4 = this.field_t[var3];
        if (var4 == null) {
          this.field_k[var3] = param0;
        } else {
          var4.field_g = param0;
        }
        this.field_t[var3] = param0;
        param0.field_j = param1;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        je[] var8;
        int var9;
        Object var10;
        je var11;
        ea var12;
        int var13;
        je var14;
        int var15_int;
        je var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        je var14Lifetime1;
        je var14Lifetime2;
        var3 = param1;
        if (field_q) {
          var3 = var3 << 1;
        }
        og.a(param0, 0, var3);
        this.field_u = this.field_u - param1;
        if (this.field_h != null &&
          this.field_u <= 0) {
          this.field_u = this.field_u + (field_m >> 4);
          gd.a(this.field_h);
          this.a(this.field_h, this.field_h.d());
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
                  var11 = this.field_k[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_g > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_g;
                      continue;
                    }
                    var11.field_h = true;
                    var13 = var11.c();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_g = var12.field_g + var13;
                    }
                    if (var4 >= this.field_i) {
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
                    var15 = var11.field_g;
                    var11.field_g = null;
                    if (var10 != null) {
                      ((je) (var10)).field_g = var15;
                    } else {
                      this.field_k[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_t[var7_int] = (je) (var10);
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
            var7 = this.field_k[var6Lifetime1];
            var8 = this.field_k;
            var9Lifetime1 = var6Lifetime1;
            this.field_t[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((je) (var7)).field_g;
              ((je) (var7)).field_g = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_u < 0) {
          this.field_u = 0;
        }
        if (this.field_h != null) {
          this.field_h.a(param0, 0, param1);
        }
        this.field_l = id.a(113);
    }

    final static gd a(le param0, java.awt.Component param1, int param2, int param3) {
        try {
          kd var4 = null;
          Throwable var4_ref = null;
          kd var5 = null;
          kd stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          kd stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_m == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new kd();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_q) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((gd) ((Object) stackIn_10_0)).field_e = new int[stackIn_10_1 * stackIn_11_2];
              ((gd) ((Object) var4)).field_d = param3;
              ((gd) ((Object) var4)).a(param1);
              ((gd) ((Object) var4)).field_s = (param3 & -1024) + 1024;
              if (((gd) ((Object) var4)).field_s > 16384) {
                ((gd) ((Object) var4)).field_s = 16384;
              }
              ((gd) ((Object) var4)).a(((gd) ((Object) var4)).field_s);
              if (field_n > 0 &&
                field_o == null) {
                field_o = new ga();
                field_o.field_a = param0;
                param0.a(0, field_n, (Runnable) ((Object) field_o));
              }
              if (field_o != null) {
                if (field_o.field_e[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_o.field_e[param2] = (gd) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (gd) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new gd();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_o = null;
    }

    private final void b(int param0) {
        this.field_u = this.field_u - param0;
        if (this.field_u < 0) {
          this.field_u = 0;
        }
        if (this.field_h != null) {
          this.field_h.a(param0);
          return;
        }
    }

    void a(int param0) throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void b(je param0) {
        this.field_h = param0;
    }

    gd() {
        this.field_p = false;
        this.field_i = 32;
        this.field_l = id.a(35);
        this.field_g = 0;
        this.field_u = 0;
        this.field_k = new je[8];
        this.field_b = 0;
        this.field_r = 0;
        this.field_c = true;
        this.field_a = 0L;
        this.field_j = 0L;
        this.field_t = new je[8];
    }
}
