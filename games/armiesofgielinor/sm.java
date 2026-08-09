/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sm {
    static int field_b;
    static int field_c;
    static String field_g;
    static String field_e;
    at field_a;
    static int field_d;
    private at field_f;

    final static hl a(int param0, int param1, boolean param2) {
        dn stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        dn stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        dn stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        je stackIn_42_0 = null;
        je stackIn_44_0 = null;
        je stackIn_45_0 = null;
        String stackIn_45_1 = null;
        je stackIn_46_0 = null;
        je stackIn_48_0 = null;
        je stackIn_49_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_102_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        at var4 = null;
        Object var5 = null;
        Object var6 = null;
        hl var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        tg var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = mw.field_E.field_Kb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = param2;
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = (jn.field_d * 3 - -6) * param1;
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = 2 + jn.field_d;
                        stackIn_2_3 = stackIn_4_3;
                        if (mw.field_E.field_Kb != pq.field_b) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (dn) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (dn) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((dn) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, 0, 2) ? 1 : 0;
                        var4 = mw.field_E.field_Nb.field_fb;
                        if (param0 > 20) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        sm.a(-8, (String[]) null, (String) null, -108);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = null;
                        if (th.field_a == 2) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        su.field_d.field_xb = false;
                        bn.field_c.field_X = fm.field_c;
                        if (1 == th.field_a) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        mw.field_E.field_Kb.field_Nb.field_X = ef.field_a;
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        mw.field_E.field_Kb.field_Nb.field_X = ur.field_u;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        jm.a(mw.field_E.field_Nb, -47);
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        su.field_d.field_xb = true;
                        bn.field_c.field_X = fo.a(4800, ps.field_A, new String[]{vl.field_p});
                        mw.field_E.field_Kb.field_Nb.field_X = null;
                        var6 = null;
                        var7 = (hl) ((Object) var4.e((byte) 109));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == null) {
                            statePc = 93;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = 0;
                        if (var19 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null == var7.field_fb) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7.field_Qb = new je(0L, ga.field_i);
                        var7.a(var7.field_Qb, 87);
                        var7.field_Kb = new je(0L, ws.field_P);
                        var7.a(var7.field_Kb, 96);
                        var7.field_Jb = new je(0L, ga.field_i);
                        var7.a(var7.field_Jb, 69);
                        var7.field_Kb.field_Eb = 2;
                        var7.i(-10027);
                        var8 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7.field_gb = mw.field_E.field_Nb.field_gb;
                        var9 = 0;
                        if (null == var7.field_Ib) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (vl.field_p == var7.field_Ib) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 16777062;
                        var10 = 13421568;
                        if (var19 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10 = 52224;
                        var11 = 6750054;
                        if (var19 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12 = 0;
                        if (var7.field_Nb == null) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var7.field_Nb.equals("")) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7.field_Jb.field_W = var11;
                        var7.field_Jb.field_cb = tl.field_e;
                        var12 = 1;
                        var7.field_Jb.a(jn.field_d, -20500, 3 + tl.field_e.field_A, var9, 0);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7.field_Kb.field_wb = var11;
                        var7.field_Qb.field_wb = var11;
                        var7.field_Kb.field_N = var10;
                        var7.field_Qb.field_N = var10;
                        var7.field_Kb.field_W = var11;
                        var7.field_Qb.field_W = var11;
                        var7.field_Kb.field_T = var11;
                        var7.field_Qb.field_T = var11;
                        var13 = 0;
                        var14 = -82 + var7.field_gb;
                        if (var12 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13 = tl.field_e.field_A - -3;
                        var14 = var14 - var13;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = var7.field_Qb;
                        stackIn_42_0 = stackIn_44_0;
                        if ((var14 ^ -1) >= -1) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_45_0 = (je) ((Object) stackIn_42_0);
                        stackIn_45_1 = ka.a(var7.field_Qb.field_Z, var7.field_Mb, var14);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = (je) ((Object) stackIn_44_0);
                        stackIn_45_1 = var7.field_Mb;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_45_0.field_X = stackIn_45_1;
                        var7.field_Qb.a(jn.field_d, -20500, var14, var9, var13);
                        stackIn_48_0 = var7.field_Kb;
                        stackIn_46_0 = stackIn_48_0;
                        if (null != var7.field_Ib) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_49_0 = (je) ((Object) stackIn_46_0);
                        stackIn_49_1 = iu.field_i;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = (je) ((Object) stackIn_48_0);
                        stackIn_49_1 = var7.field_Ib;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0.field_X = stackIn_49_1;
                        var7.field_Kb.a(jn.field_d, -20500, 80, var9, -80 + var7.field_gb);
                        if (var7.field_Qb.field_X.equals(var7.field_Mb)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_53_0 = 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 103;
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
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15 = stackIn_53_0;
                        var9 = var9 + jn.field_d;
                        if (var3_int == 0) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7.field_nb = var9 - var7.field_ob;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var8 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        mw.field_E.field_Nb.a(var7, true, 2, (je) (var6));
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var6 = var7;
                        if (var7.field_Jb == null) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (!var7.field_Jb.field_eb) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ad.field_I = var7.field_Nb;
                        if (var19 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-1 != (var7.field_yb ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (!var7.field_Qb.field_eb) {
                            statePc = 92;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var15 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ad.field_I = var7.field_Mb;
                        if (var19 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var16 = var7.field_Mb;
                        ng.a(mw.field_E.field_Kb, var7, (int[]) null, (String) null, -1, 84, -1, var16, 0L);
                        if (null == var7.field_Ib) {
                            statePc = 91;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (fs.a((byte) 110, tn.field_Z.field_m)) {
                            statePc = 91;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (bb.field_a) {
                            statePc = 91;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (vi.field_d) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var17 = tn.field_Z;
                        var18 = fo.a(4800, mi.field_k, new String[]{var16});
                        var17.field_i.a(8, var18, (byte) -115);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var17 = tn.field_Z;
                        var18 = fo.a(4800, jc.field_w, new String[]{var16});
                        var17.field_i.a(18, var18, (byte) -100);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var5 = var7;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var7 = (hl) ((Object) var4.a((byte) 123));
                        if (var19 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (0 != mw.field_E.field_Ib.field_yb) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        tb.field_e = new oc(mw.field_E.field_Ib.field_V, mw.field_E.field_Ib.field_D, mw.field_E.field_Ib.field_gb, mw.field_E.field_Ib.field_ob, iv.field_a, kq.field_N, eq.field_h, eq.field_h);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ut.field_fb = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (mw.field_E.field_Rb.field_yb == 0) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        tb.field_e = new oc(mw.field_E.field_Rb.field_V, mw.field_E.field_Rb.field_D, mw.field_E.field_Rb.field_gb, mw.field_E.field_Rb.field_ob, se.field_b, kq.field_N, eq.field_h, eq.field_h);
                        ut.field_fb = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = var5;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return (hl) ((Object) stackIn_102_0);
                }
                case 103: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var3), "sm.H(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final jb b(int param0) {
        jb var2 = null;
        RuntimeException var2_ref = null;
        jb stackIn_2_0 = null;
        jb stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 640) {
              L1: {
                var2 = (jb) ((Object) this.field_f.a(0));
                if (null == var2) {
                  var2 = new jb();
                  break L1;
                } else {
                  break L1;
                }
              }
              var2.h(-1);
              stackIn_8_0 = (jb) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "sm.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    abstract jb a(byte param0);

    final void a(int param0, int param1, int param2, float param3) {
        jb var5 = null;
        if (param2 >= -69) {
            return;
        }
        try {
            var5 = this.b(640);
            var5.field_t = param3;
            var5.field_q = param0;
            var5.field_s = param1;
            this.a(16777062, var5);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sm.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, float param3, byte param4, int param5) {
        jb var7 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              if (param4 == 71) {
                break L1;
              } else {
                sm.a(76, (String[]) null, (String) null, 20);
                break L1;
              }
            }
            var7 = this.b(param4 ^ 711);
            var7.field_t = param3;
            var7.field_s = param1;
            var7.field_m = param5;
            var7.field_q = param2;
            this.a(16777062, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7_ref), "sm.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, int param1, float param2) {
        jb var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (param0 == -68) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            var4 = this.b(640);
            var4.field_r = param1;
            var4.field_t = param2;
            this.a(16777062, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4_ref), "sm.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_e = null;
            field_g = null;
            if (param0 != -1) {
                field_g = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sm.O(" + param0 + ')');
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                mh.field_b = lm.field_d;
                if (-256 == (param3 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if ((param3 ^ -1) > -101) {
                      break L3;
                    } else {
                      if ((param3 ^ -1) < -106) {
                        break L3;
                      } else {
                        var4 = param1;
                        fw.a(-1, var4);
                        vl.field_k = ei.a(2, param1);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  vl.field_k = il.a(-1, param3, param2);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (nm.field_z >= 13) {
                  stackIn_18_0 = 0;
                  break L4;
                } else {
                  stackIn_18_0 = 1;
                  break L4;
                }
              }
              vl.field_k = dc.a(stackIn_18_0 != 0, false);
              fw.a(-1, (String[]) null);
              break L1;
            }
            L5: {
              if (param0 > 28) {
                break L5;
              } else {
                sm.a(-35, -5, true);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4_ref);

            stackIn_26_1 = new StringBuilder().append("sm.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_31_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, float param2, int param3, int param4, boolean param5) {
        jb var7 = this.b(640);
        var7.field_r = -2;
        if (!param5) {
            return;
        }
        try {
            var7.field_q = param0;
            var7.field_m = param3;
            var7.field_t = param2;
            var7.field_l = param1;
            var7.field_s = param4;
            this.a(16777062, var7);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sm.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void b(byte param0) {
        try {
            int var2_int = -101 / ((param0 - -67) / 49);
            this.field_a.a(true, this.field_f);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sm.D(" + param0 + ')');
        }
    }

    void a(int param0, jb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 16777062) {
              this.field_a.a((byte) -119, (tc) (param1));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("sm.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, float param4, int param5) {
        RuntimeException runtimeException = null;
        jb var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = this.b(640);
              var7.field_t = param4;
              var7.field_s = param2;
              var7.field_k = param1;
              var7.field_q = param0;
              var7.field_o = param5;
              this.a(16777062, var7);
              if (param3 <= -114) {
                break L1;
              } else {
                this.field_f = (at) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sm.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 < df.field_M) {
                  break L2;
                } else {
                  L3: {
                    if (!nw.g(80)) {
                      break L3;
                    } else {
                      var2_int = 0;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                L5: {
                  if (ra.field_e != null) {
                    break L5;
                  } else {
                    wq.field_a = dj.a(640, 0, ft.field_m, -36, 0, 480);
                    if (var3 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                wq.field_a = ra.field_e.c(-1);
                ds.a(2, 99);
                break L4;
              }
              L6: {
                if (null == wq.field_a) {
                  break L6;
                } else {
                  var2_int = 2;
                  lk.a(77, wq.field_a);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              var2_int = 3;
              break L1;
            }
            L7: {
              if (param1 == 8028) {
                break L7;
              } else {
                field_e = (String) null;
                break L7;
              }
            }
            L8: {
              if (null != ra.field_e) {
                break L8;
              } else {
                if (bn.field_e) {
                  vq.a(var2_int, param0, (byte) 13);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sm.L(" + param0 + ',' + param1 + ')');
        }
    }

    sm(ej param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = new at();
            this.field_f = new at();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("sm.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_g = "Inviting <%0>";
        field_d = 0;
        field_e = "<%0> (<%1>-<%2>)";
    }
}
