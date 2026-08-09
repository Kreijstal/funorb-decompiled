/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends gm {
    private int field_y;
    int field_L;
    static String field_B;
    private int field_x;
    static String field_D;
    private int field_I;
    private int field_J;
    private int field_A;
    private t field_G;
    static int field_F;
    boolean field_M;
    private t field_H;
    private t field_E;
    private int field_z;
    private t[] field_C;

    public static void a(boolean param0) {
        if (param0) {
            kf.a(-16);
        }
        field_B = null;
        field_D = null;
    }

    private final void h(int param0) {
        this.field_C = new t[]{this.b(this.field_J, this.field_I, (byte) 49), this.b(this.field_y, this.field_z, (byte) 49)};
        this.field_E = this.b(false);
        if (param0 != -917474783) {
            kf.a(84);
        }
        this.field_H = this.field_E.b();
        this.field_G = new t(this.field_o >> -917474783, this.field_o);
    }

    final static String a(String param0, char param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var12 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        var12 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = -1 + var5;
              var8 = -94 / ((-7 - param3) / 41);
              if (-1 == (var7 ^ -1)) {
                break L1;
              } else {
                var9_int = 0;
                L2: while (true) {
                  var9_int = param0.indexOf((int) param1, var9_int);
                  if ((var9_int ^ -1) <= -1) {
                    var6 = var6 + var7;
                    var9_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var9 = new StringBuilder(var6);
            var10 = 0;
            L3: while (true) {
              var11 = param0.indexOf((int) param1, var10);
              if (var11 >= 0) {
                discarded$0 = var9.append(param0.substring(var10, var11));
                var10 = var11 - -1;
                discarded$1 = var9.append(param2);
                continue L3;
              } else {
                discarded$2 = var9.append(param0.substring(var10));
                stackIn_11_0 = var9.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("kf.G(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    private final t b(int param0, int param1, byte param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        t var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        var13 = Torquing.field_u;
        var14 = new t(this.field_A * 2, this.field_o);
        tm.a((byte) -116, var14);
        var5 = this.field_o >> 473048801;
        var6 = 0;
        L0: while (true) {
          if (this.field_o <= var6) {
            L1: {
              if (param2 == 49) {
                break L1;
              } else {
                this.c(-42, -27, (byte) -8);
                break L1;
              }
            }
            r.a(127);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -518965119) * (2 * this.field_A + -1) % (2 * this.field_A);
              var8 = 16711935 & param0;
              var9 = 65280 & param0;
              var10 = var6 + -var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (-257 < (var11 ^ -1)) {
                stackIn_7_0 = (-16711936 & var11 * var8 | var11 * var9 & 16711680) >>> 289302376;
                break L2;
              } else {
                stackIn_7_0 = var9 | var8;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              ph.b(var7, var6, this.field_A, var12);
              ph.b(var7 + -(this.field_A * 2), var6, this.field_A, var12);
              var8 = 16711935 & param1;
              var9 = 65280 & param1;
              if (256 <= var11) {
                stackIn_10_0 = var8 | var9;
                break L3;
              } else {
                stackIn_10_0 = (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> 1966065800;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            ph.b(var7 - -this.field_A, var6, this.field_A, var12);
            ph.b(var7 + -this.field_A, var6, this.field_A, var12);
            var6++;
            continue L0;
          }
        }
    }

    kf(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1226686721, 8355711 & param6 >> 307511521);
    }

    final static void b(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        cb var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var5 = (cb) ((Object) ae.field_nb.b(0));
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  if (param1 == -8190) {
                    break L2;
                  } else {
                    var4 = (String) null;
                    kf.a((String) null, 'ￕ', (String) null, 48);
                    break L2;
                  }
                }
                break L0;
              } else {
                pd.a(var5, true, param0);
                var5 = (cb) ((Object) ae.field_nb.f(-24059));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "kf.F(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = -126 / ((66 - param0) / 57);
        super.a((byte) 125, param1, param2, param3, param4);
        this.h(-917474783);
    }

    private final t b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Torquing.field_u;
        int var2 = this.field_o >> -790994879;
        t var3 = new t(var2, this.field_o);
        tm.a((byte) 81, var3);
        for (var4 = 0; var4 < this.field_o; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_o - var4));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                ph.a(var5, var4, var8 << 104853520 | (var8 | var8 << 1881861320));
            }
        }
        if (param0) {
            this.a(74, (byte) 84, -119, 72);
        }
        r.a(126);
        return var3;
    }

    final static String a(int param0) {
        String var1 = "";
        if (param0 != 17241) {
            field_D = (String) null;
        }
        if (!(un.field_k == null)) {
            var1 = un.field_k.i(-116);
        }
        if (!(0 != var1.length())) {
            var1 = jg.a(true);
        }
        if (!(var1.length() != 0)) {
            var1 = field_B;
        }
        return var1;
    }

    private final void a(int param0, t param1, byte param2, int param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = param0 - -this.field_p;
              ld.a(var5_int + -this.field_E.field_s, param0 + this.field_E.field_s, this.field_o + param3, param3, (byte) -99);
              var6 = param0 + -this.field_x;
              if (param2 > 105) {
                break L1;
              } else {
                this.field_C = (t[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  r.a(124);
                  if (param0 + this.field_E.field_s < ph.field_k) {
                    break L3;
                  } else {
                    tm.a((byte) -119, this.field_G);
                    param1.d(-this.field_x, 0);
                    param1.d(-this.field_x + 2 * this.field_A, 0);
                    this.field_H.a(0, 0);
                    r.a(124);
                    this.field_G.d(param0, param3);
                    break L3;
                  }
                }
                L4: {
                  if (var5_int + -this.field_E.field_s > ph.field_a) {
                    break L4;
                  } else {
                    tm.a((byte) 119, this.field_G);
                    var7 = -this.field_E.field_s + this.field_p - -this.field_x;
                    L5: while (true) {
                      if (var7 <= 2 * this.field_A) {
                        param1.d(-var7, 0);
                        param1.d(2 * this.field_A + -var7, 0);
                        this.field_E.a(0, 0);
                        r.a(125);
                        this.field_G.d(-this.field_E.field_s + var5_int, param3);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_A;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param1.d(var6, param3);
                var6 = var6 + param1.field_s;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("kf.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0, int param1, byte param2) {
        this.field_y = 8355711 & param1 >> -1878423999;
        this.field_I = param0;
        if (param2 != 125) {
            this.field_G = (t) null;
        }
        this.field_J = param1;
        this.field_z = (param0 & 16711422) >> 2117678241;
        this.h(-917474783);
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        uj.a((String) null, -32082, ol.field_a);
        if (param0 >= -45) {
            field_D = (String) null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (param1 > -7) {
            this.field_x = -1;
        }
        int var5 = this.field_w + param3;
        int var6 = this.field_k + param2;
        this.a(var5, this.field_C[0], (byte) 125, var6);
        if (!(-65537 >= (this.field_L ^ -1))) {
            ld.a(this.field_p + var5, var5 + (this.field_p * this.field_L >> 151945840), this.field_o + var6, var6, (byte) -98);
            this.a(var5, this.field_C[1], (byte) 124, var6);
            r.a(125);
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = -100 % ((param0 - -28) / 43);
              if (!this.field_M) {
                break L1;
              } else {
                this.field_x = this.field_x + 1;
                if (this.field_x <= 2 * this.field_A) {
                  break L1;
                } else {
                  this.field_x = this.field_x - this.field_A * 2;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("kf.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private kf(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_z = param8;
        this.field_J = param5;
        this.field_A = param4;
        this.field_I = param6;
        this.field_y = param7;
        this.a((byte) -122, param0, param1, param3, param2);
    }

    static {
        field_B = "Player";
        field_D = "Unpacking levels";
    }
}
