/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static String field_a;
    static jp field_b;
    static mf field_c;

    final static mp a(boolean param0, int param1, int param2) {
        mm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        boolean stackIn_2_5 = false;
        mm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        boolean stackIn_4_5 = false;
        mm stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        boolean stackIn_5_5 = false;
        int stackIn_5_6 = 0;
        mp stackIn_12_0 = null;
        mh stackIn_31_0 = null;
        mh stackIn_33_0 = null;
        mh stackIn_34_0 = null;
        String stackIn_34_1 = null;
        mh stackIn_35_0 = null;
        mh stackIn_37_0 = null;
        mh stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_42_0 = 0;
        Object stackIn_101_0 = null;
        mp stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vl var4 = null;
        Object var5 = null;
        Object var6 = null;
        mp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        nn var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackIn_4_0 = gf.field_f.field_Qb;
                        stackIn_2_0 = stackIn_4_0;
                        stackIn_4_1 = 2;
                        stackIn_2_1 = stackIn_4_1;
                        stackIn_4_2 = param1 * (6 + 3 * np.field_a);
                        stackIn_2_2 = stackIn_4_2;
                        stackIn_4_3 = np.field_a + 2;
                        stackIn_2_3 = stackIn_4_3;
                        stackIn_4_4 = 22676;
                        stackIn_2_4 = stackIn_4_4;
                        stackIn_4_5 = param0;
                        stackIn_2_5 = stackIn_4_5;
                        if (gf.field_f.field_Qb != o.field_b) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = (mm) ((Object) stackIn_2_0);
                        stackIn_5_1 = stackIn_2_1;
                        stackIn_5_2 = stackIn_2_2;
                        stackIn_5_3 = stackIn_2_3;
                        stackIn_5_4 = stackIn_2_4;
                        stackIn_5_5 = stackIn_2_5;
                        stackIn_5_6 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (mm) ((Object) stackIn_4_0);
                        stackIn_5_1 = stackIn_4_1;
                        stackIn_5_2 = stackIn_4_2;
                        stackIn_5_3 = stackIn_4_3;
                        stackIn_5_4 = stackIn_4_4;
                        stackIn_5_5 = stackIn_4_5;
                        stackIn_5_6 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((mm) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6 != 0) ? 1 : 0;
                        if (param2 <= -12) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        wn.a((byte) 96);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = gf.field_f.field_Xb.field_bb;
                        var5 = null;
                        if (wk.field_m != 2) {
                            statePc = 93;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        rg.field_c.field_eb = true;
                        sj.field_d.field_Mb = rd.a(dq.field_c, new String[]{rk.field_Tb}, (byte) 103);
                        gf.field_f.field_Qb.field_Qb.field_Mb = null;
                        var6 = null;
                        var7 = (mp) ((Object) var4.d(-76));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7 == null) {
                            statePc = 84;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0;
                        stackOut_11_0 = (mp) (var7);
                        stackIn_101_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0.field_bb != null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7.field_Xb = new mh(0L, vb.field_K);
                        var7.a(var7.field_Xb, 0);
                        var7.field_Wb = new mh(0L, fp.field_v);
                        var7.a(var7.field_Wb, 0);
                        var7.field_Yb = new mh(0L, vb.field_K);
                        var7.a(var7.field_Yb, 0);
                        var7.field_Wb.field_S = 2;
                        var8 = 1;
                        var7.c(true);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7.field_Ib = gf.field_f.field_Xb.field_Ib;
                        var9 = 0;
                        if (var7.field_Ub != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7.field_Ub == rk.field_Tb) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = 0;
                        if (null == var7.field_Qb) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var7.field_Qb.equals("")) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7.field_Yb.field_wb = ok.field_g;
                        var7.field_Yb.field_Y = var11;
                        var7.field_Yb.a(np.field_a, var9, 0, 3 + ok.field_g.field_x, (byte) 64);
                        var12 = 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var7.field_Wb.field_Fb = var11;
                        var7.field_Xb.field_Fb = var11;
                        var7.field_Wb.field_vb = var11;
                        var7.field_Xb.field_vb = var11;
                        var7.field_Wb.field_Y = var11;
                        var7.field_Xb.field_Y = var11;
                        var7.field_Wb.field_X = var10;
                        var7.field_Xb.field_X = var10;
                        var13 = 0;
                        var14 = -80 + (var7.field_Ib + -2);
                        if (var12 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var13 = 3 + ok.field_g.field_x;
                        var14 = var14 - var13;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_33_0 = var7.field_Xb;
                        stackIn_31_0 = stackIn_33_0;
                        if (-1 > (var14 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_34_0 = (mh) ((Object) stackIn_31_0);
                        stackIn_34_1 = var7.field_Rb;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = (mh) ((Object) stackIn_33_0);
                        stackIn_34_1 = dh.a(var7.field_Xb.field_O, var7.field_Rb, var14);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_34_0.field_Mb = stackIn_34_1;
                        var7.field_Xb.a(np.field_a, var9, var13, var14, (byte) 64);
                        stackIn_37_0 = var7.field_Wb;
                        stackIn_35_0 = stackIn_37_0;
                        if (var7.field_Ub != null) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_38_0 = (mh) ((Object) stackIn_35_0);
                        stackIn_38_1 = ec.field_S;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = (mh) ((Object) stackIn_37_0);
                        stackIn_38_1 = var7.field_Ub;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_38_0.field_Mb = stackIn_38_1;
                        var7.field_Wb.a(np.field_a, var9, -80 + var7.field_Ib, 80, (byte) 64);
                        if (var7.field_Xb.field_Mb.equals(var7.field_Rb)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_42_0 = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var15 = stackIn_42_0;
                        var9 = var9 + np.field_a;
                        if (var3_int == 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7.field_C = var9 + -var7.field_cb;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var8 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        gf.field_f.field_Xb.a((mh) (var6), 2, var7, 17290);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6 = var7;
                        if (null == var7.field_Yb) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!var7.field_Yb.field_kb) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ep.field_e = var7.field_Qb;
                        if (var19 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (0 != var7.field_L) {
                            statePc = 68;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!var7.field_Xb.field_kb) {
                            statePc = 83;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var15 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ep.field_e = var7.field_Rb;
                        if (var19 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var16 = var7.field_Rb;
                        mn.a(-1, var7, gf.field_f.field_Qb, (int[]) null, var16, -1, (byte) -58, 0L, (String) null);
                        if (null == var7.field_Ub) {
                            statePc = 82;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (m.a(13134, bm.field_d.field_e)) {
                            statePc = 82;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (um.field_e) {
                            statePc = 82;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!qo.field_I) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var17 = bm.field_d;
                        var18 = rd.a(v.field_c, new String[]{var16}, (byte) 103);
                        var17.field_d.a(var18, 8, (byte) 84);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var17 = bm.field_d;
                        var18 = rd.a(qm.field_b, new String[]{var16}, (byte) 103);
                        var17.field_d.a(var18, 18, (byte) 97);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var5 = var7;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7 = (mp) ((Object) var4.a((byte) 116));
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-1 != (gf.field_f.field_Tb.field_L ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        tn.field_m = new gq(gf.field_f.field_Tb.field_Eb, gf.field_f.field_Tb.field_db, gf.field_f.field_Tb.field_Ib, gf.field_f.field_Tb.field_cb, a.field_t, ij.field_c, ad.field_l, ad.field_l);
                        ij.field_d = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (0 != gf.field_f.field_Wb.field_L) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        tn.field_m = new gq(gf.field_f.field_Wb.field_Eb, gf.field_f.field_Wb.field_db, gf.field_f.field_Wb.field_Ib, gf.field_f.field_Wb.field_cb, eg.field_j, ij.field_c, ad.field_l, ad.field_l);
                        ij.field_d = 1;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        sj.field_d.field_Mb = kd.field_a;
                        rg.field_c.field_eb = false;
                        if (wk.field_m != 1) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        gf.field_f.field_Qb.field_Qb.field_Mb = cd.field_f;
                        if (var19 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        gf.field_f.field_Qb.field_Qb.field_Mb = cm.field_t;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        jh.a(true, gf.field_f.field_Xb);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_101_0 = var5;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    return (mp) ((Object) stackIn_101_0);
                }
                case 102: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw qb.a((Throwable) ((Object) var3), "wn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1 = gp.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  if (param0 == -97) {
                    break L2;
                  } else {
                    wn.a(-86, (byte) 78);
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    L5: {
                      si.field_m = fm.field_d;
                      ge.field_w = ge.field_w + 1;
                      if (pl.field_d >= 0) {
                        break L5;
                      } else {
                        var2 = 0;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (112 <= var2) {
                                break L8;
                              } else {
                                pe.field_l[var2] = false;
                                var2++;
                                if (var4 != 0) {
                                  break L7;
                                } else {
                                  if (var4 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            pl.field_d = ek.field_cb;
                            break L7;
                          }
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L9: while (true) {
                      if ((pl.field_d ^ -1) == (ek.field_cb ^ -1)) {
                        break L4;
                      } else {
                        var2 = lo.field_b[ek.field_cb];
                        ek.field_cb = ek.field_cb - -1 & 127;
                        stackIn_27_0 = var2;

                        if (var4 != 0) {
                          break L3;
                        } else {
                          L10: {
                            L11: {
                              if (stackIn_27_0 >= 0) {
                                break L11;
                              } else {
                                pe.field_l[var2 ^ -1] = false;
                                if (var4 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            pe.field_l[var2] = true;
                            break L10;
                          }
                          if (var4 == 0) {
                            continue L9;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackIn_27_0 = hb.field_w;
                  break L3;
                }
                fm.field_d = stackIn_27_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "wn.E(" + param0 + ')');
        }
    }

    final static void a(mf param0, mf param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              fe.field_jb = param1;
              if (param2 == 0) {
                break L1;
              } else {
                wn.a(79, -114);
                break L1;
              }
            }
            jg.field_d = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("wn.G(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_b = null;
            int var1_int = 98 / ((param0 - 73) / 36);
            field_c = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "wn.F(" + param0 + ')');
        }
    }

    final static hl a(int param0, mf param1, mf param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        hl stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!ln.a(-123, param3, param2, param0)) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 126 / ((param4 - -35) / 45);
              stackIn_6_0 = rm.a(12658477, param1.a(param3, param0, 4));
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("wn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hl) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static boolean a(int param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -6) {
              L1: {
                if ((-param0 & param0) != param0) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "wn.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              md.field_r = param1 >> -505023868 & 3;
              md.field_v = (param1 & 12) >> -2041849438;
              if ((md.field_r ^ -1) < -3) {
                md.field_r = 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (md.field_v <= param0) {
                break L2;
              } else {
                md.field_v = 2;
                break L2;
              }
            }
            L3: {
              to.field_a = 3 & param1;
              if ((to.field_a ^ -1) >= -3) {
                break L3;
              } else {
                to.field_a = 2;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "wn.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -98) {
                break L1;
              } else {
                field_b = (jp) null;
                break L1;
              }
            }
            stackIn_4_0 = (int)(1000000000L / hb.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "wn.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
    }
}
