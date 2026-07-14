/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lu extends am {
    int field_n;
    int field_v;
    static ut[] field_p;
    static String[] field_x;
    int field_o;
    static String field_t;
    static String field_r;
    int field_s;
    int field_q;
    static String field_u;
    int field_w;

    final static void a(int param0, int param1) {
        int var4 = 0;
        ml var2 = or.field_d;
        var2.b(param1, (byte) 108);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        if (param0 != 6773) {
            return;
        }
        try {
            var2.a(param0 + -6660, 5);
            var2.a(123, uv.field_i.field_bc);
            var4 = (uv.field_i.field_Mb << 697071814) + uv.field_i.field_Wb;
            var2.a(106, var4);
            var2.a(0, uv.field_i.field_Eb.length, param0 ^ 1991213509, uv.field_i.field_Eb);
            var2.c(62, var2.field_n - var3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lu.CB(" + param0 + 44 + param1 + 41);
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        hd var5_ref = null;
        hd var6 = null;
        hd var7 = null;
        hd var8 = null;
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
        tf var17 = null;
        int var17_int = 0;
        he var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_19_0 = false;
        hd stackIn_26_0 = null;
        hd stackIn_27_0 = null;
        long stackIn_27_1 = 0L;
        hd stackIn_28_0 = null;
        hd stackIn_30_0 = null;
        hd stackIn_32_0 = null;
        hd stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_99_0 = 0;
        boolean[] stackIn_101_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_126_0 = null;
        Object stackIn_127_0 = null;
        boolean[][] stackIn_127_1 = null;
        boolean[][] stackIn_131_0 = null;
        int[][] stackIn_152_0 = null;
        boolean stackIn_176_0 = false;
        int stackIn_212_0 = 0;
        boolean[] stackIn_214_0 = null;
        boolean stackIn_240_0 = false;
        int stackIn_249_0 = 0;
        hd stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        hd stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        boolean stackIn_266_2 = false;
        hd stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        hd stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        hd stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        boolean stackIn_270_2 = false;
        hd stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        hd stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        hd stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        hd stackIn_276_0 = null;
        int stackIn_276_1 = 0;
        int stackIn_276_2 = 0;
        hd stackIn_277_0 = null;
        int stackIn_277_1 = 0;
        hd stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        boolean stackIn_278_2 = false;
        hd stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        hd stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        hd stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        boolean stackIn_282_2 = false;
        hd stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        hd stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        hd stackIn_287_0 = null;
        int stackIn_287_1 = 0;
        hd stackIn_288_0 = null;
        int stackIn_288_1 = 0;
        int stackIn_288_2 = 0;
        hd stackIn_289_0 = null;
        int stackIn_289_1 = 0;
        hd stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        boolean stackIn_290_2 = false;
        hd stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        hd stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        hd stackIn_294_0 = null;
        int stackIn_294_1 = 0;
        boolean stackIn_294_2 = false;
        hd stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        hd stackIn_297_0 = null;
        int stackIn_297_1 = 0;
        hd stackIn_299_0 = null;
        int stackIn_299_1 = 0;
        hd stackIn_300_0 = null;
        int stackIn_300_1 = 0;
        int stackIn_300_2 = 0;
        Object stackIn_301_0 = null;
        Throwable caughtException = null;
        boolean stackOut_18_0 = false;
        hd stackOut_25_0 = null;
        hd stackOut_26_0 = null;
        long stackOut_26_1 = 0L;
        hd stackOut_27_0 = null;
        hd stackOut_28_0 = null;
        hd stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        hd stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_98_0 = 0;
        boolean[] stackOut_100_0 = null;
        Object stackOut_111_0 = null;
        Object stackOut_115_0 = null;
        Object stackOut_125_0 = null;
        Object stackOut_126_0 = null;
        boolean[][] stackOut_126_1 = null;
        boolean[][] stackOut_130_0 = null;
        int[][] stackOut_151_0 = null;
        boolean stackOut_175_0 = false;
        int stackOut_211_0 = 0;
        boolean[] stackOut_213_0 = null;
        boolean stackOut_239_0 = false;
        int stackOut_248_0 = 0;
        hd stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        hd stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        boolean stackOut_265_2 = false;
        hd stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        hd stackOut_267_0 = null;
        int stackOut_267_1 = 0;
        hd stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        boolean stackOut_269_2 = false;
        hd stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        hd stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        hd stackOut_273_0 = null;
        int stackOut_273_1 = 0;
        int stackOut_273_2 = 0;
        hd stackOut_275_0 = null;
        int stackOut_275_1 = 0;
        int stackOut_275_2 = 0;
        hd stackOut_276_0 = null;
        int stackOut_276_1 = 0;
        hd stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        boolean stackOut_277_2 = false;
        hd stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        hd stackOut_279_0 = null;
        int stackOut_279_1 = 0;
        hd stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        boolean stackOut_281_2 = false;
        hd stackOut_282_0 = null;
        int stackOut_282_1 = 0;
        hd stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        hd stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        int stackOut_285_2 = 0;
        hd stackOut_287_0 = null;
        int stackOut_287_1 = 0;
        int stackOut_287_2 = 0;
        hd stackOut_288_0 = null;
        int stackOut_288_1 = 0;
        hd stackOut_289_0 = null;
        int stackOut_289_1 = 0;
        boolean stackOut_289_2 = false;
        hd stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        hd stackOut_291_0 = null;
        int stackOut_291_1 = 0;
        hd stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        boolean stackOut_293_2 = false;
        hd stackOut_294_0 = null;
        int stackOut_294_1 = 0;
        hd stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        hd stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        int stackOut_297_2 = 0;
        hd stackOut_299_0 = null;
        int stackOut_299_1 = 0;
        int stackOut_299_2 = 0;
        Object stackOut_300_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    dw.a(7, ee.field_b);
                    if (uv.field_i == null) {
                        statePc = 264;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ac.field_b.field_lb = true;
                    em.field_d.field_mb = 0;
                    var5_ref = em.field_d;
                    var5_ref.field_q = 0;
                    ua.field_k.field_mb = 0;
                    var6 = ua.field_k;
                    var6.field_q = 0;
                    nv.field_F.field_mb = 0;
                    var7 = nv.field_F;
                    var7.field_q = 0;
                    if (!np.a(113)) {
                        statePc = 258;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ci.field_h.field_E = kf.field_zb.toUpperCase();
                    var9 = (fp.field_p.field_q - -2) / 2;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    em.field_d.a(true, var9 + -2, 0, -40 + fp.field_p.field_mb, 40);
                    if ((uv.field_i.field_bc ^ -1) >= (uv.field_i.field_gc ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    em.field_d.field_E = po.field_b.toUpperCase();
                    em.field_d.field_lb = true;
                    if (var19 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    em.field_d.field_E = no.field_I.toUpperCase();
                    em.field_d.field_lb = false;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    em.field_d.field_R = vg.field_Qb.field_R;
                    if ((fh.field_b ^ -1) < -1) {
                        statePc = 14;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((fh.field_b ^ -1) == -2) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10_ref = vo.a((byte) -18, jb.field_f, new String[1]);
                    if (var19 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10_ref = kp.field_i;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    em.field_d.field_E = em.field_d.field_E + "<br>" + var10_ref;
                    if ((16 & de.field_c ^ -1) != -1) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = td.field_b;
                    stackIn_19_0 = stackOut_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!stackIn_19_0) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    em.field_d.field_R = vg.field_Qb.field_S;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    ua.field_k.a(true, fp.field_p.field_q + -var9, var9, -40 + fp.field_p.field_mb, 40);
                    ua.field_k.field_E = hj.field_g.toUpperCase();
                    stackOut_25_0 = ua.field_k;
                    stackIn_32_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (!param3) {
                        statePc = 32;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = (hd) (Object) stackIn_26_0;
                    stackOut_26_1 = 0L;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = (hd) (Object) stackIn_27_0;
                    stackIn_32_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (stackIn_27_1 != vg.field_Ib) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = (hd) (Object) stackIn_28_0;
                    stackIn_30_0 = stackOut_28_0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (hd) (Object) stackIn_30_0;
                    stackOut_30_1 = 1;
                    stackIn_33_0 = stackOut_30_0;
                    stackIn_33_1 = stackOut_30_1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = (hd) (Object) stackIn_32_0;
                    stackOut_32_1 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_33_0.field_lb = stackIn_33_1 != 0;
                    var8 = ua.field_k;
                    var10 = 2;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (la.field_k != null) {
                        statePc = 37;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (hm.field_G == null) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    m.field_f = new boolean[ss.field_j];
                    hm.field_G = new byte[ss.field_j];
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var11_int = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (ss.field_j <= var11_int) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    m.field_f[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var19 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var10 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if ((var10 ^ -1) <= -3) {
                        statePc = 98;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var11_int = 0;
                    stackOut_49_0 = 0;
                    stackIn_99_0 = stackOut_49_0;
                    stackIn_50_0 = stackOut_49_0;
                    if (var19 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12 = stackIn_50_0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = var12 ^ -1;
                    stackOut_51_1 = la.field_k.length ^ -1;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 <= stackIn_52_1) {
                        statePc = 93;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var13_array = la.field_k[var12];
                    stackOut_53_0 = 0;
                    stackIn_94_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (var19 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var14_int = stackIn_54_0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var14_int >= var13_array.length) {
                        statePc = 84;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var15 = var13_array[var14_int];
                    var16 = var13_array[var14_int + 1];
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = var15;
                    stackOut_57_1 = -1;
                    stackIn_86_0 = stackOut_57_0;
                    stackIn_86_1 = stackOut_57_1;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    if (var19 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 != stackIn_58_1) {
                        statePc = 75;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (0 == var10) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = uv.field_i.field_gc;
                    stackIn_67_0 = stackOut_64_0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = uv.field_i.field_bc;
                    stackIn_67_0 = stackOut_66_0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var17_int = stackIn_67_0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if ((var17_int ^ -1) == (var16 ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var19 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var19 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((uv.field_i.field_Eb[var15] & 255 ^ -1) == (var16 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var19 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    stackOut_85_0 = var13_array.length;
                    stackOut_85_1 = var15;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 <= stackIn_86_1) {
                        statePc = 91;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var16 = var13_array[var15];
                    stackOut_87_0 = var14_int ^ -1;
                    stackOut_87_1 = var16 ^ -1;
                    stackIn_52_0 = stackOut_87_0;
                    stackIn_52_1 = stackOut_87_1;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    if (var19 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0 <= stackIn_88_1) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var14_int = var16;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    m.field_f[var14_int] = true;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = var11_int;
                    stackIn_94_0 = stackOut_93_0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (stackIn_94_0 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = 2;
                    stackIn_99_0 = stackOut_98_0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (stackIn_99_0 > tk.field_Ib) {
                        statePc = 107;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = ne.field_G;
                    stackIn_101_0 = stackOut_100_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0[12]) {
                        statePc = 106;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var10 = 2;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if ((var10 ^ -1) > -3) {
                        statePc = 234;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (null != ds.field_h) {
                        statePc = 122;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackOut_111_0 = null;
                    stackIn_112_0 = stackOut_111_0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (stackIn_112_0 != (Object) (Object) lh.field_E) {
                        statePc = 122;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = null;
                    stackIn_116_0 = stackOut_115_0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 != (Object) (Object) so.field_f) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (null == hm.field_D) {
                        statePc = 257;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if ((var16 ^ -1) <= (ss.field_j ^ -1)) {
                        statePc = 173;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var17_int = 255 & uv.field_i.field_Eb[var16];
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = null;
                    stackIn_301_0 = stackOut_125_0;
                    stackIn_126_0 = stackOut_125_0;
                    if (var19 != 0) {
                        statePc = 301;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackOut_126_0 = stackIn_126_0;
                    stackOut_126_1 = ds.field_h;
                    stackIn_127_0 = stackOut_126_0;
                    stackIn_127_1 = stackOut_126_1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0 == (Object) (Object) stackIn_127_1) {
                        statePc = 138;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = ds.field_h;
                    stackIn_131_0 = stackOut_130_0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0[var16] == null) {
                        statePc = 138;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (!ds.field_h[var16][var17_int]) {
                        statePc = 138;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var11_int = 1;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (lh.field_E == null) {
                        statePc = 150;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (lh.field_E[var16] == null) {
                        statePc = 150;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var18_int = lh.field_E[var16][var17_int];
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (var18_int == 0) {
                        statePc = 148;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (fv.field_d) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var11_int = 1;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if ((var18_int ^ -1) >= (var13_int ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var13_int = var18_int;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (null == so.field_f) {
                        statePc = 167;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = so.field_f;
                    stackIn_152_0 = stackOut_151_0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0[var16] != null) {
                        statePc = 157;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var18_int = so.field_f[var16][var17_int];
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (var18_int > var14_int) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var14_int = var18_int;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (fv.field_d) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var11_int = 1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (null == hm.field_D) {
                        statePc = 172;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (null == hm.field_D[var16]) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var15 = var15 | hm.field_D[var16][var17_int];
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var16 = 0;
                    var17 = bs.field_c.field_Ab.field_jb;
                    var18 = (he) (Object) var17.g(24009);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (null == var18) {
                        statePc = 211;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackOut_175_0 = var18.h(-13356);
                    stackIn_212_0 = stackOut_175_0 ? 1 : 0;
                    stackIn_176_0 = stackOut_175_0;
                    if (var19 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (stackIn_176_0) {
                        statePc = 210;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var11_int == 0) {
                        statePc = 187;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (var18.field_Cb) {
                        statePc = 187;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var16 = 1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if ((var18.field_Qb ^ -1) <= (var13_int ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var16 = 1;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (var14_int > var18.field_Db) {
                        statePc = 197;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var16 = 1;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if ((var15 & (var18.field_Pb ^ -1)) > 0) {
                        statePc = 204;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var16 = 1;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var12 == 0) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var18 = (he) (Object) var17.c(param2 ^ -33);
                    if (var19 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackOut_211_0 = tk.field_Ib ^ -1;
                    stackIn_212_0 = stackOut_211_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (stackIn_212_0 > -3) {
                        statePc = 220;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    stackOut_213_0 = ne.field_G;
                    stackIn_214_0 = stackOut_213_0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (stackIn_214_0[12]) {
                        statePc = 219;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var16 = 0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (var16 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 223: {
                    ua.field_k.field_lb = false;
                    if (ua.field_k.field_Q) {
                        statePc = 226;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (ni.field_l.field_b.field_Db != 0) {
                        statePc = 230;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    sn.field_e = pp.field_m;
                    if (var19 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    sn.field_e = vo.a((byte) -18, pu.field_Fb, new String[1]);
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    if (var19 == 0) {
                        statePc = 257;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    ua.field_k.field_lb = false;
                    if (!ua.field_k.field_Q) {
                        statePc = 257;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (ss.field_j <= var13_int) {
                        statePc = 248;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    stackOut_239_0 = m.field_f[var13_int];
                    stackIn_249_0 = stackOut_239_0 ? 1 : 0;
                    stackIn_240_0 = stackOut_239_0;
                    if (var19 != 0) {
                        statePc = 249;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (stackIn_240_0) {
                        statePc = 244;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var14 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                    if (null == var11) {
                        statePc = 246;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var12 = 1;
                    var11 = var11 + ", " + var14;
                    if (var19 == 0) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var11 = var14;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    stackOut_248_0 = var10 ^ -1;
                    stackIn_249_0 = stackOut_248_0;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    if (stackIn_249_0 != -1) {
                        statePc = 253;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var13 = sb.field_g;
                    if (var12 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var14 = vo.a((byte) -18, kb.field_D, new String[1]);
                    if (var19 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var14 = gm.field_S + var11;
                    statePc = 256;
                    continue stateLoop;
                }
                case 253: {
                    var13 = os.field_w;
                    if (var12 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var14 = oi.field_k + var11;
                    if (var19 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var14 = vo.a((byte) -18, bp.field_yb, new String[1]);
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    sn.field_e = "<col=A00000>" + var13 + "<br>" + var14;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (var19 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var9_ref = uv.field_i.field_ec;
                    ci.field_h.field_E = vo.a((byte) -18, bv.field_m, new String[1]).toUpperCase();
                    nv.field_F.a(true, fp.field_p.field_q, 0, fp.field_p.field_mb - 40, 40);
                    nv.field_F.field_E = vo.a((byte) -18, wa.field_c, new String[1]);
                    var8 = nv.field_F;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if ((vg.field_Ib ^ -1L) == -1L) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var9 = (int)(-nj.a(22) + vg.field_Ib);
                    var9 = (var9 - -999) / 1000;
                    if ((var9 ^ -1) <= -2) {
                        statePc = 262;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var9 = 1;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    var8.field_E = vo.a((byte) -18, gf.field_h, new String[1]);
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    ka.field_c.field_E = vo.a((byte) -18, ib.field_F, new String[2]);
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    stackOut_264_0 = dn.field_Cb;
                    stackOut_264_1 = param2 ^ param2;
                    stackIn_275_0 = stackOut_264_0;
                    stackIn_275_1 = stackOut_264_1;
                    stackIn_265_0 = stackOut_264_0;
                    stackIn_265_1 = stackOut_264_1;
                    if (!param0) {
                        statePc = 275;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    stackOut_265_0 = (hd) (Object) stackIn_265_0;
                    stackOut_265_1 = stackIn_265_1;
                    stackOut_265_2 = param4;
                    stackIn_266_0 = stackOut_265_0;
                    stackIn_266_1 = stackOut_265_1;
                    stackIn_266_2 = stackOut_265_2;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    stackOut_266_0 = (hd) (Object) stackIn_266_0;
                    stackOut_266_1 = stackIn_266_1;
                    stackIn_275_0 = stackOut_266_0;
                    stackIn_275_1 = stackOut_266_1;
                    stackIn_267_0 = stackOut_266_0;
                    stackIn_267_1 = stackOut_266_1;
                    if (stackIn_266_2) {
                        statePc = 275;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    stackOut_267_0 = (hd) (Object) stackIn_267_0;
                    stackOut_267_1 = stackIn_267_1;
                    stackIn_269_0 = stackOut_267_0;
                    stackIn_269_1 = stackOut_267_1;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    stackOut_269_0 = (hd) (Object) stackIn_269_0;
                    stackOut_269_1 = stackIn_269_1;
                    stackOut_269_2 = td.field_b;
                    stackIn_270_0 = stackOut_269_0;
                    stackIn_270_1 = stackOut_269_1;
                    stackIn_270_2 = stackOut_269_2;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    stackOut_270_0 = (hd) (Object) stackIn_270_0;
                    stackOut_270_1 = stackIn_270_1;
                    stackIn_275_0 = stackOut_270_0;
                    stackIn_275_1 = stackOut_270_1;
                    stackIn_271_0 = stackOut_270_0;
                    stackIn_271_1 = stackOut_270_1;
                    if (stackIn_270_2) {
                        statePc = 275;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    stackOut_271_0 = (hd) (Object) stackIn_271_0;
                    stackOut_271_1 = stackIn_271_1;
                    stackIn_273_0 = stackOut_271_0;
                    stackIn_273_1 = stackOut_271_1;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = (hd) (Object) stackIn_273_0;
                    stackOut_273_1 = stackIn_273_1;
                    stackOut_273_2 = 1;
                    stackIn_276_0 = stackOut_273_0;
                    stackIn_276_1 = stackOut_273_1;
                    stackIn_276_2 = stackOut_273_2;
                    statePc = 276;
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = (hd) (Object) stackIn_275_0;
                    stackOut_275_1 = stackIn_275_1;
                    stackOut_275_2 = 0;
                    stackIn_276_0 = stackOut_275_0;
                    stackIn_276_1 = stackOut_275_1;
                    stackIn_276_2 = stackOut_275_2;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    ((hd) (Object) stackIn_276_0).b(stackIn_276_1, stackIn_276_2 != 0);
                    stackOut_276_0 = fp.field_p;
                    stackOut_276_1 = 0;
                    stackIn_287_0 = stackOut_276_0;
                    stackIn_287_1 = stackOut_276_1;
                    stackIn_277_0 = stackOut_276_0;
                    stackIn_277_1 = stackOut_276_1;
                    if (!param0) {
                        statePc = 287;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    stackOut_277_0 = (hd) (Object) stackIn_277_0;
                    stackOut_277_1 = stackIn_277_1;
                    stackOut_277_2 = param4;
                    stackIn_278_0 = stackOut_277_0;
                    stackIn_278_1 = stackOut_277_1;
                    stackIn_278_2 = stackOut_277_2;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    stackOut_278_0 = (hd) (Object) stackIn_278_0;
                    stackOut_278_1 = stackIn_278_1;
                    stackIn_287_0 = stackOut_278_0;
                    stackIn_287_1 = stackOut_278_1;
                    stackIn_279_0 = stackOut_278_0;
                    stackIn_279_1 = stackOut_278_1;
                    if (stackIn_278_2) {
                        statePc = 287;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    stackOut_279_0 = (hd) (Object) stackIn_279_0;
                    stackOut_279_1 = stackIn_279_1;
                    stackIn_281_0 = stackOut_279_0;
                    stackIn_281_1 = stackOut_279_1;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (hd) (Object) stackIn_281_0;
                    stackOut_281_1 = stackIn_281_1;
                    stackOut_281_2 = td.field_b;
                    stackIn_282_0 = stackOut_281_0;
                    stackIn_282_1 = stackOut_281_1;
                    stackIn_282_2 = stackOut_281_2;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    stackOut_282_0 = (hd) (Object) stackIn_282_0;
                    stackOut_282_1 = stackIn_282_1;
                    stackIn_287_0 = stackOut_282_0;
                    stackIn_287_1 = stackOut_282_1;
                    stackIn_283_0 = stackOut_282_0;
                    stackIn_283_1 = stackOut_282_1;
                    if (stackIn_282_2) {
                        statePc = 287;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (hd) (Object) stackIn_283_0;
                    stackOut_283_1 = stackIn_283_1;
                    stackIn_285_0 = stackOut_283_0;
                    stackIn_285_1 = stackOut_283_1;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (hd) (Object) stackIn_285_0;
                    stackOut_285_1 = stackIn_285_1;
                    stackOut_285_2 = 1;
                    stackIn_288_0 = stackOut_285_0;
                    stackIn_288_1 = stackOut_285_1;
                    stackIn_288_2 = stackOut_285_2;
                    statePc = 288;
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (hd) (Object) stackIn_287_0;
                    stackOut_287_1 = stackIn_287_1;
                    stackOut_287_2 = 0;
                    stackIn_288_0 = stackOut_287_0;
                    stackIn_288_1 = stackOut_287_1;
                    stackIn_288_2 = stackOut_287_2;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    ((hd) (Object) stackIn_288_0).b(stackIn_288_1, stackIn_288_2 != 0);
                    stackOut_288_0 = tn.field_f;
                    stackOut_288_1 = 0;
                    stackIn_299_0 = stackOut_288_0;
                    stackIn_299_1 = stackOut_288_1;
                    stackIn_289_0 = stackOut_288_0;
                    stackIn_289_1 = stackOut_288_1;
                    if (!param0) {
                        statePc = 299;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (hd) (Object) stackIn_289_0;
                    stackOut_289_1 = stackIn_289_1;
                    stackOut_289_2 = param4;
                    stackIn_290_0 = stackOut_289_0;
                    stackIn_290_1 = stackOut_289_1;
                    stackIn_290_2 = stackOut_289_2;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = (hd) (Object) stackIn_290_0;
                    stackOut_290_1 = stackIn_290_1;
                    stackIn_299_0 = stackOut_290_0;
                    stackIn_299_1 = stackOut_290_1;
                    stackIn_291_0 = stackOut_290_0;
                    stackIn_291_1 = stackOut_290_1;
                    if (stackIn_290_2) {
                        statePc = 299;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (hd) (Object) stackIn_291_0;
                    stackOut_291_1 = stackIn_291_1;
                    stackIn_293_0 = stackOut_291_0;
                    stackIn_293_1 = stackOut_291_1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (hd) (Object) stackIn_293_0;
                    stackOut_293_1 = stackIn_293_1;
                    stackOut_293_2 = td.field_b;
                    stackIn_294_0 = stackOut_293_0;
                    stackIn_294_1 = stackOut_293_1;
                    stackIn_294_2 = stackOut_293_2;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    stackOut_294_0 = (hd) (Object) stackIn_294_0;
                    stackOut_294_1 = stackIn_294_1;
                    stackIn_299_0 = stackOut_294_0;
                    stackIn_299_1 = stackOut_294_1;
                    stackIn_295_0 = stackOut_294_0;
                    stackIn_295_1 = stackOut_294_1;
                    if (!stackIn_294_2) {
                        statePc = 299;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (hd) (Object) stackIn_295_0;
                    stackOut_295_1 = stackIn_295_1;
                    stackIn_297_0 = stackOut_295_0;
                    stackIn_297_1 = stackOut_295_1;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (hd) (Object) stackIn_297_0;
                    stackOut_297_1 = stackIn_297_1;
                    stackOut_297_2 = 1;
                    stackIn_300_0 = stackOut_297_0;
                    stackIn_300_1 = stackOut_297_1;
                    stackIn_300_2 = stackOut_297_2;
                    statePc = 300;
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (hd) (Object) stackIn_299_0;
                    stackOut_299_1 = stackIn_299_1;
                    stackOut_299_2 = 0;
                    stackIn_300_0 = stackOut_299_0;
                    stackIn_300_1 = stackOut_299_1;
                    stackIn_300_2 = stackOut_299_2;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    ((hd) (Object) stackIn_300_0).b(stackIn_300_1, stackIn_300_2 != 0);
                    ni.field_l.field_b.h((byte) 71);
                    stackOut_300_0 = null;
                    stackIn_301_0 = stackOut_300_0;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (stackIn_301_0 == (Object) (Object) uv.field_i) {
                        statePc = 323;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if ((ac.field_b.field_sb ^ -1) != -1) {
                        statePc = 307;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 307: {
                    gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (ua.field_k.field_sb == 0) {
                        statePc = 312;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    gs.field_e = true;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    if (-1 == (em.field_d.field_sb ^ -1)) {
                        statePc = 316;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    td.field_b = true;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if ((kt.field_i.field_sb ^ -1) != -1) {
                        statePc = 319;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 319: {
                    td.field_b = false;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    ma.a(param1, (byte) -57, uv.field_i, false);
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var6_int = ((lu) this).field_o << 1243163011;
                        param3 = (15 & var6_int) + (param3 << -448835164);
                        var7 = ((lu) this).field_v << 576627171;
                        param0 = (param0 << 510368324) + (var7 & 15);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((lu) this).a(var6_int, var7, param3, param0, param2, param4);
                        if (param1 == 24407) {
                            statePc = 7;
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
                        lu.a(false, 46, 70, true, false);
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) runtimeException, "lu.EB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(hu param0, String param1, int param2, String[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param0.a(param1);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param4 ^ -1) > (var5_int ^ -1)) {
                            statePc = 8;
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
                        if (param1.indexOf("<br>") != -1) {
                            statePc = 8;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param3[0] = param1;
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (param4 + var5_int - 1) / param4;
                        param4 = var5_int / var6;
                        var6 = 0;
                        var7 = 0;
                        var8 = param1.length();
                        if (param2 == -46) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 59;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var9 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var8 ^ -1) >= (var9 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = param1.charAt(var9);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = -33;
                        stackOut_14_1 = var10 ^ -1;
                        stackIn_33_0 = stackOut_14_0;
                        stackIn_33_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var13 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 == stackIn_15_1) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = var10;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((stackIn_19_0 ^ -1) == -46) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = param1.substring(var7, 1 + var9).trim();
                        var12 = param0.a(var11);
                        if ((var12 ^ -1) > (param4 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = 1 + var9;
                        var6++;
                        param3[var6] = var11;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-63 != (var10 ^ -1)) {
                            statePc = 31;
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
                        if (!param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
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
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6++;
                        param3[var6] = param1.substring(var7, -3 + var9).trim();
                        var7 = 1 + var9;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9++;
                        if (var13 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var8;
                        stackOut_32_1 = var7;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= stackIn_33_1) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6++;
                        param3[var6] = param1.substring(var7, var8).trim();
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = var6;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0;
                }
                case 39: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    try {
                        stackOut_40_0 = (RuntimeException) var5;
                        stackOut_40_1 = new StringBuilder().append("lu.FB(");
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_43_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (param0 == null) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                        stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                        stackOut_41_2 = "{...}";
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_44_2 = stackOut_41_2;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 43: {
                    stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                    stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                    stackOut_43_2 = "null";
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                        stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44);
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (param1 == null) {
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
                        stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                        stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                        stackOut_45_2 = "{...}";
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_48_2 = stackOut_45_2;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 47: {
                    stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                    stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                    stackOut_47_2 = "null";
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    try {
                        stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                        stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param2).append(44);
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        if (param3 == null) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                        stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                        stackOut_49_2 = "{...}";
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_52_2 = stackOut_49_2;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 51: {
                    stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                    stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                    stackOut_51_2 = "null";
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    throw nb.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void g(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -28) {
                break L0;
              } else {
                lu.a(47, -58);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_p = null;
          field_t = null;
          field_r = null;
          field_u = null;
          field_x = null;
        }
    }

    lu() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_r = "Type your age in years";
        field_u = "Only show private chat from my friends and opponents";
    }
}
