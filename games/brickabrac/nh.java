/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static mh field_a;
    static String field_d;
    static int field_b;
    static rg field_c;

    final static void a(int param0, int param1, int param2, int param3, jp[] param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (param4[3] != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = param4[3].field_x;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6_int = stackIn_10_0;
                        if (param4[5] == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = param4[5].field_x;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = stackIn_13_0;
                        if (param2 == -40) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        if (null == param4[1]) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = param4[1].field_z;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = stackIn_18_0;
                        if (param4[7] != null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = param4[7].field_z;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 = stackIn_21_0;
                        var10 = param0 + param3;
                        var11 = param5 + param1;
                        var12 = var6_int + param3;
                        var13 = -var7 + var10;
                        var14 = var8 + param5;
                        var15 = var11 + -var9;
                        var16 = var12;
                        var17 = var13;
                        if ((var16 ^ -1) < (var17 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var17 = param0 * var6_int / (var7 + var6_int) + param3;
                        var16 = param0 * var6_int / (var7 + var6_int) + param3;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var18 = var14;
                        var19 = var15;
                        if (var19 >= var18) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var19 = param1 * var8 / (var8 + var9) + param5;
                        var18 = param1 * var8 / (var8 + var9) + param5;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        lb.a(rg.field_g);
                        if (null == param4[0]) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        lb.d(param3, param5, var16, var18);
                        param4[0].c(param3, param5);
                        lb.b(rg.field_g);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == param4[2]) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        lb.d(var17, param5, var10, var18);
                        param4[2].c(var13, param5);
                        lb.b(rg.field_g);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == param4[6]) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        lb.d(param3, var19, var16, var11);
                        param4[6].c(param3, var15);
                        lb.b(rg.field_g);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param4[8] != null) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        lb.d(var17, var19, var10, var11);
                        param4[8].c(var13, var15);
                        lb.b(rg.field_g);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param4[1] == null) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (0 != param4[1].field_x) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        lb.d(var16, param5, var17, var18);
                        var20 = var12;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var13 <= var20) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        param4[1].c(var20, param5);
                        var20 = var20 + param4[1].field_x;
                        if (var22 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var22 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param4[7] == null) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param4[7].field_x != 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        lb.d(var16, var19, var17, var11);
                        var20 = var12;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var13 ^ -1) >= (var20 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param4[7].c(var20, var15);
                        var20 = var20 + param4[7].field_x;
                        if (var22 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var22 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (param4[3] == null) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-1 != (param4[3].field_z ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        lb.d(param3, var18, var16, var19);
                        var20 = var14;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var20 >= var15) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param4[3].c(param3, var20);
                        var20 = var20 + param4[3].field_z;
                        if (var22 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var22 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (null == param4[5]) {
                            statePc = 71;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (param4[5].field_z != 0) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        lb.d(var17, var18, var10, var19);
                        var20 = var14;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var15 <= var20) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        param4[5].c(var13, var20);
                        var20 = var20 + param4[5].field_z;
                        if (var22 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var22 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (null == param4[4]) {
                            statePc = 90;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (param4[4].field_x == 0) {
                            statePc = 90;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((param4[4].field_z ^ -1) == -1) {
                            statePc = 90;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        lb.d(var16, var18, var17, var19);
                        var20 = var14;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((var20 ^ -1) <= (var15 ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var22 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var21 = var12;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((var21 ^ -1) <= (var13 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        param4[4].c(var21, var20);
                        var21 = var21 + param4[4].field_x;
                        if (var22 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var22 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var20 = var20 + param4[4].field_z;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var22 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_88_0 = (RuntimeException) (var6);
                    stackIn_87_0 = stackIn_88_0;
                    stackIn_88_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_87_1 = stackIn_88_1;
                    if (param4 == null) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_87_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_87_1);
                    stackIn_89_2 = "{...}";
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = "null";
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    throw qb.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param5 + ')');
                }
                case 90: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(jp[] param0, int param1, int param2, int param3, int param4, dh param5, int param6, int param7, int param8, jp[] param9, int param10, jp[] param11, int param12, byte param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        jp[] var17 = null;
        try {
          L0: {
            L1: {
              var15_int = param5.field_B - -param5.field_P;
              var16 = param5.field_B;
              if (param13 == -110) {
                break L1;
              } else {
                var17 = (jp[]) null;
                nh.a((jp[]) null, -71, 62, -50, 61, (dh) null, 97, 90, 79, (jp[]) null, 117, (jp[]) null, 81, (byte) 46, -119);
                break L1;
              }
            }
            oa.a(param3, var15_int, param10, param2, var15_int, param12, param1, param7, param4, param0, param5, param11, param8, param6, var16, false, param14, param9, param5, var16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var15);

            stackIn_6_1 = new StringBuilder().append("nh.C(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4) {
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        mh stackIn_21_0 = null;
        mh stackIn_22_0 = null;
        mh stackIn_23_0 = null;
        mh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_87_0 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_153_0 = 0;
        mh stackIn_171_0 = null;
        mh stackIn_172_0 = null;
        mh stackIn_173_0 = null;
        mh stackIn_174_0 = null;
        mh stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        mh stackIn_176_0 = null;
        mh stackIn_177_0 = null;
        mh stackIn_178_0 = null;
        mh stackIn_179_0 = null;
        mh stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        mh stackIn_181_0 = null;
        mh stackIn_182_0 = null;
        mh stackIn_183_0 = null;
        mh stackIn_184_0 = null;
        mh stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        boolean stackOut_80_0;
        boolean stackOut_132_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        mh var6 = null;
        mh var7 = null;
        mh var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vl var17 = null;
        Object var18 = null;
        int var18_int = 0;
        id var18_ref = null;
        int var19 = 0;
        jp[] var20 = null;
        int[] var21 = null;
        mh var23 = null;
        int[] var24 = null;
        String var25 = null;
        int[] var26 = null;
        mh var27 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_3_0 = eg.field_m;
                        stackIn_2_0 = stackIn_3_0;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = stackIn_2_0;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = stackIn_3_0;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        co.a(stackIn_4_0, stackIn_4_1 != 0);
                        if (o.field_e != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ij.field_e.field_eb = true;
                        var23 = pf.field_h;
                        var27 = var23;
                        pf.field_h.field_cb = 0;
                        var27.field_Ib = 0;
                        dn.field_K.field_cb = 0;
                        var6 = dn.field_K;
                        var6.field_Ib = 0;
                        var7 = ke.field_e;
                        ke.field_e.field_cb = 0;
                        var7.field_Ib = 0;
                        if (hn.b((byte) 7)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9_ref_String = o.field_e.field_Fc;
                        ba.field_v.field_Mb = rd.a(fm.field_a, new String[]{var9_ref_String}, (byte) 103).toUpperCase();
                        ke.field_e.a(40, ak.field_d.field_cb + -40, 0, ak.field_d.field_Ib, (byte) 64);
                        ke.field_e.field_Mb = rd.a(nm.field_a, new String[]{var9_ref_String}, (byte) 103);
                        var8 = ke.field_e;
                        if (var19 == 0) {
                            statePc = 164;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ba.field_v.field_Mb = ba.field_x.toUpperCase();
                        var9 = (ak.field_d.field_Ib - -2) / 2;
                        pf.field_h.a(40, ak.field_d.field_cb + -40, 0, -2 + var9, (byte) 64);
                        if ((o.field_e.field_jc ^ -1) < (o.field_e.field_cc ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        pf.field_h.field_Mb = wg.field_d.toUpperCase();
                        pf.field_h.field_eb = false;
                        if (var19 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        pf.field_h.field_Mb = lq.field_a.toUpperCase();
                        pf.field_h.field_eb = true;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        pf.field_h.field_Jb = fm.field_b.field_Jb;
                        if ((uf.field_c ^ -1) < -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((uf.field_c ^ -1) != -2) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10_ref_String = ei.field_g;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10_ref_String = rd.a(mq.field_h, new String[]{Integer.toString(uf.field_c)}, (byte) 103);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        pf.field_h.field_Mb = pf.field_h.field_Mb + "<br>" + var10_ref_String;
                        if (-1 != (an.field_h & 16 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (hc.field_c) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        pf.field_h.field_Jb = fm.field_b.field_Gb;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        dn.field_K.a(40, ak.field_d.field_cb + -40, var9, ak.field_d.field_Ib + -var9, (byte) 64);
                        dn.field_K.field_Mb = sn.field_r.toUpperCase();
                        var8 = dn.field_K;
                        stackIn_23_0 = dn.field_K;
                        stackIn_21_0 = stackIn_23_0;
                        if (!param4) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (mh) ((Object) stackIn_21_0);
                        stackIn_22_0 = stackIn_23_0;
                        if ((ic.field_b ^ -1L) != -1L) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = (mh) ((Object) stackIn_22_0);
                        stackIn_24_1 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (mh) ((Object) stackIn_23_0);
                        stackIn_24_1 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_24_0.field_eb = stackIn_24_1 != 0;
                        var10 = 2;
                        if (null == br.field_bc) {
                            statePc = 76;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (qo.field_J == null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        h.field_D = new boolean[cq.field_p];
                        qo.field_J = new byte[cq.field_p];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11 = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (cq.field_p <= var11) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        h.field_D[var11] = false;
                        var11++;
                        if (var19 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var19 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10 >= 2) {
                            statePc = 72;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11 = 0;
                        stackIn_73_0 = 0;
                        stackIn_37_0 = stackIn_73_0;
                        if (var19 != 0) {
                            statePc = 73;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = br.field_bc.length;
                        stackIn_39_1 = var12;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 <= stackIn_39_1) {
                            statePc = 66;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var26 = br.field_bc[var12];
                        var24 = var26;
                        var21 = var24;
                        var13_ref_int__ = var21;
                        stackIn_67_0 = 0;
                        stackIn_41_0 = stackIn_67_0;
                        if (var19 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var14 = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var26.length ^ -1) >= (var14 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var15 = var26[var14];
                        var16 = var21[var14 - -1];
                        stackIn_58_0 = var15;
                        stackIn_44_0 = stackIn_58_0;
                        stackIn_58_1 = -1;
                        stackIn_44_1 = stackIn_58_1;
                        if (var19 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == stackIn_44_1) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((o.field_e.field_Tb[var15] & 255 ^ -1) == (var16 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var19 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var10 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_51_0 = o.field_e.field_jc;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = o.field_e.field_cc;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var17_int = stackIn_51_0;
                        if (var17_int == var16) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var19 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var14 += 2;
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var11 = 1;
                        var14 = -1;
                        var15 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_58_0 = var15;
                        stackIn_58_1 = var26.length;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 >= stackIn_58_1) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var16 = var26[var15];
                        stackIn_39_0 = var16 ^ -1;
                        stackIn_60_0 = stackIn_39_0;
                        stackIn_39_1 = var14 ^ -1;
                        stackIn_60_1 = stackIn_39_1;
                        if (var19 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 < stackIn_60_1) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var14 = var16;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var15 += 2;
                        if (var19 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        h.field_D[var14] = true;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12++;
                        if (var19 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = var11;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var19 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var10++;
                        if (var19 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = 2;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 > kb.field_Yb) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!pe.field_l[12]) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10 = 2;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var10 >= 2) {
                            statePc = 95;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        dn.field_K.field_eb = false;
                        if (!dn.field_K.field_G) {
                            statePc = 164;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if ((cq.field_p ^ -1) >= (var13 ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = h.field_D[var13];
                        stackIn_87_0 = stackOut_80_0 ? 1 : 0;
                        stackIn_81_0 = stackOut_80_0;
                        if (var19 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (!stackIn_81_0) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var25 = "<col=A00000>" + rg.field_b[var13] + "</col>";
                        if (var11_ref == null) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var11_ref = (String) (var11_ref) + ", " + var25;
                        var12 = 1;
                        if (var19 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var11_ref = var25;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var13++;
                        if (var19 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_87_0 = -1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 != (var10 ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var13_ref_String = eq.field_b;
                        if (var12 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var14_ref_String = ki.field_g + (String) (var11_ref);
                        if (var19 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var14_ref_String = rd.a(gk.field_b, new String[]{(String) (var11_ref)}, (byte) 103);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var13_ref_String = bh.field_rb;
                        if (var12 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var14_ref_String = rd.a(br.field_ac, new String[]{(String) (var11_ref)}, (byte) 103);
                        if (var19 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var14_ref_String = ff.field_e + (String) (var11_ref);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        ep.field_e = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                        if (var19 == 0) {
                            statePc = 164;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (null != vl.field_a) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (bl.field_F != null) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (ld.field_v != null) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (null != me.field_e) {
                            statePc = 100;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var11 = 0;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (cq.field_p <= var16) {
                            statePc = 129;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var17_int = 255 & o.field_e.field_Tb[var16];
                        if (var19 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (vl.field_a == null) {
                            statePc = 109;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (vl.field_a[var16] != null) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (vl.field_a[var16][var17_int]) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var11 = 1;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (bl.field_F == null) {
                            statePc = 116;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (null == bl.field_F[var16]) {
                            statePc = 116;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var18_int = bl.field_F[var16][var17_int];
                        if (-1 == (var18_int ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (ea.field_g) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var11 = 1;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var18_int <= var13) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var13 = var18_int;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (ld.field_v == null) {
                            statePc = 125;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (ld.field_v[var16] != null) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var18_int = ld.field_v[var16][var17_int];
                        if (var18_int == 0) {
                            statePc = 123;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (!ea.field_g) {
                            statePc = 122;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var11 = 1;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var14 >= var18_int) {
                            statePc = 125;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var14 = var18_int;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (null == me.field_e) {
                            statePc = 128;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (me.field_e[var16] == null) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var15 = var15 | me.field_e[var16][var17_int];
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var16 = 0;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var17 = vp.field_u.field_Rb.field_bb;
                        var18_ref = (id) ((Object) var17.d(-97));
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var18_ref == null) {
                            statePc = 152;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = var18_ref.i(0);
                        stackIn_153_0 = stackOut_132_0 ? 1 : 0;
                        stackIn_133_0 = stackOut_132_0;
                        if (var19 != 0) {
                            statePc = 153;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (!stackIn_133_0) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var19 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (var11 == 0) {
                            statePc = 140;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (!var18_ref.field_ec) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (var13 > var18_ref.field_Wb) {
                            statePc = 142;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (var18_ref.field_ac < var14) {
                            statePc = 145;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if ((var15 & (var18_ref.field_Ub ^ -1)) > 0) {
                            statePc = 148;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (var12 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 152;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var18_ref = (id) ((Object) var17.a((byte) 116));
                        if (var19 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackIn_153_0 = 2;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (stackIn_153_0 > kb.field_Yb) {
                            statePc = 157;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (pe.field_l[12]) {
                            statePc = 156;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var16 = 0;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (var16 != 0) {
                            statePc = 159;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        dn.field_K.field_eb = false;
                        if (!dn.field_K.field_G) {
                            statePc = 164;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (sb.field_c.field_d.field_Vb == 0) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        ep.field_e = rd.a(ta.field_d, new String[]{mh.field_Z}, (byte) 103);
                        if (var19 == 0) {
                            statePc = 164;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        ep.field_e = ei.field_a;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (0L != ic.field_b) {
                            statePc = 166;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var9 = (int)(ic.field_b + -ue.a(false));
                        var9 = (var9 + 999) / 1000;
                        if (1 <= var9) {
                            statePc = 168;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var9 = 1;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var8.field_Mb = rd.a(mn.field_w, new String[]{Integer.toString(var9)}, (byte) 103);
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        um.field_b.field_Mb = rd.a(rl.field_d, new String[]{Integer.toString(o.field_e.field_cc), Integer.toString(o.field_e.field_jc)}, (byte) 103);
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackIn_174_0 = qa.field_w;
                        stackIn_171_0 = stackIn_174_0;
                        if (!param2) {
                            statePc = 174;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        stackIn_174_0 = (mh) ((Object) stackIn_171_0);
                        stackIn_172_0 = stackIn_174_0;
                        if (param1) {
                            statePc = 174;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackIn_174_0 = (mh) ((Object) stackIn_172_0);
                        stackIn_173_0 = stackIn_174_0;
                        if (hc.field_c) {
                            statePc = 174;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackIn_175_0 = (mh) ((Object) stackIn_173_0);
                        stackIn_175_1 = 1;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackIn_175_0 = (mh) ((Object) stackIn_174_0);
                        stackIn_175_1 = 0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        ((mh) (Object) stackIn_175_0).a(stackIn_175_1 != 0, -15211);
                        stackIn_179_0 = ak.field_d;
                        stackIn_176_0 = stackIn_179_0;
                        if (!param2) {
                            statePc = 179;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        stackIn_179_0 = (mh) ((Object) stackIn_176_0);
                        stackIn_177_0 = stackIn_179_0;
                        if (param1) {
                            statePc = 179;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackIn_179_0 = (mh) ((Object) stackIn_177_0);
                        stackIn_178_0 = stackIn_179_0;
                        if (hc.field_c) {
                            statePc = 179;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackIn_180_0 = (mh) ((Object) stackIn_178_0);
                        stackIn_180_1 = 1;
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        stackIn_180_0 = (mh) ((Object) stackIn_179_0);
                        stackIn_180_1 = 0;
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        ((mh) (Object) stackIn_180_0).a(stackIn_180_1 != 0, -15211);
                        stackIn_184_0 = wi.field_j;
                        stackIn_181_0 = stackIn_184_0;
                        if (!param2) {
                            statePc = 184;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackIn_184_0 = (mh) ((Object) stackIn_181_0);
                        stackIn_182_0 = stackIn_184_0;
                        if (param1) {
                            statePc = 184;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackIn_184_0 = (mh) ((Object) stackIn_182_0);
                        stackIn_183_0 = stackIn_184_0;
                        if (!hc.field_c) {
                            statePc = 184;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackIn_185_0 = (mh) ((Object) stackIn_183_0);
                        stackIn_185_1 = 1;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        stackIn_185_0 = (mh) ((Object) stackIn_184_0);
                        stackIn_185_1 = 0;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        ((mh) (Object) stackIn_185_0).a(stackIn_185_1 != 0, -15211);
                        if (param0) {
                            statePc = 187;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        var20 = (jp[]) null;
                        nh.a(-9, -55, 119, -100, (jp[]) null, -102);
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        sb.field_c.field_d.i(0);
                        if (null != o.field_e) {
                            statePc = 189;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if ((ij.field_e.field_L ^ -1) == -1) {
                            statePc = 191;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        vg.a(o.field_e.e((byte) 123), false, param3);
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (-1 != (pf.field_h.field_L ^ -1)) {
                            statePc = 193;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        hc.field_c = true;
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (-1 == (dn.field_K.field_L ^ -1)) {
                            statePc = 196;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        sl.field_w = true;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (0 != nd.field_a.field_L) {
                            statePc = 198;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        hc.field_c = false;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        ip.a(param3, o.field_e, false, false);
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 201: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw qb.a((Throwable) ((Object) var5), "nh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 202: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        om stackIn_15_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        om stackOut_14_0;
        id var1 = null;
        om var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1 = (id) ((Object) ua.field_c.d(-50));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var1 == null) {
                      break L4;
                    } else {
                      stackIn_29_0 = -1;

                      stackIn_29_1 = var1.field_ic ^ -1;

                      if (var2 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_29_0 == stackIn_29_1) {
                              var1.field_kc = 0;
                              if (!var1.i(param0 + 0)) {
                                break L6;
                              } else {
                                var1.b((byte) 111);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          L7: while (true) {
                            var1 = (id) ((Object) mp.field_Tb.a((byte) 116));
                            if (var2 == 0) {
                              if (var1 == null) {
                                break L2;
                              } else {
                                if (var2 != 0) {
                                  break L3;
                                } else {
                                  if (var1.field_ic > 0) {
                                    var1.field_ic = var1.field_ic - 1;
                                    stackIn_29_0 = -1;
                                    stackIn_29_1 = var1.field_ic ^ -1;
                                    continue L5;
                                  } else {
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        L8: {
                          if (stackIn_29_0 <= stackIn_29_1) {
                            break L8;
                          } else {
                            var1.field_ic = var1.field_ic - 1;
                            if (var1.field_ic == 0) {
                              var1.field_kc = 0;
                              if (var1.i(0)) {
                                var1.b((byte) 111);
                                break L8;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1 = (id) ((Object) ua.field_c.a((byte) 116));
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L9: {
                    var1_ref = (om) ((Object) rq.field_a.d(-14));
                    if (param0 == 0) {
                      break L9;
                    } else {
                      field_b = -23;
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var1_ref == null) {
                          break L12;
                        } else {
                          stackOut_14_0 = (om) (var1_ref);
                          stackIn_23_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var2 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if ((stackIn_15_0.field_Wb ^ -1) < -1) {
                                var1_ref.field_Wb = var1_ref.field_Wb - 1;
                                if (var1_ref.field_Wb == 0) {
                                  var1_ref.field_Zb = 0;
                                  if (!var1_ref.h(param0 ^ -15)) {
                                    break L13;
                                  } else {
                                    var1_ref.b((byte) 111);
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            var1_ref = (om) ((Object) rq.field_a.a((byte) 116));
                            if (var2 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackIn_23_0 = mp.field_Tb.d(-21);
                      break L11;
                    }
                    var1 = (id) ((Object) stackIn_23_0);
                    L14: while (true) {
                      if (var1 == null) {
                        break L2;
                      } else {
                        if (var2 != 0) {
                          break L3;
                        } else {
                          L15: {
                            if (var1.field_ic > 0) {
                              var1.field_ic = var1.field_ic - 1;
                              stackIn_29_0 = -1;
                              stackIn_29_1 = var1.field_ic ^ -1;
                              if (stackIn_29_0 == stackIn_29_1) {
                                var1.field_kc = 0;
                                if (!var1.i(param0 + 0)) {
                                  break L15;
                                } else {
                                  var1.b((byte) 111);
                                  break L15;
                                }
                              } else {
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                          var1 = (id) ((Object) mp.field_Tb.a((byte) 116));
                          if (var2 == 0) {
                            continue L14;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref2), "nh.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        int var1 = 17 / ((param0 - -45) / 59);
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = "Security";
    }
}
