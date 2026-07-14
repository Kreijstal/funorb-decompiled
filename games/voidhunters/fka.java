/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fka extends ksa {
    int field_e;
    ml field_d;
    ml field_f;

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 <= -51) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        fka.a(96, (byte) 89, false, true, true);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("fka.B(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
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
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        llb var5_ref = null;
        llb var6 = null;
        llb var7 = null;
        llb var8 = null;
        int var9 = 0;
        String var9_ref = null;
        String var10_ref = null;
        int var10 = 0;
        int var11 = 0;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref = null;
        int var15 = 0;
        int var16 = 0;
        ij var17 = null;
        int var17_int = 0;
        jk var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_22_0 = false;
        llb stackIn_30_0 = null;
        llb stackIn_31_0 = null;
        long stackIn_31_1 = 0L;
        llb stackIn_32_0 = null;
        llb stackIn_34_0 = null;
        llb stackIn_36_0 = null;
        llb stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_97_0 = 0;
        boolean[] stackIn_99_0 = null;
        boolean stackIn_114_0 = false;
        int stackIn_122_0 = 0;
        Object stackIn_134_0 = null;
        Object stackIn_138_0 = null;
        Object stackIn_142_0 = null;
        Object stackIn_151_0 = null;
        Object stackIn_152_0 = null;
        boolean[][] stackIn_152_1 = null;
        Object stackIn_156_0 = null;
        boolean stackIn_176_0 = false;
        int[][] stackIn_184_0 = null;
        boolean stackIn_208_0 = false;
        jk stackIn_218_0 = null;
        int stackIn_250_0 = 0;
        boolean[] stackIn_252_0 = null;
        llb stackIn_281_0 = null;
        llb stackIn_282_0 = null;
        boolean stackIn_282_1 = false;
        llb stackIn_283_0 = null;
        llb stackIn_285_0 = null;
        llb stackIn_286_0 = null;
        boolean stackIn_286_1 = false;
        llb stackIn_287_0 = null;
        llb stackIn_289_0 = null;
        llb stackIn_291_0 = null;
        llb stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        llb stackIn_293_0 = null;
        llb stackIn_294_0 = null;
        boolean stackIn_294_1 = false;
        llb stackIn_295_0 = null;
        llb stackIn_297_0 = null;
        llb stackIn_298_0 = null;
        boolean stackIn_298_1 = false;
        llb stackIn_299_0 = null;
        llb stackIn_301_0 = null;
        llb stackIn_303_0 = null;
        llb stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        llb stackIn_305_0 = null;
        llb stackIn_306_0 = null;
        boolean stackIn_306_1 = false;
        llb stackIn_307_0 = null;
        llb stackIn_309_0 = null;
        llb stackIn_310_0 = null;
        boolean stackIn_310_1 = false;
        llb stackIn_311_0 = null;
        llb stackIn_313_0 = null;
        llb stackIn_315_0 = null;
        llb stackIn_316_0 = null;
        int stackIn_316_1 = 0;
        Object stackIn_317_0 = null;
        Throwable caughtException = null;
        boolean stackOut_21_0 = false;
        llb stackOut_29_0 = null;
        llb stackOut_30_0 = null;
        long stackOut_30_1 = 0L;
        llb stackOut_31_0 = null;
        llb stackOut_32_0 = null;
        llb stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        llb stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_96_0 = 0;
        boolean[] stackOut_98_0 = null;
        boolean stackOut_113_0 = false;
        int stackOut_121_0 = 0;
        Object stackOut_133_0 = null;
        Object stackOut_137_0 = null;
        Object stackOut_141_0 = null;
        Object stackOut_150_0 = null;
        Object stackOut_151_0 = null;
        boolean[][] stackOut_151_1 = null;
        Object stackOut_155_0 = null;
        boolean stackOut_175_0 = false;
        int[][] stackOut_183_0 = null;
        boolean stackOut_207_0 = false;
        jk stackOut_217_0 = null;
        int stackOut_249_0 = 0;
        boolean[] stackOut_251_0 = null;
        llb stackOut_280_0 = null;
        llb stackOut_281_0 = null;
        boolean stackOut_281_1 = false;
        llb stackOut_282_0 = null;
        llb stackOut_283_0 = null;
        llb stackOut_285_0 = null;
        boolean stackOut_285_1 = false;
        llb stackOut_286_0 = null;
        llb stackOut_287_0 = null;
        llb stackOut_289_0 = null;
        int stackOut_289_1 = 0;
        llb stackOut_291_0 = null;
        int stackOut_291_1 = 0;
        llb stackOut_292_0 = null;
        llb stackOut_293_0 = null;
        boolean stackOut_293_1 = false;
        llb stackOut_294_0 = null;
        llb stackOut_295_0 = null;
        llb stackOut_297_0 = null;
        boolean stackOut_297_1 = false;
        llb stackOut_298_0 = null;
        llb stackOut_299_0 = null;
        llb stackOut_301_0 = null;
        int stackOut_301_1 = 0;
        llb stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        llb stackOut_304_0 = null;
        llb stackOut_305_0 = null;
        boolean stackOut_305_1 = false;
        llb stackOut_306_0 = null;
        llb stackOut_307_0 = null;
        llb stackOut_309_0 = null;
        boolean stackOut_309_1 = false;
        llb stackOut_310_0 = null;
        llb stackOut_311_0 = null;
        llb stackOut_313_0 = null;
        int stackOut_313_1 = 0;
        llb stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        Object stackOut_316_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    lkb.a(tba.field_p, (byte) -128);
                    if (lqa.field_o != null) {
                        statePc = 4;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 4: {
                    nt.field_q.field_y = true;
                    vw.field_a.field_G = 0;
                    var5_ref = vw.field_a;
                    var5_ref.field_hb = 0;
                    var6 = qsa.field_b;
                    qsa.field_b.field_G = 0;
                    var6.field_hb = 0;
                    qi.field_p.field_G = 0;
                    var7 = qi.field_p;
                    var7.field_hb = 0;
                    if (nmb.b(119)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var9_ref = lqa.field_o.field_Vb;
                    rob.field_q.field_R = isa.a(wt.field_b, new String[1], 118).toUpperCase();
                    qi.field_p.a(0, -127, vva.field_r.field_hb, -40 + vva.field_r.field_G, 40);
                    qi.field_p.field_R = isa.a(ub.field_h, new String[1], 79);
                    var8 = qi.field_p;
                    if (var19 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    rob.field_q.field_R = fmb.field_p.toUpperCase();
                    var9 = (2 + vva.field_r.field_hb) / 2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    vw.field_a.a(0, 116, -2 + var9, vva.field_r.field_G - 40, 40);
                    if ((lqa.field_o.field_Fb ^ -1) >= (lqa.field_o.field_zb ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    vw.field_a.field_R = ko.field_d.toUpperCase();
                    vw.field_a.field_y = true;
                    if (var19 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    vw.field_a.field_R = ukb.field_q.toUpperCase();
                    vw.field_a.field_y = false;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    vw.field_a.field_gb = qcb.field_p.field_gb;
                    if (0 >= qea.field_p) {
                        statePc = 29;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (qea.field_p != 1) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10_ref = rja.field_o;
                    if (var19 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10_ref = isa.a(nha.field_p, new String[1], 99);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-1 != (16 & ls.field_o ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = wo.field_o;
                    stackIn_22_0 = stackOut_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (!stackIn_22_0) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    vw.field_a.field_gb = qcb.field_p.field_mb;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    vw.field_a.field_R = vw.field_a.field_R + "<br>" + var10_ref;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    qsa.field_b.a(var9, 119, vva.field_r.field_hb - var9, vva.field_r.field_G - 40, 40);
                    qsa.field_b.field_R = pga.field_o.toUpperCase();
                    stackOut_29_0 = qsa.field_b;
                    stackIn_36_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (!param2) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (llb) (Object) stackIn_30_0;
                    stackOut_30_1 = qga.field_a;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (llb) (Object) stackIn_31_0;
                    stackIn_36_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (stackIn_31_1 != 0L) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = (llb) (Object) stackIn_32_0;
                    stackIn_34_0 = stackOut_32_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = (llb) (Object) stackIn_34_0;
                    stackOut_34_1 = 1;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = (llb) (Object) stackIn_36_0;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_37_0.field_y = stackIn_37_1 != 0;
                    var8 = qsa.field_b;
                    var10 = 2;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (ncb.field_a == null) {
                        statePc = 105;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (null == tib.field_i) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    tib.field_i = new byte[ocb.field_l];
                    mia.field_a = new boolean[ocb.field_l];
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var11 >= ocb.field_l) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    mia.field_a[var11] = false;
                    var11++;
                    if (var19 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var19 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (-3 >= (var10 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11 = 0;
                    stackOut_53_0 = 0;
                    stackIn_97_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (var19 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var12 = stackIn_54_0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = var12;
                    stackOut_55_1 = ncb.field_a.length;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 >= stackIn_56_1) {
                        statePc = 91;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var13_ref_int__ = ncb.field_a[var12];
                    stackOut_57_0 = 0;
                    stackIn_92_0 = stackOut_57_0;
                    stackIn_58_0 = stackOut_57_0;
                    if (var19 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var14 = stackIn_58_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var13_ref_int__.length ^ -1) >= (var14 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var15 = var13_ref_int__[var14];
                    var16 = var13_ref_int__[var14 + 1];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = -1;
                    stackOut_61_1 = var15;
                    stackIn_84_0 = stackOut_61_0;
                    stackIn_84_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (var19 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 != stackIn_62_1) {
                        statePc = 76;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((var10 ^ -1) == -1) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = lqa.field_o.field_zb;
                    stackIn_71_0 = stackOut_68_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = lqa.field_o.field_Fb;
                    stackIn_71_0 = stackOut_70_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var17_int = stackIn_71_0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if ((var17_int ^ -1) != (var16 ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var19 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if ((255 & lqa.field_o.field_Pb[var15] ^ -1) != (var16 ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var14 += 2;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11 = 1;
                    var14 = -1;
                    var15 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = var15;
                    stackOut_83_1 = var13_ref_int__.length;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 >= stackIn_84_1) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var16 = var13_ref_int__[var15];
                    stackOut_85_0 = var16;
                    stackOut_85_1 = var14;
                    stackIn_56_0 = stackOut_85_0;
                    stackIn_56_1 = stackOut_85_1;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 <= stackIn_86_1) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var14 = var16;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    mia.field_a[var14] = true;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = var11;
                    stackIn_92_0 = stackOut_91_0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = go.field_p ^ -1;
                    stackIn_97_0 = stackOut_96_0;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0 > -3) {
                        statePc = 105;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = si.field_o;
                    stackIn_99_0 = stackOut_98_0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (stackIn_99_0[12]) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var10 = 2;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (var10 >= 2) {
                        statePc = 130;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    qsa.field_b.field_y = false;
                    if (qsa.field_b.field_Q) {
                        statePc = 111;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var11_ref = null;
                    var12 = 0;
                    var13 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (ocb.field_l <= var13) {
                        statePc = 121;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = mia.field_a[var13];
                    stackIn_122_0 = stackOut_113_0 ? 1 : 0;
                    stackIn_114_0 = stackOut_113_0;
                    if (var19 != 0) {
                        statePc = 122;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (!stackIn_114_0) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var14_ref = "<col=A00000>" + hva.field_c[var13] + "</col>";
                    if (null == var11_ref) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var11_ref = var11_ref + ", " + var14_ref;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var11_ref = var14_ref;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var13++;
                    if (var19 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackOut_121_0 = var10;
                    stackIn_122_0 = stackOut_121_0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (stackIn_122_0 != 0) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var13_ref = dhb.field_o;
                    if (var12 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var14_ref = isa.a(cp.field_g, new String[1], 126);
                    if (var19 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var14_ref = nd.field_o + var11_ref;
                    statePc = 129;
                    continue stateLoop;
                }
                case 126: {
                    var13_ref = ef.field_A;
                    if (var12 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var14_ref = alb.field_a + var11_ref;
                    if (var19 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var14_ref = isa.a(jra.field_b, new String[1], 92);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    lob.field_a = "<col=A00000>" + var13_ref + "<br>" + var14_ref;
                    if (var19 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (null != qcb.field_o) {
                        statePc = 147;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = null;
                    stackIn_134_0 = stackOut_133_0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (stackIn_134_0 != (Object) (Object) crb.field_w) {
                        statePc = 147;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackOut_137_0 = null;
                    stackIn_138_0 = stackOut_137_0;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (stackIn_138_0 != (Object) (Object) tab.field_p) {
                        statePc = 147;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackOut_141_0 = null;
                    stackIn_142_0 = stackOut_141_0;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0 != (Object) (Object) hia.field_o) {
                        statePc = 147;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if ((ocb.field_l ^ -1) >= (var16 ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var17_int = 255 & lqa.field_o.field_Pb[var16];
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = null;
                    stackIn_317_0 = stackOut_150_0;
                    stackIn_151_0 = stackOut_150_0;
                    if (var19 != 0) {
                        statePc = 317;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = stackIn_151_0;
                    stackOut_151_1 = qcb.field_o;
                    stackIn_152_0 = stackOut_151_0;
                    stackIn_152_1 = stackOut_151_1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0 == (Object) (Object) stackIn_152_1) {
                        statePc = 165;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = null;
                    stackIn_156_0 = stackOut_155_0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (stackIn_156_0 == (Object) (Object) qcb.field_o[var16]) {
                        statePc = 165;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (qcb.field_o[var16][var17_int]) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var11 = 1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (crb.field_w == null) {
                        statePc = 182;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (crb.field_w[var16] == null) {
                        statePc = 182;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var18_int = crb.field_w[var16][var17_int];
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if ((var18_int ^ -1) < (var13 ^ -1)) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var13 = var18_int;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if ((var18_int ^ -1) == -1) {
                        statePc = 182;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackOut_175_0 = ufa.field_o;
                    stackIn_176_0 = stackOut_175_0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (!stackIn_176_0) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var11 = 1;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (tab.field_p == null) {
                        statePc = 199;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackOut_183_0 = tab.field_p;
                    stackIn_184_0 = stackOut_183_0;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (stackIn_184_0[var16] != null) {
                        statePc = 189;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var18_int = tab.field_p[var16][var17_int];
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if ((var14 ^ -1) > (var18_int ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var14 = var18_int;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 199;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (ufa.field_o) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var11 = 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (null == hia.field_o) {
                        statePc = 204;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (hia.field_o[var16] == null) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var15 = var15 | hia.field_o[var16][var17_int];
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var16 = 0;
                    var17 = rga.field_f.field_wb.field_lb;
                    var18 = (jk) (Object) var17.d(0);
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var18 == null) {
                        statePc = 249;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackOut_207_0 = var18.i(56);
                    stackIn_250_0 = stackOut_207_0 ? 1 : 0;
                    stackIn_208_0 = stackOut_207_0;
                    if (var19 != 0) {
                        statePc = 250;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (!stackIn_208_0) {
                        statePc = 214;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (var19 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (var11 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    stackOut_217_0 = (jk) var18;
                    stackIn_218_0 = stackOut_217_0;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    if (!stackIn_218_0.field_Lb) {
                        statePc = 223;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var16 = 1;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if ((var18.field_Gb ^ -1) > (var13 ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var16 = 1;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (var18.field_Bb >= var14) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var16 = 1;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (-1 > (var15 & (var18.field_Ab ^ -1) ^ -1)) {
                        statePc = 242;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var16 = 1;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (var12 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var18 = (jk) (Object) var17.a((byte) 98);
                    if (var19 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    stackOut_249_0 = go.field_p;
                    stackIn_250_0 = stackOut_249_0;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0 < 2) {
                        statePc = 258;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackOut_251_0 = si.field_o;
                    stackIn_252_0 = stackOut_251_0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    if (stackIn_252_0[12]) {
                        statePc = 257;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var16 = 0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (var16 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    qsa.field_b.field_y = false;
                    if (qsa.field_b.field_Q) {
                        statePc = 264;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (0 == hra.field_o.field_a.field_Ab) {
                        statePc = 268;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    lob.field_a = isa.a(hja.field_p, new String[1], 121);
                    if (var19 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    lob.field_a = kob.field_e;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    if (qga.field_a == 0L) {
                        statePc = 275;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var9 = (int)(-wt.a(false) + qga.field_a);
                    var9 = (999 + var9) / 1000;
                    if (1 <= var9) {
                        statePc = 274;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var9 = 1;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    var8.field_R = isa.a(cu.field_o, new String[1], 79);
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    ukb.field_o.field_R = isa.a(tma.field_o, new String[2], 124);
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (param1 >= 8) {
                        statePc = 280;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    fka.a(-44, (byte) 40, true, false, true);
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    stackOut_280_0 = rga.field_g;
                    stackIn_291_0 = stackOut_280_0;
                    stackIn_281_0 = stackOut_280_0;
                    if (!param3) {
                        statePc = 291;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (llb) (Object) stackIn_281_0;
                    stackOut_281_1 = param4;
                    stackIn_282_0 = stackOut_281_0;
                    stackIn_282_1 = stackOut_281_1;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    stackOut_282_0 = (llb) (Object) stackIn_282_0;
                    stackIn_291_0 = stackOut_282_0;
                    stackIn_283_0 = stackOut_282_0;
                    if (stackIn_282_1) {
                        statePc = 291;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (llb) (Object) stackIn_283_0;
                    stackIn_285_0 = stackOut_283_0;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (llb) (Object) stackIn_285_0;
                    stackOut_285_1 = wo.field_o;
                    stackIn_286_0 = stackOut_285_0;
                    stackIn_286_1 = stackOut_285_1;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = (llb) (Object) stackIn_286_0;
                    stackIn_291_0 = stackOut_286_0;
                    stackIn_287_0 = stackOut_286_0;
                    if (stackIn_286_1) {
                        statePc = 291;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (llb) (Object) stackIn_287_0;
                    stackIn_289_0 = stackOut_287_0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (llb) (Object) stackIn_289_0;
                    stackOut_289_1 = 1;
                    stackIn_292_0 = stackOut_289_0;
                    stackIn_292_1 = stackOut_289_1;
                    statePc = 292;
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (llb) (Object) stackIn_291_0;
                    stackOut_291_1 = 0;
                    stackIn_292_0 = stackOut_291_0;
                    stackIn_292_1 = stackOut_291_1;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    ((llb) (Object) stackIn_292_0).a(stackIn_292_1 != 0, 1332);
                    stackOut_292_0 = vva.field_r;
                    stackIn_303_0 = stackOut_292_0;
                    stackIn_293_0 = stackOut_292_0;
                    if (!param3) {
                        statePc = 303;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (llb) (Object) stackIn_293_0;
                    stackOut_293_1 = param4;
                    stackIn_294_0 = stackOut_293_0;
                    stackIn_294_1 = stackOut_293_1;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    stackOut_294_0 = (llb) (Object) stackIn_294_0;
                    stackIn_303_0 = stackOut_294_0;
                    stackIn_295_0 = stackOut_294_0;
                    if (stackIn_294_1) {
                        statePc = 303;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (llb) (Object) stackIn_295_0;
                    stackIn_297_0 = stackOut_295_0;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (llb) (Object) stackIn_297_0;
                    stackOut_297_1 = wo.field_o;
                    stackIn_298_0 = stackOut_297_0;
                    stackIn_298_1 = stackOut_297_1;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = (llb) (Object) stackIn_298_0;
                    stackIn_303_0 = stackOut_298_0;
                    stackIn_299_0 = stackOut_298_0;
                    if (stackIn_298_1) {
                        statePc = 303;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (llb) (Object) stackIn_299_0;
                    stackIn_301_0 = stackOut_299_0;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (llb) (Object) stackIn_301_0;
                    stackOut_301_1 = 1;
                    stackIn_304_0 = stackOut_301_0;
                    stackIn_304_1 = stackOut_301_1;
                    statePc = 304;
                    continue stateLoop;
                }
                case 303: {
                    stackOut_303_0 = (llb) (Object) stackIn_303_0;
                    stackOut_303_1 = 0;
                    stackIn_304_0 = stackOut_303_0;
                    stackIn_304_1 = stackOut_303_1;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    ((llb) (Object) stackIn_304_0).a(stackIn_304_1 != 0, 1332);
                    stackOut_304_0 = jfb.field_o;
                    stackIn_315_0 = stackOut_304_0;
                    stackIn_305_0 = stackOut_304_0;
                    if (!param3) {
                        statePc = 315;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = (llb) (Object) stackIn_305_0;
                    stackOut_305_1 = param4;
                    stackIn_306_0 = stackOut_305_0;
                    stackIn_306_1 = stackOut_305_1;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    stackOut_306_0 = (llb) (Object) stackIn_306_0;
                    stackIn_315_0 = stackOut_306_0;
                    stackIn_307_0 = stackOut_306_0;
                    if (stackIn_306_1) {
                        statePc = 315;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    stackOut_307_0 = (llb) (Object) stackIn_307_0;
                    stackIn_309_0 = stackOut_307_0;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    stackOut_309_0 = (llb) (Object) stackIn_309_0;
                    stackOut_309_1 = wo.field_o;
                    stackIn_310_0 = stackOut_309_0;
                    stackIn_310_1 = stackOut_309_1;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    stackOut_310_0 = (llb) (Object) stackIn_310_0;
                    stackIn_315_0 = stackOut_310_0;
                    stackIn_311_0 = stackOut_310_0;
                    if (!stackIn_310_1) {
                        statePc = 315;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    stackOut_311_0 = (llb) (Object) stackIn_311_0;
                    stackIn_313_0 = stackOut_311_0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    stackOut_313_0 = (llb) (Object) stackIn_313_0;
                    stackOut_313_1 = 1;
                    stackIn_316_0 = stackOut_313_0;
                    stackIn_316_1 = stackOut_313_1;
                    statePc = 316;
                    continue stateLoop;
                }
                case 315: {
                    stackOut_315_0 = (llb) (Object) stackIn_315_0;
                    stackOut_315_1 = 0;
                    stackIn_316_0 = stackOut_315_0;
                    stackIn_316_1 = stackOut_315_1;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    ((llb) (Object) stackIn_316_0).a(stackIn_316_1 != 0, 1332);
                    hra.field_o.field_a.i(10000);
                    stackOut_316_0 = null;
                    stackIn_317_0 = stackOut_316_0;
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    if (stackIn_317_0 != (Object) (Object) lqa.field_o) {
                        statePc = 320;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if ((nt.field_q.field_o ^ -1) != -1) {
                        statePc = 323;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 323: {
                    sh.a(lqa.field_o.f((byte) -13), -1, param0);
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (vw.field_a.field_o == 0) {
                        statePc = 328;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    wo.field_o = true;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (qsa.field_b.field_o == 0) {
                        statePc = 332;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    qu.field_o = true;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (rlb.field_a.field_o != 0) {
                        statePc = 335;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 335: {
                    wo.field_o = false;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    asb.a(param0, lqa.field_o, false, (byte) -67);
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    fka(ml param0, int param1, ml param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((fka) this).field_d = param0;
                        ((fka) this).field_f = param2;
                        ((fka) this).field_e = param4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("fka.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
                            statePc = 7;
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
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 41);
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
