/*
 * Decompiled by CFR-JS 0.4.0.
 */
class md {
    static int field_l;
    private boolean field_a;
    static boolean field_q;
    private long field_t;
    private static vi field_e;
    private int field_i;
    int[] field_j;
    private nm field_c;
    private static int field_s;
    private int field_g;
    private nm[] field_n;
    private long field_h;
    private int field_u;
    private int field_d;
    private int field_b;
    private long field_r;
    private int field_m;
    private nm[] field_f;
    private int field_k;
    private int field_p;
    private boolean field_o;

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_l = param0;
        field_q = param1 ? true : false;
        field_s = param2;
    }

    final static md a(jk param0, java.awt.Component param1, int param2, int param3) {
        try {
          nf var4 = null;
          Throwable var4_ref = null;
          nf var5 = null;
          nf stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          nf stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_l == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new nf();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_q) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((md) ((Object) stackIn_10_0)).field_j = new int[stackIn_10_1 * stackIn_11_2];
              ((md) ((Object) var4)).field_m = param3;
              ((md) ((Object) var4)).a(param1);
              ((md) ((Object) var4)).field_g = (param3 & -1024) + 1024;
              if (((md) ((Object) var4)).field_g > 16384) {
                ((md) ((Object) var4)).field_g = 16384;
              }
              ((md) ((Object) var4)).b(((md) ((Object) var4)).field_g);
              if (field_s > 0 &&
                field_e == null) {
                field_e = new vi();
                field_e.field_b = param0;
                param0.a(field_s, true, (Runnable) ((Object) field_e));
              }
              if (field_e != null) {
                if (field_e.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_e.field_c[param2] = (md) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (md) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new md();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d() {
        field_e = null;
    }

    private final void a(nm param0, int param1) {
        int var3 = param1 >> 5;
        nm var4 = this.field_n[var3];
        if (var4 == null) {
          this.field_f[var3] = param0;
        } else {
          var4.field_j = param0;
        }
        this.field_n[var3] = param0;
        param0.field_m = param1;
    }

    private final void a(int param0) {
        this.field_p = this.field_p - param0;
        if (this.field_p < 0) {
          this.field_p = 0;
        }
        if (this.field_c != null) {
          this.field_c.a(param0);
          return;
        }
    }

    void b(int param0) throws Exception {
    }

    final synchronized void b() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_a) {
            return;
          }
          var1 = ud.a(2);
          try {
            if (var1 > this.field_t + 6000L) {
              this.field_t = var1 - 6000L;
            }
            while (var1 > this.field_t + 5000L) {
              this.a(256);
              this.field_t = this.field_t + (long)(256000 / field_l);
              var1 = ud.a(2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_t = var1;
          }
          if (this.field_j == null) {
            return;
          }
          try {
            if (this.field_r != 0L) {
              if (var1 < this.field_r) {
                return;
              }
              this.b(this.field_g);
              this.field_r = 0L;
              this.field_o = true;
            }
            var3_int = this.f();
            if (this.field_d - var3_int > this.field_k) {
              this.field_k = this.field_d - var3_int;
            }
            var4 = this.field_m + this.field_u;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_g) {
              this.field_g = this.field_g + 1024;
              if (this.field_g > 16384) {
                this.field_g = 16384;
              }
              this.a();
              this.b(this.field_g);
              var3_int = 0;
              this.field_o = true;
              if (var4 + 256 > this.field_g) {
                var4 = this.field_g - 256;
                this.field_u = var4 - this.field_m;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_j, 256);
              this.e();
              var3_int += 256;
            }
            if (var1 > this.field_h) {
              if (this.field_o) {
                this.field_o = false;
              } else {
                if (this.field_k == 0 &&
                  this.field_b == 0) {
                  this.a();
                  this.field_r = var1 + 2000L;
                  return;
                }
                this.field_u = Math.min(this.field_b, this.field_k);
                this.field_b = this.field_k;
              }
              this.field_k = 0;
              this.field_h = var1 + 2000L;
            }
            this.field_d = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.a();
            this.field_r = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int f() throws Exception {
        return this.field_g;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        nm[] var8;
        int var9;
        Object var10;
        nm var11;
        pb var12;
        int var13;
        nm var14;
        int var15_int;
        nm var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        nm var14Lifetime1;
        nm var14Lifetime2;
        var3 = param1;
        if (field_q) {
          var3 = var3 << 1;
        }
        ne.a(param0, 0, var3);
        this.field_p = this.field_p - param1;
        if (this.field_c != null &&
          this.field_p <= 0) {
          this.field_p = this.field_p + (field_l >> 4);
          md.a(this.field_c);
          this.a(this.field_c, this.field_c.c());
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
                    var12 = var11.field_l;
                    if (var12 != null &&
                      var12.field_j > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_j;
                      continue;
                    }
                    var11.field_k = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_j = var12.field_j + var13;
                    }
                    if (var4 >= this.field_i) {
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
                    var15 = var11.field_j;
                    var11.field_j = null;
                    if (var10 != null) {
                      ((nm) (var10)).field_j = var15;
                    } else {
                      this.field_f[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_n[var7_int] = (nm) (var10);
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
            this.field_n[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((nm) (var7)).field_j;
              ((nm) (var7)).field_j = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_p < 0) {
          this.field_p = 0;
        }
        if (this.field_c != null) {
          this.field_c.a(param0, 0, param1);
        }
        this.field_t = ud.a(2);
    }

    final synchronized void g() {
        try {
          this.field_o = true;
          try {
            this.h();
          } catch (Exception exception) {
            this.a();
            this.field_r = ud.a(2) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void e() throws Exception {
    }

    final synchronized void b(nm param0) {
        this.field_c = param0;
    }

    void h() throws Exception {
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a() {
    }

    final synchronized void c() {
        int var2 = 0;
        int var1;
        if (field_e != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_e.field_c[var2] == this) {
              field_e.field_c[var2] = null;
            }
            if (field_e.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_e.field_f = true;
            while (field_e.field_e) {
              bc.a(50L, (byte) 87);
            }
            field_e = null;
          }
        }
        this.a();
        this.field_j = null;
        this.field_a = true;
    }

    private final static void a(nm param0) {
        param0.field_k = false;
        if (param0.field_l != null) {
          param0.field_l.field_j = 0;
        }
        nm var1 = param0.a();
        while (var1 != null) {
          md.a(var1);
          var1 = param0.b();
        }
    }

    md() {
        this.field_i = 32;
        this.field_a = false;
        this.field_t = ud.a(2);
        this.field_h = 0L;
        this.field_n = new nm[8];
        this.field_d = 0;
        this.field_b = 0;
        this.field_k = 0;
        this.field_p = 0;
        this.field_r = 0L;
        this.field_f = new nm[8];
        this.field_o = true;
    }
}
