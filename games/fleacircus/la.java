/*
 * Decompiled by CFR-JS 0.4.0.
 */
class la {
    static boolean field_h;
    private sh field_o;
    int[] field_i;
    private int field_c;
    private boolean field_u;
    private long field_t;
    private static ec field_n;
    private static int field_k;
    static int field_a;
    private boolean field_b;
    private int field_q;
    private int field_g;
    private int field_j;
    private int field_m;
    private long field_r;
    private int field_s;
    private int field_f;
    private sh[] field_d;
    private long field_p;
    private int field_l;
    private sh[] field_e;

    final synchronized void a() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_u) {
            return;
          }
          var1 = lj.a((byte) -51);
          try {
            if (var1 > this.field_t + 6000L) {
              this.field_t = var1 - 6000L;
            }
            while (var1 > this.field_t + 5000L) {
              this.a(256);
              this.field_t = this.field_t + (long)(256000 / field_a);
              var1 = lj.a((byte) -98);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_t = var1;
          }
          if (this.field_i == null) {
            return;
          }
          try {
            if (this.field_r != 0L) {
              if (var1 < this.field_r) {
                return;
              }
              this.b(this.field_l);
              this.field_r = 0L;
              this.field_b = true;
            }
            var3_int = this.h();
            if (this.field_g - var3_int > this.field_s) {
              this.field_s = this.field_g - var3_int;
            }
            var4 = this.field_f + this.field_q;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_l) {
              this.field_l = this.field_l + 1024;
              if (this.field_l > 16384) {
                this.field_l = 16384;
              }
              this.c();
              this.b(this.field_l);
              var3_int = 0;
              this.field_b = true;
              if (var4 + 256 > this.field_l) {
                var4 = this.field_l - 256;
                this.field_q = var4 - this.field_f;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_i, 256);
              this.f();
              var3_int += 256;
            }
            if (var1 > this.field_p) {
              if (this.field_b) {
                this.field_b = false;
              } else {
                if (this.field_s == 0 &&
                  this.field_j == 0) {
                  this.c();
                  this.field_r = var1 + 2000L;
                  return;
                }
                this.field_q = Math.min(this.field_j, this.field_s);
                this.field_j = this.field_s;
              }
              this.field_s = 0;
              this.field_p = var1 + 2000L;
            }
            this.field_g = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.c();
            this.field_r = var1 + 2000L;
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

    void c() {
    }

    final static la a(ce param0, java.awt.Component param1, int param2, int param3) {
        try {
          kg var4 = null;
          Throwable var4_ref = null;
          kg var5 = null;
          kg stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          kg stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_a == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new kg();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_h) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((la) ((Object) stackIn_10_0)).field_i = new int[stackIn_10_1 * stackIn_11_2];
              ((la) ((Object) var4)).field_f = param3;
              ((la) ((Object) var4)).a(param1);
              ((la) ((Object) var4)).field_l = (param3 & -1024) + 1024;
              if (((la) ((Object) var4)).field_l > 16384) {
                ((la) ((Object) var4)).field_l = 16384;
              }
              ((la) ((Object) var4)).b(((la) ((Object) var4)).field_l);
              if (field_k > 0 &&
                field_n == null) {
                field_n = new ec();
                field_n.field_f = param0;
                param0.a(4532, (Runnable) ((Object) field_n), field_k);
              }
              if (field_n != null) {
                if (field_n.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_n.field_c[param2] = (la) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (la) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new la();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(sh param0, int param1) {
        int var3 = param1 >> 5;
        sh var4 = this.field_e[var3];
        if (var4 == null) {
          this.field_d[var3] = param0;
        } else {
          var4.field_l = param0;
        }
        this.field_e[var3] = param0;
        param0.field_k = param1;
    }

    int h() throws Exception {
        return this.field_l;
    }

    public static void b() {
        field_n = null;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_a = param0;
        field_h = param1 ? true : false;
        field_k = param2;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        sh[] var8;
        int var9;
        Object var10;
        sh var11;
        jf var12;
        int var13;
        sh var14;
        int var15_int;
        sh var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        sh var14Lifetime1;
        sh var14Lifetime2;
        var3 = param1;
        if (field_h) {
          var3 = var3 << 1;
        }
        dm.a(param0, 0, var3);
        this.field_m = this.field_m - param1;
        if (this.field_o != null &&
          this.field_m <= 0) {
          this.field_m = this.field_m + (field_a >> 4);
          la.a(this.field_o);
          this.a(this.field_o, this.field_o.b());
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
                    var12 = var11.field_i;
                    if (var12 != null &&
                      var12.field_i > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_l;
                      continue;
                    }
                    var11.field_j = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_i = var12.field_i + var13;
                    }
                    if (var4 >= this.field_c) {
                      break L3;
                    }
                    var14Lifetime2 = var11.d();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_k;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.b() >> 8);
                        var14Lifetime2 = var11.c();
                      }
                    }
                    var15 = var11.field_l;
                    var11.field_l = null;
                    if (var10 != null) {
                      ((sh) (var10)).field_l = var15;
                    } else {
                      this.field_d[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_e[var7_int] = (sh) (var10);
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
            this.field_e[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((sh) (var7)).field_l;
              ((sh) (var7)).field_l = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_o != null) {
          this.field_o.b(param0, 0, param1);
        }
        this.field_t = lj.a((byte) -103);
    }

    final synchronized void d() {
        int var2 = 0;
        int var1;
        if (field_n != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_n.field_c[var2] == this) {
              field_n.field_c[var2] = null;
            }
            if (field_n.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_n.field_g = true;
            while (field_n.field_h) {
              vh.a(50L, 73);
            }
            field_n = null;
          }
        }
        this.c();
        this.field_i = null;
        this.field_u = true;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    private final static void a(sh param0) {
        param0.field_j = false;
        if (param0.field_i != null) {
          param0.field_i.field_i = 0;
        }
        sh var1 = param0.d();
        while (var1 != null) {
          la.a(var1);
          var1 = param0.c();
        }
    }

    final synchronized void b(sh param0) {
        this.field_o = param0;
    }

    void e() throws Exception {
    }

    void f() throws Exception {
    }

    private final void a(int param0) {
        this.field_m = this.field_m - param0;
        if (this.field_m < 0) {
          this.field_m = 0;
        }
        if (this.field_o != null) {
          this.field_o.a(param0);
          return;
        }
    }

    final synchronized void g() {
        try {
          this.field_b = true;
          try {
            this.e();
          } catch (Exception exception) {
            this.c();
            this.field_r = lj.a((byte) -23) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    la() {
        this.field_c = 32;
        this.field_u = false;
        this.field_t = lj.a((byte) -104);
        this.field_j = 0;
        this.field_m = 0;
        this.field_g = 0;
        this.field_r = 0L;
        this.field_d = new sh[8];
        this.field_b = true;
        this.field_s = 0;
        this.field_e = new sh[8];
        this.field_p = 0L;
    }
}
