/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends cf {
    static String field_I;
    int field_B;
    private int field_N;
    private int field_D;
    private int field_J;
    private int field_H;
    private ja field_C;
    private int field_K;
    private int field_E;
    private ja field_O;
    boolean field_L;
    static String[] field_P;
    static String field_G;
    private ja field_M;
    private ja[] field_F;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 0) {
          var2 = 81;
          if (0 <= param0) {
            if (param0 < 32768) {
              L0: {
                if (param0 >= 128) {
                  if (param0 < 2048) {
                    if (param0 < 512) {
                      var3 = 4;
                      break L0;
                    } else {
                      var3 = 3;
                      break L0;
                    }
                  } else {
                    if (8192 <= param0) {
                      var3 = 1;
                      break L0;
                    } else {
                      var3 = 2;
                      break L0;
                    }
                  }
                } else {
                  if (param0 < 8) {
                    if (param0 < 2) {
                      return 256;
                    } else {
                      var3 = 7;
                      break L0;
                    }
                  } else {
                    if (param0 >= 32) {
                      var3 = 5;
                      break L0;
                    } else {
                      var3 = 6;
                      break L0;
                    }
                  }
                }
              }
              param0 = param0 << (var3 << 1);
              return pk.field_a[-32768 + param0] >> var3;
            } else {
              if (param0 >= 131072) {
                L1: {
                  if (param0 < 33554432) {
                    if (param0 >= 2097152) {
                      if (param0 < 8388608) {
                        var3 = 3;
                        break L1;
                      } else {
                        var3 = 4;
                        break L1;
                      }
                    } else {
                      if (param0 >= 524288) {
                        var3 = 2;
                        break L1;
                      } else {
                        var3 = 1;
                        break L1;
                      }
                    }
                  } else {
                    if (param0 < 536870912) {
                      if (param0 < 134217728) {
                        var3 = 5;
                        break L1;
                      } else {
                        var3 = 6;
                        break L1;
                      }
                    } else {
                      var3 = 7;
                      break L1;
                    }
                  }
                }
                param0 = param0 >> (var3 << 1);
                return pk.field_a[-32768 + param0] << var3;
              } else {
                return pk.field_a[param0 + -32768];
              }
            }
          } else {
            throw new IllegalArgumentException("");
          }
        } else {
          return 0;
        }
    }

    final static boolean b() {
        return (1 & pb.field_d) != 0;
    }

    private final ja b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ja var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var14 = new ja(2 * ((le) this).field_D, ((le) this).field_w);
        r.a(0, var14);
        var5 = ((le) this).field_w >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((le) this).field_w) {
            int discarded$1 = 1;
            ql.a();
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((le) this).field_D - 1) % (2 * ((le) this).field_D);
              var8 = 16711935 & param2;
              var9 = param2 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              if (256 <= var11) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              oo.b(var7, var6, ((le) this).field_D, var12);
              var8 = param1 & 16711935;
              var9 = 65280 & param1;
              oo.b(var7 + -(((le) this).field_D * 2), var6, ((le) this).field_D, var12);
              if (var11 < 256) {
                stackOut_7_0 = (var11 * var8 & -16711936 | var9 * var11 & 16711680) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            oo.b(var7 - -((le) this).field_D, var6, ((le) this).field_D, var12);
            oo.b(var7 - ((le) this).field_D, var6, ((le) this).field_D, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final ja g() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = ((le) this).field_w >> 1;
        ja var3 = new ja(var2, ((le) this).field_w);
        r.a(0, var3);
        for (var4 = 0; var4 < ((le) this).field_w; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((le) this).field_w + -var4));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                oo.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
            }
        }
        var5 = 0;
        int discarded$0 = 1;
        ql.a();
        return var3;
    }

    public static void a() {
        field_G = null;
        field_I = null;
        field_P = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        int discarded$0 = -506198655;
        this.f();
    }

    final void a(int param0, cf param1, int param2, int param3) {
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
              if (((le) this).field_L) {
                ((le) this).field_J = ((le) this).field_J + 1;
                if (((le) this).field_D * 2 < ((le) this).field_J) {
                  ((le) this).field_J = ((le) this).field_J - ((le) this).field_D * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -5407) {
                break L2;
              } else {
                ((le) this).b(-97, -4, 31, 91, 52);
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
            stackOut_8_1 = new StringBuilder().append("le.T(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == 0)) {
            return;
        }
        int var5 = ((le) this).field_y + param3;
        if (param0 != -2) {
            return;
        }
        int var6 = ((le) this).field_i + param1;
        this.a((byte) 116, ((le) this).field_F[0], var5, var6);
        if (((le) this).field_B < 65536) {
            nm.a(var5 + (((le) this).field_n * ((le) this).field_B >> 16), ((le) this).field_w + var6, (byte) 105, ((le) this).field_n + var5, var6);
            this.a((byte) 116, ((le) this).field_F[1], var5, var6);
            int discarded$0 = 1;
            ql.a();
        }
    }

    le(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, 8355711 & param6 >> 1);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 17 / ((55 - param2) / 61);
        ((le) this).field_H = (param1 & 16711422) >> 1;
        ((le) this).field_E = param1;
        ((le) this).field_N = param0;
        ((le) this).field_K = param0 >> 1 & 8355711;
        int discarded$0 = -506198655;
        this.f();
    }

    private final void a(byte param0, ja param1, int param2, int param3) {
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
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5_int = param2 + ((le) this).field_n;
            nm.a(param2 + ((le) this).field_M.field_x, ((le) this).field_w + param3, (byte) 105, -((le) this).field_M.field_x + var5_int, param3);
            var6 = param2 - ((le) this).field_J;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  int discarded$3 = 1;
                  ql.a();
                  if (oo.field_f > ((le) this).field_M.field_x + param2) {
                    break L2;
                  } else {
                    r.a(0, ((le) this).field_C);
                    param1.g(-((le) this).field_J, 0);
                    param1.g(((le) this).field_D * 2 + -((le) this).field_J, 0);
                    ((le) this).field_O.e(0, 0);
                    int discarded$4 = 1;
                    ql.a();
                    ((le) this).field_C.g(param2, param3);
                    break L2;
                  }
                }
                L3: {
                  if (oo.field_g >= -((le) this).field_M.field_x + var5_int) {
                    r.a(0, ((le) this).field_C);
                    var7 = -((le) this).field_M.field_x + ((le) this).field_n + ((le) this).field_J;
                    L4: while (true) {
                      if (((le) this).field_D * 2 >= var7) {
                        param1.g(-var7, 0);
                        param1.g(2 * ((le) this).field_D - var7, 0);
                        ((le) this).field_M.e(0, 0);
                        int discarded$5 = 1;
                        ql.a();
                        ((le) this).field_C.g(var5_int + -((le) this).field_M.field_x, param3);
                        break L3;
                      } else {
                        var7 = var7 - 2 * ((le) this).field_D;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param1.g(var6, param3);
                var6 = var6 + param1.field_x;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("le.A(").append(116).append(',');
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private le(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((le) this).field_E = param5;
        ((le) this).field_N = param6;
        ((le) this).field_H = param7;
        ((le) this).field_D = param4;
        ((le) this).field_K = param8;
        ((le) this).b(param0, param1, 28972, param2, param3);
    }

    private final void f() {
        ((le) this).field_F = new ja[]{this.b(-16711936, ((le) this).field_N, ((le) this).field_E), this.b(-16711936, ((le) this).field_K, ((le) this).field_H)};
        int discarded$0 = 113;
        ((le) this).field_M = this.g();
        ((le) this).field_O = ((le) this).field_M.f();
        ((le) this).field_C = new ja(((le) this).field_w >> 1, ((le) this).field_w);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Quick Chat Help";
        field_G = "Unable to add friend - system busy";
        field_P = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
