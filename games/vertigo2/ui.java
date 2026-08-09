/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    short field_f;
    static cr field_b;
    boolean field_c;
    boolean field_a;
    static int field_g;
    boolean field_i;
    int field_h;
    static lg field_e;
    static int field_d;

    final static er[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        er[] stackIn_64_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        er[] var10 = null;
        er[] var11_ref_er__ = null;
        int var11 = 0;
        int var12 = 0;
        er var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9_int = param0 - -param1 - -param5;
                        var10 = new er[]{new er(var9_int, var9_int), new er(param8, var9_int), new er(var9_int, var9_int), new er(var9_int, param8), new er(64, 64), new er(var9_int, param8), new er(var9_int, var9_int), new er(param8, var9_int), new er(var9_int, var9_int)};
                        var11_ref_er__ = var10;
                        var12 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var12 ^ -1) <= (var11_ref_er__.length ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = var11_ref_er__[var12];
                        stackIn_13_0 = 0;
                        stackIn_4_0 = stackIn_13_0;
                        if (var15 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var14 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var14 >= var13.field_F.length) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var13.field_F[var14] = param7;
                        var14++;
                        if (var15 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var15 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var12++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = param6;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == 5) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        field_d = 37;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var11 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var11 ^ -1) <= (param0 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_28_0 = 0;
                        stackIn_19_0 = stackIn_28_0;
                        if (var15 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var12 = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var9_int ^ -1) >= (var12 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10[6].field_F[var12 + (-1 + (var9_int - var11)) * var9_int] = param2;
                        var10[8].field_F[var12 + (-1 + -var11 + var9_int) * var9_int] = param2;
                        var10[2].field_F[-1 - -var9_int + (-var11 + var9_int * var12)] = param2;
                        var10[8].field_F[-var11 - -var9_int + -1 + var9_int * var12] = param2;
                        var12++;
                        if (var15 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var15 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var15 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11 = stackIn_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = param0;
                        stackIn_30_1 = var11;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 <= stackIn_30_1) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_41_0 = 0;
                        stackIn_32_0 = stackIn_41_0;
                        if (var15 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var12 = stackIn_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 >= var9_int) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10[0].field_F[var12 + var9_int * var11] = param4;
                        var10[0].field_F[var9_int * var12 + var11] = param4;
                        stackIn_30_0 = var9_int + -var11;
                        stackIn_35_0 = stackIn_30_0;
                        stackIn_30_1 = var12;
                        stackIn_35_1 = stackIn_30_1;
                        if (var15 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= stackIn_35_1) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10[2].field_F[var11 * var9_int + var12] = param4;
                        var10[6].field_F[var9_int * var12 + var11] = param4;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((param8 ^ -1) >= (var11 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_53_0 = 0;
                        stackIn_44_0 = stackIn_53_0;
                        if (var15 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = stackIn_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((param0 ^ -1) >= (var12 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10[7].field_F[var11 + (-var12 + (var9_int + -1)) * param8] = param2;
                        var10[5].field_F[-var12 + (-1 + (var9_int + var11 * var9_int))] = param2;
                        var10[1].field_F[var11 + param8 * var12] = param4;
                        var10[3].field_F[var12 + var11 * var9_int] = param4;
                        var12++;
                        if (var15 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var15 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11++;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var15 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = stackIn_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (param8 >> -351733375 <= var11) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var12 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (param5 <= var12) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10[1].field_F[param8 * (-1 + -var12 + var9_int) + var11] = param3;
                        var10[3].field_F[-1 + (var9_int - (var12 - var11 * var9_int))] = param3;
                        var10[7].field_F[var11 + var12 * param8] = param3;
                        var10[5].field_F[var12 + var11 * var9_int] = param3;
                        var12++;
                        if (var15 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var11++;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var15 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = (er[]) (var10);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return stackIn_64_0;
                }
                case 65: {
                    var9 = (RuntimeException) ((Object) caughtException);
                    throw wn.a((Throwable) ((Object) var9), "ui.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(int param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -100) {
                break L1;
              } else {
                ui.a(-32, -26, -60, -33, 84, -75, 106, 100, 13);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == t.field_m) {
                  break L3;
                } else {
                  if (!t.field_m.a(false)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ui.E(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != 64) {
            return;
        }
        try {
            field_e = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ')');
        }
    }

    final static void a(long param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        mi var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = uh.field_Wb;
              var4.j(param1, 124);
              var4.field_u = var4.field_u + 1;
              var5 = var4.field_u;
              var4.f(6, 88);
              if (param2 >= 85) {
                break L1;
              } else {
                field_b = (cr) null;
                break L1;
              }
            }
            var4.a((byte) -117, param0);
            var4.b((byte) 117, var4.field_u - var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "ui.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String b(int param0) {
        String stackIn_59_0 = null;
        Object stackIn_105_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (field_g != 0) {
                break L1;
              } else {
                if (null != sj.field_d) {
                  var2 = w.field_E;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (2 != field_g) {
                break L2;
              } else {
                if (dh.a((byte) 127)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (c.a(sm.field_Kb, (byte) -125)) {
                        break L4;
                      } else {
                        var2 = Vertigo2.a(new String[]{ea.field_b}, bj.field_b, param0 ^ 410);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = Vertigo2.a(new String[]{ea.field_b}, qo.field_E, 91);
                    break L3;
                  }
                  if (!pm.field_a) {
                    break L2;
                  } else {
                    dh.a((byte) -114, (String) (var2), 2, (String) null, 0, (String) null);
                    on.a(9110);
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (null != var2) {
                break L5;
              } else {
                if (nb.field_z) {
                  break L5;
                } else {
                  if (null != gk.field_c) {
                    break L5;
                  } else {
                    var2 = na.field_l;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (param0 == -485) {
                break L6;
              } else {
                field_b = (cr) null;
                break L6;
              }
            }
            L7: {
              if (null != var2) {
                ir.a((String) null, lj.field_p, (String) (var2), 0, 0);
                break L7;
              } else {
                L8: {
                  var3 = qe.field_V;
                  var3 = jk.a(15709, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = field_g;
                  var7 = 0;
                  if (var6 == 2) {
                    var4 = Vertigo2.a(new String[]{ea.field_b}, di.field_B, -114);
                    var8 = Vertigo2.a(new String[]{var3}, af.field_L, -128);
                    var7 = -485 + (dj.field_d.field_Fb - -field_b.field_Fb) - (-cg.field_f.c(var8) + cg.field_f.c(var4));
                    if ((var7 ^ -1) > -1) {
                      var7 = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    L9: {
                      if (0 != var6) {
                        break L9;
                      } else {
                        L10: {
                          if (gd.field_j != null) {
                            break L10;
                          } else {
                            if (fq.field_i) {
                              var4 = "[" + fb.field_A + "] ";
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (gd.field_j != null) {
                          L11: {
                            L12: {
                              if (!ar.field_t) {
                                break L12;
                              } else {
                                if (null == v.field_a) {
                                  break L12;
                                } else {
                                  var4 = "[" + v.field_a + "] ";
                                  if (var10 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var4 = "[" + Vertigo2.a(new String[]{gd.field_j.field_Nb}, ie.field_Rb, param0 ^ 411) + "] ";
                            break L11;
                          }
                          var6 = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L13: {
                      if (tb.a((byte) 118)) {
                        stackIn_59_0 = ": ";
                        break L13;
                      } else {
                        stackIn_59_0 = "<img=3>: ";
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var8 = stackIn_59_0;
                        var4 = var4 + var3 + var8;
                        if (pe.field_r) {
                          break L15;
                        } else {
                          if (hj.field_b) {
                            var4 = "<col=999999>" + var4 + pb.field_c + "</col>";
                            var5 = "";
                            if (var10 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      var5 = "";
                      var4 = "<col=999999>" + var4 + ah.field_k + "</col>";
                      break L14;
                    }
                    L16: {
                      var9 = cg.field_f.c(var4);
                      if (tb.a((byte) 122)) {
                        break L16;
                      } else {
                        L17: {
                          if (!dj.field_d.field_pb) {
                            break L17;
                          } else {
                            if ((var9 ^ -1) >= (-dj.field_d.field_ob + ed.field_n ^ -1)) {
                              break L17;
                            } else {
                              if (!pe.field_r) {
                                var1 = pb.field_c;
                                break L17;
                              } else {
                                var1 = "Broken!";
                                break L17;
                              }
                            }
                          }
                        }
                        if (-1 == (dj.field_d.field_tb ^ -1)) {
                          break L16;
                        } else {
                          if (dj.field_d.field_ub >= var9) {
                            break L16;
                          } else {
                            if (!pe.field_r) {
                              g.a((byte) -10);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    break L8;
                  }
                }
                L18: {
                  ir.a(var5, gg.field_n[var6], var4 + cc.b(fb.field_D.toString()), var7, 0);
                  if (!il.field_a) {
                    field_b.field_pb = false;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (field_b.field_pb) {
                    var1 = Vertigo2.a(new String[]{var3, ea.field_b}, bd.field_g, -113);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                break L7;
              }
            }
            stackIn_105_0 = var1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (var1), "ui.A(" + param0 + ')');
        }
        return (String) ((Object) stackIn_105_0);
    }

    static {
        field_g = 0;
    }
}
