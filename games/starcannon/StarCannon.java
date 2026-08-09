/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class StarCannon extends ag {
    private int field_D;
    static int[] field_y;
    static String field_C;
    static int field_z;
    private int field_B;
    static char field_E;
    public static int field_A;

    private final void t(int param0) {
        if (!(null == fb.field_g)) {
            vb.a(fb.field_g, 30962);
            fb.field_g = null;
            tc.j(param0 ^ -23491);
        }
        lj.field_h = b.a(false, 1);
        nd.field_p = b.a(false, 2);
        if (param0 != -23523) {
            return;
        }
        se.field_l = b.a(false, 3);
        jg.field_F = b.a(false, 4);
        cb.field_c = b.a(false, 5);
        ej.a(fi.field_f, lf.field_eb, param0 + 23396);
    }

    private final void b(int param0, int param1) {
        id dupTemp$0 = null;
        id dupTemp$1 = null;
        d stackIn_3_0 = null;
        d stackIn_14_0 = null;
        Object stackIn_27_0 = null;
        d stackIn_27_1 = null;
        d stackIn_37_0 = null;
        Object stackIn_48_0 = null;
        d stackIn_48_1 = null;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        d stackIn_147_0 = null;
        Object stackIn_152_0 = null;
        d stackIn_152_1 = null;
        d stackIn_158_0 = null;
        Object stackIn_163_0 = null;
        d stackIn_163_1 = null;
        int statePc = 0;
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        id[] var10_ref_id__ = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        id[] var14 = null;
        bf var15 = null;
        String var16 = null;
        String var17 = null;
        int[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = field_A;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-4001 >= (var3 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_147_0 = qc.field_c[var3];
                    stackIn_3_0 = stackIn_147_0;
                    if (false) {
                        statePc = 147;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 == null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-5 == (qc.field_c[var3].field_h ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    qc.field_c[var3].a(320 + -fi.field_e.field_f, 123);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var3++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 8: {
                    param0 = 100 + -param0 >> 2113265346;
                    if ((qc.field_d ^ -1) > -2) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    fh.field_q.d(0, vd.field_j, 640, 480, 128);
                    fh.field_q.d(0, -480 + vd.field_j, 640, 480, 128);
                    statePc = 19;
                    continue stateLoop;
                }
                case 11: {
                    var3 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-4001 >= (var3 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_147_0 = qc.field_c[var3];
                    stackIn_14_0 = stackIn_147_0;
                    if (false) {
                        statePc = 147;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-4 == (qc.field_c[var3].field_h ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    qc.field_c[var3].a(320 + -fi.field_e.field_f, -91);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var3++;
                    statePc = 12;
                    continue stateLoop;
                }
                case 19: {
                    if (param1 == 7306) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    var15 = (bf) ((Object) kh.field_y.c(-3905));
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var15 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var15.a(65535, 320 - fi.field_e.field_f);
                    var15 = (bf) ((Object) kh.field_y.a(-16913));
                    statePc = 22;
                    continue stateLoop;
                }
                case 24: {
                    var3 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (-4001 >= (var3 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_163_0 = null;
                    stackIn_27_0 = stackIn_163_0;
                    stackIn_163_1 = qc.field_c[var3];
                    stackIn_27_1 = stackIn_163_1;
                    if (false) {
                        statePc = 163;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 == stackIn_27_1) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (qc.field_c[var3].field_h == 2) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (qc.field_c[var3].field_h == 3) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (qc.field_c[var3].field_h != 4) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    qc.field_c[var3].a(-fi.field_e.field_f + 320, 54);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var3++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 34: {
                    var3 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (-4001 >= (var3 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_147_0 = qc.field_c[var3];
                    stackIn_37_0 = stackIn_147_0;
                    if (false) {
                        statePc = 147;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 == null) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (-3 == (qc.field_c[var3].field_h ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    qc.field_c[var3].b(-fi.field_e.field_f + 320, 128);
                    qc.field_c[var3].a(-fi.field_e.field_f + 320, param1 ^ 7322);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var3++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 42: {
                    if (-3 == (qc.field_d ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    gi.a(param1 + -7302);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var3 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if ((var3 ^ -1) <= -4001) {
                        statePc = 53;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = null;
                    stackIn_48_1 = qc.field_c[var3];
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 == stackIn_48_1) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (2 == qc.field_c[var3].field_h) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                    qc.field_c[var3].a(320 - fi.field_e.field_f, -56);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var3++;
                    statePc = 46;
                    continue stateLoop;
                }
                case 53: {
                    if ((gj.field_c ^ -1) < 0) {
                        statePc = 55;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var3 = af.field_y.a(vk.field_w);
                    ba.a(24, gb.field_v, (byte) -127, -var3 + 604 - 17, 17 + var3, 455 + param0);
                    nb.a(param0 + 455, (byte) 122, var3 - -17, ma.field_e, -17 + -var3 + 604, 128, 24);
                    af.field_y.c(vk.field_w, 596, 472 + param0, 16777215, -1);
                    ba.a(24, ma.field_a, (byte) 21, 604, 35, 455 - -param0);
                    nb.a(455 - -param0, (byte) 122, 35, ha.field_a, 604, 128, 24);
                    vb.field_l.e(609, param0 + 460);
                    af.field_y.a(Integer.toString(gj.field_c), 626, 472 - -param0, 16777215, -1);
                    var4_ref_String = be.field_b;
                    var5 = 65535;
                    var6 = 32896;
                    if ((qb.field_e ^ -1) != -2) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var5 = 65280;
                    var6 = 32768;
                    var4_ref_String = b.field_d;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if ((qb.field_e ^ -1) == -3) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var4_ref_String = ve.field_g;
                    var5 = 16776960;
                    var6 = 16711680;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var7 = 6;
                    if (-2 != (rj.field_h ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var7 = 10;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if ((rj.field_h ^ -1) == -3) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var7 = 16;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (3 == rj.field_h) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var7 = 17;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var3 = af.field_y.a(var4_ref_String);
                    ba.a(24, gb.field_v, (byte) -122, 1, var3 - -17, 455 - -param0);
                    nb.a(param0 + 455, (byte) 122, var3 + 17, ma.field_e, 1, 128, 24);
                    af.field_y.a(var4_ref_String, 10, 472 - -param0, 16777215, -1);
                    var8 = 23 + var3;
                    ba.a(24, ma.field_a, (byte) -115, var8 - 5, 10 + var7 * 5, param0 + 455);
                    nb.a(param0 + 455, (byte) 122, 10 + var7 * 5, ha.field_a, var8 + -5, 128, 24);
                    var9 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var7 <= var9) {
                        statePc = 76;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_77_0 = var9 ^ -1;
                    stackIn_71_0 = stackIn_77_0;
                    stackIn_77_1 = sd.field_c ^ -1;
                    stackIn_71_1 = stackIn_77_1;
                    if (false) {
                        statePc = 77;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0 <= stackIn_71_1) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    ki.d(var8, 460 - -param0, 4, 14, var5);
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    ki.d(var8, 465 + param0, 4, 4, var5);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var8 += 5;
                    var9++;
                    statePc = 69;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = ie.field_C ^ -1;
                    stackIn_77_1 = -1;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (stackIn_77_0 >= stackIn_77_1) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var9 = -(af.field_y.field_p / 2) + af.field_w[16 + qb.field_e].field_e + -16;
                    dupTemp$0 = af.field_w[qb.field_e + 16];
                    dupTemp$0.field_f = dupTemp$0.field_f + var9;
                    var16 = p.field_e;
                    var14 = new id[1];
                    var10_ref_id__ = var14;
                    var14[0] = af.field_w[16 + qb.field_e];
                    af.field_y.a(var10_ref_id__, (int[]) null);
                    af.field_y.a(var16, 319, 48, var6, -1, 256 - param0 * 10);
                    af.field_y.a(var16, 321, 48, var5, -1, -(param0 * 10) + 256);
                    af.field_y.a(var16, 320, 47, var5, -1, -(10 * param0) + 256);
                    af.field_y.a(var16, 320, 49, var6, -1, -(param0 * 10) + 256);
                    af.field_y.a(var16, 320, 48, 16777215, -1, -(param0 * 10) + 256);
                    dupTemp$1 = af.field_w[qb.field_e + 16];
                    dupTemp$1.field_f = dupTemp$1.field_f - var9;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var9 = 10 * ia.field_k;
                    if (nf.field_l == 0) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var9 = var9 >> 2;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (nf.field_l == 2) {
                        statePc = 84;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var9 = var9 << 1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (!a.field_a) {
                        statePc = 87;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var3 = af.field_y.a(rd.field_o);
                    ba.a(24, gb.field_v, (byte) -118, -var3 + 311, 17 + var3, -param0 + 1);
                    nb.a(1 + -param0, (byte) 122, var3 + 17, ma.field_e, 311 - var3, 128, 24);
                    af.field_y.c(rd.field_o, 320, -param0 + 18, 16777215, -1);
                    var17 = Integer.toString(var9);
                    var3 = 11 + af.field_y.a(var17);
                    var11 = 5 - var3 % 5;
                    if ((var11 ^ -1) > -6) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var3 = var3 + var11;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    ba.a(24, ma.field_a, (byte) -113, 328, var3, -param0 + 1);
                    nb.a(-param0 + 1, (byte) 122, var3, ha.field_a, 328, 128, 24);
                    af.field_y.a(var17, 333, -param0 + 18, 16777215, -1);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (ua.field_c >= -2) {
                        statePc = 116;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (-1 != (gj.field_c ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if ((fi.field_e.field_k ^ -1) != -1) {
                        statePc = 95;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10_ref_String = "";
                    if (-1 == (rj.field_h ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var10_ref_String = eg.field_i;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (-2 == (rj.field_h ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var10_ref_String = ig.field_c;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (2 == rj.field_h) {
                        statePc = 103;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var10_ref_String = qc.field_a;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (3 != rj.field_h) {
                        statePc = 107;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (-3 != (nf.field_l ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var10_ref_String = vf.field_a;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (rj.field_h != 4) {
                        statePc = 115;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if ((u.field_d ^ -1) >= -1) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if ((nf.field_l ^ -1) == -1) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (1 == nf.field_l) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var10_ref_String = jg.field_I + var9;
                    statePc = 115;
                    continue stateLoop;
                }
                case 112: {
                    var10_ref_String = d.field_n + var9 + eh.field_c;
                    statePc = 115;
                    continue stateLoop;
                }
                case 113: {
                    var10_ref_String = d.field_n + var9 + jf.field_b;
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    var10_ref_String = bc.field_l + var9 + sb.field_o;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    af.field_y.a(var10_ref_String, 0, 0, 640, 480, 16777215, -1, -(10 * param0) + 256, 1, 1, af.field_y.field_p);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (tj.field_C > 0) {
                        statePc = 118;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var3 = 255 * dl.field_a / tj.field_C;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    if ((var3 ^ -1) <= -129) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var4 = 255;
                    var5 = var3 * 2;
                    statePc = 121;
                    continue stateLoop;
                }
                case 120: {
                    var5 = 255;
                    var4 = -(var3 * 2) + 256 + 255;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var6 = (var4 << -303548560) - -(var5 << 590704456);
                    var7 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var7 >= var3) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_133_0 = var7 ^ -1;
                    stackIn_124_0 = stackIn_133_0;
                    stackIn_133_1 = -11;
                    stackIn_124_1 = stackIn_133_1;
                    if (false) {
                        statePc = 133;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 > stackIn_124_1) {
                        statePc = 129;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var7 > -10 + var3) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (10 != var7) {
                        statePc = 130;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    ki.d(-(var3 >> -1169524703) + (320 - -var7) - 5, 27, 10 + (var3 - 20), 11, var6);
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    ki.c(320 + (var7 - (var3 >> -964598463)), 32, 5, var6, 255 - Math.abs(var7 + -(var3 >> -1593881151)));
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var7++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 131: {
                    af.field_y.a(s.field_h, 319, 38, 0, -1, var3);
                    af.field_y.a(s.field_h, 321, 38, 0, -1, var3);
                    af.field_y.a(s.field_h, 320, 37, 0, -1, var3);
                    af.field_y.a(s.field_h, 320, 39, 0, -1, var3);
                    af.field_y.a(s.field_h, 320, 38, 16777215, -1, var3);
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_133_0 = 0;
                    stackIn_133_1 = fi.field_e.field_k;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 != stackIn_133_1) {
                        statePc = 144;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (gj.field_c != 0) {
                        statePc = 144;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (fi.field_e.field_r >= 25) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var3 = fi.field_e.field_r << -1364493758;
                    statePc = 140;
                    continue stateLoop;
                }
                case 137: {
                    if (165 >= fi.field_e.field_r) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var3 = 190 + -fi.field_e.field_r << 1456085122;
                    statePc = 140;
                    continue stateLoop;
                }
                case 139: {
                    var3 = 100;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    var4 = a.field_b.a(ne.field_i);
                    var5 = -60 + (-var4 + 640) >> 1811619073;
                    var6 = -var5 + 640;
                    var7 = var6 + -var5;
                    var8 = 210;
                    var9 = 270;
                    var10 = var9 + var8 >> 1317138177;
                    var9 = (var10 * (-var3 + 100) - -(var3 * var9)) / 100;
                    var8 = (var8 * var3 + var10 * (100 - var3)) / 100;
                    var11 = var9 + (-var8 + 5);
                    if (var11 <= 0) {
                        statePc = 144;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var21 = new int[4];
                    ki.a(var21);
                    ki.c(var5, var8, var5 + var7, var8 - -var11);
                    ki.b(var5 - -19, 14 + var8, var7 - 38, -28 + var11, 0, 128);
                    ba.a(var11, rd.field_p, (byte) 115, var5, var7, var8);
                    sb.a(true, var7, 10596798, 0, var8, 16711680, var5, var11 >> -162264255);
                    sb.a(true, var7, 0, 10596798, (var11 >> -679206815) + var8, 16711680, var5, -(var11 >> 278882529) + var11);
                    ki.c(var5 + 19, var8 + 14, var7 + (var5 + -19), -14 + (var11 + var8));
                    a.field_b.b(ne.field_i, 320, (a.field_b.field_p + -a.field_b.field_q >> -93328063) + 240, 16777215, -1);
                    ki.b(var21);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    return;
                }
                case 147: {
                    ((d) (Object) stackIn_147_0).a(320 - fi.field_e.field_f, -56);
                    statePc = 151;
                    continue stateLoop;
                }
                case 148: {
                    qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                    stackIn_147_0 = qc.field_c[var3];
                    statePc = 147;
                    continue stateLoop;
                }
                case 149: {
                    if (2 == qc.field_c[var3].field_h) {
                        statePc = 148;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var3++;
                    statePc = 155;
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0 == stackIn_152_1) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_152_0 = null;
                    stackIn_152_1 = qc.field_c[var3];
                    statePc = 152;
                    continue stateLoop;
                }
                case 155: {
                    if ((var3 ^ -1) <= -4001) {
                        statePc = 53;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 158: {
                    ((d) (Object) stackIn_158_0).a(320 - fi.field_e.field_f, -56);
                    statePc = 162;
                    continue stateLoop;
                }
                case 159: {
                    qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                    stackIn_158_0 = qc.field_c[var3];
                    statePc = 158;
                    continue stateLoop;
                }
                case 160: {
                    if (2 == qc.field_c[var3].field_h) {
                        statePc = 159;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var3++;
                    statePc = 166;
                    continue stateLoop;
                }
                case 163: {
                    if (stackIn_163_0 == stackIn_163_1) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 165: {
                    stackIn_163_0 = null;
                    stackIn_163_1 = qc.field_c[var3];
                    statePc = 163;
                    continue stateLoop;
                }
                case 166: {
                    if ((var3 ^ -1) <= -4001) {
                        statePc = 53;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        L0: {
          gj.field_c = gj.field_c + 1;
          dg.field_l = 0;
          mj.a(96, 12, 0, 23, 100);
          mj.a(255, 12, 1200, 45, 100);
          if (param0) {
            break L0;
          } else {
            this.q(-66);
            break L0;
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (param0) {
            field_E = 'B';
        }
        if (param2) {
            var4++;
        }
        return el.field_A[var4];
    }

    final void n(int param0) {
        int var3;
        L0: {
          var3 = field_A;
          if ((ha.field_c ^ -1) != -1) {
            if (ha.field_c == 1) {
              pf.field_d = pf.field_d + 1;
              dg.field_l = 0;
              ha.field_c = 2;
              mj.a(96, 12, 0, 31, 100);
              mj.a(255, 12, 1200, 36, 100);
              break L0;
            } else {
              if (1 < ha.field_c) {
                L1: {
                  ha.field_c = ha.field_c + 1;
                  pf.field_d = pf.field_d + 1;
                  if (ha.field_c != 5) {
                    break L1;
                  } else {
                    li.a(-115, new bf(0, -128, -40, 14));
                    li.a(-126, new bf(0, -128, 40, 14));
                    if (hh.field_c == 1) {
                      ph.a(249, false, 6);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                dg.field_l = 0;
                mj.a(96, param0 + 12, 0, 31, 100);
                mj.a(255, 12, 1200, 36, 100);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            pf.field_d = pf.field_d + 1;
            ha.field_c = 1;
            li.a(-119, new bf(0, -128, -24, 6));
            li.a(param0 ^ -124, new bf(0, -128, 24, 6));
            dg.field_l = 0;
            mj.a(96, 12, 0, 31, 100);
            mj.a(255, 12, 1200, 36, 100);
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            field_E = 'ﾌ';
            break L2;
          }
        }
    }

    final void q(int param0) {
        int var3;
        ue var4;
        L0: {
          var3 = field_A;
          if (param0 == -19049) {
            break L0;
          } else {
            var4 = (ue) null;
            StarCannon.a((ue) null, false, 0, (ue) null, (ue) null);
            break L0;
          }
        }
        L1: {
          if ((bf.field_w ^ -1) != -1) {
            if ((bf.field_w ^ -1) != -2) {
              if ((bf.field_w ^ -1) <= -5) {
                if ((hh.field_c ^ -1) == -1) {
                  hh.field_c = 1;
                  li.a(param0 ^ 18960, new bf(0, -128, 0, 13));
                  dg.field_l = 0;
                  mj.a(96, 12, 0, 46, 100);
                  mj.a(255, param0 ^ -19045, 1200, 38, 100);
                  if (ha.field_c != 5) {
                    break L1;
                  } else {
                    ph.a(249, false, 6);
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                bf.field_w = bf.field_w + 1;
                dg.field_l = 0;
                pf.field_d = pf.field_d + 1;
                mj.a(96, 12, 0, 29, 100);
                mj.a(255, 12, 1200, 40, 100);
                break L1;
              }
            } else {
              bf.field_w = 2;
              dg.field_l = 0;
              pf.field_d = pf.field_d + 1;
              mj.a(96, 12, 0, 29, 100);
              mj.a(255, 12, 1200, 40, 100);
              break L1;
            }
          } else {
            bf.field_w = 1;
            pf.field_d = pf.field_d + 1;
            li.a(-121, new bf(0, -128, 0, 8));
            dg.field_l = 0;
            mj.a(96, 12, 0, 29, 100);
            mj.a(255, param0 ^ -19045, 1200, 40, 100);
            break L1;
          }
        }
    }

    public final void init() {
        this.a(-15028, 10, "starcannon");
    }

    private final void p(int param0) {
        bf stackIn_43_0 = null;
        bf stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        bf stackIn_53_0 = null;
        bf stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        bf stackIn_63_0 = null;
        bf stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        bf stackIn_71_0 = null;
        bf stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        bf var6;
        int var7;
        bf var7_ref_bf;
        bf var8;
        int var9;
        L0: {
          var9 = field_A;
          var2 = ua.field_c - -5;
          if ((5 + ue.field_c[rj.field_h] ^ -1) <= (var2 ^ -1)) {
            break L0;
          } else {
            if ((ue.field_c[rj.field_h] ^ -1) > (ua.field_c ^ -1)) {
              break L0;
            } else {
              var2 = 5 + ue.field_c[rj.field_h];
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var3 = sh.b(-126, 640);
            var4 = -64 + fi.field_e.field_f - -sh.b(38, 128);
            var5 = null;
            var7 = var2;
            if (-2 == (var7 ^ -1)) {
              break L2;
            } else {
              if ((var7 ^ -1) == -3) {
                break L2;
              } else {
                if ((var7 ^ -1) == -4) {
                  break L2;
                } else {
                  if (4 != var7) {
                    L3: {
                      if (var7 != 5) {
                        L4: {
                          if (9 != var7) {
                            if (11 != var7) {
                              if (-7 != (var7 ^ -1)) {
                                if ((var7 ^ -1) == -11) {
                                  nf.field_e = nf.field_e + 250;
                                  var7_ref_bf = new bf(320, -256, var4, 15);
                                  kh.field_y.b(69, var7_ref_bf);
                                  dg.field_l = 0;
                                  ua.field_c = 6;
                                  mj.a(255, 12, 0, 41, 100);
                                  ti.field_f.a(kc.field_P);
                                  kc.field_P.f();
                                  kc.field_P = fl.field_h;
                                  ti.field_f.b(kc.field_P);
                                  kc.field_P.a(mc.field_b);
                                  break L1;
                                } else {
                                  if (7 != var7) {
                                    L5: {
                                      if (-9 != (var7 ^ -1)) {
                                        if ((var7 ^ -1) != -14) {
                                          L6: {
                                            if (var7 == 12) {
                                              break L6;
                                            } else {
                                              if (14 == var7) {
                                                break L6;
                                              } else {
                                                if (-16 != (var7 ^ -1)) {
                                                  break L1;
                                                } else {
                                                  var6 = new bf(320, -256, var4, 16);
                                                  kh.field_y.b(97, var6);
                                                  tj.field_C = var6.field_k;
                                                  ua.field_c = 1 + ue.field_c[rj.field_h];
                                                  dg.field_l = 0;
                                                  pf.field_d = pf.field_d + 1;
                                                  mj.a(255, param0 ^ -244, 0, 41, 100);
                                                  ti.field_f.a(kc.field_P);
                                                  kc.field_P.f();
                                                  kc.field_P = fl.field_h;
                                                  ti.field_f.b(kc.field_P);
                                                  kc.field_P.a(mc.field_b);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                          nf.field_e = 175;
                                          kh.field_y.b(82, new bf(var3, -64, var4, 4));
                                          break L1;
                                        } else {
                                          break L5;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    nf.field_e = 0;
                                    var4 = sh.b(-128, 128) + (var3 + -64);
                                    var7 = 0;
                                    L7: while (true) {
                                      if (5 <= var7) {
                                        break L3;
                                      } else {
                                        L8: {
                                          L9: {
                                            var8 = new bf(var3, 64 * -var7 + -64, var4, 2);
                                            stackIn_71_0 = (bf) (var8);

                                            if (1 == var7) {
                                              break L9;
                                            } else {
                                              stackIn_71_0 = (bf) ((Object) stackIn_71_0);

                                              if (-5 == (var7 ^ -1)) {
                                                break L9;
                                              } else {
                                                stackIn_72_0 = (bf) ((Object) stackIn_71_0);
                                                stackIn_72_1 = 1;
                                                break L8;
                                              }
                                            }
                                          }
                                          stackIn_72_0 = (bf) ((Object) stackIn_71_0);
                                          stackIn_72_1 = 0;
                                          break L8;
                                        }
                                        L10: {
                                          stackIn_72_0.field_p = stackIn_72_1 != 0;
                                          var8.field_h = (bf) (var5);
                                          if (-1 != (var7 ^ -1)) {
                                            break L10;
                                          } else {
                                            var5 = var8;
                                            break L10;
                                          }
                                        }
                                        kh.field_y.b(param0 ^ -145, var8);
                                        var7++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    nf.field_e = 0;
                                    var7 = 0;
                                    L11: while (true) {
                                      if (-6 >= (var7 ^ -1)) {
                                        break L1;
                                      } else {
                                        L12: {
                                          L13: {
                                            var8 = new bf(var3, 64 * -var7 + -64, var4, 1);
                                            stackIn_63_0 = (bf) (var8);

                                            if (-2 == (var7 ^ -1)) {
                                              break L13;
                                            } else {
                                              stackIn_63_0 = (bf) ((Object) stackIn_63_0);

                                              if ((var7 ^ -1) == -5) {
                                                break L13;
                                              } else {
                                                stackIn_64_0 = (bf) ((Object) stackIn_63_0);
                                                stackIn_64_1 = 1;
                                                break L12;
                                              }
                                            }
                                          }
                                          stackIn_64_0 = (bf) ((Object) stackIn_63_0);
                                          stackIn_64_1 = 0;
                                          break L12;
                                        }
                                        stackIn_64_0.field_p = stackIn_64_1 != 0;
                                        kh.field_y.b(101, var8);
                                        var7++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              } else {
                                nf.field_e = nf.field_e + 250;
                                var7_ref_bf = new bf(320, -256, var4, 11);
                                kh.field_y.b(param0 ^ -170, var7_ref_bf);
                                dg.field_l = 0;
                                ua.field_c = 2;
                                mj.a(255, 12, 0, 41, 100);
                                ti.field_f.a(kc.field_P);
                                kc.field_P.f();
                                kc.field_P = fl.field_h;
                                ti.field_f.b(kc.field_P);
                                kc.field_P.a(mc.field_b);
                                break L1;
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        nf.field_e = 0;
                        var7 = -8;
                        L14: while (true) {
                          if (-9 >= (var7 ^ -1)) {
                            break L1;
                          } else {
                            L15: {
                              L16: {
                                var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                                stackIn_53_0 = (bf) (var8);

                                if (1 == var7) {
                                  break L16;
                                } else {
                                  stackIn_53_0 = (bf) ((Object) stackIn_53_0);

                                  if (-5 == (var7 ^ -1)) {
                                    break L16;
                                  } else {
                                    stackIn_54_0 = (bf) ((Object) stackIn_53_0);
                                    stackIn_54_1 = 1;
                                    break L15;
                                  }
                                }
                              }
                              stackIn_54_0 = (bf) ((Object) stackIn_53_0);
                              stackIn_54_1 = 0;
                              break L15;
                            }
                            stackIn_54_0.field_p = stackIn_54_1 != 0;
                            kh.field_y.b(123, var8);
                            var7++;
                            continue L14;
                          }
                        }
                      } else {
                        nf.field_e = 0;
                        var4 = sh.b(param0 + 129, 128) + (var3 + -64);
                        var7 = 0;
                        L17: while (true) {
                          if ((var7 ^ -1) <= -6) {
                            break L3;
                          } else {
                            L18: {
                              L19: {
                                var8 = new bf(var3, 64 * -var7 - 64, var4, 2);
                                var8.field_h = (bf) (var5);
                                stackIn_43_0 = (bf) (var8);

                                if (var7 == 1) {
                                  break L19;
                                } else {
                                  stackIn_43_0 = (bf) ((Object) stackIn_43_0);

                                  if (-5 == (var7 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackIn_44_0 = (bf) ((Object) stackIn_43_0);
                                    stackIn_44_1 = 1;
                                    break L18;
                                  }
                                }
                              }
                              stackIn_44_0 = (bf) ((Object) stackIn_43_0);
                              stackIn_44_1 = 0;
                              break L18;
                            }
                            L20: {
                              stackIn_44_0.field_p = stackIn_44_1 != 0;
                              if ((var7 ^ -1) != -1) {
                                break L20;
                              } else {
                                var5 = var8;
                                break L20;
                              }
                            }
                            kh.field_y.b(param0 ^ -138, var8);
                            var7++;
                            continue L17;
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    nf.field_e = var2 * 25 + 75;
                    kh.field_y.b(122, new bf(var3, -64, var4, 4));
                    break L1;
                  }
                }
              }
            }
          }
          nf.field_e = var2 * 25 + 75;
          kh.field_y.b(122, new bf(var3, -64, var4, 4));
          break L1;
        }
        L21: {
          if (param0 == -256) {
            break L21;
          } else {
            field_y = (int[]) null;
            break L21;
          }
        }
    }

    private final void o(int param0) {
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        bf var6;
        int var7;
        Object var7_ref;
        bf var8;
        int var8_int;
        bf var9;
        int var10;
        L0: {
          var10 = field_A;
          var2 = sh.b(-128, 3) + ua.field_c;
          if (ue.field_c[rj.field_h] >= var2) {
            break L0;
          } else {
            if (ue.field_c[rj.field_h] < ua.field_c) {
              break L0;
            } else {
              var2 = ue.field_c[rj.field_h];
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            field_C = (String) null;
            break L1;
          }
        }
        L2: {
          var3 = sh.b(-126, 640);
          var4 = -64 + (fi.field_e.field_f - -sh.b(91, 128));
          if (var2 != 6) {
            break L2;
          } else {
            if (!gi.field_g) {
              break L2;
            } else {
              var2 = 12;
              break L2;
            }
          }
        }
        L3: {
          L4: {
            var7 = var2;
            if (0 == var7) {
              var4 = var3;
              break L4;
            } else {
              if ((var7 ^ -1) == -2) {
                break L4;
              } else {
                L5: {
                  L6: {
                    if (var7 == 2) {
                      break L6;
                    } else {
                      if (-6 == (var7 ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          if ((var7 ^ -1) == -4) {
                            break L7;
                          } else {
                            if (var7 == 9) {
                              break L7;
                            } else {
                              if ((var7 ^ -1) != -12) {
                                L8: {
                                  if (4 == var7) {
                                    break L8;
                                  } else {
                                    if (10 != var7) {
                                      if (var7 != 6) {
                                        if ((var7 ^ -1) != -8) {
                                          L9: {
                                            if (-9 != (var7 ^ -1)) {
                                              if (var7 != 13) {
                                                L10: {
                                                  if (-13 != (var7 ^ -1)) {
                                                    if ((var7 ^ -1) != -15) {
                                                      if (-16 == (var7 ^ -1)) {
                                                        var6 = new bf(320, -256, var4, 11);
                                                        kh.field_y.b(101, var6);
                                                        tj.field_C = var6.field_k;
                                                        ua.field_c = 1 + ue.field_c[rj.field_h];
                                                        pf.field_d = pf.field_d + 1;
                                                        dg.field_l = 0;
                                                        mj.a(255, 12, 0, 41, 100);
                                                        ti.field_f.a(kc.field_P);
                                                        kc.field_P.f();
                                                        kc.field_P = fl.field_h;
                                                        ti.field_f.b(kc.field_P);
                                                        kc.field_P.a(mc.field_b);
                                                        break L3;
                                                      } else {
                                                        break L3;
                                                      }
                                                    } else {
                                                      break L10;
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                nf.field_e = 175;
                                                kh.field_y.b(77, new bf(var3, -64, var4, 4));
                                                break L3;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          var5 = null;
                                          nf.field_e = 0;
                                          var4 = -64 + var3 - -sh.b(-127, 128);
                                          var7 = 0;
                                          L11: while (true) {
                                            L12: {
                                              stackIn_82_0 = var7 ^ -1;

                                              if (2 == nf.field_l) {
                                                stackIn_83_0 = stackIn_82_0;
                                                stackIn_83_1 = 10;
                                                break L12;
                                              } else {
                                                stackIn_83_0 = stackIn_82_0;
                                                stackIn_83_1 = 5;
                                                break L12;
                                              }
                                            }
                                            if (stackIn_83_0 <= (stackIn_83_1 ^ -1)) {
                                              break L3;
                                            } else {
                                              L13: {
                                                var8 = new bf(var3, -var7 * 64 - 64, var4, 2);
                                                var8.field_h = (bf) (var5);
                                                if ((var7 ^ -1) == -1) {
                                                  var5 = var8;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              kh.field_y.b(param0 + 69, var8);
                                              var7++;
                                              continue L11;
                                            }
                                          }
                                        } else {
                                          nf.field_e = 0;
                                          var7 = 0;
                                          L14: while (true) {
                                            if (var7 >= 5) {
                                              break L3;
                                            } else {
                                              kh.field_y.b(126, new bf(var3, -64 + 64 * -var7, var4, 1));
                                              var7++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      } else {
                                        nf.field_e = 100;
                                        var7_ref = null;
                                        var8_int = 0;
                                        L15: while (true) {
                                          L16: {
                                            stackIn_70_0 = var8_int;

                                            if (-3 == (nf.field_l ^ -1)) {
                                              stackIn_71_0 = stackIn_70_0;
                                              stackIn_71_1 = 2;
                                              break L16;
                                            } else {
                                              stackIn_71_0 = stackIn_70_0;
                                              stackIn_71_1 = 1;
                                              break L16;
                                            }
                                          }
                                          if (stackIn_71_0 >= stackIn_71_1) {
                                            break L5;
                                          } else {
                                            var9 = new bf(var3, -var8_int * 64 + -64, sh.b(param0 + 76, 128) - 64, 5);
                                            var9.field_h = (bf) (var7_ref);
                                            var9.field_p = true;
                                            kh.field_y.b(125, var9);
                                            var7_ref = var9;
                                            var8_int++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                nf.field_e = 0;
                                var7 = 0;
                                L17: while (true) {
                                  if ((var7 ^ -1) <= -6) {
                                    break L3;
                                  } else {
                                    kh.field_y.b(param0 ^ 74, new bf(var3, -var7 * 64 - 64, var3, 1));
                                    var7++;
                                    continue L17;
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        nf.field_e = 0;
                        var7 = -8;
                        L18: while (true) {
                          if ((var7 ^ -1) <= -9) {
                            break L3;
                          } else {
                            var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                            var8.field_p = true;
                            kh.field_y.b(107, var8);
                            var7++;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  nf.field_e = 0;
                  var7_ref = null;
                  var8_int = 0;
                  L19: while (true) {
                    L20: {
                      stackIn_50_0 = var8_int ^ -1;

                      if (-3 == (nf.field_l ^ -1)) {
                        stackIn_51_0 = stackIn_50_0;
                        stackIn_51_1 = 10;
                        break L20;
                      } else {
                        stackIn_51_0 = stackIn_50_0;
                        stackIn_51_1 = 5;
                        break L20;
                      }
                    }
                    if (stackIn_51_0 <= (stackIn_51_1 ^ -1)) {
                      break L5;
                    } else {
                      L21: {
                        var9 = new bf(var3, -var8_int * 64 + -64, var4, 2);
                        var9.field_h = (bf) (var7_ref);
                        var9.field_p = true;
                        kh.field_y.b(param0 ^ 102, var9);
                        if (var8_int == 0) {
                          var7_ref = var9;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var8_int++;
                      continue L19;
                    }
                  }
                }
                break L3;
              }
            }
          }
          nf.field_e = 0;
          var7 = 0;
          L22: while (true) {
            if ((var7 ^ -1) <= -6) {
              break L3;
            } else {
              var8 = new bf(var3, -64 + 64 * -var7, var4, 1);
              var8.field_p = true;
              kh.field_y.b(65, var8);
              var7++;
              continue L22;
            }
          }
        }
    }

    final void b(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        hb var5_ref;
        L0: {
          var5 = null;
          var4 = field_A;
          nb.field_f.d();
          ea.field_d.d();
          if (null == n.field_a) {
            break L0;
          } else {
            if (!n.field_a.field_b) {
              break L0;
            } else {
              re.a(0);
              le.b(-36);
              break L0;
            }
          }
        }
        L1: {
          stackIn_5_0 = this;

          if (n.field_a == null) {
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
            break L1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          this.b(stackIn_6_1 != 0, -1);
          if (param0 == 320) {
            break L2;
          } else {
            this.a(-100);
            break L2;
          }
        }
        L3: {
          if (fa.field_E) {
            this.t(-23523);
            fa.field_E = false;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!le.c(4)) {
            break L4;
          } else {
            this.f((byte) -90);
            if (le.c(4)) {
              if (!ai.a((byte) -78)) {
                return;
              } else {
                this.c(false, -1444);
                return;
              }
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (!ld.field_ib) {
            this.c(true, param0 ^ -1252);
            break L5;
          } else {
            if (null != oh.field_a) {
              if (oh.field_a.field_n) {
                eb.field_c = eb.field_c | oh.field_a.field_k;
                jg.field_H = jg.field_H & (oh.field_a.field_k ^ -1);
                oh.field_a = null;
                jj.i(122);
                cf.e((byte) -117);
                if (field_z != 5) {
                  break L5;
                } else {
                  if (-1 != (jg.field_H ^ -1)) {
                    break L5;
                  } else {
                    field_z = 2;
                    od.a(param0 ^ -312, 2, false);
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            } else {
              if (!gh.f(-23093)) {
                if (cb.a(false)) {
                  L6: {
                    stackIn_38_0 = this;

                    if (null == n.field_a) {
                      stackIn_39_0 = this;
                      stackIn_39_1 = 0;
                      break L6;
                    } else {
                      stackIn_39_0 = this;
                      stackIn_39_1 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var2 = u.a((ag) (this), stackIn_39_1 != 0, (byte) 112);
                    if ((var2 ^ -1) == -2) {
                      re.a(0);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-3 != (var2 ^ -1)) {
                      break L8;
                    } else {
                      L9: {
                        if (null != n.field_a) {
                          re.a(0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      nh.a(ll.b(72), 337033697);
                      break L8;
                    }
                  }
                  if (2364824 == var2) {
                    ie.g(-1);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  this.b(true);
                  break L5;
                }
              } else {
                if (-1 != (nh.field_e ^ -1)) {
                  this.b(true);
                  break L5;
                } else {
                  L10: {
                    var2 = bd.b(31380);
                    if ((var2 ^ -1) != -3) {
                      break L10;
                    } else {
                      re.a(0);
                      break L10;
                    }
                  }
                  L11: {
                    if (var2 != 3) {
                      break L11;
                    } else {
                      hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, param0 + -331, 12, true);
                      break L11;
                    }
                  }
                  L12: {
                    if (var2 == 4) {
                      vc.a(0, (byte) 60, 0);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  if (gh.f(param0 + -23413)) {
                    break L5;
                  } else {
                    fg.field_a[field_z].b(true, 0);
                    break L5;
                  }
                }
              }
            }
          }
        }
        L13: {
          if (!wk.a(34)) {
            L14: while (true) {
              var5_ref = (hb) ((Object) bh.field_e.a((byte) 39));
              if (var5_ref != null) {
                sb.a(4, (byte) -41, var5_ref);
                continue L14;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        nf.a(0, (byte) 95);
        L15: while (true) {
          if (!ll.a(s.field_k, (byte) -99)) {
            L16: {
              var2 = 0;
              if (!se.b((byte) -91)) {
                break L16;
              } else {
                var3 = this.h((byte) 58);
                if (-3 == (var3 ^ -1)) {
                  var2 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (var2 != 0) {
                ai.a(10, (hl[]) null, 240, af.field_y.field_r, (hl[]) null, a.field_b.field_q + a.field_b.field_r, a.field_b, 10, af.field_y, 320, 10, af.field_y.field_q + af.field_y.field_r, 25574, a.field_b.field_r);
                break L17;
              } else {
                break L17;
              }
            }
            return;
          } else {
            this.a(true);
            continue L15;
          }
        }
    }

    private final void c(boolean param0, int param1) {
        hl dupTemp$0 = null;
        ja var3;
        int var4_int;
        int var12;
        hl[] var15;
        Object var3_ref;
        hl[] var4;
        id[] var4_array;
        int var5_int;
        hl var5;
        Object var5_ref;
        hl var6_ref_hl;
        int var6;
        hl var7_ref_hl;
        int var7;
        hl var8_ref_hl;
        int var8;
        int[] var10;
        int var11;
        int var13;
        int var14;
        hl[] var16;
        hl var17;
        hl[] var18;
        int[] var19;
        hl[] var20;
        hl var21;
        hl[] var22;
        hl var23;
        int[] var24;
        L0: {
          var12 = field_A;
          if (param1 == -1444) {
            break L0;
          } else {
            this.b(66);
            break L0;
          }
        }
        L1: {
          o.a(false);
          if (param0) {
            ne.b(lh.field_I, 150);
            break L1;
          } else {
            break L1;
          }
        }
        if (null != gf.field_c) {
          if (null == se.field_l) {
            if (fl.field_f == null) {
              ma.a(sj.field_C, -13923, 80.0f);
              this.d((byte) 22);
              gg.field_f = ob.a("smlships", 126, "", jg.field_F);
              nd.field_j = ob.a("destroyer", -121, "", jg.field_F);
              qc.field_e = ob.a("cruiser", param1 ^ -1484, "", jg.field_F);
              gf.field_a = ob.a("cannoneer", 116, "", jg.field_F);
              dl.field_c = ob.a("playership", param1 + 1407, "", jg.field_F);
              vc.field_m = ob.a("addons", 126, "", jg.field_F);
              ob.a("glows", 118, "", jg.field_F);
              sj.field_E = ob.a("boss", -36, "", jg.field_F);
              fg.field_c = ob.a("boss2", param1 ^ 1474, "", jg.field_F);
              v.field_d = ob.a("boss3", 95, "", jg.field_F);
              af.field_w = fg.a(jg.field_F, "powerorbs", "", false);
              var15 = ob.a("shots", -75, "", jg.field_F);
              var4_int = 0;
              L2: while (true) {
                if (5 <= var4_int) {
                  var16 = ob.a("shots2", -120, "", jg.field_F);
                  var4_int = 0;
                  L3: while (true) {
                    if ((var4_int ^ -1) <= -6) {
                      var3_ref = null;
                      ie.field_B = ob.a("explosion", 120, "", jg.field_F);
                      ad.field_z = ob.a("explosionb", -63, "", jg.field_F);
                      oh.field_d = ob.a("explosionc", -105, "", jg.field_F);
                      el.field_H = new hl[5];
                      var4_int = 0;
                      L4: while (true) {
                        if (var4_int >= 5) {
                          hg.field_y.b(param1 + 1333);
                          fl.field_f = ob.a("debris", 96, "", jg.field_F);
                          var4 = new hl[40];
                          var5_int = 0;
                          L5: while (true) {
                            if ((var5_int ^ -1) <= -5) {
                              var13 = 0;
                              var5_int = var13;
                              L6: while (true) {
                                if (-13 >= (var13 ^ -1)) {
                                  fl.field_f = var4;
                                  ma.field_e = ob.a("fr_thin_sqr_in", -49, "", jg.field_F);
                                  gb.field_v = ob.a("fr_thin_sqr_ex", 119, "", jg.field_F);
                                  ha.field_a = ob.a("fr_grid_sql_in", 119, "", jg.field_F);
                                  ma.field_a = ob.a("fr_grid_sql_ex", 119, "", jg.field_F);
                                  var5 = ma.field_a[6];
                                  var6_ref_hl = ma.field_a[7];
                                  ma.field_a[8].field_q = 4;
                                  var6_ref_hl.field_q = 4;
                                  var5.field_q = 4;
                                  var7_ref_hl = ha.field_a[6];
                                  ha.field_a[8].field_q = 4;
                                  var8_ref_hl = ha.field_a[7];
                                  var8_ref_hl.field_q = 4;
                                  var7_ref_hl.field_q = 4;
                                  vb.field_l = vk.a("", param1 ^ -1534, "life_icon", jg.field_F);
                                  pk.field_e = vk.a("", 41, "main_border", jg.field_F);
                                  hf.field_i = vk.a("", 45, "main_inner", jg.field_F);
                                  rd.field_p = ob.a("menu_border", param1 ^ -1532, "", jg.field_F);
                                  jk.field_f = ob.a("menu_innerborder", 98, "", jg.field_F);
                                  var18 = ob.a("headers", 117, "", jg.field_F);
                                  fh.field_r[0] = var18[0];
                                  fh.field_r[3] = var18[3];
                                  fh.field_r[4] = var18[4];
                                  fh.field_r[2] = var18[2];
                                  fh.field_r[1] = var18[1];
                                  fh.field_r[5] = var18[5];
                                  var24 = new int[256];
                                  var19 = var24;
                                  var10 = var19;
                                  var11 = 0;
                                  L7: while (true) {
                                    if (256 <= var11) {
                                      var14 = 0;
                                      var11 = var14;
                                      L8: while (true) {
                                        if (-9 >= (var14 ^ -1)) {
                                          tc.j(param1 + 1476);
                                          return;
                                        } else {
                                          L9: {
                                            if (fh.field_r[var14] != null) {
                                              rh.field_f[var14] = cl.a(5, fh.field_r[var14], true, false, var24, 255);
                                              break L9;
                                            } else {
                                              break L9;
                                            }
                                          }
                                          var14++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      var10[var11] = w.a(var11 << -1286819065, 65303) + var11;
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var4[var13] = fl.field_f[var13];
                                  var4[12 + var13] = fl.field_f[var13].c();
                                  var4[12 + var13].a();
                                  var4[24 + var13] = fl.field_f[var13].c();
                                  var4[24 + var13].b();
                                  var13++;
                                  continue L6;
                                }
                              }
                            } else {
                              var4[36 + var5_int] = fl.field_f[var5_int - -12];
                              var5_int++;
                              continue L5;
                            }
                          }
                        } else {
                          dupTemp$0 = new hl(32, 32);
                          el.field_H[var4_int] = dupTemp$0;
                          var17 = dupTemp$0;
                          var17.e();
                          gg.field_f[-var4_int + 24].b(0, 0);
                          var17.d();
                          var4_int++;
                          continue L4;
                        }
                      }
                    } else {
                      jg.field_C[var4_int + 5] = var16[var4_int];
                      var4_int++;
                      continue L3;
                    }
                  }
                } else {
                  jg.field_C[var4_int] = var15[var4_int];
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              if (null == kj.field_y[3]) {
                ma.a(sj.field_C, -13923, 90.0f);
                this.d((byte) 22);
                vk.a("", 93, "mainmenubar", jg.field_F);
                ie.field_A = ob.a("zenon", 102, "", jg.field_F);
                vk.a("", 120, "moon", jg.field_F);
                vk.a("", param1 ^ -1487, "stars", jg.field_F);
                fh.field_q = vk.a("", param1 + 1531, "nebula", jg.field_F);
                gj.field_e = vk.a("", 125, "titlepic", jg.field_F);
                gb.field_r = vk.a("", 91, "title2", jg.field_F);
                ea.field_b[0] = vk.a("", 54, "sp0", jg.field_F);
                ea.field_b[1] = vk.a("", 116, "sp1", jg.field_F);
                ea.field_b[2] = vk.a("", 52, "sp2", jg.field_F);
                ea.field_b[3] = vk.a("", param1 + 1531, "sp3", jg.field_F);
                ea.field_b[4] = vk.a("", 43, "sp4", jg.field_F);
                ea.field_b[5] = vk.a("", 44, "sp5", jg.field_F);
                ea.field_b[6] = vk.a("", 93, "sp6", jg.field_F);
                ea.field_b[7] = vk.a("", param1 + 1497, "sp7", jg.field_F);
                ea.field_b[8] = vk.a("", 36, "sp8", jg.field_F);
                eb.field_b[0] = vk.a("", 47, "s0", jg.field_F);
                eb.field_b[1] = vk.a("", 107, "s1", jg.field_F);
                eb.field_b[2] = vk.a("", 86, "s2", jg.field_F);
                eb.field_b[3] = vk.a("", 23, "s3", jg.field_F);
                eb.field_b[4] = vk.a("", 20, "s4", jg.field_F);
                eb.field_b[5] = vk.a("", 82, "s5", jg.field_F);
                eb.field_b[6] = vk.a("", dg.a(param1, -1506), "s6", jg.field_F);
                eb.field_b[7] = vk.a("", dg.a(param1, -1419), "s7", jg.field_F);
                eb.field_b[8] = vk.a("", dg.a(param1, -1423), "s8", jg.field_F);
                eb.field_b[9] = vk.a("", 124, "s9", jg.field_F);
                eb.field_b[10] = vk.a("", param1 + 1532, "s10", jg.field_F);
                eb.field_b[11] = vk.a("", 21, "s11", jg.field_F);
                eb.field_b[12] = vk.a("", dg.a(param1, -1478), "s12", jg.field_F);
                eb.field_b[13] = vk.a("", param1 + 1523, "s13", jg.field_F);
                kj.field_y[0] = vk.a("", 76, "ap0", jg.field_F);
                kj.field_y[1] = vk.a("", 69, "ap1", jg.field_F);
                kj.field_y[2] = vk.a("", dg.a(param1, -1497), "ap2", jg.field_F);
                kj.field_y[3] = vk.a("", 100, "ap3", jg.field_F);
                tc.j(32);
                return;
              } else {
                ma.a(sj.field_C, -13923, 95.0f);
                this.d((byte) 22);
                af.field_y = od.a("", jg.field_F, "b12", param1 + 1443, cb.field_c);
                a.field_b = od.a("", jg.field_F, "font", -1, cb.field_c);
                var20 = ob.a("screenshots", -105, "", jg.field_F);
                kk.a(vk.a("", 59, "mbfg", jg.field_F), -60, wc.field_g);
                ta.a(vk.a("", param1 ^ -1510, "mb_logo", jg.field_F), param1 + 1319);
                ed.a(0, 125, 123, a.field_b, 1500, -52, 9, 9, 16777215, 0, vk.a("", 60, "mbpb", jg.field_F));
                te.a(126, var20);
                lf.field_eb = null;
                var4_array = new id[1];
                var4_array[0] = af.field_w[16 - -qb.field_e];
                af.field_y.a(var4_array, (int[]) null);
                lf.field_V = vk.a("basic", 111, "unachieved", fi.field_f);
                li.a(lf.field_V, (byte) -100);
                sc.field_a = vk.a("basic", param1 ^ -1517, "locked", fi.field_f);
                li.a(sc.field_a, (byte) -100);
                var21 = vk.a("basic", 104, "orbcoin", fi.field_f);
                var6 = a.field_b.field_p - -a.field_b.field_q;
                el.field_J = new hl(var6, var6);
                el.field_J.e();
                var21.d(0, 0, var6, var6);
                j.field_c = ob.a("achievements_lrg", param1 + 1366, "", jg.field_F);
                var5_ref = null;
                var22 = j.field_c;
                var8 = 0;
                L10: while (true) {
                  if (var8 >= var22.length) {
                    hg.field_y.b(-83);
                    jl.field_j = 5;
                    fi.field_f = null;
                    ia.field_k = 0;
                    jg.field_F = null;
                    tg.field_y = 10;
                    tj.field_G = 0;
                    pf.field_d = 1;
                    bf.field_w = 0;
                    ha.field_c = 0;
                    gj.field_c = -1;
                    jk.field_j = 0;
                    eg.field_l = 128;
                    ua.field_c = -2;
                    ha.field_d = 0;
                    vb.field_m = 1;
                    cg.field_e = 0;
                    ui.field_p = 0;
                    kd.field_C = -1;
                    fi.field_e = new bf(256, 256, 256, 0);
                    fi.field_e.field_r = 256;
                    fi.field_e.field_k = 0;
                    kh.field_y.a(-71, fi.field_e);
                    u.field_b = 0;
                    ed.field_n = 0;
                    ig.field_h = 0;
                    hc.field_c = 0;
                    nf.field_e = 0;
                    eg.field_f = new wd(fb.field_t);
                    gd.field_a = new wd(qf.field_i);
                    fl.field_h = new wd(r.field_b);
                    kc.field_P = eg.field_f;
                    kc.field_P.a(mc.field_b);
                    ti.field_f.b(kc.field_P);
                    ne.a(50, 39);
                    qd.a(1, 50);
                    fg.field_a = new jl[8];
                    pc.a(-5695);
                    var7 = 0;
                    L11: while (true) {
                      if (-9 >= (var7 ^ -1)) {
                        L12: {
                          if (!wk.a(45)) {
                            oh.field_a = og.a(4, (byte) 113);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        ld.field_ib = true;
                        tc.j(param1 + 1476);
                        return;
                      } else {
                        fg.field_a[var7] = new jl(var7);
                        var7++;
                        continue L11;
                      }
                    }
                  } else {
                    var23 = var22[var8];
                    li.a(var23, (byte) -100);
                    var8++;
                    continue L10;
                  }
                }
              }
            }
          } else {
            ma.a(nc.field_d, -13923, 75.0f);
            this.d((byte) 22);
            var3 = new ja(lj.field_h, nd.field_p);
            fb.field_t = dl.a(var3, (byte) 84, "music/star cannon level 1 final", "", se.field_l);
            qf.field_i = dl.a(var3, (byte) 66, "music/star cannon level 2 final", "", se.field_l);
            r.field_b = dl.a(var3, (byte) -82, "music/star cannon boss final", "", se.field_l);
            nd.field_p = null;
            se.field_l = null;
            lj.field_h = null;
            tc.j(32);
            return;
          }
        } else {
          L13: {
            if (!lj.field_h.b((byte) 118)) {
              break L13;
            } else {
              if (!lj.field_h.a(param1 + 31185)) {
                break L13;
              } else {
                L14: {
                  if (!nd.field_p.b((byte) 95)) {
                    break L14;
                  } else {
                    if (nd.field_p.a(29741)) {
                      L15: {
                        if (!se.field_l.b((byte) 109)) {
                          break L15;
                        } else {
                          if (se.field_l.a(29741)) {
                            L16: {
                              if (!jg.field_F.b((byte) 119)) {
                                break L16;
                              } else {
                                if (jg.field_F.a(29741)) {
                                  L17: {
                                    if (!cb.field_c.b((byte) 127)) {
                                      break L17;
                                    } else {
                                      if (!cb.field_c.a(29741)) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (!fi.field_f.b((byte) 103)) {
                                            break L18;
                                          } else {
                                            if (fi.field_f.a("basic", -9883)) {
                                              ma.a(fa.field_z, -13923, 70.0f);
                                              this.d((byte) 22);
                                              if (!param0) {
                                                return;
                                              } else {
                                                jj.i(param1 ^ -1478);
                                                gf.field_c = new ud[48];
                                                gf.field_c[0] = aj.a(lj.field_h, "", "SC_bossdamage").a();
                                                gf.field_c[1] = aj.a(lj.field_h, "", "SC_bossdestroy").a();
                                                gf.field_c[2] = aj.a(lj.field_h, "", "SC_collect1").a();
                                                gf.field_c[7] = aj.a(lj.field_h, "", "SC_enemydamage2").a();
                                                gf.field_c[8] = aj.a(lj.field_h, "", "SC_enemydamage3").a();
                                                gf.field_c[9] = aj.a(lj.field_h, "", "SC_enemydestroy3").a();
                                                gf.field_c[10] = aj.a(lj.field_h, "", "SC_enemydestroy4").a();
                                                gf.field_c[3] = aj.a(lj.field_h, "", "SC_enemyfire1").a();
                                                gf.field_c[4] = aj.a(lj.field_h, "", "SC_enemyfire2").a();
                                                gf.field_c[5] = aj.a(lj.field_h, "", "SC_enemyfire3").a();
                                                gf.field_c[6] = aj.a(lj.field_h, "", "SC_enemyfire4").a();
                                                gf.field_c[19] = aj.a(lj.field_h, "", "SC_playerdestroy").a();
                                                gf.field_c[20] = aj.a(lj.field_h, "", "SC_backcannon").a();
                                                gf.field_c[21] = aj.a(lj.field_h, "", "SC_FOLLOWERFIRE").a();
                                                gf.field_c[11] = aj.a(lj.field_h, "", "SC_playerfire1").a();
                                                gf.field_c[12] = aj.a(lj.field_h, "", "SC_playerfire2").a();
                                                gf.field_c[13] = aj.a(lj.field_h, "", "SC_helix_1").a();
                                                gf.field_c[14] = aj.a(lj.field_h, "", "SC_helix_2").a();
                                                gf.field_c[15] = aj.a(lj.field_h, "", "SC_helix_3").a();
                                                gf.field_c[16] = aj.a(lj.field_h, "", "SC_lance_1").a();
                                                gf.field_c[17] = aj.a(lj.field_h, "", "SC_lance_2").a();
                                                gf.field_c[18] = aj.a(lj.field_h, "", "SC_lance_3").a();
                                                gf.field_c[22] = aj.a(lj.field_h, "", "SC_rewind_activated_part1").a();
                                                gf.field_c[23] = aj.a(lj.field_h, "", "SC_rewind_installed").a();
                                                gf.field_c[24] = aj.a(lj.field_h, "", "SC_seekermine_explode").a();
                                                gf.field_c[25] = aj.a(lj.field_h, "", "SC_shield_discharged").a();
                                                gf.field_c[26] = aj.a(lj.field_h, "", "SC_shield_rearm").a();
                                                gf.field_c[27] = aj.a(lj.field_h, "", "SC_shieldburst").a();
                                                gf.field_c[28] = aj.a(lj.field_h, "", "SC_thruster_upgrade").a();
                                                gf.field_c[29] = aj.a(lj.field_h, "", "SC_rearcannon_upgrade").a();
                                                gf.field_c[30] = aj.a(lj.field_h, "", "SC_shield_upgraded").a();
                                                gf.field_c[31] = aj.a(lj.field_h, "", "SC_sidecannons_upgrade").a();
                                                gf.field_c[46] = aj.a(lj.field_h, "", "SC_xenon_operational").a();
                                                gf.field_c[47] = aj.a(lj.field_h, "", "SC_xenonbeamshot").a();
                                                gf.field_c[32] = nj.a(nd.field_p, "", "SC_systems malfunction").c();
                                                gf.field_c[39] = nj.a(nd.field_p, "", "SC_VOC_54321").c();
                                                gf.field_c[40] = nj.a(nd.field_p, "", "SC_VOC_back cannons upgraded").c();
                                                gf.field_c[41] = nj.a(nd.field_p, "", "SC_VOC_hostile mothership approaching").c();
                                                gf.field_c[42] = nj.a(nd.field_p, "", "SC_VOC_powerup collected").c();
                                                gf.field_c[43] = nj.a(nd.field_p, "", "SC_VOC_returning to normal space").c();
                                                gf.field_c[44] = nj.a(nd.field_p, "", "SC_VOC_rewind module activated").c();
                                                gf.field_c[45] = nj.a(nd.field_p, "", "SC_VOC_rewind module installed").c();
                                                gf.field_c[33] = nj.a(nd.field_p, "", "SC_VOC_shield discharged").c();
                                                gf.field_c[34] = nj.a(nd.field_p, "", "SC_VOC_shield rearmed").c();
                                                gf.field_c[35] = nj.a(nd.field_p, "", "SC_VOC_shields upgraded").c();
                                                gf.field_c[36] = nj.a(nd.field_p, "", "SC_VOC_side cannons upgraded").c();
                                                gf.field_c[37] = nj.a(nd.field_p, "", "SC_VOC_thrusters upgraded").c();
                                                gf.field_c[38] = nj.a(nd.field_p, "", "SC_VOC_zenon beam operational").c();
                                                nd.a(272, -3763, 3278, 39);
                                                nd.a(0, -3763, 300, 11);
                                                nd.a(0, -3763, 300, 12);
                                                nd.a(50, -3763, 300, 16);
                                                nd.a(0, param1 + -2319, 100, 17);
                                                nd.a(0, param1 ^ 2833, 100, 18);
                                                tc.j(param1 ^ -1412);
                                                return;
                                              }
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        ma.a(bh.a(n.field_f, fi.field_f, (byte) -38, ae.field_a, "basic"), -13923, 60.0f);
                                        return;
                                      }
                                    }
                                  }
                                  ma.a(bh.a(s.field_g, cb.field_c, (byte) -38, sj.field_D, ""), -13923, 50.0f);
                                  return;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            ma.a(bh.a(n.field_f, jg.field_F, (byte) -38, ae.field_a, ""), param1 + -12479, 40.0f);
                            return;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ma.a(bh.a(kc.field_U, se.field_l, (byte) -38, ia.field_l, ""), -13923, 30.0f);
                      return;
                    } else {
                      break L14;
                    }
                  }
                }
                ma.a(bh.a(lc.field_ib, nd.field_p, (byte) -38, bd.field_g, ""), -13923, 20.0f);
                return;
              }
            }
          }
          ma.a(bh.a(lc.field_ib, lj.field_h, (byte) -38, bd.field_g, ""), param1 ^ 13249, 10.0f);
          return;
        }
    }

    private final void m(byte param0) {
        fj dupTemp$0 = null;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        bf stackIn_106_0 = null;
        bf stackIn_106_1 = null;
        int stackIn_154_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        boolean stackIn_348_0 = false;
        int stackIn_353_0 = 0;
        int stackIn_460_0 = 0;
        int stackIn_513_0 = 0;
        int stackIn_513_1 = 0;
        int stackIn_549_0 = 0;
        int stackIn_549_1 = 0;
        boolean stackOut_347_0;
        Object var2;
        int var2_int;
        bf var2_ref;
        int var3;
        bf var3_ref_bf;
        int var4;
        bf var4_ref_bf;
        int var5_int;
        bf var5;
        int var6_int;
        bf var6;
        int var7;
        int var8;
        bf var9;
        bf var10;
        ud var11;
        fj var12;
        bf var13;
        bf var35;
        int[] var78;
        int[] var79;
        int[] var80;
        int[] var81;
        int[] var82;
        int[] var83;
        int[] var84;
        int[] var85;
        int[] var86;
        int[] var87;
        int[] var88;
        int[] var89;
        int[] var90;
        int[] var91;
        int[] var92;
        int[] var93;
        int[] var94;
        int[] var95;
        int[] var96;
        int[] var97;
        int[] var98;
        L0: {
          var2 = null;
          var8 = field_A;
          if ((ie.field_C ^ -1) < -1) {
            ie.field_C = ie.field_C - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 == (gj.field_c ^ -1)) {
            L2: {
              var2_int = 0;
              if (0 != ia.field_k) {
                break L2;
              } else {
                if (0 != jg.field_H) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!wk.a(86)) {
                if (0 >= jg.field_H) {
                  if (0 < kd.field_C) {
                    var2_int = 2;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var2_int = 5;
                  break L3;
                }
              } else {
                L4: {
                  if (ia.field_k > 0) {
                    break L4;
                  } else {
                    if (jg.field_H > 0) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int = 6;
                break L3;
              }
            }
            od.a(-126, var2_int, false);
            break L1;
          } else {
            break L1;
          }
        }
        L5: {
          if (tj.field_G <= 0) {
            break L5;
          } else {
            fi.field_e.field_k = 1;
            ha.field_d = 0;
            ui.field_p = eg.field_l + -32;
            tj.field_G = tj.field_G - 1;
            if (0 >= tj.field_G) {
              ui.field_p = 0;
              mj.a(255, 12, 0, 43, 100);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          L7: {
            L8: {
              L9: {
                if (-1 <= (fi.field_e.field_k ^ -1)) {
                  if (gj.field_c >= 0) {
                    break L9;
                  } else {
                    var2_int = 0;
                    L10: while (true) {
                      if (var2_int >= 4000) {
                        var2_ref = (bf) ((Object) kh.field_y.c(-3905));
                        L11: while (true) {
                          if (var2_ref == null) {
                            break L9;
                          } else {
                            stackIn_106_0 = fi.field_e;

                            stackIn_106_1 = (bf) (var2_ref);

                            L12: {
                              if (stackIn_106_0 == stackIn_106_1) {
                                break L12;
                              } else {
                                var2_ref.b(4);
                                break L12;
                              }
                            }
                            var2_ref = (bf) ((Object) kh.field_y.a(-16913));
                            continue L11;
                          }
                        }
                      } else {
                        qc.field_c[var2_int] = null;
                        var2_int++;
                        continue L10;
                      }
                    }
                  }
                } else {
                  L13: {
                    if (!gi.field_g) {
                      break L13;
                    } else {
                      if (2 > ua.field_c) {
                        break L13;
                      } else {
                        if (-1 == (rj.field_h ^ -1)) {
                          ia.field_k = ia.field_k + 1;
                          fc.field_e = fc.field_e + 2;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  if (ui.field_p <= 0) {
                    if (ha.field_d > 0) {
                      L14: {
                        var2_int = vb.field_m + 1;
                        if (4 == vb.field_m) {
                          var2_int++;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (vb.field_m == 5) {
                          var2_int += 2;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        ha.field_d = ha.field_d - var2_int;
                        if (null != ah.field_a) {
                          break L16;
                        } else {
                          if (-5 < (vb.field_m ^ -1)) {
                            L17: {
                              var3 = 0;
                              if (-3 == (vb.field_m ^ -1)) {
                                var3 = 28665;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (3 == vb.field_m) {
                                var3 = 42997;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var11 = gf.field_c[39];
                            dupTemp$0 = fj.a(var11, 100, 255 * nb.field_g / 100);
                            var12 = dupTemp$0;
                            ah.field_a = dupTemp$0;
                            var12.d(var3);
                            var6_int = (var2_int + ha.field_d + -1) / var2_int;
                            var7 = -300 + (var6_int * 20 + -((var11.field_i.length + -var3) * 1000 / var11.field_j));
                            if ((var7 ^ -1) < -1) {
                              ok.field_tb = eg.a(29723, var7, ah.field_a);
                              jk.field_k.b(ok.field_tb);
                              break L16;
                            } else {
                              jk.field_k.b(ah.field_a);
                              break L16;
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (ha.field_d <= 0) {
                        ha.field_d = 0;
                        dg.field_l = 0;
                        mj.a(255, 12, 0, 34, 100);
                        mj.a(96, 12, 0, 26, 100);
                        ok.field_tb = null;
                        ah.field_a = null;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  } else {
                    L19: {
                      ui.field_p = ui.field_p + 8;
                      if ((ui.field_p ^ -1) >= (eg.field_l ^ -1)) {
                        break L19;
                      } else {
                        dg.field_l = 0;
                        ui.field_p = 0;
                        mj.a(96, 12, 0, 25, 100);
                        mj.a(255, 12, 0, 33, 100);
                        break L19;
                      }
                    }
                    var2_int = 0;
                    L20: while (true) {
                      if (-4001 >= (var2_int ^ -1)) {
                        var2_ref = (bf) ((Object) kh.field_y.c(-3905));
                        L21: while (true) {
                          if (var2_ref == null) {
                            break L9;
                          } else {
                            stackIn_106_0 = fi.field_e;

                            stackIn_106_1 = (bf) (var2_ref);

                            L22: {
                              if (stackIn_106_0 == stackIn_106_1) {
                                break L22;
                              } else {
                                var3 = var2_ref.field_f + -fi.field_e.field_f;
                                var4 = -fi.field_e.field_u + var2_ref.field_u;
                                var5_int = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
                                var6_int = 0;
                                L23: while (true) {
                                  if ((ui.field_p ^ -1) >= (var6_int ^ -1)) {
                                    break L22;
                                  } else {
                                    stackIn_103_0 = var6_int;

                                    stackIn_103_1 = var5_int;

                                    L24: {
                                      if (stackIn_103_0 <= stackIn_103_1) {
                                        break L24;
                                      } else {
                                        if (-11 != (var2_ref.field_q ^ -1)) {
                                          L25: {
                                            if (var2_ref.field_q != 22) {
                                              break L25;
                                            } else {
                                              if (var2_ref.field_l < 36) {
                                                break L25;
                                              } else {
                                                if (39 < var2_ref.field_l) {
                                                  break L25;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                          }
                                          L26: {
                                            if (-1 < (var3 ^ -1)) {
                                              var2_ref.field_f = var2_ref.field_f - 1;
                                              break L26;
                                            } else {
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (0 >= var3) {
                                              break L27;
                                            } else {
                                              var2_ref.field_f = var2_ref.field_f + 1;
                                              break L27;
                                            }
                                          }
                                          L28: {
                                            if (-1 < (var4 ^ -1)) {
                                              var2_ref.field_u = var2_ref.field_u - 1;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          if (0 >= var4) {
                                            break L24;
                                          } else {
                                            var2_ref.field_u = var2_ref.field_u + 1;
                                            break L24;
                                          }
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                    var6_int++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var2_ref = (bf) ((Object) kh.field_y.a(-16913));
                            continue L21;
                          }
                        }
                      } else {
                        L29: {
                          if (qc.field_c[var2_int] == null) {
                            break L29;
                          } else {
                            if (-3 != (qc.field_c[var2_int].field_h ^ -1)) {
                              break L29;
                            } else {
                              var3 = qc.field_c[var2_int].field_d + -fi.field_e.field_f;
                              var4 = qc.field_c[var2_int].field_q + -fi.field_e.field_u;
                              var5_int = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
                              if ((var5_int ^ -1) > (ui.field_p ^ -1)) {
                                qc.field_c[var2_int].field_h = 0;
                                qc.field_c[var2_int].field_p = 64;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        var2_int++;
                        continue L20;
                      }
                    }
                  }
                }
              }
              var2_ref = fi.field_e;
              stackIn_103_0 = 10;
              stackIn_103_1 = u.field_b;
              break L8;
            }
            if (stackIn_103_0 < stackIn_103_1) {
              u.field_b = 0;
              stackIn_106_0 = (bf) (var2_ref);
              stackIn_106_1 = (bf) (var2_ref);
              break L7;
            } else {
              break L6;
            }
          }
          stackIn_106_0.field_k = stackIn_106_1.field_k + 1;
          break L6;
        }
        L30: {
          if (0 > var2_ref.field_f) {
            var2_ref.field_f = 0;
            var2_ref.field_n = 50;
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          if (99 < (u.field_b ^ -1)) {
            u.field_b = -100;
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          if (var2_ref.field_f > 640) {
            var2_ref.field_f = 640;
            var2_ref.field_n = -50;
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          if ((var2_ref.field_u ^ -1) <= -1) {
            break L33;
          } else {
            var2_ref.field_z = 50;
            var2_ref.field_u = 0;
            break L33;
          }
        }
        L34: {
          if (var2_ref.field_u > 448) {
            var2_ref.field_z = -50;
            var2_ref.field_u = 448;
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          if (-9 <= (ig.field_h ^ -1)) {
            break L35;
          } else {
            ig.field_h = sh.b(-6, 4);
            break L35;
          }
        }
        L36: {
          L37: {
            vd.field_j = vd.field_j + 3;
            hc.field_c = hc.field_c + 1;
            ed.field_n = ed.field_n + 1;
            if ((ge.field_c[0] ^ -1) == -3) {
              break L37;
            } else {
              if (ge.field_c[0] == 7) {
                break L37;
              } else {
                if ((ge.field_c[0] ^ -1) == -13) {
                  break L37;
                } else {
                  if (ua.field_c < -2) {
                    break L37;
                  } else {
                    break L36;
                  }
                }
              }
            }
          }
          vd.field_j = vd.field_j + 9;
          hc.field_c = hc.field_c + 3;
          if ((ua.field_c ^ -1) > 1) {
            hc.field_c = hc.field_c + 3;
            ed.field_n = ed.field_n + 2;
            vd.field_j = vd.field_j + 9;
            break L36;
          } else {
            break L36;
          }
        }
        L38: {
          if (-1029 <= (ed.field_n ^ -1)) {
            break L38;
          } else {
            L39: {
              if (ua.field_c < ue.field_c[rj.field_h]) {
                L40: {
                  ua.field_c = ua.field_c + 1;
                  if (-10 == (ua.field_c ^ -1)) {
                    var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                    var3_ref_bf.field_l = 5;
                    kh.field_y.b(97, var3_ref_bf);
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if ((rj.field_h ^ -1) != -1) {
                    break L41;
                  } else {
                    L42: {
                      nf.field_e = -50;
                      if (10 == ua.field_c) {
                        break L42;
                      } else {
                        if (-13 != (ua.field_c ^ -1)) {
                          break L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                    var3 = sh.b(113, 640);
                    var4 = -64 + (fi.field_e.field_f + sh.b(-126, 128));
                    var5_int = 0;
                    L43: while (true) {
                      if (-6 >= (var5_int ^ -1)) {
                        break L41;
                      } else {
                        var6 = new bf(var3, -var5_int * 64 + -64, var4, 17);
                        var6.field_o = sh.b(-127, 32);
                        kh.field_y.b(114, var6);
                        var5_int++;
                        continue L43;
                      }
                    }
                  }
                }
                L44: {
                  if ((rj.field_h ^ -1) == -2) {
                    L45: {
                      L46: {
                        if ((ua.field_c ^ -1) != -5) {
                          break L46;
                        } else {
                          var3 = 36;
                          L47: while (true) {
                            if ((var3 ^ -1) <= -41) {
                              break L46;
                            } else {
                              stackIn_159_0 = -1;

                              stackIn_159_1 = 1 & var3 ^ -1;

                              L48: {
                                if (stackIn_159_0 != stackIn_159_1) {
                                  stackIn_154_0 = 424;
                                  break L48;
                                } else {
                                  stackIn_154_0 = 296;
                                  break L48;
                                }
                              }
                              L49: {
                                var4 = stackIn_154_0;
                                if ((var3 ^ -1) <= -39) {
                                  stackIn_157_0 = -128;
                                  break L49;
                                } else {
                                  stackIn_157_0 = -256;
                                  break L49;
                                }
                              }
                              var5_int = stackIn_157_0;
                              var13 = new bf(var4, var5_int, var4, 22);
                              li.a(-126, var13);
                              var13.field_l = var3;
                              var13.field_n = 0;
                              var13.field_z = 32;
                              var3++;
                              continue L47;
                            }
                          }
                        }
                      }
                      stackIn_159_0 = 5;
                      stackIn_159_1 = ua.field_c;
                      break L45;
                    }
                    L50: {
                      L51: {
                        if (stackIn_159_0 == stackIn_159_1) {
                          break L51;
                        } else {
                          if (ua.field_c == 15) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      nf.field_e = -250;
                      var3 = 0;
                      L52: while (true) {
                        if (25 <= var3) {
                          break L50;
                        } else {
                          kh.field_y.b(99, new bf(sh.b(-128, 640), -var3 * 25 + -128, sh.b(60, 128) + fi.field_e.field_f - 64, 18));
                          var3++;
                          continue L52;
                        }
                      }
                    }
                    L53: {
                      if (4 == ua.field_c) {
                        break L53;
                      } else {
                        if ((ua.field_c ^ -1) == -7) {
                          break L53;
                        } else {
                          if (ua.field_c == 8) {
                            break L53;
                          } else {
                            if (ua.field_c == 10) {
                              break L53;
                            } else {
                              if ((ua.field_c ^ -1) == -13) {
                                break L53;
                              } else {
                                if (ua.field_c == 14) {
                                  break L53;
                                } else {
                                  break L44;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = -300 + (900 * sh.b(45, 2) + 320);
                    var4 = 0;
                    L54: while (true) {
                      if (var4 >= 5) {
                        break L44;
                      } else {
                        var5 = new bf(var3, 64 * -var4 - 64, var3, 17);
                        var5.field_o = sh.b(-127, 32);
                        kh.field_y.b(121, var5);
                        var4++;
                        continue L54;
                      }
                    }
                  } else {
                    break L44;
                  }
                }
                L55: {
                  if (2 != rj.field_h) {
                    break L55;
                  } else {
                    L56: {
                      L57: {
                        if (-6 == (ua.field_c ^ -1)) {
                          break L57;
                        } else {
                          if (10 == ua.field_c) {
                            break L57;
                          } else {
                            if (ua.field_c == 15) {
                              break L57;
                            } else {
                              break L56;
                            }
                          }
                        }
                      }
                      nf.field_e = -150;
                      var3 = 0;
                      L58: while (true) {
                        if (25 <= var3) {
                          break L56;
                        } else {
                          kh.field_y.b(119, new bf(sh.b(76, 640), -128 + -var3 * 25, -64 + sh.b(-30, 128) + fi.field_e.field_f, 18));
                          var3++;
                          continue L58;
                        }
                      }
                    }
                    L59: {
                      if (ua.field_c != 16) {
                        break L59;
                      } else {
                        var3 = 48;
                        L60: while (true) {
                          if (var3 >= 640) {
                            break L59;
                          } else {
                            var4_ref_bf = new bf(var3, -64 - Math.abs(-320 + var3), var3, 21);
                            var4_ref_bf.field_o = sh.b(-127, 32);
                            kh.field_y.b(57, var4_ref_bf);
                            var3 += 96;
                            continue L60;
                          }
                        }
                      }
                    }
                    if (ua.field_c < 4) {
                      break L55;
                    } else {
                      if (ua.field_c > 14) {
                        break L55;
                      } else {
                        if (0 == (ua.field_c & 1)) {
                          var3 = sh.b(-128, 2) * 900 + 20;
                          var4 = 0;
                          L61: while (true) {
                            if (var4 >= 5) {
                              break L55;
                            } else {
                              var5 = new bf(var3, -var4 * 64 - 64, var3, 17);
                              var5.field_o = sh.b(-126, 32);
                              kh.field_y.b(89, var5);
                              var4++;
                              continue L61;
                            }
                          }
                        } else {
                          break L55;
                        }
                      }
                    }
                  }
                }
                L62: {
                  if (3 == rj.field_h) {
                    L63: {
                      if (ua.field_c == 5) {
                        break L63;
                      } else {
                        if (ua.field_c == 10) {
                          break L63;
                        } else {
                          break L62;
                        }
                      }
                    }
                    var3 = 0;
                    L64: while (true) {
                      if (-26 >= (var3 ^ -1)) {
                        break L62;
                      } else {
                        kh.field_y.b(115, new bf(sh.b(-126, 640), -128 + 25 * -var3, sh.b(8, 128) - (-fi.field_e.field_f + 64), 18));
                        var3++;
                        continue L64;
                      }
                    }
                  } else {
                    break L62;
                  }
                }
                if ((ua.field_c ^ -1) != 1) {
                  break L39;
                } else {
                  if (-1 > (rj.field_h ^ -1)) {
                    dg.field_l = 0;
                    mj.a(255, 12, 0, 43, 100);
                    break L39;
                  } else {
                    break L39;
                  }
                }
              } else {
                break L39;
              }
            }
            L65: {
              L66: {
                ed.field_n = sh.b(64, 640);
                if (0 == rj.field_h) {
                  break L66;
                } else {
                  if (rj.field_h != 3) {
                    break L65;
                  } else {
                    break L66;
                  }
                }
              }
              L67: {
                if ((ua.field_c ^ -1) >= -1) {
                  L68: {
                    if (2 != ge.field_c[0]) {
                      break L68;
                    } else {
                      var78 = ge.field_c;
                      ge.field_c[1] = 1;
                      var78[0] = 1;
                      break L68;
                    }
                  }
                  L69: {
                    if (ge.field_c[0] != 7) {
                      break L69;
                    } else {
                      ge.field_c[1] = 6;
                      var79 = ge.field_c;
                      var79[0] = 6;
                      break L69;
                    }
                  }
                  if (12 == ge.field_c[0]) {
                    ge.field_c[1] = 11;
                    var80 = ge.field_c;
                    var80[0] = 11;
                    break L67;
                  } else {
                    break L67;
                  }
                } else {
                  break L67;
                }
              }
              L70: {
                if (0 > ua.field_c) {
                  break L70;
                } else {
                  if (-13 > (ua.field_c ^ -1)) {
                    break L70;
                  } else {
                    if (-1 == (1 & ua.field_c ^ -1)) {
                      gd.field_d = (ua.field_c >> -985950047) + 2;
                      v.a(new d(sh.b(-127, 640), -156, 0, 128 + sh.b(-127, 256), 16777215, 4), -4001);
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                }
              }
              L71: {
                if (ua.field_c == 12) {
                  ge.field_c[1] = 3;
                  var81 = ge.field_c;
                  var81[0] = 3;
                  break L71;
                } else {
                  break L71;
                }
              }
              if (13 != ua.field_c) {
                break L65;
              } else {
                ge.field_c[1] = 1;
                var82 = ge.field_c;
                var82[0] = 1;
                break L65;
              }
            }
            L72: {
              if (-2 == (rj.field_h ^ -1)) {
                L73: {
                  if (-1 <= (ua.field_c ^ -1)) {
                    L74: {
                      if (ge.field_c[0] == 2) {
                        var83 = ge.field_c;
                        ge.field_c[1] = 1;
                        var83[0] = 1;
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    L75: {
                      if (-8 == (ge.field_c[0] ^ -1)) {
                        ge.field_c[1] = 6;
                        var84 = ge.field_c;
                        var84[0] = 6;
                        break L75;
                      } else {
                        break L75;
                      }
                    }
                    if (ge.field_c[0] == 12) {
                      var85 = ge.field_c;
                      ge.field_c[1] = 11;
                      var85[0] = 11;
                      break L73;
                    } else {
                      break L73;
                    }
                  } else {
                    break L73;
                  }
                }
                L76: {
                  if (1 != ua.field_c) {
                    break L76;
                  } else {
                    ge.field_c[0] = 4;
                    break L76;
                  }
                }
                L77: {
                  if (3 == ua.field_c) {
                    var86 = ge.field_c;
                    ge.field_c[1] = 3;
                    var86[0] = 3;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                L78: {
                  if (-7 != (ua.field_c ^ -1)) {
                    break L78;
                  } else {
                    ge.field_c[1] = 1;
                    var87 = ge.field_c;
                    var87[0] = 1;
                    break L78;
                  }
                }
                L79: {
                  if (ua.field_c == 8) {
                    ge.field_c[1] = 5;
                    break L79;
                  } else {
                    break L79;
                  }
                }
                L80: {
                  if (9 != ua.field_c) {
                    break L80;
                  } else {
                    var88 = ge.field_c;
                    ge.field_c[1] = 13;
                    var88[0] = 13;
                    break L80;
                  }
                }
                L81: {
                  if ((ua.field_c ^ -1) == -13) {
                    ge.field_c[1] = 11;
                    var89 = ge.field_c;
                    var89[0] = 11;
                    break L81;
                  } else {
                    break L81;
                  }
                }
                L82: {
                  if (ua.field_c == 14) {
                    ge.field_c[1] = 9;
                    break L82;
                  } else {
                    break L82;
                  }
                }
                L83: {
                  if (ua.field_c == 15) {
                    ge.field_c[1] = 8;
                    var90 = ge.field_c;
                    var90[0] = 8;
                    break L83;
                  } else {
                    break L83;
                  }
                }
                L84: {
                  if (-19 == (ua.field_c ^ -1)) {
                    ge.field_c[1] = 6;
                    var91 = ge.field_c;
                    var91[0] = 6;
                    break L84;
                  } else {
                    break L84;
                  }
                }
                if ((ua.field_c ^ -1) != -21) {
                  break L72;
                } else {
                  ge.field_c[0] = 10;
                  break L72;
                }
              } else {
                break L72;
              }
            }
            if ((rj.field_h ^ -1) != -3) {
              break L38;
            } else {
              L85: {
                if (0 >= ua.field_c) {
                  L86: {
                    if (2 != ge.field_c[0]) {
                      break L86;
                    } else {
                      ge.field_c[1] = 1;
                      var92 = ge.field_c;
                      var92[0] = 1;
                      break L86;
                    }
                  }
                  L87: {
                    if (7 == ge.field_c[0]) {
                      var93 = ge.field_c;
                      ge.field_c[1] = 6;
                      var93[0] = 6;
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                  if (ge.field_c[0] != 12) {
                    break L85;
                  } else {
                    ge.field_c[1] = 11;
                    var94 = ge.field_c;
                    var94[0] = 11;
                    break L85;
                  }
                } else {
                  break L85;
                }
              }
              L88: {
                if (4 == ua.field_c) {
                  gd.field_d = 9;
                  v.a(new d(sh.b(-128, 640), -156, 0, sh.b(107, 256) - -128, 16777215, 4), -4001);
                  break L88;
                } else {
                  break L88;
                }
              }
              L89: {
                if ((ua.field_c ^ -1) != -6) {
                  break L89;
                } else {
                  ge.field_c[1] = 8;
                  var95 = ge.field_c;
                  var95[0] = 8;
                  break L89;
                }
              }
              L90: {
                if (ua.field_c != 9) {
                  break L90;
                } else {
                  var96 = ge.field_c;
                  ge.field_c[1] = 6;
                  var96[0] = 6;
                  break L90;
                }
              }
              L91: {
                if (-11 == (ua.field_c ^ -1)) {
                  gd.field_d = 10;
                  v.a(new d(sh.b(8, 640), -156, 0, sh.b(-128, 256) - -128, 16777215, 4), -4001);
                  break L91;
                } else {
                  break L91;
                }
              }
              L92: {
                if (ua.field_c != 11) {
                  break L92;
                } else {
                  var97 = ge.field_c;
                  ge.field_c[1] = 13;
                  var97[0] = 13;
                  break L92;
                }
              }
              L93: {
                if (-16 != (ua.field_c ^ -1)) {
                  break L93;
                } else {
                  var98 = ge.field_c;
                  ge.field_c[1] = 11;
                  var98[0] = 11;
                  break L93;
                }
              }
              L94: {
                if (ua.field_c != 16) {
                  break L94;
                } else {
                  gd.field_d = 11;
                  v.a(new d(sh.b(-8, 640), -156, 0, sh.b(118, 256) + 128, 16777215, 4), -4001);
                  break L94;
                }
              }
              if (19 == ua.field_c) {
                gd.field_d = 12;
                v.a(new d(sh.b(-128, 640), -156, 0, 128 + sh.b(2, 256), 16777215, 4), -4001);
                break L38;
              } else {
                break L38;
              }
            }
          }
        }
        L95: {
          if ((gf.field_b ^ -1) >= -1) {
            break L95;
          } else {
            if ((rj.field_h ^ -1) > -4) {
              kk.field_d = kk.field_d - 1;
              if (kk.field_d > 0) {
                break L95;
              } else {
                L96: {
                  kk.field_d = 50;
                  gf.field_b = gf.field_b - 1;
                  var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                  if (-1 == (gf.field_b ^ -1)) {
                    var3_ref_bf.field_l = 4;
                    break L96;
                  } else {
                    break L96;
                  }
                }
                L97: {
                  if (-2 != (gf.field_b ^ -1)) {
                    break L97;
                  } else {
                    var3_ref_bf.field_l = 0;
                    break L97;
                  }
                }
                kh.field_y.b(69, var3_ref_bf);
                break L95;
              }
            } else {
              break L95;
            }
          }
        }
        L98: {
          if (ia.field_k >= tg.field_y) {
            L99: {
              if (tg.field_y < 1000) {
                if (-1 <= (tg.field_y ^ -1)) {
                  var3 = tg.field_y - -10;
                  break L99;
                } else {
                  var3 = tg.field_y + (tg.field_y << 373460929) / 3;
                  break L99;
                }
              } else {
                var3 = 500 + tg.field_y;
                break L99;
              }
            }
            var4 = sh.b(-128, 640);
            tg.field_y = var3;
            kh.field_y.b(60, new bf(var4, -32, var4, 10));
            break L98;
          } else {
            break L98;
          }
        }
        L100: {
          L101: {
            if (-3 == (rj.field_h ^ -1)) {
              break L101;
            } else {
              if ((rj.field_h ^ -1) != -4) {
                break L100;
              } else {
                break L101;
              }
            }
          }
          if (0 >= u.field_d) {
            il.field_i = il.field_i + (rj.field_h - 4);
            rj.field_h = 4;
            break L100;
          } else {
            break L100;
          }
        }
        L102: {
          if (-4 != (rj.field_h ^ -1)) {
            break L102;
          } else {
            if ((nf.field_l ^ -1) > -3) {
              il.field_i = il.field_i + (-4 + rj.field_h);
              rj.field_h = 4;
              break L102;
            } else {
              break L102;
            }
          }
        }
        L103: {
          if ((ua.field_c ^ -1) < (ue.field_c[rj.field_h] ^ -1)) {
            break L103;
          } else {
            if (fi.field_e.field_k <= 0) {
              break L103;
            } else {
              nf.field_e = nf.field_e + 2;
              break L103;
            }
          }
        }
        L104: {
          if (nf.field_e > 200) {
            L105: {
              if (rj.field_h != 0) {
                break L105;
              } else {
                this.o(0);
                break L105;
              }
            }
            L106: {
              if (rj.field_h != 1) {
                break L106;
              } else {
                this.l((byte) 91);
                break L106;
              }
            }
            L107: {
              if (2 != rj.field_h) {
                break L107;
              } else {
                this.k((byte) 104);
                break L107;
              }
            }
            if (-4 != (rj.field_h ^ -1)) {
              break L104;
            } else {
              this.p(-256);
              break L104;
            }
          } else {
            break L104;
          }
        }
        L108: {
          if ((dg.field_l ^ -1) <= -97) {
            break L108;
          } else {
            dg.field_l = dg.field_l + 1;
            break L108;
          }
        }
        dl.field_a = 0;
        var3 = -64 / ((38 - param0) / 48);
        var9 = (bf) ((Object) kh.field_y.c(-3905));
        L109: while (true) {
          L110: {
            if (var9 == null) {
              stackIn_353_0 = -1;
              break L110;
            } else {
              stackOut_347_0 = var9.a(qc.field_c, (StarCannon) (this), 114);
              stackIn_353_0 = stackOut_347_0 ? 1 : 0;
              stackIn_348_0 = stackOut_347_0;
              L111: {
                if (!stackIn_348_0) {
                  var9.b(4);
                  break L111;
                } else {
                  break L111;
                }
              }
              var9 = (bf) ((Object) kh.field_y.a(-16913));
              continue L109;
            }
          }
          L112: {
            if (stackIn_353_0 > (tj.field_G ^ -1)) {
              fi.field_e.field_k = 1;
              break L112;
            } else {
              break L112;
            }
          }
          var3 = 0;
          L113: while (true) {
            if (4000 <= var3) {
              L114: {
                if (-1 <= (vb.field_m ^ -1)) {
                  break L114;
                } else {
                  var35 = fi.field_e;
                  if ((rj.field_h ^ -1) > -5) {
                    if (-1 > (fi.field_e.field_k ^ -1)) {
                      L115: {
                        if (!wc.field_c[96]) {
                          break L115;
                        } else {
                          L116: {
                            var35.field_n = var35.field_n - (jl.field_j - -3);
                            if (249 >= (var35.field_n ^ -1)) {
                              break L116;
                            } else {
                              var35.field_n = -250;
                              break L116;
                            }
                          }
                          if (var35.field_n > 0) {
                            var35.field_n = var35.field_n * 95 / 100;
                            break L115;
                          } else {
                            break L115;
                          }
                        }
                      }
                      L117: {
                        if (wc.field_c[98]) {
                          L118: {
                            var35.field_z = var35.field_z - (jl.field_j - -3);
                            if (var35.field_z < -250) {
                              var35.field_z = -250;
                              break L118;
                            } else {
                              break L118;
                            }
                          }
                          if (0 >= var35.field_z) {
                            break L117;
                          } else {
                            var35.field_z = -(var35.field_z * 95) / 100;
                            break L117;
                          }
                        } else {
                          break L117;
                        }
                      }
                      L119: {
                        if (wc.field_c[97]) {
                          L120: {
                            var35.field_n = var35.field_n + (3 + jl.field_j);
                            if (-251 <= (var35.field_n ^ -1)) {
                              break L120;
                            } else {
                              var35.field_n = 250;
                              break L120;
                            }
                          }
                          if ((var35.field_n ^ -1) <= -1) {
                            break L119;
                          } else {
                            var35.field_n = 95 * var35.field_n / 100;
                            break L119;
                          }
                        } else {
                          break L119;
                        }
                      }
                      L121: {
                        if (wc.field_c[96]) {
                          break L121;
                        } else {
                          if (!wc.field_c[97]) {
                            var35.field_n = 90 * var35.field_n / 100;
                            break L121;
                          } else {
                            break L121;
                          }
                        }
                      }
                      L122: {
                        if (!wc.field_c[99]) {
                          break L122;
                        } else {
                          L123: {
                            var35.field_z = var35.field_z + (3 + jl.field_j);
                            if (var35.field_z <= 120) {
                              break L123;
                            } else {
                              var35.field_z = 120;
                              break L123;
                            }
                          }
                          if (0 <= var35.field_z) {
                            break L122;
                          } else {
                            var35.field_z = 95 * var35.field_z / 100;
                            break L122;
                          }
                        }
                      }
                      L124: {
                        L125: {
                          if (wc.field_c[82]) {
                            break L125;
                          } else {
                            if (!wc.field_c[83]) {
                              break L124;
                            } else {
                              break L125;
                            }
                          }
                        }
                        if (var35.field_j == 0) {
                          gi.field_g = false;
                          u.field_b = u.field_b - 2;
                          var35.field_j = 1;
                          break L124;
                        } else {
                          break L124;
                        }
                      }
                      if (wc.field_c[98]) {
                        break L114;
                      } else {
                        if (!wc.field_c[99]) {
                          var35.field_z = var35.field_z * 90 / 100;
                          break L114;
                        } else {
                          break L114;
                        }
                      }
                    } else {
                      break L114;
                    }
                  } else {
                    L126: {
                      var35.field_z = var35.field_z - (jl.field_j - -3);
                      if (249 >= (var35.field_z ^ -1)) {
                        break L126;
                      } else {
                        var35.field_z = -250;
                        break L126;
                      }
                    }
                    L127: {
                      var35.field_f = (9 * var35.field_f - -320) / 10;
                      if (-1 <= (var35.field_z ^ -1)) {
                        break L127;
                      } else {
                        var35.field_z = -(95 * var35.field_z) / 100;
                        break L127;
                      }
                    }
                    L128: {
                      if (this.field_D >= 250) {
                        break L128;
                      } else {
                        this.field_D = this.field_D + 1;
                        var35.field_u = (320 + var35.field_u * 9) / 10;
                        var35.field_z = 0;
                        break L128;
                      }
                    }
                    if (this.field_D < 250) {
                      break L114;
                    } else {
                      if (64 <= var35.field_u) {
                        break L114;
                      } else {
                        tj.field_G = 0;
                        gj.field_c = -1;
                        il.field_i = il.field_i + rj.field_h;
                        var35.field_k = -1;
                        this.field_D = 0;
                        rj.field_h = 0;
                        if ((field_z ^ -1) != 0) {
                          break L114;
                        } else {
                          var3 = 0;
                          L129: while (true) {
                            if (var3 >= 4000) {
                              var10 = (bf) ((Object) kh.field_y.c(-3905));
                              L130: while (true) {
                                if (var10 == null) {
                                  L131: {
                                    if ((kd.field_C ^ -1) != -1) {
                                      break L131;
                                    } else {
                                      if (-1 == (jg.field_H ^ -1)) {
                                        break L131;
                                      } else {
                                        break L131;
                                      }
                                    }
                                  }
                                  L132: {
                                    hh.field_c = 0;
                                    bf.field_w = 0;
                                    ha.field_c = 0;
                                    jl.field_j = 5;
                                    vb.field_m = 2;
                                    var3 = 0;
                                    if (wk.a(108)) {
                                      L133: {
                                        if (kd.field_C > 0) {
                                          break L133;
                                        } else {
                                          if (0 >= jg.field_H) {
                                            break L132;
                                          } else {
                                            break L133;
                                          }
                                        }
                                      }
                                      var3 = 6;
                                      break L132;
                                    } else {
                                      pg.a(true, (byte) -121);
                                      sa.a(nf.field_l + na.field_a * 3, 23820);
                                      fc.field_e = fc.field_e - (ia.field_k << 751856385);
                                      ia.field_k = 0;
                                      if (-1 <= (jg.field_H ^ -1)) {
                                        if (kd.field_C <= 0) {
                                          break L132;
                                        } else {
                                          var3 = 2;
                                          break L132;
                                        }
                                      } else {
                                        var3 = 5;
                                        break L132;
                                      }
                                    }
                                  }
                                  od.a(-106, var3, false);
                                  break L114;
                                } else {
                                  L134: {
                                    if (fi.field_e != var10) {
                                      var10.b(4);
                                      break L134;
                                    } else {
                                      break L134;
                                    }
                                  }
                                  var10 = (bf) ((Object) kh.field_y.a(-16913));
                                  continue L130;
                                }
                              }
                            } else {
                              qc.field_c[var3] = null;
                              var3++;
                              continue L129;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L135: {
                L136: {
                  L137: {
                    L138: {
                      if (tj.field_G <= 1000) {
                        break L138;
                      } else {
                        if (se.field_m > 2) {
                          break L137;
                        } else {
                          break L138;
                        }
                      }
                    }
                    if (2 != se.field_m) {
                      break L136;
                    } else {
                      if (-21 == (ua.field_c ^ -1)) {
                        break L137;
                      } else {
                        break L135;
                      }
                    }
                  }
                  tj.field_G = 0;
                  hc.field_e = "hahahah";
                  break L136;
                }
                break L135;
              }
              L139: while (true) {
                L140: {
                  if (!ad.e((byte) 103)) {
                    hc.field_c = hc.field_c + 1;
                    vd.field_j = vd.field_j + 3;
                    stackIn_513_0 = 2;
                    stackIn_513_1 = ad.field_y;
                    break L140;
                  } else {
                    stackIn_513_0 = field_E ^ -1;

                    stackIn_513_1 = -1;

                    L141: {
                      if (stackIn_513_0 >= stackIn_513_1) {
                        break L141;
                      } else {
                        L142: {
                          hc.field_e = hc.field_e.substring(1) + field_E;
                          if ((se.field_m ^ -1) > -3) {
                            break L142;
                          } else {
                            if ((ua.field_c ^ -1) <= -21) {
                              break L141;
                            } else {
                              if (2 == se.field_m) {
                                break L142;
                              } else {
                                break L141;
                              }
                            }
                          }
                        }
                        if (2 <= ad.field_y) {
                          L143: {
                            if (!a.field_a) {
                              stackIn_460_0 = 0;
                              break L143;
                            } else {
                              stackIn_460_0 = 1;
                              break L143;
                            }
                          }
                          L144: {
                            var3 = stackIn_460_0;
                            if (!hc.field_e.equalsIgnoreCase("thunder")) {
                              break L144;
                            } else {
                              cg.field_e = 7;
                              a.field_a = true;
                              break L144;
                            }
                          }
                          L145: {
                            if (!hc.field_e.equalsIgnoreCase("beeswax")) {
                              break L145;
                            } else {
                              tj.field_G = 10000;
                              a.field_a = true;
                              break L145;
                            }
                          }
                          L146: {
                            if (hc.field_e.equalsIgnoreCase("diewell")) {
                              ua.field_c = -1 + ue.field_c[rj.field_h];
                              a.field_a = true;
                              hc.field_e = "hahahah";
                              break L146;
                            } else {
                              break L146;
                            }
                          }
                          L147: {
                            if (hc.field_e.equalsIgnoreCase("donefor")) {
                              pf.field_d = 1000;
                              a.field_a = true;
                              jk.field_j = 0;
                              break L147;
                            } else {
                              break L147;
                            }
                          }
                          L148: {
                            if (!hc.field_e.equalsIgnoreCase("xebeams")) {
                              break L148;
                            } else {
                              hh.field_c = 1;
                              kh.field_y.b(70, new bf(0, -128, 0, 13));
                              a.field_a = true;
                              break L148;
                            }
                          }
                          L149: {
                            if (!hc.field_e.equalsIgnoreCase("levskip")) {
                              break L149;
                            } else {
                              il.field_i = il.field_i + (rj.field_h - 2);
                              u.field_d = 1;
                              rj.field_h = 2;
                              a.field_a = true;
                              hc.field_e = "hahahah";
                              break L149;
                            }
                          }
                          if (!a.field_a) {
                            break L141;
                          } else {
                            if (var3 != 0) {
                              break L141;
                            } else {
                              fc.field_e = fc.field_e + 1;
                              il.field_i = il.field_i + 1;
                              break L141;
                            }
                          }
                        } else {
                          break L141;
                        }
                      }
                    }
                    L150: {
                      if (13 != lb.field_B) {
                        break L150;
                      } else {
                        if (rj.field_h != 4) {
                          L151: {
                            L152: {
                              if (fi.field_e.field_k != 0) {
                                break L152;
                              } else {
                                if (gj.field_c != 0) {
                                  break L152;
                                } else {
                                  if (25 <= fi.field_e.field_r) {
                                    if ((fi.field_e.field_r ^ -1) > -168) {
                                      fi.field_e.field_r = 167;
                                      break L151;
                                    } else {
                                      break L151;
                                    }
                                  } else {
                                    fi.field_e.field_r = -fi.field_e.field_r + 192;
                                    break L151;
                                  }
                                }
                              }
                            }
                            od.a(-99, 1, false);
                            break L151;
                          }
                          pg.a(true, (byte) -87);
                          return;
                        } else {
                          fi.field_e.field_u = 32;
                          break L150;
                        }
                      }
                    }
                    L153: {
                      if (-3 < (ad.field_y ^ -1)) {
                        break L153;
                      } else {
                        L154: {
                          if (lb.field_B == 32) {
                            if ((qb.field_e ^ -1) != -1) {
                              sd.field_c = 0;
                              qb.field_e = 0;
                              break L154;
                            } else {
                              sd.field_c = sd.field_c + 1;
                              break L154;
                            }
                          } else {
                            break L154;
                          }
                        }
                        L155: {
                          if ((lb.field_B ^ -1) != -34) {
                            break L155;
                          } else {
                            if ((qb.field_e ^ -1) != -2) {
                              sd.field_c = 0;
                              qb.field_e = 1;
                              break L155;
                            } else {
                              sd.field_c = sd.field_c + 1;
                              break L155;
                            }
                          }
                        }
                        if ((lb.field_B ^ -1) == -35) {
                          if (2 == qb.field_e) {
                            sd.field_c = sd.field_c + 1;
                            break L153;
                          } else {
                            sd.field_c = 0;
                            qb.field_e = 2;
                            break L153;
                          }
                        } else {
                          break L153;
                        }
                      }
                    }
                    if ((gj.field_c ^ -1) == 0) {
                      hc.field_e = "hahahah";
                      cg.field_e = 0;
                      continue L139;
                    } else {
                      continue L139;
                    }
                  }
                }
                L156: {
                  if (stackIn_513_0 > stackIn_513_1) {
                    break L156;
                  } else {
                    if (-8 != (cg.field_e ^ -1)) {
                      break L156;
                    } else {
                      jl.field_j = 20;
                      il.field_i = il.field_i + 1;
                      fc.field_e = fc.field_e + 1;
                      vb.field_m = 20;
                      a.field_a = true;
                      break L156;
                    }
                  }
                }
                L157: {
                  L158: {
                    if ((hc.field_c ^ -1) < -241) {
                      qd.field_E[2] = qd.field_E[1];
                      hc.field_c = hc.field_c - 240;
                      qd.field_E[1] = qd.field_E[0];
                      qd.field_E[0] = ge.field_c[0];
                      qd.field_E[5] = qd.field_E[4];
                      qd.field_E[4] = qd.field_E[3];
                      qd.field_E[3] = ge.field_c[1];
                      var3 = 0;
                      L159: while (true) {
                        if (var3 >= 2) {
                          break L158;
                        } else {
                          stackIn_549_0 = ge.field_c[var3];

                          stackIn_549_1 = 1;

                          L160: {
                            if (stackIn_549_0 == stackIn_549_1) {
                              ge.field_c[var3] = 0;
                              break L160;
                            } else {
                              break L160;
                            }
                          }
                          L161: {
                            if (ge.field_c[var3] != 3) {
                              break L161;
                            } else {
                              ge.field_c[var3] = 2;
                              break L161;
                            }
                          }
                          L162: {
                            if (-5 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L162;
                            } else {
                              break L162;
                            }
                          }
                          L163: {
                            if (-6 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L163;
                            } else {
                              break L163;
                            }
                          }
                          L164: {
                            if (-7 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L164;
                            } else {
                              break L164;
                            }
                          }
                          L165: {
                            if (8 != ge.field_c[var3]) {
                              break L165;
                            } else {
                              ge.field_c[var3] = 7;
                              break L165;
                            }
                          }
                          L166: {
                            if (-10 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L166;
                            } else {
                              break L166;
                            }
                          }
                          L167: {
                            if (10 != ge.field_c[var3]) {
                              break L167;
                            } else {
                              ge.field_c[var3] = 0;
                              break L167;
                            }
                          }
                          L168: {
                            if (-12 == (ge.field_c[var3] ^ -1)) {
                              ge.field_c[var3] = 0;
                              break L168;
                            } else {
                              break L168;
                            }
                          }
                          L169: {
                            if (-14 != (ge.field_c[var3] ^ -1)) {
                              break L169;
                            } else {
                              ge.field_c[var3] = 12;
                              break L169;
                            }
                          }
                          var3++;
                          continue L159;
                        }
                      }
                    } else {
                      break L158;
                    }
                  }
                  stackIn_549_0 = vd.field_j;
                  stackIn_549_1 = 480;
                  break L157;
                }
                L170: {
                  if (stackIn_549_0 <= stackIn_549_1) {
                    break L170;
                  } else {
                    vd.field_j = vd.field_j - 480;
                    break L170;
                  }
                }
                L171: {
                  if (0 > gj.field_c) {
                    if (!bi.field_b) {
                      lc.field_gb = lc.field_gb + 1;
                      if (1280 >= lc.field_gb) {
                        break L171;
                      } else {
                        lc.field_gb = -640;
                        break L171;
                      }
                    } else {
                      break L171;
                    }
                  } else {
                    break L171;
                  }
                }
                pg.a(true, (byte) -104);
                return;
              }
            } else {
              L172: {
                if (null == qc.field_c[var3]) {
                  break L172;
                } else {
                  if (null == qc.field_c[var3].a((byte) 108)) {
                    qc.field_c[var3] = null;
                    if ((var3 ^ -1) > (fi.field_d ^ -1)) {
                      fi.field_d = var3;
                      break L172;
                    } else {
                      break L172;
                    }
                  } else {
                    break L172;
                  }
                }
              }
              var3++;
              continue L113;
            }
          }
        }
    }

    final void s(int param0) {
        jl.field_j = jl.field_j + 5;
        dg.field_l = 0;
        mj.a(96, 12, 0, 28, 100);
        if (param0 != -9) {
            return;
        }
        mj.a(255, 12, 1200, 37, 100);
    }

    final void u(int param0) {
        vb.field_m = vb.field_m + 1;
        dg.field_l = 0;
        mj.a(96, param0 + -88, 0, 30, 100);
        mj.a(255, param0 ^ 104, 1200, 35, param0);
    }

    private final void l(byte param0) {
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        bf stackIn_65_0 = null;
        bf stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        bf stackIn_82_0 = null;
        bf stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        int var6;
        int var7;
        int var8;
        bf var9;
        int var10;
        bf var11;
        int var11_int;
        int var12;
        bf var13;
        bf var14;
        bf var15;
        L0: {
          var12 = field_A;
          var2 = sh.b(param0 + -31, 3) - -ua.field_c;
          if ((var2 ^ -1) >= (ue.field_c[rj.field_h] ^ -1)) {
            break L0;
          } else {
            if ((ua.field_c ^ -1) < (ue.field_c[rj.field_h] ^ -1)) {
              break L0;
            } else {
              var2 = ue.field_c[rj.field_h];
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 91) {
            break L1;
          } else {
            this.l((byte) 51);
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = sh.b(35, 640);
            var4 = -64 + fi.field_e.field_f + sh.b(param0 ^ -39, 128);
            var5 = null;
            var10 = var2;
            if ((var10 ^ -1) != -1) {
              if (1 == var10) {
                break L3;
              } else {
                if (-5 != (var10 ^ -1)) {
                  if ((var10 ^ -1) != -6) {
                    L4: {
                      L5: {
                        if (2 == var10) {
                          break L5;
                        } else {
                          if (var10 == 6) {
                            break L5;
                          } else {
                            if (var10 == 11) {
                              break L5;
                            } else {
                              if ((var10 ^ -1) != -14) {
                                L6: {
                                  if (-4 == (var10 ^ -1)) {
                                    break L6;
                                  } else {
                                    if ((var10 ^ -1) == -17) {
                                      break L6;
                                    } else {
                                      if (var10 == 8) {
                                        nf.field_e = 0;
                                        var10 = -8;
                                        L7: while (true) {
                                          if ((var10 ^ -1) < -9) {
                                            break L2;
                                          } else {
                                            kh.field_y.b(86, new bf(320 + var10 * 24, -Math.abs(-64 + 64 * var10), 320 - -(24 * var10), 1));
                                            var10++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if ((var10 ^ -1) == -19) {
                                          L8: {
                                            var6 = -64;
                                            nf.field_e = 0;
                                            if ((sh.b(param0 + 31, 2) ^ -1) == -1) {
                                              var8 = 24;
                                              var7 = 80;
                                              break L8;
                                            } else {
                                              var7 = 560;
                                              var8 = -24;
                                              break L8;
                                            }
                                          }
                                          var10 = -10;
                                          L9: while (true) {
                                            if ((var10 ^ -1) < -11) {
                                              break L2;
                                            } else {
                                              var11 = new bf(var7, var6, 640 + -var7, 17);
                                              var11.field_p = true;
                                              var7 = var7 + var8;
                                              var6 -= 16;
                                              kh.field_y.b(param0 ^ 29, var11);
                                              var10++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          L10: {
                                            if (7 != var10) {
                                              if ((var10 ^ -1) != -16) {
                                                if ((var10 ^ -1) != -20) {
                                                  L11: {
                                                    if (-10 != (var10 ^ -1)) {
                                                      if (-15 == (var10 ^ -1)) {
                                                        break L11;
                                                      } else {
                                                        if (10 == var10) {
                                                          nf.field_e = 50;
                                                          var10 = 0;
                                                          L12: while (true) {
                                                            L13: {
                                                              stackIn_106_0 = var10;

                                                              if ((nf.field_l ^ -1) == -3) {
                                                                stackIn_107_0 = stackIn_106_0;
                                                                stackIn_107_1 = 10;
                                                                break L13;
                                                              } else {
                                                                stackIn_107_0 = stackIn_106_0;
                                                                stackIn_107_1 = 5;
                                                                break L13;
                                                              }
                                                            }
                                                            if (stackIn_107_0 >= stackIn_107_1) {
                                                              break L2;
                                                            } else {
                                                              kh.field_y.b(70, new bf(var3, -64 + -var10 * 64, var4, 4));
                                                              var10++;
                                                              continue L12;
                                                            }
                                                          }
                                                        } else {
                                                          if (-13 == (var10 ^ -1)) {
                                                            nf.field_e = -50;
                                                            kh.field_y.b(78, new bf(var3, -64, var3, 12));
                                                            break L2;
                                                          } else {
                                                            if (var10 == 17) {
                                                              nf.field_e = -50;
                                                              kh.field_y.b(61, new bf(32, -64, 32, 12));
                                                              kh.field_y.b(84, new bf(608, -64, 608, 12));
                                                              break L2;
                                                            } else {
                                                              if (20 == var10) {
                                                                var9 = new bf(320, -256, var4, 15);
                                                                kh.field_y.b(param0 + -7, var9);
                                                                tj.field_C = var9.field_k;
                                                                ua.field_c = ue.field_c[rj.field_h] + 1;
                                                                pf.field_d = pf.field_d + 1;
                                                                dg.field_l = 0;
                                                                mj.a(255, 12, 0, 41, 100);
                                                                ti.field_f.a(kc.field_P);
                                                                kc.field_P.f();
                                                                kc.field_P = fl.field_h;
                                                                ti.field_f.b(kc.field_P);
                                                                kc.field_P.a(mc.field_b);
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                  nf.field_e = 0;
                                                  var10 = 0;
                                                  L14: while (true) {
                                                    if (-6 >= (var10 ^ -1)) {
                                                      break L2;
                                                    } else {
                                                      kh.field_y.b(95, new bf(var3, -64 + -var10 * 64, var4, 1));
                                                      kh.field_y.b(94, new bf(-var3 + 640, 64 * -var10 - 64, -var4 + 640, 1));
                                                      var10++;
                                                      continue L14;
                                                    }
                                                  }
                                                } else {
                                                  break L10;
                                                }
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          nf.field_e = 150;
                                          kh.field_y.b(81, new bf(var3, -64, var4, 3));
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                                nf.field_e = 100;
                                var10 = 0;
                                L15: while (true) {
                                  L16: {
                                    stackIn_77_0 = var10 ^ -1;

                                    if (2 == nf.field_l) {
                                      stackIn_78_0 = stackIn_77_0;
                                      stackIn_78_1 = 2;
                                      break L16;
                                    } else {
                                      stackIn_78_0 = stackIn_77_0;
                                      stackIn_78_1 = 1;
                                      break L16;
                                    }
                                  }
                                  if (stackIn_78_0 <= (stackIn_78_1 ^ -1)) {
                                    break L4;
                                  } else {
                                    L17: {
                                      var11 = new bf(var3, -64 + -var10 * 64, sh.b(77, 128) - 64, 5);
                                      var11.field_h = (bf) (var5);
                                      if (3 != var2) {
                                        break L17;
                                      } else {
                                        L18: {
                                          stackIn_82_0 = (bf) (var11);

                                          if (nf.field_l == 2) {
                                            stackIn_83_0 = (bf) ((Object) stackIn_82_0);
                                            stackIn_83_1 = 0;
                                            break L18;
                                          } else {
                                            stackIn_83_0 = (bf) ((Object) stackIn_82_0);
                                            stackIn_83_1 = 1;
                                            break L18;
                                          }
                                        }
                                        stackIn_83_0.field_p = stackIn_83_1 != 0;
                                        break L17;
                                      }
                                    }
                                    var5 = var11;
                                    kh.field_y.b(59, var11);
                                    var10++;
                                    continue L15;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      nf.field_e = 0;
                      var10 = 0;
                      L19: while (true) {
                        L20: {
                          if (2 == nf.field_l) {
                            stackIn_60_0 = 10;
                            break L20;
                          } else {
                            stackIn_60_0 = 5;
                            break L20;
                          }
                        }
                        if (stackIn_60_0 <= var10) {
                          break L4;
                        } else {
                          L21: {
                            var15 = new bf(var3, -64 + -var10 * 64, var4, 2);
                            if (2 == var2) {
                              L22: {
                                stackIn_65_0 = (bf) (var15);

                                if ((nf.field_l ^ -1) == -3) {
                                  stackIn_66_0 = (bf) ((Object) stackIn_65_0);
                                  stackIn_66_1 = 0;
                                  break L22;
                                } else {
                                  stackIn_66_0 = (bf) ((Object) stackIn_65_0);
                                  stackIn_66_1 = 1;
                                  break L22;
                                }
                              }
                              stackIn_66_0.field_p = stackIn_66_1 != 0;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            var15.field_h = (bf) (var5);
                            if ((var10 ^ -1) != -1) {
                              break L23;
                            } else {
                              var5 = var15;
                              break L23;
                            }
                          }
                          L24: {
                            if (!var15.field_p) {
                              var15.field_i = -64 + (var3 - -sh.b(-127, 128));
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          kh.field_y.b(param0 ^ 22, var15);
                          var10++;
                          continue L19;
                        }
                      }
                    }
                    break L2;
                  } else {
                    nf.field_e = 0;
                    var10 = 0;
                    L25: while (true) {
                      if (-6 >= (var10 ^ -1)) {
                        break L2;
                      } else {
                        kh.field_y.b(108, new bf(var3, 64 * -var10 + -64, var4, 1));
                        var10++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          if (ua.field_c >= 4) {
            nf.field_e = 0;
            var10 = -3;
            L26: while (true) {
              if (var10 >= 4) {
                break L2;
              } else {
                kh.field_y.b(param0 ^ 5, new bf(24 * var10 + 320, -Math.abs(var10 * 64 + -64), var10 * 7680, 1));
                var10++;
                continue L26;
              }
            }
          } else {
            L27: {
              var13 = new bf(var3, -64, var4, 22);
              li.a(param0 + -207, var13);
              var13.field_n = sh.b(-128, 16) + -8;
              var13.field_z = sh.b(-127, 64) + 32;
              var13.field_l = sh.b(param0 + -219, 36);
              if ((sh.b(26, 2) ^ -1) != -1) {
                stackIn_47_0 = 640 - sh.b(-128, 128);
                break L27;
              } else {
                stackIn_47_0 = sh.b(param0 + -217, 128);
                break L27;
              }
            }
            var11_int = stackIn_47_0;
            var14 = new bf(var11_int, -128, var4, 22);
            li.a(-120, var14);
            var14.field_n = sh.b(51, 16) + -8;
            var14.field_z = sh.b(-126, 64) + 32;
            var14.field_l = sh.b(-126, 36);
            nf.field_e = var2 * 30 - (-25 - 50 * nf.field_l);
            kh.field_y.b(param0 + 3, new bf(128 + sh.b(11, 384), -128, fi.field_e.field_f, 1));
            break L2;
          }
        }
    }

    final void c(byte param0) {
        StarCannon.r(122);
        bj.a(-1);
        eb.a(true);
        pb.a(91);
        rd.e(-29826);
        bg.a(-115);
        lj.b(87);
        pc.b(-76);
        ag.j((byte) 39);
        ii.b((byte) 70);
        th.c(1719);
        gg.b((byte) 121);
        wk.a(true);
        gj.a(15686);
        ki.a();
        ue.b(0);
        qe.a();
        oh.a(-1);
        ec.a(82);
        rb.g((byte) -59);
        dd.a(-121);
        qa.a(-5504);
        mf.a(23675);
        kg.a((byte) 103);
        r.a(-76);
        ce.a(30518);
        j.a(-3);
        ri.a(-15552);
        fb.a(-113);
        nb.a(572996488);
        pk.a(4);
        qi.b(0);
        vf.a(false);
        fi.a(0);
        tk.a(-124);
        cg.a(89);
        qc.a(-1);
        bb.b(2);
        bf.a(15415);
        d.a(32);
        jl.a(0);
        m.b(-98);
        lh.a((byte) -113);
        wd.c();
        df.a();
        eh.g((byte) 101);
        ef.a((byte) 27);
        td.c(-12539);
        sb.b(105);
        ed.b((byte) -61);
        rf.b(false);
        ui.d((byte) -80);
        uh.b((byte) -115);
        md.a(-27240);
        int var2 = 82 / ((param0 - -63) / 62);
        n.f(0);
        gi.b(640);
        wc.c(-1);
        bi.b(0);
        ck.a(false);
        gf.a((byte) -126);
        sd.a(false);
        sc.a(0);
        wg.a((byte) -117);
        be.a(20342);
        tc.g(-14528);
        ok.i((byte) -90);
        lf.e(false);
        lc.m(-11147);
        ph.m(-1);
        kh.h((byte) 126);
        db.a(-117);
        rg.k(-128);
        hg.a(false);
        ma.a((byte) 67);
        sg.a(false);
        g.b(-12837);
        ak.a((byte) 94);
        nc.b((byte) 59);
        ti.a((byte) 13);
        je.a();
        nj.a();
        l.a();
        ja.a((byte) 80);
        ih.b((byte) -125);
        jf.a(true);
        ua.a(128);
        ne.a(-109);
        ia.k(36);
        fc.a(20811);
        u.a(2);
        hc.a(false);
        sa.a(30334);
        v.a((byte) -63);
        s.a((byte) -104);
        hh.a((byte) -22);
        vh.h((byte) -98);
        jh.b(126);
        ra.d((byte) 108);
        tg.h(-64);
        t.c((byte) 113);
        cb.b(0);
        la.a((byte) 1);
        ik.d(0);
        jb.a(-730625660);
        pd.a((byte) 98);
        vj.e(true);
        fg.a((byte) 6);
        hd.a((byte) 125);
        gl.a();
        fd.a(-12241);
        kl.a(21367);
        lb.a((byte) -49);
        ll.a(-1);
        ee.a((byte) 79);
        wi.b(64);
        bl.a(-29584);
        ac.a((byte) -77);
        a.a(-1);
        pe.a((byte) 93);
        ca.a(true);
        ai.a(0);
        hi.a((byte) 56);
        te.a(-1);
        dl.a(true);
        kk.a((byte) 63);
        nk.a();
        fk.a(-4918);
        va.b((byte) 80);
        mc.a((byte) 40);
        ea.a((byte) 48);
        ni.a(-81);
        w.b(3);
        eg.a((byte) -118);
        ci.a(-124);
        bd.a((byte) -74);
        uj.c((byte) -44);
        dk.a(-115);
        kf.a(0);
        kc.a(false);
        qd.h((byte) -37);
        vk.e((byte) 73);
        ba.c(125);
        dh.a((byte) -107);
        na.a(426388817);
        ff.f(-75);
        rc.a((byte) -14);
        ta.a(-32769);
        gd.a((byte) 123);
        ha.a((byte) -62);
        b.a(true);
        ic.a((byte) -120);
        wj.a(false);
        oe.b(12);
        le.a(-11434);
        hf.b(-22720);
        mg.c(0);
        jk.a(-124);
        nf.b(-109);
        ad.f((byte) -95);
        fe.f((byte) 73);
        qj.l(-102);
        fa.a(1851621384);
        kd.a(-16);
        ab.e((byte) 119);
        jg.e(934716193);
        pa.f(-200);
        gh.e(13329);
        qf.d((byte) 100);
        vg.b(-117);
        jj.a(0);
        el.e((byte) 115);
        sj.f((byte) 126);
        h.a();
        li.b(-23);
        se.c((byte) -2);
        ij.b(20756);
        ve.a(32729);
        tj.g(-123);
        af.g(9392);
        o.a(4432);
        ek.a(false);
        bh.a(-110);
        mi.d(1);
        ej.f(99);
        fl.e(115);
        cd.a(8192);
        wh.a(true);
        ob.d(-18147);
        rh.a(false);
        gb.b(122);
        fh.b((byte) -46);
        sh.b(4);
        tf.a(18172);
        ie.h(24288);
        vc.b((byte) 35);
        re.d(0);
        hj.a((byte) -45);
        ld.g(8240);
        oj.d(-113);
        ah.a(-91);
        rj.a(-1);
        hb.a(9681);
        pf.a(true);
        ig.a(-1);
        qb.a(-115);
        ge.a(45);
        q.b((byte) 119);
        kj.a(0);
        mj.a(true);
        od.a(83);
        cl.d((byte) 121);
        vd.a(32);
        ae.a((byte) 64);
        bc.b((byte) -128);
        we.b((byte) 95);
        dg.d(124);
        of.a(true);
        il.b(2147483647);
        nh.a(false);
        nd.g(0);
        cc.e((byte) -98);
        cf.f(1);
        di.f(24979);
        vb.e((byte) 114);
        og.a((byte) 92);
        oi.a(false);
        p.a(11);
        uc.e(1);
        sk.a(false);
        this.field_u = null;
    }

    final void d(byte param0) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        Object stackIn_7_1 = null;
        int stackIn_8_0 = 0;
        Object stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_88_0 = 0;
        Object var2;
        int var3_int;
        wf var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = field_A;
          if (n.field_a != null) {
            stackIn_3_0 = n.field_a;
            break L0;
          } else {
            stackIn_3_0 = kj.field_E;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (le.c(4)) {
          L1: {
            stackIn_7_0 = 320;

            stackIn_7_1 = var2;

            if (n.field_a != null) {
              stackIn_8_0 = stackIn_7_0;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = 1;
              break L1;
            } else {
              stackIn_8_0 = stackIn_7_0;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = dl.field_d ? 1 : 0;
              break L1;
            }
          }
          ee.a(stackIn_8_0, (java.awt.Canvas) ((Object) stackIn_8_1), stackIn_8_2 != 0);
          return;
        } else {
          L2: {
            if (param0 == 22) {
              break L2;
            } else {
              this.l((byte) -102);
              break L2;
            }
          }
          if (ld.field_ib) {
            if (oh.field_a != null) {
              ma.a(q.field_i, -13923, 100.0f);
              oi.a((java.awt.Canvas) (var2), (byte) 72);
              return;
            } else {
              L3: {
                if (qc.field_d == 0) {
                  ki.b();
                  break L3;
                } else {
                  var3_int = (320 + -fi.field_e.field_f) / 48;
                  eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                  var3_int += 320;
                  eb.field_b[qd.field_E[5]].a(var3_int, hc.field_c + 240, 320, 240);
                  eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                  var3_int += 320;
                  eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                  var3_int -= 960;
                  eb.field_b[qd.field_E[5]].a(var3_int, 240 + hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                  break L3;
                }
              }
              L4: {
                if ((gj.field_c ^ -1) != 0) {
                  break L4;
                } else {
                  if (50 <= cd.field_c) {
                    gb.field_r.d(-gb.field_r.field_x + 640 >> 1958122657, 0);
                    break L4;
                  } else {
                    L5: {
                      gj.field_e.d(-gj.field_e.field_x + 640 >> 2143672641, 0);
                      if (25 < cd.field_c) {
                        break L5;
                      } else {
                        if (field_z == -2) {
                          break L5;
                        } else {
                          gb.field_r.e(640 - gb.field_r.field_x >> -1364140095, 0, -(cd.field_c * 10) + 250);
                          break L5;
                        }
                      }
                    }
                    if (-26 > (cd.field_c ^ -1)) {
                      gb.field_r.e(-gb.field_r.field_x + 640 >> -534476095, 0, -250 + 10 * cd.field_c);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L6: {
                if (pa.field_L != field_z) {
                  L7: {
                    if ((cd.field_c ^ -1) >= -26) {
                      L8: {
                        var3_int = -cd.field_c + 25 << -1386168606;
                        if (-1 != field_z) {
                          break L8;
                        } else {
                          this.b(var3_int, 7306);
                          break L8;
                        }
                      }
                      L9: {
                        if ((pa.field_L ^ -1) == 0) {
                          this.b(-var3_int + 100, 7306);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (3 != pa.field_L) {
                          break L10;
                        } else {
                          if (1 != field_z) {
                            break L10;
                          } else {
                            this.b(0, 7306);
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (pa.field_L != 1) {
                          break L11;
                        } else {
                          if (field_z == 3) {
                            this.b(0, param0 + 7284);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if ((field_z ^ -1) > -1) {
                        break L7;
                      } else {
                        fg.field_a[field_z].a(320, var3_int);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (cd.field_c <= 25) {
                    break L6;
                  } else {
                    if (pa.field_L < 0) {
                      break L6;
                    } else {
                      L12: {
                        var3_int = -25 + cd.field_c << 1791309058;
                        if ((pa.field_L ^ -1) != 0) {
                          break L12;
                        } else {
                          this.b(var3_int, 7306);
                          break L12;
                        }
                      }
                      L13: {
                        if (field_z != -1) {
                          break L13;
                        } else {
                          this.b(-var3_int + 100, 7306);
                          break L13;
                        }
                      }
                      L14: {
                        if (-4 != (pa.field_L ^ -1)) {
                          break L14;
                        } else {
                          if (field_z != 1) {
                            break L14;
                          } else {
                            this.b(0, 7306);
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (1 != pa.field_L) {
                          break L15;
                        } else {
                          if (3 == field_z) {
                            this.b(0, 7306);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      fg.field_a[pa.field_L].a(320, var3_int);
                      break L6;
                    }
                  }
                } else {
                  if (field_z == -1) {
                    this.b(100, 7306);
                    break L6;
                  } else {
                    L16: {
                      if (-2 != (field_z ^ -1)) {
                        break L16;
                      } else {
                        this.b(0, 7306);
                        break L16;
                      }
                    }
                    L17: {
                      if (3 != field_z) {
                        break L17;
                      } else {
                        if ((lf.field_cb ^ -1) != -2) {
                          break L17;
                        } else {
                          this.b(0, 7306);
                          break L17;
                        }
                      }
                    }
                    fg.field_a[field_z].a(320, 100);
                    break L6;
                  }
                }
              }
              L18: {
                var3 = (wf) ((Object) pk.field_a.c(-3905));
                if (var3 == null) {
                  break L18;
                } else {
                  L19: {
                    var5 = this.field_B;
                    if (80 <= var5) {
                      if (230 <= var5) {
                        var4 = -(var5 / 2) + 123;
                        break L19;
                      } else {
                        var4 = 8;
                        break L19;
                      }
                    } else {
                      var4 = var5 / 2 + -32;
                      break L19;
                    }
                  }
                  j.field_c[var3.field_g].c(8, var4);
                  af.field_y.a(di.field_j[var3.field_g], 48, var4 - -af.field_y.field_p, 65535, -1);
                  break L18;
                }
              }
              L20: {
                if (-1 != (nh.field_e ^ -1)) {
                  var4 = 256 * jb.field_e / 50;
                  if (0 < var4) {
                    ki.b(0, 0, ki.field_j, ki.field_f, 0, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
              L21: {
                if (!gh.f(-23093)) {
                  break L21;
                } else {
                  ki.b(0, 0, 640, 480, 0, 128);
                  ki.d(-12 + (-(ii.a(6940) / 2) + 320), -12 + -(wc.d(20) / 2) + 240, 24 - -ii.a(6940), 24 - -wc.d(20), 0);
                  fg.a(32513, jk.field_f, 12, 12);
                  break L21;
                }
              }
              L22: {
                if (!cb.a(false)) {
                  break L22;
                } else {
                  if (!gh.f(param0 ^ -23075)) {
                    L23: {
                      if (n.field_a != null) {
                        stackIn_88_0 = 1;
                        break L23;
                      } else {
                        stackIn_88_0 = 0;
                        break L23;
                      }
                    }
                    jf.a(stackIn_88_0 != 0, param0 ^ 106);
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
              dd.a((java.awt.Canvas) (var2), 0, 0, -23466);
              return;
            }
          } else {
            oi.a((java.awt.Canvas) (var2), (byte) -128);
            return;
          }
        }
    }

    final void f(int param0) {
        int var2;
        int var3;
        var3 = field_A;
        this.a(9, 9, 0, 8, true, 6, false, 7);
        hh.field_b = new hl[9];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 9) {
            var2 = 60 % ((param0 - -23) / 47);
            sb.field_m = 33023;
            hh.field_b[4] = null;
            ig.field_b = 16777215;
            sd.field_a = 33023;
            df.a(22050, false, 10);
            nb.field_f = df.a(nb.field_e, (java.awt.Component) ((Object) kj.field_E), 0, 512);
            ea.field_d = df.a(nb.field_e, (java.awt.Component) ((Object) kj.field_E), 1, 22050);
            jk.field_k = new vi();
            ti.field_f = new vi();
            nb.field_f.a(jk.field_k);
            ea.field_d.a(ti.field_f);
            se.field_m = 0;
            bi.field_b = false;
            mc.field_b = 128;
            dg.field_l = 0;
            nb.field_g = 64;
            lc.field_gb = -2048;
            nf.field_l = 0;
            ua.field_c = -2;
            qc.field_d = 2;
            this.a(false, false, false, true, -752);
            wa.a(0, -75, 16777215, 0, rj.field_l, (java.applet.Applet) (this));
            return;
          } else {
            hh.field_b[var2] = new hl(1, 1);
            hh.field_b[var2].field_B[0] = 65535;
            var2++;
            continue L0;
          }
        }
    }

    final void a(int param0) {
        L0: {
          if (n.field_a == null) {
            break L0;
          } else {
            re.a(param0 ^ -25109);
            break L0;
          }
        }
        L1: {
          if (null != nb.field_f) {
            nb.field_f.b();
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (null == ea.field_d) {
            break L2;
          } else {
            ea.field_d.b();
            break L2;
          }
        }
        L3: {
          la.a(2);
          if (param0 == -25109) {
            break L3;
          } else {
            this.m((byte) 25);
            break L3;
          }
        }
    }

    public static void r(int param0) {
        field_C = null;
        if (param0 <= 121) {
            return;
        }
        field_y = null;
    }

    private final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int var3;
        L0: {
          var3 = field_A;
          oe.field_a = oe.field_a - 1;
          ja.field_d = ja.field_d + 1;
          if (-1 != (kg.field_a ^ -1)) {
            na.field_d = na.field_d + fc.field_e;
            il.field_i = il.field_i + 2;
            oe.field_a = oe.field_a + 1;
            ja.field_d = ja.field_d + 1;
            fc.field_e = fc.field_e - jl.field_d * fc.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (wc.field_c[98]) {
            jl.field_d = jl.field_d + pe.field_d;
            ja.field_d = ja.field_d + 5;
            oe.field_a = oe.field_a + 5;
            il.field_i = il.field_i + 10;
            fc.field_e = fc.field_e - pe.field_d * na.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (wc.field_c[99]) {
            oe.field_a = oe.field_a + 3;
            na.field_d = na.field_d - kc.field_Q;
            fc.field_e = fc.field_e + jl.field_d * kc.field_Q;
            ja.field_d = ja.field_d + 7;
            il.field_i = il.field_i + 10;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!wc.field_c[84]) {
            break L3;
          } else {
            fc.field_e = fc.field_e - na.field_d;
            jl.field_d = jl.field_d + 1;
            oe.field_a = oe.field_a + 10;
            ja.field_d = ja.field_d - 10;
            break L3;
          }
        }
        L4: {
          va.field_f = va.field_f + 1;
          se.field_u = 256;
          if (5 >= va.field_f) {
            break L4;
          } else {
            va.field_f = va.field_f - 5;
            pd.field_a = pd.field_a + 1;
            if (-6 >= (pd.field_a ^ -1)) {
              pd.field_a = pd.field_a - 5;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (null == pk.field_a.c(-3905)) {
            break L5;
          } else {
            fieldTemp$0 = this.field_B + 1;
            this.field_B = this.field_B + 1;
            if (fieldTemp$0 == 335) {
              this.field_B = 0;
              pk.field_a.a((byte) 39);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if ((nh.field_e ^ -1) != -1) {
            if (1 == nh.field_e) {
              jb.field_e = jb.field_e + 1;
              if (-51 == (jb.field_e ^ -1)) {
                L7: {
                  if (!gh.f(-23093)) {
                    pk.b(0);
                    break L7;
                  } else {
                    mf.a((byte) -58);
                    break L7;
                  }
                }
                nh.field_e = 2;
                break L6;
              } else {
                break L6;
              }
            } else {
              if (-3 != (nh.field_e ^ -1)) {
                jb.field_e = jb.field_e - 1;
                if (-1 == (jb.field_e ^ -1)) {
                  nh.field_e = 0;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                L8: {
                  if (wk.a(77)) {
                    field_z = vj.field_ab;
                    break L8;
                  } else {
                    oh.field_a = og.a(4, (byte) 113);
                    sa.a(nf.field_l + na.field_a * 3, 23820);
                    field_z = ff.field_o;
                    break L8;
                  }
                }
                L9: {
                  if (gh.f(-23093)) {
                    hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, -11, 12, false);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                nh.field_e = 3;
                pa.field_L = field_z;
                break L6;
              }
            }
          } else {
            if (pa.field_L == field_z) {
              if ((field_z ^ -1) != 0) {
                fg.field_a[field_z].b(0);
                break L6;
              } else {
                this.m((byte) 110);
                break L6;
              }
            } else {
              L10: {
                cd.field_c = cd.field_c + 1;
                if (25 > cd.field_c) {
                  break L10;
                } else {
                  if (-1 == pa.field_L) {
                    cd.field_c = 50;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              if (cd.field_c >= 50) {
                field_z = pa.field_L;
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L11: {
          if (param0) {
            break L11;
          } else {
            this.t(-117);
            break L11;
          }
        }
    }

    public StarCannon() {
        this.field_D = 0;
        this.field_B = 0;
    }

    final static void a(ue param0, boolean param1, int param2, ue param3, ue param4) {
        try {
            qa.field_a = uf.a("", 15);
            if (param2 != -20169) {
                field_E = 's';
            }
            qa.field_a.a(false, false);
            fc.a(param0, param4, (byte) 95, param3);
            td.b(30000);
            ie.field_x = cl.field_k;
            uh.field_k = cl.field_k;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "StarCannon.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k(byte param0) {
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_104_0 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        bf var6;
        int var7;
        int var8;
        bf var8_ref_bf;
        int var9;
        int var10;
        bf var11;
        int var12;
        L0: {
          var12 = field_A;
          var2 = sh.b(-127, 3) + ua.field_c;
          if (ue.field_c[rj.field_h] >= var2) {
            break L0;
          } else {
            if (ua.field_c <= ue.field_c[rj.field_h]) {
              var2 = ue.field_c[rj.field_h];
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var3 = sh.b(-126, 640);
            var4 = -64 + fi.field_e.field_f + sh.b(-127, 128);
            var5 = null;
            var7 = var2;
            if ((var7 ^ -1) == -1) {
              break L2;
            } else {
              if (3 != var7) {
                if (-11 != (var7 ^ -1)) {
                  L3: {
                    if (var7 != 1) {
                      if (11 == var7) {
                        break L3;
                      } else {
                        if (var7 != 5) {
                          L4: {
                            if (2 != var7) {
                              if (var7 != 9) {
                                L5: {
                                  if ((var7 ^ -1) == -5) {
                                    break L5;
                                  } else {
                                    if ((var7 ^ -1) != -16) {
                                      L6: {
                                        if (-7 != (var7 ^ -1)) {
                                          if (19 == var7) {
                                            break L6;
                                          } else {
                                            if (7 == var7) {
                                              nf.field_e = 0;
                                              kh.field_y.b(73, new bf(var3, -64, var4, 3));
                                              kh.field_y.b(64, new bf(640 + -var3, -64, 640 + -var3, 21));
                                              break L1;
                                            } else {
                                              L7: {
                                                if ((var7 ^ -1) == -9) {
                                                  break L7;
                                                } else {
                                                  if ((var7 ^ -1) == -15) {
                                                    break L7;
                                                  } else {
                                                    L8: {
                                                      if (var7 == 12) {
                                                        break L8;
                                                      } else {
                                                        if ((var7 ^ -1) != -17) {
                                                          if (13 == var7) {
                                                            nf.field_e = -50;
                                                            var7 = sh.b(-126, 180) + 32;
                                                            kh.field_y.b(74, new bf(var7, -64, var7, 12));
                                                            var7 = 608 + -sh.b(-128, 180);
                                                            kh.field_y.b(56, new bf(var7, -64, var7, 12));
                                                            break L1;
                                                          } else {
                                                            if ((var7 ^ -1) == -18) {
                                                              L9: {
                                                                nf.field_e = -50;
                                                                kh.field_y.b(82, new bf(32, -64, 32, 21));
                                                                if (-1 == (sh.b(34, 2) ^ -1)) {
                                                                  kh.field_y.b(91, new bf(320, -32, 320, 18));
                                                                  kh.field_y.b(67, new bf(320, -96, 320, 18));
                                                                  kh.field_y.b(79, new bf(320, -160, 320, 18));
                                                                  break L9;
                                                                } else {
                                                                  kh.field_y.b(69, new bf(320, -96, 320, 21));
                                                                  break L9;
                                                                }
                                                              }
                                                              kh.field_y.b(106, new bf(608, -64, 608, 21));
                                                              break L1;
                                                            } else {
                                                              if (18 == var7) {
                                                                nf.field_e = 150;
                                                                kh.field_y.b(76, new bf(var3, -64, var4, 3));
                                                                var7 = 0;
                                                                L10: while (true) {
                                                                  L11: {
                                                                    if (2 == nf.field_l) {
                                                                      stackIn_104_0 = 2;
                                                                      break L11;
                                                                    } else {
                                                                      stackIn_104_0 = 1;
                                                                      break L11;
                                                                    }
                                                                  }
                                                                  if (stackIn_104_0 <= var7) {
                                                                    kh.field_y.b(107, new bf(-var3 + 640, -64, 640 - var4, 3));
                                                                    break L1;
                                                                  } else {
                                                                    kh.field_y.b(112, new bf(320, 64 * -var7 - 128, 320, 3));
                                                                    var7++;
                                                                    continue L10;
                                                                  }
                                                                }
                                                              } else {
                                                                if (20 == var7) {
                                                                  var6 = new bf(320, -256, var4, 16);
                                                                  kh.field_y.b(88, var6);
                                                                  tj.field_C = var6.field_k;
                                                                  ua.field_c = 1 + ue.field_c[rj.field_h];
                                                                  pf.field_d = pf.field_d + 1;
                                                                  dg.field_l = 0;
                                                                  mj.a(255, 12, 0, 41, 100);
                                                                  ti.field_f.a(kc.field_P);
                                                                  kc.field_P.f();
                                                                  kc.field_P = fl.field_h;
                                                                  ti.field_f.b(kc.field_P);
                                                                  kc.field_P.a(mc.field_b);
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    nf.field_e = 100;
                                                    kh.field_y.b(75, new bf(var3, -64, -64 + sh.b(-1, 128), 5));
                                                    break L1;
                                                  }
                                                }
                                              }
                                              L12: {
                                                nf.field_e = 0;
                                                var7 = 0;
                                                if ((sh.b(62, 2) ^ -1) != -1) {
                                                  var9 = -24;
                                                  var8 = 560;
                                                  break L12;
                                                } else {
                                                  var8 = 80;
                                                  var9 = 24;
                                                  break L12;
                                                }
                                              }
                                              var10 = -10;
                                              L13: while (true) {
                                                if ((var10 ^ -1) < -11) {
                                                  var8 = 64 + sh.b(100, 512);
                                                  kh.field_y.b(95, new bf(var8, -96, var8, 21));
                                                  break L1;
                                                } else {
                                                  var11 = new bf(var8, var7, 640 + -var8, 17);
                                                  var7 -= 16;
                                                  var11.field_p = true;
                                                  var8 = var8 + var9;
                                                  kh.field_y.b(100, var11);
                                                  var10++;
                                                  continue L13;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L6;
                                        }
                                      }
                                      nf.field_e = 0;
                                      var7 = 0;
                                      L14: while (true) {
                                        if (5 <= var7) {
                                          kh.field_y.b(122, new bf(-var3 + 640, -64, -var3 + 640, 21));
                                          break L1;
                                        } else {
                                          kh.field_y.b(117, new bf(var3, -64 + -var7 * 64, var4, 1));
                                          var7++;
                                          continue L14;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                nf.field_e = 0;
                                var7 = 0;
                                L15: while (true) {
                                  if (5 <= var7) {
                                    kh.field_y.b(57, new bf(640 - var3, -64, -var4 + 640, 3));
                                    break L1;
                                  } else {
                                    kh.field_y.b(81, new bf(var3, -64 + -var7 * 64, var4, 1));
                                    var7++;
                                    continue L15;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          nf.field_e = 175;
                          var7 = 0;
                          L16: while (true) {
                            L17: {
                              stackIn_67_0 = var7;

                              if (2 != nf.field_l) {
                                stackIn_68_0 = stackIn_67_0;
                                stackIn_68_1 = 5;
                                break L17;
                              } else {
                                stackIn_68_0 = stackIn_67_0;
                                stackIn_68_1 = 10;
                                break L17;
                              }
                            }
                            if (stackIn_68_0 >= stackIn_68_1) {
                              break L1;
                            } else {
                              kh.field_y.b(63, new bf(var3, -64 + 64 * -var7, var4, 4));
                              var7++;
                              continue L16;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  nf.field_e = 0;
                  var4 = var3 - -sh.b(-24, 128) - 64;
                  var7 = 0;
                  L18: while (true) {
                    L19: {
                      stackIn_58_0 = var7 ^ -1;

                      if (nf.field_l == 2) {
                        stackIn_59_0 = stackIn_58_0;
                        stackIn_59_1 = 10;
                        break L19;
                      } else {
                        stackIn_59_0 = stackIn_58_0;
                        stackIn_59_1 = 5;
                        break L19;
                      }
                    }
                    if (stackIn_59_0 <= (stackIn_59_1 ^ -1)) {
                      break L1;
                    } else {
                      L20: {
                        var8_ref_bf = new bf(var3, -64 + 64 * -var7, var4, 2);
                        var8_ref_bf.field_h = (bf) (var5);
                        kh.field_y.b(115, var8_ref_bf);
                        if (var7 != 0) {
                          break L20;
                        } else {
                          var5 = var8_ref_bf;
                          break L20;
                        }
                      }
                      var7++;
                      continue L18;
                    }
                  }
                } else {
                  L21: {
                    nf.field_e = 0;
                    var7 = -64;
                    if (sh.b(-126, 2) == 0) {
                      var8 = 80;
                      var9 = 24;
                      break L21;
                    } else {
                      var9 = -24;
                      var8 = 560;
                      break L21;
                    }
                  }
                  var10 = -10;
                  L22: while (true) {
                    if (10 < var10) {
                      break L1;
                    } else {
                      var11 = new bf(var8, var7, 640 - var8, 17);
                      var7 -= 16;
                      var11.field_p = true;
                      var8 = var8 + var9;
                      kh.field_y.b(107, var11);
                      var10++;
                      continue L22;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
          }
          nf.field_e = 0;
          var7 = -8;
          L23: while (true) {
            if ((var7 ^ -1) <= -9) {
              break L1;
            } else {
              kh.field_y.b(88, new bf(320 - -(var7 * 24), -Math.abs(-64 + var7 * 64), 24 * var7 + 320, 1));
              var7++;
              continue L23;
            }
          }
        }
        L24: {
          if (param0 >= 79) {
            break L24;
          } else {
            this.o(112);
            break L24;
          }
        }
    }

    static {
        field_y = new int[8192];
        field_C = "Menu";
        field_z = -2;
    }
}
