/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static mh field_a;
    static String field_d;
    static int field_b;
    static rg field_c;

    final static void a(int param0, int param1, int param2, int param3, jp[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        jp[] stackIn_71_0 = null;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        jp[] stackIn_101_0 = null;
        int stackIn_109_0 = 0;
        jp[] stackIn_116_0 = null;
        int stackIn_128_0 = 0;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_141_2 = null;
        int stackOut_4_0;
        int stackOut_12_0;
        int stackOut_14_0;
        int stackOut_17_0;
        int stackOut_19_0;
        int stackOut_23_0;
        int stackOut_25_0;
        int stackOut_28_0;
        int stackOut_30_0;
        int stackOut_55_0;
        int stackOut_63_0;
        jp[] stackOut_70_0;
        int stackOut_78_0;
        int stackOut_85_0;
        int stackOut_93_0;
        jp[] stackOut_100_0;
        int stackOut_108_0;
        jp[] stackOut_115_0;
        int stackOut_127_0;
        RuntimeException stackOut_137_0;
        StringBuilder stackOut_137_1;
        RuntimeException stackOut_138_0;
        StringBuilder stackOut_138_1;
        String stackOut_138_2;
        RuntimeException stackOut_140_0;
        StringBuilder stackOut_140_1;
        String stackOut_140_2;
        int statePc = 0;
        Throwable caughtException = null;
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
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (-1 <= (param0 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = param1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((stackIn_5_0 ^ -1) >= -1) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (param4[3] != null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_15_0 = stackOut_12_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = param4[3].field_x;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6_int = stackIn_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param4[5] == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = param4[5].field_x;
                        stackIn_20_0 = stackOut_17_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = stackIn_20_0;
                        if (param2 == -40) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        if (null == param4[1]) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = param4[1].field_z;
                        stackIn_26_0 = stackOut_23_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8 = stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param4[7] != null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 0;
                        stackIn_31_0 = stackOut_28_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = param4[7].field_z;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = stackIn_31_0;
                        var10 = param0 + param3;
                        var11 = param5 + param1;
                        var12 = var6_int + param3;
                        var13 = -var7 + var10;
                        var14 = var8 + param5;
                        var15 = var11 + -var9;
                        var16 = var12;
                        var17 = var13;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((var16 ^ -1) < (var17 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var17 = param0 * var6_int / (var7 + var6_int) + param3;
                        var16 = param0 * var6_int / (var7 + var6_int) + param3;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var18 = var14;
                        var19 = var15;
                        if (var19 >= var18) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var19 = param1 * var8 / (var8 + var9) + param5;
                        var18 = param1 * var8 / (var8 + var9) + param5;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        lb.a(rg.field_g);
                        if (null == param4[0]) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        lb.d(param3, param5, var16, var18);
                        param4[0].c(param3, param5);
                        lb.b(rg.field_g);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == param4[2]) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        lb.d(var17, param5, var10, var18);
                        param4[2].c(var13, param5);
                        lb.b(rg.field_g);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null == param4[6]) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        lb.d(param3, var19, var16, var11);
                        param4[6].c(param3, var15);
                        lb.b(rg.field_g);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param4[8] != null) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        lb.d(var17, var19, var10, var11);
                        param4[8].c(var13, var15);
                        lb.b(rg.field_g);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (param4[1] == null) {
                            statePc = 69;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 != param4[1].field_x) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        lb.d(var16, param5, var17, var18);
                        var20 = var12;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var13 <= var20) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        param4[1].c(var20, param5);
                        var20 = var20 + param4[1].field_x;
                        stackOut_63_0 = var22;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var22 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (param4[7] == null) {
                            statePc = 84;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = (jp[]) param4;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (((jp) (Object) stackIn_71_0[7]).field_x != 0) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        lb.d(var16, var19, var17, var11);
                        var20 = var12;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((var13 ^ -1) >= (var20 ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        param4[7].c(var20, var15);
                        var20 = var20 + param4[7].field_x;
                        stackOut_78_0 = var22;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var22 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (param4[3] == null) {
                            statePc = 99;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = -1;
                        stackIn_86_0 = stackOut_85_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 != (param4[3].field_z ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        lb.d(param3, var18, var16, var19);
                        var20 = var14;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var20 >= var15) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        param4[3].c(param3, var20);
                        var20 = var20 + param4[3].field_z;
                        stackOut_93_0 = var22;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var22 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (null == param4[5]) {
                            statePc = 114;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = (jp[]) param4;
                        stackIn_101_0 = stackOut_100_0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (((jp) (Object) stackIn_101_0[5]).field_z != 0) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        lb.d(var17, var18, var10, var19);
                        var20 = var14;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var15 <= var20) {
                            statePc = 113;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        param4[5].c(var13, var20);
                        var20 = var20 + param4[5].field_z;
                        stackOut_108_0 = var22;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var22 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (null == param4[4]) {
                            statePc = 142;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = (jp[]) param4;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (((jp) (Object) stackIn_116_0[4]).field_x == 0) {
                            statePc = 142;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((param4[4].field_z ^ -1) == -1) {
                            statePc = 142;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        lb.d(var16, var18, var17, var19);
                        var20 = var14;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if ((var20 ^ -1) <= (var15 ^ -1)) {
                            statePc = 134;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var22 != 0) {
                            statePc = 142;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var21 = var12;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if ((var21 ^ -1) <= (var13 ^ -1)) {
                            statePc = 132;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        param4[4].c(var21, var20);
                        var21 = var21 + param4[4].field_x;
                        stackOut_127_0 = var22;
                        stackIn_128_0 = stackOut_127_0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (stackIn_128_0 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (var22 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var20 = var20 + param4[4].field_z;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var22 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        lb.b(rg.field_g);
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 136: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    try {
                        stackOut_137_0 = (RuntimeException) var6;
                        stackOut_137_1 = new StringBuilder().append("nh.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        if (param4 == null) {
                            statePc = 140;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
                        stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
                        stackOut_138_2 = "{...}";
                        stackIn_141_0 = stackOut_138_0;
                        stackIn_141_1 = stackOut_138_1;
                        stackIn_141_2 = stackOut_138_2;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 140: {
                    stackOut_140_0 = (RuntimeException) (Object) stackIn_140_0;
                    stackOut_140_1 = (StringBuilder) (Object) stackIn_140_1;
                    stackOut_140_2 = "null";
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    stackIn_141_2 = stackOut_140_2;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    throw qb.a((Throwable) (Object) stackIn_141_0, (String) (Object) (stackIn_141_2 + 44 + param5 + 41));
                }
                case 142: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(jp[] param0, int param1, int param2, int param3, int param4, dh param5, int param6, int param7, int param8, jp[] param9, int param10, jp[] param11, int param12, byte param13, int param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackOut_8_0;
        StringBuilder stackOut_8_1;
        RuntimeException stackOut_9_0;
        StringBuilder stackOut_9_1;
        String stackOut_9_2;
        RuntimeException stackOut_11_0;
        StringBuilder stackOut_11_1;
        String stackOut_11_2;
        RuntimeException stackOut_12_0;
        StringBuilder stackOut_12_1;
        RuntimeException stackOut_13_0;
        StringBuilder stackOut_13_1;
        String stackOut_13_2;
        RuntimeException stackOut_15_0;
        StringBuilder stackOut_15_1;
        String stackOut_15_2;
        RuntimeException stackOut_16_0;
        StringBuilder stackOut_16_1;
        RuntimeException stackOut_17_0;
        StringBuilder stackOut_17_1;
        String stackOut_17_2;
        RuntimeException stackOut_19_0;
        StringBuilder stackOut_19_1;
        String stackOut_19_2;
        RuntimeException stackOut_20_0;
        StringBuilder stackOut_20_1;
        RuntimeException stackOut_21_0;
        StringBuilder stackOut_21_1;
        String stackOut_21_2;
        RuntimeException stackOut_23_0;
        StringBuilder stackOut_23_1;
        String stackOut_23_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var15_int = param5.field_B - -param5.field_P;
                        var16 = param5.field_B;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param13 == -110) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        nh.a((jp[]) null, -71, 62, -50, 61, (dh) null, 97, 90, 79, (jp[]) null, 117, (jp[]) null, 81, (byte) 46, -119);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        oa.a(param3, var15_int, param10, param2, var15_int, param12, param1, param7, param4, param0, param5, param11, param8, param6, var16, false, param14, param9, param5, var16);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var15 = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) var15;
                        stackOut_8_1 = new StringBuilder().append("nh.C(");
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param0 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param5 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param9 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param10).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param11 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw qb.a((Throwable) (Object) stackIn_24_0, (String) (Object) (stackIn_24_2 + 44 + param12 + 44 + param13 + 44 + param14 + 41));
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        mh var5_ref = null;
        mh var6 = null;
        mh var7 = null;
        mh var8 = null;
        int var9 = 0;
        String var9_ref = null;
        String var10_ref = null;
        int var10 = 0;
        int var11 = 0;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        vl var17 = null;
        id var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_26_0 = false;
        mh stackIn_34_0 = null;
        mh stackIn_35_0 = null;
        long stackIn_35_1 = 0L;
        mh stackIn_36_0 = null;
        mh stackIn_38_0 = null;
        mh stackIn_40_0 = null;
        mh stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_108_0 = 0;
        boolean stackIn_120_0 = false;
        int stackIn_128_0 = 0;
        int[][] stackIn_140_0 = null;
        int[][] stackIn_144_0 = null;
        Object stackIn_148_0 = null;
        boolean[][] stackIn_158_0 = null;
        boolean[][] stackIn_162_0 = null;
        int[][] stackIn_185_0 = null;
        boolean stackIn_193_0 = false;
        boolean stackIn_211_0 = false;
        id stackIn_221_0 = null;
        int stackIn_255_0 = 0;
        boolean[] stackIn_257_0 = null;
        mh stackIn_284_0 = null;
        mh stackIn_285_0 = null;
        boolean stackIn_285_1 = false;
        mh stackIn_286_0 = null;
        mh stackIn_288_0 = null;
        mh stackIn_289_0 = null;
        boolean stackIn_289_1 = false;
        mh stackIn_290_0 = null;
        mh stackIn_292_0 = null;
        mh stackIn_294_0 = null;
        mh stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        mh stackIn_296_0 = null;
        mh stackIn_297_0 = null;
        boolean stackIn_297_1 = false;
        mh stackIn_298_0 = null;
        mh stackIn_300_0 = null;
        mh stackIn_301_0 = null;
        boolean stackIn_301_1 = false;
        mh stackIn_302_0 = null;
        mh stackIn_304_0 = null;
        mh stackIn_306_0 = null;
        mh stackIn_307_0 = null;
        int stackIn_307_1 = 0;
        mh stackIn_308_0 = null;
        mh stackIn_309_0 = null;
        boolean stackIn_309_1 = false;
        mh stackIn_310_0 = null;
        mh stackIn_312_0 = null;
        mh stackIn_313_0 = null;
        boolean stackIn_313_1 = false;
        mh stackIn_314_0 = null;
        mh stackIn_316_0 = null;
        mh stackIn_318_0 = null;
        mh stackIn_319_0 = null;
        int stackIn_319_1 = 0;
        Throwable caughtException = null;
        int stackOut_1_0;
        int stackOut_2_0;
        int stackOut_2_1;
        int stackOut_4_0;
        int stackOut_4_1;
        boolean stackOut_25_0;
        mh stackOut_33_0;
        mh stackOut_34_0;
        long stackOut_34_1;
        mh stackOut_35_0;
        mh stackOut_36_0;
        mh stackOut_38_0;
        int stackOut_38_1;
        mh stackOut_40_0;
        int stackOut_40_1;
        int stackOut_57_0;
        int stackOut_59_0;
        int stackOut_59_1;
        int stackOut_61_0;
        int stackOut_65_0;
        int stackOut_65_1;
        int stackOut_78_0;
        int stackOut_80_0;
        int stackOut_90_0;
        int stackOut_90_1;
        int stackOut_92_0;
        int stackOut_92_1;
        int stackOut_99_0;
        int stackOut_107_0;
        boolean stackOut_119_0;
        int stackOut_127_0;
        int[][] stackOut_139_0;
        int[][] stackOut_143_0;
        Object stackOut_147_0;
        boolean[][] stackOut_157_0;
        boolean[][] stackOut_161_0;
        int[][] stackOut_184_0;
        boolean stackOut_192_0;
        boolean stackOut_210_0;
        id stackOut_220_0;
        int stackOut_254_0;
        boolean[] stackOut_256_0;
        mh stackOut_283_0;
        mh stackOut_284_0;
        boolean stackOut_284_1;
        mh stackOut_285_0;
        mh stackOut_286_0;
        mh stackOut_288_0;
        boolean stackOut_288_1;
        mh stackOut_289_0;
        mh stackOut_290_0;
        mh stackOut_292_0;
        int stackOut_292_1;
        mh stackOut_294_0;
        int stackOut_294_1;
        mh stackOut_295_0;
        mh stackOut_296_0;
        boolean stackOut_296_1;
        mh stackOut_297_0;
        mh stackOut_298_0;
        mh stackOut_300_0;
        boolean stackOut_300_1;
        mh stackOut_301_0;
        mh stackOut_302_0;
        mh stackOut_304_0;
        int stackOut_304_1;
        mh stackOut_306_0;
        int stackOut_306_1;
        mh stackOut_307_0;
        mh stackOut_308_0;
        boolean stackOut_308_1;
        mh stackOut_309_0;
        mh stackOut_310_0;
        mh stackOut_312_0;
        boolean stackOut_312_1;
        mh stackOut_313_0;
        mh stackOut_314_0;
        mh stackOut_316_0;
        int stackOut_316_1;
        mh stackOut_318_0;
        int stackOut_318_1;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = eg.field_m;
                    stackIn_4_0 = stackOut_1_0;
                    stackIn_2_0 = stackOut_1_0;
                    if (param0) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = stackIn_2_0;
                    stackOut_2_1 = 1;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_5_1 = stackOut_2_1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    co.a(stackIn_5_0, stackIn_5_1 != 0);
                    if (o.field_e != null) {
                        statePc = 8;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ij.field_e.field_eb = true;
                    var5_ref = pf.field_h;
                    pf.field_h.field_cb = 0;
                    var5_ref.field_Ib = 0;
                    dn.field_K.field_cb = 0;
                    var6 = dn.field_K;
                    var6.field_Ib = 0;
                    var7 = ke.field_e;
                    ke.field_e.field_cb = 0;
                    var7.field_Ib = 0;
                    if (hn.b((byte) 7)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var9_ref = o.field_e.field_Fc;
                    ba.field_v.field_Mb = rd.a(fm.field_a, new String[1], (byte) 103).toUpperCase();
                    ke.field_e.a(40, ak.field_d.field_cb + -40, 0, ak.field_d.field_Ib, (byte) 64);
                    ke.field_e.field_Mb = rd.a(nm.field_a, new String[1], (byte) 103);
                    var8 = ke.field_e;
                    if (var19 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ba.field_v.field_Mb = ba.field_x.toUpperCase();
                    var9 = (ak.field_d.field_Ib - -2) / 2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    pf.field_h.a(40, ak.field_d.field_cb + -40, 0, -2 + var9, (byte) 64);
                    if ((o.field_e.field_jc ^ -1) < (o.field_e.field_cc ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    pf.field_h.field_Mb = wg.field_d.toUpperCase();
                    pf.field_h.field_eb = false;
                    if (var19 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    pf.field_h.field_Mb = lq.field_a.toUpperCase();
                    pf.field_h.field_eb = true;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    pf.field_h.field_Jb = fm.field_b.field_Jb;
                    if ((uf.field_c ^ -1) < -1) {
                        statePc = 21;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((uf.field_c ^ -1) != -2) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var10_ref = ei.field_g;
                    if (var19 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var10_ref = rd.a(mq.field_h, new String[1], (byte) 103);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    pf.field_h.field_Mb = pf.field_h.field_Mb + "<br>" + var10_ref;
                    if (-1 != (an.field_h & 16 ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = hc.field_c;
                    stackIn_26_0 = stackOut_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    pf.field_h.field_Jb = fm.field_b.field_Gb;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    dn.field_K.a(40, ak.field_d.field_cb + -40, var9, ak.field_d.field_Ib + -var9, (byte) 64);
                    dn.field_K.field_Mb = sn.field_r.toUpperCase();
                    var8 = dn.field_K;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = dn.field_K;
                    stackIn_40_0 = stackOut_33_0;
                    stackIn_34_0 = stackOut_33_0;
                    if (!param4) {
                        statePc = 40;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = (mh) (Object) stackIn_34_0;
                    stackOut_34_1 = ic.field_b;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = (mh) (Object) stackIn_35_0;
                    stackIn_40_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if ((stackIn_35_1 ^ -1L) != -1L) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = (mh) (Object) stackIn_36_0;
                    stackIn_38_0 = stackOut_36_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    stackOut_38_0 = (mh) (Object) stackIn_38_0;
                    stackOut_38_1 = 1;
                    stackIn_41_0 = stackOut_38_0;
                    stackIn_41_1 = stackOut_38_1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = (mh) (Object) stackIn_40_0;
                    stackOut_40_1 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    ((mh) (Object) stackIn_41_0).field_eb = stackIn_41_1 != 0;
                    var10 = 2;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (null == br.field_bc) {
                        statePc = 113;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (qo.field_J == null) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    h.field_D = new boolean[cq.field_p];
                    qo.field_J = new byte[cq.field_p];
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var11 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (cq.field_p <= var11) {
                        statePc = 55;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    h.field_D[var11] = false;
                    var11++;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var19 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var10 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var10 >= 2) {
                        statePc = 107;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var11 = 0;
                    stackOut_57_0 = 0;
                    stackIn_108_0 = stackOut_57_0;
                    stackIn_58_0 = stackOut_57_0;
                    if (var19 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var12 = stackIn_58_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = br.field_bc.length;
                    stackOut_59_1 = var12;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0 <= stackIn_60_1) {
                        statePc = 99;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var13_ref_int__ = br.field_bc[var12];
                    stackOut_61_0 = 0;
                    stackIn_100_0 = stackOut_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    if (var19 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var14 = stackIn_62_0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if ((var13_ref_int__.length ^ -1) >= (var14 ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var15 = var13_ref_int__[var14];
                    var16 = var13_ref_int__[var14 - -1];
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = var15;
                    stackOut_65_1 = -1;
                    stackIn_91_0 = stackOut_65_0;
                    stackIn_91_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (var19 != 0) {
                        statePc = 91;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 == stackIn_66_1) {
                        statePc = 75;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if ((o.field_e.field_Tb[var15] & 255 ^ -1) == (var16 ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var19 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var10 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackOut_78_0 = o.field_e.field_jc;
                    stackIn_81_0 = stackOut_78_0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = o.field_e.field_cc;
                    stackIn_81_0 = stackOut_80_0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var17_int = stackIn_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (var17_int == var16) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var19 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var14 += 2;
                    if (var19 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var11 = 1;
                    var14 = -1;
                    var15 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = var15;
                    stackOut_90_1 = var13_ref_int__.length;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 >= stackIn_91_1) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var16 = var13_ref_int__[var15];
                    stackOut_92_0 = var16 ^ -1;
                    stackOut_92_1 = var14 ^ -1;
                    stackIn_60_0 = stackOut_92_0;
                    stackIn_60_1 = stackOut_92_1;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    if (var19 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (stackIn_93_0 < stackIn_93_1) {
                        statePc = 95;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var14 = var16;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    h.field_D[var14] = true;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackOut_99_0 = var11;
                    stackIn_100_0 = stackOut_99_0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var19 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = 2;
                    stackIn_108_0 = stackOut_107_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 > kb.field_Yb) {
                        statePc = 113;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (!pe.field_l[12]) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var10 = 2;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (var10 >= 2) {
                        statePc = 136;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    dn.field_K.field_eb = false;
                    if (!dn.field_K.field_G) {
                        statePc = 276;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var11_ref = null;
                    var12 = 0;
                    var13 = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if ((cq.field_p ^ -1) >= (var13 ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = h.field_D[var13];
                    stackIn_128_0 = stackOut_119_0 ? 1 : 0;
                    stackIn_120_0 = stackOut_119_0;
                    if (var19 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (!stackIn_120_0) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var14_ref = "<col=A00000>" + rg.field_b[var13] + "</col>";
                    if (null == var11_ref) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var11_ref = var11_ref + ", " + var14_ref;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var11_ref = var14_ref;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var13++;
                    if (var19 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = -1;
                    stackIn_128_0 = stackOut_127_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 != (var10 ^ -1)) {
                        statePc = 132;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var13_ref = eq.field_b;
                    if (var12 == 0) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var14_ref = ki.field_g + var11_ref;
                    if (var19 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var14_ref = rd.a(gk.field_b, new String[1], (byte) 103);
                    statePc = 135;
                    continue stateLoop;
                }
                case 132: {
                    var13_ref = bh.field_rb;
                    if (var12 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var14_ref = rd.a(br.field_ac, new String[1], (byte) 103);
                    if (var19 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var14_ref = ff.field_e + var11_ref;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    ep.field_e = "<col=A00000>" + var13_ref + "<br>" + var14_ref;
                    if (var19 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (null != vl.field_a) {
                        statePc = 153;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    stackOut_139_0 = bl.field_F;
                    stackIn_140_0 = stackOut_139_0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (stackIn_140_0 != null) {
                        statePc = 153;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    stackOut_143_0 = ld.field_v;
                    stackIn_144_0 = stackOut_143_0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (stackIn_144_0 != null) {
                        statePc = 153;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = null;
                    stackIn_148_0 = stackOut_147_0;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if ((Object) (Object) stackIn_148_0 != (Object) (Object) me.field_e) {
                        statePc = 153;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (cq.field_p <= var16) {
                        statePc = 207;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var17_int = 255 & o.field_e.field_Tb[var16];
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (var19 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackOut_157_0 = vl.field_a;
                    stackIn_158_0 = stackOut_157_0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 == null) {
                        statePc = 171;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackOut_161_0 = vl.field_a;
                    stackIn_162_0 = stackOut_161_0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (stackIn_162_0[var16] != null) {
                        statePc = 167;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (vl.field_a[var16][var17_int]) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var11 = 1;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (bl.field_F == null) {
                        statePc = 183;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (null == bl.field_F[var16]) {
                        statePc = 183;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var18_int = bl.field_F[var16][var17_int];
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 181;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (ea.field_g) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var11 = 1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (var18_int <= var13) {
                        statePc = 183;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var13 = var18_int;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if (ld.field_v == null) {
                        statePc = 201;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackOut_184_0 = ld.field_v;
                    stackIn_185_0 = stackOut_184_0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (stackIn_185_0[var16] != null) {
                        statePc = 190;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var18_int = ld.field_v[var16][var17_int];
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (var18_int == 0) {
                        statePc = 199;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    stackOut_192_0 = ea.field_g;
                    stackIn_193_0 = stackOut_192_0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (!stackIn_193_0) {
                        statePc = 198;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var11 = 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var14 >= var18_int) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var14 = var18_int;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (null == me.field_e) {
                        statePc = 206;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (me.field_e[var16] == null) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var15 = var15 | me.field_e[var16][var17_int];
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var16 = 0;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var17 = vp.field_u.field_Rb.field_bb;
                    var18 = (id) (Object) var17.d(-97);
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (var18 == null) {
                        statePc = 254;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    stackOut_210_0 = var18.i(0);
                    stackIn_255_0 = stackOut_210_0 ? 1 : 0;
                    stackIn_211_0 = stackOut_210_0;
                    if (var19 != 0) {
                        statePc = 255;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (!stackIn_211_0) {
                        statePc = 217;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (var19 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (var11 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    stackOut_220_0 = (id) var18;
                    stackIn_221_0 = stackOut_220_0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (!((id) (Object) stackIn_221_0).field_ec) {
                        statePc = 226;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var16 = 1;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (var19 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (var13 > var18.field_Wb) {
                        statePc = 233;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var16 = 1;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (var19 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (var18.field_ac < var14) {
                        statePc = 240;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var16 = 1;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (var19 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if ((var15 & (var18.field_Ub ^ -1)) > 0) {
                        statePc = 247;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var16 = 1;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var19 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (var12 == 0) {
                        statePc = 253;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var18 = (id) (Object) var17.a((byte) 116);
                    if (var19 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    stackOut_254_0 = 2;
                    stackIn_255_0 = stackOut_254_0;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if (stackIn_255_0 > kb.field_Yb) {
                        statePc = 263;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    stackOut_256_0 = pe.field_l;
                    stackIn_257_0 = stackOut_256_0;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (stackIn_257_0[12]) {
                        statePc = 262;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var16 = 0;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (var16 != 0) {
                        statePc = 266;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 266: {
                    dn.field_K.field_eb = false;
                    if (!dn.field_K.field_G) {
                        statePc = 276;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (sb.field_c.field_d.field_Vb == 0) {
                        statePc = 273;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    ep.field_e = rd.a(ta.field_d, new String[1], (byte) 103);
                    if (var19 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    ep.field_e = ei.field_a;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (0L != ic.field_b) {
                        statePc = 279;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var9 = (int)(ic.field_b + -ue.a(false));
                    var9 = (var9 + 999) / 1000;
                    if (1 <= var9) {
                        statePc = 281;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var9 = 1;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    var8.field_Mb = rd.a(mn.field_w, new String[1], (byte) 103);
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    um.field_b.field_Mb = rd.a(rl.field_d, new String[2], (byte) 103);
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = qa.field_w;
                    stackIn_294_0 = stackOut_283_0;
                    stackIn_284_0 = stackOut_283_0;
                    if (!param2) {
                        statePc = 294;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    stackOut_284_0 = (mh) (Object) stackIn_284_0;
                    stackOut_284_1 = param1;
                    stackIn_285_0 = stackOut_284_0;
                    stackIn_285_1 = stackOut_284_1;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (mh) (Object) stackIn_285_0;
                    stackIn_294_0 = stackOut_285_0;
                    stackIn_286_0 = stackOut_285_0;
                    if (stackIn_285_1) {
                        statePc = 294;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = (mh) (Object) stackIn_286_0;
                    stackIn_288_0 = stackOut_286_0;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    stackOut_288_0 = (mh) (Object) stackIn_288_0;
                    stackOut_288_1 = hc.field_c;
                    stackIn_289_0 = stackOut_288_0;
                    stackIn_289_1 = stackOut_288_1;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (mh) (Object) stackIn_289_0;
                    stackIn_294_0 = stackOut_289_0;
                    stackIn_290_0 = stackOut_289_0;
                    if (stackIn_289_1) {
                        statePc = 294;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = (mh) (Object) stackIn_290_0;
                    stackIn_292_0 = stackOut_290_0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    stackOut_292_0 = (mh) (Object) stackIn_292_0;
                    stackOut_292_1 = 1;
                    stackIn_295_0 = stackOut_292_0;
                    stackIn_295_1 = stackOut_292_1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 294: {
                    stackOut_294_0 = (mh) (Object) stackIn_294_0;
                    stackOut_294_1 = 0;
                    stackIn_295_0 = stackOut_294_0;
                    stackIn_295_1 = stackOut_294_1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    ((mh) (Object) stackIn_295_0).a(stackIn_295_1 != 0, -15211);
                    stackOut_295_0 = ak.field_d;
                    stackIn_306_0 = stackOut_295_0;
                    stackIn_296_0 = stackOut_295_0;
                    if (!param2) {
                        statePc = 306;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = (mh) (Object) stackIn_296_0;
                    stackOut_296_1 = param1;
                    stackIn_297_0 = stackOut_296_0;
                    stackIn_297_1 = stackOut_296_1;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (mh) (Object) stackIn_297_0;
                    stackIn_306_0 = stackOut_297_0;
                    stackIn_298_0 = stackOut_297_0;
                    if (stackIn_297_1) {
                        statePc = 306;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = (mh) (Object) stackIn_298_0;
                    stackIn_300_0 = stackOut_298_0;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    stackOut_300_0 = (mh) (Object) stackIn_300_0;
                    stackOut_300_1 = hc.field_c;
                    stackIn_301_0 = stackOut_300_0;
                    stackIn_301_1 = stackOut_300_1;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (mh) (Object) stackIn_301_0;
                    stackIn_306_0 = stackOut_301_0;
                    stackIn_302_0 = stackOut_301_0;
                    if (stackIn_301_1) {
                        statePc = 306;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    stackOut_302_0 = (mh) (Object) stackIn_302_0;
                    stackIn_304_0 = stackOut_302_0;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    stackOut_304_0 = (mh) (Object) stackIn_304_0;
                    stackOut_304_1 = 1;
                    stackIn_307_0 = stackOut_304_0;
                    stackIn_307_1 = stackOut_304_1;
                    statePc = 307;
                    continue stateLoop;
                }
                case 306: {
                    stackOut_306_0 = (mh) (Object) stackIn_306_0;
                    stackOut_306_1 = 0;
                    stackIn_307_0 = stackOut_306_0;
                    stackIn_307_1 = stackOut_306_1;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    ((mh) (Object) stackIn_307_0).a(stackIn_307_1 != 0, -15211);
                    stackOut_307_0 = wi.field_j;
                    stackIn_318_0 = stackOut_307_0;
                    stackIn_308_0 = stackOut_307_0;
                    if (!param2) {
                        statePc = 318;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    stackOut_308_0 = (mh) (Object) stackIn_308_0;
                    stackOut_308_1 = param1;
                    stackIn_309_0 = stackOut_308_0;
                    stackIn_309_1 = stackOut_308_1;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    stackOut_309_0 = (mh) (Object) stackIn_309_0;
                    stackIn_318_0 = stackOut_309_0;
                    stackIn_310_0 = stackOut_309_0;
                    if (stackIn_309_1) {
                        statePc = 318;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    stackOut_310_0 = (mh) (Object) stackIn_310_0;
                    stackIn_312_0 = stackOut_310_0;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    stackOut_312_0 = (mh) (Object) stackIn_312_0;
                    stackOut_312_1 = hc.field_c;
                    stackIn_313_0 = stackOut_312_0;
                    stackIn_313_1 = stackOut_312_1;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    stackOut_313_0 = (mh) (Object) stackIn_313_0;
                    stackIn_318_0 = stackOut_313_0;
                    stackIn_314_0 = stackOut_313_0;
                    if (!stackIn_313_1) {
                        statePc = 318;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    stackOut_314_0 = (mh) (Object) stackIn_314_0;
                    stackIn_316_0 = stackOut_314_0;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    stackOut_316_0 = (mh) (Object) stackIn_316_0;
                    stackOut_316_1 = 1;
                    stackIn_319_0 = stackOut_316_0;
                    stackIn_319_1 = stackOut_316_1;
                    statePc = 319;
                    continue stateLoop;
                }
                case 318: {
                    stackOut_318_0 = (mh) (Object) stackIn_318_0;
                    stackOut_318_1 = 0;
                    stackIn_319_0 = stackOut_318_0;
                    stackIn_319_1 = stackOut_318_1;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    ((mh) (Object) stackIn_319_0).a(stackIn_319_1 != 0, -15211);
                    if (param0) {
                        statePc = 323;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    nh.a(-9, -55, 119, -100, (jp[]) null, -102);
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    sb.field_c.field_d.i(0);
                    if (null != o.field_e) {
                        statePc = 326;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if ((ij.field_e.field_L ^ -1) == -1) {
                        statePc = 330;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    vg.a(o.field_e.e((byte) 123), false, param3);
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (-1 != (pf.field_h.field_L ^ -1)) {
                        statePc = 333;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 333: {
                    hc.field_c = true;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (-1 == (dn.field_K.field_L ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    sl.field_w = true;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (0 != nd.field_a.field_L) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    hc.field_c = false;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    ip.a(param3, o.field_e, false, false);
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        id var1_ref = null;
        om var1_ref2 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        om stackIn_24_0 = null;
        int stackIn_25_0 = 0;
        Object stackIn_39_0 = null;
        id stackIn_43_0 = null;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackOut_3_0;
        int stackOut_3_1;
        om stackOut_23_0;
        int stackOut_24_0;
        nm stackOut_38_0;
        id stackOut_42_0;
        int stackOut_48_0;
        int stackOut_48_1;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = (id) (Object) ua.field_c.d(-50);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var1_ref) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = -1;
                        stackOut_3_1 = var1_ref.field_ic ^ -1;
                        stackIn_49_0 = stackOut_3_0;
                        stackIn_49_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (var2 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 <= stackIn_4_1) {
                            statePc = 16;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_ref.field_ic = var1_ref.field_ic - 1;
                        if (var1_ref.field_ic == 0) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1_ref.field_kc = 0;
                        if (var1_ref.i(0)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var1_ref.b((byte) 111);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var1_ref = (id) (Object) ua.field_c.a((byte) 116);
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var1_ref2 = (om) (Object) rq.field_a.d(-14);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_b = -23;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var1_ref2 == null) {
                            statePc = 38;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (om) var1_ref2;
                        stackIn_39_0 = (Object) (Object) stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var2 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = ((om) (Object) stackIn_24_0).field_Wb;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((stackIn_25_0 ^ -1) < -1) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var1_ref2.field_Wb = var1_ref2.field_Wb - 1;
                        if (var1_ref2.field_Wb == 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var1_ref2.field_Zb = 0;
                        if (!var1_ref2.h(param0 ^ -15)) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var1_ref2.b((byte) 111);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var1_ref2 = (om) (Object) rq.field_a.a((byte) 116);
                        if (var2 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = mp.field_Tb.d(-21);
                        stackIn_39_0 = (Object) (Object) stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var1_ref = (id) (Object) stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == var1_ref) {
                            statePc = 58;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var2 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (id) var1_ref;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (((id) (Object) stackIn_43_0).field_ic > 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var1_ref.field_ic = var1_ref.field_ic - 1;
                        stackOut_48_0 = -1;
                        stackOut_48_1 = var1_ref.field_ic ^ -1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 == stackIn_49_1) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var1_ref.field_kc = 0;
                        if (!var1_ref.i(param0 + 0)) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var1_ref.b((byte) 111);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var1_ref = (id) (Object) mp.field_Tb.a((byte) 116);
                        if (var2 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var1, "nh.B(" + param0 + 41);
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        try {
            int var1_int = 17 / ((param0 - -45) / 59);
            field_d = null;
            field_a = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "nh.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Security";
    }
}
