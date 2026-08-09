/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int[] field_b;
    static String[] field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 68) {
            field_a = (String[]) null;
        }
    }

    final static void a(int param0, int param1, byte param2, tq param3, boolean param4) {
        tq stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean stackIn_37_2 = false;
        int stackIn_37_3 = 0;
        tq stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean stackIn_38_2 = false;
        int stackIn_38_3 = 0;
        tq stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        boolean stackIn_39_2 = false;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_58_0 = 0;
        cj stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        cj stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        int stackIn_98_4 = 0;
        cj stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        int stackIn_99_5 = 0;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        RuntimeException stackIn_223_0 = null;
        StringBuilder stackIn_223_1 = null;
        String stackIn_223_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        th var10 = null;
        int var11_int = 0;
        Object var11 = null;
        dm var12 = null;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        Object var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        tq var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var31 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var5_int = 0;
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    if (null == mh.field_c) {
                        statePc = 36;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (null != ch.field_g) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (sd.field_G != null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (r.field_c != null) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != na.field_J) {
                        statePc = 7;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var9 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var9 >= kj.field_h) {
                        statePc = 36;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var10_int = mh.field_c.field_Zb[var9] & 255;
                    if (var31 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (null == ch.field_g) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (ch.field_g[var9] != null) {
                        statePc = 13;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!ch.field_g[var9][var10_int]) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5_int = 1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (sd.field_G == null) {
                        statePc = 23;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (null == sd.field_G[var9]) {
                        statePc = 23;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var11_int = sd.field_G[var9][var10_int];
                    if (var11_int == 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!bo.field_e) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5_int = 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var11_int <= var6) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var6 = var11_int;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (null == r.field_c) {
                        statePc = 32;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (r.field_c[var9] != null) {
                        statePc = 26;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var11_int = r.field_c[var9][var10_int];
                    if (var11_int <= var7) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7 = var11_int;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var11_int == 0) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (!bo.field_e) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var5_int = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (null == na.field_J) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (null == na.field_J[var9]) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var8 = var8 | na.field_J[var9][var10_int];
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var9++;
                    if (var31 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (tq) (param3);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = 2;
                    stackIn_37_1 = stackIn_38_1;
                    stackIn_38_2 = param4;
                    stackIn_37_2 = stackIn_38_2;
                    stackIn_38_3 = (2 + jk.field_f) * 2;
                    stackIn_37_3 = stackIn_38_3;
                    if (vc.field_d != param3) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (tq) ((Object) stackIn_37_0);
                    stackIn_39_1 = stackIn_37_1;
                    stackIn_39_2 = stackIn_37_2;
                    stackIn_39_3 = stackIn_37_3;
                    stackIn_39_4 = 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (tq) ((Object) stackIn_38_0);
                    stackIn_39_1 = stackIn_38_1;
                    stackIn_39_2 = stackIn_38_2;
                    stackIn_39_3 = stackIn_38_3;
                    stackIn_39_4 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (!((tq) (Object) stackIn_39_0).a(stackIn_39_1, stackIn_39_2, stackIn_39_3, stackIn_39_4 != 0, 4 * (2 + jk.field_f) * param0, param2 ^ -126)) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var9 = stackIn_42_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var10 = param3.field_Gb.field_Cb;
                    var11 = null;
                    var12 = (dm) ((Object) var10.c(124));
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var12 == null) {
                        statePc = 217;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var13 = 0;
                    if (var31 != 0) {
                        statePc = 224;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var12.field_Cb == null) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12.field_Ub = new cj(0L, m.field_x);
                    var12.a((byte) 50, var12.field_Ub);
                    var12.field_Gb = new cj(0L, wc.field_H);
                    if (tb.field_u) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12.a((byte) 50, var12.field_Gb);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var12.field_Gb.field_R = 2;
                    var12.field_Hb = new cj(0L, vo.field_m);
                    var12.a((byte) 50, var12.field_Hb);
                    var12.f(-128);
                    var12.field_Tb = new cj(0L, fd.field_O);
                    var12.a((byte) 50, var12.field_Tb);
                    var12.field_cc = new cj(0L, de.field_f);
                    var12.a((byte) 50, var12.field_cc);
                    var13 = 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var12.field_Ub.field_wb = null;
                    var14 = var12.field_Ub;
                    var12.field_Ub.field_z = 0;
                    var12.field_Gb.field_wb = null;
                    var14.field_zb = 0;
                    var15 = var12.field_Gb;
                    var12.field_Gb.field_z = 0;
                    var12.field_Tb.field_wb = null;
                    var15.field_zb = 0;
                    var12.field_Tb.field_z = 0;
                    var16 = var12.field_Tb;
                    var16.field_zb = 0;
                    var12.field_cc.field_wb = null;
                    var17 = var12.field_cc;
                    var12.field_cc.field_z = 0;
                    var17.field_zb = 0;
                    var12.field_Hb.field_wb = null;
                    var18 = var12.field_Hb;
                    var12.field_Hb.field_z = 0;
                    var18.field_zb = 0;
                    var12.field_zb = param3.field_Gb.field_zb;
                    var19 = 0;
                    var33 = var12.field_Lb;
                    var20 = var33;
                    var20 = var33;
                    var21 = 72;
                    if (param3 == hf.field_e) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var21 += 42;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var34 = fm.a(var12.field_Ub.field_yb, var33, var21);
                    var20 = var34;
                    var20 = var34;
                    var20 = var34;
                    if (var34.equals(var12.field_Lb)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = 1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var22 = stackIn_58_0;
                    if (-5 < (var12.field_Yb ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var20 = "<img=" + (-4 + (var12.field_Yb + hg.field_ub)) + ">" + var34;
                    if (var31 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (-1 > (var12.field_Yb ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var20 = "<img=" + (var12.field_Yb + -1) + ">" + var20;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var12.field_Ub.field_wb = var20;
                    if (!var12.c((byte) 15)) {
                        statePc = 65;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var23_int = 16764006;
                    var24_int = 16777215;
                    if (var5_int == 0) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (!var12.field_Nb) {
                        statePc = 72;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var6 > var12.field_Mb) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var12.field_Sb < var7) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (((var12.field_Vb ^ -1) & var8) <= 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var23_int = 8414771;
                    var24_int = 8421504;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var12.field_Tb.field_M = var23_int;
                    var12.field_Gb.field_M = var23_int;
                    var12.field_Ub.field_M = var23_int;
                    var12.field_Ub.field_Db = var24_int;
                    var12.field_Ub.field_xb = var24_int;
                    var12.field_Ub.field_ob = var24_int;
                    var12.field_Gb.field_Db = var24_int;
                    var12.field_Gb.field_xb = var24_int;
                    var12.field_Gb.field_ob = var24_int;
                    var12.field_Tb.field_Db = var24_int;
                    var12.field_Tb.field_xb = var24_int;
                    var12.field_Tb.field_ob = var24_int;
                    if (param3 == bf.field_n) {
                        statePc = 82;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var12.field_Pb) {
                        statePc = 80;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var12.field_Ob) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var12.field_Tb.field_wb = nn.field_a;
                    if (var31 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var12.field_Ub.field_wb = vl.a(oi.field_b, new String[]{var20}, 2);
                    var12.field_Tb.field_wb = df.field_J;
                    var12.field_cc.field_wb = bn.field_a;
                    if (var31 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var12.field_Ub.field_wb = vl.a(ke.field_a, new String[]{var20}, 2);
                    var12.field_cc.field_wb = gk.field_a;
                    if (var31 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (!mh.field_c.field_Fb) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var12.field_cc.field_wb = me.field_d;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var25_int = 0;
                    if (null == mh.field_c) {
                        statePc = 96;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (!hl.b(param2 ^ 45)) {
                        statePc = 96;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if ((ie.field_sb ^ -1L) == (var12.field_ec ^ -1L)) {
                        statePc = 96;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (null == var12.field_Tb.field_wb) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var26 = var12.field_Tb.e(param2 + -45) + 2 * nj.field_h;
                    var12.field_Tb.a(jk.field_f, var19, var26, var25_int, -3344);
                    var25_int = var25_int + var26;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (null != var12.field_cc.field_wb) {
                        statePc = 92;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (bf.field_n == param3) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var26 = var12.field_cc.e(0) - -(2 * nj.field_h);
                    if (var31 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var26 = 40;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var12.field_cc.a(jk.field_f, var19, var26, var25_int, -3344);
                    var25_int = var25_int + var26;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    stackIn_98_0 = var12.field_Ub;
                    stackIn_97_0 = stackIn_98_0;
                    stackIn_98_1 = jk.field_f;
                    stackIn_97_1 = stackIn_98_1;
                    stackIn_98_2 = var19;
                    stackIn_97_2 = stackIn_98_2;
                    stackIn_98_3 = -var25_int;
                    stackIn_97_3 = stackIn_98_3;
                    stackIn_98_4 = var12.field_zb;
                    stackIn_97_4 = stackIn_98_4;
                    if (!tb.field_u) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_99_0 = (cj) ((Object) stackIn_97_0);
                    stackIn_99_1 = stackIn_97_1;
                    stackIn_99_2 = stackIn_97_2;
                    stackIn_99_3 = stackIn_97_3;
                    stackIn_99_4 = stackIn_97_4;
                    stackIn_99_5 = 42;
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackIn_99_0 = (cj) ((Object) stackIn_98_0);
                    stackIn_99_1 = stackIn_98_1;
                    stackIn_99_2 = stackIn_98_2;
                    stackIn_99_3 = stackIn_98_3;
                    stackIn_99_4 = stackIn_98_4;
                    stackIn_99_5 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    ((cj) (Object) stackIn_99_0).a(stackIn_99_1, stackIn_99_2, stackIn_99_3 + (stackIn_99_4 - stackIn_99_5), var25_int, -3344);
                    var12.field_Gb.field_wb = Integer.toString(var12.field_Mb);
                    var12.field_Gb.a(jk.field_f, var19, 40, var12.field_zb - 40, -3344);
                    if (!var12.field_Ub.field_L) {
                        statePc = 102;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var22 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (!var12.field_Ub.field_L) {
                        statePc = 111;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (rl.field_h == null) {
                        statePc = 111;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (null != rl.field_h[var12.field_Yb]) {
                        statePc = 106;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 106: {
                    ui.field_j = rl.field_h[var12.field_Yb];
                    if (var31 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    ui.field_j = var12.field_Lb;
                    if (null == rl.field_h) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (null != rl.field_h[var12.field_Yb]) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    ui.field_j = ui.field_j + " - " + rl.field_h[var12.field_Yb];
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var19 = var19 + jk.field_f;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var23 = ua.a((byte) -61, var12.field_Fb, var20);
                    var24 = var23;
                    var24 = var23;
                    if (var23 == null) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var24_int = var12.field_Hb.field_yb.b(var23, -nj.field_h + (var12.field_zb + -nj.field_h));
                    var12.field_Hb.field_wb = var23;
                    var12.field_Hb.field_Y = 256 * var12.field_bc / so.field_r;
                    var12.field_Hb.a(jk.field_f * var24_int, var19, -(2 * nj.field_h) + var12.field_zb, nj.field_h, -3344);
                    var19 = var19 + jk.field_f * var24_int;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (var9 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var12.field_I = -var12.field_z + var19;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var13 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    param3.field_Gb.a(2, var12, 1300, (cj) (var11));
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (-1 == (var12.field_T ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var12.c((byte) 15)) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var12.field_Tb.field_T != 0) {
                        statePc = 127;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var12.field_cc.field_T == 0) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    cg.a(param1, -27404, var12.field_ec);
                    if (var31 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    wl.a(ka.field_t, param3, 0, 0, (byte) 81, vb.field_f, var12);
                    if (var31 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    so.a(-21148, var12.field_ec, param1);
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (!var12.field_pb) {
                        statePc = 216;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var12.c((byte) 15)) {
                        statePc = 216;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var24 = null;
                    if ((var12.field_ec ^ -1L) == (ie.field_sb ^ -1L)) {
                        statePc = 148;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (var5_int == 0) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var12.field_Nb) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var24 = vl.a(op.field_n, new String[]{var20}, 2);
                    statePc = 163;
                    continue stateLoop;
                }
                case 134: {
                    if (var12.field_Sb < var7) {
                        statePc = 145;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var6 <= var12.field_Mb) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var24 = vl.a(ek.field_y, new String[]{var20, Integer.toString(var6)}, 2);
                    statePc = 163;
                    continue stateLoop;
                }
                case 137: {
                    if (0 != ((var12.field_Vb ^ -1) & var8)) {
                        statePc = 139;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var25_int = vl.a(var8 & (var12.field_Vb ^ -1), (byte) -103);
                    var24 = vl.a(ap.field_r, new String[]{var20}, 2);
                    if ((var25_int ^ -1) >= -1) {
                        statePc = 163;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (null == ki.field_o) {
                        statePc = 163;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (var25_int > ki.field_o.length) {
                        statePc = 163;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (null != ki.field_o[var25_int - 1]) {
                        statePc = 144;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var24 = vl.a(ki.field_o[var25_int + -1][2], new String[]{var20}, param2 + -43);
                    statePc = 163;
                    continue stateLoop;
                }
                case 145: {
                    var25_int = var7 + -var12.field_Sb;
                    if (-2 != (var25_int ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var24 = vl.a(ce.field_o, new String[]{var20}, 2);
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    var24 = vl.a(bg.field_m, new String[]{var20, Integer.toString(var25_int)}, 2);
                    statePc = 163;
                    continue stateLoop;
                }
                case 148: {
                    if (var5_int == 0) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (var12.field_Nb) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var24 = lj.field_s;
                    statePc = 163;
                    continue stateLoop;
                }
                case 151: {
                    if (var7 > var12.field_Sb) {
                        statePc = 160;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var12.field_Mb < var6) {
                        statePc = 159;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (((var12.field_Vb ^ -1) & var8) == 0) {
                        statePc = 163;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var25_int = vl.a(var8 & (var12.field_Vb ^ -1), (byte) -103);
                    var24 = af.field_c;
                    if (0 >= var25_int) {
                        statePc = 163;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (ki.field_o == null) {
                        statePc = 163;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (ki.field_o.length < var25_int) {
                        statePc = 163;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (ki.field_o[var25_int - 1] == null) {
                        statePc = 163;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var24 = ki.field_o[-1 + var25_int][1];
                    statePc = 163;
                    continue stateLoop;
                }
                case 159: {
                    var24 = vl.a(oi.field_a, new String[]{null, Integer.toString(var6)}, 2);
                    statePc = 163;
                    continue stateLoop;
                }
                case 160: {
                    var25_int = -var12.field_Sb + var7;
                    if ((var25_int ^ -1) != -2) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var24 = jk.field_a;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    var24 = vl.a(ij.field_f, new String[]{null, Integer.toString(var25_int)}, 2);
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (var24 != null) {
                        statePc = 165;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var35 = "<col=A00000>" + (String) (var24);
                    var30 = var35;
                    var25 = var30;
                    var24 = var25;
                    var30 = var35;
                    var25 = var30;
                    var24 = var35;
                    var30_ref = var24;
                    var25 = var30_ref;
                    var24 = var25;
                    var30_ref = var24;
                    var25 = var30_ref;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (var27_int >= kj.field_h) {
                        statePc = 202;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var28 = mh.field_c.field_Zb[var27_int] & 255;
                    var29 = 0;
                    if (var31 != 0) {
                        statePc = 205;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (ch.field_g == null) {
                        statePc = 173;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (ch.field_g[var27_int] == null) {
                        statePc = 173;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (!ch.field_g[var27_int][var28]) {
                        statePc = 173;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var12.field_Nb) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var29 = 1;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (sd.field_G == null) {
                        statePc = 182;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (sd.field_G[var27_int] == null) {
                        statePc = 182;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var30_int = sd.field_G[var27_int][var28];
                    if (var30_int == 0) {
                        statePc = 179;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (bo.field_e) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var12.field_Nb) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var29 = 1;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (var12.field_Mb < var30_int) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var29 = 1;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (null == r.field_c) {
                        statePc = 191;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (r.field_c[var27_int] == null) {
                        statePc = 191;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var30_int = r.field_c[var27_int][var28];
                    if (var30_int == 0) {
                        statePc = 189;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (bo.field_e) {
                        statePc = 189;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (!var12.field_Nb) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var29 = 1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (var30_int <= var12.field_Sb) {
                        statePc = 191;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var29 = 1;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (na.field_J == null) {
                        statePc = 197;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (na.field_J[var27_int] != null) {
                        statePc = 194;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (-1 != (na.field_J[var27_int][var28] & (var12.field_Vb ^ -1) ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var29 = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (var29 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var30 = "<col=A00000>" + cf.field_f[var27_int] + "</col>";
                    var25 = var30;
                    var24 = var25;
                    var25 = var30;
                    if (var25 == null) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var25 = (String) (var25) + ", " + var30;
                    var26 = 1;
                    if (var31 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var25 = var30;
                    var24 = var25;
                    var24 = var25;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    var27_int++;
                    if (var31 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (bf.field_n != param3) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if (hl.b(0)) {
                        statePc = 208;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (var26 != 0) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var24 = var35 + "<br>" + vl.a(dg.field_L, new String[]{(String) (var25)}, 2);
                    if (var31 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var24 = (String) (var24) + "<br>" + mb.field_u + (String) (var25);
                    if (var31 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var26 != 0) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var24 = (String) (var24) + "<br>" + vl.a(od.field_Cb, new String[]{(String) (var25)}, 2);
                    if (var31 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var24 = (String) (var24) + "<br>" + mc.field_b + (String) (var25);
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if (bf.field_n != param3) {
                        statePc = 215;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (!hl.b(0)) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var27 = mh.field_c.field_Nb;
                    var24 = (String) (var24) + "<br>" + vl.a(mj.field_Ob, new String[]{var27}, param2 + -43);
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    ui.field_j = (String) (var24);
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    var11 = var12;
                    var12 = (dm) ((Object) var10.b(6));
                    if (var31 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (param2 == 45) {
                        statePc = 224;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var32 = (tq) null;
                    vi.a(80, -48, (byte) -35, (tq) null, false);
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, vg param1, byte param2) {
        ga var3 = ma.field_a;
        if (param2 > -120) {
            return;
        }
        try {
            var3.b((byte) -35, param0);
            var3.a(119, param1.field_i);
            var3.a(-21, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_b = new int[8192];
    }
}
