/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends rc {
    private o field_A;
    private o[] field_S;
    private int field_O;
    static rl[] field_M;
    int field_R;
    private int field_I;
    private int field_F;
    private int field_K;
    static String field_E;
    private o field_G;
    private int field_N;
    private o field_P;
    static volatile int field_J;
    boolean field_B;
    static int field_H;
    private int field_D;
    static String field_L;

    private final o b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        o var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        var14 = new o(2 * ((c) this).field_N, ((c) this).field_x);
        cl.a(-112, var14);
        var5 = ((c) this).field_x >> 1;
        var6 = 0;
        L0: while (true) {
          if (((c) this).field_x <= var6) {
            mf.e(4096);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (-1 + 2 * ((c) this).field_N) % (2 * ((c) this).field_N);
              var8 = param0 & 16711935;
              var9 = param0 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              mi.b(var7, var6, ((c) this).field_N, var12);
              var9 = param2 & 65280;
              var8 = param2 & 16711935;
              mi.b(var7 + -(2 * ((c) this).field_N), var6, ((c) this).field_N, var12);
              if (var11 >= 256) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            mi.b(((c) this).field_N + var7, var6, ((c) this).field_N, var12);
            mi.b(var7 - ((c) this).field_N, var6, ((c) this).field_N, var12);
            var6++;
            continue L0;
          }
        }
    }

    c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(-277997311);
    }

    private final void a(int param0) {
        ((c) this).field_S = new o[]{this.b(((c) this).field_O, 16711935, ((c) this).field_K), this.b(((c) this).field_I, 16711935, ((c) this).field_F)};
        ((c) this).field_P = this.a((byte) -119);
        ((c) this).field_A = ((c) this).field_P.b();
        ((c) this).field_G = new o(((c) this).field_x >> 1, ((c) this).field_x);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 18874) {
                break L1;
              } else {
                ((c) this).a((byte) -66, -124, 9);
                break L1;
              }
            }
            L2: {
              if (!((c) this).field_B) {
                break L2;
              } else {
                ((c) this).field_D = ((c) this).field_D + 1;
                if (((c) this).field_N * 2 >= ((c) this).field_D) {
                  break L2;
                } else {
                  ((c) this).field_D = ((c) this).field_D - ((c) this).field_N * 2;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("c.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 == param1)) {
            return;
        }
        int var5 = ((c) this).field_m + param2;
        int var6 = param0 - -((c) this).field_j;
        this.a(param3, var6, ((c) this).field_S[0], var5);
        if (((c) this).field_R < 65536) {
            kf.a((byte) 97, var5 - -(((c) this).field_t * ((c) this).field_R >> 16), var6, var5 - -((c) this).field_t, ((c) this).field_x + var6);
            this.a(0, var6, ((c) this).field_S[1], var5);
            mf.e(4096);
        }
    }

    private final void a(int param0, int param1, o param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = ((c) this).field_t + param3;
            kf.a((byte) 97, param3 + ((c) this).field_P.field_p, param1, -((c) this).field_P.field_p + var5_int, ((c) this).field_x + param1);
            var6 = -((c) this).field_D + param3;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    o discarded$1 = this.a((byte) 120);
                    break L2;
                  }
                }
                L3: {
                  mf.e(4096);
                  if (mi.field_b > ((c) this).field_P.field_p + param3) {
                    break L3;
                  } else {
                    cl.a(param0 ^ -100, ((c) this).field_G);
                    param2.d(-((c) this).field_D, 0);
                    param2.d(-((c) this).field_D + 2 * ((c) this).field_N, 0);
                    ((c) this).field_A.g(0, 0);
                    mf.e(param0 ^ 4096);
                    ((c) this).field_G.d(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (mi.field_k < -((c) this).field_P.field_p + var5_int) {
                    break L4;
                  } else {
                    cl.a(param0 + -119, ((c) this).field_G);
                    var7 = ((c) this).field_D + (-((c) this).field_P.field_p + ((c) this).field_t);
                    L5: while (true) {
                      if (var7 <= 2 * ((c) this).field_N) {
                        param2.d(-var7, 0);
                        param2.d(-var7 + 2 * ((c) this).field_N, 0);
                        ((c) this).field_P.g(0, 0);
                        mf.e(param0 ^ 4096);
                        ((c) this).field_G.d(-((c) this).field_P.field_p + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - ((c) this).field_N * 2;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param2.d(var6, param1);
                var6 = var6 + param2.field_p;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((c) this).field_F = (param1 & 16711422) >> 1;
        ((c) this).field_I = 8355711 & param2 >> 1;
        ((c) this).field_K = param1;
        int var4 = 99 / ((-54 - param0) / 58);
        ((c) this).field_O = param2;
        this.a(-277997311);
    }

    public static void d(byte param0) {
        field_E = null;
        field_M = null;
        int var1 = -1;
        field_L = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!gb.a(param1, 126)) {
                var6 = hh.field_N;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = qk.field_k;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param1) {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2_ref, "c.H(" + 0 + ',' + param1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((c) this).field_I = param7;
        ((c) this).field_K = param6;
        ((c) this).field_F = param8;
        ((c) this).field_O = param5;
        ((c) this).field_N = param4;
        ((c) this).b(param3, param2, param0, 0, param1);
    }

    private final o a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        int var2 = ((c) this).field_x >> 1;
        if (param0 != -119) {
            return null;
        }
        o var3 = new o(var2, ((c) this).field_x);
        cl.a(-98, var3);
        for (var4 = 0; ((c) this).field_x > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((c) this).field_x));
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                mi.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        mf.e(4096);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new rl[6];
        field_E = "A large asteroid field is heading for earth and the only hope are the eight Sol-Knights.  Earth must survive!  Each Sol-Knight is equipped with a different weapon to combat the threat.<br><br>Your planet's shields can only withstand 2 hits before they fall,<br>so stay vigilant.<br><br>Combos are the key to victory. They are gained by destroying asteroids accurately. If you miss a shot you will lose your combo, and any upgrades you collected will be removed unless you quickly restore the combo.<br><br>Maintaining accuracy will unlock weapon upgrades, such as rapid fire or multiple shots, at x10 and x25 combos.";
        field_J = -1;
        field_L = "Log in / Create account";
    }
}
