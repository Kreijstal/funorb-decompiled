/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tj {
    int[] field_n;
    private int field_j;
    static int field_q;
    private long field_m;
    private qd field_e;
    private static int field_l;
    private static aq field_c;
    private boolean field_d;
    static boolean field_g;
    private int field_i;
    private long field_r;
    private qd[] field_p;
    private int field_f;
    private int field_h;
    private int field_o;
    private qd[] field_u;
    private int field_a;
    private long field_b;
    private int field_t;
    private boolean field_k;
    private int field_s;

    void h() throws Exception {
    }

    final synchronized void c() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_d) {
            return;
          }
          var1 = ue.a(false);
          try {
            if (var1 > this.field_m + 6000L) {
              this.field_m = var1 - 6000L;
            }
            while (var1 > this.field_m + 5000L) {
              this.a(256);
              this.field_m = this.field_m + (long)(256000 / field_q);
              var1 = ue.a(false);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_m = var1;
          }
          if (this.field_n == null) {
            return;
          }
          try {
            if (this.field_r != 0L) {
              if (var1 < this.field_r) {
                return;
              }
              this.b(this.field_a);
              this.field_r = 0L;
              this.field_k = true;
            }
            var3_int = this.a();
            if (this.field_h - var3_int > this.field_t) {
              this.field_t = this.field_h - var3_int;
            }
            var4 = this.field_s + this.field_o;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_a) {
              this.field_a = this.field_a + 1024;
              if (this.field_a > 16384) {
                this.field_a = 16384;
              }
              this.d();
              this.b(this.field_a);
              var3_int = 0;
              this.field_k = true;
              if (var4 + 256 > this.field_a) {
                var4 = this.field_a - 256;
                this.field_o = var4 - this.field_s;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_n, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_b) {
              if (this.field_k) {
                this.field_k = false;
              } else {
                if (this.field_t == 0 &&
                  this.field_f == 0) {
                  this.d();
                  this.field_r = var1 + 2000L;
                  return;
                }
                this.field_o = Math.min(this.field_f, this.field_t);
                this.field_f = this.field_t;
              }
              this.field_t = 0;
              this.field_b = var1 + 2000L;
            }
            this.field_h = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_r = var1 + 2000L;
          }
          return;
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
        el var12;
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
        pm.a(param0, 0, var3);
        this.field_i = this.field_i - param1;
        if (this.field_e != null &&
          this.field_i <= 0) {
          this.field_i = this.field_i + (field_q >> 4);
          tj.a(this.field_e);
          this.a(this.field_e, this.field_e.c());
          var4 = 0;
          var5 = 255;
          var6 = 7;
          scanLoop1: while (true) {
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
                    var11.field_j = true;
                    var13 = var11.b();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.field_j) {
                      break scanLoop1;
                    }
                    var14Lifetime2 = var11.a();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_i;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((qd) (var10)).field_l = var15;
                    } else {
                      this.field_p[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_u[var7_int] = (qd) (var10);
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
            this.field_u[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((qd) (var7)).field_l;
              ((qd) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_i < 0) {
          this.field_i = 0;
        }
        if (this.field_e != null) {
          this.field_e.b(param0, 0, param1);
        }
        this.field_m = ue.a(false);
    }

    public static void g() {
        field_c = null;
    }

    private final void a(qd param0, int param1) {
        int var3 = param1 >> 5;
        qd var4 = this.field_u[var3];
        if (var4 == null) {
          this.field_p[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_u[var3] = param0;
        param0.field_i = param1;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_q = param0;
        field_g = param1 ? true : false;
        field_l = param2;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void e() throws Exception {
    }

    final static tj a(tg param0, java.awt.Component param1, int param2, int param3) {
        try {
          pd var4 = null;
          Throwable var4_ref = null;
          pd var5 = null;
          pd stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          pd stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_q == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new pd();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_g) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((tj) ((Object) stackIn_10_0)).field_n = new int[stackIn_10_1 * stackIn_11_2];
              ((tj) ((Object) var4)).field_s = param3;
              ((tj) ((Object) var4)).a(param1);
              ((tj) ((Object) var4)).field_a = (param3 & -1024) + 1024;
              if (((tj) ((Object) var4)).field_a > 16384) {
                ((tj) ((Object) var4)).field_a = 16384;
              }
              ((tj) ((Object) var4)).b(((tj) ((Object) var4)).field_a);
              if (field_l > 0 &&
                field_c == null) {
                field_c = new aq();
                field_c.field_c = param0;
                param0.a(field_l, (Runnable) ((Object) field_c), (byte) -94);
              }
              if (field_c != null) {
                if (field_c.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_c.field_d[param2] = (tj) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (tj) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new tj();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void a(qd param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
          param0.field_k.field_i = 0;
        }
        qd var1 = param0.a();
        while (var1 != null) {
          tj.a(var1);
          var1 = param0.d();
        }
    }

    void d() {
    }

    final synchronized void b(qd param0) {
        this.field_e = param0;
    }

    void b(int param0) throws Exception {
    }

    final synchronized void f() {
        int var2 = 0;
        int var1;
        if (field_c != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_c.field_d[var2] == this) {
              field_c.field_d[var2] = null;
            }
            if (field_c.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_c.field_a = true;
            while (field_c.field_b) {
              wj.a(-125, 50L);
            }
            field_c = null;
          }
        }
        this.d();
        this.field_n = null;
        this.field_d = true;
    }

    private final void a(int param0) {
        this.field_i = this.field_i - param0;
        if (this.field_i < 0) {
          this.field_i = 0;
        }
        if (this.field_e != null) {
          this.field_e.a(param0);
          return;
        }
    }

    int a() throws Exception {
        return this.field_a;
    }

    final synchronized void b() {
        try {
          this.field_k = true;
          try {
            this.h();
          } catch (Exception exception) {
            this.d();
            this.field_r = ue.a(false) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    tj() {
        this.field_j = 32;
        this.field_d = false;
        this.field_m = ue.a(false);
        this.field_r = 0L;
        this.field_p = new qd[8];
        this.field_b = 0L;
        this.field_u = new qd[8];
        this.field_i = 0;
        this.field_f = 0;
        this.field_k = true;
        this.field_h = 0;
        this.field_t = 0;
    }
}
