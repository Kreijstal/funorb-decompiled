/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static qm field_d;
    static int field_f;
    static String field_e;
    static byte[][] field_c;
    static ig field_a;
    static String[] field_b;

    final static void a(boolean param0, int param1) {
        dd.a(param0, false, (byte) 66);
        if (param1 != 841566312) {
            field_f = 7;
        }
    }

    final static void a(int param0, byte param1, ck[] param2, int param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
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
                    var22 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 != null) {
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
                        if (-1 <= (param3 ^ -1)) {
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
                        if (-1 <= (param0 ^ -1)) {
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
                        if (null == param2[3]) {
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
                        stackIn_10_0 = param2[3].field_K;
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
                        stackIn_10_0 = 0;
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
                        if (param2[5] != null) {
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
                        stackIn_13_0 = 0;
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
                        stackIn_13_0 = param2[5].field_K;
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
                        if (param2[1] == null) {
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
                    try {
                        stackIn_16_0 = param2[1].field_C;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = stackIn_16_0;
                        if (param2[7] == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = param2[7].field_C;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = stackIn_19_0;
                        var10 = param3 + param5;
                        var11 = param4 + param0;
                        var12 = param5 + var6_int;
                        if (param1 == 50) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var13 = var10 - var7;
                        var14 = param4 + var8;
                        var15 = -var9 + var11;
                        var16 = var12;
                        var17 = var13;
                        if (var16 > var17) {
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
                        var17 = param5 + var6_int * param3 / (var7 + var6_int);
                        var16 = param5 + var6_int * param3 / (var7 + var6_int);
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
                        if (var18 <= var19) {
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
                        var19 = var8 * param0 / (var8 - -var9) + param4;
                        var18 = var8 * param0 / (var8 - -var9) + param4;
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
                        hk.b(hl.field_e);
                        if (null == param2[0]) {
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
                        hk.f(param5, param4, var16, var18);
                        param2[0].c(param5, param4);
                        hk.a(hl.field_e);
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
                        if (null != param2[2]) {
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
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        hk.f(var17, param4, var10, var18);
                        param2[2].c(var13, param4);
                        hk.a(hl.field_e);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (null == param2[6]) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        hk.f(param5, var19, var16, var11);
                        param2[6].c(param5, var15);
                        hk.a(hl.field_e);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param2[8] != null) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        hk.f(var17, var19, var10, var11);
                        param2[8].c(var13, var15);
                        hk.a(hl.field_e);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == param2[1]) {
                            statePc = 44;
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
                        if (-1 == (param2[1].field_K ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        hk.f(var16, param4, var17, var18);
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
                        if (var20 >= var13) {
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
                        param2[1].c(var20, param4);
                        var20 = var20 + param2[1].field_K;
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
                        hk.a(hl.field_e);
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
                        if (null == param2[7]) {
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
                        if (param2[7].field_K != 0) {
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
                        hk.f(var16, var19, var17, var11);
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
                        if (var20 >= var13) {
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
                        param2[7].c(var20, var15);
                        var20 = var20 + param2[7].field_K;
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
                        hk.a(hl.field_e);
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
                        if (param2[3] == null) {
                            statePc = 61;
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
                        if (param2[3].field_C == 0) {
                            statePc = 61;
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
                        hk.f(param5, var18, var16, var19);
                        var20 = var14;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var15 <= var20) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param2[3].c(param5, var20);
                        var20 = var20 + param2[3].field_C;
                        if (var22 != 0) {
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
                        if (var22 == 0) {
                            statePc = 56;
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
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        hk.a(hl.field_e);
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
                        if (null == param2[5]) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (param2[5].field_C != 0) {
                            statePc = 64;
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
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        hk.f(var17, var18, var10, var19);
                        var20 = var14;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var20 >= var15) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param2[5].c(var13, var20);
                        var20 = var20 + param2[5].field_C;
                        if (var22 != 0) {
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
                        if (var22 == 0) {
                            statePc = 65;
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
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        hk.a(hl.field_e);
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
                        if (param2[4] == null) {
                            statePc = 90;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (0 == param2[4].field_K) {
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
                        if (param2[4].field_C != 0) {
                            statePc = 74;
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
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        hk.f(var16, var18, var17, var19);
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
                        if (var20 >= var15) {
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
                        if (var21 >= var13) {
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
                        param2[4].c(var21, var20);
                        var21 = var21 + param2[4].field_K;
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
                        var20 = var20 + param2[4].field_C;
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
                        hk.a(hl.field_e);
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
                    stackIn_88_1 = new StringBuilder().append("vk.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_87_1 = stackIn_88_1;
                    if (param2 == null) {
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
                    throw dh.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 90: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var9;
        int stackIn_4_0 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param6 != -22981) {
          return;
        } else {
          L0: {
            if ((param4 ^ -1) <= -81) {
              stackIn_4_0 = 54;
              break L0;
            } else {
              stackIn_4_0 = 18 * (param4 / 20);
              break L0;
            }
          }
          L1: {
            L2: {
              var7 = stackIn_4_0;
              var8 = 0;
              if (60 > param4) {
                break L2;
              } else {
                L3: {
                  if (-81 < (param4 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (-94 >= (param4 ^ -1)) {
                        break L4;
                      } else {
                        var8 = vl.a(23841, 80, 40 + 18 * ve.field_ic[-79 + param4]);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    hk.a(-48 + param1, -2 + param5 + 54, 96, 40, 4, 65280, 100);
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                if (var9 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var7 = var7 + vl.a(param6 ^ -1254, 80, 40 + 18 * param3);
            break L1;
          }
          fb.field_c[param2][0].c(-45 + param1, param5 - -72, 18, 18);
          fb.field_c[param2][0].c(param1 + -27, 72 + param5, 18, 18);
          fb.field_c[param2][0].c(-27 + param1, param5 - -54, 18, 18);
          fb.field_c[param2][0].c(36 + param1 - 45, param5 - -var7 + var8, 18, -var8 + 18);
          fb.field_c[param2][3].c(54 + (param1 + -45), var8 + param5 - -var7, 18, 18 - var8);
          fb.field_c[param2][3].c(36 + (param1 + -45), param5 - -72, 18, 18);
          fb.field_c[param2][3].c(param1 - -9, param5 - -72, 18, 18);
          fb.field_c[param2][3].c(72 + (-45 + param1), 72 + param5, 18, 18);
          return;
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vg var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gb.field_Pb = new int[]{0, param0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = jb.field_g.length;
                        var21 = new int[var1_int];
                        var20 = var21;
                        var2 = var20;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_int <= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_ref_vg = jb.field_g[var3];
                        var17 = var4_ref_vg;
                        var17 = var4_ref_vg;
                        var4_ref_vg.a(param0 + -14200);
                        kc.b(8192, var3);
                        var5 = var4_ref_vg.field_H + var4_ref_vg.field_f >> -585987071;
                        var6 = var4_ref_vg.field_b - -var4_ref_vg.field_n >> -1997616223;
                        var7 = var4_ref_vg.field_i + var4_ref_vg.field_a >> -1541714015;
                        var8 = gb.field_Pb[9] >> 849399746;
                        var9 = gb.field_Pb[10] >> -765538462;
                        var10_int = gb.field_Pb[11] >> -1876878686;
                        var11 = var9 * o.field_e[4] + (o.field_e[3] * var8 - -(var10_int * o.field_e[5])) >> -385907858;
                        var12 = var8 * o.field_e[6] + var9 * o.field_e[7] - -(o.field_e[8] * var10_int) >> -169876850;
                        var13 = var10_int * o.field_e[11] + var9 * o.field_e[10] + var8 * o.field_e[9] >> 268344750;
                        var2[var3] = var6 * var12 + var5 * var11 - -(var7 * var13) >> -8557136;
                        var3++;
                        if (var19 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var19 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = gb.field_Pb[9] >> -1155241432;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = gb.field_Pb[10] >> -465257400;
                        var5 = gb.field_Pb[11] >> 2107408328;
                        var6 = gd.field_e << -1099401052;
                        var7 = 0;
                        var8 = sk.a(var6, -58) >> 1652838728;
                        var9 = ue.a(var6, 112) >> 841566312;
                        if (-1 == bh.field_g) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 == (pm.field_f ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = -320 + bh.field_g;
                        var8 = 240 - pm.field_f;
                        var9 = -128;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                        var8 = (int)((double)var8 * var10);
                        var7 = (int)((double)var7 * var10);
                        var9 = (int)((double)var9 * var10);
                        var12 = -var3 + var7;
                        var13 = var8 - var4;
                        var14 = -var5 + var9;
                        var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
                        var12 = (int)((double)var12 * var10);
                        var13 = (int)((double)var13 * var10);
                        var14 = (int)((double)var14 * var10);
                        var15 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = jb.field_g.length;
                        stackIn_12_1 = var15;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 <= stackIn_12_1) {
                            statePc = 30;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var16 = 0;
                        if (var19 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var17_int = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var17_int >= jb.field_g.length) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_12_0 = var21[var16];
                        stackIn_17_0 = stackIn_12_0;
                        stackIn_12_1 = var21[var17_int];
                        stackIn_17_1 = stackIn_12_1;
                        if (var19 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 < stackIn_17_1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var16 = var17_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var17_int++;
                        if (var19 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var21[var16] = -2147483648;
                        var17 = jb.field_g[var16];
                        kc.b(8192, var16);
                        var18 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (3 <= var18) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        o.field_e[var18] = o.field_e[var18] + df.field_U[var15][var18];
                        var18++;
                        if (var19 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var19 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        on.a(true, gb.field_Pb, false, o.field_e, true, false, var17);
                        ug.a(var17, var8, var12, var7, false, var14, var9, var13);
                        var15++;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) runtimeException), "vk.C(" + param0 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_c = (byte[][]) null;
                break L1;
              }
            }
            if (-4 != (param1 ^ -1)) {
              if (6 != param1) {
                if (7 != param1) {
                  if ((param1 ^ -1) == -9) {
                    stackIn_14_0 = pm.field_a;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1 == 9) {
                      stackIn_18_0 = el.field_I;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param1 != 10) {
                        if ((param1 ^ -1) != -12) {
                          if (-15 == (param1 ^ -1)) {
                            stackIn_28_0 = cm.a((byte) 119, pd.field_c, new String[]{param0});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackIn_24_0 = dc.field_i;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_21_0 = kb.field_b;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = qn.field_pb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = (String) (field_e);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = rk.field_U;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("vk.B(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L2;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2;
        String var3;
        int stackIn_9_0 = 0;
        L0: {
          L1: {
            L2: {
              if ((id.field_P ^ -1) <= -4) {
                break L2;
              } else {
                if ((te.field_p ^ -1) > -3) {
                  break L1;
                } else {
                  if (!bj.field_d[12]) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            pn.a(false, true, true);
            if (!client.field_A) {
              break L0;
            } else {
              break L1;
            }
          }
          L3: {
            if (ph.n(-30146)) {
              stackIn_9_0 = 0;
              break L3;
            } else {
              stackIn_9_0 = 1;
              break L3;
            }
          }
          var2 = stackIn_9_0;
          var3 = rg.field_f;
          wj.a(var2, -118, false, 1, param0, var3);
          break L0;
        }
        L4: {
          if (param1 <= -29) {
            break L4;
          } else {
            vk.a(-124);
            break L4;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = (byte[][]) null;
        field_e = null;
        if (param0 != -93) {
            vk.a(true, -94);
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_d = new qm(9, 0, 4, 1);
        field_e = "This game is full.";
        field_c = new byte[250][];
        field_b = new String[]{"Move left:", "Move right:", "Rotate left:", "Rotate right:", "or", "Drop shape:", "Leaderboard:"};
    }
}
