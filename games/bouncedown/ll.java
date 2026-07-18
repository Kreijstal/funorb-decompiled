/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lk {
    private int field_x;
    private int field_w;
    private tg[] field_z;
    private tg field_I;
    static String field_J;
    static String field_D;
    private int field_K;
    private tg field_M;
    boolean field_C;
    static int field_y;
    private int field_L;
    static String[] field_E;
    static String[] field_A;
    int field_F;
    private int field_H;
    private int field_G;
    private tg field_B;

    final static void a(int param0, boolean param1, int param2) {
        ck.field_c = param0;
        sj.field_d = param2;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        int discarded$0 = 1;
        this.a();
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
            return;
        }
        if (param2 <= 33) {
            field_J = null;
        }
        int var5 = ((ll) this).field_r + param3;
        int var6 = ((ll) this).field_i + param1;
        this.a(((ll) this).field_z[0], var5, (byte) -23, var6);
        if (((ll) this).field_F < 65536) {
            ai.a(((ll) this).field_k + var5, ((ll) this).field_m + var6, var6, (((ll) this).field_k * ((ll) this).field_F >> 16) + var5, -19852);
            this.a(((ll) this).field_z[1], var5, (byte) -108, var6);
            ve.a(-121);
        }
    }

    private final tg b(int param0, int param1, int param2) {
        tg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Bounce.field_N;
        var4 = new tg(2 * ((ll) this).field_K, ((ll) this).field_m);
        int discarded$1 = 1;
        kh.a(var4);
        var5 = ((ll) this).field_m >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ll) this).field_m) {
            ve.a(-124);
            return var4;
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((ll) this).field_K - 1) % (((ll) this).field_K * 2);
              var8 = param0 & 16711935;
              var9 = 65280 & param0;
              var10 = var6 - var5;
              var11 = (int)(Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5 * 128.0) + 128;
              if (256 > var11) {
                stackOut_4_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 8;
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
              na.a(var7, var6, ((ll) this).field_K, var12);
              var9 = 65280 & param2;
              var8 = 16711935 & param2;
              na.a(var7 + -(((ll) this).field_K * 2), var6, ((ll) this).field_K, var12);
              if (var11 >= 256) {
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
            na.a(((ll) this).field_K + var7, var6, ((ll) this).field_K, var12);
            na.a(var7 - ((ll) this).field_K, var6, ((ll) this).field_K, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                tg discarded$3 = this.d((byte) -57);
                break L1;
              }
            }
            L2: {
              if (((ll) this).field_C) {
                ((ll) this).field_w = ((ll) this).field_w + 1;
                if (((ll) this).field_w > 2 * ((ll) this).field_K) {
                  ((ll) this).field_w = ((ll) this).field_w - 2 * ((ll) this).field_K;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ll.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (1 != param1) {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = param2 * var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                L2: {
                  if ((1 & param1) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param2;
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "ll.B(" + -15083 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    private final void a() {
        ((ll) this).field_z = new tg[]{this.b(((ll) this).field_G, -30578, ((ll) this).field_H), this.b(((ll) this).field_L, -30578, ((ll) this).field_x)};
        ((ll) this).field_M = this.d((byte) -21);
        ((ll) this).field_I = ((ll) this).field_M.a();
        ((ll) this).field_B = new tg(((ll) this).field_m >> 1, ((ll) this).field_m);
    }

    private final void a(tg param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            var5_int = ((ll) this).field_k + param1;
            ai.a(var5_int + -((ll) this).field_M.field_s, ((ll) this).field_m + param3, param3, ((ll) this).field_M.field_s + param1, -19852);
            var6 = param1 + -((ll) this).field_w;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  ve.a(-125);
                  if (na.field_g <= param1 - -((ll) this).field_M.field_s) {
                    int discarded$2 = 1;
                    kh.a(((ll) this).field_B);
                    param0.a(-((ll) this).field_w, 0);
                    param0.a(-((ll) this).field_w + 2 * ((ll) this).field_K, 0);
                    ((ll) this).field_I.e(0, 0);
                    ve.a(-119);
                    ((ll) this).field_B.a(param1, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (na.field_b >= var5_int - ((ll) this).field_M.field_s) {
                    int discarded$3 = 1;
                    kh.a(((ll) this).field_B);
                    var7 = ((ll) this).field_k + -((ll) this).field_M.field_s + ((ll) this).field_w;
                    L4: while (true) {
                      if (var7 <= 2 * ((ll) this).field_K) {
                        param0.a(-var7, 0);
                        param0.a(2 * ((ll) this).field_K - var7, 0);
                        ((ll) this).field_M.e(0, 0);
                        ve.a(-120);
                        ((ll) this).field_B.a(var5_int - ((ll) this).field_M.field_s, param3);
                        break L3;
                      } else {
                        var7 = var7 - ((ll) this).field_K * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var7 = 18 % ((-66 - param2) / 41);
                break L0;
              } else {
                param0.a(var6, param3);
                var6 = var6 + param0.field_s;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ll.G(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 >= -35) {
            ll.e((byte) 2);
        }
        field_A = null;
        field_J = null;
        field_D = null;
        field_E = null;
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, param6 >> 1 & 8355711);
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 <= 125) {
            return;
        }
        ((ll) this).field_x = (param0 & 16711422) >> 1;
        ((ll) this).field_G = param2;
        ((ll) this).field_L = (param2 & 16711422) >> 1;
        ((ll) this).field_H = param0;
        int discarded$0 = 1;
        this.a();
    }

    private final tg d(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Bounce.field_N;
        int var2 = ((ll) this).field_m >> 1;
        tg var3 = new tg(var2, ((ll) this).field_m);
        int discarded$0 = 1;
        kh.a(var3);
        for (var4 = 0; var4 < ((ll) this).field_m; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((ll) this).field_m) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                na.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
            }
        }
        if (param0 != -21) {
            ((ll) this).field_H = 121;
        }
        ve.a(param0 ^ 107);
        return var3;
    }

    private ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ll) this).field_H = param6;
        ((ll) this).field_x = param8;
        ((ll) this).field_K = param4;
        ((ll) this).field_G = param5;
        ((ll) this).field_L = param7;
        ((ll) this).b(param3, 80, param2, param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please send me news and updates (I can unsubscribe at any time)";
        field_J = "This password contains your Player Name, and would be easy to guess";
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_y = 0;
    }
}
