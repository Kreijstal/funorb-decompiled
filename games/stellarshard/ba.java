/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba {
    private boolean field_j;
    static boolean field_d;
    int[] field_f;
    static int field_m;
    private long field_n;
    private static qf field_p;
    private static int field_l;
    private int field_c;
    private kd field_r;
    private int field_i;
    private int field_h;
    private int field_s;
    private long field_u;
    private int field_b;
    private int field_a;
    private int field_k;
    private long field_o;
    private boolean field_q;
    private kd[] field_g;
    private int field_e;
    private kd[] field_t;

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        kd[] var8;
        int var9;
        Object var10;
        kd var11;
        gb var12;
        int var13;
        kd var14;
        int var15_int;
        kd var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        kd var14Lifetime1;
        kd var14Lifetime2;
        var3 = param1;
        if (field_d) {
          var3 = var3 << 1;
        }
        ri.a(param0, 0, var3);
        this.field_k = this.field_k - param1;
        if (this.field_r != null &&
          this.field_k <= 0) {
          this.field_k = this.field_k + (field_m >> 4);
          ba.b(this.field_r);
          this.a(this.field_r, this.field_r.a());
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
                  var11 = this.field_t[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_l;
                    if (var12 != null &&
                      var12.field_k > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_k;
                      continue;
                    }
                    var11.field_m = true;
                    var13 = var11.b();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_k = var12.field_k + var13;
                    }
                    if (var4 >= this.field_c) {
                      break L3;
                    }
                    var14Lifetime2 = var11.d();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_n;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.a() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_k;
                    var11.field_k = null;
                    if (var10 != null) {
                      ((kd) (var10)).field_k = var15;
                    } else {
                      this.field_t[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_g[var7_int] = (kd) (var10);
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
            var7 = this.field_t[var6Lifetime1];
            var8 = this.field_t;
            var9Lifetime1 = var6Lifetime1;
            this.field_g[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((kd) (var7)).field_k;
              ((kd) (var7)).field_k = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_k < 0) {
          this.field_k = 0;
        }
        if (this.field_r != null) {
          this.field_r.b(param0, 0, param1);
        }
        this.field_n = ih.a((byte) -98);
    }

    private final static void b(kd param0) {
        param0.field_m = false;
        if (param0.field_l != null) {
          param0.field_l.field_k = 0;
        }
        kd var1 = param0.d();
        while (var1 != null) {
          ba.b(var1);
          var1 = param0.c();
        }
    }

    final synchronized void a(kd param0) {
        this.field_r = param0;
    }

    public static void d() {
        field_p = null;
    }

    final static ba a(ej param0, java.awt.Component param1, int param2, int param3) {
        try {
          m var4 = null;
          Throwable var4_ref = null;
          m var5 = null;
          m stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          m stackIn_21_0 = null;
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
              var5 = new m();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_d) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((ba) ((Object) stackIn_10_0)).field_f = new int[stackIn_10_1 * stackIn_11_2];
              ((ba) ((Object) var4)).field_i = param3;
              ((ba) ((Object) var4)).a(param1);
              ((ba) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((ba) ((Object) var4)).field_a > 16384) {
                ((ba) ((Object) var4)).field_a = 16384;
              }
              ((ba) ((Object) var4)).b(((ba) ((Object) var4)).field_a);
              if (field_l > 0 &&
                field_p == null) {
                field_p = new qf();
                field_p.field_h = param0;
                param0.a((Runnable) ((Object) field_p), field_l, 0);
              }
              if (field_p != null) {
                if (field_p.field_e[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_p.field_e[param2] = (ba) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (ba) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new ba();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0) throws Exception {
    }

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
          var1 = ih.a((byte) -98);
          try {
            if (var1 > this.field_n + 6000L) {
              this.field_n = var1 - 6000L;
            }
            while (var1 > this.field_n + 5000L) {
              this.a(256);
              this.field_n = this.field_n + (long)(256000 / field_m);
              var1 = ih.a((byte) -98);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_n = var1;
          }
          if (this.field_f == null) {
            return;
          }
          try {
            if (this.field_o != 0L) {
              if (var1 < this.field_o) {
                return;
              }
              this.b(this.field_a);
              this.field_o = 0L;
              this.field_q = true;
            }
            var3_int = this.c();
            if (this.field_b - var3_int > this.field_h) {
              this.field_h = this.field_b - var3_int;
            }
            var4 = this.field_i + this.field_s;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.f();
              this.b(this.field_a);
              var3_int = 0;
              this.field_q = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_s = var4 - this.field_i;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_f, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_u) {
              if (this.field_q) {
                this.field_q = false;
              } else {
                if (this.field_h == 0 &&
                  this.field_e == 0) {
                  this.f();
                  this.field_o = var1 + 2000L;
                  return;
                }
                this.field_s = Math.min(this.field_e, this.field_h);
                this.field_e = this.field_h;
              }
              this.field_h = 0;
              this.field_u = var1 + 2000L;
            }
            this.field_b = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.f();
            this.field_o = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void e() {
        int var2 = 0;
        int var1;
        if (field_p != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_p.field_e[var2] == this) {
              field_p.field_e[var2] = null;
            }
            if (field_p.field_e[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_p.field_b = true;
            while (field_p.field_c) {
              jj.a((byte) -120, 50L);
            }
            field_p = null;
          }
        }
        this.f();
        this.field_f = null;
        this.field_j = true;
    }

    private final void a(int param0) {
        this.field_k = this.field_k - param0;
        if (this.field_k < 0) {
          this.field_k = 0;
        }
        if (this.field_r != null) {
          this.field_r.a(param0);
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_m = param0;
        field_d = param1 ? true : false;
        field_l = param2;
    }

    private final void a(kd param0, int param1) {
        int var3 = param1 >> 5;
        kd var4 = this.field_g[var3];
        if (var4 == null) {
          this.field_t[var3] = param0;
        } else {
          var4.field_k = param0;
        }
        this.field_g[var3] = param0;
        param0.field_n = param1;
    }

    void b() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void f() {
    }

    int c() throws Exception {
        return this.field_a;
    }

    ba() {
        this.field_j = false;
        this.field_c = 32;
        this.field_n = ih.a((byte) -98);
        this.field_u = 0L;
        this.field_h = 0;
        this.field_o = 0L;
        this.field_k = 0;
        this.field_g = new kd[8];
        this.field_q = true;
        this.field_b = 0;
        this.field_e = 0;
        this.field_t = new kd[8];
    }
}
