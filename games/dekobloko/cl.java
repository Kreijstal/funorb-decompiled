/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends bh {
    static w field_n;
    static ke field_B;
    int field_q;
    int field_z;
    int field_t;
    int[][] field_u;
    static w field_C;
    int field_w;
    String[][] field_x;
    boolean field_A;
    static gk field_r;
    static String field_s;
    static ql field_v;
    int field_p;
    static ji field_y;
    int field_o;

    final static void a(int param0, int param1, int param2, nm param3, boolean param4) {
        nm stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        nm stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        nm stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        w stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        w stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        w stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        RuntimeException stackIn_222_0 = null;
        StringBuilder stackIn_222_1 = null;
        String stackIn_222_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vj var10 = null;
        int var11_int = 0;
        Object var11 = null;
        tj var12 = null;
        int var13 = 0;
        w var14 = null;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
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
        hl var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var31 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var5_int = 0;
                    var6 = 0;
                    if (param1 == -17339) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var32 = (hl) null;
                    cl.a((hl) null, true);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var7 = 0;
                    var8 = 0;
                    if (cd.field_m == null) {
                        statePc = 38;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (cb.field_e != null) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (mg.field_Ob != null) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (ik.field_h != null) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (null != af.field_b) {
                        statePc = 9;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var9 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (j.field_b <= var9) {
                        statePc = 38;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var10_int = 255 & cd.field_m.field_kc[var9];
                    if (var31 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (cb.field_e == null) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (cb.field_e[var9] == null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (!cb.field_e[var9][var10_int]) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5_int = 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (mg.field_Ob == null) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (null != mg.field_Ob[var9]) {
                        statePc = 19;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11_int = mg.field_Ob[var9][var10_int];
                    if (-1 == (var11_int ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (uc.field_a) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5_int = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var11_int <= var6) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6 = var11_int;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (af.field_b == null) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (null == af.field_b[var9]) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var8 = var8 | af.field_b[var9][var10_int];
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (ik.field_h == null) {
                        statePc = 37;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (null != ik.field_h[var9]) {
                        statePc = 30;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var11_int = ik.field_h[var9][var10_int];
                    if (var7 < var11_int) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var7 = var11_int;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (-1 == (var11_int ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!uc.field_a) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var5_int = 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var9++;
                    if (var31 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = (nm) (param3);
                    stackIn_39_0 = stackIn_40_0;
                    stackIn_40_1 = kf.field_O * 2 - -4;
                    stackIn_39_1 = stackIn_40_1;
                    stackIn_40_2 = param0 * (8 + kf.field_O * 4);
                    stackIn_39_2 = stackIn_40_2;
                    stackIn_40_3 = param1 + 2109;
                    stackIn_39_3 = stackIn_40_3;
                    if (param3 != ki.field_w) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (nm) ((Object) stackIn_39_0);
                    stackIn_41_1 = stackIn_39_1;
                    stackIn_41_2 = stackIn_39_2;
                    stackIn_41_3 = stackIn_39_3;
                    stackIn_41_4 = 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = (nm) ((Object) stackIn_40_0);
                    stackIn_41_1 = stackIn_40_1;
                    stackIn_41_2 = stackIn_40_2;
                    stackIn_41_3 = stackIn_40_3;
                    stackIn_41_4 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (!((nm) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4 != 0, 2, param4)) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var9 = stackIn_44_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var10 = param3.field_Ob.field_M;
                    var11 = null;
                    var12 = (tj) ((Object) var10.c((byte) 25));
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var12 == null) {
                        statePc = 223;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var13 = 0;
                    if (var31 != 0) {
                        statePc = 224;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var12.field_M == null) {
                        statePc = 50;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12.field_Zb = new w(0L, gg.field_G);
                    var12.a(var12.field_Zb, -16834);
                    var12.field_Tb = new w(0L, fc.field_f);
                    if (!pd.field_a) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var12.a(var12.field_Tb, -16834);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var12.field_Tb.field_X = 2;
                    var12.field_gc = new w(0L, ua.field_H);
                    var12.a(var12.field_gc, -16834);
                    var12.d(-117);
                    var12.field_Wb = new w(0L, lj.field_c);
                    var12.a(var12.field_Wb, param1 + 505);
                    var12.field_Ob = new w(0L, gk.field_Hb);
                    var12.a(var12.field_Ob, -16834);
                    var13 = 1;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var12.field_Zb.field_Y = null;
                    var14 = var12.field_Zb;
                    var12.field_Zb.field_N = 0;
                    var14.field_mb = 0;
                    var12.field_Tb.field_Y = null;
                    var15 = var12.field_Tb;
                    var12.field_Tb.field_N = 0;
                    var15.field_mb = 0;
                    var12.field_Wb.field_Y = null;
                    var12.field_Wb.field_N = 0;
                    var16 = var12.field_Wb;
                    var16.field_mb = 0;
                    var12.field_Ob.field_Y = null;
                    var12.field_Ob.field_N = 0;
                    var17 = var12.field_Ob;
                    var12.field_gc.field_Y = null;
                    var17.field_mb = 0;
                    var18 = var12.field_gc;
                    var12.field_gc.field_N = 0;
                    var18.field_mb = 0;
                    var12.field_mb = param3.field_Ob.field_mb;
                    var19 = 0;
                    var33 = var12.field_Yb;
                    var20 = var33;
                    var20 = var33;
                    var21 = 72;
                    if (ec.field_k != param3) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var21 += 42;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var34 = mm.a(var12.field_Zb.field_J, var33, var21);
                    var20 = var34;
                    var20 = var34;
                    var20 = var34;
                    if (var34.equals(var12.field_Yb)) {
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
                    if (var12.field_dc >= 4) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var12.field_dc <= 0) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var20 = "<img=" + (var12.field_dc - 1) + ">" + var34;
                    if (var31 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var20 = "<img=" + (n.field_c + -4 + var12.field_dc) + ">" + var20;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var12.field_Zb.field_Y = var20;
                    if (!var12.g((byte) 101)) {
                        statePc = 64;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var23_int = 16764006;
                    var24_int = 16777215;
                    if (var5_int == 0) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (!var12.field_ec) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var12.field_Ub < var6) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var12.field_Xb < var7) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (-1 <= ((var12.field_Sb ^ -1) & var8 ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var24_int = 8421504;
                    var23_int = 8414771;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var12.field_Zb.field_rb = var24_int;
                    var12.field_Zb.field_fb = var24_int;
                    var12.field_Zb.field_Bb = var24_int;
                    var12.field_Wb.field_G = var23_int;
                    var12.field_Tb.field_G = var23_int;
                    var12.field_Zb.field_G = var23_int;
                    var12.field_Tb.field_rb = var24_int;
                    var12.field_Tb.field_fb = var24_int;
                    var12.field_Tb.field_Bb = var24_int;
                    var12.field_Wb.field_rb = var24_int;
                    var12.field_Wb.field_fb = var24_int;
                    var12.field_Wb.field_Bb = var24_int;
                    if (param3 == tb.field_b) {
                        statePc = 81;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var12.field_bc) {
                        statePc = 79;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (!var12.field_fc) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var12.field_Zb.field_Y = cm.a((byte) 91, ad.field_A, new String[]{var20});
                    var12.field_Wb.field_Y = uc.field_f;
                    var12.field_Ob.field_Y = ql.field_f;
                    if (var31 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var12.field_Wb.field_Y = a.field_l;
                    if (var31 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var12.field_Zb.field_Y = cm.a((byte) 116, lb.field_i, new String[]{var20});
                    var12.field_Ob.field_Y = fc.field_g;
                    if (var31 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (!cd.field_m.field_lc) {
                        statePc = 83;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var12.field_Ob.field_Y = bn.field_a;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var25_int = 0;
                    if (cd.field_m == null) {
                        statePc = 95;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (!ig.b(true)) {
                        statePc = 95;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if ((var12.field_cc ^ -1L) == (uc.field_g ^ -1L)) {
                        statePc = 95;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (null != var12.field_Wb.field_Y) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var26 = var12.field_Wb.a(true) + nk.field_b * 2;
                    var12.field_Wb.a(var26, 0, var19, kf.field_O, var25_int);
                    var25_int = var25_int + var26;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (null == var12.field_Ob.field_Y) {
                        statePc = 95;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (param3 != tb.field_b) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var26 = 40;
                    if (var31 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var26 = var12.field_Ob.a(true) - -(2 * nk.field_b);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var12.field_Ob.a(var26, param1 + 17339, var19, kf.field_O, var25_int);
                    var25_int = var25_int + var26;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    stackIn_97_0 = var12.field_Zb;
                    stackIn_96_0 = stackIn_97_0;
                    stackIn_97_1 = var12.field_mb;
                    stackIn_96_1 = stackIn_97_1;
                    if (pd.field_a) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackIn_98_0 = (w) ((Object) stackIn_96_0);
                    stackIn_98_1 = stackIn_96_1;
                    stackIn_98_2 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = (w) ((Object) stackIn_97_0);
                    stackIn_98_1 = stackIn_97_1;
                    stackIn_98_2 = 42;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    ((w) (Object) stackIn_98_0).a(stackIn_98_1 + -stackIn_98_2 + -var25_int, 0, var19, kf.field_O, var25_int);
                    var12.field_Tb.field_Y = Integer.toString(var12.field_Ub);
                    var12.field_Tb.a(40, param1 + 17339, var19, kf.field_O, var12.field_mb + -40);
                    if (!var12.field_Zb.field_jb) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var22 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (!var12.field_Zb.field_jb) {
                        statePc = 110;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (vj.field_e == null) {
                        statePc = 110;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (null != vj.field_e[var12.field_dc]) {
                        statePc = 105;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 105: {
                    sl.field_g = vj.field_e[var12.field_dc];
                    if (var31 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    sl.field_g = var12.field_Yb;
                    if (null == vj.field_e) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (null != vj.field_e[var12.field_dc]) {
                        statePc = 109;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 109: {
                    sl.field_g = sl.field_g + " - " + vj.field_e[var12.field_dc];
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    var19 = var19 + kf.field_O;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var23 = je.a(var20, var12.field_hc, (byte) -128);
                    var24 = var23;
                    var24 = var23;
                    if (var23 == null) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var24_int = var12.field_gc.field_J.a(var23, -nk.field_b + var12.field_mb - nk.field_b);
                    var12.field_gc.field_wb = 256 * var12.field_Qb / oa.field_a;
                    var12.field_gc.field_Y = var23;
                    var12.field_gc.a(var12.field_mb + -(nk.field_b * 2), 0, var19, kf.field_O * var24_int, nk.field_b);
                    var19 = var19 + var24_int * kf.field_O;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (var9 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var12.field_F = -var12.field_N + var19;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (var13 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 118: {
                    param3.field_Ob.a((w) (var11), var12, 2, 0);
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var12.field_ob == 0) {
                        statePc = 128;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var12.g((byte) 101)) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (0 == var12.field_Wb.field_ob) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    bn.a(var12.field_cc, param2, (byte) -84);
                    if (var31 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (0 != var12.field_Ob.field_ob) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    fl.a(0, var12, param3, he.field_S, 0, param1 ^ 17358, nf.field_h);
                    if (var31 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    mn.a(true, var12.field_cc, param2);
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var11 = var12;
                    if (!var12.field_Kb) {
                        statePc = 217;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var12.g((byte) 111)) {
                        statePc = 217;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var24 = null;
                    if ((uc.field_g ^ -1L) == (var12.field_cc ^ -1L)) {
                        statePc = 150;
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
                    if (!var12.field_ec) {
                        statePc = 149;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var12.field_Xb >= var7) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var25_int = -var12.field_Xb + var7;
                    if ((var25_int ^ -1) == -2) {
                        statePc = 137;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var24 = cm.a((byte) 93, qf.field_m, new String[]{var20});
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    var24 = cm.a((byte) 99, kn.field_n, new String[]{var20, Integer.toString(var25_int)});
                    statePc = 166;
                    continue stateLoop;
                }
                case 139: {
                    if (var12.field_Ub >= var6) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var24 = cm.a((byte) 98, wm.field_i, new String[]{var20, Integer.toString(var6)});
                    statePc = 166;
                    continue stateLoop;
                }
                case 141: {
                    if (0 != ((var12.field_Sb ^ -1) & var8)) {
                        statePc = 143;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var25_int = wb.b((byte) -120, var8 & (var12.field_Sb ^ -1));
                    var24 = cm.a((byte) 91, ci.field_f, new String[]{var20});
                    if ((var25_int ^ -1) >= -1) {
                        statePc = 166;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (lc.field_e == null) {
                        statePc = 166;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (lc.field_e.length < var25_int) {
                        statePc = 166;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (lc.field_e[var25_int - 1] != null) {
                        statePc = 148;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var24 = cm.a((byte) 93, lc.field_e[-1 + var25_int][2], new String[]{var20});
                    statePc = 166;
                    continue stateLoop;
                }
                case 149: {
                    var24 = cm.a((byte) 92, in.field_s, new String[]{var20});
                    statePc = 166;
                    continue stateLoop;
                }
                case 150: {
                    if (var5_int == 0) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var12.field_ec) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var24 = rn.field_a;
                    statePc = 166;
                    continue stateLoop;
                }
                case 153: {
                    if (var12.field_Xb >= var7) {
                        statePc = 158;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var25_int = -var12.field_Xb + var7;
                    if (var25_int == 1) {
                        statePc = 156;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var24 = oa.field_d;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    var24 = cm.a((byte) 118, lb.field_a, new String[]{null, Integer.toString(var25_int)});
                    statePc = 166;
                    continue stateLoop;
                }
                case 158: {
                    if (var12.field_Ub >= var6) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var24 = cm.a((byte) 90, gd.field_a, new String[]{null, Integer.toString(var6)});
                    statePc = 166;
                    continue stateLoop;
                }
                case 160: {
                    if ((var8 & (var12.field_Sb ^ -1)) == 0) {
                        statePc = 166;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var25_int = wb.b((byte) -94, var8 & (var12.field_Sb ^ -1));
                    var24 = tm.field_e;
                    if ((var25_int ^ -1) >= -1) {
                        statePc = 166;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (lc.field_e == null) {
                        statePc = 166;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var25_int > lc.field_e.length) {
                        statePc = 166;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (lc.field_e[-1 + var25_int] == null) {
                        statePc = 166;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var24 = lc.field_e[var25_int - 1][1];
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (var24 != null) {
                        statePc = 168;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 168: {
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
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (var27_int >= j.field_b) {
                        statePc = 205;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var28 = cd.field_m.field_kc[var27_int] & 255;
                    var29 = 0;
                    if (var31 != 0) {
                        statePc = 210;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (cb.field_e == null) {
                        statePc = 176;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (null == cb.field_e[var27_int]) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (!cb.field_e[var27_int][var28]) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (var12.field_ec) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var29 = 1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (null == mg.field_Ob) {
                        statePc = 186;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (mg.field_Ob[var27_int] != null) {
                        statePc = 179;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var30_int = mg.field_Ob[var27_int][var28];
                    if (var30_int == 0) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (uc.field_a) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (!var12.field_ec) {
                        statePc = 183;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var29 = 1;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (var30_int <= var12.field_Ub) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var29 = 1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (ik.field_h == null) {
                        statePc = 195;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (ik.field_h[var27_int] == null) {
                        statePc = 195;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var30_int = ik.field_h[var27_int][var28];
                    if (0 == var30_int) {
                        statePc = 193;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (uc.field_a) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (!var12.field_ec) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var29 = 1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (var30_int <= var12.field_Xb) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var29 = 1;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (null == af.field_b) {
                        statePc = 200;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (af.field_b[var27_int] != null) {
                        statePc = 198;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (((var12.field_Sb ^ -1) & af.field_b[var27_int][var28]) == 0) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var29 = 1;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (var29 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var30 = "<col=A00000>" + pa.field_db[var27_int] + "</col>";
                    var25 = var30;
                    var25 = var30;
                    if (var25 != null) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var25 = var30;
                    if (var31 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var26 = 1;
                    var25 = (String) (var25) + ", " + var30;
                    var24 = var25;
                    var24 = var25;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    var27_int++;
                    if (var31 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (param3 != tb.field_b) {
                        statePc = 210;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (!ig.b(true)) {
                        statePc = 210;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var26 != 0) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var24 = var35 + "<br>" + cm.a((byte) 111, ci.field_b, new String[]{(String) (var25)});
                    if (var31 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var24 = (String) (var24) + "<br>" + pb.field_k + (String) (var25);
                    if (var31 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (var26 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var24 = (String) (var24) + "<br>" + cm.a((byte) 101, fj.field_i, new String[]{(String) (var25)});
                    if (var31 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var24 = (String) (var24) + "<br>" + am.field_b + (String) (var25);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (tb.field_b != param3) {
                        statePc = 216;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (ig.b(true)) {
                        statePc = 216;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var27 = cd.field_m.field_Vb;
                    var24 = (String) (var24) + "<br>" + cm.a((byte) 116, jf.field_b, new String[]{var27});
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    sl.field_g = (String) (var24);
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    var12 = (tj) ((Object) var10.d(true));
                    if (var31 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    return;
                }
                case 224: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, int param1, int param2, String param3, int param4) {
        wj.field_Mb.field_G = param2;
        wj.field_Mb.field_T = param0;
        wj.field_Mb.field_mb = wj.field_Mb.field_mb + jb.field_f.field_mb;
        wj.field_Mb.field_Y = param3;
        jb.field_f.field_vb = jb.field_f.field_vb + jb.field_f.field_mb;
        if (param4 != -24503) {
            return;
        }
        try {
            jb.field_f.field_mb = param1;
            wj.field_Mb.field_mb = wj.field_Mb.field_mb - jb.field_f.field_mb;
            jb.field_f.field_vb = jb.field_f.field_vb - jb.field_f.field_mb;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void c(byte param0) {
        field_y = null;
        field_v = null;
        field_B = null;
        field_r = null;
        if (param0 != -39) {
          return;
        } else {
          field_C = null;
          field_n = null;
          field_s = null;
          return;
        }
    }

    final static void a(boolean param0) {
        int stackIn_20_0 = 0;
        String stackIn_25_0 = null;
        int stackIn_29_0 = 0;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        cc stackIn_46_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = fc.field_a;
                        var2 = 0;
                        if (bc.field_B == 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_long = ik.a(4) - di.field_F;
                        var2 = (int)((10999L - var3_long) / 1000L);
                        if (-1 >= (var2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = 0;
                        if (param0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_B = (ke) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 >= rk.field_P.length) {
                            statePc = 56;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = k.field_g[var3];
                        if (var10 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 > var4) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 != k.field_f.field_h) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = gn.field_a;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = wa.field_c;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = wm.field_l;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = rk.field_P[var3];
                        if ((bc.field_B ^ -1) != -3) {
                            statePc = 35;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var2 ^ -1) == -2) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (vb.field_U.length <= tg.field_g.length) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = vb.field_U.length;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = tg.field_g.length;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = stackIn_20_0;
                        if (var3 < 6) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var7 + 6 <= var3) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_25_0 = tg.field_g[-6 + (var3 - -tg.field_g.length - var7)];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = "";
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (wb.field_Qb.length <= dh.field_b.length) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_29_0 = wb.field_Qb.length;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = dh.field_b.length;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = stackIn_29_0;
                        if (var7 + 7 > var3) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var8 + 7 + var7 <= var3) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-7 + (var3 - var7) >= dh.field_b.length) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = dh.field_b[-7 + var3 + -var7];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = "";
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6 = stackIn_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var4 == -2) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6 = Integer.toString(var2);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = 0;
                        stackIn_39_0 = stackIn_40_0;
                        stackIn_40_1 = (String) (var6);
                        stackIn_39_1 = stackIn_40_1;
                        if ((var4 ^ -1) > -1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_41_0 = stackIn_39_0;
                        stackIn_41_1 = (String) ((Object) stackIn_39_1);
                        stackIn_41_2 = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = stackIn_40_0;
                        stackIn_41_1 = (String) ((Object) stackIn_40_1);
                        stackIn_41_2 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = si.a(stackIn_41_0 != 0, stackIn_41_1, stackIn_41_2 != 0);
                        var8 = -(var7 >> -906219967) + qk.field_d;
                        if ((var4 ^ -1) <= -1) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var1_int = var1_int + qk.field_m;
                        if (k.field_f.field_h != var4) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_46_0 = nf.field_g;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = da.field_c;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = stackIn_46_0;
                        if (var9 != null) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9.a(var7 - -(mb.field_c << -795183135), 102, var8 + -mb.field_c, var1_int, (pa.field_Y << 327376481) + cc.field_a);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var1_int = var1_int + pa.field_Y;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (0 <= var4) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        rk.field_R.a(var6, var8, nd.field_b + var1_int, var5, -1);
                        var1_int = var1_int + ke.field_d;
                        if (var10 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        bg.field_g.a(var6, var8, a.field_k + var1_int, var5, -1);
                        var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var3++;
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "cl.D(" + param0 + ')');
                }
                case 56: {
                    return;
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(hl param0, boolean param1) {
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.field_h != null) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  cl.c((byte) -122);
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (param0.field_i != 0) {
                        break L5;
                      } else {
                        if (param0.field_n == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2_int = 0;
                    L6: while (true) {
                      if (var2_int >= ic.field_c) {
                        break L4;
                      } else {
                        var3 = pd.field_g[var2_int];
                        stackIn_20_0 = -3;

                        if (var4 != 0) {
                          break L3;
                        } else {
                          L7: {
                            if (stackIn_20_0 != (var3.field_m ^ -1)) {
                              break L7;
                            } else {
                              if (var3.field_i != param0.field_i) {
                                break L7;
                              } else {
                                if (var3.field_n != param0.field_n) {
                                  break L7;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (param0.field_q != null) {
                    wf.field_o = param0.field_q;
                    he.field_Y = param0.field_o;
                    stackIn_20_0 = param0.field_m;
                    break L3;
                  } else {
                    break L2;
                  }
                }
                uh.field_d = stackIn_20_0;
                ng.field_a = param0.field_r;
                break L2;
              }
              rb.a(param0, -3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("cl.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    cl() {
    }

    static {
        field_s = "Rated game";
    }
}
