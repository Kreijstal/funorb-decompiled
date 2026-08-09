/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ZombieDawnMulti extends aq {
    static String field_M;
    static String[] field_K;
    private StringBuffer field_G;
    static ja[][] field_L;
    static int field_H;
    private StringBuffer field_J;
    static String field_F;
    static ja[] field_I;
    public static boolean field_E;

    final void g(int param0) {
        Object stackIn_5_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        int[][] var3 = null;
        Runtime var3_ref = null;
        nc var4_ref_nc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == rn.field_f) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = rn.field_f;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = dk.field_Ib;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = stackIn_5_0;
                        if (he.field_a) {
                            statePc = 23;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!vk.l((byte) -127)) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null != rn.field_f) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_15_0 = ro.field_L ? 1 : 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        tn.a(stackIn_15_0 != 0, param0 ^ -30144, (java.awt.Canvas) (var2));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        if (uk.field_O) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ra.a((java.awt.Canvas) (var2), -93);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        if (null == ke.field_g) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qm.a(100.0f, param0 ^ -30089, pd.field_a);
                        ra.a((java.awt.Canvas) (var2), -92);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        if (uk.field_O) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        if (pl.field_I == sp.field_g) {
                            statePc = 47;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 >= (sp.field_g ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_32_0 = pl.field_I;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = sp.field_g;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3_int = stackIn_32_0;
                        if (var3_int >= 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_int = 11;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4_ref_nc = gk.a(2, var3_int);
                        if (gk.field_b < 16) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        tg.a((byte) -77, false, sp.field_g);
                        if (var4_ref_nc != null) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4_ref_nc.a(-128, 512 - (gk.field_b << -624132028), true);
                        if (var7 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        tg.a((byte) -11, false, pl.field_I);
                        if (null == var4_ref_nc) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4_ref_nc.a(-109, gk.field_b << -1414828892, false);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var7 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        tg.a((byte) -16, true, pl.field_I);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param0 == -30169) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        field_L = (ja[][]) null;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!n.a((byte) -50)) {
                            statePc = 78;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        oo.f(0, 0, oo.field_b, oo.field_l);
                        sc.a(0);
                        var3 = iq.a(45);
                        var4 = 0;
                        var5 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var3.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (null == var3[var5]) {
                            statePc = 72;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((bd.field_g ^ -1) > (var3[var5][0] ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var3[var5][2] + var3[var5][0] ^ -1) > (bd.field_g ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((bo.field_d ^ -1) > (var3[var5][1] ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((bo.field_d ^ -1) < (var3[var5][0] + var3[var5][3] ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var4 = 1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var4 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        en.a(-1, 1);
                        if (var7 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        en.a(-1, 4);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (0 != er.field_i) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3_int = gk.field_b * 256 / 32;
                        if (0 < var3_int) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        oo.f(0, 0, oo.field_b, oo.field_l, 0, var3_int);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!cq.a(15000)) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (n.a((byte) -39)) {
                            statePc = 96;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackIn_94_0 = 1;
                        stackIn_90_0 = stackIn_94_0;
                        if (rn.field_f != null) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackIn_92_0 = stackIn_90_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackIn_95_0 = stackIn_92_0;
                        stackIn_95_1 = ro.field_L ? 1 : 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackIn_95_0 = stackIn_94_0;
                        stackIn_95_1 = 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        qp.a(stackIn_95_0 != 0, stackIn_95_1 != 0);
                        if (var7 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (!wb.k((byte) 113)) {
                            statePc = 105;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (!n.a((byte) -39)) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        oo.f(0, 0, oo.field_b, oo.field_l);
                        oe.a(oi.field_h[0].field_x, oi.field_h[0].field_w, oi.field_h, (byte) -21);
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (-3 < (kj.field_q ^ -1)) {
                            statePc = 130;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (bf.field_m) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (this.field_J == null) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_J = new StringBuffer("Mem: 000000KiB");
                        this.field_G = new StringBuffer("FPS: 00");
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (0 != wf.field_m % 50) {
                            statePc = 128;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var3_ref = Runtime.getRuntime();
                        var4 = (int)(var3_ref.totalMemory() + -var3_ref.freeMemory()) >> 1371402858;
                        var5 = ji.field_b;
                        var6 = 10;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (4 >= var6) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.field_J.setCharAt(var6, (char)(var4 % 10 + 48));
                        var4 = var4 / 10;
                        var6--;
                        if (var7 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var7 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var6 = 6;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (-5 <= (var6 ^ -1)) {
                            statePc = 128;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        this.field_G.setCharAt(var6, (char)(48 + var5 % 10));
                        var5 = var5 / 10;
                        var6--;
                        if (var7 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var7 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        qp.field_w.c(this.field_J.toString(), 5, 20, 16777215, 1);
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        qp.field_w.c(this.field_G.toString(), 5, 35, 16777215, 1);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        t.a(false, 0, (java.awt.Canvas) (var2), 0);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2_ref), "ZombieDawnMulti.IA(" + param0 + ')');
                }
                case 133: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        gd var2 = null;
        try {
            this.a(0, false, 9, 13, 1, 72, 10, (byte) -99);
            o.field_j = true;
            wf.field_m = 5000 * (int)Math.random();
            ll.field_k = new rp();
            df.field_H = true;
            var2 = new gd();
            var2.f(128, 15, 9);
            db.a(pl.field_J, 22050, (java.awt.Component) ((Object) dk.field_Ib), var2, 1024, true);
            this.a(true, (byte) -27, false, true, true, false, true);
            sq.field_U[64] = 1;
            sq.field_U[79] = 14;
            sq.field_U[10] = -1;
            sq.field_U[9] = -1;
            sq.field_U[76] = 5;
            sq.field_U[66] = 1;
            sq.field_U[61] = 25;
            sq.field_U[65] = 1;
            sq.field_U[62] = -1;
            sq.field_U[77] = -1;
            sq.field_U[57] = -2;
            sq.field_U[81] = 25;
            sq.field_U[70] = 2;
            sq.field_U[71] = -1;
            sq.field_U[74] = 10;
            sq.field_U[param0] = 17;
            sq.field_U[80] = 11;
            sq.field_U[82] = 4;
            sq.field_U[69] = -1;
            sq.field_U[58] = -2;
            sq.field_U[78] = 5;
            sq.field_U[72] = 6;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.JA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_98_0 = false;
        int stackIn_120_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_127_2 = 0;
        boolean stackIn_129_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (er.field_h != er.field_i) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    var4 = 0;
                    if (!param1) {
                      L4: {
                        if ((sp.field_g ^ -1) == (pl.field_I ^ -1)) {
                          break L4;
                        } else {
                          gk.field_b = gk.field_b + 1;
                          if ((gk.field_b ^ -1) == -33) {
                            bl.a(-9);
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if ((pl.field_I ^ -1) == 6) {
                          break L5;
                        } else {
                          L6: {
                            if ((pl.field_I ^ -1) == 1) {
                              break L6;
                            } else {
                              if (!lb.a((byte) 53, pl.field_I)) {
                                break L3;
                              } else {
                                gk.a(2, pl.field_I).a(0);
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          iq.field_f = true;
                          var3_int = 1;
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L7: {
                        if (cf.field_s == null) {
                          break L7;
                        } else {
                          this.s(-50);
                          break L7;
                        }
                      }
                      L8: {
                        if (!ji.field_c) {
                          break L8;
                        } else {
                          var4 = 1;
                          var3_int = 1;
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      np.field_m.a((byte) 121, true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L9: {
                    if (bh.field_d.c(61) == null) {
                      break L9;
                    } else {
                      fieldTemp$0 = er.field_k + 1;
                      er.field_k = er.field_k + 1;
                      if ((fieldTemp$0 ^ -1) > -336) {
                        break L9;
                      } else {
                        er.field_k = 0;
                        bh.field_d.g(49);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (!ji.field_c) {
                        break L11;
                      } else {
                        if (gh.field_g) {
                          break L11;
                        } else {
                          if (!vo.field_q) {
                            L12: {
                              if (!re.field_b) {
                                break L12;
                              } else {
                                if (!hh.field_b) {
                                  break L12;
                                } else {
                                  if (!sq.field_N) {
                                    break L12;
                                  } else {
                                    var3_int = 0;
                                    break L12;
                                  }
                                }
                              }
                            }
                            L13: {
                              if (!am.a(-116)) {
                                break L13;
                              } else {
                                var3_int = 1;
                                break L13;
                              }
                            }
                            L14: {
                              wc.a(15, var3_int != 0);
                              if (cp.field_K) {
                                af.field_e.a((byte) 125, var4 != 0);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if (hh.field_b) {
                                L16: {
                                  if (re.field_b) {
                                    ia.a(320, 180, var4 != 0, 0);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                np.field_m.a((byte) 119, var4 != 0);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L17: while (true) {
                              if (!ba.c(-1)) {
                                break L11;
                              } else {
                                L18: {
                                  if (!iq.field_f) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (!re.field_b) {
                                        break L19;
                                      } else {
                                        if (!hh.field_b) {
                                          break L19;
                                        } else {
                                          if (jm.a(13, -23936, 15, 12)) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    w.a(13, 15, 12, 18663);
                                    break L18;
                                  }
                                }
                                L20: {
                                  if (cp.field_K) {
                                    af.field_e.a(-59, sj.field_p);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                if (!hh.field_b) {
                                  continue L17;
                                } else {
                                  stackIn_98_0 = iq.field_f;

                                  if (var8 != 0) {
                                    break L10;
                                  } else {
                                    L21: {
                                      if (!stackIn_98_0) {
                                        break L21;
                                      } else {
                                        if (sq.field_N) {
                                          continue L17;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    np.field_m.a(-78, sj.field_p);
                                    if (var8 == 0) {
                                      continue L17;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackIn_98_0 = ji.field_c;
                    break L10;
                  }
                  L22: {
                    L23: {
                      if (stackIn_98_0) {
                        break L23;
                      } else {
                        L24: {
                          if (am.a(-98)) {
                            break L24;
                          } else {
                            oa.a(0);
                            L25: while (true) {
                              if (!ba.c(-1)) {
                                break L23;
                              } else {
                                if (!hh.field_b) {
                                  continue L25;
                                } else {
                                  stackIn_129_0 = iq.field_f;

                                  if (var8 != 0) {
                                    break L22;
                                  } else {
                                    L26: {
                                      if (!stackIn_129_0) {
                                        break L26;
                                      } else {
                                        if (!sq.field_N) {
                                          break L26;
                                        } else {
                                          continue L25;
                                        }
                                      }
                                    }
                                    np.field_m.a(119, sj.field_p);
                                    if (var8 == 0) {
                                      continue L25;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L27: {
                          L28: {
                            stackIn_120_0 = 1;

                            if (hh.field_b) {
                              break L28;
                            } else {


                              if (!cp.field_K) {
                                stackIn_123_0 = stackIn_120_0;
                                stackIn_123_1 = 0;
                                break L27;
                              } else {

                                break L28;
                              }
                            }
                          }
                          stackIn_123_0 = stackIn_120_0;
                          stackIn_123_1 = 1;
                          break L27;
                        }
                        L29: {




                          if (ib.field_a <= 50) {


                            stackIn_127_2 = 0;
                            break L29;
                          } else {


                            stackIn_127_2 = 1;
                            break L29;
                          }
                        }
                        df.a(stackIn_123_0 != 0, stackIn_123_1 != 0, stackIn_127_2 != 0, -92, 15, 0, false, 11, 13, t.field_d, 14, true);
                        break L23;
                      }
                    }
                    stackIn_129_0 = iq.field_f;
                    break L22;
                  }
                  L30: {
                    L31: {
                      if (stackIn_129_0) {
                        break L31;
                      } else {
                        if ((dg.field_M ^ -1) >= -1) {
                          break L30;
                        } else {
                          dg.field_M = dg.field_M - 1;
                          if (var8 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    if (b.field_d <= dg.field_M) {
                      break L30;
                    } else {
                      dg.field_M = dg.field_M + 1;
                      break L30;
                    }
                  }
                  var5 = b.field_d * b.field_d;
                  var6 = -(dg.field_M * dg.field_M) + var5;
                  var7 = var6 * 120 / var5 + kg.field_g;
                  sk.a(false, var7);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L32: {
                if ((un.field_k ^ -1) == (er.field_i ^ -1)) {
                  break L32;
                } else {
                  L33: {
                    if (cq.field_f == er.field_i) {
                      break L33;
                    } else {
                      ub.field_yb = ub.field_yb - 1;
                      if (-1 == (ub.field_yb ^ -1)) {
                        er.field_i = er.field_h;
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L33;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L34: {
                    if (!wc.j(124)) {
                      L35: {
                        mo.i(-109);
                        bm.a(true, 1, 127, 1);
                        if (!bd.field_f) {
                          break L35;
                        } else {
                          bd.field_f = false;
                          lp.a((byte) -59, false);
                          break L35;
                        }
                      }
                      if (lb.a((byte) 53, sp.field_g)) {
                        bl.a(-9);
                        break L34;
                      } else {
                        break L34;
                      }
                    } else {
                      break L34;
                    }
                  }
                  er.field_i = mn.field_m;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L32;
                  }
                }
              }
              ub.field_yb = ub.field_yb + 1;
              if (16 != ub.field_yb) {
                break L1;
              } else {
                L36: {
                  L37: {
                    if (bd.field_f) {
                      break L37;
                    } else {
                      jg.a(0);
                      if (var8 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  km.h(0);
                  break L36;
                }
                er.field_i = cq.field_f;
                break L1;
              }
            }
            L38: {
              if (sp.field_g != -4) {
                break L38;
              } else {
                ma.field_a.b((byte) -35, 9);
                gh.field_g = true;
                sp.field_g = pl.field_I;
                dg.field_M = b.field_d;
                break L38;
              }
            }
            if (param0) {
              L39: {
                if (4 == (sp.field_g ^ -1)) {
                  L40: {
                    if (mh.field_c == null) {
                      break L40;
                    } else {
                      ml.a(mh.field_c.i(6), 11, -76);
                      vo.field_q = true;
                      sp.field_g = pl.field_I;
                      if (var8 == 0) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  var3_int = vd.field_d;
                  bm.a(false, var3_int, 127, sp.field_g);
                  break L39;
                } else {
                  break L39;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ZombieDawnMulti.BA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        boolean discarded$0 = false;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        boolean stackIn_126_0 = false;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        boolean stackIn_247_0 = false;
        int stackIn_334_0 = 0;
        int stackIn_334_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        String[] var2 = null;
        int[] var2_array = null;
        so var2_ref = null;
        ae var2_ref2 = null;
        sj var2_ref3 = null;
        wf var2_ref4 = null;
        RuntimeException var2_ref5 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        nc var3_ref_nc = null;
        int var4 = 0;
        ga var4_ref_ga = null;
        int[] var4_ref_int__ = null;
        int var5 = 0;
        fc var6 = null;
        kb var7 = null;
        hk var8 = null;
        int var9_int = 0;
        qd var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    ib.field_a = b.a(true);
                    if (!uk.field_O) {
                        statePc = 20;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!vk.l((byte) -122)) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!o.field_i) {
                        statePc = 10;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 10: {
                    o.field_i = true;
                    if (var10 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (tk.field_q != dk.field_Ib) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (o.field_i) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    o.field_i = false;
                    tk.field_q = dk.field_Ib;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (param0 < -3) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    id.d((byte) 20);
                    if (null == rn.field_f) {
                        statePc = 28;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (!rn.field_f.field_e) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    rn.a(-110);
                    vn.a(-29507);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_31_0 = this;
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = 95;
                    stackIn_29_1 = stackIn_31_1;
                    if (rn.field_f == null) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = this;
                    stackIn_32_1 = stackIn_29_1;
                    stackIn_32_2 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = this;
                    stackIn_32_1 = stackIn_31_1;
                    stackIn_32_2 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    this.b((byte) stackIn_32_1, stackIn_32_2 != 0);
                    if (kn.field_f) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.u(-126);
                    kn.field_f = false;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    wf.field_m = wf.field_m + 1;
                    if (vk.l((byte) -123)) {
                        statePc = 39;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.p(50);
                    if (!vk.l((byte) -126)) {
                        statePc = 47;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (ge.p(-88)) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    discarded$0 = this.c(false, 123);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    return;
                }
                case 47: {
                    if (uk.field_O) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ud.a(t.field_d, 1000);
                    if (!this.c(true, 121)) {
                        statePc = 125;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    uk.field_O = true;
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (n.c((byte) 107)) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.r(-123);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (n.a((byte) -68)) {
                        statePc = 103;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (!cq.a(15000)) {
                        statePc = 86;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_71_0 = this;
                    stackIn_67_0 = stackIn_71_0;
                    if (null == rn.field_f) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_69_0 = this;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = this;
                    stackIn_72_1 = 1;
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = this;
                    stackIn_72_1 = 0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var2_int = this.a(stackIn_72_1 != 0, -124);
                    if (var2_int == 1) {
                        statePc = 78;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (2 == var2_int) {
                        statePc = 78;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (null == rn.field_f) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    rn.a(-96);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var2_int == 2) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    cq.a((java.applet.Applet) (this), false);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    this.a(true, true);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (!wb.k((byte) 115)) {
                        statePc = 100;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((er.field_i ^ -1) == (er.field_h ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.a(true, false);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var2_int = wg.c((byte) -85);
                    if (var2_int == 1) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    rj.a(b.field_b, (byte) -72, mb.field_g);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    this.a(true, true);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.a(true, false);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (er.field_i != er.field_h) {
                        statePc = 123;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var2_int = u.a((byte) -58);
                    if (2 != var2_int) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    rn.a(-92);
                    if (var10 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (-4 != (var2_int ^ -1)) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    bd.field_f = false;
                    lp.a((byte) -90, true);
                    if (var10 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var2_int == 4) {
                        statePc = 121;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 121: {
                    bd.field_f = true;
                    rj.a(1, (byte) 124, ej.field_o);
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    this.a(true, true);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.a(true, false);
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = dd.a(sq.field_U, (byte) -126);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (!stackIn_126_0) {
                        statePc = 333;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackIn_334_0 = 9;
                    stackIn_128_0 = stackIn_334_0;
                    stackIn_334_1 = op.field_i;
                    stackIn_128_1 = stackIn_334_1;
                    if (var10 != 0) {
                        statePc = 334;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 == stackIn_128_1) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    bl.a(-9);
                    sp.field_g = 13;
                    gh.field_g = false;
                    vh.field_Fb = s.field_e.f((byte) -48);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (-15 != (op.field_i ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    bl.a(-9);
                    hl.a(eg.field_E, (byte) 75, k.f(23000), 150, pk.b(-11834), cb.field_j.length, cb.b(-122, 4), en.a((byte) -110), cb.b(-123, 500), 1024);
                    tg.field_a[0] = (byte) 16;
                    ma.a(aq.k(-55), rn.b(28579), true);
                    gh.field_g = false;
                    sp.field_g = -2;
                    ji.field_c = true;
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if ((op.field_i ^ -1) == -16) {
                        statePc = 140;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (!ji.field_c) {
                        statePc = 146;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    bl.a(-9);
                    ld.j(1481707568);
                    w.c(0);
                    hh.field_b = false;
                    ji.field_c = false;
                    cp.field_K = false;
                    bi.field_e = true;
                    sp.field_g = 1;
                    ch.field_k = true;
                    if (!re.field_b) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    gk.a((byte) 16);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    vo.field_q = false;
                    gh.field_g = false;
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if ((op.field_i ^ -1) != -11) {
                        statePc = 154;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (ji.field_c) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    ck.a(-2061);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (op.field_i == 57) {
                        statePc = 160;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (58 == op.field_i) {
                        statePc = 160;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 160: {
                    bl.a(-9);
                    s.field_e.g(31365);
                    var2 = new String[s.field_e.g(31365)];
                    var3 = -2;
                    var3 = s.field_e.g(31365);
                    var4 = 0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (var4 >= var2.length) {
                        statePc = 166;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var2[var4] = s.field_e.c(0);
                    var4++;
                    if (var10 != 0) {
                        statePc = 169;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var10 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if ((var3 ^ -1) > -255) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var3 = -2;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var4 = s.field_e.g(31365);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var5 = 0;
                    if ((var2.length ^ -1) < -3) {
                        statePc = 174;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (var2.length <= 1) {
                        statePc = 175;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var5 = 1;
                    if (var10 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var5 = 2;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if ((var5 ^ -1) == -1) {
                        statePc = 178;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var4 = 0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var6 = wh.a(bn.field_d.a((byte) -85, var4), -86);
                    var7 = new kb(var2, var6);
                    var8 = new hk();
                    var7.a(2, s.field_e);
                    var7.field_r = var4;
                    s.field_e.g(31365);
                    if (-58 != (op.field_i ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var9_int = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (-6 >= (var9_int ^ -1)) {
                        statePc = 186;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    dupTemp$1 = s.field_e.g(31365);
                    ll.field_k.field_m[var9_int] = dupTemp$1;
                    var8.field_d[var9_int] = dupTemp$1;
                    var9_int++;
                    if (var10 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var10 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var9_int = 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (var9_int >= 5) {
                        statePc = 194;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    dupTemp$2 = s.field_e.g(31365);
                    ll.field_k.field_g[var9_int] = dupTemp$2;
                    var8.field_f[var9_int] = dupTemp$2;
                    var9_int++;
                    if (var10 != 0) {
                        statePc = 195;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var10 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var9_int = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (-4 >= (var9_int ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    dupTemp$3 = s.field_e.g(31365);
                    ll.field_k.field_s[var9_int] = dupTemp$3;
                    var8.field_c[var9_int] = dupTemp$3;
                    var9_int++;
                    if (var10 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var10 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var8.a(7054, s.field_e);
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var9 = new qd(var7, var8, var3);
                    if (57 == op.field_i) {
                        statePc = 207;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    af.field_e = var9;
                    cp.field_K = true;
                    wp.field_h = var9;
                    if (var10 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    hh.field_b = true;
                    wp.field_h = var9;
                    np.field_m = var9;
                    wg.b((byte) 68);
                    re.field_b = true;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    sp.field_g = -7;
                    vo.field_q = false;
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if ((op.field_i ^ -1) == -60) {
                        statePc = 213;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (hh.field_b) {
                        statePc = 219;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (cp.field_K) {
                        statePc = 219;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (-2 != (op.field_m.field_t ^ -1)) {
                        statePc = 223;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    bl.a(-9);
                    if (hh.field_b) {
                        statePc = 226;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 226: {
                    np.field_m.a(false, 24295, false);
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    id.field_D = 0;
                    bi.field_e = true;
                    hh.field_b = false;
                    cp.field_K = false;
                    sp.field_g = -2;
                    if (!re.field_b) {
                        statePc = 230;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    gk.a((byte) 16);
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    qd.field_bb = false;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    vo.field_q = false;
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (71 != op.field_i) {
                        statePc = 252;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var2_array = da.a(8);
                    var3_ref_int__ = var2_array;
                    var4_ref_ga = s.field_e;
                    var5 = 0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (var5 >= 8) {
                        statePc = 239;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var3_ref_int__[var5] = ((k) ((Object) var4_ref_ga)).i(-1478490344);
                    var5++;
                    if (var10 != 0) {
                        statePc = 240;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (var10 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var3_ref_int__ = var2_array;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    var4_ref_int__ = k.field_n;
                    var5 = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (var5 >= 8) {
                        statePc = 244;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var3_ref_int__[var5] = tq.b(var3_ref_int__[var5], var4_ref_int__[var5] ^ -1);
                    var5++;
                    if (var10 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (var10 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var3 = 0;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (256 <= var3) {
                        statePc = 251;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    stackIn_126_0 = fq.a(var3, 127, var2_array);
                    stackIn_247_0 = stackIn_126_0;
                    if (var10 != 0) {
                        statePc = 126;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (stackIn_247_0) {
                        statePc = 249;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 249: {
                    bh.field_d.a(new er(var3), false);
                    var4_ref_int__ = fc.field_m;
                    var5 = var3;
                    var4_ref_int__[var5 >> 2867749] = cr.b(var4_ref_int__[var5 >> 2867749], 1 << tq.b(31, var5));
                    var4_ref_int__ = k.field_n;
                    var5 = var3;
                    var4_ref_int__[var5 >> -2092973051] = cr.b(var4_ref_int__[var5 >> -2092973051], 1 << tq.b(31, var5));
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var3++;
                    if (var10 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (-62 != (op.field_i ^ -1)) {
                        statePc = 259;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (wp.field_h != null) {
                        statePc = 259;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    bd.a("got MOVE without a game", (Throwable) null, false);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (wp.field_h != null) {
                        statePc = 262;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (70 != op.field_i) {
                        statePc = 266;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    wp.field_h.field_W = s.field_e.c((byte) -18);
                    wp.field_h.field_t = bl.a((byte) 107);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (62 == op.field_i) {
                        statePc = 269;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var2_int = s.field_e.g(31365);
                    var3_ref_int__ = new int[op.field_m.field_t];
                    var4 = 0;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (op.field_m.field_t <= var4) {
                        statePc = 275;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var3_ref_int__[var4] = s.field_e.d((byte) 69);
                    op.field_m.field_v[var4] = s.field_e.d((byte) 69);
                    op.field_m.field_o[var4] = s.field_e.d((byte) 69);
                    var4++;
                    if (var10 != 0) {
                        statePc = 276;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (var10 == 0) {
                        statePc = 270;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var4 = s.field_e.d((byte) 69);
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (!re.field_b) {
                        statePc = 279;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    gk.a((byte) 16);
                    re.field_b = false;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    wp.field_h.a(var2_int, var4, (byte) 121, var3_ref_int__);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (61 != op.field_i) {
                        statePc = 282;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var2_ref = kn.a((byte) 127, s.field_e);
                    wp.field_h.a(false, var2_ref);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (-73 != (op.field_i ^ -1)) {
                        statePc = 284;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var2_ref2 = nq.a(22272, s.field_e);
                    wp.field_h.a(false, var2_ref2);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (-74 == (op.field_i ^ -1)) {
                        statePc = 287;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var2_ref3 = dm.a((byte) 74, s.field_e);
                    wp.field_h.a(false, var2_ref3);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (op.field_i != 79) {
                        statePc = 292;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    wp.field_h.a(false, nk.a(20399, s.field_e));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if ((op.field_i ^ -1) == -82) {
                        statePc = 295;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 295: {
                    wp.field_h.a(false, li.a((byte) -119, s.field_e));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (op.field_i != 78) {
                        statePc = 300;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    wp.field_h.a(false, oa.a(s.field_e, 14));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if ((op.field_i ^ -1) != -75) {
                        statePc = 304;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    wp.field_h.a(false, qm.a(s.field_e, true));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if ((op.field_i ^ -1) != -78) {
                        statePc = 308;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    wp.field_h.a(false, qk.a(s.field_e, (byte) -114));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if ((op.field_i ^ -1) != -77) {
                        statePc = 312;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    wp.field_h.a(false, gn.a(-1, s.field_e));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (op.field_i != 80) {
                        statePc = 315;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var2_ref4 = wq.a(s.field_e, -128);
                    if (var2_ref4.field_q == 255) {
                        statePc = 125;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    wp.field_h.a(false, var2_ref4);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (82 == op.field_i) {
                        statePc = 318;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 318: {
                    wp.field_h.a(false, hc.a(0, s.field_e));
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (65 != op.field_i) {
                        statePc = 324;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    op.field_m.field_j = s.field_e.g(31365);
                    if (null == np.field_m) {
                        statePc = 125;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    ab.field_h.f(125);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if ((op.field_i ^ -1) == -65) {
                        statePc = 327;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 327: {
                    var2_int = s.field_e.g(31365);
                    System.out.println(" players resigned: " + Integer.toBinaryString(var2_int));
                    op.field_m.field_F = var2_int;
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (-67 == (op.field_i ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 331: {
                    s.field_e.g(31365);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    this.j(-13);
                    if (var10 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    stackIn_334_0 = 0;
                    stackIn_334_1 = 0;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    cb.a(stackIn_334_0, stackIn_334_1 != 0);
                    if (iq.field_f) {
                        statePc = 337;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 337: {
                    id.field_D = 0;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (!gh.a(80)) {
                        statePc = 387;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    var2_int = this.m(10);
                    if ((var2_int ^ -1) == -1) {
                        statePc = 343;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (var2_int != 1) {
                        statePc = 368;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    of.b((byte) 119);
                    if (var2_int != 1) {
                        statePc = 349;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    vo.field_q = true;
                    gh.field_g = true;
                    if (var10 == 0) {
                        statePc = 368;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (!ji.field_c) {
                        statePc = 367;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    ch.field_k = true;
                    bi.field_e = true;
                    if (!hh.field_b) {
                        statePc = 358;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    vh.field_Fb = qd.field_V;
                    bm.a(false, 13, 127, 1);
                    if (var10 == 0) {
                        statePc = 360;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    bm.a(false, 1, 125, 1);
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    bl.a(-9);
                    var3_ref_nc = gk.a(2, pl.field_I);
                    if (var3_ref_nc != null) {
                        statePc = 363;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var3_ref_nc.a(0, false, 0);
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    cp.field_K = false;
                    hh.field_b = false;
                    ji.field_c = false;
                    if (!re.field_b) {
                        statePc = 367;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    gk.a((byte) 16);
                    re.field_b = false;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    gh.field_g = false;
                    vo.field_q = false;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    var3 = 0;
                    if (-3 == (var2_int ^ -1)) {
                        statePc = 371;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 371: {
                    var3 = 1;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    if (ji.field_c) {
                        statePc = 379;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if (gh.field_g) {
                        statePc = 379;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (!vo.field_q) {
                        statePc = 380;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var3 = 1;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    if (gh.a(83)) {
                        statePc = 382;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    var3 = 0;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (var3 == 0) {
                        statePc = 387;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    ib.a(-101);
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void t(int param0) {
        try {
            field_F = null;
            field_L = (ja[][]) null;
            int var1_int = 127 % ((param0 - -76) / 45);
            field_I = null;
            field_K = null;
            field_M = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.EA(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (qc.field_s != null) {
                h.a(qc.field_s, -65);
                so.d(-6445);
                qc.field_s = null;
                o.d(26673);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ii.field_a = u.a(5, 2);
              if (param0 <= -117) {
                break L2;
              } else {
                ZombieDawnMulti.a(-2, (byte) -9, (ul) null, (ul) null, -109);
                break L2;
              }
            }
            cg.field_n = u.a(5, 3);
            ki.field_m = u.a(5, 8);
            pf.field_b = u.a(5, 4);
            rn.field_e = u.a(5, 5);
            de.field_e = u.a(5, 6);
            df.field_M = u.a(5, 7);
            ha.field_g = u.a(5, 11);
            il.field_n = u.a(5, 12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.LA(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException runtimeException = null;
        ae var2 = null;
        ae var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cf.field_s.b(-198);
                        if (bi.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        op.field_m.field_H = param0 + cf.field_s.field_m.field_H;
                        var2 = (ae) ((Object) cf.field_s.field_q.c(71));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 == null) {
                            statePc = 12;
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
                        var3 = (ae) ((Object) cf.field_s.field_q.b(6));
                        var2.a((byte) -123);
                        var2.field_f = var2.field_f + 50;
                        wp.field_h.a(false, var2);
                        var2 = var3;
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.GA(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ca a(int param0, byte param1, ul param2, ul param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ca stackIn_5_0 = null;
        ca stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param0, param3, param4, (byte) -42)) {
              if (param1 == -19) {
                stackIn_7_0 = hc.a(true, param2.a(param0, true, param4));
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ca) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ZombieDawnMulti.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final boolean c(boolean param0, int param1) {
        int var3_int = 0;
        ri[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ri var5 = null;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        ja[] stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        ja[] stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        int stackIn_158_2 = 0;
        ja[] stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        ja[] stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        double stackIn_161_3 = 0.0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_183_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        ja[][] var3_array = null;
        ja[][] var4_ref_ja____ = null;
        String[][] var5_array = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    so.d(-6445);
                    if (pf.field_b != null) {
                        statePc = 4;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!al.field_eb.a((byte) -110)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (al.field_eb.a(false, "basic")) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    qm.a(3.0f, 80, ki.a(bc.field_a, "basic", al.field_eb, (byte) 76, ei.field_e));
                    stackIn_9_0 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    if (!al.field_eb.a((byte) -124)) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!al.field_eb.a(false, "lobby")) {
                        statePc = 16;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 16: {
                    qm.a(3.0f, 80, ki.a(bc.field_a, "basic", al.field_eb, (byte) 76, ei.field_e));
                    stackIn_17_0 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    if (!he.field_f.a((byte) -108)) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (he.field_f.a(false, "lobby")) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    qm.a(17.0f, 80, ki.a(sm.field_b, "lobby", he.field_f, (byte) 76, bc.field_b));
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    if (!al.field_eb.a((byte) -120)) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (al.field_eb.a(false, "arialish12")) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    qm.a(4.0f, 80, ki.a(bc.field_a, "arialish12", al.field_eb, (byte) 76, ei.field_e));
                    stackIn_29_0 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    if (!he.field_f.a((byte) -128)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (he.field_f.a(false, "arialish12")) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    qm.a(5.0f, 80, ki.a(bc.field_a, "arialish12", he.field_f, (byte) 76, ei.field_e));
                    stackIn_35_0 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    return stackIn_35_0 != 0;
                }
                case 36: {
                    if (!pf.field_b.a((byte) -116)) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (!pf.field_b.a(0)) {
                        statePc = 42;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 42: {
                    qm.a(10.0f, 80, ki.a(ko.field_i, "", pf.field_b, (byte) 76, hg.field_tb));
                    stackIn_43_0 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    return stackIn_43_0 != 0;
                }
                case 44: {
                    if (!ki.field_m.a((byte) -122)) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!ki.field_m.a(0)) {
                        statePc = 50;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 50: {
                    qm.a(15.0f, 80, ki.a(sf.field_f, "", ki.field_m, (byte) 76, vf.field_c));
                    stackIn_51_0 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return stackIn_51_0 != 0;
                }
                case 52: {
                    if (!rn.field_e.a((byte) -114)) {
                        statePc = 58;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (!rn.field_e.a(0)) {
                        statePc = 58;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 58: {
                    qm.a(20.0f, 80, ki.a(ko.field_i, "", rn.field_e, (byte) 76, hg.field_tb));
                    stackIn_59_0 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    return stackIn_59_0 != 0;
                }
                case 60: {
                    if (!de.field_e.a((byte) -118)) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (de.field_e.a(0)) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    qm.a(30.0f, 80, mo.a(bk.field_k, 0, -3, bb.field_o, de.field_e));
                    stackIn_65_0 = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    return stackIn_65_0 != 0;
                }
                case 66: {
                    if (!df.field_M.a((byte) -126)) {
                        statePc = 70;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (df.field_M.a(0)) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    qm.a(40.0f, 80, ki.a(m.field_A, "", df.field_M, (byte) 76, i.field_d));
                    stackIn_71_0 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    return stackIn_71_0 != 0;
                }
                case 72: {
                    if (!ii.field_a.a((byte) -115)) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (ii.field_a.a(0)) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    qm.a(50.0f, 80, ki.a(bc.field_a, "", ii.field_a, (byte) 76, ei.field_e));
                    stackIn_77_0 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    return stackIn_77_0 != 0;
                }
                case 78: {
                    if (!cg.field_n.a((byte) -124)) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (!cg.field_n.a(0)) {
                        statePc = 84;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 84: {
                    qm.a(60.0f, 80, ki.a(sm.field_b, "", cg.field_n, (byte) 76, bc.field_b));
                    stackIn_85_0 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    return stackIn_85_0 != 0;
                }
                case 86: {
                    if (!ha.field_g.a((byte) -111)) {
                        statePc = 92;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (!ha.field_g.a(0)) {
                        statePc = 92;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 92: {
                    qm.a(75.0f, 80, ki.a(pd.field_a, "", ha.field_g, (byte) 76, s.field_h));
                    stackIn_93_0 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    return stackIn_93_0 != 0;
                }
                case 94: {
                    if (!il.field_n.a((byte) -121)) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (!il.field_n.a(0)) {
                        statePc = 100;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 100: {
                    qm.a(80.0f, 80, jj.a(s.field_h, (byte) 113, il.field_n, pd.field_a));
                    stackIn_101_0 = 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    return stackIn_101_0 != 0;
                }
                case 102: {
                    qm.a(65.0f, 80, dn.field_b);
                    if (param0) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    return stackIn_104_0 != 0;
                }
                case 105: {
                    ub.m(-121);
                    this.g(-30169);
                    gd.field_Q = new me(pf.field_b, rn.field_e);
                    ei.field_a[68] = jc.a(pf.field_b, "", "zombie_dawn_menu_button").a();
                    ei.field_a[69] = jc.a(pf.field_b, "", "zombie_dawn_menu_screen_mouseover").a();
                    ei.field_a[0] = jc.a(pf.field_b, "", "zombie_detonate").a();
                    ei.field_a[44] = jc.a(pf.field_b, "", "zombie_dawn_gunfire").a();
                    ei.field_a[45] = jc.a(pf.field_b, "", "zombie_dawn_shotgun_fire").a();
                    ei.field_a[8] = jc.a(pf.field_b, "", "zombie_dawn_machinegun_fire").a();
                    ei.field_a[20] = jc.a(pf.field_b, "", "zombie_dawn_click_mouse").a();
                    ei.field_a[30] = jc.a(pf.field_b, "", "zombie_dawn_thump_1").a();
                    ei.field_a[31] = jc.a(pf.field_b, "", "zombie_dawn_thump_2").a();
                    ei.field_a[32] = jc.a(pf.field_b, "", "zombie_dawn_swipe_1").a();
                    ei.field_a[33] = jc.a(pf.field_b, "", "zombie_dawn_swipe_2").a();
                    ei.field_a[34] = jc.a(pf.field_b, "", "zombie_dawn_slap_1").a();
                    ei.field_a[47] = jc.a(pf.field_b, "", "zombie_dawn_second_tick").a();
                    ei.field_a[53] = jc.a(pf.field_b, "", "zombie_dawn_reactor_ambience").a();
                    ei.field_a[54] = jc.a(pf.field_b, "", "zombie_dawn_score_10").a();
                    ei.field_a[55] = jc.a(pf.field_b, "", "zombie_dawn_score_20").a();
                    ei.field_a[56] = jc.a(pf.field_b, "", "zombie_dawn_score_30").a();
                    ei.field_a[57] = jc.a(pf.field_b, "", "zombie_dawn_countup_victims").a();
                    ei.field_a[58] = jc.a(pf.field_b, "", "zombie_dawn_countup_score").a();
                    ei.field_a[59] = jc.a(pf.field_b, "", "zombie_dawn_click_mouse_wrong").a();
                    ei.field_a[63] = jc.a(pf.field_b, "", "zombie_dawn_gun_empty").a();
                    ei.field_a[12] = jc.a(pf.field_b, "", "zombie_dawn_squelch_3").a();
                    ei.field_a[66] = jc.a(pf.field_b, "", "zombie_dawn_squelch_2_AND_3").a();
                    ei.field_a[64] = jc.a(pf.field_b, "", "zombie_dawn_smash_wood_and_glass_1").a();
                    ei.field_a[65] = jc.a(pf.field_b, "", "zombie_dawn_smash_wood_and_glass_2").a();
                    ei.field_a[67] = jc.a(pf.field_b, "", "zombie_dawn_use_powerup").a();
                    ei.field_a[36] = jc.a(pf.field_b, "", "zombie_dawn_bounce").a();
                    ei.field_a[35] = jc.a(pf.field_b, "", "zd_multi_hammer").a();
                    ei.field_a[81] = jc.a(pf.field_b, "", "zd_multi_barrier").a();
                    ei.field_a[82] = jc.a(pf.field_b, "", "zd_multi_bonefall").a();
                    ei.field_a[83] = jc.a(pf.field_b, "", "zd_multi_breach").a();
                    ei.field_a[84] = jc.a(pf.field_b, "", "zd_multi_charm").a();
                    ei.field_a[85] = jc.a(pf.field_b, "", "zd_multi_fireball").a();
                    ei.field_a[86] = jc.a(pf.field_b, "", "zd_multi_haze").a();
                    ei.field_a[87] = jc.a(pf.field_b, "", "zd_multi_place_ability").a();
                    ei.field_a[88] = jc.a(pf.field_b, "", "zd_multi_portal_ambience").a();
                    ei.field_a[89] = jc.a(pf.field_b, "", "zd_multi_quake").a();
                    ei.field_a[90] = jc.a(pf.field_b, "", "zd_multi_select_ability").a();
                    ei.field_a[91] = jc.a(pf.field_b, "", "zd_multi_select_tree").a();
                    pf.field_b = null;
                    o.d(26673);
                    stackIn_106_0 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    return stackIn_106_0 != 0;
                }
                case 107: {
                    if (rn.field_e == null) {
                        statePc = 110;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    qm.a(70.0f, 80, dn.field_b);
                    this.g(-30169);
                    ei.field_a[37] = ac.a(rn.field_e, "", "zombie_dawn_human_female_ow").c();
                    ei.field_a[38] = ac.a(rn.field_e, "", "zombie_dawn_human_female_eek").c();
                    ei.field_a[39] = ac.a(rn.field_e, "", "zombie_dawn_human_female_oof").c();
                    ei.field_a[40] = ac.a(rn.field_e, "", "zombie_dawn_human_male_oof").c();
                    ei.field_a[41] = ac.a(rn.field_e, "", "zombie_dawn_human_male_argh").c();
                    ei.field_a[42] = ac.a(rn.field_e, "", "zombie_dawn_human_male_urgh").c();
                    ei.field_a[43] = ac.a(rn.field_e, "", "zombie_dawn_human_male_uuh").c();
                    ei.field_a[46] = ac.a(rn.field_e, "", "zombie_dawn_use_powerup").c();
                    ei.field_a[48] = ac.a(rn.field_e, "", "zombie_dawn_cinema_ambience").c();
                    ei.field_a[26] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_1").c();
                    ei.field_a[27] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_2").c();
                    ei.field_a[28] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_4").c();
                    ei.field_a[29] = ei.field_a[28];
                    ei.field_a[49] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_1").c();
                    ei.field_a[50] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_2").c();
                    ei.field_a[51] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_3").c();
                    ei.field_a[52] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_3").c();
                    ei.field_a[9] = ac.a(rn.field_e, "", "zombie_dawn_collect_powerup").c();
                    ei.field_a[15] = ac.a(rn.field_e, "", "zombie_chase_human_male").c();
                    ei.field_a[25] = ac.a(rn.field_e, "", "zombie_chase_human_female").c();
                    ei.field_a[17] = ac.a(rn.field_e, "", "zombie_screech").c();
                    ei.field_a[70] = ac.a(rn.field_e, "", "zombie_groan_short_1").c();
                    ei.field_a[71] = ac.a(rn.field_e, "", "zombie_groan_short_2").c();
                    ei.field_a[72] = ac.a(rn.field_e, "", "zombie_groan_female_3").c();
                    ei.field_a[73] = ac.a(rn.field_e, "", "zombie_groan_female_4").c();
                    ei.field_a[93] = ac.a(rn.field_e, "", "zd_multi_bird_twitter").c();
                    ei.field_a[92] = ac.a(rn.field_e, "", "zd_multi_cloak_of_fear").c();
                    ei.field_a[75] = ac.a(rn.field_e, "", "zd_multi_counter").c();
                    ei.field_a[76] = ac.a(rn.field_e, "", "ZD_multi_human_into_portal_female").c();
                    ei.field_a[77] = ac.a(rn.field_e, "", "ZD_multi_human_into_portal_male").c();
                    ei.field_a[78] = ac.a(rn.field_e, "", "zd_multi_zombie_into_portal").c();
                    ei.field_a[79] = ac.a(rn.field_e, "", "zd_multi_into_portal_opponent").c();
                    ei.field_a[80] = ac.a(rn.field_e, "", "zd_multi_shackles").c();
                    rn.field_e = null;
                    o.d(26673);
                    stackIn_109_0 = 0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    return stackIn_109_0 != 0;
                }
                case 110: {
                    if (null != df.field_M) {
                        statePc = 113;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 113: {
                    qm.a(75.0f, 80, me.field_e);
                    this.g(-30169);
                    hl.field_d[0] = ug.a(df.field_M, "", "ZD_multi_TITLESCREEn");
                    hl.field_d[10] = ug.a(df.field_M, "", "ZD_multi_laboratory");
                    hl.field_d[12] = ug.a(df.field_M, "", "ZD_multi_PANIC_LOOP");
                    hl.field_d[11] = ug.a(df.field_M, "", "ZD_multi_GAME_FINISH");
                    hl.field_d[13] = ug.a(df.field_M, "", "ZD_multi_GAME_WIN");
                    hl.field_d[14] = ug.a(df.field_M, "", "ZD_multi_GAME_LOSE");
                    hl.field_d[1] = ug.a(df.field_M, "", "zombie dawn mall");
                    hl.field_d[2] = ug.a(df.field_M, "", "zombie dawn powerplant");
                    hl.field_d[3] = ug.a(df.field_M, "", "zombie dawn precinct");
                    hl.field_d[4] = ug.a(df.field_M, "", "zombie dawn white house");
                    hl.field_d[9] = ug.a(df.field_M, "", "zombie dawn instructions loop");
                    df.field_M = null;
                    o.d(26673);
                    stackIn_114_0 = 0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    return stackIn_114_0 != 0;
                }
                case 115: {
                    if (param1 > 75) {
                        statePc = 118;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_117_0 = 1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    return stackIn_117_0 != 0;
                }
                case 118: {
                    if (null != de.field_e) {
                        statePc = 121;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 121: {
                    qm.a(77.0f, 80, me.field_e);
                    this.g(-30169);
                    var3_int = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var3_int >= 15) {
                        statePc = 133;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (var6 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (hl.field_d[var3_int] == null) {
                        statePc = 132;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (wd.field_L.a(-10783, gd.field_Q, 176400, hl.field_d[var3_int], de.field_e)) {
                        statePc = 132;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    o.d(26673);
                    stackIn_131_0 = 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    return stackIn_131_0 != 0;
                }
                case 132: {
                    var3_int++;
                    if (var6 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    wd.field_L.d(125);
                    de.field_e = null;
                    gd.field_Q = null;
                    o.d(26673);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    return stackIn_135_0 != 0;
                }
                case 136: {
                    if (null == ki.field_m) {
                        statePc = 139;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    qm.a(80.0f, 80, bl.field_b);
                    this.g(-30169);
                    bn.field_d = ed.a(ki.field_m, -2852);
                    of.field_e[0] = new ja(ki.field_m.a("", "background1.jpg", false), (java.awt.Component) ((Object) dk.field_Ib));
                    jo.field_d = new ja(ki.field_m.a("", "panorama.jpg", false), (java.awt.Component) ((Object) dk.field_Ib));
                    ki.field_m = null;
                    o.d(26673);
                    stackIn_138_0 = 0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    return stackIn_138_0 != 0;
                }
                case 139: {
                    if (null == al.field_eb) {
                        statePc = 179;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (null == ii.field_a) {
                        statePc = 179;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    qm.a(85.0f, 80, bn.field_c);
                    this.g(-30169);
                    qp.field_w = pj.a(al.field_eb, 4, he.field_f, "", "arialish12");
                    if (!he.field_a) {
                        statePc = 148;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 148: {
                    da.a("locked", al.field_eb, (byte) 19, "basic");
                    wl.field_l = da.a("unachieved", al.field_eb, (byte) 19, "basic")[0];
                    of.field_k = fl.a("basic", "orbcoin", al.field_eb, 11091);
                    fj.a(100, of.field_k);
                    var3_array = new ja[2][];
                    var3_array[0] = pb.a("", ii.field_a, -256, "levelstyle_iconssmall");
                    var3_array[1] = null;
                    var4_ref_ja____ = new ja[1][];
                    var4_ref_ja____[0] = pb.a("", ii.field_a, -256, "levelstyle_iconslarge");
                    var5_array = tj.field_e;
                    ub.a(var5_array, he.field_f, true, (String[][]) null, field_K, al.field_eb, 4, da.field_b, il.field_n, 1, cb.field_j, eg.field_E, true, var3_array, var4_ref_ja____);
                    bo.field_e = true;
                    lp.a(200, -82);
                    ua.a(he.field_f, al.field_eb, (byte) 23);
                    bo.a(16777215, 0, 0, uc.field_b, 0, (java.applet.Applet) (this));
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    he.field_f = null;
                    al.field_eb = null;
                    o.d(26673);
                    qm.a(90.0f, 80, bn.field_c);
                    this.g(-30169);
                    ah.field_e = ap.a(ii.field_a, cg.field_n, "", 4, "font");
                    ff.field_r = vo.a((byte) -46, "", "font_title", cg.field_n, ii.field_a);
                    pb.field_e = pj.a(ii.field_a, 4, cg.field_n, "font_medium", "");
                    lf.a(pb.field_e, 0);
                    vc.a(true);
                    a.field_a = new ri[7][];
                    a.field_a[0] = da.a("cursor_grab", ii.field_a, (byte) 19, "");
                    a.field_a[1] = da.a("cursor_point", ii.field_a, (byte) 19, "");
                    a.field_a[6] = da.a("cursor_point_forbidden", ii.field_a, (byte) 19, "");
                    a.field_a[2] = da.a("cursor_reticule", ii.field_a, (byte) 19, "");
                    a.field_a[3] = da.a("cursor_poweringup", ii.field_a, (byte) 19, "");
                    a.field_a[5] = da.a("cursor_targeting", ii.field_a, (byte) 19, "");
                    a.field_a[4] = da.a("cursor_idle", ii.field_a, (byte) 19, "");
                    wd.field_P = wq.a(-22, "", ii.field_a, "intro_1");
                    eq.field_c = wq.a(-127, "", ii.field_a, "intro_2");
                    bl.field_g = wq.a(88, "", ii.field_a, "intro_3");
                    vh.field_Lb = wq.a(47, "", ii.field_a, "menu_pipe1");
                    dm.field_Wb = wq.a(-122, "", ii.field_a, "menu_pipe2");
                    cc.field_c = wq.a(-126, "", ii.field_a, "menu_pipebox");
                    wq.a(-121, "", ii.field_a, "menu_pipebox2");
                    no.field_Jb = wq.a(97, "", ii.field_a, "menu_title");
                    dd.field_g = wq.a(-118, "", ii.field_a, "menu_title_blank");
                    ao.field_b = new ja[sm.field_g.length];
                    var3_int = 0;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if ((ao.field_b.length ^ -1) >= (var3_int ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackIn_164_0 = sm.field_g[var3_int].length() ^ -1;
                    stackIn_152_0 = stackIn_164_0;
                    stackIn_164_1 = -1;
                    stackIn_152_1 = stackIn_164_1;
                    if (var6 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0 >= stackIn_152_1) {
                        statePc = 162;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_160_0 = ao.field_b;
                    stackIn_156_0 = stackIn_160_0;
                    stackIn_160_1 = var3_int;
                    stackIn_156_1 = stackIn_160_1;
                    stackIn_160_2 = 113;
                    stackIn_156_2 = stackIn_160_2;
                    if (-16 != (var3_int ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackIn_158_0 = (ja[]) ((Object) stackIn_156_0);
                    stackIn_158_1 = stackIn_156_1;
                    stackIn_158_2 = stackIn_156_2;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    stackIn_161_0 = (ja[]) ((Object) stackIn_158_0);
                    stackIn_161_1 = stackIn_158_1;
                    stackIn_161_2 = stackIn_158_2;
                    stackIn_161_3 = 0.65;
                    statePc = 161;
                    continue stateLoop;
                }
                case 160: {
                    stackIn_161_0 = (ja[]) ((Object) stackIn_160_0);
                    stackIn_161_1 = stackIn_160_1;
                    stackIn_161_2 = stackIn_160_2;
                    stackIn_161_3 = 1.0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    stackIn_161_0[stackIn_161_1] = wh.a(stackIn_161_2, stackIn_161_3, var3_int);
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    var3_int++;
                    if (var6 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    vm.field_lb = fl.a("", "lobby_game_logo", ii.field_a, 11091);
                    ip.field_e = wq.a(-117, "", ii.field_a, "help_arrow");
                    jl.field_u = wq.a(-119, "", ii.field_a, "info_help_button");
                    oi.field_k = ip.field_e.d();
                    oi.field_k.a();
                    lh.field_m = ip.field_e.d();
                    lh.field_m.c();
                    uo.field_n = ip.field_e.d();
                    uo.field_n.b();
                    jq.field_c = wq.a(-116, "", ii.field_a, "battery_small_empty");
                    dj.field_p = wq.a(-117, "", ii.field_a, "battery_big_empty");
                    wq.a(-121, "", ii.field_a, "battery_big_full");
                    ol.field_n = fl.a("", "vat", ii.field_a, 11091);
                    wq.a(70, "", ii.field_a, "vat_outline");
                    em.field_X = wq.a(47, "", ii.field_a, "lab_pipe");
                    nm.field_w = fl.a("", "lab_box_1", ii.field_a, 11091);
                    wq.a(-122, "", ii.field_a, "lab_box_2");
                    wq.a(-125, "", ii.field_a, "lab_box_3");
                    wq.a(-123, "", ii.field_a, "lab_box_1_outline");
                    wq.a(15, "", ii.field_a, "lab_box_2_outline");
                    wq.a(-118, "", ii.field_a, "lab_box_3_outline");
                    fg.field_m = fl.a("", "lab_tree_frame_bw", ii.field_a, 11091);
                    v.field_e = wq.a(15, "", ii.field_a, "lab_menu_bg_center");
                    pi.field_f = wq.a(95, "", ii.field_a, "lab_menu_bg_bottom");
                    wq.a(4, "", ii.field_a, "lab_tree_bg");
                    lm.field_eb = fl.a("", "slider", ii.field_a, 11091);
                    s.field_c = wq.a(14, "", ii.field_a, "research_trait_slot");
                    pf.field_a = wq.a(-119, "", ii.field_a, "research_powerup_modifier_slot");
                    el.field_E = wq.a(-120, "", ii.field_a, "forbidden_big");
                    nj.field_d = wq.a(-124, "", ii.field_a, "scrollbar_arrow_over");
                    fq.field_k = fl.a("", "scrollbar_arrow_off", ii.field_a, 11091);
                    df.field_Q = pb.a("", ii.field_a, -256, "scrollbar_block");
                    wc.field_M = pb.a("", ii.field_a, -256, "scrollbar_background");
                    kj.field_m = wq.a(102, "", ii.field_a, "scrollbar_bg");
                    wq.a(-127, "", ii.field_a, "scrollbar_bar_h");
                    wq.a(79, "", ii.field_a, "scrollbar_bar_v");
                    vl.field_f = nj.field_d.d();
                    ek.field_J = fq.field_k.c();
                    hp.field_t = kj.field_m.d();
                    vl.field_f.b();
                    ek.field_J.g();
                    hp.field_t.b();
                    qb.field_h = wq.a(-126, "", ii.field_a, "results_tube");
                    na.field_I = wq.a(0, "", ii.field_a, "crate_box");
                    qj.field_m = wq.a(-42, "", ii.field_a, "curve_tube");
                    wk.field_J = wq.a(24, "", ii.field_a, "curve_tube_empty");
                    hn.field_i = wq.a(93, "", ii.field_a, "empty_jar");
                    rg.field_C = wq.a(-124, "", ii.field_a, "main_tube");
                    ul.field_f = wq.a(-122, "", ii.field_a, "plug_01");
                    rq.field_l = wq.a(35, "", ii.field_a, "plug_02");
                    pq.field_o = wq.a(56, "", ii.field_a, "vert_tube");
                    tm.field_f = wq.a(109, "", ii.field_a, "vert_tube_empty");
                    pm.field_N = wq.a(31, "", ii.field_a, "curve_tube_mask");
                    w.field_z = wq.a(116, "", ii.field_a, "vert_tube_mask");
                    wq.a(27, "", ii.field_a, "stars");
                    pp.field_q = da.a("engine_icons", ii.field_a, (byte) 19, "");
                    jq.field_e = wq.a(-126, "", ii.field_a, "pipe_frame");
                    jq.field_e.e();
                    bb.field_n = new ja(48, 48);
                    na.field_H[0] = da.a("portal2", ii.field_a, (byte) 19, "");
                    ud.field_Q = wq.a(-116, "", ii.field_a, "portal_foo_mask");
                    cp.field_X = pb.a("", ii.field_a, -256, "blood");
                    wa.field_b = pb.a("", ii.field_a, -256, "powerups");
                    td.field_c = pb.a("", ii.field_a, -256, "explosion");
                    od.field_Fb = pb.a("", ii.field_a, -256, "miasma");
                    no.field_Hb[0] = pb.a("", ii.field_a, -256, "character_zombie0");
                    no.field_Hb[1] = pb.a("", ii.field_a, -256, "character_zombie1");
                    wq.field_c[0] = pb.a("", ii.field_a, -256, "character_human0");
                    wq.field_c[1] = pb.a("", ii.field_a, -256, "character_human1");
                    wq.field_c[2] = pb.a("", ii.field_a, -256, "character_human2");
                    wq.field_c[3] = pb.a("", ii.field_a, -256, "character_human3");
                    wq.field_c[4] = pb.a("", ii.field_a, -256, "character_human4");
                    wq.field_c[5] = pb.a("", ii.field_a, -256, "character_human5");
                    wq.field_c[6] = pb.a("", ii.field_a, -256, "character_human6");
                    wq.field_c[7] = pb.a("", ii.field_a, -256, "character_human7");
                    wq.field_c[8] = pb.a("", ii.field_a, -256, "character_human8");
                    wq.field_c[9] = pb.a("", ii.field_a, -256, "character_human9");
                    wq.field_c[10] = pb.a("", ii.field_a, -256, "character_human10");
                    wq.field_c[11] = pb.a("", ii.field_a, -256, "character_human11");
                    wq.field_c[12] = pb.a("", ii.field_a, -256, "character_human12");
                    wq.field_c[13] = pb.a("", ii.field_a, -256, "character_human13");
                    wq.field_c[14] = pb.a("", ii.field_a, -256, "character_human14");
                    wq.field_c[15] = pb.a("", ii.field_a, -256, "character_human15");
                    wq.field_c[16] = pb.a("", ii.field_a, -256, "character_human16");
                    wq.field_c[17] = pb.a("", ii.field_a, -256, "character_human17");
                    wq.field_c[18] = pb.a("", ii.field_a, -256, "character_human18");
                    wq.field_c[19] = pb.a("", ii.field_a, -256, "character_human19");
                    wq.field_c[20] = pb.a("", ii.field_a, -256, "character_human20");
                    stackIn_164_0 = 0;
                    stackIn_164_1 = -70;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (le.b(stackIn_164_0, (byte) stackIn_164_1)) {
                        statePc = 167;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 167: {
                    wq.field_c[21] = pb.a("halloween", ii.field_a, -256, "halloween_human1");
                    wq.field_c[22] = pb.a("halloween", ii.field_a, -256, "halloween_human2");
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    pn.field_c = da.a("character_charming", ii.field_a, (byte) 19, "");
                    sh.field_N = da.a("character_charmed", ii.field_a, (byte) 19, "");
                    aa.field_h = da.a("character_stunned", ii.field_a, (byte) 19, "");
                    ig.field_d = pb.a("", ii.field_a, -256, "character_common");
                    ej.a(fl.a("", "zombie_counter_instructions", ii.field_a, 11091), (byte) -100, fl.a("", "hud", ii.field_a, 11091));
                    rq.a(pb.a("", ii.field_a, -256, "popup"), 16777215);
                    sq.a(4, pb.a("", ii.field_a, -256, "carpark_floor"), false);
                    gd.a(false, 4, pb.a("", ii.field_a, -256, "carpark_tiles"));
                    sq.a(0, pb.a("", ii.field_a, -256, "mall_floor"), false);
                    gd.a(false, 0, pb.a("", ii.field_a, -256, "mall_tiles"));
                    sq.a(1, pb.a("", ii.field_a, -256, "powerplant_floor"), false);
                    gd.a(false, 1, pb.a("", ii.field_a, -256, "powerplant_tiles"));
                    sq.a(2, pb.a("", ii.field_a, -256, "precinct_floor"), false);
                    gd.a(false, 2, pb.a("", ii.field_a, -256, "precinct_tiles"));
                    sq.a(3, pb.a("", ii.field_a, -256, "whitehouse_floor"), false);
                    gd.a(false, 3, pb.a("", ii.field_a, -256, "whitehouse_tiles"));
                    pf.field_e[0] = pb.a("", ii.field_a, -256, "dimming0");
                    pf.field_e[1] = pb.a("", ii.field_a, -256, "dimming1");
                    pf.field_e[2] = pb.a("", ii.field_a, -256, "dimming2");
                    pf.field_e[3] = pb.a("", ii.field_a, -256, "dimming3");
                    pf.field_e[4] = pb.a("", ii.field_a, -256, "dimming4");
                    ig.field_b = fl.a("", "tutorial_arrow", ii.field_a, 11091);
                    o.field_h = fl.a("", "tutorial", ii.field_a, 11091);
                    sj.field_j = fl.a("", "frameh", ii.field_a, 11091);
                    lm.field_fb = fl.a("", "framev", ii.field_a, 11091);
                    rp.field_r = pb.a("", ii.field_a, -256, "framecorners");
                    tb.field_s = lm.field_fb.f();
                    vo.field_p = sj.field_j.c();
                    vo.field_p.i();
                    md.field_N = pb.a("", ii.field_a, -256, "instructions_controls");
                    ch.field_b = pb.a("", ii.field_a, -256, "instructions_survivors");
                    tf.field_Hb = pb.a("", ii.field_a, -256, "instructions_zombies");
                    cc.field_b = fj.a("frame", "", 3, ii.field_a);
                    field_I = fj.a("button_frame", "", 3, ii.field_a);
                    lf.field_c = fj.a("button_raised", "", 3, ii.field_a);
                    fj.a("button_depressed", "", 3, ii.field_a);
                    oi.field_h = fj.a("frame_comp", "", 3, ii.field_a);
                    rl.field_a = fj.a("frame_comp_filled", "", 3, ii.field_a);
                    if (he.field_a) {
                        statePc = 176;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    la.field_l = da.a("achievements_large", ii.field_a, (byte) 19, "");
                    var3 = la.field_l;
                    var4 = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if ((var4 ^ -1) <= (var3.length ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var5 = var3[var4];
                    e.a((byte) 48, var5);
                    var4++;
                    if (var6 != 0) {
                        statePc = 177;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var6 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    e.a((byte) 48, wl.field_l);
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    dl.field_h.b((byte) 104);
                    ii.field_a = null;
                    cg.field_n = null;
                    o.d(26673);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    stackIn_178_0 = 0;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    return stackIn_178_0 != 0;
                }
                case 179: {
                    if (ha.field_g == null) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    dg.a(new eh(ha.field_g.a("", "huffman", false)), -40);
                    ha.field_g = null;
                    o.d(26673);
                    stackIn_181_0 = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    return stackIn_181_0 != 0;
                }
                case 182: {
                    bc.a((byte) 76);
                    bc.a((byte) 15);
                    pl.field_I = 11;
                    sp.field_g = 12;
                    ip.a(-127, 50);
                    tj.a(3273, 224);
                    ff.a(200, 123);
                    cj.d(false, 0);
                    o.d(26673);
                    pl.field_J.a(true, (java.awt.Component) ((Object) dk.field_Ib), -14697);
                    tk.field_q = dk.field_Ib;
                    kb.a(16777215, 5, field_I, 15, lf.field_c, pb.field_e, 65280, 240, 16711680, 320, oi.field_h, (byte) -128, 15, 20, 20);
                    kk.field_w = new h(10, 10, true);
                    e.field_e = new nm(100, 100);
                    stackIn_183_0 = 1;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    return stackIn_183_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              dg.h(-95);
              if (null == rn.field_f) {
                break L1;
              } else {
                rn.a(-92);
                break L1;
              }
            }
            L2: {
              n.b(false);
              if (param0 == -18941) {
                break L2;
              } else {
                field_H = 24;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.HA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a("zombiedawnmulti", 14, (byte) 82);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.init()");
        }
    }

    private final void r(int param0) {
        boolean discarded$0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ia.field_r) {
                            statePc = 26;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ke.field_g == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ke.field_g = aa.b(-19300, 4);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (ke.field_g.field_k) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2 = k.field_n;
                        var3 = ke.field_g.field_h;
                        var4 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-9 >= (var4 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2[var4] = cr.b(var2[var4], var3[var4]);
                        var4++;
                        if (var5 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2 = fc.field_m;
                        var3 = ke.field_g.field_h;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-9 >= (var4 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2[var4] = tq.b(var2[var4], var3[var4] ^ -1);
                        var4++;
                        if (var5 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ia.field_r = true;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ke.field_g = null;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param0 <= -117) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        discarded$0 = this.c(true, 49);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (qd.field_bb) {
                            statePc = 47;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == ub.field_vb) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ub.field_vb = ej.a((byte) -57, 6);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (ub.field_vb.field_h) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ll.field_k.a(0, ub.field_vb.field_f);
                        oq.c((byte) 120);
                        if ((ll.field_k.field_i & 2) != 0) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        oq.c((byte) 119);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        we.field_g[47] = vn.field_d[ll.field_k.b((byte) -1)];
                        if (fn.field_b) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        th.b((byte) -61);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ub.field_vb = null;
                        qd.field_bb = true;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (!ia.field_r) {
                            statePc = 62;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (qd.field_bb) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ub.m(116);
                        ii.a(103);
                        if (pl.field_I != 6) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!oa.a(-9, fc.field_m)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        pl.field_I = 3;
                        bm.a(false, 3, 127, sp.field_g);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2_ref), "ZombieDawnMulti.FA(" + param0 + ')');
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              ZombieDawnMulti.t(-121);
              gb.b(103);
              vc.b(10066329);
              oe.b(-9162);
              rb.a((byte) -116);
              er.c(4);
              th.d(92);
              ul.b((byte) -35);
              vd.a(1);
              pn.a(31);
              jq.a(8);
              p.a(5);
              cm.a((byte) 127);
              oa.b(3732);
              kn.a(false);
              cj.c(false);
              ti.g((byte) 119);
              pb.a((byte) -116);
              qb.c((byte) -7);
              ai.a(127);
              eq.a(0);
              of.a(-1);
              ej.b((byte) 16);
              ih.b(108);
              aq.o(10);
              fn.a(26677);
              ag.b(true);
              mh.a(17);
              bd.a(-1);
              mf.a(54);
              oo.a();
              k.b(false);
              bl.b(0);
              v.a(true);
              gj.a((byte) 91);
              va.a(127);
              lb.a((byte) 43);
              jf.a((byte) -98);
              ka.a((byte) 118);
              pf.b(6345);
              i.a(false);
              ii.c(-26028);
              l.a(64);
              lh.a((byte) -50);
              ll.a((byte) -46);
              ok.e(12);
              qd.h(256);
              nn.b(112);
              ci.b(1475);
              s.a(-96);
              h.b(false);
              nm.a(6);
              rp.a(5);
              rl.c(78);
              br.b((byte) 48);
              nq.e(-119);
              qa.a((byte) 43);
              ep.c();
              pk.a(619119521);
              qf.a(241);
              jk.a(2);
              ei.a(-5794);
              vn.b(96);
              qo.b(false);
              lj.a((byte) 55);
              gm.o(24461);
              cg.c((byte) -87);
              pq.a((byte) 44);
              lc.a((byte) 87);
              id.e((byte) 107);
              ce.a(24);
              wb.o((byte) -45);
              jj.i(1);
              ae.b(false);
              fq.c(true);
              nc.b(false);
              tk.c((byte) -88);
              si.d(true);
              hk.a((byte) 39);
              kb.b(-6);
              fh.a(true);
              qe.a((byte) 7);
              ko.d(-66);
              uf.b(16737894);
              lq.c(110);
              if (param0 < -43) {
                break L1;
              } else {
                field_H = -75;
                break L1;
              }
            }
            fc.b(-1);
            qk.b(false);
            qi.b((byte) -17);
            me.a((byte) 119);
            gd.e(0);
            f.a((byte) -44);
            mb.b(false);
            mm.d();
            ba.d(16652);
            gp.b();
            w.a((byte) -83);
            de.a(19091);
            jh.h(-36);
            sc.a(true);
            dm.h(0);
            so.a(-123);
            ga.j(-125);
            sj.c(true);
            fg.c(-125);
            uo.c((byte) 121);
            jm.c((byte) 59);
            op.c((byte) -9);
            wf.c(17);
            np.c(true);
            aj.a(-110);
            hb.a(false);
            be.a(0);
            da.a((byte) -95);
            ng.a(816);
            bc.c(22382);
            ql.a(4);
            vk.k((byte) 95);
            tf.o(101);
            ta.k((byte) -66);
            ub.o(61);
            ne.n(10);
            fe.c(false);
            dg.a((byte) 84);
            qm.a(64);
            cp.c(true);
            hf.b((byte) 45);
            sk.a(-1020346174);
            wp.a((byte) 26);
            rh.a();
            ac.a();
            kl.a();
            jp.b((byte) -80);
            hh.a(true);
            vo.f(-14680);
            ck.b(-120);
            mq.e(22324);
            ah.a((byte) -79);
            dn.a(16130);
            mi.d(false);
            hi.c((byte) -81);
            sn.c((byte) 117);
            cd.d(false);
            jb.a(-2);
            tq.h(0);
            fa.j(57);
            wq.b((byte) 121);
            lo.a(0);
            fm.a();
            uq.a(3);
            vi.a(119);
            cq.a((byte) -110);
            bn.a(23376);
            mo.h(2);
            qh.a(-22);
            sb.a(76);
            g.a();
            ff.e(-1130232991);
            rj.j(8784);
            lk.i(11041);
            ve.a((byte) 104);
            gk.a(125);
            ol.c((byte) -56);
            vf.a((byte) 9);
            eh.a((byte) 87);
            mc.a((byte) 124);
            wg.a((byte) -123);
            pd.a((byte) 91);
            vb.a(false);
            pg.b(true);
            hc.a(0);
            ed.a(12814);
            ke.a(false);
            jo.a(false);
            pi.a(-19162);
            ic.a(70);
            kp.e(-29690);
            o.b(-13532);
            ec.a((byte) -12);
            dc.c((byte) 82);
            dk.c((byte) 92);
            dp.a(0);
            no.h(15);
            oj.h(16777215);
            tm.a(-125);
            cb.a(0);
            jg.b(7);
            eo.a((byte) 125);
            lm.n(0);
            sh.b(true);
            ek.f((byte) -83);
            ge.r(-121);
            ro.b((byte) 71);
            pa.i((byte) -86);
            bf.d(29919);
            og.g((byte) -119);
            c.a(-6);
            ap.h(16682);
            tn.g(0);
            bq.a((byte) 77);
            li.g(66);
            cn.d(-124);
            hl.a(16777215);
            qc.c((byte) 109);
            qq.a((byte) 21);
            t.a((byte) 4);
            wo.a();
            eb.a(true);
            lp.a(-97);
            hj.a(27964);
            a.a(false);
            tg.a((byte) -72);
            dl.a((byte) -109);
            en.a(20964);
            wl.a(true);
            iq.a(true);
            dd.a(false);
            r.a(true);
            ld.h(-113);
            ig.a(false);
            ob.c((byte) -52);
            ik.b(49);
            vm.k((byte) -29);
            hq.a((byte) 82);
            af.a(-128);
            md.b((byte) 119);
            kc.a(-111);
            am.b(-7);
            rm.a(80);
            kd.a(2791);
            kq.a((byte) 60);
            sf.a(4);
            fl.a((byte) 109);
            ij.a(true);
            jl.a(false);
            bg.a((byte) -104);
            wa.a(2);
            mp.a(12);
            cf.e((byte) -90);
            gn.a(-118);
            rg.a((byte) -39);
            al.i((byte) -92);
            df.g((byte) 84);
            se.b(false);
            ch.d(-1);
            bh.a((byte) -8);
            ji.a(13377);
            tl.f(32768);
            io.a((byte) 8);
            aa.f(0);
            dq.b(-2);
            sm.a(-12970);
            fd.g((byte) 97);
            hn.a(0);
            cc.a((byte) -52);
            wc.g((byte) -66);
            mj.i(22767);
            tj.a(false);
            sa.a(-119);
            nk.a((byte) -26);
            dj.g(-3);
            em.k(4);
            pl.f(114);
            rn.a((byte) 88);
            hg.c(true);
            ho.e(30833);
            fk.e(225);
            vj.e(31592);
            vh.c((byte) -113);
            kg.a(360);
            po.f(-60);
            nj.a((byte) 78);
            el.h(3);
            on.l(29829);
            pm.d(false);
            ie.l(7181);
            le.a(0);
            gl.c(true);
            sq.f(2);
            uk.f(-1562977759);
            km.i(0);
            un.g(-1317848592);
            q.a((byte) -109);
            pj.c(true);
            ud.f(38);
            wm.h((byte) 107);
            uh.a();
            bi.a(4302);
            nb.a((byte) 119);
            wk.h(-127);
            od.o((byte) -50);
            bk.c(4912);
            kf.c(3);
            wh.a(false);
            e.a(118);
            kk.b(true);
            la.a(-113);
            ua.g((byte) -33);
            sd.g((byte) -81);
            ao.a(-23);
            eg.c((byte) 5);
            b.a(94);
            up.a((byte) -30);
            ln.a(18358);
            vl.a(0);
            vg.a(8220);
            we.a((byte) 103);
            oq.d((byte) -39);
            he.a((byte) -122);
            tb.c((byte) 109);
            m.a(false);
            na.g((byte) -108);
            nh.a((byte) 48);
            kj.a(-2);
            oi.b(5378);
            ml.c((byte) -102);
            gg.a((byte) -126);
            ra.b(true);
            ab.a(0);
            gi.a(-1569388056);
            cr.b(true);
            qj.b(false);
            uc.c(118);
            ip.c((byte) 124);
            bb.a(-18535);
            um.a(-98);
            rq.b(false);
            ki.b(-23636);
            fb.d(-90);
            wj.a(-6298);
            ak.a(-5937);
            gh.a((byte) 106);
            wd.a((byte) -84);
            il.a(27467);
            bo.a(6);
            pp.a(false);
            wn.b(true);
            mn.c(3);
            ui.a((byte) -48);
            db.a(26);
            u.a(-7406);
            hp.a(120);
            mk.a(53);
            td.a((byte) 94);
            ha.a(21342);
            re.a(89);
            gf.a(true);
            tp.h(66);
            ia.h(0);
            hm.b(false);
            hd.h(11702);
            bp.h(-3);
            qp.h(1);
            lf.a(0);
            wi.a(0);
            ma.a(64);
            this.field_v = null;
            this.field_J = null;
            this.field_G = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.KA(" + param0 + ')');
        }
    }

    public ZombieDawnMulti() {
    }

    static {
        field_M = "Annoying";
        field_K = new String[]{"Map type", "Map name"};
        field_F = "Test Chamber";
    }
}
