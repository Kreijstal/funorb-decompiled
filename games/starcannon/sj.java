/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends dk {
    static byte[][] field_B;
    int field_A;
    static String field_C;
    private int field_H;
    private ve field_F;
    static String field_D;
    static hl[] field_E;
    int field_G;
    static int field_I;

    public static void f(byte param0) {
        field_B = null;
        field_D = null;
        int var1 = 80 / ((param0 - -39) / 52);
        field_E = null;
        field_C = null;
    }

    final int e(int param0) {
        if (param0 != -32242) {
            return 43;
        }
        return ((sj) this).field_H;
    }

    final int a(int param0, int param1) {
        if (param0 == 2) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if (((sj) this).field_F.a(true) > param1) {
                return ((sj) this).field_F.a(0, param1);
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return -69;
        }
    }

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!ka.field_r.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param0.startsWith("https://")) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        if (param1 <= 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_B = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 >= param0.length()) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int e(byte param0) {
        if (param0 <= 103) {
            return 82;
        }
        return ((sj) this).field_F.a(true);
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = StarCannon.field_A;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = param5 - param2 + -((sj) this).field_G;
            var9 = -(((sj) this).field_G * 2) + ((sj) this).field_i;
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var8) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = var8 * ((sj) this).field_H / var9;
            if (-2 != (param6 ^ -1)) {
              if (2 == param6) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((sj) this).field_F.a(true)) {
                    if (-1 < (var11 ^ -1)) {
                      break L2;
                    } else {
                      ((sj) this).field_F.c(param4 + 138, var11);
                      break L2;
                    }
                  } else {
                    var13 = ((sj) this).field_F.a(0, var12) - var8;
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((sj) this).field_F.b(var8, 1);
              break L2;
            }
          }
          return true;
        }
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new byte[50][];
        field_C = "Unpacking graphics";
        field_D = "Loading fonts";
    }
}
