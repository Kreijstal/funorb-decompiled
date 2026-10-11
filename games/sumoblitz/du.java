/*
 * Decompiled by CFR-JS 0.4.0.
 */
class du {
    private static pp field_i;
    int[] field_p;
    static boolean field_o;
    private int field_g;
    private static int field_m;
    private boolean field_f;
    static int field_k;
    private hj field_l;
    private long field_u;
    private hj[] field_t;
    private int field_r;
    private boolean field_e;
    private int field_h;
    private hj[] field_b;
    private int field_n;
    private int field_c;
    private int field_q;
    private int field_a;
    private long field_d;
    private long field_j;
    private int field_s;

    final synchronized void d() {
        try {
          this.field_e = true;
          try {
            this.f();
          } catch (Exception exception) {
            this.g();
            this.field_j = wq.a(-20) + 2000L;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static du a(wi param0, java.awt.Component param1, int param2, int param3) {
        try {
          et var4 = null;
          Throwable var4_ref = null;
          et var5 = null;
          et stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          et stackIn_21_0 = null;
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
              var5 = new et();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_o) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((du) ((Object) stackIn_10_0)).field_p = new int[stackIn_10_1 * stackIn_11_2];
              ((du) ((Object) var4)).field_a = param3;
              ((du) ((Object) var4)).a(param1);
              ((du) ((Object) var4)).field_s = (param3 & -1024) + 1024;
              if (((du) ((Object) var4)).field_s > 16384) {
                ((du) ((Object) var4)).field_s = 16384;
              }
              ((du) ((Object) var4)).a(((du) ((Object) var4)).field_s);
              if (field_m > 0 &&
                field_i == null) {
                field_i = new pp();
                field_i.field_g = param0;
                param0.a(true, (Runnable) ((Object) field_i), field_m);
              }
              if (field_i != null) {
                if (field_i.field_c[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_i.field_c[param2] = (du) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (du) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new du();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(hj param0) {
        param0.field_n = false;
        if (param0.field_l != null) {
          param0.field_l.field_k = 0;
        }
        hj var1 = param0.a();
        while (var1 != null) {
          du.b(var1);
          var1 = param0.c();
        }
    }

    void c() throws Exception {
    }

    int a() throws Exception {
        return this.field_s;
    }

    final synchronized void a(hj param0) {
        this.field_l = param0;
    }

    final synchronized void e() {
        int var2 = 0;
        int var1;
        if (field_i != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_i.field_c[var2] == this) {
              field_i.field_c[var2] = null;
            }
            if (field_i.field_c[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_i.field_a = true;
            while (field_i.field_b) {
              tg.a(50L, (byte) 112);
            }
            field_i = null;
          }
        }
        this.g();
        this.field_p = null;
        this.field_f = true;
    }

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        hj[] var8;
        int var9;
        Object var10;
        hj var11;
        rr var12;
        int var13;
        hj var14;
        int var15_int;
        hj var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        hj var14Lifetime1;
        hj var14Lifetime2;
        var3 = param1;
        if (field_o) {
          var3 = var3 << 1;
        }
        la.a(param0, 0, var3);
        this.field_c = this.field_c - param1;
        if (this.field_l != null &&
          this.field_c <= 0) {
          this.field_c = this.field_c + (field_k >> 4);
          du.b(this.field_l);
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
                  var11 = this.field_t[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_l;
                    if (var12 != null &&
                      var12.field_k > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_m;
                      continue;
                    }
                    var11.field_n = true;
                    var13 = var11.d();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_k = var12.field_k + var13;
                    }
                    if (var4 >= this.field_g) {
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
                    var15 = var11.field_m;
                    var11.field_m = null;
                    if (var10 != null) {
                      ((hj) (var10)).field_m = var15;
                    } else {
                      this.field_t[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_b[var7_int] = (hj) (var10);
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
            this.field_b[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((hj) (var7)).field_m;
              ((hj) (var7)).field_m = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_l != null) {
          this.field_l.b(param0, 0, param1);
        }
        this.field_u = wq.a(-54);
    }

    private final void b(int param0) {
        this.field_c = this.field_c - param0;
        if (this.field_c < 0) {
          this.field_c = 0;
        }
        if (this.field_l != null) {
          this.field_l.a(param0);
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_k = param0;
        field_o = param1 ? true : false;
        field_m = param2;
    }

    void f() throws Exception {
    }

    final synchronized void b() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_f) {
            return;
          }
          var1 = wq.a(-124);
          try {
            if (var1 > this.field_u + 6000L) {
              this.field_u = var1 - 6000L;
            }
            while (var1 > this.field_u + 5000L) {
              this.b(256);
              this.field_u = this.field_u + (long)(256000 / field_k);
              var1 = wq.a(-119);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_u = var1;
          }
          if (this.field_p == null) {
            return;
          }
          try {
            if (this.field_j != 0L) {
              if (var1 < this.field_j) {
                return;
              }
              this.a(this.field_s);
              this.field_j = 0L;
              this.field_e = true;
            }
            var3_int = this.a();
            if (this.field_q - var3_int > this.field_n) {
              this.field_n = this.field_q - var3_int;
            }
            var4 = this.field_a + this.field_r;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_s) {
              this.field_s = this.field_s + 1024;
              if (this.field_s > 16384) {
                this.field_s = 16384;
              }
              this.g();
              this.a(this.field_s);
              var3_int = 0;
              this.field_e = true;
              if (var4 + 256 > this.field_s) {
                var4 = this.field_s - 256;
                this.field_r = var4 - this.field_a;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_p, 256);
              this.c();
              var3_int += 256;
            }
            if (var1 > this.field_d) {
              if (this.field_e) {
                this.field_e = false;
              } else {
                if (this.field_n == 0 &&
                  this.field_h == 0) {
                  this.g();
                  this.field_j = var1 + 2000L;
                  return;
                }
                this.field_r = Math.min(this.field_h, this.field_n);
                this.field_h = this.field_n;
              }
              this.field_n = 0;
              this.field_d = var1 + 2000L;
            }
            this.field_q = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.g();
            this.field_j = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(hj param0, int param1) {
        int var3 = param1 >> 5;
        hj var4 = this.field_b[var3];
        if (var4 == null) {
          this.field_t[var3] = param0;
        } else {
          var4.field_m = param0;
        }
        this.field_b[var3] = param0;
        param0.field_k = param1;
    }

    void a(java.awt.Component param0) throws Exception {
    }

    void a(int param0) throws Exception {
    }

    public static void h() {
        field_i = null;
    }

    void g() {
    }

    du() {
        this.field_f = false;
        this.field_g = 32;
        this.field_u = wq.a(-12);
        this.field_e = true;
        this.field_t = new hj[8];
        this.field_h = 0;
        this.field_b = new hj[8];
        this.field_c = 0;
        this.field_n = 0;
        this.field_d = 0L;
        this.field_q = 0;
        this.field_j = 0L;
    }
}
