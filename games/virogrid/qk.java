/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String[] field_d;
    static int field_b;
    private wb field_c;
    private wb field_a;

    final wb d(int param0) {
        wb var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_9_0 = null;
        wb stackIn_11_0 = null;
        Object stackOut_8_0 = null;
        wb stackOut_10_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((qk) this).field_a = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = ((qk) this).field_c.field_h;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((qk) this).field_c == var2) {
                            statePc = 8;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((qk) this).field_a = null;
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (wb) (Object) stackIn_9_0;
                }
                case 10: {
                    try {
                        ((qk) this).field_a = var2.field_h;
                        stackOut_10_0 = (wb) var2;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw kg.a((Throwable) (Object) var2_ref, "qk.C(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        km var5_ref = null;
        km var6 = null;
        km var7 = null;
        km var8 = null;
        String var9_ref = null;
        int var9 = 0;
        String var10_ref = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        p var17 = null;
        int var17_int = 0;
        lk var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_19_0 = false;
        km stackIn_27_0 = null;
        km stackIn_28_0 = null;
        long stackIn_28_1 = 0L;
        km stackIn_29_0 = null;
        km stackIn_31_0 = null;
        km stackIn_33_0 = null;
        km stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_101_0 = 0;
        Object stackIn_111_0 = null;
        Object stackIn_115_0 = null;
        Object stackIn_119_0 = null;
        Object stackIn_128_0 = null;
        Object stackIn_129_0 = null;
        boolean[][] stackIn_129_1 = null;
        boolean[][] stackIn_133_0 = null;
        int[][] stackIn_142_0 = null;
        int[][] stackIn_156_0 = null;
        boolean stackIn_180_0 = false;
        int stackIn_214_0 = 0;
        boolean[] stackIn_216_0 = null;
        boolean stackIn_244_0 = false;
        int stackIn_252_0 = 0;
        km stackIn_271_0 = null;
        km stackIn_272_0 = null;
        boolean stackIn_272_1 = false;
        km stackIn_273_0 = null;
        km stackIn_275_0 = null;
        km stackIn_276_0 = null;
        boolean stackIn_276_1 = false;
        km stackIn_277_0 = null;
        km stackIn_279_0 = null;
        km stackIn_281_0 = null;
        km stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        km stackIn_285_0 = null;
        km stackIn_286_0 = null;
        boolean stackIn_286_1 = false;
        km stackIn_287_0 = null;
        km stackIn_289_0 = null;
        km stackIn_290_0 = null;
        boolean stackIn_290_1 = false;
        km stackIn_291_0 = null;
        km stackIn_293_0 = null;
        km stackIn_295_0 = null;
        km stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        km stackIn_297_0 = null;
        km stackIn_298_0 = null;
        boolean stackIn_298_1 = false;
        km stackIn_299_0 = null;
        km stackIn_301_0 = null;
        km stackIn_302_0 = null;
        boolean stackIn_302_1 = false;
        km stackIn_303_0 = null;
        km stackIn_305_0 = null;
        km stackIn_307_0 = null;
        km stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        Object stackIn_309_0 = null;
        Throwable caughtException = null;
        boolean stackOut_18_0 = false;
        km stackOut_26_0 = null;
        km stackOut_27_0 = null;
        long stackOut_27_1 = 0L;
        km stackOut_28_0 = null;
        km stackOut_29_0 = null;
        km stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        km stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_100_0 = 0;
        Object stackOut_110_0 = null;
        Object stackOut_114_0 = null;
        Object stackOut_118_0 = null;
        Object stackOut_127_0 = null;
        Object stackOut_128_0 = null;
        boolean[][] stackOut_128_1 = null;
        boolean[][] stackOut_132_0 = null;
        int[][] stackOut_141_0 = null;
        int[][] stackOut_155_0 = null;
        boolean stackOut_179_0 = false;
        int stackOut_213_0 = 0;
        boolean[] stackOut_215_0 = null;
        boolean stackOut_243_0 = false;
        int stackOut_251_0 = 0;
        km stackOut_270_0 = null;
        km stackOut_271_0 = null;
        boolean stackOut_271_1 = false;
        km stackOut_272_0 = null;
        km stackOut_273_0 = null;
        km stackOut_275_0 = null;
        boolean stackOut_275_1 = false;
        km stackOut_276_0 = null;
        km stackOut_277_0 = null;
        km stackOut_279_0 = null;
        int stackOut_279_1 = 0;
        km stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        km stackOut_284_0 = null;
        km stackOut_285_0 = null;
        boolean stackOut_285_1 = false;
        km stackOut_286_0 = null;
        km stackOut_287_0 = null;
        km stackOut_289_0 = null;
        boolean stackOut_289_1 = false;
        km stackOut_290_0 = null;
        km stackOut_291_0 = null;
        km stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        km stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        km stackOut_296_0 = null;
        km stackOut_297_0 = null;
        boolean stackOut_297_1 = false;
        km stackOut_298_0 = null;
        km stackOut_299_0 = null;
        km stackOut_301_0 = null;
        boolean stackOut_301_1 = false;
        km stackOut_302_0 = null;
        km stackOut_303_0 = null;
        km stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        km stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        Object stackOut_308_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    rf.a(th.field_z, -4);
                    if (wl.field_d == null) {
                        statePc = 270;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fb.field_o.field_Y = true;
                    var5_ref = ed.field_c;
                    ed.field_c.field_ub = 0;
                    var5_ref.field_K = 0;
                    var6 = ii.field_d;
                    ii.field_d.field_ub = 0;
                    var6.field_K = 0;
                    jk.field_b.field_ub = 0;
                    var7 = jk.field_b;
                    var7.field_K = 0;
                    if (!k.b(1000)) {
                        statePc = 261;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    qi.field_e.field_V = ri.field_e.toUpperCase();
                    var9 = (2 + dm.field_r.field_K) / 2;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    ed.field_c.a(0, 40, var9 - 2, (byte) -68, dm.field_r.field_ub + -40);
                    if ((wl.field_d.field_ic ^ -1) > (wl.field_d.field_vc ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ed.field_c.field_V = oc.field_h.toUpperCase();
                    ed.field_c.field_Y = false;
                    if (var19 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ed.field_c.field_V = lc.field_h.toUpperCase();
                    ed.field_c.field_Y = true;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    ed.field_c.field_vb = bd.field_b.field_vb;
                    if (0 >= ea.field_a) {
                        statePc = 26;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (1 == ea.field_a) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10_ref = oi.a(new String[1], l.field_e, 2);
                    if (var19 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10_ref = w.field_M;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((rl.field_y & 16) != 0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = ad.field_h;
                    stackIn_19_0 = stackOut_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ed.field_c.field_vb = bd.field_b.field_x;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    ed.field_c.field_V = ed.field_c.field_V + "<br>" + var10_ref;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    ii.field_d.a(var9, 40, dm.field_r.field_K + -var9, (byte) -97, dm.field_r.field_ub + -40);
                    ii.field_d.field_V = te.field_c.toUpperCase();
                    stackOut_26_0 = ii.field_d;
                    stackIn_33_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (!param4) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (km) (Object) stackIn_27_0;
                    stackOut_27_1 = -1L;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (km) (Object) stackIn_28_0;
                    stackIn_33_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (stackIn_28_1 != (d.field_Eb ^ -1L)) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (km) (Object) stackIn_29_0;
                    stackIn_31_0 = stackOut_29_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (km) (Object) stackIn_31_0;
                    stackOut_31_1 = 1;
                    stackIn_34_0 = stackOut_31_0;
                    stackIn_34_1 = stackOut_31_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = (km) (Object) stackIn_33_0;
                    stackOut_33_1 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_34_0.field_Y = stackIn_34_1 != 0;
                    var8 = ii.field_d;
                    var10 = 2;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (null != nb.field_q) {
                        statePc = 38;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (ub.field_D == null) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    hk.field_Lb = new boolean[vb.field_h];
                    ub.field_D = new byte[vb.field_h];
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var11_int = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var11_int >= vb.field_h) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    hk.field_Lb[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var19 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var10 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var10 >= 2) {
                        statePc = 100;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11_int = 0;
                    stackOut_50_0 = 0;
                    stackIn_101_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (var19 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var12 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = nb.field_q.length;
                    stackOut_52_1 = var12;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 <= stackIn_53_1) {
                        statePc = 92;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var13_array = nb.field_q[var12];
                    stackOut_54_0 = 0;
                    stackIn_93_0 = stackOut_54_0;
                    stackIn_55_0 = stackOut_54_0;
                    if (var19 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var14_int = stackIn_55_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var14_int >= var13_array.length) {
                        statePc = 82;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var15 = var13_array[var14_int];
                    var16 = var13_array[var14_int - -1];
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = 0;
                    stackOut_58_1 = var15 ^ -1;
                    stackIn_84_0 = stackOut_58_0;
                    stackIn_84_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (var19 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 == stackIn_59_1) {
                        statePc = 68;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((255 & wl.field_d.field_Pb[var15] ^ -1) == (var16 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var19 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (0 != var10) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = wl.field_d.field_vc;
                    stackIn_74_0 = stackOut_71_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = wl.field_d.field_ic;
                    stackIn_74_0 = stackOut_73_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var17_int = stackIn_74_0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if ((var17_int ^ -1) == (var16 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var19 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = var13_array.length ^ -1;
                    stackOut_83_1 = var15 ^ -1;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 >= stackIn_84_1) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var16 = var13_array[var15];
                    stackOut_85_0 = var14_int;
                    stackOut_85_1 = var16;
                    stackIn_53_0 = stackOut_85_0;
                    stackIn_53_1 = stackOut_85_1;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    if (var19 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 < stackIn_86_1) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var14_int = var16;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    hk.field_Lb[var14_int] = true;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = var11_int;
                    stackIn_93_0 = stackOut_92_0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (stackIn_93_0 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var19 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = hd.field_d ^ -1;
                    stackIn_101_0 = stackOut_100_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 > -3) {
                        statePc = 106;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (!dc.field_Y[12]) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var10 = 2;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (2 > var10) {
                        statePc = 236;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (rf.field_i != null) {
                        statePc = 124;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackOut_110_0 = null;
                    stackIn_111_0 = stackOut_110_0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (stackIn_111_0 != (Object) (Object) gg.field_E) {
                        statePc = 124;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackOut_114_0 = null;
                    stackIn_115_0 = stackOut_114_0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if (stackIn_115_0 != (Object) (Object) wm.field_B) {
                        statePc = 124;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackOut_118_0 = null;
                    stackIn_119_0 = stackOut_118_0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 != (Object) (Object) mb.field_db) {
                        statePc = 124;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if ((vb.field_h ^ -1) >= (var16 ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var17_int = wl.field_d.field_Pb[var16] & 255;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = null;
                    stackIn_309_0 = stackOut_127_0;
                    stackIn_128_0 = stackOut_127_0;
                    if (var19 != 0) {
                        statePc = 309;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = stackIn_128_0;
                    stackOut_128_1 = rf.field_i;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 == (Object) (Object) stackIn_129_1) {
                        statePc = 140;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackOut_132_0 = rf.field_i;
                    stackIn_133_0 = stackOut_132_0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0[var16] != null) {
                        statePc = 138;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (!rf.field_i[var16][var17_int]) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var11_int = 1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (gg.field_E == null) {
                        statePc = 154;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackOut_141_0 = gg.field_E;
                    stackIn_142_0 = stackOut_141_0;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0[var16] != null) {
                        statePc = 147;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var18_int = gg.field_E[var16][var17_int];
                    if (var13_int >= var18_int) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var13_int = var18_int;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (gi.field_a) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var11_int = 1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (mb.field_db == null) {
                        statePc = 162;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = mb.field_db;
                    stackIn_156_0 = stackOut_155_0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (stackIn_156_0[var16] != null) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var15 = var15 | mb.field_db[var16][var17_int];
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (wm.field_B == null) {
                        statePc = 176;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (null == wm.field_B[var16]) {
                        statePc = 176;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var18_int = wm.field_B[var16][var17_int];
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if ((var18_int ^ -1) == -1) {
                        statePc = 172;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (gi.field_a) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var11_int = 1;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if ((var18_int ^ -1) < (var14_int ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var14_int = var18_int;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var16 = 0;
                    var17 = wm.field_r.field_Jb.field_W;
                    var18 = (lk) (Object) var17.a((byte) -72);
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (var18 == null) {
                        statePc = 213;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    stackOut_179_0 = var18.g(0);
                    stackIn_214_0 = stackOut_179_0 ? 1 : 0;
                    stackIn_180_0 = stackOut_179_0;
                    if (var19 != 0) {
                        statePc = 214;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (stackIn_180_0) {
                        statePc = 212;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var11_int == 0) {
                        statePc = 191;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (var18.field_Jb) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var16 = 1;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (var19 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var13_int <= var18.field_Vb) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var16 = 1;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (var19 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if ((var18.field_Rb ^ -1) <= (var14_int ^ -1)) {
                        statePc = 201;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var16 = 1;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (var19 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (0 < ((var18.field_Fb ^ -1) & var15)) {
                        statePc = 206;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var16 = 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (var19 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var12 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var18 = (lk) (Object) var17.a(16213);
                    if (var19 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    stackOut_213_0 = -3;
                    stackIn_214_0 = stackOut_213_0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (stackIn_214_0 < (hd.field_d ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    stackOut_215_0 = dc.field_Y;
                    stackIn_216_0 = stackOut_215_0;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (stackIn_216_0[12]) {
                        statePc = 221;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var16 = 0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (var16 != 0) {
                        statePc = 225;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 225: {
                    ii.field_d.field_Y = false;
                    if (!ii.field_d.field_G) {
                        statePc = 235;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (0 == he.field_pc.field_c.field_Hb) {
                        statePc = 232;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    wc.field_g = oi.a(new String[1], oe.field_a, 2);
                    if (var19 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    wc.field_g = am.field_a;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (var19 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    ii.field_d.field_Y = false;
                    if (ii.field_d.field_G) {
                        statePc = 241;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if ((vb.field_h ^ -1) >= (var13_int ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    stackOut_243_0 = hk.field_Lb[var13_int];
                    stackIn_252_0 = stackOut_243_0 ? 1 : 0;
                    stackIn_244_0 = stackOut_243_0;
                    if (var19 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (!stackIn_244_0) {
                        statePc = 250;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var14 = "<col=A00000>" + bd.field_a[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var11 = var11 + ", " + var14;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var11 = var14;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 242;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackOut_251_0 = 0;
                    stackIn_252_0 = stackOut_251_0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (stackIn_252_0 != var10) {
                        statePc = 256;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var13 = lj.field_k;
                    if (var12 != 0) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var14 = oi.a(new String[1], dk.field_r, 2);
                    if (var19 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var14 = hd.field_c + var11;
                    statePc = 259;
                    continue stateLoop;
                }
                case 256: {
                    var13 = qa.field_a;
                    if (var12 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var14 = s.field_c + var11;
                    if (var19 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var14 = oi.a(new String[1], pm.field_i, 2);
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    wc.field_g = "<col=A00000>" + var13 + "<br>" + var14;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (var19 == 0) {
                        statePc = 262;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var9_ref = wl.field_d.field_Qb;
                    qi.field_e.field_V = oi.a(new String[1], ra.field_c, 2).toUpperCase();
                    jk.field_b.a(0, 40, dm.field_r.field_K, (byte) -97, dm.field_r.field_ub + -40);
                    jk.field_b.field_V = oi.a(new String[1], fm.field_c, 2);
                    var8 = jk.field_b;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if ((d.field_Eb ^ -1L) == -1L) {
                        statePc = 269;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var9 = (int)(-hc.a(-9986) + d.field_Eb);
                    var9 = (999 + var9) / 1000;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (-2 < (var9 ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var9 = 1;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    var8.field_V = oi.a(new String[1], va.field_a, 2);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    qh.field_R.field_V = oi.a(new String[2], gb.field_M, 2);
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    stackOut_270_0 = ao.field_Eb;
                    stackIn_281_0 = stackOut_270_0;
                    stackIn_271_0 = stackOut_270_0;
                    if (!param3) {
                        statePc = 281;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    stackOut_271_0 = (km) (Object) stackIn_271_0;
                    stackOut_271_1 = param0;
                    stackIn_272_0 = stackOut_271_0;
                    stackIn_272_1 = stackOut_271_1;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackOut_272_0 = (km) (Object) stackIn_272_0;
                    stackIn_281_0 = stackOut_272_0;
                    stackIn_273_0 = stackOut_272_0;
                    if (stackIn_272_1) {
                        statePc = 281;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = (km) (Object) stackIn_273_0;
                    stackIn_275_0 = stackOut_273_0;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = (km) (Object) stackIn_275_0;
                    stackOut_275_1 = ad.field_h;
                    stackIn_276_0 = stackOut_275_0;
                    stackIn_276_1 = stackOut_275_1;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    stackOut_276_0 = (km) (Object) stackIn_276_0;
                    stackIn_281_0 = stackOut_276_0;
                    stackIn_277_0 = stackOut_276_0;
                    if (stackIn_276_1) {
                        statePc = 281;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    stackOut_277_0 = (km) (Object) stackIn_277_0;
                    stackIn_279_0 = stackOut_277_0;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    stackOut_279_0 = (km) (Object) stackIn_279_0;
                    stackOut_279_1 = 1;
                    stackIn_282_0 = stackOut_279_0;
                    stackIn_282_1 = stackOut_279_1;
                    statePc = 282;
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (km) (Object) stackIn_281_0;
                    stackOut_281_1 = 0;
                    stackIn_282_0 = stackOut_281_0;
                    stackIn_282_1 = stackOut_281_1;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    ((km) (Object) stackIn_282_0).a(stackIn_282_1 != 0, (byte) 94);
                    if (param2 >= 1) {
                        statePc = 284;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    return;
                }
                case 284: {
                    stackOut_284_0 = dm.field_r;
                    stackIn_295_0 = stackOut_284_0;
                    stackIn_285_0 = stackOut_284_0;
                    if (!param3) {
                        statePc = 295;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (km) (Object) stackIn_285_0;
                    stackOut_285_1 = param0;
                    stackIn_286_0 = stackOut_285_0;
                    stackIn_286_1 = stackOut_285_1;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = (km) (Object) stackIn_286_0;
                    stackIn_295_0 = stackOut_286_0;
                    stackIn_287_0 = stackOut_286_0;
                    if (stackIn_286_1) {
                        statePc = 295;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (km) (Object) stackIn_287_0;
                    stackIn_289_0 = stackOut_287_0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (km) (Object) stackIn_289_0;
                    stackOut_289_1 = ad.field_h;
                    stackIn_290_0 = stackOut_289_0;
                    stackIn_290_1 = stackOut_289_1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = (km) (Object) stackIn_290_0;
                    stackIn_295_0 = stackOut_290_0;
                    stackIn_291_0 = stackOut_290_0;
                    if (stackIn_290_1) {
                        statePc = 295;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (km) (Object) stackIn_291_0;
                    stackIn_293_0 = stackOut_291_0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (km) (Object) stackIn_293_0;
                    stackOut_293_1 = 1;
                    stackIn_296_0 = stackOut_293_0;
                    stackIn_296_1 = stackOut_293_1;
                    statePc = 296;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (km) (Object) stackIn_295_0;
                    stackOut_295_1 = 0;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    ((km) (Object) stackIn_296_0).a(stackIn_296_1 != 0, (byte) 123);
                    stackOut_296_0 = pm.field_n;
                    stackIn_307_0 = stackOut_296_0;
                    stackIn_297_0 = stackOut_296_0;
                    if (!param3) {
                        statePc = 307;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (km) (Object) stackIn_297_0;
                    stackOut_297_1 = param0;
                    stackIn_298_0 = stackOut_297_0;
                    stackIn_298_1 = stackOut_297_1;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = (km) (Object) stackIn_298_0;
                    stackIn_307_0 = stackOut_298_0;
                    stackIn_299_0 = stackOut_298_0;
                    if (stackIn_298_1) {
                        statePc = 307;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (km) (Object) stackIn_299_0;
                    stackIn_301_0 = stackOut_299_0;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (km) (Object) stackIn_301_0;
                    stackOut_301_1 = ad.field_h;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    stackOut_302_0 = (km) (Object) stackIn_302_0;
                    stackIn_307_0 = stackOut_302_0;
                    stackIn_303_0 = stackOut_302_0;
                    if (!stackIn_302_1) {
                        statePc = 307;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackOut_303_0 = (km) (Object) stackIn_303_0;
                    stackIn_305_0 = stackOut_303_0;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = (km) (Object) stackIn_305_0;
                    stackOut_305_1 = 1;
                    stackIn_308_0 = stackOut_305_0;
                    stackIn_308_1 = stackOut_305_1;
                    statePc = 308;
                    continue stateLoop;
                }
                case 307: {
                    stackOut_307_0 = (km) (Object) stackIn_307_0;
                    stackOut_307_1 = 0;
                    stackIn_308_0 = stackOut_307_0;
                    stackIn_308_1 = stackOut_307_1;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    ((km) (Object) stackIn_308_0).a(stackIn_308_1 != 0, (byte) 122);
                    he.field_pc.field_c.g(0);
                    stackOut_308_0 = null;
                    stackIn_309_0 = stackOut_308_0;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if (stackIn_309_0 == (Object) (Object) wl.field_d) {
                        statePc = 331;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if ((fb.field_o.field_nb ^ -1) != -1) {
                        statePc = 315;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 315: {
                    nn.a(wl.field_d.e((byte) -124), param1, (byte) -128);
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if ((ii.field_d.field_nb ^ -1) == -1) {
                        statePc = 320;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    ah.field_c = true;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if ((ed.field_c.field_nb ^ -1) != -1) {
                        statePc = 323;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 323: {
                    ad.field_h = true;
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (0 == na.field_Ib.field_nb) {
                        statePc = 328;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    ad.field_h = false;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    co.a(param1, false, -2137400888, wl.field_d);
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(wb param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != param0.field_k) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0.c(78);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0.field_k = ((qk) this).field_c.field_k;
                        if (param1 >= 87) {
                            statePc = 8;
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
                        ((qk) this).a((wb) null, (byte) 78);
                        statePc = 6;
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0.field_h = ((qk) this).field_c;
                        param0.field_k.field_h = param0;
                        param0.field_h.field_k = param0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) var3;
                        stackOut_11_1 = new StringBuilder().append("qk.B(");
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param0 == null) {
                            statePc = 14;
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
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 2) {
                break L0;
              } else {
                field_b = -102;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_d = null;
        }
    }

    final static void b(byte param0) {
        if (param0 != 59) {
            return;
        }
        try {
            if (null != cf.field_b) {
                String var1 = cf.field_b;
                on.a((byte) 106, oi.a(new String[1], sa.field_o, 2));
                cf.field_b = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qk.I(" + param0 + 41);
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wb var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0;
                        var3 = ((qk) this).field_c.field_h;
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
                        if (((qk) this).field_c == var3) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = var3.field_h;
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 2;
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
                        stackOut_4_0 = var2_int;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw kg.a((Throwable) (Object) var2, "qk.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        mg var1 = null;
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = new mg(540, 140);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        kb.a(var1, 16865);
                        if (!param0) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qk.a(true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        fk.a();
                        df.c();
                        kf.field_e = 0;
                        cm.a(11);
                        var2 = var1.d();
                        var3 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 >= 15) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2.d(-2, -2, 16777215);
                        df.d(4, 4, 0, 0, 540, 140);
                        var3++;
                        if (var4 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        cc.field_u.b();
                        var1.e(0, 0);
                        ai.a(true);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw kg.a((Throwable) (Object) runtimeException, "qk.D(" + param0 + 41);
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final wb a(byte param0) {
        wb var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        wb stackIn_9_0 = null;
        Object stackOut_6_0 = null;
        wb stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = ((qk) this).field_c.field_h;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param0 == -103) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        qk.a((String) null, (java.applet.Applet) null, -78);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((qk) this).field_c != var2) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = null;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (wb) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        var2.c(26);
                        stackOut_8_0 = (wb) var2;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw kg.a((Throwable) (Object) var2_ref, "qk.J(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final wb a(int param0) {
        wb var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        wb stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        wb stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = ((qk) this).field_a;
                        if (((qk) this).field_c != var2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((qk) this).field_a = null;
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (wb) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        ((qk) this).field_a = var2.field_h;
                        if (param0 == 26605) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((qk) this).field_a = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (wb) var2;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw kg.a((Throwable) (Object) var2_ref, "qk.F(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            jj.field_g = param0;
            try {
                var3 = param1.getParameter("cookieprefix");
                var4 = param1.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                // if_icmpeq L72
                q.a("document.cookie=\"" + var5 + "\"", -17107, param1);
            } catch (Throwable throwable) {
            }
            wf.a(param1, 49);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public qk() {
        ((qk) this).field_c = new wb();
        try {
            ((qk) this).field_c.field_h = ((qk) this).field_c;
            ((qk) this).field_c.field_k = ((qk) this).field_c;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qk.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 64;
        field_d = new String[]{"The Easy One", "Perfect Jump", "Virogrid Expert", "Total domination", "Winning streak", "You lose", "Entrapment", "Bunny Hopping", "Virogrid Addict", "Ghost Spotter"};
    }
}
