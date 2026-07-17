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
        field_B = null;
        field_D = null;
    }

    private final void h() {
        ((kf) this).field_C = new t[]{this.b(((kf) this).field_J, ((kf) this).field_I, (byte) 49), this.b(((kf) this).field_y, ((kf) this).field_z, (byte) 49)};
        ((kf) this).field_E = this.b(false);
        ((kf) this).field_H = ((kf) this).field_E.b();
        ((kf) this).field_G = new t(((kf) this).field_o >> 1, ((kf) this).field_o);
    }

    final static String a(String param0, char param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var12 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = -1 + var5;
              var8 = -94 / ((-7 - param3) / 41);
              if (var7 == 0) {
                break L1;
              } else {
                var9_int = 0;
                L2: while (true) {
                  var9_int = param0.indexOf('_', var9_int);
                  if (var9_int >= 0) {
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
              var11 = param0.indexOf('_', var10);
              if (var11 >= 0) {
                StringBuilder discarded$3 = var9.append(param0.substring(var10, var11));
                var10 = var11 - -1;
                StringBuilder discarded$4 = var9.append(param2);
                continue L3;
              } else {
                StringBuilder discarded$5 = var9.append(param0.substring(var10));
                stackOut_10_0 = var9.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("kf.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(95).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
        return stackIn_11_0;
    }

    private final t b(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        t var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Torquing.field_u;
        var14 = new t(((kf) this).field_A * 2, ((kf) this).field_o);
        tm.a((byte) -116, var14);
        var5 = ((kf) this).field_o >> 1;
        var6 = 0;
        L0: while (true) {
          if (((kf) this).field_o <= var6) {
            r.a(127);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((kf) this).field_A + -1) % (2 * ((kf) this).field_A);
              var8 = 16711935 & param0;
              var9 = 65280 & param0;
              var10 = var6 + -var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var11 * var8 | var11 * var9 & 16711680) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ph.b(var7, var6, ((kf) this).field_A, var12);
              ph.b(var7 + -(((kf) this).field_A * 2), var6, ((kf) this).field_A, var12);
              var8 = 16711935 & param1;
              var9 = 65280 & param1;
              if (256 <= var11) {
                stackOut_7_0 = var8 | var9;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ph.b(var7 - -((kf) this).field_A, var6, ((kf) this).field_A, var12);
            ph.b(var7 + -((kf) this).field_A, var6, ((kf) this).field_A, var12);
            var6++;
            continue L0;
          }
        }
    }

    kf(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, 8355711 & param6 >> 1);
    }

    final static void b() {
        RuntimeException var2 = null;
        int var3 = 0;
        cb var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var4 = (cb) (Object) ae.field_nb.b(0);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                pd.a(var4, true, 2);
                var4 = (cb) (Object) ae.field_nb.f(-24059);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "kf.F(" + 2 + 44 + -8190 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = -126 / ((66 - param0) / 57);
        super.a((byte) 125, param1, param2, param3, param4);
        int discarded$0 = -917474783;
        this.h();
    }

    private final t b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Torquing.field_u;
        int var2 = ((kf) this).field_o >> 1;
        t var3 = new t(var2, ((kf) this).field_o);
        tm.a((byte) 81, var3);
        for (var4 = 0; var4 < ((kf) this).field_o; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((kf) this).field_o - var4));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                ph.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        r.a(126);
        return var3;
    }

    final static String a(int param0) {
        String var1 = "";
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = param0 - -((kf) this).field_p;
              ld.a(var5_int + -((kf) this).field_E.field_s, param0 + ((kf) this).field_E.field_s, ((kf) this).field_o + param3, param3, (byte) -99);
              var6 = param0 + -((kf) this).field_x;
              if (param2 > 105) {
                break L1;
              } else {
                ((kf) this).field_C = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  r.a(124);
                  if (param0 + ((kf) this).field_E.field_s < ph.field_k) {
                    break L3;
                  } else {
                    tm.a((byte) -119, ((kf) this).field_G);
                    param1.d(-((kf) this).field_x, 0);
                    param1.d(-((kf) this).field_x + 2 * ((kf) this).field_A, 0);
                    ((kf) this).field_H.a(0, 0);
                    r.a(124);
                    ((kf) this).field_G.d(param0, param3);
                    break L3;
                  }
                }
                L4: {
                  if (var5_int + -((kf) this).field_E.field_s > ph.field_a) {
                    break L4;
                  } else {
                    tm.a((byte) 119, ((kf) this).field_G);
                    var7 = -((kf) this).field_E.field_s + ((kf) this).field_p - -((kf) this).field_x;
                    L5: while (true) {
                      if (var7 <= 2 * ((kf) this).field_A) {
                        param1.d(-var7, 0);
                        param1.d(2 * ((kf) this).field_A + -var7, 0);
                        ((kf) this).field_E.a(0, 0);
                        r.a(125);
                        ((kf) this).field_G.d(-((kf) this).field_E.field_s + var5_int, param3);
                        break L4;
                      } else {
                        var7 = var7 - 2 * ((kf) this).field_A;
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
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("kf.L(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void c(int param0, int param1, byte param2) {
        ((kf) this).field_y = 8355711 & param1 >> 1;
        ((kf) this).field_I = param0;
        if (param2 != 125) {
            ((kf) this).field_G = null;
        }
        ((kf) this).field_J = param1;
        ((kf) this).field_z = (param0 & 16711422) >> 1;
        int discarded$0 = -917474783;
        this.h();
    }

    final static void a() {
        Object var2 = null;
        uj.a((String) null, -32082, ol.field_a);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (param1 > -7) {
            ((kf) this).field_x = -1;
        }
        int var5 = ((kf) this).field_w + param3;
        int var6 = ((kf) this).field_k + param2;
        this.a(var5, ((kf) this).field_C[0], (byte) 125, var6);
        if (!(((kf) this).field_L >= 65536)) {
            ld.a(((kf) this).field_p + var5, var5 + (((kf) this).field_p * ((kf) this).field_L >> 16), ((kf) this).field_o + var6, var6, (byte) -98);
            this.a(var5, ((kf) this).field_C[1], (byte) 124, var6);
            r.a(125);
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5_int = -100 % ((param0 - -28) / 43);
              if (!((kf) this).field_M) {
                break L1;
              } else {
                ((kf) this).field_x = ((kf) this).field_x + 1;
                if (((kf) this).field_x <= 2 * ((kf) this).field_A) {
                  break L1;
                } else {
                  ((kf) this).field_x = ((kf) this).field_x - ((kf) this).field_A * 2;
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
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("kf.P(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private kf(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((kf) this).field_z = param8;
        ((kf) this).field_J = param5;
        ((kf) this).field_A = param4;
        ((kf) this).field_I = param6;
        ((kf) this).field_y = param7;
        ((kf) this).a((byte) -122, param0, param1, param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Player";
        field_D = "Unpacking levels";
    }
}
