/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gha implements pp {
    private static String[] field_b;
    static char[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 <= 27) {
            return true;
        }
        return -1 != (52 & param1 ^ -1) ? true : false;
    }

    final static mva[] a(mva[] param0, int param1, int param2, int param3, os param4, kh param5) {
        mva[] stackIn_3_0 = null;
        mva[] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        mva var9 = null;
        kh var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == -16499) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (mva[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6_int = param5.b((byte) 44, param2);
                        if (var6_int == 0) {
                            statePc = 27;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0.length == var6_int) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0 = param4.a(var6_int, -26955);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 >= var6_int) {
                            statePc = 26;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (uha.a(5907, param5)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param0[var7] = null;
                        if (var11 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0[var7] == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param0[var7] = param4.a((byte) -124);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = param1;
                        var9 = param0[var7];
                        var10 = param5;
                        if (1 != var8) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9.a(var10, false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var8 ^ -1) == -3) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((qs) ((Object) var9)).b(var10, true);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-4 != (var8 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((fc) ((Object) var9)).a(99, var10);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var11 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param0 = null;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (mva[]) (param0);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (var6);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("gha.A(");
                    stackIn_31_1 = stackIn_32_1;
                    if (param0 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_0 = stackIn_35_0;
                    stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_34_1 = stackIn_35_1;
                    if (param4 == null) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
                    stackIn_37_1 = stackIn_38_1;
                    if (param5 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 24 / ((param0 - -30) / 62);
        field_a = null;
    }

    final static oc a(String param0, String param1, int param2, cn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Exception var5 = null;
        oc stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -46 / ((-55 - param2) / 54);
            try {
              L1: {
                stackIn_2_0 = lga.a(param3, param1, param0, true);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              stackIn_4_0 = null;
              return (oc) ((Object) stackIn_4_0);
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("gha.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        return stackIn_2_0;
    }

    static {
        field_b = new String[7];
        field_b[4] = "Light";
        field_b[3] = "Water";
        field_b[2] = "Blue Fire";
        field_b[6] = "White Light";
        field_b[5] = "Ice";
        field_b[0] = "Damage";
        field_b[1] = "Yellow Fire";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
