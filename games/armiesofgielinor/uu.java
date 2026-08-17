/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu {
    static boolean field_b;
    static String field_c;
    static String field_a;

    final static void a(boolean param0, boolean param1, int param2, int param3, boolean param4) {
        je stackIn_21_0 = null;
        je stackIn_22_0 = null;
        je stackIn_23_0 = null;
        je stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        boolean stackIn_114_0 = false;
        int stackIn_132_0 = 0;
        boolean stackIn_148_0 = false;
        int stackIn_155_0 = 0;
        je stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        je stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        je stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        je stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        je stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        int stackIn_174_2 = 0;
        je stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        je stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        je stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        je stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        je stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        int stackIn_179_2 = 0;
        je stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        je stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        je stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        je stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        je stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        int stackIn_184_2 = 0;
        boolean stackOut_113_0;
        boolean stackOut_147_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        je var6 = null;
        je var7 = null;
        je var8 = null;
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
        at var17 = null;
        Object var18 = null;
        int var18_int = 0;
        of var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        je var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        je var26 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        uu.a((byte) -86);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qb.a(rk.field_D, 125);
                        if (vu.field_M == null) {
                            statePc = 169;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        mp.field_Lb.field_xb = true;
                        lm.field_b.field_ob = 0;
                        var22 = lm.field_b;
                        var26 = var22;
                        var26.field_gb = 0;
                        so.field_d.field_ob = 0;
                        var6 = so.field_d;
                        var6.field_gb = 0;
                        var7 = pi.field_N;
                        pi.field_N.field_ob = 0;
                        var7.field_gb = 0;
                        if (vu.b(false)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9_ref_String = vu.field_M.field_rc;
                        kd.field_F.field_X = fo.a(4800, cv.field_m, new String[]{var9_ref_String}).toUpperCase();
                        pi.field_N.a(40, param3 + -20500, pd.field_c.field_gb, -40 + pd.field_c.field_ob, 0);
                        pi.field_N.field_X = fo.a(4800, wt.field_F, new String[]{var9_ref_String});
                        var8 = pi.field_N;
                        if (var19 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        kd.field_F.field_X = tp.field_f.toUpperCase();
                        var9 = (2 + pd.field_c.field_gb) / 2;
                        lm.field_b.a(40, -20500, var9 - 2, -40 + pd.field_c.field_ob, 0);
                        if ((vu.field_M.field_nc ^ -1) >= (vu.field_M.field_Ub ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lm.field_b.field_X = em.field_d.toUpperCase();
                        lm.field_b.field_xb = true;
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        lm.field_b.field_X = kn.field_y.toUpperCase();
                        lm.field_b.field_xb = false;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        lm.field_b.field_G = nd.field_a.field_G;
                        if (0 < vj.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (1 != vj.field_a) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10_ref_String = vf.field_c;
                        if (var19 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10_ref_String = fo.a(4800, wa.field_h, new String[]{Integer.toString(vj.field_a)});
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 != (16 & hg.field_b)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!vk.field_f) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        lm.field_b.field_G = nd.field_a.field_mb;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        lm.field_b.field_X = lm.field_b.field_X + "<br>" + var10_ref_String;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        so.field_d.a(40, -20500, -var9 + pd.field_c.field_gb, pd.field_c.field_ob + -40, var9);
                        so.field_d.field_X = ew.field_b.toUpperCase();
                        var8 = so.field_d;
                        stackIn_23_0 = so.field_d;
                        stackIn_21_0 = stackIn_23_0;
                        if (!param4) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (je) ((Object) stackIn_21_0);
                        stackIn_22_0 = stackIn_23_0;
                        if (ph.field_d != 0L) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = (je) ((Object) stackIn_22_0);
                        stackIn_24_1 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (je) ((Object) stackIn_23_0);
                        stackIn_24_1 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_24_0.field_xb = stackIn_24_1 != 0;
                        var10 = 2;
                        if (null == fs.field_d) {
                            statePc = 77;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null == ur.field_B) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ur.field_B = new byte[tq.field_b];
                        dt.field_d = new boolean[tq.field_b];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var11_int >= tq.field_b) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        dt.field_d[var11_int] = false;
                        var11_int++;
                        if (var19 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 197;
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
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 197;
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
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (2 <= var10) {
                            statePc = 72;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11_int = 0;
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
                        statePc = 197;
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
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var12;
                        stackIn_39_1 = fs.field_d.length;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= stackIn_39_1) {
                            statePc = 68;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var25 = fs.field_d[var12];
                        var23 = var25;
                        var20 = var23;
                        var13 = var20;
                        stackIn_69_0 = 0;
                        stackIn_41_0 = stackIn_69_0;
                        if (var19 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var14_int = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var25.length <= var14_int) {
                            statePc = 58;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var15 = var25[var14_int];
                        var16 = var20[1 + var14_int];
                        stackIn_60_0 = 0;
                        stackIn_44_0 = stackIn_60_0;
                        stackIn_60_1 = var15 ^ -1;
                        stackIn_44_1 = stackIn_60_1;
                        if (var19 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 != stackIn_44_1) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-1 != (var10 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_48_0 = vu.field_M.field_nc;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = vu.field_M.field_Ub;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var17_int = stackIn_48_0;
                        if (var17_int == var16) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var19 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var16 == (vu.field_M.field_pc[var15] & 255)) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var19 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var14_int += 2;
                        if (var19 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var11_int = 1;
                        var14_int = -1;
                        var15 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = var15 ^ -1;
                        stackIn_60_1 = var25.length ^ -1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 <= stackIn_60_1) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var16 = var25[var15];
                        stackIn_39_0 = var14_int ^ -1;
                        stackIn_62_0 = stackIn_39_0;
                        stackIn_39_1 = var16 ^ -1;
                        stackIn_62_1 = stackIn_39_1;
                        if (var19 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 > stackIn_62_1) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var14_int = var16;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var15 += 2;
                        if (var19 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        dt.field_d[var14_int] = true;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var12++;
                        if (var19 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var11_int;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 197;
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
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = hi.field_j ^ -1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 > -3) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (br.field_f[12]) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var10 = 2;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var10 < 2) {
                            statePc = 144;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (ep.field_p != null) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (null != iv.field_e) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (jv.field_d != null) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (null != sk.field_j) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var11_int = 0;
                        var12 = 0;
                        var13_int = 0;
                        var14_int = 0;
                        var15 = 0;
                        var16 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var16 ^ -1) <= (tq.field_b ^ -1)) {
                            statePc = 110;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var17_int = 255 & vu.field_M.field_pc[var16];
                        if (var19 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (null == ep.field_p) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (null != ep.field_p[var16]) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (!ep.field_p[var16][var17_int]) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var11_int = 1;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (null == iv.field_e) {
                            statePc = 99;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (iv.field_e[var16] == null) {
                            statePc = 99;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var18_int = iv.field_e[var16][var17_int];
                        if ((var18_int ^ -1) >= (var13_int ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var13_int = var18_int;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var18_int == 0) {
                            statePc = 99;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (!bj.field_k) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var11_int = 1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (sk.field_j == null) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (null == sk.field_j[var16]) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var15 = var15 | sk.field_j[var16][var17_int];
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (jv.field_d == null) {
                            statePc = 109;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (jv.field_d[var16] == null) {
                            statePc = 109;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var18_int = jv.field_d[var16][var17_int];
                        if (0 == var18_int) {
                            statePc = 107;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (bj.field_k) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var11_int = 1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var18_int <= var14_int) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var14_int = var18_int;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var16 = 0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var17 = bu.field_a.field_Jb.field_fb;
                        var18_ref = (of) ((Object) var17.e((byte) 110));
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var18_ref == null) {
                            statePc = 131;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = var18_ref.k(param3 ^ 0);
                        stackIn_132_0 = stackOut_113_0 ? 1 : 0;
                        stackIn_114_0 = stackOut_113_0;
                        if (var19 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!stackIn_114_0) {
                            statePc = 117;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var19 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var11_int == 0) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (!var18_ref.field_Zb) {
                            statePc = 120;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var18_ref.field_Sb < var13_int) {
                            statePc = 123;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var18_ref.field_Xb >= var14_int) {
                            statePc = 126;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (((var18_ref.field_Ob ^ -1) & var15) <= 0) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (var12 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var16 = 1;
                        if (var19 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var18_ref = (of) ((Object) var17.a((byte) 123));
                        if (var19 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackIn_132_0 = hi.field_j ^ -1;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (stackIn_132_0 > -3) {
                            statePc = 136;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (br.field_f[12]) {
                            statePc = 135;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var16 = 0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (var16 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        so.field_d.field_xb = false;
                        if (so.field_d.field_jb) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (-1 == (ij.field_w.field_a.field_Kb ^ -1)) {
                            statePc = 142;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        ad.field_I = fo.a(4800, ha.field_pb, new String[]{ob.field_O});
                        if (var19 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        ad.field_I = kl.field_f;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (var19 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        so.field_d.field_xb = false;
                        if (!so.field_d.field_jb) {
                            statePc = 163;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (var13_int >= tq.field_b) {
                            statePc = 154;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackOut_147_0 = dt.field_d[var13_int];
                        stackIn_155_0 = stackOut_147_0 ? 1 : 0;
                        stackIn_148_0 = stackOut_147_0;
                        if (var19 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (stackIn_148_0) {
                            statePc = 150;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var24 = "<col=A00000>" + ob.field_M[var13_int] + "</col>";
                        if (var11 == null) {
                            statePc = 152;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var12 = 1;
                        var11 = (String) (var11) + ", " + var24;
                        if (var19 == 0) {
                            statePc = 153;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        var11 = var24;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        var13_int++;
                        if (var19 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        stackIn_155_0 = var10;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (stackIn_155_0 != 0) {
                            statePc = 159;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var13_ref = rd.field_f;
                        if (var12 != 0) {
                            statePc = 158;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var14 = fo.a(param3 ^ 4800, go.field_d, new String[]{(String) (var11)});
                        if (var19 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var14 = ol.field_x + (String) (var11);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var13_ref = l.field_h;
                        if (var12 != 0) {
                            statePc = 161;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var14 = fo.a(4800, er.field_c, new String[]{(String) (var11)});
                        if (var19 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var14 = au.field_Jb + (String) (var11);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        ad.field_I = "<col=A00000>" + var13_ref + "<br>" + var14;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (ph.field_d == 0L) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        var9 = (int)(-vi.b(-111) + ph.field_d);
                        var9 = (var9 + 999) / 1000;
                        if (1 > var9) {
                            statePc = 166;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var9 = 1;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var8.field_X = fo.a(4800, dk.field_t, new String[]{Integer.toString(var9)});
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        gg.field_E.field_X = fo.a(4800, ws.field_T, new String[]{Integer.toString(vu.field_M.field_Ub), Integer.toString(vu.field_M.field_nc)});
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackIn_173_0 = lk.field_a;
                        stackIn_170_0 = stackIn_173_0;
                        stackIn_173_1 = 1;
                        stackIn_170_1 = stackIn_173_1;
                        if (!param0) {
                            statePc = 173;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackIn_173_0 = (je) ((Object) stackIn_170_0);
                        stackIn_171_0 = stackIn_173_0;
                        stackIn_173_1 = stackIn_170_1;
                        stackIn_171_1 = stackIn_173_1;
                        if (param1) {
                            statePc = 173;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        stackIn_173_0 = (je) ((Object) stackIn_171_0);
                        stackIn_172_0 = stackIn_173_0;
                        stackIn_173_1 = stackIn_171_1;
                        stackIn_172_1 = stackIn_173_1;
                        if (vk.field_f) {
                            statePc = 173;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackIn_174_0 = (je) ((Object) stackIn_172_0);
                        stackIn_174_1 = stackIn_172_1;
                        stackIn_174_2 = 1;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackIn_174_0 = (je) ((Object) stackIn_173_0);
                        stackIn_174_1 = stackIn_173_1;
                        stackIn_174_2 = 0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        ((je) (Object) stackIn_174_0).a(stackIn_174_1 != 0, stackIn_174_2 != 0);
                        stackIn_178_0 = pd.field_c;
                        stackIn_175_0 = stackIn_178_0;
                        stackIn_178_1 = 1;
                        stackIn_175_1 = stackIn_178_1;
                        if (!param0) {
                            statePc = 178;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        stackIn_178_0 = (je) ((Object) stackIn_175_0);
                        stackIn_176_0 = stackIn_178_0;
                        stackIn_178_1 = stackIn_175_1;
                        stackIn_176_1 = stackIn_178_1;
                        if (param1) {
                            statePc = 178;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        stackIn_178_0 = (je) ((Object) stackIn_176_0);
                        stackIn_177_0 = stackIn_178_0;
                        stackIn_178_1 = stackIn_176_1;
                        stackIn_177_1 = stackIn_178_1;
                        if (vk.field_f) {
                            statePc = 178;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackIn_179_0 = (je) ((Object) stackIn_177_0);
                        stackIn_179_1 = stackIn_177_1;
                        stackIn_179_2 = 1;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackIn_179_0 = (je) ((Object) stackIn_178_0);
                        stackIn_179_1 = stackIn_178_1;
                        stackIn_179_2 = 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        ((je) (Object) stackIn_179_0).a(stackIn_179_1 != 0, stackIn_179_2 != 0);
                        stackIn_183_0 = ta.field_R;
                        stackIn_180_0 = stackIn_183_0;
                        stackIn_183_1 = 1;
                        stackIn_180_1 = stackIn_183_1;
                        if (!param0) {
                            statePc = 183;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackIn_183_0 = (je) ((Object) stackIn_180_0);
                        stackIn_181_0 = stackIn_183_0;
                        stackIn_183_1 = stackIn_180_1;
                        stackIn_181_1 = stackIn_183_1;
                        if (param1) {
                            statePc = 183;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackIn_183_0 = (je) ((Object) stackIn_181_0);
                        stackIn_182_0 = stackIn_183_0;
                        stackIn_183_1 = stackIn_181_1;
                        stackIn_182_1 = stackIn_183_1;
                        if (!vk.field_f) {
                            statePc = 183;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackIn_184_0 = (je) ((Object) stackIn_182_0);
                        stackIn_184_1 = stackIn_182_1;
                        stackIn_184_2 = 1;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackIn_184_0 = (je) ((Object) stackIn_183_0);
                        stackIn_184_1 = stackIn_183_1;
                        stackIn_184_2 = 0;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        ((je) (Object) stackIn_184_0).a(stackIn_184_1 != 0, stackIn_184_2 != 0);
                        ij.field_w.field_a.l(param3 ^ 10000);
                        if (vu.field_M != null) {
                            statePc = 186;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (-1 == (mp.field_Lb.field_yb ^ -1)) {
                            statePc = 188;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        pq.a(69, vu.field_M.d((byte) -68), param2);
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (-1 == (lm.field_b.field_yb ^ -1)) {
                            statePc = 190;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        vk.field_f = true;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if (0 != so.field_d.field_yb) {
                            statePc = 192;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        cp.field_h = true;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (dv.field_m.field_yb == 0) {
                            statePc = 195;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        vk.field_f = false;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        vf.a(param3 + 1, false, param2, vu.field_M);
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 197: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var5), "uu.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 198: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -73 / ((param1 - -45) / 47);
            stackIn_1_0 = co.a(0, param0.length, -112, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("uu.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2) {
        kl.field_a.b(param0, param2, (byte) 93);
        if (param1 >= -22) {
            field_c = (String) null;
        }
    }

    final static boolean a(boolean param0, char param1) {
        byte[] var3;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (byte[]) null;
            uu.a((byte[]) null, (byte) -92);
            break L0;
          }
        }
        L1: {
          if (param1 < 32) {
            break L1;
          } else {
            if (param1 > 126) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (160 > param1) {
            break L2;
          } else {
            if (param1 > 255) {
              break L2;
            } else {
              return true;
            }
          }
        }
        L3: {
          if (8364 == param1) {
            break L3;
          } else {
            if (338 == param1) {
              break L3;
            } else {
              if (param1 == 8212) {
                break L3;
              } else {
                if (param1 == 339) {
                  break L3;
                } else {
                  if (376 != param1) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
        }
        return true;
    }

    public static void a(byte param0) {
        int var1 = -123 % ((param0 - -58) / 51);
        field_c = null;
        field_a = null;
    }

    static {
        field_a = "Rated game";
        field_c = "Offer draw";
        field_b = false;
    }
}
