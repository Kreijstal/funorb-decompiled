/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static int field_b;
    static String field_d;
    static String[][] field_c;
    static gh field_f;
    static int[][] field_a;
    static String field_e;

    final static int a(gh param0, int param1, boolean param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        String stackIn_71_0 = null;
        boolean stackIn_75_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_78_0 = false;
        int stackIn_78_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_83_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nk var12 = null;
        gh var13 = null;
        String var13_ref = null;
        String var14 = null;
        gh var14_ref = null;
        gh var15 = null;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-2 != (fg.field_Ob ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (he.a((byte) 124)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = param1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if ((fg.field_Ob ^ -1) == -2) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = 64;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 78;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = stackIn_11_0;
                        if ((1008 & fg.field_Ob ^ -1) == param3) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int = 36;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = qa.field_O;
                        var7 = 1;
                        var8 = 1;
                        var9 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (fg.field_Ob < var8) {
                            statePc = 82;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_83_0 = -1;
                        stackIn_16_0 = stackIn_83_0;
                        if (var16 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != (fg.field_Ob & var8 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var16 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = 1;
                        if ((var8 ^ -1) == -2) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10 = hl.field_v.f(var8, -1) ? 1 : 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = 0;
                        if ((var8 ^ -1) != -2) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = (nk) ((Object) ao.field_H.e(13058));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == null) {
                            statePc = 80;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_81_0 = var8 & var12.field_Q ^ -1;
                        stackIn_29_0 = stackIn_81_0;
                        stackIn_81_1 = -1;
                        stackIn_29_1 = stackIn_81_1;
                        if (var16 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == stackIn_29_1) {
                            statePc = 79;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = 2;
                        if (!t.a(rn.field_D, var12.field_N, -20370)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param2) {
                            statePc = 55;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 != (var6 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var16 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-2 != (var12.field_Q ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (bj.a(rn.field_D, var12.field_N, nk.f((byte) -50), (byte) 86)) {
                            statePc = 59;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var16 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!aj.a(ge.field_m, (byte) -120, rn.field_D, var12.field_N, nk.f((byte) -92))) {
                            statePc = 79;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var16 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var6 != 2) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((sj.field_v[var12.field_N] ^ -1) < (li.field_v ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var6 = 1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var7 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var7 = 0;
                        var13 = new gh(-1L, (gh) null);
                        var13.field_Kb = 2;
                        var13.field_Pb = gj.field_a;
                        var13.a(0, param1, 18, 0, var5);
                        param0.a(var13, 125);
                        if (param2) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_71_0 = he.field_h;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = qj.field_c;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var14 = stackIn_71_0;
                        var15 = new gh(-1L, kh.field_s, var14);
                        var15.field_nb = 0;
                        var15.field_L = (mi) ((Object) pl.field_U);
                        var15.a(param3 ^ -1, param1, 18, 0, var5);
                        var15.field_Fb = 1;
                        var15.field_sb = 1;
                        var15.field_Kb = 1;
                        var15.field_I = null;
                        param0.a(var15, 121);
                        param1 = param1 + var15.field_Lb;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var11 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var11 = 1;
                        var13_ref = sn.field_i[var9];
                        var14_ref = new gh(-1L, kh.field_s, var13_ref);
                        var14_ref.field_Kb = 1;
                        var14_ref.field_nb = 11119017;
                        param1 += 2;
                        var14_ref.field_I = lj.field_b;
                        var14_ref.a(0, param1, 15, 0, var5);
                        param1 += 15;
                        param0.a(var14_ref, 118);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_77_0 = param2;
                        stackIn_75_0 = stackIn_77_0;
                        if (var10 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_78_0 = stackIn_75_0;
                        stackIn_78_1 = 1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = stackIn_77_0;
                        stackIn_78_1 = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var13 = se.a(stackIn_78_0, stackIn_78_1 != 0, var6, var12, 14);
                        param1 += 2;
                        var13.a(0, param1, var4_int, 0, var5);
                        param0.a(var13, 127);
                        param1 = param1 + var4_int;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var12 = (nk) ((Object) ao.field_H.a((byte) -48));
                        if (var16 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = var8;
                        stackIn_81_1 = 1390612993;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var8 = stackIn_81_0 << stackIn_81_1;
                        var9++;
                        if (var16 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = param1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    return stackIn_83_0;
                }
                case 84: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_87_0 = (RuntimeException) (var4);
                    stackIn_85_0 = stackIn_87_0;
                    stackIn_87_1 = new StringBuilder().append("te.C(");
                    stackIn_85_1 = stackIn_87_1;
                    if (param0 == null) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_85_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_85_1);
                    stackIn_88_2 = "{...}";
                    statePc = 88;
                    continue stateLoop;
                }
                case 87: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
                    stackIn_88_2 = "null";
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    throw ci.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        ah stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        ah stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ah var6 = null;
        String var7 = null;
        ah var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                te.a((byte) -82);
                break L1;
              }
            }
            var1 = rf.field_d;
            var2 = var1.f((byte) -109);
            if (var2 == 0) {
              L2: {
                if (db.field_h != null) {
                  break L2;
                } else {
                  db.field_h = new dk(128);
                  cc.field_gc = 0;
                  break L2;
                }
              }
              L3: {
                if (1 != var1.f((byte) -111)) {
                  stackIn_14_0 = 0;
                  break L3;
                } else {
                  stackIn_14_0 = 1;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1.h(1);
                  if (var3_int == 0) {
                    break L5;
                  } else {
                    var5 = var1.h(1);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L4;
              }
              L6: {
                var6 = da.a(var4_ref_String, (byte) -41);
                var7 = var1.h(1);
                var8 = ui.a(1, (CharSequence) ((Object) var4_ref_String));
                if (var8 == null) {
                  var8 = var4_ref_String;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (null != var6) {
                  break L7;
                } else {
                  var6 = da.a(var7, (byte) -41);
                  if (null == var6) {
                    break L7;
                  } else {
                    db.field_h.a(var6, 1, (long)var8.hashCode());
                    break L7;
                  }
                }
              }
              L8: {
                if (null == var6) {
                  var6 = new ah();
                  db.field_h.a(var6, param0 ^ 3, (long)var8.hashCode());
                  fieldTemp$0 = cc.field_gc;
                  cc.field_gc = cc.field_gc + 1;
                  var6.field_bc = fieldTemp$0;
                  am.field_c.a(3, var6);
                  break L8;
                } else {
                  break L8;
                }
              }
              var6.field_Tb = var5;
              var6.field_dc = var4_ref_String;
              var6.field_Vb = var7;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 == var2) {
                L9: {
                  if (pi.field_a != null) {
                    break L9;
                  } else {
                    pi.field_a = new dk(128);
                    vd.field_h = 0;
                    break L9;
                  }
                }
                L10: {
                  var3 = var1.h(1);
                  if (!((String) (var3)).equals("")) {
                    break L10;
                  } else {
                    var3 = null;
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1.h(1);
                  var5 = var1.h(1);
                  var6 = wi.a(var4_ref_String, (byte) 122);
                  if (var6 == null) {
                    var6 = wi.a(var5, (byte) 114);
                    if (null != var6) {
                      pi.field_a.a(var6, 1, (long)ui.a(param0 ^ 3, (CharSequence) ((Object) var4_ref_String)).hashCode());
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null != var6) {
                    break L12;
                  } else {
                    var6 = new ah();
                    pi.field_a.a(var6, 1, (long)ui.a(1, (CharSequence) ((Object) var4_ref_String)).hashCode());
                    fieldTemp$1 = vd.field_h;
                    vd.field_h = vd.field_h + 1;
                    var6.field_bc = fieldTemp$1;
                    ea.field_c.a(param0 ^ 1, var6);
                    break L12;
                  }
                }
                L13: {
                  if (var3 != null) {
                    var3 = ((String) (var3)).intern();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var6.field_dc = var4_ref_String;
                var6.field_ac = (String) (var3);
                var6.field_Vb = var5;
                var6.b(param0 ^ 6);
                var7_ref = (ah) ((Object) ea.field_c.e(13058));
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        if (null == var7_ref) {
                          break L17;
                        } else {
                          stackIn_65_0 = (ah) (var7_ref);

                          stackIn_65_1 = 22635;

                          stackIn_65_2 = (ah) (var6);

                          if (var9 != 0) {
                            break L16;
                          } else {
                            if (!dm.a(stackIn_65_0, stackIn_65_1, stackIn_65_2)) {
                              break L17;
                            } else {
                              var7_ref = (ah) ((Object) ea.field_c.a((byte) -17));
                              if (var9 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (null != var7_ref) {
                          break L18;
                        } else {
                          ea.field_c.a(3, var6);
                          if (var9 == 0) {
                            break L15;
                          } else {
                            break L18;
                          }
                        }
                      }
                      stackIn_65_0 = (ah) (var7_ref);
                      stackIn_65_1 = 30;
                      stackIn_65_2 = (ah) (var6);
                      break L16;
                    }
                    ie.a(stackIn_65_0, stackIn_65_1, stackIn_65_2);
                    break L15;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (-3 == (var2 ^ -1)) {
                  L19: {
                    if ((qc.field_P ^ -1) != -2) {
                      break L19;
                    } else {
                      qc.field_P = 2;
                      break L19;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var2) {
                    L20: {
                      if ((qc.field_P ^ -1) == -3) {
                        qc.field_P = 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 == var2) {
                      qc.field_P = 1;
                      var3 = var1.h(1);
                      nn.field_f = ((String) (var3)).intern();
                      var4 = var1.f((byte) -90);
                      in.a((byte) 46, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      sj.a("F1: " + ci.a((byte) 94), param0 ^ -93, (Throwable) null);
                      pm.m(75);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "te.B(" + param0 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_c = (String[][]) null;
        if (param0 >= -22) {
            return;
        }
        try {
            field_a = (int[][]) null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ')');
        }
    }

    static {
        field_d = "Your request to join has been declined.";
        field_c = new String[][]{new String[]{"Tactical", "Action"}, new String[]{"Basic", "Standard", "Advanced", "High", "Expert"}, new String[]{"Zone", "Lost", "City", "Moon", "Fleet", "Co-op"}};
        field_a = new int[][]{null, null, new int[]{0, 0, 0, 0, 10, 0}};
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
