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
          var2 = 81 / ((-3 - param1) / 39);
          if (0 <= param0) {
            if ((param0 ^ -1) > -32769) {
              L0: {
                if (-129 >= param0) {
                  if ((param0 ^ -1) > -2049) {
                    if ((param0 ^ -1) > -513) {
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
                  if (-9 > param0) {
                    if ((param0 ^ -1) > -3) {
                      return 256;
                    } else {
                      var3 = 7;
                      break L0;
                    }
                  } else {
                    if ((param0 ^ -1) <= -33) {
                      var3 = 5;
                      break L0;
                    } else {
                      var3 = 6;
                      break L0;
                    }
                  }
                }
              }
              param0 = param0 << (var3 << -465331295);
              return pk.field_a[-32768 + param0] >> var3;
            } else {
              if (param0 <= -131073) {
                L1: {
                  if (param0 < 33554432) {
                    if (param0 >= 2097152) {
                      if ((param0 ^ -1) > -8388609) {
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
                    if (-536870913 > param0) {
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
                param0 = param0 >> (var3 << 1609769889);
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

    final static boolean b(int param0, byte param1) {
        if (!(-1 != param0)) {
            return true;
        }
        if (param1 != -70) {
            field_I = null;
        }
        return -1 != (1 << param0 & pb.field_d ^ -1) ? true : false;
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
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var14 = new ja(2 * ((le) this).field_D, ((le) this).field_w);
        if (param0 == -16711936) {
          r.a(0, var14);
          var5 = ((le) this).field_w >> 639813409;
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((le) this).field_w) {
              ql.a(true);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> 1565101665) * (2 * ((le) this).field_D - 1) % (2 * ((le) this).field_D);
                var8 = 16711935 & param2;
                var9 = param2 & 65280;
                var10 = var6 + -var5;
                var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
                if (256 <= var11) {
                  stackOut_6_0 = var9 | var8;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 408378376;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                oo.b(var7, var6, ((le) this).field_D, var12);
                var8 = param1 & 16711935;
                var9 = 65280 & param1;
                oo.b(var7 + -(((le) this).field_D * 2), var6, ((le) this).field_D, var12);
                if (var11 < 256) {
                  stackOut_9_0 = (var11 * var8 & -16711936 | var9 * var11 & 16711680) >>> -947853752;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var8 | var9;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              oo.b(var7 - -((le) this).field_D, var6, ((le) this).field_D, var12);
              oo.b(var7 - ((le) this).field_D, var6, ((le) this).field_D, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final ja g(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = ((le) this).field_w >> -1128159583;
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
                oo.a(var5, var4, var8 << -136884464 | (var8 << -2145973016 | var8));
            }
        }
        var5 = 121 % ((45 - param0) / 54);
        ql.a(true);
        return var3;
    }

    public static void a(int param0) {
        field_G = null;
        field_I = null;
        if (param0 != 0) {
            boolean discarded$0 = le.b(67, (byte) 68);
        }
        field_P = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(-506198655);
    }

    final void a(int param0, cf param1, int param2, int param3) {
        if (!(!((le) this).field_L)) {
            ((le) this).field_J = ((le) this).field_J + 1;
            if (!(((le) this).field_D * 2 >= ((le) this).field_J)) {
                ((le) this).field_J = ((le) this).field_J - ((le) this).field_D * 2;
            }
        }
        if (param0 != -5407) {
            ((le) this).b(-97, -4, 31, 91, 52);
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
        if (-65537 < (((le) this).field_B ^ -1)) {
            nm.a(var5 + (((le) this).field_n * ((le) this).field_B >> -1947480464), ((le) this).field_w + var6, (byte) 105, ((le) this).field_n + var5, var6);
            this.a((byte) 116, ((le) this).field_F[1], var5, var6);
            ql.a(true);
        }
    }

    le(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -158222623, 8355711 & param6 >> 947786721);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 17 / ((55 - param2) / 61);
        ((le) this).field_H = (param1 & 16711422) >> -2031915327;
        ((le) this).field_E = param1;
        ((le) this).field_N = param0;
        ((le) this).field_K = param0 >> -146639327 & 8355711;
        this.f(-506198655);
    }

    private final void a(byte param0, ja param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          var5 = param2 + ((le) this).field_n;
          if (param0 == 116) {
            break L0;
          } else {
            ((le) this).field_N = -99;
            break L0;
          }
        }
        nm.a(param2 + ((le) this).field_M.field_x, ((le) this).field_w + param3, (byte) 105, -((le) this).field_M.field_x + var5, param3);
        var6 = param2 - ((le) this).field_J;
        L1: while (true) {
          if (var6 >= var5) {
            L2: {
              ql.a(true);
              if (oo.field_f > ((le) this).field_M.field_x + param2) {
                break L2;
              } else {
                r.a(0, ((le) this).field_C);
                param1.g(-((le) this).field_J, 0);
                param1.g(((le) this).field_D * 2 + -((le) this).field_J, 0);
                ((le) this).field_O.e(0, 0);
                ql.a(true);
                ((le) this).field_C.g(param2, param3);
                break L2;
              }
            }
            L3: {
              if (oo.field_g >= -((le) this).field_M.field_x + var5) {
                r.a(0, ((le) this).field_C);
                var7 = -((le) this).field_M.field_x + ((le) this).field_n + ((le) this).field_J;
                L4: while (true) {
                  if (((le) this).field_D * 2 >= var7) {
                    param1.g(-var7, 0);
                    param1.g(2 * ((le) this).field_D - var7, 0);
                    ((le) this).field_M.e(0, 0);
                    ql.a(true);
                    ((le) this).field_C.g(var5 + -((le) this).field_M.field_x, param3);
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
            return;
          } else {
            param1.g(var6, param3);
            var6 = var6 + param1.field_x;
            continue L1;
          }
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

    private final void f(int param0) {
        ((le) this).field_F = new ja[]{this.b(param0 + 489486719, ((le) this).field_N, ((le) this).field_E), this.b(-16711936, ((le) this).field_K, ((le) this).field_H)};
        ((le) this).field_M = this.g(param0 ^ -506198544);
        ((le) this).field_O = ((le) this).field_M.f();
        ((le) this).field_C = new ja(((le) this).field_w >> -506198655, ((le) this).field_w);
        if (param0 != -506198655) {
            ((le) this).b(-93, 112, 105, 48, -63);
        }
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
