/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends wd {
    int field_D;
    int field_L;
    int field_P;
    float field_E;
    float field_A;
    private int field_O;
    qm field_H;
    int field_z;
    qm field_U;
    float field_K;
    static int field_y;
    static ge field_G;
    static String field_J;
    int field_B;
    int field_N;
    int field_R;
    qm field_F;
    static boolean field_T;
    private int field_S;
    qm field_Q;
    float field_I;
    static int field_M;

    final static boolean a(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_M = 1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        if (!ib.field_s.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
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
                        if (var3 >= param1.length()) {
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
                        if (var2.indexOf((int) param1.charAt(var3)) != -1) {
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
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
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

    final in g(int param0) {
        float var2 = ((hn) this).field_E;
        var2 = var2 + (((hn) this).field_I < ((hn) this).field_E ? 1.5707963705062866f : -1.5707963705062866f);
        if (param0 != -1) {
            return null;
        }
        return new in(var2);
    }

    final qm l(int param0) {
        if (param0 != 8421504) {
            ((hn) this).field_E = 0.36725643277168274f;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_D * Math.cos((double)((hn) this).field_I)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_D * Math.sin((double)((hn) this).field_I)));
    }

    final in a(boolean param0) {
        float var2 = ((hn) this).field_I;
        var2 = var2 + (((hn) this).field_E <= ((hn) this).field_I ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0) {
            ((hn) this).field_S = -21;
        }
        return new in(var2);
    }

    final qm a(float param0, int param1) {
        float var3 = ((hn) this).field_E + (-((hn) this).field_E + ((hn) this).field_I) * param0;
        if (param1 != 255) {
            qm discarded$0 = ((hn) this).h(78);
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_O * Math.cos((double)var3)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_O * Math.sin((double)var3)));
    }

    final qm a(float param0, boolean param1) {
        float var3 = ((hn) this).field_E + (((hn) this).field_I - ((hn) this).field_E) * param0;
        if (param1) {
            return null;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_S * Math.cos((double)var3)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_S * Math.sin((double)var3)));
    }

    final qm h(int param0) {
        if (param0 != 7560980) {
            float discarded$0 = ((hn) this).a(0.218789204955101f, (byte) 23);
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_O * Math.cos((double)((hn) this).field_I)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_O * Math.sin((double)((hn) this).field_I)));
    }

    final qm a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_z * Math.cos((double)((hn) this).field_I)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_z * Math.sin((double)((hn) this).field_I)));
    }

    final qm n(int param0) {
        if (param0 != 3337) {
            qm discarded$0 = ((hn) this).a(1.24961256980896f, -83);
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_R * Math.cos((double)((hn) this).field_E)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_R * Math.sin((double)((hn) this).field_E)));
    }

    final qm c(float param0, int param1) {
        if (param1 < 90) {
            ((hn) this).field_F = null;
        }
        float var3 = ((hn) this).field_E + (-((hn) this).field_E + ((hn) this).field_I) * param0;
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_D * Math.cos((double)var3)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_D * Math.sin((double)var3)));
    }

    final qm a(byte param0) {
        if (param0 != 29) {
            ((hn) this).field_Q = null;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_S * Math.cos((double)((hn) this).field_I)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_S * Math.sin((double)((hn) this).field_I)));
    }

    final in a(byte param0, float param1) {
        float var3 = (((hn) this).field_I - ((hn) this).field_E) * param1 + ((hn) this).field_E;
        var3 = var3 + (((hn) this).field_I < ((hn) this).field_E ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0 < 117) {
            ((hn) this).field_Q = null;
        }
        return new in(var3);
    }

    final qm a(int param0, float param1) {
        if (param0 != -851) {
            ((hn) this).field_O = 100;
        }
        float var3 = ((hn) this).field_E + (((hn) this).field_I - ((hn) this).field_E) * param1;
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_R * Math.cos((double)var3)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_R * Math.sin((double)var3)));
    }

    final qm a(boolean param0, float param1) {
        float var3 = ((hn) this).field_E + param1 * (-((hn) this).field_E + ((hn) this).field_I);
        if (param0) {
            return null;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_z * Math.cos((double)var3)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_z * Math.sin((double)var3)));
    }

    final float a(float param0, byte param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 < 33) {
            field_y = 109;
        }
        if (((hn) this).field_I < ((hn) this).field_E) {
            while (param0 < ((hn) this).field_I) {
                param0 = (float)((double)param0 + 6.283185307179586);
            }
            while (((hn) this).field_E < param0) {
                param0 = (float)((double)param0 - 6.283185307179586);
            }
            return (-((hn) this).field_E + param0) / (((hn) this).field_I - ((hn) this).field_E);
        }
        while (((hn) this).field_I < param0) {
            param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (((hn) this).field_E > param0) {
            param0 = (float)((double)param0 + 6.283185307179586);
        }
        return (param0 - ((hn) this).field_E) / (((hn) this).field_I - ((hn) this).field_E);
    }

    final float f(int param0) {
        if (param0 != 50) {
            qm discarded$0 = ((hn) this).l(-4);
        }
        return Math.abs(((hn) this).field_I - ((hn) this).field_E) * (float)((hn) this).field_z;
    }

    public static void p(int param0) {
        if (param0 >= -120) {
            field_y = 99;
        }
        field_J = null;
        field_G = null;
    }

    final qm m(int param0) {
        if (param0 != -14) {
            ((hn) this).field_S = 113;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_R * Math.cos((double)((hn) this).field_I)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_R * Math.sin((double)((hn) this).field_I)));
    }

    final qm o(int param0) {
        if (param0 != -14) {
            return null;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_S * Math.cos((double)((hn) this).field_E)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_S * Math.sin((double)((hn) this).field_E)));
    }

    final qm k(int param0) {
        if (param0 != 255) {
            qm discarded$0 = ((hn) this).a(true, -0.0722532868385315f);
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_D * Math.cos((double)((hn) this).field_E)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_D * Math.sin((double)((hn) this).field_E)));
    }

    final qm c(boolean param0) {
        if (!param0) {
            return null;
        }
        return new qm((int)((double)((hn) this).field_U.field_h + (double)((hn) this).field_O * Math.cos((double)((hn) this).field_E)), (int)((double)((hn) this).field_U.field_f - (double)((hn) this).field_O * Math.sin((double)((hn) this).field_E)));
    }

    hn(qm param0, int param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8, qm param9, qm param10, qm param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param13) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((hn) this).field_s = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param12) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((hn) this).field_w = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param17) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((hn) this).field_q = stackIn_9_1 != 0;
          ((hn) this).field_E = param2;
          ((hn) this).field_U = param0;
          ((hn) this).field_Q = param10;
          ((hn) this).field_L = param8;
          ((hn) this).field_N = param5;
          ((hn) this).field_H = param11;
          ((hn) this).field_B = param6;
          ((hn) this).field_P = param7;
          ((hn) this).field_I = param3;
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (!param15) {
            stackOut_11_0 = this;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = this;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((hn) this).field_x = stackIn_12_1 != 0;
          ((hn) this).field_k = param4;
          stackOut_12_0 = this;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if (!param16) {
            stackOut_14_0 = this;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L4;
          } else {
            stackOut_13_0 = this;
            stackOut_13_1 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L4;
          }
        }
        L5: {
          ((hn) this).field_t = stackIn_15_1 != 0;
          ((hn) this).field_F = param9;
          ((hn) this).field_z = param1;
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param14) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L5;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L5;
          }
        }
        L6: {
          ((hn) this).field_m = stackIn_18_1 != 0;
          stackOut_18_0 = this;
          stackOut_18_1 = ((hn) this).field_z;
          stackIn_20_0 = stackOut_18_0;
          stackIn_20_1 = stackOut_18_1;
          stackIn_19_0 = stackOut_18_0;
          stackIn_19_1 = stackOut_18_1;
          if (((hn) this).field_E >= ((hn) this).field_I) {
            stackOut_20_0 = this;
            stackOut_20_1 = stackIn_20_1;
            stackOut_20_2 = -((hn) this).field_L;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            stackIn_21_2 = stackOut_20_2;
            break L6;
          } else {
            stackOut_19_0 = this;
            stackOut_19_1 = stackIn_19_1;
            stackOut_19_2 = ((hn) this).field_L;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_21_2 = stackOut_19_2;
            break L6;
          }
        }
        L7: {
          ((hn) this).field_R = stackIn_21_1 + stackIn_21_2;
          stackOut_21_0 = this;
          stackOut_21_1 = ((hn) this).field_z;
          stackIn_23_0 = stackOut_21_0;
          stackIn_23_1 = stackOut_21_1;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          if (((hn) this).field_E >= ((hn) this).field_I) {
            stackOut_23_0 = this;
            stackOut_23_1 = stackIn_23_1;
            stackOut_23_2 = -((hn) this).field_B;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            stackIn_24_2 = stackOut_23_2;
            break L7;
          } else {
            stackOut_22_0 = this;
            stackOut_22_1 = stackIn_22_1;
            stackOut_22_2 = ((hn) this).field_B;
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_24_2 = stackOut_22_2;
            break L7;
          }
        }
        L8: {
          ((hn) this).field_S = stackIn_24_1 - -stackIn_24_2;
          ((hn) this).field_K = 1.0f;
          stackOut_24_0 = this;
          stackOut_24_1 = ((hn) this).field_z;
          stackIn_26_0 = stackOut_24_0;
          stackIn_26_1 = stackOut_24_1;
          stackIn_25_0 = stackOut_24_0;
          stackIn_25_1 = stackOut_24_1;
          if (((hn) this).field_I > ((hn) this).field_E) {
            stackOut_26_0 = this;
            stackOut_26_1 = stackIn_26_1;
            stackOut_26_2 = ((hn) this).field_P;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            stackIn_27_2 = stackOut_26_2;
            break L8;
          } else {
            stackOut_25_0 = this;
            stackOut_25_1 = stackIn_25_1;
            stackOut_25_2 = -((hn) this).field_P;
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_27_2 = stackOut_25_2;
            break L8;
          }
        }
        L9: {
          ((hn) this).field_D = stackIn_27_1 - -stackIn_27_2;
          ((hn) this).field_o = 0.0f;
          stackOut_27_0 = this;
          stackIn_29_0 = stackOut_27_0;
          stackIn_28_0 = stackOut_27_0;
          if (((hn) this).field_I <= ((hn) this).field_E) {
            stackOut_29_0 = this;
            stackOut_29_1 = -((hn) this).field_N;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            break L9;
          } else {
            stackOut_28_0 = this;
            stackOut_28_1 = ((hn) this).field_N;
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            break L9;
          }
        }
        ((hn) this).field_O = stackIn_30_1 + ((hn) this).field_z;
        ((hn) this).field_A = 0.0f;
    }

    final boolean b(byte param0, float param1) {
        int var4 = HoldTheLine.field_D;
        if (param0 != -113) {
            ((hn) this).field_P = 69;
        }
        if (((hn) this).field_E > ((hn) this).field_I) {
            while (((hn) this).field_I < param1) {
                param1 = (float)((double)param1 - 6.283185307179586);
            }
            while (param1 < ((hn) this).field_I) {
                param1 = (float)((double)param1 + 6.283185307179586);
            }
            return ((hn) this).field_E > param1 ? true : false;
        }
        while (((hn) this).field_E < param1) {
            param1 = (float)((double)param1 - 6.283185307179586);
        }
        while (((hn) this).field_E > param1) {
            param1 = (float)((double)param1 + 6.283185307179586);
        }
        return ((hn) this).field_I > param1 ? true : false;
    }

    final qm b(float param0, int param1) {
        float var3 = ((hn) this).field_A + (-((hn) this).field_A + ((hn) this).field_K) * param0;
        int var4 = (int)((float)((hn) this).field_F.field_h * (-var3 + 1.0f) * (-var3 + 1.0f) + (-var3 + 1.0f) * (float)(2 * ((hn) this).field_H.field_h) * var3 + var3 * (float)((hn) this).field_Q.field_h * var3);
        int var5 = (int)(var3 * (float)((hn) this).field_Q.field_f * var3 + (var3 * ((float)(2 * ((hn) this).field_H.field_f) * (1.0f - var3)) + (float)((hn) this).field_F.field_f * (-var3 + 1.0f) * (1.0f - var3)));
        if (param1 != 7560980) {
            return null;
        }
        return new qm(var4, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Sound: ";
        field_G = new ge();
    }
}
