/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    private byte[] field_a;
    static boolean field_k;
    static int[] field_h;
    static oc field_f;
    private int[] field_c;
    static int field_b;
    private int[] field_e;
    static String field_m;
    static int field_i;
    static ll[] field_j;
    static int field_g;
    static String field_d;
    static int field_l;

    final int a(int param0, byte param1, byte[] param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_62_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_110_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_109_0 = 0;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 != (param3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 111;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        param3 = param3 + param0;
                        var7_int = 0;
                        var8 = param5;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 <= -113) {
                            statePc = 9;
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
                        u.a(-33);
                        statePc = 7;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param4[var8];
                        if (var9 < 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7_int++;
                        if (var11 != 0) {
                            statePc = 15;
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
                        if (var11 == 0) {
                            statePc = 15;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        stackOut_15_0 = ((u) this).field_c[var7_int];
                        stackOut_15_1 = -1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((stackIn_16_0 ^ stackIn_16_1) > -1) {
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
                        statePc = 24;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if ((param0 ^ -1) > (param3 ^ -1)) {
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
                        if (var11 == 0) {
                            statePc = 109;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 == (64 & var9 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        stackOut_25_0 = var11;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == 0) {
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
                        var7_int++;
                        statePc = 28;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        stackOut_30_0 = ((u) this).field_c[var7_int];
                        stackOut_30_1 = -1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((stackIn_31_0 ^ stackIn_31_1) <= -1) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if (param0 >= param3) {
                            statePc = 109;
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var7_int = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var9 & 32) != 0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        if (0 <= ((u) this).field_c[var7_int]) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if ((param0 ^ -1) <= (param3 ^ -1)) {
                            statePc = 109;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7_int = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-1 != (16 & var9 ^ -1)) {
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
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        stackOut_51_0 = -1;
                        stackOut_51_1 = ((u) this).field_c[var7_int];
                        stackOut_51_2 = -1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        stackIn_52_2 = stackOut_51_2;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 < (stackIn_52_1 ^ stackIn_52_2)) {
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
                        statePc = 60;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if (param3 > param0) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var11 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var7_int = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var9 & 8) == 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        stackOut_61_0 = var11;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 == 0) {
                            statePc = 66;
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
                        var7_int++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        stackOut_66_0 = ((u) this).field_c[var7_int];
                        stackOut_66_1 = -1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((stackIn_67_0 ^ stackIn_67_1) <= -1) {
                            statePc = 72;
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
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if (param0 >= param3) {
                            statePc = 109;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var7_int = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-1 != (4 & var9 ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 77;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        if (((u) this).field_c[var7_int] < 0) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if ((param0 ^ -1) > (param3 ^ -1)) {
                            statePc = 83;
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
                        if (var11 == 0) {
                            statePc = 109;
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
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7_int = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-1 != (2 & var9 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        if (0 <= ((u) this).field_c[var7_int]) {
                            statePc = 97;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if (param0 < param3) {
                            statePc = 96;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var11 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var7_int = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((var9 & 1 ^ -1) != -1) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var7_int = ((u) this).field_c[var7_int];
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var10 = ((u) this).field_c[var7_int];
                        stackOut_102_0 = ((u) this).field_c[var7_int];
                        stackOut_102_1 = -1;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((stackIn_103_0 ^ stackIn_103_1) <= -1) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        param0++;
                        param2[param0] = (byte)(var10 ^ -1);
                        if ((param0 ^ -1) <= (param3 ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var7_int = 0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = -param5 + (1 + var8);
                        stackIn_110_0 = stackOut_109_0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    return stackIn_110_0;
                }
                case 111: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    try {
                        stackOut_112_0 = (RuntimeException) var7;
                        stackOut_112_1 = new StringBuilder().append("u.A(").append(param0).append(44).append(param1).append(44);
                        stackIn_115_0 = stackOut_112_0;
                        stackIn_115_1 = stackOut_112_1;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        if (param2 == null) {
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
                    try {
                        stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
                        stackOut_116_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_116_2).append(44).append(param3).append(44);
                        stackIn_119_0 = stackOut_116_0;
                        stackIn_119_1 = stackOut_116_1;
                        stackIn_117_0 = stackOut_116_0;
                        stackIn_117_1 = stackOut_116_1;
                        if (param4 == null) {
                            statePc = 119;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
                        stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
                        stackOut_117_2 = "{...}";
                        stackIn_120_0 = stackOut_117_0;
                        stackIn_120_1 = stackOut_117_1;
                        stackIn_120_2 = stackOut_117_2;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 119: {
                    stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
                    stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
                    stackOut_119_2 = "null";
                    stackIn_120_0 = stackOut_119_0;
                    stackIn_120_1 = stackOut_119_1;
                    stackIn_120_2 = stackOut_119_2;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    throw aa.a((Throwable) (Object) stackIn_120_0, (String) (Object) (stackIn_120_2 + 44 + param5 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
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
        int stackIn_5_0 = 0;
        byte[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        byte stackIn_12_2 = 0;
        byte[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        byte stackIn_18_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int stackOut_4_0 = 0;
        byte[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        byte stackOut_11_2 = 0;
        byte[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        byte stackOut_17_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 0;
                        var8 = param3 << 450450179;
                        param1 = param1 + param5;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param5 ^ -1) <= (param1 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = 255 & param2[param5];
                        var10 = ((u) this).field_e[var9];
                        var11 = ((u) this).field_a[var9];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = var11;
                        stackIn_25_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var15 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw new RuntimeException("" + var9);
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var12 = var8 >> -1776433085;
                        var13 = var8 & 7;
                        var7_int = var7_int & -var13 >> 1274093471;
                        var14 = var12 - -(-1 + (var11 + var13) >> 1445648387);
                        var8 = var8 + var11;
                        var13 += 24;
                        var7_int = fj.b(var7_int, var10 >>> var13);
                        param0[var12] = (byte)fj.b(var7_int, var10 >>> var13);
                        if (var12 >= var14) {
                            statePc = 23;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        stackOut_11_0 = (byte[]) param0;
                        stackOut_11_1 = var12;
                        stackOut_11_2 = (byte)(var10 >>> var13);
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                        if ((var12 ^ -1) > (var14 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var15 == 0) {
                            statePc = 23;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param0[var12] = (byte)(var10 >>> var13);
                        if ((var12 ^ -1) <= (var14 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        stackOut_17_0 = (byte[]) param0;
                        stackOut_17_1 = var12;
                        stackOut_17_2 = (byte)(var10 >>> var13);
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                        if (var12 < var14) {
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
                        if (var15 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 << -var13;
                        param0[var12] = (byte)(var10 << -var13);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param5++;
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = param4;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == 1) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_b = 117;
                        statePc = 27;
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = -param3 + (var8 + 7 >> 1978117955);
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0;
                }
                case 31: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        stackOut_32_0 = (RuntimeException) var7;
                        stackOut_32_1 = new StringBuilder().append("u.E(");
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param0 == null) {
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
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                        stackOut_33_2 = "{...}";
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_36_2 = stackOut_33_2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                    stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                    stackOut_35_2 = "null";
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    try {
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(param1).append(44);
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param2 == null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = "{...}";
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_40_2 = stackOut_37_2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 39: {
                    stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                    stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                    stackOut_39_2 = "null";
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw aa.a((Throwable) (Object) stackIn_40_0, (String) (Object) (stackIn_40_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(jd param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (0 < param2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (uj.a(-2147483648, param2)) {
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
                        statePc = 8;
                        continue stateLoop;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (int)(((long)param0.c((byte) -46) & 4294967295L) * (long)param2 >> -805192864);
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var3_int = -(int)(4294967296L % (long)param2) + param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = param0.c((byte) -46);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3_int > var4) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = dh.a(var4, true, param2);
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) var3;
                        stackOut_16_1 = new StringBuilder().append("u.G(");
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param0 == null) {
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
                    throw aa.a((Throwable) (Object) stackIn_20_0, (String) (Object) (stackIn_20_2 + 44 + param1 + 44 + param2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        ab var1 = null;
        int var2 = 0;
        cg var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        na var3_ref = null;
        na var4 = null;
        na var4_ref = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        na var5_ref = null;
        String var6 = null;
        String var7 = null;
        cg var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_67_0 = 0;
        cg stackIn_73_0 = null;
        cg stackIn_74_0 = null;
        cg stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_134_0 = null;
        String stackIn_135_0 = null;
        String stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        cg stackOut_72_0 = null;
        cg stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        cg stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_133_0 = null;
        String stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        String stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= -45) {
          L0: {
            L1: {
              L2: {
                var1 = df.field_z;
                var2 = ((wk) (Object) var1).e((byte) -110);
                if ((var2 ^ -1) == -1) {
                  break L2;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L2;
                  } else {
                    if (var2 == 2) {
                      break L2;
                    } else {
                      if (-4 == (var2 ^ -1)) {
                        break L2;
                      } else {
                        if (-5 != (var2 ^ -1)) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (cg) (Object) ph.field_a.b(12623);
              L3: while (true) {
                L4: {
                  L5: {
                    if (var3 == null) {
                      break L5;
                    } else {
                      var3.a(true);
                      var3.a((byte) 88);
                      var3 = (cg) (Object) ph.field_a.a(0);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3 = (cg) (Object) bc.field_c.f(-79);
                  break L4;
                }
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var3 == null) {
                        break L8;
                      } else {
                        stackOut_18_0 = var3.field_Db;
                        stackIn_30_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var11 != 0) {
                          break L7;
                        } else {
                          stackOut_19_0 = stackIn_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          L9: {
                            L10: {
                              if (stackIn_20_0) {
                                break L10;
                              } else {
                                if (var3.field_Kb) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L11: {
                              if (!var3.field_Kb) {
                                break L11;
                              } else {
                                oe.field_b = oe.field_b - 1;
                                var3.field_Kb = false;
                                break L11;
                              }
                            }
                            var3.field_Db = false;
                            jf.a(var3, (byte) -109);
                            break L9;
                          }
                          var3 = (cg) (Object) bc.field_c.a(-1);
                          if (var11 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_29_0 = var2;
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  }
                  L12: {
                    if (stackIn_30_0 != 1) {
                      break L12;
                    } else {
                      if (wi.field_f != null) {
                        va.field_e = wi.field_f.field_ic;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (var2 == 4) {
                        break L14;
                      } else {
                        wi.field_f = null;
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3_int = ((wk) (Object) var1).n(-98);
                    wi.field_f = new na(vf.field_l);
                    wi.field_f.a(46, (long)var3_int);
                    dn.a((wk) (Object) var1, wi.field_f, false, 2);
                    ba.field_a = 0L;
                    break L13;
                  }
                  L15: {
                    L16: {
                      if (-3 == (var2 ^ -1)) {
                        break L16;
                      } else {
                        if (-4 == (var2 ^ -1)) {
                          break L16;
                        } else {
                          om.field_x = null;
                          if (var11 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    if (null != om.field_x) {
                      break L15;
                    } else {
                      om.field_x = new na(vf.field_l);
                      break L15;
                    }
                  }
                  L17: {
                    if (-4 == (var2 ^ -1)) {
                      break L17;
                    } else {
                      dn.field_Db = false;
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L17;
                      }
                    }
                  }
                  dn.field_Db = true;
                  var3_int = 0;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (gh.field_E.length <= var3_int) {
                          break L20;
                        } else {
                          gh.field_E[var3_int] = ((wk) (Object) var1).o(6);
                          var3_int++;
                          if (var11 != 0) {
                            break L19;
                          } else {
                            if (var11 == 0) {
                              continue L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      q.field_L = ((wk) (Object) var1).e((byte) 32);
                      q.field_N = ((wk) (Object) var1).e((byte) 72);
                      break L19;
                    }
                    var3_int = 0;
                    L21: while (true) {
                      L22: {
                        if (var3_int >= ng.field_D.length) {
                          break L22;
                        } else {
                          ng.field_D[var3_int] = ((wk) (Object) var1).o(6);
                          var3_int++;
                          if (var11 != 0) {
                            break L0;
                          } else {
                            if (var11 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L23: {
              if (var2 != 5) {
                break L23;
              } else {
                L24: {
                  var3_long = ((wk) (Object) var1).c(-943038560);
                  var5 = ((wk) (Object) var1).l(-1);
                  var6 = ((wk) (Object) var1).l(-1);
                  var7 = ((wk) (Object) var1).l(-1);
                  var8_ref = fn.a(var3_long, 119);
                  if (var6.equals((Object) (Object) "")) {
                    stackOut_66_0 = 0;
                    stackIn_67_0 = stackOut_66_0;
                    break L24;
                  } else {
                    stackOut_65_0 = 1;
                    stackIn_67_0 = stackOut_65_0;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    var9 = stackIn_67_0;
                    if (null != var8_ref) {
                      break L26;
                    } else {
                      var8_ref = new cg(var5, var7, var3_long);
                      bc.field_c.a((tf) (Object) var8_ref, var3_long, (byte) 126);
                      if (var11 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (var9 == 0) {
                    break L25;
                  } else {
                    var8_ref.a(var5, var7, 93);
                    break L25;
                  }
                }
                L27: {
                  var8_ref.field_Ob = qj.b(-26572) + -(long)((wk) (Object) var1).d(-10674);
                  var8_ref.field_Pb = ((wk) (Object) var1).n(-98);
                  var10 = ((wk) (Object) var1).a(31);
                  stackOut_72_0 = (cg) var8_ref;
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_73_0 = stackOut_72_0;
                  if (0 == (1 & var10)) {
                    stackOut_74_0 = (cg) (Object) stackIn_74_0;
                    stackOut_74_1 = 0;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    break L27;
                  } else {
                    stackOut_73_0 = (cg) (Object) stackIn_73_0;
                    stackOut_73_1 = 1;
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_75_1 = stackOut_73_1;
                    break L27;
                  }
                }
                ((cg) (Object) stackIn_75_0).field_Jb = stackIn_75_1 != 0;
                var8_ref.field_Vb = var10 >> 902129281;
                var8_ref.field_Mb = ((wk) (Object) var1).e((byte) -123);
                var8_ref.field_Bb = ((wk) (Object) var1).e((byte) 100);
                jf.a(var8_ref, (byte) 1);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L23;
                }
              }
            }
            L28: {
              if (6 != var2) {
                break L28;
              } else {
                L29: {
                  var3_long = ((wk) (Object) var1).c(-943038560);
                  var5_int = ((wk) (Object) var1).e((byte) -96);
                  var6 = (String) (Object) fn.a(var3_long, 111);
                  if (var6 == null) {
                    break L29;
                  } else {
                    L30: {
                      if (!((cg) (Object) var6).field_Kb) {
                        break L30;
                      } else {
                        oe.field_b = oe.field_b - 1;
                        ((cg) (Object) var6).field_Kb = false;
                        break L30;
                      }
                    }
                    L31: {
                      L32: {
                        if (-1 != (var5_int ^ -1)) {
                          break L32;
                        } else {
                          ((cg) (Object) var6).a(true);
                          if (var11 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      ((cg) (Object) var6).field_Eb = vd.field_i;
                      ((cg) (Object) var6).field_Sb = var5_int;
                      break L31;
                    }
                    ((cg) (Object) var6).a((byte) 88);
                    break L29;
                  }
                }
                if (var11 == 0) {
                  break L0;
                } else {
                  break L28;
                }
              }
            }
            L33: {
              if (-8 == (var2 ^ -1)) {
                break L33;
              } else {
                L34: {
                  if (-9 == (var2 ^ -1)) {
                    break L34;
                  } else {
                    L35: {
                      if (-10 == (var2 ^ -1)) {
                        break L35;
                      } else {
                        L36: {
                          if (-11 != (var2 ^ -1)) {
                            break L36;
                          } else {
                            var3_ref = (na) (Object) vh.field_a.b(12623);
                            L37: while (true) {
                              L38: {
                                if (null == var3_ref) {
                                  break L38;
                                } else {
                                  var3_ref.a(true);
                                  var3_ref.a((byte) 88);
                                  var3_ref = (na) (Object) vh.field_a.a(0);
                                  if (var11 != 0) {
                                    break L0;
                                  } else {
                                    if (var11 == 0) {
                                      continue L37;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              if (var11 == 0) {
                                break L0;
                              } else {
                                break L36;
                              }
                            }
                          }
                        }
                        L39: {
                          L40: {
                            if (-12 == (var2 ^ -1)) {
                              break L40;
                            } else {
                              if (12 != var2) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          L41: {
                            var3_int = ((wk) (Object) var1).n(-98);
                            var4 = (na) (Object) nk.field_q.a((long)var3_int, (byte) -98);
                            if (null == var4) {
                              break L41;
                            } else {
                              L42: {
                                L43: {
                                  if (-12 != (var2 ^ -1)) {
                                    break L43;
                                  } else {
                                    var4.field_Hb = true;
                                    if (var11 == 0) {
                                      break L42;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                var4.field_Nb = true;
                                break L42;
                              }
                              cb.a(var4, -26);
                              break L41;
                            }
                          }
                          if (var11 == 0) {
                            break L0;
                          } else {
                            break L39;
                          }
                        }
                        L44: {
                          if (-14 != (var2 ^ -1)) {
                            break L44;
                          } else {
                            L45: {
                              var3_int = ((wk) (Object) var1).n(-98);
                              var4_int = ((wk) (Object) var1).e((byte) -107);
                              var5_ref = (na) (Object) nk.field_q.a((long)var3_int, (byte) -105);
                              if (null == var5_ref) {
                                break L45;
                              } else {
                                L46: {
                                  var5_ref.field_Nb = false;
                                  var6 = (String) (Object) var5_ref;
                                  if (0 == var4_int) {
                                    break L46;
                                  } else {
                                    var5_ref.field_ac = var4_int;
                                    var5_ref.field_bc = vd.field_i;
                                    break L46;
                                  }
                                }
                                ((na) (Object) var6).field_Hb = false;
                                cb.a(var5_ref, 25);
                                break L45;
                              }
                            }
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L47: {
                          if ((var2 ^ -1) == -15) {
                            break L47;
                          } else {
                            if ((var2 ^ -1) == -17) {
                              break L47;
                            } else {
                              L48: {
                                if (var2 == 15) {
                                  break L48;
                                } else {
                                  if ((var2 ^ -1) == -18) {
                                    break L48;
                                  } else {
                                    L49: {
                                      if (var2 != 18) {
                                        break L49;
                                      } else {
                                        L50: {
                                          var3_long = ((wk) (Object) var1).c(-943038560);
                                          var5 = ((wk) (Object) var1).l(-1);
                                          var6 = ((wk) (Object) var1).l(-1);
                                          var7 = (String) (Object) vf.a(var3_long, 8192);
                                          if (var7 != null) {
                                            break L50;
                                          } else {
                                            var7 = (String) (Object) new cg(var5, var6, var3_long);
                                            kn.field_qb.a((tf) (Object) var7, var3_long, (byte) 121);
                                            wi.field_f.field_Rb = wi.field_f.field_Rb + 1;
                                            break L50;
                                          }
                                        }
                                        L51: {
                                          ((cg) (Object) var7).field_Pb = ((wk) (Object) var1).n(-98);
                                          var8 = ((wk) (Object) var1).a(16);
                                          ((cg) (Object) var7).field_Vb = var8 >> 1682702497;
                                          stackOut_133_0 = (String) var7;
                                          stackIn_135_0 = stackOut_133_0;
                                          stackIn_134_0 = stackOut_133_0;
                                          if ((var8 & 1 ^ -1) == -1) {
                                            stackOut_135_0 = (String) (Object) stackIn_135_0;
                                            stackOut_135_1 = 0;
                                            stackIn_136_0 = stackOut_135_0;
                                            stackIn_136_1 = stackOut_135_1;
                                            break L51;
                                          } else {
                                            stackOut_134_0 = (String) (Object) stackIn_134_0;
                                            stackOut_134_1 = 1;
                                            stackIn_136_0 = stackOut_134_0;
                                            stackIn_136_1 = stackOut_134_1;
                                            break L51;
                                          }
                                        }
                                        ((cg) (Object) stackIn_136_0).field_Jb = stackIn_136_1 != 0;
                                        ((cg) (Object) var7).field_Mb = ((wk) (Object) var1).e((byte) -109);
                                        ((cg) (Object) var7).field_Bb = ((wk) (Object) var1).e((byte) -120);
                                        ph.field_a.b((pg) (Object) var7, -1);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                    L52: {
                                      if (19 != var2) {
                                        break L52;
                                      } else {
                                        L53: {
                                          var3_long = ((wk) (Object) var1).c(-943038560);
                                          var5_int = ((wk) (Object) var1).e((byte) -111);
                                          var6 = (String) (Object) vf.a(var3_long, 8192);
                                          if (null != var6) {
                                            L54: {
                                              L55: {
                                                if (-1 == (var5_int ^ -1)) {
                                                  break L55;
                                                } else {
                                                  ((cg) (Object) var6).field_Sb = var5_int;
                                                  ((cg) (Object) var6).field_Eb = vd.field_i;
                                                  if (var11 == 0) {
                                                    break L54;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                              }
                                              ((cg) (Object) var6).a(true);
                                              break L54;
                                            }
                                            ((cg) (Object) var6).a((byte) 88);
                                            wi.field_f.field_Rb = wi.field_f.field_Rb - 1;
                                            break L53;
                                          } else {
                                            break L53;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                    L56: {
                                      if (var2 == 20) {
                                        break L56;
                                      } else {
                                        L57: {
                                          if ((var2 ^ -1) == -22) {
                                            break L57;
                                          } else {
                                            L58: {
                                              if ((var2 ^ -1) != -23) {
                                                break L58;
                                              } else {
                                                sk.field_e = ((wk) (Object) var1).n(-98);
                                                jh.field_e = ((wk) (Object) var1).a(121);
                                                if (var11 == 0) {
                                                  break L0;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                            L59: {
                                              if (var2 == 23) {
                                                break L59;
                                              } else {
                                                jh.a((Throwable) null, "L1: " + nn.g((byte) -25), (byte) 20);
                                                ka.b(false);
                                                if (var11 == 0) {
                                                  break L0;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            qf.field_a = ((wk) (Object) var1).c(-943038560);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        L60: {
                                          L61: {
                                            var3_int = ((wk) (Object) var1).n(-98);
                                            if (-1 == (var3_int ^ -1)) {
                                              break L61;
                                            } else {
                                              ba.field_a = qj.b(-26572) + (long)var3_int;
                                              if (var11 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          ba.field_a = 0L;
                                          break L60;
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    dn.a((wk) (Object) var1, wi.field_f, false, 2);
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L48;
                                    }
                                  }
                                }
                              }
                              L62: {
                                var3_long = ((wk) (Object) var1).c(-943038560);
                                var5_int = ((wk) (Object) var1).e((byte) 107);
                                var6 = (String) (Object) fn.a(var3_long, 123);
                                if (null == var6) {
                                  break L62;
                                } else {
                                  L63: {
                                    if ((var5_int ^ -1) != -1) {
                                      ((cg) (Object) var6).field_Eb = vd.field_i;
                                      ((cg) (Object) var6).field_Sb = var5_int;
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                  L64: {
                                    L65: {
                                      if ((var2 ^ -1) == -16) {
                                        break L65;
                                      } else {
                                        if (!((cg) (Object) var6).field_Kb) {
                                          break L64;
                                        } else {
                                          ((cg) (Object) var6).field_Kb = false;
                                          oe.field_b = oe.field_b - 1;
                                          if (var11 == 0) {
                                            break L64;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                    }
                                    ((cg) (Object) var6).field_Db = false;
                                    break L64;
                                  }
                                  jf.a((cg) (Object) var6, (byte) 15);
                                  break L62;
                                }
                              }
                              if (var11 == 0) {
                                break L0;
                              } else {
                                break L47;
                              }
                            }
                          }
                        }
                        L66: {
                          var3_long = ((wk) (Object) var1).c(-943038560);
                          var5 = (String) (Object) fn.a(var3_long, 121);
                          if (null == var5) {
                            break L66;
                          } else {
                            L67: {
                              L68: {
                                if (-15 != (var2 ^ -1)) {
                                  break L68;
                                } else {
                                  ((cg) (Object) var5).field_Db = true;
                                  if (var11 == 0) {
                                    break L67;
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              if (!((cg) (Object) var5).field_Kb) {
                                oe.field_b = oe.field_b + 1;
                                ((cg) (Object) var5).field_Kb = true;
                                break L67;
                              } else {
                                break L67;
                              }
                            }
                            jf.a((cg) (Object) var5, (byte) 127);
                            break L66;
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L69: {
                      var3_int = ((wk) (Object) var1).n(-98);
                      var4_int = ((wk) (Object) var1).e((byte) 105);
                      var5_ref = (na) (Object) nk.field_q.a((long)var3_int, (byte) -70);
                      if (null != var5_ref) {
                        L70: {
                          L71: {
                            if ((var4_int ^ -1) == -1) {
                              break L71;
                            } else {
                              var5_ref.field_bc = vd.field_i;
                              var5_ref.field_ac = var4_int;
                              if (var11 == 0) {
                                break L70;
                              } else {
                                break L71;
                              }
                            }
                          }
                          var5_ref.a(true);
                          break L70;
                        }
                        var5_ref.a((byte) 88);
                        break L69;
                      } else {
                        break L69;
                      }
                    }
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L34;
                    }
                  }
                }
                L72: {
                  var3_int = ((wk) (Object) var1).n(-98);
                  var4 = (na) (Object) nk.field_q.a((long)var3_int, (byte) -93);
                  if (null != var4) {
                    break L72;
                  } else {
                    var4_ref = new na(vf.field_l);
                    nk.field_q.a((tf) (Object) var4_ref, (long)var3_int, (byte) 116);
                    break L72;
                  }
                }
                dn.a((wk) (Object) var1, var4_ref, true, 2);
                cb.a(var4_ref, 67);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L33;
                }
              }
            }
            var3 = (cg) (Object) gm.field_j.b(12623);
            L73: while (true) {
              L74: {
                if (null == var3) {
                  break L74;
                } else {
                  var3.a(true);
                  var3.a((byte) 88);
                  var3 = (cg) (Object) gm.field_j.a(0);
                  if (var11 != 0) {
                    break L0;
                  } else {
                    if (var11 == 0) {
                      continue L73;
                    } else {
                      break L74;
                    }
                  }
                }
              }
              oe.field_b = 0;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 6) {
            if (ka.field_m != null) {
              try {
                L0: {
                  qm.a((java.awt.Canvas) (Object) ka.field_m, (byte) 122);
                  ka.field_m.a(fi.field_d, (byte) 67);
                  ka.field_m = null;
                  if (ob.field_Y == null) {
                    break L0;
                  } else {
                    ob.field_Y.a(true);
                    break L0;
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
              throw decompiledCaughtException;
            } else {
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          on.field_c.requestFocus();
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 1) {
                break L0;
              } else {
                field_k = true;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_f = null;
          field_m = null;
          field_h = null;
          field_d = null;
          field_j = null;
        }
    }

    u(byte[] param0) {
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
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
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
                    var15 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length;
                        ((u) this).field_a = param0;
                        ((u) this).field_e = new int[var2_int];
                        var3 = new int[33];
                        ((u) this).field_c = new int[8];
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
                        stackOut_2_0 = var2_int ^ -1;
                        stackOut_2_1 = var5 ^ -1;
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
                        if (stackIn_3_0 >= stackIn_3_1) {
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
                        if (-1 == (var6 ^ -1)) {
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
                        var7 = 1 << -var6 + 32;
                        var8 = var3[var6];
                        ((u) this).field_e[var5] = var8;
                        if ((var8 & var7 ^ -1) != -1) {
                            statePc = 30;
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
                        var10 = var6 - 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var10 ^ -1) > -2) {
                            statePc = 28;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = var3[var10];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var11;
                        stackOut_13_1 = var8;
                        stackIn_29_0 = stackOut_13_0;
                        stackIn_29_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var15 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 28;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = 1 << -var10 + 32;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var12 & var11 ^ -1) != -1) {
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
                        var3[var10] = fj.b(var12, var11);
                        if (var15 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
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
                        var3[var10] = var3[-1 + var10];
                        if (var15 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10--;
                        if (var15 == 0) {
                            statePc = 11;
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = var7;
                        stackOut_28_1 = var8;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = stackIn_29_0 | stackIn_29_1;
                        if (var15 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 = var3[-1 + var6];
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
                        var3[var6] = var9;
                        var10 = 1 + var6;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-33 > (var10 ^ -1)) {
                            statePc = 38;
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
                        stackOut_33_0 = var3[var10] ^ -1;
                        stackOut_33_1 = var8 ^ -1;
                        stackIn_3_0 = stackOut_33_0;
                        stackIn_3_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (var15 != 0) {
                            statePc = 3;
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
                        if (stackIn_34_0 == stackIn_34_1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3[var10] = var9;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = 0;
                        var11 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((var11 ^ -1) <= (var6 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12 = -2147483648 >>> var11;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = 0;
                        stackOut_41_1 = var12 & var8;
                        stackIn_67_0 = stackOut_41_0;
                        stackIn_67_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var15 != 0) {
                            statePc = 67;
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
                        if (stackIn_42_0 == stackIn_42_1) {
                            statePc = 53;
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
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((u) this).field_c[var10] == 0) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((u) this).field_c[var10] = var4;
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
                        var10 = ((u) this).field_c[var10];
                        stackOut_51_0 = var15;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10++;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var12 = var12 >>> 1;
                        if ((((u) this).field_c.length ^ -1) < (var10 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var13 = new int[2 * ((u) this).field_c.length];
                        var14 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((((u) this).field_c.length ^ -1) >= (var14 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var13[var14] = ((u) this).field_c[var14];
                        var14++;
                        if (var15 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var15 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ((u) this).field_c = var13;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var11++;
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
                        if (var15 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ((u) this).field_c[var10] = var5 ^ -1;
                        stackOut_66_0 = var10 ^ -1;
                        stackOut_66_1 = var4 ^ -1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 <= stackIn_67_1) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var4 = 1 + var10;
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
                        stackOut_73_1 = new StringBuilder().append("u.<init>(");
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
                    throw aa.a((Throwable) (Object) stackIn_77_0, (String) (Object) (stackIn_77_2 + 41));
                }
                case 78: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        String stackIn_39_0 = null;
        String stackIn_48_0 = null;
        Object stackIn_50_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        String stackOut_1_0 = null;
        String stackOut_6_0 = null;
        String stackOut_9_0 = null;
        String stackOut_14_0 = null;
        String stackOut_17_0 = null;
        String stackOut_22_0 = null;
        String stackOut_25_0 = null;
        String stackOut_28_0 = null;
        String stackOut_33_0 = null;
        String stackOut_38_0 = null;
        String stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (1 != param1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = tj.a(126, new String[1], kb.field_e);
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (String) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (-3 == (param1 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = tj.a(-73, new String[1], rj.field_h);
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (String) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        if (param1 != 3) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = tj.a(-54, new String[1], ij.field_Gb);
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return (String) (Object) stackIn_10_0;
                }
                case 11: {
                    try {
                        if (param1 == 4) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = tj.a(125, new String[1], q.field_M);
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return (String) (Object) stackIn_15_0;
                }
                case 16: {
                    try {
                        if (5 != param1) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = tj.a(-95, new String[1], gm.field_n);
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return (String) (Object) stackIn_18_0;
                }
                case 19: {
                    try {
                        if (param1 == 6) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = tj.a(120, new String[1], b.field_b);
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return (String) (Object) stackIn_23_0;
                }
                case 24: {
                    try {
                        if (-8 != (param1 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = tj.a(122, new String[1], ho.field_d);
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return (String) (Object) stackIn_26_0;
                }
                case 27: {
                    try {
                        if ((param1 ^ -1) != -9) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = tj.a(122, new String[1], c.field_c);
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return (String) (Object) stackIn_29_0;
                }
                case 30: {
                    try {
                        if (-12 == (param1 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = tj.a(-92, new String[1], ui.field_w);
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return (String) (Object) stackIn_34_0;
                }
                case 35: {
                    try {
                        if (-13 == (param1 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = tj.a(-85, new String[1], so.field_n);
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return (String) (Object) stackIn_39_0;
                }
                case 40: {
                    try {
                        if (param0 < -125) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        field_l = -80;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param1 == 13) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = tj.a(-123, new String[1], qo.field_d);
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return (String) (Object) stackIn_48_0;
                }
                case 49: {
                    try {
                        stackOut_49_0 = null;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    return (String) (Object) stackIn_50_0;
                }
                case 51: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    try {
                        stackOut_52_0 = (RuntimeException) var3;
                        stackOut_52_1 = new StringBuilder().append("u.B(").append(param0).append(44).append(param1).append(44);
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (param2 == null) {
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
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = "{...}";
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 55: {
                    stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                    stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                    stackOut_55_2 = "null";
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    throw aa.a((Throwable) (Object) stackIn_56_0, (String) (Object) (stackIn_56_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_h = new int[]{76, 77, 78};
        field_m = "Armageddon counter";
        field_f = new oc();
        field_i = 0;
        field_d = "Friends";
    }
}
