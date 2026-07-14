/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ri extends qv {
    static int field_t;
    static String field_s;
    static sr field_u;
    static String field_v;
    static int field_r;

    final static void a(byte param0, int param1, nu param2, int param3) {
        RuntimeException var4 = null;
        nl var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_23_0 = 0;
        nl stackIn_27_0 = null;
        nl stackIn_29_0 = null;
        nl stackIn_31_0 = null;
        nl stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        nl stackIn_52_0 = null;
        int stackIn_67_0 = 0;
        nl stackIn_75_0 = null;
        int stackIn_83_0 = 0;
        nl stackIn_91_0 = null;
        int stackIn_99_0 = 0;
        int stackIn_103_0 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        int stackOut_22_0 = 0;
        nl stackOut_26_0 = null;
        nl stackOut_27_0 = null;
        nl stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        nl stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        nl stackOut_51_0 = null;
        int stackOut_66_0 = 0;
        nl stackOut_74_0 = null;
        int stackOut_82_0 = 0;
        nl stackOut_90_0 = null;
        int stackOut_98_0 = 0;
        int stackOut_102_0 = 0;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_ref = param2.field_P[param3][param1];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 != (var4_ref.field_u ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var5 = 255 & 19 * ((1 + param3) * (1 + param1)) + param2.field_J;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == -93) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ri.a(113, false, true, 5);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = var4_ref.f(param0 + -7);
                        var7 = var4_ref.a(true);
                        var8 = param2.field_V.a(true);
                        var9 = param2.field_V.c(879306160);
                        if (-1 != (var5 & (1 << var4_ref.field_I) - 1 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        gt.a(param1, param3, (byte) 103, param2.field_r[param3]);
                        var10 = var6 + -ge.field_m[0];
                        var11 = -ge.field_m[1] + var7;
                        var12 = 24;
                        var13 = 24;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((10 & var4_ref.field_G ^ -1) == -1) {
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
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = var12 << 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((5 & var4_ref.field_G ^ -1) == -1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = var13 << 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((Math.abs(var10) ^ -1) < (var12 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var11;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((Math.abs(stackIn_23_0) ^ -1) < (var13 ^ -1)) {
                            statePc = 33;
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
                        stackOut_26_0 = (nl) var4_ref;
                        stackIn_31_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (-1 == (var4_ref.field_G ^ -1)) {
                            statePc = 31;
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
                        stackOut_27_0 = (nl) (Object) stackIn_27_0;
                        stackIn_29_0 = stackOut_27_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (nl) (Object) stackIn_29_0;
                        stackOut_29_1 = 7;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (nl) (Object) stackIn_31_0;
                        stackOut_31_1 = 5;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_32_0.field_I = stackIn_32_1;
                        var4_ref.field_G = 0;
                        if (var15 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var14 = 0;
                        if (var12 >= var10) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var14 = var14 | 2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var10 ^ -1) > (-var12 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var14 = var14 | 8;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var13 ^ -1) > (var11 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var14 = var14 | 4;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-var13 > var11) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var14 = var14 | 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var4_ref.field_G != var14) {
                            statePc = 58;
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
                        if ((var4_ref.field_I ^ -1) <= -5) {
                            statePc = 61;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = (nl) var4_ref;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((stackIn_52_0.field_G ^ -1) == (var14 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var4_ref.field_I = var4_ref.field_I + 1;
                        if (var15 == 0) {
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
                        var4_ref.field_I = 1;
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
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var4_ref.field_G = var14;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var15 == 0) {
                            statePc = 97;
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
                        if ((1 & var4_ref.field_G ^ -1) == -1) {
                            statePc = 73;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = 88080384;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 <= var4_ref.field_w) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var4_ref.field_G = var4_ref.field_G & -2;
                        var4_ref.field_G = var4_ref.field_G | 4;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((4 & var4_ref.field_G) == 0) {
                            statePc = 81;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = (nl) var4_ref;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0.field_w > 0) {
                            statePc = 81;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var4_ref.field_G = var4_ref.field_G & -5;
                        var4_ref.field_G = var4_ref.field_G | 1;
                        statePc = 79;
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
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (0 == (8 & var4_ref.field_G)) {
                            statePc = 89;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = 58720256;
                        stackIn_83_0 = stackOut_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 <= var4_ref.field_M) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var4_ref.field_G = var4_ref.field_G & -9;
                        var4_ref.field_G = var4_ref.field_G | 2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((var4_ref.field_G & 2) == 0) {
                            statePc = 97;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (nl) var4_ref;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (stackIn_91_0.field_M <= 0) {
                            statePc = 96;
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
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var4_ref.field_G = var4_ref.field_G & -3;
                        var4_ref.field_G = var4_ref.field_G | 8;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (-1 != (var4_ref.field_G ^ -1)) {
                            statePc = 116;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackOut_98_0 = 0;
                        stackIn_99_0 = stackOut_98_0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 != var4_ref.field_u) {
                            statePc = 116;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = var5;
                        stackIn_103_0 = stackOut_102_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((stackIn_103_0 % 10 ^ -1) != -1) {
                            statePc = 116;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var4_ref.a(uv.a(true, -var7 + var9, -var6 + var8), 26214);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 110: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    try {
                        stackOut_111_0 = (RuntimeException) var4;
                        stackOut_111_1 = new StringBuilder().append("ri.A(").append(param0).append(44).append(param1).append(44);
                        stackIn_114_0 = stackOut_111_0;
                        stackIn_114_1 = stackOut_111_1;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        if (param2 == null) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                        stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                        stackOut_112_2 = "{...}";
                        stackIn_115_0 = stackOut_112_0;
                        stackIn_115_1 = stackOut_112_1;
                        stackIn_115_2 = stackOut_112_2;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 114: {
                    stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
                    stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
                    stackOut_114_2 = "null";
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    stackIn_115_2 = stackOut_114_2;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    throw nb.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + 44 + param3 + 41);
                }
                case 116: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(sj param0, int[] param1, int param2, kg[] param3, sj param4) {
        kg[] var5 = null;
        kg[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        uo var7 = null;
        hd var8 = null;
        hd var9 = null;
        hd var10 = null;
        hd var11 = null;
        ut[] var12 = null;
        ut[] var13 = null;
        ut[] var14 = null;
        hd var15 = null;
        ut[] var16 = null;
        ut[] var17 = null;
        int var18 = 0;
        kg[] stackIn_11_0 = null;
        kg[] stackIn_14_0 = null;
        kg[] stackOut_10_0 = null;
        kg[] stackOut_13_0 = null;
        L0: {
          L1: {
            var18 = Kickabout.field_G;
            var5 = jo.a(param4, 17369, "lobby", "crowns");
            bk.field_e = var5.length;
            if (param3 != null) {
              var6 = new kg[param3.length + bk.field_e];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var7_int >= bk.field_e) {
                      break L4;
                    } else {
                      var6[var7_int] = var5[var7_int];
                      var7_int++;
                      if (var18 != 0) {
                        break L3;
                      } else {
                        if (var18 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = var6;
                  break L3;
                }
                var7_int = 0;
                L5: while (true) {
                  if ((param3.length ^ -1) >= (var7_int ^ -1)) {
                    break L1;
                  } else {
                    stackOut_10_0 = (kg[]) var6;
                    stackIn_14_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_11_0[var7_int + bk.field_e] = param3[var7_int];
                      var7_int++;
                      if (var18 == 0) {
                        continue L5;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_13_0 = (kg[]) var5;
          stackIn_14_0 = stackOut_13_0;
          break L0;
        }
        var6_array = new int[stackIn_14_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if ((bk.field_e ^ -1) >= (var7_int ^ -1)) {
                break L8;
              } else {
                var6_array[var7_int] = 10;
                var7_int++;
                if (var18 != 0) {
                  break L7;
                } else {
                  if (var18 == 0) {
                    continue L6;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (param3 == null) {
                break L9;
              } else {
                L10: {
                  if (null != param1) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if (var7_int >= param3.length) {
                          break L12;
                        } else {
                          var6_array[var7_int + bk.field_e] = param3[var7_int].field_a;
                          var7_int++;
                          if (var18 != 0) {
                            break L7;
                          } else {
                            if (var18 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (var18 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var7_int = 0;
                L13: while (true) {
                  if (param3.length <= var7_int) {
                    break L9;
                  } else {
                    var6_array[var7_int + bk.field_e] = param1[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L7;
                    } else {
                      if (var18 == 0) {
                        continue L13;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
            }
            sh.field_c = 15;
            eb.field_b = 4;
            ig.field_c = 11;
            el.field_I = 2;
            mj.field_b = 2;
            break L7;
          }
          L14: {
            var7 = qk.a("largefont", param0, 75, "lobby", param4);
            rq.field_E = qk.a("generalfont", param0, 87, "lobby", param4);
            jw.field_Ab = qk.a("chatfont", param0, 112, "lobby", param4);
            var7.a((qd[]) (Object) var5, var6_array);
            rq.field_E.a((qd[]) (Object) var5, var6_array);
            jw.field_Ab.a((qd[]) (Object) var5, var6_array);
            var8 = new hd(0L, (hd) null);
            var8.field_y = 16777215;
            var8.field_X = (hu) (Object) var7;
            var8.field_xb = sh.field_c;
            var8.field_p = 1;
            var9 = var8;
            var9.field_A = 1;
            var10 = new hd(0L, (hd) null);
            var10.field_y = 16777215;
            if (param2 <= -51) {
              break L14;
            } else {
              ri.a((byte) -76, -14, (nu) null, 71);
              break L14;
            }
          }
          var10.field_X = (hu) (Object) rq.field_E;
          var10.field_xb = sh.field_c;
          var10.field_p = 1;
          var11 = var10;
          var11.field_A = 1;
          qa.field_H = new hd(0L, var8);
          qa.field_H.field_R = bs.a(se.a(param4, -22, "lobby", "heading"), (byte) 86);
          jf.field_B = new hd(0L, (hd) null);
          jf.field_B.field_R = tq.a(120, false, 8421504, 4210752, false, (byte) -46);
          r.field_c = new hd(0L, (hd) null);
          r.field_c.field_R = fs.a(114, 3, 1, 6316128, 6316128, (byte) 92);
          pn.field_u = new hd(0L, (hd) null);
          pn.field_u.field_R = bs.a(se.a(param4, 81, "lobby", "popup"), (byte) 63);
          var12 = bs.a(se.a(param4, -125, "lobby", "popup_mouseover"), (byte) -4);
          var13 = se.a(param4, -122, "lobby", "button");
          var14 = bs.a(se.a(param4, -122, "lobby", "tab_active"), (byte) 61);
          ai.field_H = new hd(0L, var8);
          ai.field_H.field_R = var14;
          hl.field_f = new hd(0L, (hd) null);
          hl.field_f.field_N = wa.a((byte) 127, "lobby", param4, "closebutton");
          hl.field_f.field_vb = wa.a((byte) 114, "lobby", param4, "closebutton_mouseover");
          oi.field_i = new hd(0L, var8);
          oi.field_i.field_R = tq.a(40, true, 3815994, 2039583, true, (byte) -46);
          dn.field_zb = new hd(0L, var10);
          dn.field_zb.field_kb = 2;
          dn.field_zb.field_R = tq.a(30, false, 3815994, 2039583, true, (byte) -46);
          gw.field_a = new hd(0L, var10);
          gw.field_a.field_kb = 2;
          gw.field_a.field_R = tq.a(30, false, 3815994, 2039583, false, (byte) -46);
          pq.field_P = new hd(0L, var10);
          pq.field_P.field_kb = 2;
          pq.field_P.field_R = tq.a(30, true, 3815994, 2039583, false, (byte) -46);
          dw.field_e = new hd(0L, (hd) null);
          dw.field_e.field_X = (hu) (Object) rq.field_E;
          dw.field_e.field_y = 13421772;
          dw.field_e.field_xb = sh.field_c;
          dw.field_e.field_p = 1;
          ul.field_c = new hd(0L, dw.field_e);
          ul.field_c.field_hb = 8421504;
          ul.field_c.field_H = 16777215;
          ul.field_c.field_ab = 16777215;
          ul.field_c.field_ub = 16777215;
          ul.field_c.field_y = 16764006;
          var15 = new hd(0L, ul.field_c);
          var15.field_y = 16777215;
          var15.field_X = (hu) (Object) var7;
          var15.field_xb = sh.field_c;
          ip.field_c = new hd(0L, dw.field_e);
          ip.field_c.field_R = tq.a(16, false, 2236962, 2236962, false, (byte) -46);
          ip.field_c.field_kb = 2;
          kr.field_b = new hd(0L, dw.field_e);
          kr.field_b.field_R = tq.a(16, false, 1513239, 1513239, false, (byte) -46);
          kr.field_b.field_kb = 2;
          pw.field_J = new hd(0L, ip.field_c);
          pw.field_J.a(ul.field_c, (byte) -100);
          mp.field_f = new hd(0L, kr.field_b);
          mp.field_f.a(ul.field_c, (byte) -85);
          var16 = se.a(param4, 108, "lobby", "button_mouseover");
          su.field_b = new gu(pn.field_u, var12, dw.field_e, ul.field_c, 3, 2, mj.field_b, 3, sh.field_c);
          rg.field_e = new hd(0L, ul.field_c);
          rg.field_e.field_R = var13;
          rg.field_e.field_eb = 1;
          rg.field_e.field_S = var16;
          rg.field_e.field_O = 1;
          rg.field_e.field_cb = 1;
          rg.field_e.field_x = 1;
          rg.field_e.field_rb = se.a(param4, 7, "lobby", "button_mouseheld");
          rg.field_e.field_u = se.a(param4, -119, "lobby", "button_active");
          rg.field_e.field_tb = se.a(param4, -119, "lobby", "button_disabled");
          rg.field_e.field_A = 1;
          ge.field_n = new hd(0L, ul.field_c);
          ge.field_n.field_A = 1;
          ge.field_n.field_R = bs.a(se.a(param4, 6, "lobby", "tab_inactive"), (byte) 49);
          ge.field_n.field_S = bs.a(se.a(param4, -125, "lobby", "tab_mouseover"), (byte) 37);
          ge.field_n.field_u = var14;
          ku.field_b = new hd(0L, (hd) null);
          ku.field_b.field_R = fs.a(206, 3, -1, 1856141, 1127256, (byte) 91);
          cp.field_g = new hd(0L, (hd) null);
          cp.field_g.field_R = fs.a(290, 3, -1, 11579568, 6052956, (byte) 118);
          vg.field_Qb = new hd(0L, var15);
          vg.field_Qb.field_A = 1;
          vg.field_Qb.field_eb = 1;
          vg.field_Qb.field_cb = 1;
          vg.field_Qb.field_x = 1;
          vg.field_Qb.field_O = 1;
          dc.field_a = new hd(0L, vg.field_Qb);
          um.field_d = new hd(0L, ul.field_c);
          um.field_d.field_cb = 1;
          um.field_d.field_O = 1;
          um.field_d.field_A = 1;
          um.field_d.field_x = 1;
          um.field_d.field_eb = 1;
          jc.field_r = new hd(0L, um.field_d);
          mb.field_F = new hd(0L, um.field_d);
          ev.field_D = new hd(0L, vg.field_Qb);
          kn.field_F = new hd(0L, um.field_d);
          nj.field_d = new hd(0L, um.field_d);
          k.field_f = new hd(0L, um.field_d);
          um.field_d.field_R = bs.a(se.a(param4, 81, "lobby", "smallbutton"), (byte) 47);
          um.field_d.field_S = bs.a(se.a(param4, -4, "lobby", "smallbutton_mouseover"), (byte) 68);
          um.field_d.field_u = bs.a(se.a(param4, -128, "lobby", "smallbutton_active"), (byte) -124);
          um.field_d.field_rb = bs.a(se.a(param4, -128, "lobby", "smallbutton_active"), (byte) -124);
          um.field_d.field_tb = bs.a(se.a(param4, 89, "lobby", "smallbutton_disabled"), (byte) 12);
          dc.field_a.field_R = bs.a(se.a(param4, -31, "lobby", "mediumbutton"), (byte) -25);
          dc.field_a.field_S = bs.a(se.a(param4, -122, "lobby", "mediumbutton_mouseover"), (byte) 52);
          dc.field_a.field_rb = bs.a(se.a(param4, 62, "lobby", "mediumbutton_mouseheld"), (byte) 87);
          vg.field_Qb.field_R = bs.a(se.a(param4, 87, "lobby", "bigbutton"), (byte) 7);
          vg.field_Qb.field_S = bs.a(se.a(param4, 46, "lobby", "bigbutton_mouseover"), (byte) -127);
          vg.field_Qb.field_rb = bs.a(se.a(param4, 29, "lobby", "bigbutton_mouseheld"), (byte) -103);
          vg.field_Qb.field_tb = bs.a(se.a(param4, -123, "lobby", "bigbutton_disabled"), (byte) 126);
          jc.field_r.field_R = bs.a(se.a(param4, -10, "lobby", "greenbutton"), (byte) 25);
          jc.field_r.field_S = bs.a(se.a(param4, 92, "lobby", "greenbutton_mouseover"), (byte) -112);
          jc.field_r.field_rb = bs.a(se.a(param4, -39, "lobby", "greenbutton_mouseheld"), (byte) -26);
          mb.field_F.field_R = bs.a(se.a(param4, -123, "lobby", "redbutton"), (byte) 93);
          mb.field_F.field_S = bs.a(se.a(param4, -124, "lobby", "redbutton_mouseover"), (byte) -121);
          mb.field_F.field_rb = bs.a(se.a(param4, -37, "lobby", "redbutton_mouseheld"), (byte) -101);
          ev.field_D.field_R = bs.a(se.a(param4, -127, "lobby", "backbutton"), (byte) -116);
          ev.field_D.field_S = bs.a(se.a(param4, -119, "lobby", "backbutton_mouseover"), (byte) -110);
          ev.field_D.field_rb = bs.a(se.a(param4, 25, "lobby", "backbutton_mouseheld"), (byte) -3);
          ev.field_D.field_tb = bs.a(se.a(param4, 0, "lobby", "backbutton_disabled"), (byte) -99);
          k.field_f.field_R = bs.a(se.a(param4, 8, "lobby", "gameoptionbutton"), (byte) -20);
          k.field_f.field_S = bs.a(se.a(param4, 53, "lobby", "gameoptionbutton_mouseover"), (byte) -5);
          k.field_f.field_u = bs.a(se.a(param4, -124, "lobby", "gameoptionbutton_active"), (byte) -121);
          k.field_f.field_rb = bs.a(se.a(param4, -124, "lobby", "gameoptionbutton_active"), (byte) -121);
          k.field_f.field_tb = bs.a(se.a(param4, 63, "lobby", "gameoptionbutton_disabled"), (byte) -109);
          kn.field_F.field_R = bs.a(se.a(param4, 31, "lobby", "chatbutton"), (byte) -113);
          kn.field_F.field_S = bs.a(se.a(param4, -127, "lobby", "chatbutton_mouseover"), (byte) 74);
          kn.field_F.field_u = bs.a(se.a(param4, 11, "lobby", "chatbutton_active"), (byte) -124);
          kn.field_F.field_rb = bs.a(se.a(param4, 11, "lobby", "chatbutton_active"), (byte) -124);
          nj.field_d.field_R = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton"), (byte) 9);
          nj.field_d.field_S = bs.a(se.a(param4, -127, "lobby", "chatfilterbutton_mouseover"), (byte) 33);
          nj.field_d.field_u = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton_active"), (byte) -121);
          nj.field_d.field_rb = bs.a(se.a(param4, -123, "lobby", "chatfilterbutton_active"), (byte) -121);
          var17 = se.a(param4, -121, "lobby", "checkbox");
          hs.field_d = new om(0L, var17[1], var17[0], 1, ul.field_c, (String) null);
          np.field_Hb = new hd(0L, (hd) null);
          np.field_Hb.field_R = kh.a((byte) -83, wa.a((byte) 98, "lobby", param4, "slideregion"));
          np.field_Hb.field_S = kh.a((byte) -96, wa.a((byte) 113, "lobby", param4, "slideregion_mouseover"));
          np.field_Hb.field_rb = kh.a((byte) -86, wa.a((byte) 116, "lobby", param4, "slideregion_mouseheld"));
          np.field_Hb.field_tb = kh.a((byte) -108, wa.a((byte) 127, "lobby", param4, "slideregion_disabled"));
          ts.field_a = new hd(0L, (hd) null);
          ts.field_a.field_R = bs.a(se.a(param4, 108, "lobby", "dragbar"), (byte) 8);
          ts.field_a.field_S = bs.a(se.a(param4, 46, "lobby", "dragbar_mouseover"), (byte) -24);
          ts.field_a.field_rb = bs.a(se.a(param4, -119, "lobby", "dragbar_mouseheld"), (byte) -123);
          ts.field_a.field_tb = bs.a(se.a(param4, -27, "lobby", "dragbar_disabled"), (byte) -127);
          sd.field_a = new hd(0L, (hd) null);
          sd.field_a.field_N = wa.a((byte) 110, "lobby", param4, "upbutton");
          sd.field_a.field_vb = wa.a((byte) 116, "lobby", param4, "upbutton_mouseover");
          sd.field_a.field_r = wa.a((byte) 117, "lobby", param4, "upbutton_mouseheld");
          sd.field_a.field_t = wa.a((byte) 99, "lobby", param4, "upbutton_disabled");
          ci.field_b = new hd(0L, (hd) null);
          ci.field_b.field_N = wa.a((byte) 108, "lobby", param4, "downbutton");
          ci.field_b.field_vb = wa.a((byte) 108, "lobby", param4, "downbutton_mouseover");
          ci.field_b.field_r = wa.a((byte) 115, "lobby", param4, "downbutton_mouseheld");
          ci.field_b.field_t = wa.a((byte) 119, "lobby", param4, "downbutton_disabled");
          uk.field_b = new na(0L, sd.field_a, ci.field_b, np.field_Hb, ts.field_a);
          lh.field_D = new al(0L, (hd) null, rj.field_b, uk.field_b, um.field_d, (String) null, (String) null);
          return;
        }
    }

    final static ot a(ot param0, boolean param1) {
        RuntimeException var2 = null;
        ut var2_ref = null;
        int var3_int = 0;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ot stackIn_23_0 = null;
        ot stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        ot stackOut_22_0 = null;
        ot stackOut_26_0 = null;
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
                    var8 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = new ut(param0.field_o, param0.field_v);
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3_int ^ -1) <= (var2_ref.field_y.length ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-171 <= (param0.field_y[var3_int] >>> 1222392632 ^ -1)) {
                            statePc = 7;
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
                        var2_ref.field_y[var3_int] = 8947848;
                        statePc = 5;
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
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = new ot(param0.field_o, param0.field_v);
                        iw.a(-54, (ut) (Object) var3);
                        on.a(0, 0, on.field_g, on.field_f, 6710886);
                        var4 = 2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (10 <= var4) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = (-var4 + 12 << -1436849369) / 13;
                        var6 = param0.field_o + -var4;
                        var7 = var4 / 4 + var4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_ref.c(var7, var4 / 5 + var7, var6, var6, 65793 * var5);
                        var4++;
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 == 0) {
                            statePc = 9;
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
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ta.e(125);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param1) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        String discarded$1 = ri.a((CharSequence) null, (byte) 122);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3.field_y.length <= var4) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (ot) var3;
                        stackIn_27_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var8 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_23_0.field_y[var4] = hf.a(qj.b(var3.field_y[var4], 16777215), qj.b(param0.field_y[var4], -16777216));
                        var4++;
                        if (var8 == 0) {
                            statePc = 21;
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
                        stackOut_26_0 = (ot) var3;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        stackOut_29_0 = (RuntimeException) var2;
                        stackOut_29_1 = new StringBuilder().append("ri.E(");
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (param0 == null) {
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
                    throw nb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        kj.a(12105912, param2 - -param3.field_g, param3.field_t + param4, param3.field_i, param3.field_n);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        super.a(-21, param1, param2, param3, param4);
                        var6_int = 92 % ((59 - param0) / 53);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var6;
                        stackOut_7_1 = new StringBuilder().append("ri.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param3 == null) {
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
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ri(int param0) {
        this(gf.field_a, param0);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        hd var5 = null;
        hd var6 = null;
        hd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        hd stackIn_40_0 = null;
        hd stackIn_42_0 = null;
        hd stackIn_44_0 = null;
        hd stackIn_45_0 = null;
        String stackIn_45_1 = null;
        hd stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        hd stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        hd stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String stackIn_49_2 = null;
        boolean[] stackIn_65_0 = null;
        boolean stackIn_80_0 = false;
        String stackIn_95_0 = null;
        hd stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        hd stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        boolean stackIn_104_2 = false;
        hd stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        hd stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        hd stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        boolean stackIn_108_2 = false;
        hd stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        hd stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        hd stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        hd stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        hd stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        hd stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        boolean stackIn_116_2 = false;
        hd stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        hd stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        hd stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        boolean stackIn_120_2 = false;
        hd stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        hd stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        hd stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        hd stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        hd stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        hd stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        boolean stackIn_128_2 = false;
        hd stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        hd stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        hd stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        boolean stackIn_132_2 = false;
        hd stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        hd stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        hd stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        hd stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_140_0 = 0;
        int stackIn_142_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        hd stackOut_39_0 = null;
        hd stackOut_40_0 = null;
        hd stackOut_42_0 = null;
        String stackOut_42_1 = null;
        hd stackOut_44_0 = null;
        String stackOut_44_1 = null;
        hd stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        hd stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        hd stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String stackOut_48_2 = null;
        boolean[] stackOut_64_0 = null;
        boolean stackOut_79_0 = false;
        String stackOut_92_0 = null;
        String stackOut_94_0 = null;
        hd stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        hd stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        boolean stackOut_103_2 = false;
        hd stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        hd stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        hd stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        boolean stackOut_107_2 = false;
        hd stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        hd stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        hd stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        hd stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        hd stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        hd stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        boolean stackOut_115_2 = false;
        hd stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        hd stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        hd stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        boolean stackOut_119_2 = false;
        hd stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        hd stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        hd stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        hd stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        hd stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        hd stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        boolean stackOut_127_2 = false;
        hd stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        hd stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        hd stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        boolean stackOut_131_2 = false;
        hd stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        hd stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        hd stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        hd stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        int stackOut_139_0 = 0;
        int stackOut_140_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = -109 / ((-55 - param0) / 60);
                        dw.a(127, fj.field_a);
                        if (null == ow.field_b) {
                            statePc = 102;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = em.field_d;
                        em.field_d.field_mb = 0;
                        var5.field_q = 0;
                        ua.field_k.field_mb = 0;
                        var6 = ua.field_k;
                        var6.field_q = 0;
                        nv.field_F.field_mb = 0;
                        var7 = nv.field_F;
                        var7.field_q = 0;
                        ci.field_h.field_E = qn.field_d.toUpperCase();
                        var8 = (2 + fp.field_p.field_q) / 2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        nv.field_F.a(true, -2 + var8, 0, -40 + fp.field_p.field_mb, 40);
                        ua.field_k.a(true, -var8 + fp.field_p.field_q, var8, -40 + fp.field_p.field_mb, 40);
                        if ((rn.field_d.length ^ -1) != -2) {
                            statePc = 8;
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
                        if ((rn.field_d[0] ^ -1) != -3) {
                            statePc = 8;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        if (var13 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = 0;
                        var10_int = 0;
                        var11 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11 >= rn.field_d.length) {
                            statePc = 34;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = -1;
                        stackOut_10_1 = er.field_h[var11 / 8] & 1 << (var11 & 7) ^ -1;
                        stackIn_35_0 = stackOut_10_0;
                        stackIn_35_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var13 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 1;
                        stackIn_17_0 = stackOut_14_0;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12_int = stackIn_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12_int == 0) {
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
                        var10_int++;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var12_int == 0) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = -3;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 != (rn.field_d[var11] ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var13 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11++;
                        if (var13 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = -1;
                        stackOut_34_1 = var10_int ^ -1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == stackIn_35_1) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = 1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ua.field_k.field_lb = true;
                        if (hw.field_k) {
                            statePc = 89;
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
                        stackOut_39_0 = ua.field_k;
                        stackIn_44_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var9 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = (hd) (Object) stackIn_40_0;
                        stackIn_42_0 = stackOut_40_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (hd) (Object) stackIn_42_0;
                        stackOut_42_1 = wp.field_e;
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = (hd) (Object) stackIn_44_0;
                        stackOut_44_1 = bm.field_F;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_45_0.field_E = ((String) (Object) stackIn_45_1).toUpperCase();
                        stackOut_45_0 = w.field_e;
                        stackOut_45_1 = -18;
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (var9 != 0) {
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
                        stackOut_46_0 = (hd) (Object) stackIn_46_0;
                        stackOut_46_1 = stackIn_46_1;
                        stackOut_46_2 = vr.field_b;
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        stackIn_49_2 = stackOut_46_2;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = (hd) (Object) stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = ko.field_j;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0.field_E = vo.a((byte) stackIn_49_1, stackIn_49_2, new String[1]);
                        nv.field_F.field_E = jw.field_Db;
                        ac.field_b.field_lb = true;
                        tt.field_c = true;
                        if (null != la.field_k) {
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
                        statePc = 71;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ee.field_e = false;
                        tt.field_c = false;
                        if (hm.field_G == null) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        m.field_f = new boolean[ss.field_j];
                        hm.field_G = new byte[ss.field_j];
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10_int = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var10_int >= ss.field_j) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        m.field_f[var10_int] = false;
                        var10_int++;
                        if (var13 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var13 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        pl.a(0, ss.field_j, ow.field_b, -1, (byte) -121, -1, -1, true);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (2 > tk.field_Ib) {
                            statePc = 71;
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
                        stackOut_64_0 = ne.field_G;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (!stackIn_65_0[12]) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        tt.field_c = true;
                        statePc = 69;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (tt.field_c) {
                            statePc = 102;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        ua.field_k.field_lb = false;
                        if (!ua.field_k.field_Q) {
                            statePc = 102;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10 = null;
                        if (!ee.field_e) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var10 = "<col=A00000>" + qk.field_H + "</col>";
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var11 = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var11 >= ss.field_j) {
                            statePc = 88;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = m.field_f[var11];
                        stackIn_142_0 = stackOut_79_0 ? 1 : 0;
                        stackIn_80_0 = stackOut_79_0;
                        if (var13 != 0) {
                            statePc = 142;
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
                        if (stackIn_80_0) {
                            statePc = 84;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var12 = "<col=A00000>" + ok.field_b[var11] + "</col>";
                        if (null != var10) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var10 = var12;
                        if (var13 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var10 = var10 + ", " + var12;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var11++;
                        if (var13 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        sn.field_e = "<col=A00000>" + op.field_t + "<br>" + ll.field_h + var10;
                        if (var13 == 0) {
                            statePc = 102;
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
                        ac.field_b.field_lb = false;
                        w.field_e.field_E = qr.field_c;
                        if (var9 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = rl.field_s;
                        stackIn_95_0 = stackOut_92_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackOut_94_0 = ea.field_g;
                        stackIn_95_0 = stackOut_94_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var10 = stackIn_95_0;
                        var11 = nv.field_F.field_X.a(var10) + nv.field_F.field_X.a('.') * 3;
                        if (16 != (de.field_c & 48)) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var10 = var10 + ".";
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        nv.field_F.field_A = 0;
                        nv.field_F.field_kb = (nv.field_F.field_q + -var11) / 2;
                        if ((de.field_c & 48) != 32) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var10 = var10 + "..";
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (48 != (48 & de.field_c)) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var10 = var10 + "...";
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        nv.field_F.field_E = var10;
                        ua.field_k.field_E = vt.field_a.toUpperCase();
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = dn.field_Cb;
                        stackOut_102_1 = 0;
                        stackIn_113_0 = stackOut_102_0;
                        stackIn_113_1 = stackOut_102_1;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        if (!param2) {
                            statePc = 113;
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
                        stackOut_103_0 = (hd) (Object) stackIn_103_0;
                        stackOut_103_1 = stackIn_103_1;
                        stackOut_103_2 = param1;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        stackIn_104_2 = stackOut_103_2;
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
                        stackOut_104_0 = (hd) (Object) stackIn_104_0;
                        stackOut_104_1 = stackIn_104_1;
                        stackIn_113_0 = stackOut_104_0;
                        stackIn_113_1 = stackOut_104_1;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        if (stackIn_104_2) {
                            statePc = 113;
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
                        stackOut_105_0 = (hd) (Object) stackIn_105_0;
                        stackOut_105_1 = stackIn_105_1;
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_107_1 = stackOut_105_1;
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
                        stackOut_107_0 = (hd) (Object) stackIn_107_0;
                        stackOut_107_1 = stackIn_107_1;
                        stackOut_107_2 = td.field_b;
                        stackIn_108_0 = stackOut_107_0;
                        stackIn_108_1 = stackOut_107_1;
                        stackIn_108_2 = stackOut_107_2;
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
                        stackOut_108_0 = (hd) (Object) stackIn_108_0;
                        stackOut_108_1 = stackIn_108_1;
                        stackIn_113_0 = stackOut_108_0;
                        stackIn_113_1 = stackOut_108_1;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        if (stackIn_108_2) {
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
                        stackOut_109_0 = (hd) (Object) stackIn_109_0;
                        stackOut_109_1 = stackIn_109_1;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
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
                        stackOut_111_0 = (hd) (Object) stackIn_111_0;
                        stackOut_111_1 = stackIn_111_1;
                        stackOut_111_2 = 1;
                        stackIn_114_0 = stackOut_111_0;
                        stackIn_114_1 = stackOut_111_1;
                        stackIn_114_2 = stackOut_111_2;
                        statePc = 114;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = (hd) (Object) stackIn_113_0;
                        stackOut_113_1 = stackIn_113_1;
                        stackOut_113_2 = 0;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        stackIn_114_2 = stackOut_113_2;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        ((hd) (Object) stackIn_114_0).b(stackIn_114_1, stackIn_114_2 != 0);
                        stackOut_114_0 = fp.field_p;
                        stackOut_114_1 = 0;
                        stackIn_125_0 = stackOut_114_0;
                        stackIn_125_1 = stackOut_114_1;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        if (!param2) {
                            statePc = 125;
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
                        stackOut_115_0 = (hd) (Object) stackIn_115_0;
                        stackOut_115_1 = stackIn_115_1;
                        stackOut_115_2 = param1;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        stackIn_116_2 = stackOut_115_2;
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
                        stackOut_116_0 = (hd) (Object) stackIn_116_0;
                        stackOut_116_1 = stackIn_116_1;
                        stackIn_125_0 = stackOut_116_0;
                        stackIn_125_1 = stackOut_116_1;
                        stackIn_117_0 = stackOut_116_0;
                        stackIn_117_1 = stackOut_116_1;
                        if (stackIn_116_2) {
                            statePc = 125;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = (hd) (Object) stackIn_117_0;
                        stackOut_117_1 = stackIn_117_1;
                        stackIn_119_0 = stackOut_117_0;
                        stackIn_119_1 = stackOut_117_1;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = (hd) (Object) stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1;
                        stackOut_119_2 = td.field_b;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        stackIn_120_2 = stackOut_119_2;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = (hd) (Object) stackIn_120_0;
                        stackOut_120_1 = stackIn_120_1;
                        stackIn_125_0 = stackOut_120_0;
                        stackIn_125_1 = stackOut_120_1;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        if (stackIn_120_2) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = (hd) (Object) stackIn_121_0;
                        stackOut_121_1 = stackIn_121_1;
                        stackIn_123_0 = stackOut_121_0;
                        stackIn_123_1 = stackOut_121_1;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = (hd) (Object) stackIn_123_0;
                        stackOut_123_1 = stackIn_123_1;
                        stackOut_123_2 = 1;
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
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = (hd) (Object) stackIn_125_0;
                        stackOut_125_1 = stackIn_125_1;
                        stackOut_125_2 = 0;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        stackIn_126_2 = stackOut_125_2;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ((hd) (Object) stackIn_126_0).b(stackIn_126_1, stackIn_126_2 != 0);
                        stackOut_126_0 = tn.field_f;
                        stackOut_126_1 = 0;
                        stackIn_137_0 = stackOut_126_0;
                        stackIn_137_1 = stackOut_126_1;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        if (!param2) {
                            statePc = 137;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = (hd) (Object) stackIn_127_0;
                        stackOut_127_1 = stackIn_127_1;
                        stackOut_127_2 = param1;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        stackIn_128_2 = stackOut_127_2;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackOut_128_0 = (hd) (Object) stackIn_128_0;
                        stackOut_128_1 = stackIn_128_1;
                        stackIn_137_0 = stackOut_128_0;
                        stackIn_137_1 = stackOut_128_1;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        if (stackIn_128_2) {
                            statePc = 137;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = (hd) (Object) stackIn_129_0;
                        stackOut_129_1 = stackIn_129_1;
                        stackIn_131_0 = stackOut_129_0;
                        stackIn_131_1 = stackOut_129_1;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = (hd) (Object) stackIn_131_0;
                        stackOut_131_1 = stackIn_131_1;
                        stackOut_131_2 = td.field_b;
                        stackIn_132_0 = stackOut_131_0;
                        stackIn_132_1 = stackOut_131_1;
                        stackIn_132_2 = stackOut_131_2;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = (hd) (Object) stackIn_132_0;
                        stackOut_132_1 = stackIn_132_1;
                        stackIn_137_0 = stackOut_132_0;
                        stackIn_137_1 = stackOut_132_1;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        if (!stackIn_132_2) {
                            statePc = 137;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = (hd) (Object) stackIn_133_0;
                        stackOut_133_1 = stackIn_133_1;
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_135_1 = stackOut_133_1;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = (hd) (Object) stackIn_135_0;
                        stackOut_135_1 = stackIn_135_1;
                        stackOut_135_2 = 1;
                        stackIn_138_0 = stackOut_135_0;
                        stackIn_138_1 = stackOut_135_1;
                        stackIn_138_2 = stackOut_135_2;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = (hd) (Object) stackIn_137_0;
                        stackOut_137_1 = stackIn_137_1;
                        stackOut_137_2 = 0;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        stackIn_138_2 = stackOut_137_2;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        ((hd) (Object) stackIn_138_0).b(stackIn_138_1, stackIn_138_2 != 0);
                        ni.field_l.field_b.h((byte) 118);
                        if (null == ow.field_b) {
                            statePc = 159;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = 0;
                        stackIn_140_0 = stackOut_139_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = stackIn_140_0;
                        stackIn_142_0 = stackOut_140_0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (stackIn_142_0 != ac.field_b.field_sb) {
                            statePc = 145;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        nv.a(param3, 32361);
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (-1 != (ua.field_k.field_sb ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (hw.field_k) {
                            statePc = 153;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        up.a(param3, 0);
                        if (var13 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        mp.a(param3, (byte) 79);
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        ma.a(param3, (byte) -127, ow.field_b, true);
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 158: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var4, "ri.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 159: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ri(hu param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        String stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        Object stackOut_4_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_27_0 = 0;
        String stackOut_38_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        if (var2_int <= 20) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2_int = 20;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = new char[var2_int];
                        if (param1 == -100) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = null;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (String) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 38;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = param0.charAt(var4);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 < 65) {
                            statePc = 17;
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
                        stackOut_10_0 = var5;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 > 90) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3[var4] = (char)(var5 + 32);
                        if (var6 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-98 < (var5 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var5;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 <= 122) {
                            statePc = 34;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-49 < (var5 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 57;
                        stackIn_28_0 = stackOut_27_0;
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
                        if (stackIn_28_0 >= var5) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3[var4] = '_';
                        if (var6 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3[var4] = (char) var5;
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
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = new String(var3);
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        stackOut_41_0 = (RuntimeException) var2;
                        stackOut_41_1 = new StringBuilder().append("ri.G(");
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (param0 == null) {
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
                        stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                        stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                        stackOut_42_2 = "{...}";
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_45_2 = stackOut_42_2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                    stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                    stackOut_44_2 = "null";
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    throw nb.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_u = null;
              if (param0) {
                break L0;
              } else {
                field_s = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_s = null;
          field_v = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Pending";
        field_v = "to go straight into a multiplayer Exhibition Game with a preset team";
        field_r = 200;
        field_u = (sr) (Object) new ba();
    }
}
