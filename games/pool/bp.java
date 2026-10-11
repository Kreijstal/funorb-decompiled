/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bp {
    private long field_g;
    private static int field_m;
    private int field_e;
    private static mq field_u;
    int[] field_l;
    private kd field_p;
    static boolean field_r;
    private boolean field_s;
    private int field_t;
    private long field_b;
    private long field_d;
    private kd[] field_j;
    private int field_o;
    private int field_c;
    private kd[] field_f;
    private int field_i;
    private int field_a;
    private int field_q;
    static int field_h;
    private boolean field_n;
    private int field_k;

    void b() throws Exception {
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_h = param0;
        field_r = param1 ? true : false;
        field_m = param2;
    }

    void a(int param0) throws Exception {
    }

    private final void a(kd param0, int param1) {
        int var3 = param1 >> 5;
        kd var4 = this.field_j[var3];
        if (var4 == null) {
          this.field_f[var3] = param0;
        } else {
          var4.field_o = param0;
        }
        this.field_j[var3] = param0;
        param0.field_m = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a() {
    }

    final static bp a(sj param0, java.awt.Component param1, int param2, int param3) {
        try {
          pg var4 = null;
          Throwable var4_ref = null;
          pg var5 = null;
          pg stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          pg stackIn_21_0 = null;
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
              var5 = new pg();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_r) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((bp) ((Object) stackIn_10_0)).field_l = new int[stackIn_10_1 * stackIn_11_2];
              ((bp) ((Object) var4)).field_t = param3;
              ((bp) ((Object) var4)).a(param1);
              ((bp) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((bp) ((Object) var4)).field_a > 16384) {
                ((bp) ((Object) var4)).field_a = 16384;
              }
              ((bp) ((Object) var4)).a(((bp) ((Object) var4)).field_a);
              if (field_m > 0 &&
                field_u == null) {
                field_u = new mq();
                field_u.field_i = param0;
                param0.a(102, field_m, (Runnable) ((Object) field_u));
              }
              if (field_u != null) {
                if (field_u.field_e[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_u.field_e[param2] = (bp) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (bp) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new bp();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void a(kd param0) {
        this.field_p = param0;
    }

    public static void c() {
        field_u = null;
    }

    final synchronized void d() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_s) {
            return;
          }
          var1 = rl.a((byte) -127);
          try {
            if (var1 > this.field_g + 6000L) {
              this.field_g = var1 - 6000L;
            }
            while (var1 > this.field_g + 5000L) {
              this.b(256);
              this.field_g = this.field_g + (long)(256000 / field_h);
              var1 = rl.a((byte) -120);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_g = var1;
          }
          if (this.field_l == null) {
            return;
          }
          try {
            if (this.field_b != 0L) {
              if (var1 < this.field_b) {
                return;
              }
              this.a(this.field_a);
              this.field_b = 0L;
              this.field_n = true;
            }
            var3_int = this.e();
            if (this.field_i - var3_int > this.field_k) {
              this.field_k = this.field_i - var3_int;
            }
            var4 = this.field_t + this.field_q;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.a();
              this.a(this.field_a);
              var3_int = 0;
              this.field_n = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_q = var4 - this.field_t;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_l, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_d) {
              if (this.field_n) {
                this.field_n = false;
              } else {
                if (this.field_k == 0 &&
                  this.field_c == 0) {
                  this.a();
                  this.field_b = var1 + 2000L;
                  return;
                }
                this.field_q = Math.min(this.field_c, this.field_k);
                this.field_c = this.field_k;
              }
              this.field_k = 0;
              this.field_d = var1 + 2000L;
            }
            this.field_i = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.a();
            this.field_b = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        this.field_o = this.field_o - param0;
        if (this.field_o < 0) {
          this.field_o = 0;
        }
        if (this.field_p != null) {
          this.field_p.a(param0);
          return;
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
        kd[] var8;
        int var9;
        Object var10;
        kd var11;
        qm var12;
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
        if (field_r) {
          var3 = var3 << 1;
        }
        qn.a(param0, 0, var3);
        this.field_o = this.field_o - param1;
        if (this.field_p != null &&
          this.field_o <= 0) {
          this.field_o = this.field_o + (field_h >> 4);
          bp.b(this.field_p);
          this.a(this.field_p, this.field_p.c());
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
                    var12 = var11.field_n;
                    if (var12 != null &&
                      var12.field_l > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_o;
                      continue;
                    }
                    var11.field_l = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_l = var12.field_l + var13;
                    }
                    if (var4 >= this.field_e) {
                      break L3;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_m;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.b();
                      }
                    }
                    var15 = var11.field_o;
                    var11.field_o = null;
                    if (var10 != null) {
                      ((kd) (var10)).field_o = var15;
                    } else {
                      this.field_f[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_j[var7_int] = (kd) (var10);
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
              var10Lifetime1 = ((kd) (var7)).field_o;
              ((kd) (var7)).field_o = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_o < 0) {
          this.field_o = 0;
        }
        if (this.field_p != null) {
          this.field_p.a(param0, 0, param1);
        }
        this.field_g = rl.a((byte) -125);
    }

    private final static void b(kd param0) {
        param0.field_l = false;
        if (param0.field_n != null) {
          param0.field_n.field_l = 0;
        }
        kd var1 = param0.a();
        while (var1 != null) {
          bp.b(var1);
          var1 = param0.b();
        }
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_u != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_u.field_e[var2] == this) {
              field_u.field_e[var2] = null;
            }
            if (field_u.field_e[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_u.field_d = true;
            while (field_u.field_h) {
              cf.a(-127, 50L);
            }
            field_u = null;
          }
        }
        this.a();
        this.field_l = null;
        this.field_s = true;
    }

    int e() throws Exception {
        return this.field_a;
    }

    bp() {
        this.field_e = 32;
        this.field_s = false;
        this.field_g = rl.a((byte) -104);
        this.field_b = 0L;
        this.field_d = 0L;
        this.field_c = 0;
        this.field_o = 0;
        this.field_j = new kd[8];
        this.field_n = true;
        this.field_k = 0;
        this.field_f = new kd[8];
        this.field_i = 0;
    }
}
