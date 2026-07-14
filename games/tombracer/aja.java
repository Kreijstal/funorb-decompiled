/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aja extends lea {
    static String field_G;
    static int field_H;
    static String field_I;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = super.a(param0, param1, param2);
                        var5 = new ue(param2, param0);
                        var5.a(2, false);
                        var4.a((byte) 83, (nv) (Object) var5);
                        var6 = rm.field_a;
                        var7 = (kga) (Object) var6.a(12, 125);
                        var7.b((byte) 123, 1);
                        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
                        stackOut_0_0 = (fsa) var4;
                        stackIn_1_0 = stackOut_0_0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return stackIn_1_0;
                }
                case 2: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) var4_ref;
                        stackOut_3_1 = new StringBuilder().append("aja.AC(").append(param0).append(44).append(param1).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param2 == null) {
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
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    aja(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        jea var5_ref = null;
        jea var6 = null;
        jea var7 = null;
        jea var8 = null;
        String var9_ref = null;
        int var9 = 0;
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
        int var17_int = 0;
        vna var17 = null;
        pha var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_21_0 = false;
        jea stackIn_30_0 = null;
        jea stackIn_31_0 = null;
        long stackIn_31_1 = 0L;
        jea stackIn_32_0 = null;
        jea stackIn_34_0 = null;
        jea stackIn_36_0 = null;
        jea stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_97_0 = 0;
        boolean stackIn_109_0 = false;
        int stackIn_117_0 = 0;
        Object stackIn_129_0 = null;
        int[][] stackIn_133_0 = null;
        boolean[][] stackIn_144_0 = null;
        Object stackIn_148_0 = null;
        int[][] stackIn_157_0 = null;
        boolean stackIn_165_0 = false;
        Object stackIn_175_0 = null;
        boolean stackIn_192_0 = false;
        boolean stackIn_203_0 = false;
        int stackIn_242_0 = 0;
        jea stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        jea stackIn_274_0 = null;
        int stackIn_274_1 = 0;
        boolean stackIn_274_2 = false;
        jea stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        jea stackIn_277_0 = null;
        int stackIn_277_1 = 0;
        jea stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        boolean stackIn_278_2 = false;
        jea stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        jea stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        jea stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        jea stackIn_284_0 = null;
        int stackIn_284_1 = 0;
        int stackIn_284_2 = 0;
        jea stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        jea stackIn_286_0 = null;
        int stackIn_286_1 = 0;
        boolean stackIn_286_2 = false;
        jea stackIn_287_0 = null;
        int stackIn_287_1 = 0;
        jea stackIn_289_0 = null;
        int stackIn_289_1 = 0;
        jea stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        boolean stackIn_290_2 = false;
        jea stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        jea stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        jea stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        jea stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        int stackIn_296_2 = 0;
        jea stackIn_297_0 = null;
        int stackIn_297_1 = 0;
        jea stackIn_298_0 = null;
        int stackIn_298_1 = 0;
        boolean stackIn_298_2 = false;
        jea stackIn_299_0 = null;
        int stackIn_299_1 = 0;
        jea stackIn_301_0 = null;
        int stackIn_301_1 = 0;
        jea stackIn_302_0 = null;
        int stackIn_302_1 = 0;
        boolean stackIn_302_2 = false;
        jea stackIn_303_0 = null;
        int stackIn_303_1 = 0;
        jea stackIn_305_0 = null;
        int stackIn_305_1 = 0;
        jea stackIn_307_0 = null;
        int stackIn_307_1 = 0;
        jea stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        int stackIn_308_2 = 0;
        Throwable caughtException = null;
        boolean stackOut_20_0 = false;
        jea stackOut_29_0 = null;
        jea stackOut_30_0 = null;
        long stackOut_30_1 = 0L;
        jea stackOut_31_0 = null;
        jea stackOut_32_0 = null;
        jea stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        jea stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_96_0 = 0;
        boolean stackOut_108_0 = false;
        int stackOut_116_0 = 0;
        Object stackOut_128_0 = null;
        int[][] stackOut_132_0 = null;
        boolean[][] stackOut_143_0 = null;
        Object stackOut_147_0 = null;
        int[][] stackOut_156_0 = null;
        boolean stackOut_164_0 = false;
        Object stackOut_174_0 = null;
        boolean stackOut_191_0 = false;
        boolean stackOut_202_0 = false;
        int stackOut_241_0 = 0;
        jea stackOut_272_0 = null;
        int stackOut_272_1 = 0;
        jea stackOut_273_0 = null;
        int stackOut_273_1 = 0;
        boolean stackOut_273_2 = false;
        jea stackOut_274_0 = null;
        int stackOut_274_1 = 0;
        jea stackOut_275_0 = null;
        int stackOut_275_1 = 0;
        jea stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        boolean stackOut_277_2 = false;
        jea stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        jea stackOut_279_0 = null;
        int stackOut_279_1 = 0;
        jea stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        int stackOut_281_2 = 0;
        jea stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        int stackOut_283_2 = 0;
        jea stackOut_284_0 = null;
        int stackOut_284_1 = 0;
        jea stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        boolean stackOut_285_2 = false;
        jea stackOut_286_0 = null;
        int stackOut_286_1 = 0;
        jea stackOut_287_0 = null;
        int stackOut_287_1 = 0;
        jea stackOut_289_0 = null;
        int stackOut_289_1 = 0;
        boolean stackOut_289_2 = false;
        jea stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        jea stackOut_291_0 = null;
        int stackOut_291_1 = 0;
        jea stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        int stackOut_293_2 = 0;
        jea stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        int stackOut_295_2 = 0;
        jea stackOut_296_0 = null;
        int stackOut_296_1 = 0;
        jea stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        boolean stackOut_297_2 = false;
        jea stackOut_298_0 = null;
        int stackOut_298_1 = 0;
        jea stackOut_299_0 = null;
        int stackOut_299_1 = 0;
        jea stackOut_301_0 = null;
        int stackOut_301_1 = 0;
        boolean stackOut_301_2 = false;
        jea stackOut_302_0 = null;
        int stackOut_302_1 = 0;
        jea stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        jea stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        int stackOut_305_2 = 0;
        jea stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        int stackOut_307_2 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    dga.a(fp.field_e, 199);
                    if (null != uu.field_a) {
                        statePc = 4;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 4: {
                    bc.field_b.field_X = true;
                    var5_ref = pk.field_z;
                    pk.field_z.field_t = 0;
                    var5_ref.field_G = 0;
                    var6 = hw.field_a;
                    hw.field_a.field_t = 0;
                    var6.field_G = 0;
                    var7 = dl.field_t;
                    dl.field_t.field_t = 0;
                    var7.field_G = 0;
                    if (!mka.b(param1 + 8193)) {
                        statePc = 261;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    wf.field_g.field_r = una.field_d.toUpperCase();
                    var9 = (2 + dka.field_b.field_G) / 2;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    pk.field_z.a(-2 + var9, 40, -23776, -40 + dka.field_b.field_t, 0);
                    if ((uu.field_a.field_Mb ^ -1) > (uu.field_a.field_Jb ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    pk.field_z.field_r = ml.field_c.toUpperCase();
                    pk.field_z.field_X = false;
                    if (var19 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    pk.field_z.field_r = eu.field_b.toUpperCase();
                    pk.field_z.field_X = true;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    pk.field_z.field_w = hg.field_g.field_w;
                    if (so.field_K > 0) {
                        statePc = 16;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (1 != so.field_K) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10_ref = sj.field_a;
                    if (var19 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10_ref = gl.a((byte) 84, ld.field_f, new String[1]);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (-1 != (lh.field_a & 16 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = tla.field_e;
                    stackIn_21_0 = stackOut_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    pk.field_z.field_w = hg.field_g.field_C;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    pk.field_z.field_r = pk.field_z.field_r + "<br>" + var10_ref;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    hw.field_a.a(dka.field_b.field_G + -var9, 40, -23776, dka.field_b.field_t - 40, var9);
                    hw.field_a.field_r = ki.field_p.toUpperCase();
                    var8 = hw.field_a;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = hw.field_a;
                    stackIn_36_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (!param3) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (jea) (Object) stackIn_30_0;
                    stackOut_30_1 = uq.field_d;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (jea) (Object) stackIn_31_0;
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
                    stackOut_32_0 = (jea) (Object) stackIn_32_0;
                    stackIn_34_0 = stackOut_32_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = (jea) (Object) stackIn_34_0;
                    stackOut_34_1 = 1;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = (jea) (Object) stackIn_36_0;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_37_0.field_X = stackIn_37_1 != 0;
                    var10 = 2;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (null != ce.field_A) {
                        statePc = 41;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (tba.field_m != null) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    tba.field_m = new byte[fk.field_b];
                    sda.field_f = new boolean[fk.field_b];
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if ((var11 ^ -1) <= (fk.field_b ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    sda.field_f[var11] = false;
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
                    stackOut_55_0 = ce.field_A.length;
                    stackOut_55_1 = var12;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 <= stackIn_56_1) {
                        statePc = 91;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var13_ref_int__ = ce.field_A[var12];
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
                    if (var13_ref_int__.length <= var14) {
                        statePc = 82;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var15 = var13_ref_int__[var14];
                    var16 = var13_ref_int__[1 + var14];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = 0;
                    stackOut_61_1 = var15 ^ -1;
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
                    if (stackIn_62_0 == stackIn_62_1) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((var16 ^ -1) != (255 & uu.field_a.field_ac[var15] ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-1 != (var10 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = uu.field_a.field_Jb;
                    stackIn_74_0 = stackOut_71_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = uu.field_a.field_Mb;
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
                    stackOut_83_0 = var13_ref_int__.length;
                    stackOut_83_1 = var15;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 <= stackIn_84_1) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var16 = var13_ref_int__[var15];
                    stackOut_85_0 = var14 ^ -1;
                    stackOut_85_1 = var16 ^ -1;
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
                    sda.field_f[var14] = true;
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
                    stackOut_96_0 = 2;
                    stackIn_97_0 = stackOut_96_0;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0 > ld.field_e) {
                        statePc = 102;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (!oj.field_tb[12]) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var10 = 2;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (var10 >= 2) {
                        statePc = 125;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    hw.field_a.field_X = false;
                    if (!hw.field_a.field_pb) {
                        statePc = 260;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var11_ref = null;
                    var12 = 0;
                    var13 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (var13 >= fk.field_b) {
                        statePc = 116;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = sda.field_f[var13];
                    stackIn_117_0 = stackOut_108_0 ? 1 : 0;
                    stackIn_109_0 = stackOut_108_0;
                    if (var19 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (!stackIn_109_0) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var14_ref = "<col=A00000>" + kma.field_e[var13] + "</col>";
                    if (null != var11_ref) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var11_ref = var14_ref;
                    if (var19 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var11_ref = var11_ref + ", " + var14_ref;
                    var12 = 1;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var13++;
                    if (var19 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackOut_116_0 = var10;
                    stackIn_117_0 = stackOut_116_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (stackIn_117_0 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var13_ref = lha.field_m;
                    if (var12 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var14_ref = gl.a((byte) 102, bl.field_b, new String[1]);
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var14_ref = uda.field_w + var11_ref;
                    statePc = 124;
                    continue stateLoop;
                }
                case 121: {
                    var13_ref = wqa.field_J;
                    if (var12 != 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var14_ref = gl.a((byte) 82, field_I, new String[1]);
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var14_ref = v.field_j + var11_ref;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    qda.field_b = "<col=A00000>" + var13_ref + "<br>" + var14_ref;
                    if (var19 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (null != rl.field_u) {
                        statePc = 139;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = null;
                    stackIn_129_0 = stackOut_128_0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 != (Object) (Object) hp.field_a) {
                        statePc = 139;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackOut_132_0 = nra.field_g;
                    stackIn_133_0 = stackOut_132_0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 != null) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (null == lga.field_z) {
                        statePc = 260;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var16 >= fk.field_b) {
                        statePc = 199;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var17_int = uu.field_a.field_ac[var16] & 255;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (var19 != 0) {
                        statePc = 200;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    stackOut_143_0 = rl.field_u;
                    stackIn_144_0 = stackOut_143_0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (stackIn_144_0 == null) {
                        statePc = 155;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = null;
                    stackIn_148_0 = stackOut_147_0;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 == (Object) (Object) rl.field_u[var16]) {
                        statePc = 155;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (!rl.field_u[var16][var17_int]) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var11 = 1;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (null == hp.field_a) {
                        statePc = 173;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = hp.field_a;
                    stackIn_157_0 = stackOut_156_0;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (stackIn_157_0[var16] != null) {
                        statePc = 162;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var18_int = hp.field_a[var16][var17_int];
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (0 == var18_int) {
                        statePc = 171;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackOut_164_0 = dea.field_c;
                    stackIn_165_0 = stackOut_164_0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (!stackIn_165_0) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var11 = 1;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (var13 >= var18_int) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var13 = var18_int;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (lga.field_z == null) {
                        statePc = 181;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackOut_174_0 = null;
                    stackIn_175_0 = stackOut_174_0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (stackIn_175_0 != (Object) (Object) lga.field_z[var16]) {
                        statePc = 180;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var15 = var15 | lga.field_z[var16][var17_int];
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (null == nra.field_g) {
                        statePc = 198;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (nra.field_g[var16] == null) {
                        statePc = 198;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var18_int = nra.field_g[var16][var17_int];
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var14 < var18_int) {
                        statePc = 189;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var14 = var18_int;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (0 == var18_int) {
                        statePc = 198;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackOut_191_0 = dea.field_c;
                    stackIn_192_0 = stackOut_191_0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (!stackIn_192_0) {
                        statePc = 197;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var11 = 1;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var16 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    var17 = tn.field_n.field_tb.field_J;
                    var18 = (pha) (Object) var17.f(param1 + -79);
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (null == var18) {
                        statePc = 241;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    stackOut_202_0 = var18.f(162);
                    stackIn_242_0 = stackOut_202_0 ? 1 : 0;
                    stackIn_203_0 = stackOut_202_0;
                    if (var19 != 0) {
                        statePc = 242;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (!stackIn_203_0) {
                        statePc = 209;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var19 == 0) {
                        statePc = 240;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (var11 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (var18.field_tb) {
                        statePc = 217;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var16 = 1;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if ((var18.field_Jb ^ -1) > (var13 ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var16 = 1;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (var18.field_zb >= var14) {
                        statePc = 229;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var16 = 1;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (-1 <= ((var18.field_Eb ^ -1) & var15 ^ -1)) {
                        statePc = 234;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var16 = 1;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (var12 != 0) {
                        statePc = 239;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var18 = (pha) (Object) var17.e(120);
                    if (var19 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    stackOut_241_0 = -3;
                    stackIn_242_0 = stackOut_241_0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (stackIn_242_0 < (ld.field_e ^ -1)) {
                        statePc = 247;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (!oj.field_tb[12]) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var16 = 0;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (var16 != 0) {
                        statePc = 250;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 250: {
                    hw.field_a.field_X = false;
                    if (!hw.field_a.field_pb) {
                        statePc = 260;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if ((rm.field_e.field_a.field_wb ^ -1) == -1) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    qda.field_b = gl.a((byte) 126, sta.field_A, new String[1]);
                    if (var19 == 0) {
                        statePc = 260;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    qda.field_b = kh.field_o;
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
                    var9_ref = uu.field_a.field_tb;
                    wf.field_g.field_r = gl.a((byte) 113, jea.field_nb, new String[1]).toUpperCase();
                    dl.field_t.a(dka.field_b.field_G, 40, -23776, dka.field_b.field_t - 40, 0);
                    dl.field_t.field_r = gl.a((byte) 107, bja.field_d, new String[1]);
                    var8 = dl.field_t;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if ((uq.field_d ^ -1L) != -1L) {
                        statePc = 265;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var9 = (int)(-bva.b((byte) -107) + uq.field_d);
                    var9 = (999 + var9) / 1000;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if ((var9 ^ -1) > -2) {
                        statePc = 269;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var9 = 1;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    var8.field_r = gl.a((byte) 97, he.field_b, new String[1]);
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    cea.field_a.field_r = gl.a((byte) 106, tra.field_A, new String[2]);
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackOut_272_0 = nra.field_c;
                    stackOut_272_1 = -98;
                    stackIn_283_0 = stackOut_272_0;
                    stackIn_283_1 = stackOut_272_1;
                    stackIn_273_0 = stackOut_272_0;
                    stackIn_273_1 = stackOut_272_1;
                    if (!param4) {
                        statePc = 283;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = (jea) (Object) stackIn_273_0;
                    stackOut_273_1 = stackIn_273_1;
                    stackOut_273_2 = param0;
                    stackIn_274_0 = stackOut_273_0;
                    stackIn_274_1 = stackOut_273_1;
                    stackIn_274_2 = stackOut_273_2;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    stackOut_274_0 = (jea) (Object) stackIn_274_0;
                    stackOut_274_1 = stackIn_274_1;
                    stackIn_283_0 = stackOut_274_0;
                    stackIn_283_1 = stackOut_274_1;
                    stackIn_275_0 = stackOut_274_0;
                    stackIn_275_1 = stackOut_274_1;
                    if (stackIn_274_2) {
                        statePc = 283;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = (jea) (Object) stackIn_275_0;
                    stackOut_275_1 = stackIn_275_1;
                    stackIn_277_0 = stackOut_275_0;
                    stackIn_277_1 = stackOut_275_1;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    stackOut_277_0 = (jea) (Object) stackIn_277_0;
                    stackOut_277_1 = stackIn_277_1;
                    stackOut_277_2 = tla.field_e;
                    stackIn_278_0 = stackOut_277_0;
                    stackIn_278_1 = stackOut_277_1;
                    stackIn_278_2 = stackOut_277_2;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    stackOut_278_0 = (jea) (Object) stackIn_278_0;
                    stackOut_278_1 = stackIn_278_1;
                    stackIn_283_0 = stackOut_278_0;
                    stackIn_283_1 = stackOut_278_1;
                    stackIn_279_0 = stackOut_278_0;
                    stackIn_279_1 = stackOut_278_1;
                    if (stackIn_278_2) {
                        statePc = 283;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    stackOut_279_0 = (jea) (Object) stackIn_279_0;
                    stackOut_279_1 = stackIn_279_1;
                    stackIn_281_0 = stackOut_279_0;
                    stackIn_281_1 = stackOut_279_1;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (jea) (Object) stackIn_281_0;
                    stackOut_281_1 = stackIn_281_1;
                    stackOut_281_2 = 1;
                    stackIn_284_0 = stackOut_281_0;
                    stackIn_284_1 = stackOut_281_1;
                    stackIn_284_2 = stackOut_281_2;
                    statePc = 284;
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (jea) (Object) stackIn_283_0;
                    stackOut_283_1 = stackIn_283_1;
                    stackOut_283_2 = 0;
                    stackIn_284_0 = stackOut_283_0;
                    stackIn_284_1 = stackOut_283_1;
                    stackIn_284_2 = stackOut_283_2;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    ((jea) (Object) stackIn_284_0).c(stackIn_284_1, stackIn_284_2 != 0);
                    stackOut_284_0 = dka.field_b;
                    stackOut_284_1 = 67;
                    stackIn_295_0 = stackOut_284_0;
                    stackIn_295_1 = stackOut_284_1;
                    stackIn_285_0 = stackOut_284_0;
                    stackIn_285_1 = stackOut_284_1;
                    if (!param4) {
                        statePc = 295;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (jea) (Object) stackIn_285_0;
                    stackOut_285_1 = stackIn_285_1;
                    stackOut_285_2 = param0;
                    stackIn_286_0 = stackOut_285_0;
                    stackIn_286_1 = stackOut_285_1;
                    stackIn_286_2 = stackOut_285_2;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    stackOut_286_0 = (jea) (Object) stackIn_286_0;
                    stackOut_286_1 = stackIn_286_1;
                    stackIn_295_0 = stackOut_286_0;
                    stackIn_295_1 = stackOut_286_1;
                    stackIn_287_0 = stackOut_286_0;
                    stackIn_287_1 = stackOut_286_1;
                    if (stackIn_286_2) {
                        statePc = 295;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (jea) (Object) stackIn_287_0;
                    stackOut_287_1 = stackIn_287_1;
                    stackIn_289_0 = stackOut_287_0;
                    stackIn_289_1 = stackOut_287_1;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (jea) (Object) stackIn_289_0;
                    stackOut_289_1 = stackIn_289_1;
                    stackOut_289_2 = tla.field_e;
                    stackIn_290_0 = stackOut_289_0;
                    stackIn_290_1 = stackOut_289_1;
                    stackIn_290_2 = stackOut_289_2;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = (jea) (Object) stackIn_290_0;
                    stackOut_290_1 = stackIn_290_1;
                    stackIn_295_0 = stackOut_290_0;
                    stackIn_295_1 = stackOut_290_1;
                    stackIn_291_0 = stackOut_290_0;
                    stackIn_291_1 = stackOut_290_1;
                    if (stackIn_290_2) {
                        statePc = 295;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (jea) (Object) stackIn_291_0;
                    stackOut_291_1 = stackIn_291_1;
                    stackIn_293_0 = stackOut_291_0;
                    stackIn_293_1 = stackOut_291_1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (jea) (Object) stackIn_293_0;
                    stackOut_293_1 = stackIn_293_1;
                    stackOut_293_2 = 1;
                    stackIn_296_0 = stackOut_293_0;
                    stackIn_296_1 = stackOut_293_1;
                    stackIn_296_2 = stackOut_293_2;
                    statePc = 296;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (jea) (Object) stackIn_295_0;
                    stackOut_295_1 = stackIn_295_1;
                    stackOut_295_2 = 0;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    stackIn_296_2 = stackOut_295_2;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    ((jea) (Object) stackIn_296_0).c(stackIn_296_1, stackIn_296_2 != 0);
                    stackOut_296_0 = hf.field_a;
                    stackOut_296_1 = 36;
                    stackIn_307_0 = stackOut_296_0;
                    stackIn_307_1 = stackOut_296_1;
                    stackIn_297_0 = stackOut_296_0;
                    stackIn_297_1 = stackOut_296_1;
                    if (!param4) {
                        statePc = 307;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (jea) (Object) stackIn_297_0;
                    stackOut_297_1 = stackIn_297_1;
                    stackOut_297_2 = param0;
                    stackIn_298_0 = stackOut_297_0;
                    stackIn_298_1 = stackOut_297_1;
                    stackIn_298_2 = stackOut_297_2;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = (jea) (Object) stackIn_298_0;
                    stackOut_298_1 = stackIn_298_1;
                    stackIn_307_0 = stackOut_298_0;
                    stackIn_307_1 = stackOut_298_1;
                    stackIn_299_0 = stackOut_298_0;
                    stackIn_299_1 = stackOut_298_1;
                    if (stackIn_298_2) {
                        statePc = 307;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (jea) (Object) stackIn_299_0;
                    stackOut_299_1 = stackIn_299_1;
                    stackIn_301_0 = stackOut_299_0;
                    stackIn_301_1 = stackOut_299_1;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (jea) (Object) stackIn_301_0;
                    stackOut_301_1 = stackIn_301_1;
                    stackOut_301_2 = tla.field_e;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    stackIn_302_2 = stackOut_301_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    stackOut_302_0 = (jea) (Object) stackIn_302_0;
                    stackOut_302_1 = stackIn_302_1;
                    stackIn_307_0 = stackOut_302_0;
                    stackIn_307_1 = stackOut_302_1;
                    stackIn_303_0 = stackOut_302_0;
                    stackIn_303_1 = stackOut_302_1;
                    if (!stackIn_302_2) {
                        statePc = 307;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackOut_303_0 = (jea) (Object) stackIn_303_0;
                    stackOut_303_1 = stackIn_303_1;
                    stackIn_305_0 = stackOut_303_0;
                    stackIn_305_1 = stackOut_303_1;
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = (jea) (Object) stackIn_305_0;
                    stackOut_305_1 = stackIn_305_1;
                    stackOut_305_2 = 1;
                    stackIn_308_0 = stackOut_305_0;
                    stackIn_308_1 = stackOut_305_1;
                    stackIn_308_2 = stackOut_305_2;
                    statePc = 308;
                    continue stateLoop;
                }
                case 307: {
                    stackOut_307_0 = (jea) (Object) stackIn_307_0;
                    stackOut_307_1 = stackIn_307_1;
                    stackOut_307_2 = 0;
                    stackIn_308_0 = stackOut_307_0;
                    stackIn_308_1 = stackOut_307_1;
                    stackIn_308_2 = stackOut_307_2;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    ((jea) (Object) stackIn_308_0).c(stackIn_308_1, stackIn_308_2 != 0);
                    rm.field_e.field_a.e((byte) -98);
                    if (param1 == -1) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    return;
                }
                case 310: {
                    if (null == uu.field_a) {
                        statePc = 332;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (0 != bc.field_b.field_y) {
                        statePc = 316;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 316: {
                    et.a(param2, 30, uu.field_a.f(0));
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    if (-1 != (hw.field_a.field_y ^ -1)) {
                        statePc = 320;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 320: {
                    hoa.field_p = true;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if ((pk.field_z.field_y ^ -1) != -1) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    tla.field_e = true;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (-1 == (fsa.field_q.field_y ^ -1)) {
                        statePc = 329;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    tla.field_e = false;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    cm.a(param2, uu.field_a, param1 ^ 21289, false);
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void A(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_I = null;
              if (param0 == 32076) {
                break L0;
              } else {
                aja.a(false, 126, -63, false, true);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_G = null;
        }
    }

    aja(la param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Reject <%0> from this game";
        field_I = "Please select an option in the '<%0>' row.";
    }
}
