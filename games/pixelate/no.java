/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends kd {
    private int field_f;
    static String field_n;
    static tf[] field_p;
    static String field_g;
    private int field_i;
    static String field_j;
    static int field_h;
    private int field_e;
    private int field_q;
    private int field_k;
    private String field_m;
    private boolean field_o;
    private jl field_l;

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, eq param6, int param7) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_36_0 = 0;
        lo[][] stackIn_40_0 = null;
        lo[][] stackIn_41_0 = null;
        lo[][] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        lo[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        lo var13 = null;
        int var14 = 0;
        int var15 = 0;
        lo[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > param7) {
                            statePc = 39;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var8_int = 1;
                        var9 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = var9;
                        stackIn_4_1 = h.field_Z.length;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 >= stackIn_4_1) {
                            statePc = 35;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var18 = h.field_Z[var9];
                        var17 = var18;
                        var10_ref_int__ = var17;
                        var11 = 0;
                        stackIn_36_0 = 0;
                        stackIn_6_0 = stackIn_36_0;
                        if (var15 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = stackIn_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var18.length <= var12) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var13_int = var18[var12];
                        var14 = var10_ref_int__[1 + var12];
                        stackIn_25_0 = var13_int;
                        stackIn_9_0 = stackIn_25_0;
                        stackIn_25_1 = -1;
                        stackIn_9_1 = stackIn_25_1;
                        if (var15 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 != stackIn_9_1) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var14 ^ -1) != (ia.field_a[param4] ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param7 != var13_int) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var14 != param5) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = 1;
                        if (var15 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var13_int ^ -1) <= (param7 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((kf.field_o[var13_int] & 255) != var14) {
                            statePc = 34;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 += 2;
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var11 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (fj.field_b == param7) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8_int = 0;
                        var12 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var18.length;
                        stackIn_25_1 = var12;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= stackIn_25_1) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var13_int = var18[var12];
                        stackIn_4_0 = -1;
                        stackIn_27_0 = stackIn_4_0;
                        stackIn_4_1 = var13_int;
                        stackIn_27_1 = stackIn_4_1;
                        if (var15 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != stackIn_27_1) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ib.field_b = true;
                        if (var15 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((param7 ^ -1) < (var13_int ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        lc.field_t[var13_int] = true;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var12 += 2;
                        if (var15 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9++;
                        if (var15 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var8_int;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        pb.field_f = true;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var15 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_41_0 = hc.field_L;
                        stackIn_40_0 = stackIn_41_0;
                        if ((param7 ^ -1) != 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_42_0 = (lo[][]) ((Object) stackIn_40_0);
                        stackIn_42_1 = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = (lo[][]) ((Object) stackIn_41_0);
                        stackIn_42_1 = param7 + 4;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var16 = stackIn_42_0[stackIn_42_1];
                        var8 = var16;
                        var9 = 1;
                        if (!param3) {
                            statePc = 60;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((param7 ^ -1) == 0) {
                            statePc = 53;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var10 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var10 >= var16.length - 1) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_52_0 = k.field_k[(var10 + param1) / 8] & 1 << (7 & var10 + param1);
                        stackIn_47_0 = stackIn_52_0;
                        if (var15 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9 = 0;
                        if (var15 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = param1 + (oe.field_Rb[param7] & 255);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param1 = stackIn_52_0;
                        if (var15 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var10 >= ia.field_a.length) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_110_0 = 0;
                        stackIn_56_0 = stackIn_110_0;
                        stackIn_110_1 = qm.field_J[var10 / 8] & 1 << (7 & var10);
                        stackIn_56_1 = stackIn_110_1;
                        if (var15 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 == stackIn_56_1) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9 = 0;
                        if (var15 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10 = 0;
                        var11 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (0 != (param7 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_65_0 = ia.field_a.length;
                        stackIn_63_0 = stackIn_65_0;
                        if (var15 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_66_0 = stackIn_63_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = -1;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = stackIn_65_0 + var16.length;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 <= var11) {
                            statePc = 97;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-1 != param7) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        param4 = var11;
                        if (var15 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        kf.field_o[param7] = (byte)var11;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((param7 ^ -1) != 0) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (-2 == (ia.field_a.length ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var13 = var16[var11 + 1];
                        if (param3) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-1 == param7) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var11 != (io.field_c.field_Eb[param7] & 255)) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_81_0 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_81_0 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((ia.field_a[var11] ^ -1) != (io.field_c.field_ec ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_81_0 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var12 = stackIn_81_0;
                        if (var15 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var13.field_U) {
                            statePc = 86;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var9 == 0) {
                            statePc = 87;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (!var13.field_rb) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_88_0 = 1;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_88_0 = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var12 = stackIn_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var15 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var12 = 1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var12 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var10 = 1;
                        no.a(param0, param1, (byte) 124, param3, param4, param5, param6, 1 + param7);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (pb.field_f) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 95: {
                    return;
                }
                case 96: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var10 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var11 = 0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if ((var16.length - 1 ^ -1) >= (var11 ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_110_0 = 0;
                        stackIn_102_0 = stackIn_110_0;
                        stackIn_110_1 = param7 ^ -1;
                        stackIn_102_1 = stackIn_110_1;
                        if (var15 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0 == stackIn_102_1) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        kf.field_o[param7] = (byte)var11;
                        if (var15 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        param4 = var11;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        no.a(param0, param1, (byte) 83, param3, param4, param5, param6, param7 - -1);
                        if (!pb.field_f) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 107: {
                    return;
                }
                case 108: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackIn_110_0 = param2;
                        stackIn_110_1 = 67;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (stackIn_110_0 > stackIn_110_1) {
                            statePc = 117;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        field_g = (String) null;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_115_0 = (RuntimeException) (var8_ref);
                    stackIn_114_0 = stackIn_115_0;
                    stackIn_115_1 = new StringBuilder().append("no.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_114_1 = stackIn_115_1;
                    if (param6 == null) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_116_0 = (RuntimeException) ((Object) stackIn_114_0);
                    stackIn_116_1 = (StringBuilder) ((Object) stackIn_114_1);
                    stackIn_116_2 = "{...}";
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = (RuntimeException) ((Object) stackIn_115_0);
                    stackIn_116_1 = (StringBuilder) ((Object) stackIn_115_1);
                    stackIn_116_2 = "null";
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    throw aa.a((Throwable) ((Object) stackIn_116_0), stackIn_116_2 + ',' + param7 + ')');
                }
                case 117: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(int param0) {
        field_g = null;
        field_n = null;
        field_j = null;
        field_p = null;
        if (param0 != 0) {
            field_n = (String) null;
        }
    }

    final static void a(boolean param0, byte param1) {
        ui.field_i.a(param0, 0);
        if (param1 != 34) {
            field_n = (String) null;
        }
        oj var2 = td.field_b;
        if (var2 != null) {
            var2.a(ui.field_i.field_gb, ui.field_i.field_tb, 104);
        }
    }

    final void a(int param0, int param1, String param2, jl param3, int param4, int param5, int param6, int param7) {
        mn stackIn_34_0;
        mn stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        mn stackIn_35_0 = null;
        mn stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        jl stackIn_39_0 = null;
        jl stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mn var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != (param7 ^ -1)) {
                break L1;
              } else {
                param7 = param3.field_M;
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (param3 != this.field_l) {
                  break L2;
                } else {
                  if (this.field_o) {
                    break L2;
                  } else {
                    if (param5 != this.field_i) {
                      break L2;
                    } else {
                      if ((param6 ^ -1) != (this.field_f ^ -1)) {
                        break L2;
                      } else {
                        if (this.field_e != param7) {
                          break L2;
                        } else {
                          if (this.field_q != param4) {
                            break L2;
                          } else {
                            if ((this.field_k ^ -1) != (param0 ^ -1)) {
                              break L2;
                            } else {
                              if (null == this.field_m) {
                                break L2;
                              } else {
                                if (this.field_m.equals(param2)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_q = param4;
                this.field_f = param6;
                this.field_l = param3;
                this.field_i = param5;
                this.field_e = param7;
                this.field_k = param0;
                this.field_o = false;
                this.field_m = param2;
                var16 = new String[1 + param3.b(param2, param0)];
                var17 = var16;
                var10 = Math.max(1, param3.a(param2, new int[]{param0}, var17));
                if (-4 != (this.field_f ^ -1)) {
                  break L3;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    this.field_f = 1;
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (-1 == (this.field_f ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (1 != this.field_f) {
                        break L6;
                      } else {
                        var11 = (this.field_q + -(var10 * this.field_e) >> 188935169) + param3.field_w;
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if ((this.field_f ^ -1) == -3) {
                        break L7;
                      } else {
                        L8: {
                          var12 = (this.field_q - var10 * this.field_e) / (1 + var10);
                          if (0 <= var12) {
                            break L8;
                          } else {
                            var12 = 0;
                            break L8;
                          }
                        }
                        var11 = param3.field_w + var12;
                        this.field_e = this.field_e + var12;
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = -(this.field_e * var10) + this.field_q - param3.field_z;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var11 = param3.field_w;
                break L4;
              }
              this.field_b = new mn[var10];
              var12 = 0;
              L9: while (true) {
                L10: {
                  if (var10 <= var12) {
                    break L10;
                  } else {
                    var13 = var16[var12];
                    if (var15 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L11: {
                        stackIn_34_0 = null;

                        stackIn_34_1 = null;

                        stackIn_34_2 = var11 - param3.field_w;

                        stackIn_34_3 = var11 - -param3.field_z;

                        if (var13 != null) {
                          stackIn_35_0 = null;
                          stackIn_35_1 = null;
                          stackIn_35_2 = stackIn_34_2;
                          stackIn_35_3 = stackIn_34_3;
                          stackIn_35_4 = var13.length();
                          break L11;
                        } else {
                          stackIn_35_0 = null;
                          stackIn_35_1 = null;
                          stackIn_35_2 = stackIn_34_2;
                          stackIn_35_3 = stackIn_34_3;
                          stackIn_35_4 = 0;
                          break L11;
                        }
                      }
                      L12: {
                        var14 = new mn(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                        var14.field_g[0] = 0;
                        if (var13 != null) {
                          L13: {
                            var14.field_g[var13.length()] = param3.c(var13);
                            stackIn_39_0 = (jl) (param3);

                            if (param5 != 3) {
                              stackIn_40_0 = (jl) ((Object) stackIn_39_0);
                              stackIn_40_1 = 0;
                              break L13;
                            } else {
                              stackIn_40_0 = (jl) ((Object) stackIn_39_0);
                              stackIn_40_1 = this.a(var13, param0, param3.c(var13), 60);
                              break L13;
                            }
                          }
                          an.a(stackIn_40_0, stackIn_40_1, (byte) -92, var14, var13);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      var11 = var11 + param7;
                      this.field_b[var12] = var14;
                      var12++;
                      if (var15 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var9);

            stackIn_45_1 = new StringBuilder().append("no.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L14;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param3 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L15;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L15;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_46_0), stackIn_49_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(String param0, boolean param1, int param2, jl param3, int param4) {
        mn var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            this.field_b = null;
            return;
        }
        if (param1) {
            field_g = (String) null;
        }
        if (this.field_l == param3 && this.field_o && 1 == this.field_i && null != this.field_m) {
            if (!(!this.field_m.equals(param0))) {
                return;
            }
        }
        try {
            this.field_i = 1;
            this.field_o = true;
            this.field_l = param3;
            var8 = this.a(param0, 0, param3, param2);
            var7 = param3.c(param0);
            var8.field_g[0] = param4 - (var7 >> -409475647);
            var8.field_g[param0.length()] = param4 + (var7 >> 1100722081);
            an.a(param3, 0, (byte) -92, var8, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "no.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        ak stackIn_19_0 = null;
        ak stackIn_20_0 = null;
        ak stackIn_21_0 = null;
        ak stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_110_0 = false;
        int stackIn_129_0 = 0;
        boolean stackIn_139_0 = false;
        boolean stackIn_155_0 = false;
        int stackIn_162_0 = 0;
        ak stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        ak stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        ak stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        ak stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        ak stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        ak stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        ak stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        ak stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        ak stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        ak stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        ak stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        ak stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        ak stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        ak stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        ak stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_109_0;
        boolean stackOut_138_0;
        boolean stackOut_154_0;
        int statePc = 0;
        RuntimeException var5 = null;
        ak var6 = null;
        ak var7 = null;
        ak var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        bb var17 = null;
        Object var18 = null;
        int var18_int = 0;
        uj var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        ak var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        ak var27 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    cm.b(h.field_W, 4740);
                    if (param1 == 1) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (io.field_c != null) {
                        statePc = 5;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 5: {
                    gk.field_kb.field_rb = true;
                    wm.field_d.field_nb = 0;
                    var22 = wm.field_d;
                    var27 = var22;
                    var27.field_K = 0;
                    var6 = ep.field_a;
                    ep.field_a.field_nb = 0;
                    var6.field_K = 0;
                    var7 = nk.field_e;
                    nk.field_e.field_nb = 0;
                    var7.field_K = 0;
                    if (pl.m(param1 + 98)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9_ref_String = io.field_c.field_pc;
                    vp.field_Qb.field_cb = sd.a(fk.field_q, param1 ^ 62, new String[]{var9_ref_String}).toUpperCase();
                    nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, param1 + 255, ai.field_A.field_K);
                    nk.field_e.field_cb = sd.a(qh.field_a, param1 + 23, new String[]{var9_ref_String});
                    var8 = nk.field_e;
                    if (var19 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    vp.field_Qb.field_cb = hk.field_g.toUpperCase();
                    var9 = (ai.field_A.field_K - -2) / 2;
                    wm.field_d.a(ai.field_A.field_nb - 40, 40, 0, 256, var9 - 2);
                    if (io.field_c.field_ec > io.field_c.field_mc) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    wm.field_d.field_cb = fo.field_m.toUpperCase();
                    wm.field_d.field_rb = false;
                    if (var19 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    wm.field_d.field_cb = ca.field_k.toUpperCase();
                    wm.field_d.field_rb = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    wm.field_d.field_zb = bf.field_k.field_zb;
                    if ((ka.field_X ^ -1) >= -1) {
                        statePc = 18;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (ka.field_X != 1) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var10_ref_String = sm.field_k;
                    if (var19 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var10_ref_String = sd.a(d.field_a, 99, new String[]{Integer.toString(ka.field_X)});
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    wm.field_d.field_cb = wm.field_d.field_cb + "<br>" + var10_ref_String;
                    if (0 != (16 & rb.field_o)) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (bm.field_o) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    wm.field_d.field_zb = bf.field_k.field_ab;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    ep.field_a.a(-40 + ai.field_A.field_nb, 40, var9, 256, -var9 + ai.field_A.field_K);
                    ep.field_a.field_cb = kb.field_J.toUpperCase();
                    var8 = ep.field_a;
                    stackIn_21_0 = ep.field_a;
                    stackIn_19_0 = stackIn_21_0;
                    if (!param0) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (ak) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_21_0;
                    if (-1L != (bo.field_e ^ -1L)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (ak) ((Object) stackIn_20_0);
                    stackIn_22_1 = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (ak) ((Object) stackIn_21_0);
                    stackIn_22_1 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_22_0.field_rb = stackIn_22_1 != 0;
                    var10 = 2;
                    if (h.field_Z == null) {
                        statePc = 70;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (kf.field_o != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    kf.field_o = new byte[fj.field_b];
                    lc.field_t = new boolean[fj.field_b];
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var11_int = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((fj.field_b ^ -1) >= (var11_int ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    lc.field_t[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var19 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if ((var10 ^ -1) <= -3) {
                        statePc = 65;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11_int = 0;
                    stackIn_66_0 = 0;
                    stackIn_34_0 = stackIn_66_0;
                    if (var19 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var12 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = var12 ^ -1;
                    stackIn_36_1 = h.field_Z.length ^ -1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 <= stackIn_36_1) {
                        statePc = 59;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var26 = h.field_Z[var12];
                    var23 = var26;
                    var20 = var23;
                    var13 = var20;
                    stackIn_60_0 = 0;
                    stackIn_38_0 = stackIn_60_0;
                    if (var19 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var14_int = stackIn_38_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var14_int >= var26.length) {
                        statePc = 50;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var15 = var26[var14_int];
                    var16 = var20[var14_int + 1];
                    stackIn_51_0 = var15 ^ -1;
                    stackIn_41_0 = stackIn_51_0;
                    if (var19 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((var16 ^ -1) != (255 & io.field_c.field_Eb[var15] ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var10 ^ -1) == -1) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = io.field_c.field_mc;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = io.field_c.field_ec;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var17_int = stackIn_47_0;
                    if ((var17_int ^ -1) != (var16 ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11_int = 1;
                    var14_int = -1;
                    stackIn_51_0 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var15 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if ((var26.length ^ -1) >= (var15 ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var16 = var26[var15];
                    stackIn_36_0 = var16;
                    stackIn_54_0 = stackIn_36_0;
                    stackIn_36_1 = var14_int;
                    stackIn_54_1 = stackIn_36_1;
                    if (var19 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 <= stackIn_54_1) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var14_int = var16;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    lc.field_t[var14_int] = true;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = var11_int;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var19 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = wo.field_h ^ -1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 > -3) {
                        statePc = 70;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (bc.field_m[12]) {
                        statePc = 69;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var10 = 2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (2 > var10) {
                        statePc = 151;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (null != jm.field_r) {
                        statePc = 76;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (w.field_z != null) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (null != pa.field_a) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (oo.field_e != null) {
                        statePc = 76;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var16 >= fj.field_b) {
                        statePc = 106;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var17_int = io.field_c.field_Eb[var16] & 255;
                    if (var19 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (jm.field_r == null) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (jm.field_r[var16] == null) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (!jm.field_r[var16][var17_int]) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11_int = 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (w.field_z == null) {
                        statePc = 92;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (null != w.field_z[var16]) {
                        statePc = 86;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var18_int = w.field_z[var16][var17_int];
                    if ((var18_int ^ -1) < (var13_int ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var13_int = var18_int;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if ((var18_int ^ -1) == -1) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (fe.field_a) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var11_int = 1;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (null == pa.field_a) {
                        statePc = 101;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (null != pa.field_a[var16]) {
                        statePc = 95;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var18_int = pa.field_a[var16][var17_int];
                    if ((var14_int ^ -1) <= (var18_int ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var14_int = var18_int;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (!fe.field_a) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var11_int = 1;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (oo.field_e == null) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (null != oo.field_e[var16]) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var15 = var15 | oo.field_e[var16][var17_int];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var16 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var17 = ae.field_c.field_Fb.field_L;
                    var18_ref = (uj) ((Object) var17.c(1504642273));
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (var18_ref == null) {
                        statePc = 128;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackOut_109_0 = var18_ref.b((byte) -98);
                    stackIn_129_0 = stackOut_109_0 ? 1 : 0;
                    stackIn_110_0 = stackOut_109_0;
                    if (var19 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (stackIn_110_0) {
                        statePc = 127;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var11_int == 0) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (!var18_ref.field_Xb) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if ((var18_ref.field_Rb ^ -1) > (var13_int ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if ((var18_ref.field_Yb ^ -1) > (var14_int ^ -1)) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (((var18_ref.field_Ib ^ -1) & var15 ^ -1) < -1) {
                        statePc = 123;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var12 != 0) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var18_ref = (uj) ((Object) var17.f(1504642273));
                    if (var19 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_129_0 = -3;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 < (wo.field_h ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (bc.field_m[12]) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var16 = 0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var16 != 0) {
                        statePc = 145;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var19 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    ep.field_a.field_rb = false;
                    if (!ep.field_a.field_R) {
                        statePc = 170;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var13_int >= fj.field_b) {
                        statePc = 161;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackOut_138_0 = lc.field_t[var13_int];
                    stackIn_162_0 = stackOut_138_0 ? 1 : 0;
                    stackIn_139_0 = stackOut_138_0;
                    if (var19 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0) {
                        statePc = 141;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var24 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var11 = (String) (var11) + ", " + var24;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var11 = var24;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    ep.field_a.field_rb = false;
                    if (!ep.field_a.field_R) {
                        statePc = 150;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (0 != nd.field_b.field_g.field_Jb) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    up.field_o = pc.field_u;
                    if (var19 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    up.field_o = sd.a(li.field_b, 107, new String[]{fb.field_Gb});
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (var19 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    ep.field_a.field_rb = false;
                    if (!ep.field_a.field_R) {
                        statePc = 170;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var13_int >= fj.field_b) {
                        statePc = 161;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackOut_154_0 = lc.field_t[var13_int];
                    stackIn_162_0 = stackOut_154_0 ? 1 : 0;
                    stackIn_155_0 = stackOut_154_0;
                    if (var19 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0) {
                        statePc = 157;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var25 = "<col=A00000>" + jk.field_e[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var11 = (String) (var11) + ", " + var25;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var11 = var25;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_162_0 = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (stackIn_162_0 == var10) {
                        statePc = 166;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var13_ref = aq.field_c;
                    if (var12 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var14 = sd.a(ff.field_b, 31, new String[]{(String) (var11)});
                    if (var19 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var14 = fg.field_b + (String) (var11);
                    statePc = 169;
                    continue stateLoop;
                }
                case 166: {
                    var13_ref = ji.field_a;
                    if (var12 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var14 = sd.a(sm.field_n, 80, new String[]{(String) (var11)});
                    if (var19 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var14 = cf.field_x + (String) (var11);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    up.field_o = "<col=A00000>" + var13_ref + "<br>" + var14;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (0L != bo.field_e) {
                        statePc = 172;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var9 = (int)(-hm.a(64) + bo.field_e);
                    var9 = (var9 + 999) / 1000;
                    if ((var9 ^ -1) > -2) {
                        statePc = 174;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var9 = 1;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    var8.field_cb = sd.a(ao.field_i, 100, new String[]{Integer.toString(var9)});
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    qo.field_q.field_cb = sd.a(oe.field_Gb, param1 + 68, new String[]{Integer.toString(io.field_c.field_mc), Integer.toString(io.field_c.field_ec)});
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    stackIn_181_0 = ff.field_h;
                    stackIn_178_0 = stackIn_181_0;
                    stackIn_181_1 = -28476;
                    stackIn_178_1 = stackIn_181_1;
                    if (!param4) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_181_0 = (ak) ((Object) stackIn_178_0);
                    stackIn_179_0 = stackIn_181_0;
                    stackIn_181_1 = stackIn_178_1;
                    stackIn_179_1 = stackIn_181_1;
                    if (param3) {
                        statePc = 181;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    stackIn_181_0 = (ak) ((Object) stackIn_179_0);
                    stackIn_180_0 = stackIn_181_0;
                    stackIn_181_1 = stackIn_179_1;
                    stackIn_180_1 = stackIn_181_1;
                    if (bm.field_o) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    stackIn_182_0 = (ak) ((Object) stackIn_180_0);
                    stackIn_182_1 = stackIn_180_1;
                    stackIn_182_2 = 1;
                    statePc = 182;
                    continue stateLoop;
                }
                case 181: {
                    stackIn_182_0 = (ak) ((Object) stackIn_181_0);
                    stackIn_182_1 = stackIn_181_1;
                    stackIn_182_2 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    ((ak) (Object) stackIn_182_0).a(stackIn_182_1, stackIn_182_2 != 0);
                    stackIn_186_0 = ai.field_A;
                    stackIn_183_0 = stackIn_186_0;
                    stackIn_186_1 = -28476;
                    stackIn_183_1 = stackIn_186_1;
                    if (!param4) {
                        statePc = 186;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackIn_186_0 = (ak) ((Object) stackIn_183_0);
                    stackIn_184_0 = stackIn_186_0;
                    stackIn_186_1 = stackIn_183_1;
                    stackIn_184_1 = stackIn_186_1;
                    if (param3) {
                        statePc = 186;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_186_0 = (ak) ((Object) stackIn_184_0);
                    stackIn_185_0 = stackIn_186_0;
                    stackIn_186_1 = stackIn_184_1;
                    stackIn_185_1 = stackIn_186_1;
                    if (bm.field_o) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    stackIn_187_0 = (ak) ((Object) stackIn_185_0);
                    stackIn_187_1 = stackIn_185_1;
                    stackIn_187_2 = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 186: {
                    stackIn_187_0 = (ak) ((Object) stackIn_186_0);
                    stackIn_187_1 = stackIn_186_1;
                    stackIn_187_2 = 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    ((ak) (Object) stackIn_187_0).a(stackIn_187_1, stackIn_187_2 != 0);
                    stackIn_191_0 = ra.field_e;
                    stackIn_188_0 = stackIn_191_0;
                    stackIn_191_1 = -28476;
                    stackIn_188_1 = stackIn_191_1;
                    if (!param4) {
                        statePc = 191;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    stackIn_191_0 = (ak) ((Object) stackIn_188_0);
                    stackIn_189_0 = stackIn_191_0;
                    stackIn_191_1 = stackIn_188_1;
                    stackIn_189_1 = stackIn_191_1;
                    if (param3) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackIn_191_0 = (ak) ((Object) stackIn_189_0);
                    stackIn_190_0 = stackIn_191_0;
                    stackIn_191_1 = stackIn_189_1;
                    stackIn_190_1 = stackIn_191_1;
                    if (!bm.field_o) {
                        statePc = 191;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    stackIn_192_0 = (ak) ((Object) stackIn_190_0);
                    stackIn_192_1 = stackIn_190_1;
                    stackIn_192_2 = 1;
                    statePc = 192;
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = (ak) ((Object) stackIn_191_0);
                    stackIn_192_1 = stackIn_191_1;
                    stackIn_192_2 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    ((ak) (Object) stackIn_192_0).a(stackIn_192_1, stackIn_192_2 != 0);
                    nd.field_b.field_g.b((byte) -122);
                    if (null != io.field_c) {
                        statePc = 194;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (0 == gk.field_kb.field_P) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    qg.a(io.field_c.c((byte) 8), param2, false);
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (0 == wm.field_d.field_P) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    bm.field_o = true;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if ((ep.field_a.field_P ^ -1) != -1) {
                        statePc = 200;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 200: {
                    of.field_c = true;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (0 != hb.field_eb.field_P) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    bm.field_o = false;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    be.a(false, io.field_c, param2, -1);
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void e(int param0) {
        Object stackIn_23_0 = null;
        Object stackIn_33_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        tf var5 = null;
        tf var6 = null;
        tf var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        t.a(243, 197, 369, 143, 16777215);
                        t.d(244, 198, 367, 141, 0);
                        if (wg.field_g != null) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == qe.field_A) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (param0 == -19308) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_p = (tf[]) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = wg.field_g[ae.field_b];
                        if (var5 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5.b(245, 199);
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (qe.field_A == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        qe.field_A.a(mk.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (ui.field_k <= jn.field_q) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = wg.field_g[jc.field_b];
                        if (var6 != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = jn.field_q * (var6.field_A - -60) / ui.field_k;
                        var3 = var2_int + -30;
                        if (!pm.field_e) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        kj.a(var3 * -256 / 30, var6, 245, -123, 199, (var6.field_A - var3) * 256 / 30);
                        if (var4 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        kj.a(256 * (-var3 + var6.field_A) / 30, var6, 245, 89, 199, -256 * var3 / 30);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == qe.field_A) {
                            statePc = 38;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2 = null;
                        var3 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var3 ^ -1) <= (wg.field_g.length ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = wg.field_g[var3];
                        stackIn_33_0 = null;
                        stackIn_23_0 = stackIn_33_0;
                        if (var4 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != var7) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7.field_A != 365) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-140 != (var7.field_B ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var2 == null) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2 = (String) (var2) + ", " + var3;
                        if (var4 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var2 = Integer.toString(var3);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = null;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 != var2) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        qe.field_A.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var1), "no.P(" + param0 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static long d(int param0) {
        if (param0 != 8) {
            field_j = (String) null;
        }
        return -jc.field_c + hm.a(64);
    }

    final void a(jl param0, int param1, int param2, boolean param3, String param4) {
        mn var8 = null;
        mn var9 = null;
        if (!(param4 != null)) {
            this.field_b = null;
            return;
        }
        if (this.field_l == param0 && this.field_o && -3 == (this.field_i ^ -1) && this.field_m != null && this.field_m.equals(param4)) {
            return;
        }
        this.field_m = param4;
        this.field_i = 2;
        this.field_o = true;
        this.field_l = param0;
        if (param3) {
            return;
        }
        try {
            var8 = this.a(param4, 0, param0, param1);
            var9 = var8;
            var9.field_g[0] = -param0.c(param4) + param2;
            var9.field_g[param4.length()] = param2;
            an.a(param0, 0, (byte) -92, var9, param4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "no.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final mn a(String param0, int param1, jl param2, int param3) {
        mn var5 = null;
        RuntimeException var5_ref = null;
        mn var6 = null;
        mn stackIn_2_0 = null;
        mn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new mn(-param2.field_w + param3, param3 - -param2.field_z, param0.length());
            var5 = var6;
            if (param1 == 0) {
              this.field_b = new mn[]{var6};
              stackIn_4_0 = (mn) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("no.T(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(String param0, int param1, jl param2, int param3, int param4) {
        mn var7 = null;
        int var6_int = -72 % ((param4 - -70) / 49);
        if (!(param0 != null)) {
            this.field_b = null;
            return;
        }
        if (this.field_l == param2 && this.field_o && 0 == this.field_i && this.field_m != null && this.field_m.equals(param0)) {
            return;
        }
        try {
            this.field_o = true;
            this.field_l = param2;
            this.field_i = 0;
            this.field_m = param0;
            var7 = this.a(param0, 0, param2, param1);
            var7.field_g[0] = param3;
            var7.field_g[param0.length()] = param2.c(param0) + param3;
            an.a(param2, 0, (byte) -92, var7, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "no.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public no() {
    }

    static {
        field_n = "Asking for or providing contact information";
        field_g = "Unpacking graphics";
        field_h = 0;
        field_j = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
