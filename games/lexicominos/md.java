/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends w {
    private int field_x;
    static db[] field_A;
    private int field_E;
    private int field_y;
    int field_K;
    private db field_z;
    private db[] field_F;
    static String field_L;
    private int field_C;
    static String field_B;
    private db field_D;
    private int field_M;
    private int field_I;
    boolean field_G;
    private db field_H;

    private final db a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Lexicominos.field_L ? 1 : 0;
        db var14 = new db(this.field_I * 2, this.field_v);
        de.a(var14, 6);
        int var5 = this.field_v >> 344066273;
        if (param2 > -38) {
            return (db) null;
        }
        for (var6 = 0; this.field_v > var6; var6++) {
            var7 = (var6 >> 561276993) * (2 * this.field_I - 1) % (2 * this.field_I);
            var8 = 16711935 & param1;
            var9 = param1 & 65280;
            var10 = -var5 + var6;
            var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
            var12 = var11 < 256 ? (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -1584727736 : var8 | var9;
            lf.a(var7, var6, this.field_I, var12);
            lf.a(var7 - this.field_I * 2, var6, this.field_I, var12);
            var9 = param0 & 65280;
            var8 = param0 & 16711935;
            var12 = (var11 ^ -1) <= -257 ? var9 | var8 : (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> -1867272600;
            lf.a(this.field_I + var7, var6, this.field_I, var12);
            lf.a(-this.field_I + var7, var6, this.field_I, var12);
        }
        pd.a(-22949);
        return var14;
    }

    final void b(int param0, int param1, int param2) {
        this.field_E = param0;
        this.field_C = (16711422 & param0) >> -2039515423;
        this.field_M = (16711422 & param1) >> -959690047;
        if (param2 <= 68) {
            this.field_H = (db) null;
        }
        this.field_x = param1;
        this.f(-90);
    }

    md(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -363799263 & 8355711, param6 >> 796309793 & 8355711);
    }

    private final db d(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Lexicominos.field_L ? 1 : 0;
        int var2 = this.field_v >> 1875780257;
        db var3 = new db(var2, this.field_v);
        de.a(var3, 6);
        for (var4 = 0; var4 < this.field_v; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((this.field_v + -var4) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                lf.a(var5, var4, var8 << 1252259600 | (var8 << -1444140344 | var8));
            }
        }
        pd.a(-22949);
        if (param0) {
            w var10 = (w) null;
            this.a((byte) 4, (w) null, -98, 94);
        }
        return var3;
    }

    public static void e(int param0) {
        if (param0 != 344066273) {
            String var2 = (String) null;
            md.a((String) null, 98);
        }
        field_L = null;
        field_B = null;
        field_A = null;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_G) {
                break L1;
              } else {
                this.field_y = this.field_y + 1;
                if (this.field_y > 2 * this.field_I) {
                  this.field_y = this.field_y - 2 * this.field_I;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -119) {
                break L2;
              } else {
                this.b(94, -94, -98);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("md.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -86) {
                break L1;
              } else {
                md.e(-86);
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackIn_3_0 = cb.field_t.equals(ck.a(var3, (byte) -48));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("md.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var5 = this.field_t + param2;
        int var6 = param1 + this.field_o;
        this.a(this.field_F[0], var6, 16711935, var5);
        if (this.field_K < 65536) {
            ca.a(var5 + this.field_j, var6, var5 - -(this.field_K * this.field_j >> 2069378928), var6 + this.field_v, false);
            this.a(this.field_F[1], var6, param0 + 16712050, var5);
            pd.a(param0 ^ 22998);
        }
        if (param0 != -115) {
            this.b(-108, -108, -95);
        }
    }

    private final void f(int param0) {
        db discarded$0 = null;
        this.field_F = new db[]{this.a(this.field_E, this.field_x, (byte) -50), this.a(this.field_C, this.field_M, (byte) -98)};
        if (param0 >= -59) {
            discarded$0 = this.d(false);
        }
        this.field_H = this.d(false);
        this.field_z = this.field_H.g();
        this.field_D = new db(this.field_v >> 953499905, this.field_v);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(-72);
    }

    private final void a(db param0, int param1, int param2, int param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param3 + this.field_j;
            ca.a(-this.field_H.field_p + var5_int, param1, this.field_H.field_p + param3, this.field_v + param1, false);
            var6 = -this.field_y + param3;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  pd.a(-22949);
                  if (lf.field_g <= param3 + this.field_H.field_p) {
                    de.a(this.field_D, param2 + -16711929);
                    param0.d(-this.field_y, 0);
                    param0.d(-this.field_y + 2 * this.field_I, 0);
                    this.field_z.e(0, 0);
                    pd.a(-22949);
                    this.field_D.d(param3, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (lf.field_e >= var5_int - this.field_H.field_p) {
                    de.a(this.field_D, 6);
                    var7 = this.field_j + -this.field_H.field_p + this.field_y;
                    L4: while (true) {
                      if (2 * this.field_I >= var7) {
                        param0.d(-var7, 0);
                        param0.d(2 * this.field_I - var7, 0);
                        this.field_H.e(0, 0);
                        pd.a(-22949);
                        this.field_D.d(var5_int + -this.field_H.field_p, param1);
                        break L3;
                      } else {
                        var7 = var7 - 2 * this.field_I;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (param2 == 16711935) {
                    break L5;
                  } else {
                    this.field_K = -126;
                    break L5;
                  }
                }
                break L0;
              } else {
                param0.d(var6, param1);
                var6 = var6 + param0.field_p;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("md.F(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private md(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_x = param5;
        this.field_E = param6;
        this.field_C = param8;
        this.field_I = param4;
        this.field_M = param7;
        this.a(param3, param2, true, param1, param0);
    }

    static {
        field_B = "Reload game";
        field_L = "LONGER";
    }
}
