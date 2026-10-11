/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ap {
    int[] field_d;
    static boolean field_h;
    private boolean field_i;
    static int field_j;
    private int field_c;
    private long field_m;
    private tn field_k;
    private static int field_t;
    private static jg field_f;
    private int field_r;
    private int field_l;
    private boolean field_n;
    private int field_e;
    private tn[] field_o;
    private int field_a;
    private long field_p;
    private int field_g;
    private int field_u;
    private long field_q;
    private tn[] field_s;
    private int field_b;

    private final void a(int[] param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        Object var7;
        int var8_int;
        tn[] var8;
        int var9;
        Object var10;
        tn var11;
        pq var12;
        int var13;
        tn var14;
        int var15_int;
        tn var15;
        int var6Lifetime1;
        int var9Lifetime1;
        Object var10Lifetime1;
        tn var14Lifetime1;
        tn var14Lifetime2;
        var3 = param1;
        if (field_h) {
          var3 = var3 << 1;
        }
        ps.a(param0, 0, var3);
        this.field_a = this.field_a - param1;
        if (this.field_k != null &&
          this.field_a <= 0) {
          this.field_a = this.field_a + (field_j >> 4);
          ap.b(this.field_k);
          this.a(this.field_k, this.field_k.c());
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
                  var11 = this.field_o[var7_int];
                  var14 = var11;
                  var14Lifetime1 = var11;
                  while (var11 != null) {
                    var12 = var11.field_k;
                    if (var12 != null &&
                      var12.field_h > var8_int) {
                      var5 = var5 | 1 << var7_int;
                      var10 = var11;
                      var11 = var11.field_h;
                      continue;
                    }
                    var11.field_j = true;
                    var13 = var11.a();
                    var4 = var4 + var13;
                    if (var12 != null) {
                      var12.field_h = var12.field_h + var13;
                    }
                    if (var4 >= this.field_c) {
                      break L3;
                    }
                    var14Lifetime2 = var11.b();
                    if (var14Lifetime2 != null) {
                      var15_int = var11.field_i;
                      while (var14Lifetime2 != null) {
                        this.a(var14Lifetime2, var15_int * var14Lifetime2.c() >> 8);
                        var14Lifetime2 = var11.d();
                      }
                    }
                    var15 = var11.field_h;
                    var11.field_h = null;
                    if (var10 != null) {
                      ((tn) (var10)).field_h = var15;
                    } else {
                      this.field_o[var7_int] = var15;
                    }
                    if (var15 == null) {
                      this.field_s[var7_int] = (tn) (var10);
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
            var7 = this.field_o[var6Lifetime1];
            var8 = this.field_o;
            var9Lifetime1 = var6Lifetime1;
            this.field_s[var6Lifetime1] = null;
            var8[var9Lifetime1] = null;
            while (var7 != null) {
              var10Lifetime1 = ((tn) (var7)).field_h;
              ((tn) (var7)).field_h = null;
              var7 = var10Lifetime1;
            }
          }
        }
        if (this.field_a < 0) {
          this.field_a = 0;
        }
        if (this.field_k != null) {
          this.field_k.b(param0, 0, param1);
        }
        this.field_m = pr.a(14274);
    }

    private final void b(int param0) {
        this.field_a = this.field_a - param0;
        if (this.field_a < 0) {
          this.field_a = 0;
        }
        if (this.field_k != null) {
          this.field_k.a(param0);
          return;
        }
    }

    private final void a(tn param0, int param1) {
        int var3 = param1 >> 5;
        tn var4 = this.field_s[var3];
        if (var4 == null) {
          this.field_o[var3] = param0;
        } else {
          var4.field_h = param0;
        }
        this.field_s[var3] = param0;
        param0.field_i = param1;
    }

    final synchronized void e() {
        try {
          Throwable decompiledCaughtException = null;
          long var1 = 0L;
          Exception var3 = null;
          int var3_int = 0;
          int var4 = 0;
          if (this.field_i) {
            return;
          }
          var1 = pr.a(14274);
          try {
            if (var1 > this.field_m + 6000L) {
              this.field_m = var1 - 6000L;
            }
            while (var1 > this.field_m + 5000L) {
              this.b(256);
              this.field_m = this.field_m + (long)(256000 / field_j);
              var1 = pr.a(14274);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_m = var1;
          }
          if (this.field_d == null) {
            return;
          }
          try {
            if (this.field_p != 0L) {
              if (var1 < this.field_p) {
                return;
              }
              this.a(this.field_g);
              this.field_p = 0L;
              this.field_n = true;
            }
            var3_int = this.a();
            if (this.field_r - var3_int > this.field_l) {
              this.field_l = this.field_r - var3_int;
            }
            var4 = this.field_b + this.field_u;
            if (var4 + 256 > 16384) {
              var4 = 16128;
            }
            if (var4 + 256 > this.field_g) {
              this.field_g = this.field_g + 1024;
              if (this.field_g > 16384) {
                this.field_g = 16384;
              }
              this.d();
              this.a(this.field_g);
              var3_int = 0;
              this.field_n = true;
              if (var4 + 256 > this.field_g) {
                var4 = this.field_g - 256;
                this.field_u = var4 - this.field_b;
              }
            }
            while (var3_int < var4) {
              this.a(this.field_d, 256);
              this.b();
              var3_int += 256;
            }
            if (var1 > this.field_q) {
              if (this.field_n) {
                this.field_n = false;
              } else {
                if (this.field_l == 0 &&
                  this.field_e == 0) {
                  this.d();
                  this.field_p = var1 + 2000L;
                  return;
                }
                this.field_u = Math.min(this.field_e, this.field_l);
                this.field_e = this.field_l;
              }
              this.field_l = 0;
              this.field_q = var1 + 2000L;
            }
            this.field_r = var3_int;
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = (Exception) (Object) decompiledCaughtException;
            this.d();
            this.field_p = var1 + 2000L;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(java.awt.Component param0) throws Exception {
    }

    final synchronized void a(tn param0) {
        this.field_k = param0;
    }

    final static ap a(qb param0, java.awt.Component param1, int param2, int param3) {
        try {
          oc var4 = null;
          Throwable var4_ref = null;
          oc var5 = null;
          oc stackIn_10_0 = null;
          int stackIn_10_1 = 0;
          int stackIn_11_2 = 0;
          oc stackIn_21_0 = null;
          Throwable decompiledCaughtException = null;
          if (field_j == 0) {
            throw new IllegalStateException();
          }
          if (param2 >= 0 &&
            param2 < 2) {
            if (param3 < 256) {
              param3 = 256;
            }
            try {
              var5 = new oc();
              var4 = var5;
              stackIn_10_0 = var4;
              stackIn_10_1 = 256;
              if (!field_h) {
                stackIn_11_2 = 1;
              } else {
                stackIn_11_2 = 2;
              }
              ((ap) ((Object) stackIn_10_0)).field_d = new int[stackIn_10_1 * stackIn_11_2];
              ((ap) ((Object) var4)).field_b = param3;
              ((ap) ((Object) var4)).a(param1);
              ((ap) ((Object) var4)).field_g = (param3 & -1024) + 1024;
              if (((ap) ((Object) var4)).field_g > 16384) {
                ((ap) ((Object) var4)).field_g = 16384;
              }
              ((ap) ((Object) var4)).a(((ap) ((Object) var4)).field_g);
              if (field_t > 0 &&
                field_f == null) {
                field_f = new jg();
                field_f.field_c = param0;
                param0.a(true, field_t, (Runnable) ((Object) field_f));
              }
              if (field_f != null) {
                if (field_f.field_d[param2] != null) {
                  throw new IllegalArgumentException();
                }
                field_f.field_d[param2] = (ap) ((Object) var5);
              }
              stackIn_21_0 = var4;
              return (ap) ((Object) stackIn_21_0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              return new ap();
            }
          }
          throw new IllegalArgumentException();
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    int a() throws Exception {
        return this.field_g;
    }

    final synchronized void c() {
        int var2 = 0;
        int var1;
        if (field_f != null) {
          var1 = 1;
          for (var2 = 0; var2 < 2; var2++) {
            if (field_f.field_d[var2] == this) {
              field_f.field_d[var2] = null;
            }
            if (field_f.field_d[var2] != null) {
              var1 = 0;
            }
          }
          if (var1 != 0) {
            field_f.field_b = true;
            while (field_f.field_a) {
              jb.a((byte) -100, 50L);
            }
            field_f = null;
          }
        }
        this.d();
        this.field_d = null;
        this.field_i = true;
    }

    private final static void b(tn param0) {
        param0.field_j = false;
        if (param0.field_k != null) {
          param0.field_k.field_h = 0;
        }
        tn var1 = param0.b();
        while (var1 != null) {
          ap.b(var1);
          var1 = param0.d();
        }
    }

    void d() {
    }

    public static void f() {
        field_f = null;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param0 < 8000 ||
          param0 > 48000) {
          throw new IllegalArgumentException();
        }
        field_j = param0;
        field_h = param1 ? true : false;
        field_t = param2;
    }

    void a(int param0) throws Exception {
    }

    void b() throws Exception {
    }

    ap() {
        this.field_i = false;
        this.field_c = 32;
        this.field_m = pr.a(14274);
        this.field_r = 0;
        this.field_a = 0;
        this.field_l = 0;
        this.field_o = new tn[8];
        this.field_p = 0L;
        this.field_e = 0;
        this.field_n = true;
        this.field_s = new tn[8];
        this.field_q = 0L;
    }
}
