/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    private byte[] field_a;
    static int field_d;
    static String field_h;
    static String field_i;
    static String field_f;
    private int[] field_c;
    private int[] field_b;
    static String field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, dd[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        dd[] stackIn_63_0 = null;
        int stackIn_74_0 = 0;
        dd[] stackIn_93_0 = null;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        dd[] stackOut_62_0 = null;
        int stackOut_73_0 = 0;
        dd[] stackOut_92_0 = null;
        int stackOut_103_0 = 0;
        int stackOut_107_0 = 0;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param6 == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (0 >= param4) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = param5;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((stackIn_5_0 ^ -1) >= -1) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
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
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == param2) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        if (null != param6[3]) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_19_0 = stackOut_16_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = param6[3].field_w;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param6[5] == null) {
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
                        stackOut_21_0 = param6[5].field_w;
                        stackIn_24_0 = stackOut_21_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null != param6[1]) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = 0;
                        stackIn_29_0 = stackOut_26_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = param6[1].field_y;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = stackIn_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param6[7] != null) {
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
                        stackOut_31_0 = 0;
                        stackIn_34_0 = stackOut_31_0;
                        statePc = 34;
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
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = param6[7].field_y;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10 = stackIn_34_0;
                        var11 = param3 + param4;
                        var12 = param5 + param1;
                        var13 = param3 - -var7_int;
                        var14 = -var8 + var11;
                        var15 = param1 + var9;
                        var16 = var12 + -var10;
                        var17 = var13;
                        var18 = var14;
                        if (param0 >= 71) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return;
                }
                case 36: {
                    try {
                        if ((var18 ^ -1) > (var17 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var18 = param3 - -(param4 * var7_int / (var8 + var7_int));
                        var17 = param3 - -(param4 * var7_int / (var8 + var7_int));
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var19 = var15;
                        var20 = var16;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        qh.a(mb.field_b);
                        if ((var19 ^ -1) < (var20 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var20 = var9 * param5 / (var9 + var10) + param1;
                        var19 = var9 * param5 / (var9 + var10) + param1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null != param6[0]) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
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
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        qh.d(param3, param1, var17, var19);
                        param6[0].a(param3, param1, param2);
                        qh.b(mb.field_b);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null != param6[2]) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        qh.d(var18, param1, var11, var19);
                        param6[2].a(var14, param1, param2);
                        qh.b(mb.field_b);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (param6[6] != null) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        qh.d(param3, var20, var17, var12);
                        param6[6].a(param3, var16, param2);
                        qh.b(mb.field_b);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (param6[8] != null) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        qh.d(var18, var20, var11, var12);
                        param6[8].a(var14, var16, param2);
                        qh.b(mb.field_b);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param6[1] == null) {
                            statePc = 72;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = (dd[]) param6;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((stackIn_63_0[1].field_w ^ -1) != -1) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        qh.d(var17, param1, var18, var19);
                        var21 = var13;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((var21 ^ -1) <= (var14 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param6[1].a(var21, param1, param2);
                        var21 = var21 + param6[1].field_w;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        qh.b(mb.field_b);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (param6[7] == null) {
                            statePc = 83;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = 0;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 != param6[7].field_w) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        qh.d(var17, var20, var18, var12);
                        var21 = var13;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((var14 ^ -1) >= (var21 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        param6[7].a(var21, var16, param2);
                        var21 = var21 + param6[7].field_w;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        qh.b(mb.field_b);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (param6[3] == null) {
                            statePc = 91;
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
                        if (0 == param6[3].field_y) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        qh.d(param3, var19, var17, var20);
                        var21 = var15;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var21 >= var16) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        param6[3].a(param3, var21, param2);
                        var21 = var21 + param6[3].field_y;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        qh.b(mb.field_b);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (param6[5] == null) {
                            statePc = 102;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = (dd[]) param6;
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if ((stackIn_93_0[5].field_y ^ -1) != -1) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        qh.d(var18, var19, var11, var20);
                        var21 = var15;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var16 <= var21) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param6[5].a(var14, var21, param2);
                        var21 = var21 + param6[5].field_y;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        qh.b(mb.field_b);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (param6[4] == null) {
                            statePc = 127;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = 0;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (stackIn_104_0 == param6[4].field_w) {
                            statePc = 127;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = 0;
                        stackIn_108_0 = stackOut_107_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 != param6[4].field_y) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        qh.d(var17, var19, var18, var20);
                        var21 = var15;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var16 <= var21) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var22 = var13;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var22 >= var14) {
                            statePc = 118;
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
                        param6[4].a(var22, var21, param2);
                        var22 = var22 + param6[4].field_w;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var21 = var21 + param6[4].field_y;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        qh.b(mb.field_b);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 121: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    try {
                        stackOut_122_0 = (RuntimeException) var7;
                        stackOut_122_1 = new StringBuilder().append("rk.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
                        stackIn_125_0 = stackOut_122_0;
                        stackIn_125_1 = stackOut_122_1;
                        stackIn_123_0 = stackOut_122_0;
                        stackIn_123_1 = stackOut_122_1;
                        if (param6 == null) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
                        stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
                        stackOut_123_2 = "{...}";
                        stackIn_126_0 = stackOut_123_0;
                        stackIn_126_1 = stackOut_123_1;
                        stackIn_126_2 = stackOut_123_2;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 125: {
                    stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
                    stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
                    stackOut_125_2 = "null";
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    stackIn_126_2 = stackOut_125_2;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    throw wm.a((Throwable) (Object) stackIn_126_0, stackIn_126_2 + 41);
                }
                case 127: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          de.a(-100);
          var1_int = 4 + sa.field_h.field_w + sa.field_h.field_C;
          qh.c(0, -var1_int + 376, 32 + aq.field_a.length * 32, var1_int + 112, 8421504, 127);
          var2 = 0;
          var3 = 56 / ((-35 - param0) / 33);
          try {
            L0: while (true) {
              if (var2 >= aq.field_a.length) {
                break L0;
              } else {
                aq.field_a[var2].c(3);
                var2++;
                continue L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            throw decompiledCaughtException;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "rk.E(" + param0 + 41);
        }
    }

    final static void a(boolean param0, int param1, of param2, int param3, byte param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ko var10 = null;
        int var10_int = 0;
        im var11 = null;
        int var11_int = 0;
        im var12 = null;
        int var13 = 0;
        vh var14 = null;
        vh var15 = null;
        vh var16 = null;
        vh var17 = null;
        vh var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
        String var24_ref = null;
        int var25_int = 0;
        String var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30_int = 0;
        String var30 = null;
        int var31 = 0;
        of stackIn_46_0 = null;
        boolean stackIn_46_1 = false;
        of stackIn_47_0 = null;
        boolean stackIn_47_1 = false;
        of stackIn_48_0 = null;
        boolean stackIn_48_1 = false;
        int stackIn_48_2 = 0;
        int stackIn_65_0 = 0;
        vh stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        vh stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        vh stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        of stackOut_45_0 = null;
        boolean stackOut_45_1 = false;
        of stackOut_47_0 = null;
        boolean stackOut_47_1 = false;
        int stackOut_47_2 = 0;
        of stackOut_46_0 = null;
        boolean stackOut_46_1 = false;
        int stackOut_46_2 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        vh stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        vh stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        vh stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        L0: {
          L1: {
            var31 = Pool.field_O;
            var5_int = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (null == em.field_L) {
              break L1;
            } else {
              L2: {
                if (null != dl.field_j) {
                  break L2;
                } else {
                  if (null != ci.field_d) {
                    break L2;
                  } else {
                    if (w.field_j != null) {
                      break L2;
                    } else {
                      if (null == op.field_a) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L3: while (true) {
                if ((dr.field_c ^ -1) >= (var9 ^ -1)) {
                  break L1;
                } else {
                  var10_int = 255 & em.field_L.field_tc[var9];
                  if (var31 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (null == dl.field_j) {
                        break L4;
                      } else {
                        if (dl.field_j[var9] != null) {
                          if (!dl.field_j[var9][var10_int]) {
                            break L4;
                          } else {
                            var5_int = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == ci.field_d) {
                        break L5;
                      } else {
                        if (null != ci.field_d[var9]) {
                          L6: {
                            var11_int = ci.field_d[var9][var10_int];
                            if (var6 >= var11_int) {
                              break L6;
                            } else {
                              var6 = var11_int;
                              break L6;
                            }
                          }
                          if (0 == var11_int) {
                            break L5;
                          } else {
                            if (rg.field_s) {
                              break L5;
                            } else {
                              var5_int = 1;
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (op.field_a == null) {
                        break L7;
                      } else {
                        if (op.field_a[var9] != null) {
                          var8 = var8 | op.field_a[var9][var10_int];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (null == w.field_j) {
                        break L8;
                      } else {
                        if (null == w.field_j[var9]) {
                          break L8;
                        } else {
                          L9: {
                            var11_int = w.field_j[var9][var10_int];
                            if ((var11_int ^ -1) < (var7 ^ -1)) {
                              var7 = var11_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if ((var11_int ^ -1) == -1) {
                            break L8;
                          } else {
                            if (rg.field_s) {
                              break L8;
                            } else {
                              var5_int = 1;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    var9++;
                    if (var31 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_45_0 = (of) param2;
            stackOut_45_1 = param0;
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (pf.field_c != param2) {
              stackOut_47_0 = (of) (Object) stackIn_47_0;
              stackOut_47_1 = stackIn_47_1;
              stackOut_47_2 = 0;
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L10;
            } else {
              stackOut_46_0 = (of) (Object) stackIn_46_0;
              stackOut_46_1 = stackIn_46_1;
              stackOut_46_2 = 1;
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L10;
            }
          }
          var9 = ((of) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2 != 0, 2, (byte) 86, 2 * (ad.field_x - -2), (2 + ad.field_x) * (4 * param1)) ? 1 : 0;
          break L0;
        }
        L11: {
          var10 = param2.field_Rb.field_T;
          var11 = null;
          if (param4 == -83) {
            break L11;
          } else {
            rk.a(true, -46, (of) null, -111, (byte) 66);
            break L11;
          }
        }
        var12 = (im) (Object) var10.c((byte) 115);
        L12: while (true) {
          L13: {
            L14: {
              if (null == var12) {
                break L14;
              } else {
                var13 = 0;
                if (var31 != 0) {
                  break L13;
                } else {
                  L15: {
                    if (null != var12.field_T) {
                      break L15;
                    } else {
                      L16: {
                        var12.field_ac = new vh(0L, ge.field_s);
                        var12.a(-106, var12.field_ac);
                        var12.field_Tb = new vh(0L, tm.field_d);
                        if (!tq.field_p) {
                          break L16;
                        } else {
                          var12.a(param4 + 165, var12.field_Tb);
                          break L16;
                        }
                      }
                      var12.field_Tb.field_Fb = 2;
                      var12.field_kc = new vh(0L, uo.field_Lb);
                      var12.a(3, var12.field_kc);
                      var12.d((byte) -125);
                      var12.field_lc = new vh(0L, p.field_i);
                      var12.a(13, var12.field_lc);
                      var12.field_Zb = new vh(0L, lh.field_g);
                      var13 = 1;
                      var12.a(37, var12.field_Zb);
                      break L15;
                    }
                  }
                  L17: {
                    var12.field_ac.field_nb = null;
                    var14 = var12.field_ac;
                    var12.field_ac.field_Db = 0;
                    var14.field_gb = 0;
                    var12.field_Tb.field_nb = null;
                    var12.field_Tb.field_Db = 0;
                    var15 = var12.field_Tb;
                    var12.field_lc.field_nb = null;
                    var15.field_gb = 0;
                    var16 = var12.field_lc;
                    var12.field_lc.field_Db = 0;
                    var12.field_Zb.field_nb = null;
                    var16.field_gb = 0;
                    var17 = var12.field_Zb;
                    var12.field_Zb.field_Db = 0;
                    var17.field_gb = 0;
                    var12.field_kc.field_nb = null;
                    var18 = var12.field_kc;
                    var12.field_kc.field_Db = 0;
                    var18.field_gb = 0;
                    var12.field_gb = param2.field_Rb.field_gb;
                    var19 = 0;
                    var20 = var12.field_jc;
                    var21 = 72;
                    if (ci.field_c != param2) {
                      break L17;
                    } else {
                      var21 += 42;
                      break L17;
                    }
                  }
                  L18: {
                    var20 = lr.a(var12.field_ac.field_I, var20, var21);
                    if (var20.equals((Object) (Object) var12.field_jc)) {
                      stackOut_64_0 = 0;
                      stackIn_65_0 = stackOut_64_0;
                      break L18;
                    } else {
                      stackOut_63_0 = 1;
                      stackIn_65_0 = stackOut_63_0;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var22 = stackIn_65_0;
                      if ((var12.field_bc ^ -1) <= -5) {
                        break L20;
                      } else {
                        if (var12.field_bc > 0) {
                          var20 = "<img=" + (var12.field_bc - 1) + ">" + var20;
                          if (var31 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    var20 = "<img=" + (gf.field_a + -4 + var12.field_bc) + ">" + var20;
                    break L19;
                  }
                  L21: {
                    var12.field_ac.field_nb = var20;
                    if (!var12.c(true)) {
                      L22: {
                        L23: {
                          L24: {
                            var23_int = 16764006;
                            var24_int = 16777215;
                            if (var5_int == 0) {
                              break L24;
                            } else {
                              if (!var12.field_Pb) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if ((var12.field_Rb ^ -1) > (var6 ^ -1)) {
                            break L23;
                          } else {
                            if ((var12.field_Xb ^ -1) > (var7 ^ -1)) {
                              break L23;
                            } else {
                              if ((var8 & (var12.field_Nb ^ -1) ^ -1) >= -1) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        var24_int = 8421504;
                        var23_int = 8414771;
                        break L22;
                      }
                      L25: {
                        L26: {
                          var12.field_lc.field_N = var23_int;
                          var12.field_Tb.field_N = var23_int;
                          var12.field_ac.field_N = var23_int;
                          var12.field_ac.field_Bb = var24_int;
                          var12.field_ac.field_P = var24_int;
                          var12.field_ac.field_K = var24_int;
                          var12.field_Tb.field_Bb = var24_int;
                          var12.field_Tb.field_P = var24_int;
                          var12.field_Tb.field_K = var24_int;
                          var12.field_lc.field_Bb = var24_int;
                          var12.field_lc.field_P = var24_int;
                          var12.field_lc.field_K = var24_int;
                          if (wo.field_f != param2) {
                            break L26;
                          } else {
                            if (!em.field_L.field_ec) {
                              var12.field_Zb.field_nb = bl.field_e;
                              if (var31 == 0) {
                                break L25;
                              } else {
                                break L26;
                              }
                            } else {
                              break L25;
                            }
                          }
                        }
                        L27: {
                          if (var12.field_mc) {
                            break L27;
                          } else {
                            L28: {
                              if (var12.field_Yb) {
                                break L28;
                              } else {
                                var12.field_lc.field_nb = kn.field_k;
                                if (var31 == 0) {
                                  break L25;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            var12.field_ac.field_nb = nr.a(new String[1], -1, dj.field_j);
                            var12.field_lc.field_nb = ie.field_b;
                            var12.field_Zb.field_nb = qa.field_u;
                            if (var31 == 0) {
                              break L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var12.field_ac.field_nb = nr.a(new String[1], -1, ma.field_f);
                        var12.field_Zb.field_nb = be.field_K;
                        break L25;
                      }
                      L29: {
                        var25_int = 0;
                        if (null == em.field_L) {
                          break L29;
                        } else {
                          if (!cj.e((byte) 85)) {
                            break L29;
                          } else {
                            if (var12.field_Sb == ve.field_m) {
                              break L29;
                            } else {
                              L30: {
                                if (null != var12.field_lc.field_nb) {
                                  var26 = var12.field_lc.b(true) - -(kj.field_j * 2);
                                  var12.field_lc.b(var19, 2147483647, var25_int, var26, ad.field_x);
                                  var25_int = var25_int + var26;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              if (null != var12.field_Zb.field_nb) {
                                L31: {
                                  L32: {
                                    if (param2 == wo.field_f) {
                                      break L32;
                                    } else {
                                      var26 = var12.field_Zb.b(true) - -(kj.field_j * 2);
                                      if (var31 == 0) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  var26 = 40;
                                  break L31;
                                }
                                var12.field_Zb.b(var19, 2147483647, var25_int, var26, ad.field_x);
                                var25_int = var25_int + var26;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                      }
                      L33: {
                        stackOut_112_0 = var12.field_ac;
                        stackOut_112_1 = var19;
                        stackOut_112_2 = 2147483647;
                        stackOut_112_3 = var25_int;
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_114_1 = stackOut_112_1;
                        stackIn_114_2 = stackOut_112_2;
                        stackIn_114_3 = stackOut_112_3;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        stackIn_113_2 = stackOut_112_2;
                        stackIn_113_3 = stackOut_112_3;
                        if (!tq.field_p) {
                          stackOut_114_0 = (vh) (Object) stackIn_114_0;
                          stackOut_114_1 = stackIn_114_1;
                          stackOut_114_2 = stackIn_114_2;
                          stackOut_114_3 = stackIn_114_3;
                          stackOut_114_4 = 0;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          stackIn_115_3 = stackOut_114_3;
                          stackIn_115_4 = stackOut_114_4;
                          break L33;
                        } else {
                          stackOut_113_0 = (vh) (Object) stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = stackIn_113_2;
                          stackOut_113_3 = stackIn_113_3;
                          stackOut_113_4 = 42;
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_115_1 = stackOut_113_1;
                          stackIn_115_2 = stackOut_113_2;
                          stackIn_115_3 = stackOut_113_3;
                          stackIn_115_4 = stackOut_113_4;
                          break L33;
                        }
                      }
                      L34: {
                        L35: {
                          ((vh) (Object) stackIn_115_0).b(stackIn_115_1, stackIn_115_2, stackIn_115_3, -stackIn_115_4 + (var12.field_gb - var25_int), ad.field_x);
                          var12.field_Tb.field_nb = Integer.toString(var12.field_Rb);
                          var12.field_Tb.b(var19, param4 + -2147483566, -40 + var12.field_gb, 40, ad.field_x);
                          if (!var12.field_ac.field_W) {
                            break L35;
                          } else {
                            if (var22 == 0) {
                              break L35;
                            } else {
                              kk.field_B = var12.field_jc;
                              if (null == lo.field_c) {
                                break L34;
                              } else {
                                if (null == lo.field_c[var12.field_bc]) {
                                  break L34;
                                } else {
                                  kk.field_B = kk.field_B + " - " + lo.field_c[var12.field_bc];
                                  if (var31 == 0) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (!var12.field_ac.field_W) {
                          break L34;
                        } else {
                          if (null == lo.field_c) {
                            break L34;
                          } else {
                            if (lo.field_c[var12.field_bc] == null) {
                              break L34;
                            } else {
                              kk.field_B = lo.field_c[var12.field_bc];
                              break L34;
                            }
                          }
                        }
                      }
                      var19 = var19 + ad.field_x;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L36: {
                    var23 = vk.a(var20, var12.field_hc, (byte) -126);
                    if (null != var23) {
                      var24_int = var12.field_kc.field_I.b(var23, -kj.field_j + (var12.field_gb - kj.field_j));
                      var12.field_kc.field_Eb = var12.field_gc * 256 / mq.field_f;
                      var12.field_kc.field_nb = var23;
                      var12.field_kc.b(var19, 2147483647, kj.field_j, -(2 * kj.field_j) + var12.field_gb, ad.field_x * var24_int);
                      var19 = var19 + ad.field_x * var24_int;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (var9 == 0) {
                      var12.field_Cb = var19 + -var12.field_Db;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    if (var13 == 0) {
                      break L38;
                    } else {
                      param2.field_Rb.a((vh) (Object) var11, 2, (vh) (Object) var12, -119);
                      break L38;
                    }
                  }
                  L39: {
                    if (-1 == (var12.field_R ^ -1)) {
                      break L39;
                    } else {
                      if (var12.c(true)) {
                        break L39;
                      } else {
                        L40: {
                          if (0 != var12.field_lc.field_R) {
                            break L40;
                          } else {
                            L41: {
                              if (0 == var12.field_Zb.field_R) {
                                break L41;
                              } else {
                                jk.a(var12.field_Sb, param3, 0);
                                if (var31 == 0) {
                                  break L39;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            ob.a(0, param2, 0, param4 ^ -9770, ua.field_o, lq.field_W, var12);
                            if (var31 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        k.a(param3, (byte) -127, var12.field_Sb);
                        break L39;
                      }
                    }
                  }
                  L42: {
                    if (!var12.field_db) {
                      break L42;
                    } else {
                      if (!var12.c(true)) {
                        L43: {
                          var24 = null;
                          if (var12.field_Sb == ve.field_m) {
                            L44: {
                              if (var5_int == 0) {
                                break L44;
                              } else {
                                if (!var12.field_Pb) {
                                  var24 = nr.field_db;
                                  break L43;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            if (var7 > var12.field_Xb) {
                              L45: {
                                var25_int = var7 + -var12.field_Xb;
                                if ((var25_int ^ -1) != -2) {
                                  break L45;
                                } else {
                                  var24 = rf.field_f;
                                  break L45;
                                }
                              }
                              var24 = nr.a(new String[2], -1, vm.field_n);
                              break L43;
                            } else {
                              if ((var12.field_Rb ^ -1) > (var6 ^ -1)) {
                                var24 = nr.a(new String[2], -1, ld.field_i);
                                break L43;
                              } else {
                                if (-1 != (var8 & (var12.field_Nb ^ -1) ^ -1)) {
                                  L46: {
                                    var25_int = s.a((var12.field_Nb ^ -1) & var8, (byte) 111);
                                    var24 = dl.field_a;
                                    if (var25_int <= 0) {
                                      break L46;
                                    } else {
                                      if (null == fg.field_f) {
                                        break L46;
                                      } else {
                                        if (fg.field_f.length < var25_int) {
                                          break L46;
                                        } else {
                                          if (fg.field_f[var25_int - 1] != null) {
                                            var24_ref = fg.field_f[var25_int - 1][1];
                                            break L46;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          } else {
                            L47: {
                              if (var5_int == 0) {
                                break L47;
                              } else {
                                if (!var12.field_Pb) {
                                  var24 = nr.a(new String[1], -1, dq.field_c);
                                  break L43;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if ((var7 ^ -1) >= (var12.field_Xb ^ -1)) {
                              if ((var6 ^ -1) >= (var12.field_Rb ^ -1)) {
                                if (-1 == (var8 & (var12.field_Nb ^ -1) ^ -1)) {
                                  break L43;
                                } else {
                                  L48: {
                                    var25_int = s.a((var12.field_Nb ^ -1) & var8, (byte) 100);
                                    var24 = nr.a(new String[1], -1, en.field_a);
                                    if ((var25_int ^ -1) >= -1) {
                                      break L48;
                                    } else {
                                      if (fg.field_f == null) {
                                        break L48;
                                      } else {
                                        if (var25_int > fg.field_f.length) {
                                          break L48;
                                        } else {
                                          if (null == fg.field_f[-1 + var25_int]) {
                                            break L48;
                                          } else {
                                            var24 = nr.a(new String[1], -1, fg.field_f[var25_int - 1][2]);
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L43;
                                }
                              } else {
                                var24 = nr.a(new String[2], -1, jq.field_a);
                                break L43;
                              }
                            } else {
                              L49: {
                                var25_int = -var12.field_Xb + var7;
                                if (1 != var25_int) {
                                  break L49;
                                } else {
                                  var24 = nr.a(new String[1], -1, jd.field_i);
                                  break L49;
                                }
                              }
                              var24 = nr.a(new String[2], -1, sm.field_A);
                              break L43;
                            }
                          }
                        }
                        if (var24 != null) {
                          var24 = "<col=A00000>" + var24;
                          var25 = null;
                          var26 = 0;
                          var27_int = 0;
                          L50: while (true) {
                            L51: {
                              L52: {
                                L53: {
                                  L54: {
                                    if ((dr.field_c ^ -1) >= (var27_int ^ -1)) {
                                      break L54;
                                    } else {
                                      var28 = 255 & em.field_L.field_tc[var27_int];
                                      var29 = 0;
                                      if (var31 != 0) {
                                        break L53;
                                      } else {
                                        L55: {
                                          if (dl.field_j == null) {
                                            break L55;
                                          } else {
                                            if (dl.field_j[var27_int] != null) {
                                              if (!dl.field_j[var27_int][var28]) {
                                                break L55;
                                              } else {
                                                if (var12.field_Pb) {
                                                  break L55;
                                                } else {
                                                  var29 = 1;
                                                  break L55;
                                                }
                                              }
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L56: {
                                          if (ci.field_d == null) {
                                            break L56;
                                          } else {
                                            if (ci.field_d[var27_int] == null) {
                                              break L56;
                                            } else {
                                              L57: {
                                                var30_int = ci.field_d[var27_int][var28];
                                                if (var30_int == 0) {
                                                  break L57;
                                                } else {
                                                  if (rg.field_s) {
                                                    break L57;
                                                  } else {
                                                    if (var12.field_Pb) {
                                                      break L57;
                                                    } else {
                                                      var29 = 1;
                                                      break L57;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var30_int ^ -1) >= (var12.field_Rb ^ -1)) {
                                                break L56;
                                              } else {
                                                var29 = 1;
                                                break L56;
                                              }
                                            }
                                          }
                                        }
                                        L58: {
                                          if (null == w.field_j) {
                                            break L58;
                                          } else {
                                            if (w.field_j[var27_int] == null) {
                                              break L58;
                                            } else {
                                              L59: {
                                                var30_int = w.field_j[var27_int][var28];
                                                if (-1 == (var30_int ^ -1)) {
                                                  break L59;
                                                } else {
                                                  if (rg.field_s) {
                                                    break L59;
                                                  } else {
                                                    if (var12.field_Pb) {
                                                      break L59;
                                                    } else {
                                                      var29 = 1;
                                                      break L59;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var30_int ^ -1) < (var12.field_Xb ^ -1)) {
                                                var29 = 1;
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                        }
                                        L60: {
                                          if (op.field_a == null) {
                                            break L60;
                                          } else {
                                            if (op.field_a[var27_int] != null) {
                                              if ((op.field_a[var27_int][var28] & (var12.field_Nb ^ -1) ^ -1) != -1) {
                                                var29 = 1;
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                        L61: {
                                          if (var29 != 0) {
                                            L62: {
                                              var30 = "<col=A00000>" + ck.field_R[var27_int] + "</col>";
                                              if (null != var25) {
                                                break L62;
                                              } else {
                                                var25 = var30;
                                                if (var31 == 0) {
                                                  break L61;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                            var26 = 1;
                                            var25 = var25 + ", " + var30;
                                            break L61;
                                          } else {
                                            break L61;
                                          }
                                        }
                                        var27_int++;
                                        if (var31 == 0) {
                                          continue L50;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                  if (param2 != wo.field_f) {
                                    break L53;
                                  } else {
                                    if (cj.e((byte) 85)) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L63: {
                                  if (var26 == 0) {
                                    break L63;
                                  } else {
                                    var24 = var24 + "<br>" + tp.field_d + var25;
                                    if (var31 == 0) {
                                      break L51;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                var24 = var24 + "<br>" + nr.a(new String[1], -1, sf.field_x);
                                if (var31 == 0) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                              L64: {
                                if (var26 == 0) {
                                  break L64;
                                } else {
                                  var24 = var24 + "<br>" + hm.field_g + var25;
                                  if (var31 == 0) {
                                    break L51;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              var24 = var24 + "<br>" + nr.a(new String[1], -1, ii.field_c);
                              break L51;
                            }
                            L65: {
                              if (param2 != wo.field_f) {
                                break L65;
                              } else {
                                if (cj.e((byte) 85)) {
                                  break L65;
                                } else {
                                  var27 = em.field_L.field_Ob;
                                  var24 = var24 + "<br>" + nr.a(new String[1], param4 ^ 82, ke.field_b);
                                  break L65;
                                }
                              }
                            }
                            kk.field_B = var24;
                            break L42;
                          }
                        } else {
                          break L42;
                        }
                      } else {
                        break L42;
                      }
                    }
                  }
                  var11 = var12;
                  var12 = (im) (Object) var10.f((byte) -5);
                  if (var31 == 0) {
                    continue L12;
                  } else {
                    break L14;
                  }
                }
              }
            }
            break L13;
          }
          return;
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_106_0 = 0;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_32_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_105_0 = 0;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 107;
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
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        param5 = param5 + param1;
                        var7_int = 0;
                        var8 = param2;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = param4[var8];
                        if (0 > var9) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7_int++;
                        if (var11 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var11 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        if (((rk) this).field_c[var7_int] >= 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if ((param5 ^ -1) >= (param1 ^ -1)) {
                            statePc = 101;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 == (64 & var9)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        stackOut_17_0 = var11;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 == 0) {
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
                        var7_int++;
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
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        stackOut_22_0 = -1;
                        stackOut_22_1 = ((rk) this).field_c[var7_int];
                        stackOut_22_2 = -1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 < (stackIn_23_1 ^ stackIn_23_2)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if ((param1 ^ -1) > (param5 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var11 == 0) {
                            statePc = 101;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7_int = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-1 == (32 & var9 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        stackOut_32_0 = var11;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == 0) {
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
                        var7_int++;
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
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        if (((rk) this).field_c[var7_int] < 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if (param1 >= param5) {
                            statePc = 101;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7_int = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var9 & 16) != 0) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        stackOut_46_0 = ((rk) this).field_c[var7_int];
                        stackOut_46_1 = -1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((stackIn_47_0 ^ stackIn_47_1) <= -1) {
                            statePc = 55;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if (param1 < param5) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var11 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7_int = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((8 & var9) == 0) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        stackOut_56_0 = var11;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var7_int++;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        stackOut_61_0 = -1;
                        stackOut_61_1 = ((rk) this).field_c[var7_int];
                        stackOut_61_2 = -1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 < (stackIn_62_1 ^ stackIn_62_2)) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if ((param5 ^ -1) >= (param1 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var7_int = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((4 & var9 ^ -1) != -1) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        if (((rk) this).field_c[var7_int] >= 0) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if (param5 <= param1) {
                            statePc = 101;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var7_int = 0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((2 & var9 ^ -1) != -1) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        stackOut_82_0 = ((rk) this).field_c[var7_int];
                        stackOut_82_1 = -1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((stackIn_83_0 ^ stackIn_83_1) > -1) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if ((param5 ^ -1) >= (param1 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var7_int = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (-1 != (1 & var9 ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var7_int = ((rk) this).field_c[var7_int];
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var10 = ((rk) this).field_c[var7_int];
                        if (0 > ((rk) this).field_c[var7_int]) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        param1++;
                        param3[param1] = (byte)(var10 ^ -1);
                        if (param5 > param1) {
                            statePc = 99;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var11 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var7_int = 0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (param0 == 36) {
                            statePc = 105;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        field_h = null;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = -param2 + 1 + var8;
                        stackIn_106_0 = stackOut_105_0;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 106: {
                    return stackIn_106_0;
                }
                case 107: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    try {
                        stackOut_108_0 = (RuntimeException) var7;
                        stackOut_108_1 = new StringBuilder().append("rk.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_111_0 = stackOut_108_0;
                        stackIn_111_1 = stackOut_108_1;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        if (param3 == null) {
                            statePc = 111;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                        stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                        stackOut_109_2 = "{...}";
                        stackIn_112_0 = stackOut_109_0;
                        stackIn_112_1 = stackOut_109_1;
                        stackIn_112_2 = stackOut_109_2;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 110: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 111: {
                    stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
                    stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
                    stackOut_111_2 = "null";
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    stackIn_112_2 = stackOut_111_2;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    try {
                        stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                        stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(44);
                        stackIn_115_0 = stackOut_112_0;
                        stackIn_115_1 = stackOut_112_1;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        if (param4 == null) {
                            statePc = 115;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
                        stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
                        stackOut_113_2 = "{...}";
                        stackIn_116_0 = stackOut_113_0;
                        stackIn_116_1 = stackOut_113_1;
                        stackIn_116_2 = stackOut_113_2;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 114: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 115: {
                    stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                    stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                    stackOut_115_2 = "null";
                    stackIn_116_0 = stackOut_115_0;
                    stackIn_116_1 = stackOut_115_1;
                    stackIn_116_2 = stackOut_115_2;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    throw wm.a((Throwable) (Object) stackIn_116_0, stackIn_116_2 + 44 + param5 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, boolean param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        byte stackIn_7_2 = 0;
        byte[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        byte stackIn_13_2 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        byte[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        byte stackOut_6_2 = 0;
        byte[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        byte stackOut_12_2 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var7_int = 0;
                        param1 = param1 + param0;
                        var8 = param3 << -1597699549;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param1 <= param0) {
                            statePc = 18;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = param4[param0] & 255;
                        var10 = ((rk) this).field_b[var9];
                        var11 = ((rk) this).field_a[var9];
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var11 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("" + var9);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = var8 >> -938037629;
                        var13 = 7 & var8;
                        var7_int = var7_int & -var13 >> 342817823;
                        var14 = (var11 + var13 - 1 >> 522306211) + var12;
                        var13 += 24;
                        var7_int = md.a(var7_int, var10 >>> var13);
                        stackOut_6_0 = (byte[]) param2;
                        stackOut_6_1 = var12;
                        stackOut_6_2 = (byte)md.a(var7_int, var10 >>> var13);
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_7_0[stackIn_7_1] = stackIn_7_2;
                        if (var14 > var12) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 17;
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param2[var12] = (byte)(var10 >>> var13);
                        if (var12 >= var14) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param2[var12] = (byte)(var10 >>> var13);
                        if (var12 >= var14) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        stackOut_12_0 = (byte[]) param2;
                        stackOut_12_1 = var12;
                        stackOut_12_2 = (byte)(var10 >>> var13);
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                        if (var14 > var12) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 << -var13;
                        param2[var12] = (byte)(var10 << -var13);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = var8 + var11;
                        param0++;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param5) {
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
                        int discarded$1 = rk.b(false);
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = -param3 + (7 + var8 >> 1517095843);
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) var7;
                        stackOut_25_1 = new StringBuilder().append("rk.C(").append(param0).append(44).append(param1).append(44);
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (param2 == null) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                        stackOut_26_2 = "{...}";
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "null";
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param3).append(44);
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (param4 == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                        stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                        stackOut_30_2 = "{...}";
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_33_2 = stackOut_30_2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                    stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                    stackOut_32_2 = "null";
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw wm.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param5 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        fr var4_ref_fr = null;
        int var4 = 0;
        fr var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        fr stackIn_12_0 = null;
        int stackIn_25_0 = 0;
        boolean stackIn_28_0 = false;
        boolean stackIn_30_0 = false;
        int stackIn_35_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int stackOut_2_0 = 0;
        fr stackOut_11_0 = null;
        int stackOut_24_0 = 0;
        boolean stackOut_27_0 = false;
        boolean stackOut_28_0 = false;
        int stackOut_34_0 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_43_0 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (tl.field_J == ta.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2_long = rl.a((byte) -103);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == ii.field_d) {
                            statePc = 26;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((wq.field_b ^ -1) <= -1) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_ref_fr = (fr) (Object) vn.field_g.c((byte) -112);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4_ref_fr == null) {
                            statePc = 26;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (fr) var4_ref_fr;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0.field_p < var2_long) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_ref_fr.a((byte) -117);
                        of.field_Pb = var4_ref_fr.field_l.length;
                        kn.field_e.field_v = 0;
                        var5_int = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var5_int >= of.field_Pb) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        kn.field_e.field_t[var5_int] = var4_ref_fr.field_l[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var7 == 0) {
                            statePc = 18;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        hb.field_e = vd.field_g;
                        vd.field_g = ia.field_l;
                        ia.field_l = uq.field_c;
                        uq.field_c = var4_ref_fr.field_r;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        if (wq.field_b >= 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        kn.field_e.field_v = 0;
                        stackOut_27_0 = lq.b((byte) 107, 1);
                        stackIn_38_0 = stackOut_27_0;
                        stackIn_28_0 = stackOut_27_0;
                        if (var7 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = stackIn_28_0;
                        stackIn_30_0 = stackOut_28_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!stackIn_30_0) {
                            statePc = 34;
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return stackIn_35_0 != 0;
                }
                case 36: {
                    try {
                        wq.field_b = kn.field_e.q(param0 + 107);
                        kn.field_e.field_v = 0;
                        of.field_Pb = param1[wq.field_b];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = wf.a((byte) 39);
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!stackIn_38_0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    try {
                        if (ii.field_d != 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        hb.field_e = vd.field_g;
                        vd.field_g = ia.field_l;
                        ia.field_l = uq.field_c;
                        uq.field_c = wq.field_b;
                        wq.field_b = -1;
                        stackOut_43_0 = 1;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return stackIn_44_0 != 0;
                }
                case 45: {
                    try {
                        var4 = ii.field_d;
                        if (hn.field_a == 0.0) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4 = (int)((double)var4 + lc.field_P.nextGaussian() * hn.field_a);
                        if ((var4 ^ -1) <= -1) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var5 = new fr(var2_long + (long)var4, wq.field_b, new byte[of.field_Pb]);
                        var6 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var6 ^ -1) <= (of.field_Pb ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5.field_l[var6] = kn.field_e.field_t[var6];
                        var6++;
                        if (var7 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var7 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        vn.field_g.b((byte) -64, (ma) (Object) var5);
                        wq.field_b = -1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    try {
                        stackOut_57_0 = (RuntimeException) var2;
                        stackOut_57_1 = new StringBuilder().append("rk.F(").append(param0).append(44);
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        if (param1 == null) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
                        stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                        stackOut_58_2 = "{...}";
                        stackIn_61_0 = stackOut_58_0;
                        stackIn_61_1 = stackOut_58_1;
                        stackIn_61_2 = stackOut_58_2;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 60: {
                    stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                    stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                    stackOut_60_2 = "null";
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    stackIn_61_2 = stackOut_60_2;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    throw wm.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0) {
                break L0;
              } else {
                rk.a(37, -53, 4, 85, 43, -30, (dd[]) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = di.field_e + (ol.field_e << 775822690) + (ec.field_i << 961008452);
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_e = null;
              field_g = null;
              field_h = null;
              if (!param0) {
                break L0;
              } else {
                field_e = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_i = null;
          field_f = null;
        }
    }

    rk(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length;
                        ((rk) this).field_a = param0;
                        ((rk) this).field_b = new int[var2_int];
                        ((rk) this).field_c = new int[8];
                        var3 = new int[33];
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = var2_int;
                        stackOut_2_1 = var5;
                        stackIn_3_0 = stackOut_2_0;
                        stackIn_3_1 = stackOut_2_1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 78;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = param0[var5];
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var15 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0 == var6) {
                            statePc = 70;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = 1 << 32 - var6;
                        var8 = var3[var6];
                        ((rk) this).field_b[var5] = var8;
                        if (-1 == (var8 & var7 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = var3[-1 + var6];
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = var7 | var8;
                        var10 = var6 + -1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var10 < 1) {
                            statePc = 29;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = var3[var10];
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = var11;
                        stackOut_14_1 = var8;
                        stackIn_30_0 = stackOut_14_0;
                        stackIn_30_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var15 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 != stackIn_15_1) {
                            statePc = 29;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = 1 << 32 + -var10;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var12 & var11 ^ -1) != -1) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var10] = md.a(var12, var11);
                        if (var15 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3[var10] = var3[var10 - 1];
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10--;
                        if (var15 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3[var6] = var9;
                        stackOut_29_0 = 1;
                        stackOut_29_1 = var6;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = stackIn_30_0 + stackIn_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var10 > 32) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var8;
                        stackOut_32_1 = var3[var10];
                        stackIn_3_0 = stackOut_32_0;
                        stackIn_3_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (var15 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == stackIn_33_1) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3[var10] = var9;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = 0;
                        var11 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var6 ^ -1) >= (var11 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var12 = -2147483648 >>> var11;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = var8 & var12;
                        stackIn_68_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (var15 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((rk) this).field_c[var10] == 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((rk) this).field_c[var10] = var4;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10 = ((rk) this).field_c[var10];
                        stackOut_50_0 = var15;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == 0) {
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
                        var10++;
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
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((((rk) this).field_c.length ^ -1) >= (var10 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var13 = new int[((rk) this).field_c.length * 2];
                        var14 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((var14 ^ -1) <= (((rk) this).field_c.length ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var13[var14] = ((rk) this).field_c[var14];
                        var14++;
                        if (var15 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var15 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ((rk) this).field_c = var13;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12 = var12 >>> 1;
                        var11++;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var15 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ((rk) this).field_c[var10] = var5 ^ -1;
                        stackOut_67_0 = var10;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 < var4) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var4 = var10 + 1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var5++;
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    try {
                        stackOut_73_0 = (RuntimeException) var2;
                        stackOut_73_1 = new StringBuilder().append("rk.<init>(");
                        stackIn_76_0 = stackOut_73_0;
                        stackIn_76_1 = stackOut_73_1;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        if (param0 == null) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                        stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                        stackOut_74_2 = "{...}";
                        stackIn_77_0 = stackOut_74_0;
                        stackIn_77_1 = stackOut_74_1;
                        stackIn_77_2 = stackOut_74_2;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 76: {
                    stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                    stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
                    stackOut_76_2 = "null";
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    stackIn_77_2 = stackOut_76_2;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    throw wm.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 41);
                }
                case 78: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You<%0> are all out of lives!";
        field_h = "Waiting for sound effects";
        field_i = "This entry doesn't match";
        field_f = "Report abuse";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
