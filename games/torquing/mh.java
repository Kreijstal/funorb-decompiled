/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    private int field_b;
    db field_a;
    private int field_h;
    static sm[] field_d;
    static int[] field_k;
    static String[] field_f;
    private Torquing field_c;
    static boolean field_g;
    int field_i;
    private int field_j;
    private int field_e;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ph.c(param1, param7, param5, param4, 7, param0);
        ph.e(param1, param7, param5, param4, 7, param6);
        int var10 = 121 % ((-55 - param3) / 58);
        int[] var13 = new int[4];
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var9 = var11;
        ph.b(var13);
        ph.f(param1, param7, param5 + param1, param7 + 3);
        ph.e(param1, param7, param5, param4, 7, param2);
        ph.a(var13);
        ph.f(param1, param7, param1 + 3, param7 - -param4);
        ph.e(param1, param7, param5, param4, 7, param2);
        ph.a(var13);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        pk stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        pk stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        pk stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        pk stackIn_64_0 = null;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        pk stackIn_65_0 = null;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        pk stackIn_66_0 = null;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        pk stackIn_84_0 = null;
        String stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        pk stackIn_85_0 = null;
        String stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        pk stackIn_86_0 = null;
        String stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int stackIn_86_4 = 0;
        pk stackIn_87_0 = null;
        String stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int stackIn_87_4 = 0;
        int stackIn_87_5 = 0;
        pk stackIn_88_0 = null;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int stackIn_88_4 = 0;
        int stackIn_88_5 = 0;
        pk stackIn_89_0 = null;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        int stackIn_89_5 = 0;
        int stackIn_89_6 = 0;
        int stackIn_97_0 = 0;
        int stackIn_105_0 = 0;
        t stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        t stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        t stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        int stackIn_135_0 = 0;
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        t var14_ref_t = null;
        int var15 = 0;
        int var16 = 0;
        t var17_ref_t = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = Torquing.field_u;
                    var5 = this.b(param2, 1);
                    var6 = var5 + this.a((byte) -125, param2) >> -727965087;
                    var7 = de.field_c[this.field_h];
                    var8 = rf.field_q[this.field_h][param2];
                    var23 = hb.field_u[var8];
                    var9 = var23;
                    var9 = var23;
                    var24 = var23;
                    var9 = var24;
                    var9 = var24;
                    var9 = var24;
                    var10 = i.field_Q.a(hb.field_u[2]);
                    var11 = i.field_Q.a(hb.field_u[13]);
                    if (var11 < var10) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = var11;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = var10;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var12 = stackIn_3_0;
                    if (param3 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_j = 99;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var13 = var8;
                    if (-3 == (var13 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (-14 == (var13 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-11 == (var13 ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var13 != 18) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var22 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var13 != 19) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var22 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var13 == 20) {
                        statePc = 91;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var13 = -(var12 + 160 >> -1796043359) + var6 - -var12;
                    if (var8 != 2) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = on.field_c;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = of.field_m;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var14 = stackIn_19_0;
                    pp.a(var13 - -3, (byte) -128, 14145495, 5 + param1, 14145495);
                    wf.a(param1 + 5, 14145495, 126, var13 - -3 - -var14, 14145495);
                    pp.a(var13 + 2, (byte) -126, 8947848, 4 + param1, 8947848);
                    wf.a(param1 - -4, 8947848, 126, var14 + 2 + var13, 8947848);
                    pp.a(var13 - -1, (byte) -128, 6710886, 3 + param1, 6710886);
                    wf.a(3 + param1, 6710886, param3 ^ 36, var13 + 1 - -var14, 6710886);
                    if (!param0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = i.field_Q.field_O[9][1];
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = i.field_Q.field_O[1][1];
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var15 = stackIn_22_0;
                    pp.a(var13, (byte) -125, var15, param1 + 2, 0);
                    wf.a(2 + param1, var15, 126, var13 - -var14, 0);
                    if (var22 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var9 = var23 + po.field_t[sg.field_f];
                    if (var22 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var13 = wi.field_a[rn.field_j];
                    if ((nh.field_k ^ -1) != (wi.field_a.length ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = 1 + wi.field_a[-1 + nh.field_k];
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = wi.field_a[nh.field_k];
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var14 = stackIn_27_0;
                    stackIn_29_0 = i.field_Q;
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = wa.field_c;
                    stackIn_28_1 = stackIn_29_1;
                    stackIn_29_2 = 104;
                    stackIn_28_2 = stackIn_29_2;
                    stackIn_29_3 = 108;
                    stackIn_28_3 = stackIn_29_3;
                    if (param0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (pk) ((Object) stackIn_28_0);
                    stackIn_30_1 = (String) ((Object) stackIn_28_1);
                    stackIn_30_2 = stackIn_28_2;
                    stackIn_30_3 = stackIn_28_3;
                    stackIn_30_4 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (pk) ((Object) stackIn_29_0);
                    stackIn_30_1 = (String) ((Object) stackIn_29_1);
                    stackIn_30_2 = stackIn_29_2;
                    stackIn_30_3 = stackIn_29_3;
                    stackIn_30_4 = 9;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((pk) (Object) stackIn_30_0).c(stackIn_30_1, stackIn_30_2, stackIn_30_3, stackIn_30_4, -1);
                    var15 = 168;
                    param1 = 72;
                    var16 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var16 >= 8) {
                        statePc = 50;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var17_ref_t = rp.field_b[var16];
                    if (var22 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var13 == var16) {
                        statePc = 48;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!this.field_a.field_k) {
                        statePc = 41;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var14 < var16) {
                        statePc = 41;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((n.field_t ^ -1) > (var15 + -3 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((-3 + param1 ^ -1) < (k.field_e ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((n.field_t ^ -1) <= (var15 - -var17_ref_t.field_s - -3 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (3 + (var17_ref_t.field_u + param1) > k.field_e) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var14 < var16) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    this.a(14211288, var15 - 3, 8947848, 111, var17_ref_t.field_u - -6, 6 + var17_ref_t.field_s, 8947848, -3 + param1);
                    rp.field_b[var16 + 8].d(var15, param1);
                    if (var22 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var17_ref_t.e(var15, param1, 96);
                    if (var22 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a(15000804, -3 + var15, 11184810, param3 + 72, var17_ref_t.field_u - -6, 6 + var17_ref_t.field_s, 1052688, -3 + param1);
                    rp.field_b[var16 - -16].d(var15, param1);
                    if (var22 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.a(10526880, var15 + -3, 1052688, -123, 6 + var17_ref_t.field_u, var17_ref_t.field_s - -6, 11184810, -3 + param1);
                    rp.field_b[24 + var16].d(var15, param1);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var15 = var15 + (var17_ref_t.field_s - -10);
                    var16++;
                    if (var22 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    i.field_Q.c(jp.field_n[var13], 314, 123 + um.field_m.field_x, 0, -1);
                    return;
                }
                case 51: {
                    var13 = wi.field_a[rn.field_j];
                    if (param0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackIn_54_0 = 1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = 9;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var14 = stackIn_54_0;
                    if (param0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = 8;
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = 10;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var15 = stackIn_57_0;
                    if ((wi.field_a.length ^ -1) == (nh.field_k ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = wi.field_a[nh.field_k];
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = wi.field_a[-1 + nh.field_k] - -1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var16 = stackIn_60_0;
                    var17 = qc.field_ab[var13];
                    var18 = hg.field_d[rn.field_j];
                    if ((var16 ^ -1) < (var13 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_63_0 = hg.field_d[nh.field_k];
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = var17;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var19 = stackIn_63_0;
                    param1 = 157;
                    stackIn_65_0 = i.field_Q;
                    stackIn_64_0 = stackIn_65_0;
                    stackIn_65_1 = lj.field_b;
                    stackIn_64_1 = stackIn_65_1;
                    stackIn_65_2 = 104;
                    stackIn_64_2 = stackIn_65_2;
                    stackIn_65_3 = 24 + param1;
                    stackIn_64_3 = stackIn_65_3;
                    if (param0) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = (pk) ((Object) stackIn_64_0);
                    stackIn_66_1 = (String) ((Object) stackIn_64_1);
                    stackIn_66_2 = stackIn_64_2;
                    stackIn_66_3 = stackIn_64_3;
                    stackIn_66_4 = 1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (pk) ((Object) stackIn_65_0);
                    stackIn_66_1 = (String) ((Object) stackIn_65_1);
                    stackIn_66_2 = stackIn_65_2;
                    stackIn_66_3 = stackIn_65_3;
                    stackIn_66_4 = 9;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    ((pk) (Object) stackIn_66_0).c(stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4, -1);
                    var20 = 168;
                    var21 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if ((var21 ^ -1) <= (var17 ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((var18 ^ -1) == (var21 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!this.field_a.field_k) {
                        statePc = 78;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var21 == var18) {
                        statePc = 78;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var21 > var19) {
                        statePc = 78;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (n.field_t < -3 + var20) {
                        statePc = 78;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if ((k.field_e ^ -1) > (-2 + param1 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if ((n.field_t ^ -1) <= (i.field_N.a((char)(49 + var21)) + (var20 + 3) ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((k.field_e ^ -1) <= (24 + i.field_N.field_t + (param1 + 6) ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    this.a(15000804, -3 + var20, 11184810, 82, 8 + (i.field_N.field_t - -24), 6 + i.field_N.a((char)(var21 + 49)), 1052688, param1 - 2);
                    if (var22 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((var21 ^ -1) == (var18 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((var21 ^ -1) >= (var19 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.a(14211288, -3 + var20, 8947848, 7, i.field_N.field_t - -24 - -8, 6 + i.field_N.a((char)(49 + var21)), 8947848, -2 + param1);
                    if (var22 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    this.a(10526880, var20 + -3, 1052688, -121, 8 + (24 + i.field_N.field_t), i.field_N.a((char)(49 + var21)) + 6, 11184810, -2 + param1);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    i.field_Q.field_O[8][1] = 16776960;
                    stackIn_85_0 = i.field_Q;
                    stackIn_84_0 = stackIn_85_0;
                    stackIn_85_1 = Integer.toString(var21 - -1);
                    stackIn_84_1 = stackIn_85_1;
                    stackIn_85_2 = var20;
                    stackIn_84_2 = stackIn_85_2;
                    stackIn_85_3 = 24 + param1;
                    stackIn_84_3 = stackIn_85_3;
                    if (var21 != var18) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_86_0 = (pk) ((Object) stackIn_84_0);
                    stackIn_86_1 = (String) ((Object) stackIn_84_1);
                    stackIn_86_2 = stackIn_84_2;
                    stackIn_86_3 = stackIn_84_3;
                    stackIn_86_4 = var15;
                    statePc = 86;
                    continue stateLoop;
                }
                case 85: {
                    stackIn_86_0 = (pk) ((Object) stackIn_85_0);
                    stackIn_86_1 = (String) ((Object) stackIn_85_1);
                    stackIn_86_2 = stackIn_85_2;
                    stackIn_86_3 = stackIn_85_3;
                    stackIn_86_4 = var14;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    stackIn_88_0 = (pk) ((Object) stackIn_86_0);
                    stackIn_87_0 = stackIn_88_0;
                    stackIn_88_1 = (String) ((Object) stackIn_86_1);
                    stackIn_87_1 = stackIn_88_1;
                    stackIn_88_2 = stackIn_86_2;
                    stackIn_87_2 = stackIn_88_2;
                    stackIn_88_3 = stackIn_86_3;
                    stackIn_87_3 = stackIn_88_3;
                    stackIn_88_4 = stackIn_86_4;
                    stackIn_87_4 = stackIn_88_4;
                    stackIn_88_5 = -1;
                    stackIn_87_5 = stackIn_88_5;
                    if (var21 <= var19) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_89_0 = (pk) ((Object) stackIn_87_0);
                    stackIn_89_1 = (String) ((Object) stackIn_87_1);
                    stackIn_89_2 = stackIn_87_2;
                    stackIn_89_3 = stackIn_87_3;
                    stackIn_89_4 = stackIn_87_4;
                    stackIn_89_5 = stackIn_87_5;
                    stackIn_89_6 = 64;
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (pk) ((Object) stackIn_88_0);
                    stackIn_89_1 = (String) ((Object) stackIn_88_1);
                    stackIn_89_2 = stackIn_88_2;
                    stackIn_89_3 = stackIn_88_3;
                    stackIn_89_4 = stackIn_88_4;
                    stackIn_89_5 = stackIn_88_5;
                    stackIn_89_6 = 256;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    ((pk) (Object) stackIn_89_0).a(stackIn_89_1, stackIn_89_2, stackIn_89_3, stackIn_89_4, stackIn_89_5, stackIn_89_6);
                    var20 += 40;
                    var21++;
                    if (var22 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    return;
                }
                case 91: {
                    if ((this.field_h ^ -1) == -4) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    param1 = 307;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var13 = 320 - (um.field_m.a(var24) >> -1388155391);
                    if (40 < var7) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_97_0 = var7;
                    statePc = 97;
                    continue stateLoop;
                }
                case 96: {
                    stackIn_97_0 = 40;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    var14 = stackIn_97_0;
                    var15 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if ((hq.field_d.length ^ -1) >= (var15 ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var16 = 1;
                    if ((var15 ^ -1) == (ld.field_k ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (this.field_a.field_k) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (!param0) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_105_0 = 9;
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_105_0 = 6;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var16 = stackIn_105_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (!this.field_a.field_k) {
                        statePc = 114;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (!param0) {
                        statePc = 114;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (n.field_t < var13) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (param1 > k.field_e) {
                        statePc = 114;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if ((k.field_e ^ -1) <= (var14 + param1 ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if ((n.field_t ^ -1) > (um.field_m.a(hq.field_d[var15]) + var13 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var16 = 9;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var17 = um.field_m.a(hq.field_d[var15]);
                    i.field_Q.c(hq.field_d[var15], var13 + (var17 >> -730060831), param1 + um.field_m.field_x, var16, -1);
                    var13 = var13 + var17;
                    if (2 == var15) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var17 = um.field_m.a(" / ");
                    i.field_Q.c(" / ", (var17 >> -1759157951) + var13, um.field_m.field_x + param1, 0, -1);
                    var13 = var13 + var17;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var15++;
                    if (var22 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    return;
                }
                case 118: {
                    if ((this.field_h ^ -1) != -10) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    param1 = param1 - (var7 << -402707135);
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var13 = var5;
                    if (3 != this.field_h) {
                        statePc = 123;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var8 != 14) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    param1 = 205;
                    var6 = 320;
                    var13 = 156;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (2 == var8) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (-14 == (var8 ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var6 = var6 - (160 + var12 >> 1961176385);
                    var6 = var6 + (var12 >> 2103603425);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (var9 != null) {
                        statePc = 132;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var14_ref_t = dj.field_a[kh.field_p[var8]];
                    stackIn_130_0 = (t) (var14_ref_t);
                    stackIn_129_0 = stackIn_130_0;
                    stackIn_130_1 = var13;
                    stackIn_129_1 = stackIn_130_1;
                    stackIn_130_2 = param1;
                    stackIn_129_2 = stackIn_130_2;
                    if (!param0) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = (t) ((Object) stackIn_129_0);
                    stackIn_131_1 = stackIn_129_1;
                    stackIn_131_2 = stackIn_129_2;
                    stackIn_131_3 = i.field_Q.field_O[9][1];
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = (t) ((Object) stackIn_130_0);
                    stackIn_131_1 = stackIn_130_1;
                    stackIn_131_2 = stackIn_130_2;
                    stackIn_131_3 = i.field_Q.field_O[1][1];
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    ((t) (Object) stackIn_131_0).d(stackIn_131_1, stackIn_131_2, stackIn_131_3);
                    if (var22 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (param0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackIn_135_0 = 1;
                    statePc = 135;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = 9;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var14 = stackIn_135_0;
                    i.field_Q.c(var9, var6, param1 + 24, var14, -1);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    return;
                }
                case 137: {
                    return;
                }
                case 138: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 23) {
            field_f = (String[]) null;
        }
        if (!(!rf.field_x[this.field_h])) {
            return bp.field_b[this.field_h];
        }
        return ok.field_C[this.field_h] + de.field_c[this.field_h] * param1;
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_59_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_104_0 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        t var13 = null;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        String var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Torquing.field_u;
                    if (param1 > 77) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_j = -33;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = bp.field_b[this.field_h];
                    var5 = up.field_e[this.field_h];
                    var6 = ok.field_C[this.field_h];
                    var7 = de.field_c[this.field_h];
                    if ((this.field_h ^ -1) != -3) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (param2 <= -8 + lp.field_c) {
                        statePc = 66;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param2 >= um.field_m.field_x + lp.field_c + 8) {
                        statePc = 66;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((ea.field_v + -8 ^ -1) <= (param0 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (ea.field_v + i.field_N.a('<') <= param0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return -1;
                }
                case 8: {
                    if ((param0 ^ -1) >= (vd.field_f - 8 ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (vd.field_f - -i.field_N.a('>') > param0) {
                        statePc = 11;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return -1;
                }
                case 12: {
                    if (-4 != (this.field_h ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (116 > param0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (param0 >= 525) {
                        statePc = 22;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (je.a((byte) 102)) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (param2 < 307) {
                        statePc = 66;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-348 >= (param2 ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return 2;
                }
                case 19: {
                    if (param2 < 205) {
                        statePc = 66;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (param2 >= 245) {
                        statePc = 66;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return 2;
                }
                case 22: {
                    if (9 == this.field_h) {
                        statePc = 41;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((this.field_h ^ -1) == -7) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_h == 8) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (7 == this.field_h) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (10 != this.field_h) {
                        statePc = 66;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((param2 ^ -1) <= (var6 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return -1;
                }
                case 30: {
                    var8 = (param2 + -var6) / var7;
                    if (this.field_a.field_i > var8) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return -1;
                }
                case 32: {
                    if (40 >= var7) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var7 * var8 + var6 + 40 < param2) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return -1;
                }
                case 36: {
                    var9 = var5 + var4 >> 514738209;
                    var10 = rf.field_q[this.field_h][var8];
                    var11 = um.field_m.a(hb.field_u[var10]);
                    if ((var9 + -(var11 >> 1587258657) ^ -1) < (param0 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((param0 ^ -1) > (var9 + (var11 >> 256682625) ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    return -1;
                }
                case 40: {
                    return var8;
                }
                case 41: {
                    if (69 > param2) {
                        statePc = 51;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (param2 >= 3 + (72 + rp.field_b[0].field_u)) {
                        statePc = 51;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var8 = 165;
                    var9 = 6 + var8;
                    var10 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (8 <= var10) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var9 = var9 + (10 + rp.field_b[var10].field_s);
                    var10++;
                    if (var15 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var15 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var8 > param0) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var9 <= param0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    return 0;
                }
                case 51: {
                    if (155 > param2) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (6 + (i.field_N.field_t + 181) <= param2) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var8 = wi.field_a[rn.field_j];
                    var9 = qc.field_ab[var8];
                    var10 = 165;
                    var11 = 6 + i.field_N.a((char)(var9 + 48)) + ((-1 + var9) * 40 + var10);
                    if ((param0 ^ -1) > (var10 ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (param0 >= var11) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return 1;
                }
                case 56: {
                    var8 = var6;
                    var9 = 2;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (rf.field_q[this.field_h].length <= var9) {
                        statePc = 65;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var10 = rf.field_q[this.field_h][var9];
                    var16 = hb.field_u[var10];
                    var12 = i.field_N.a(var16);
                    var13_int = param0 - (-(var12 >> 520874273) + 164) - (var4 - 2);
                    var14 = -var8 - (-2 - param2);
                    stackIn_104_0 = var13_int ^ -1;
                    stackIn_59_0 = stackIn_104_0;
                    if (var15 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 > -1) {
                        statePc = 64;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if ((var14 ^ -1) > -1) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var13_int >= var12 - -6) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (24 + (i.field_N.field_t - -8) <= var14) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    return var9;
                }
                case 64: {
                    var8 = var8 + var7;
                    var9++;
                    if (var15 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    return -1;
                }
                case 66: {
                    if (!rf.field_x[this.field_h]) {
                        statePc = 91;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((var4 ^ -1) < (param2 ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (param2 < var5) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    return -1;
                }
                case 71: {
                    var8 = var6;
                    var9 = 0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (var9 >= this.field_a.field_i) {
                        statePc = 90;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var10 = rf.field_q[this.field_h][var9];
                    stackIn_104_0 = 3;
                    stackIn_74_0 = stackIn_104_0;
                    if (var15 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (stackIn_74_0 != this.field_h) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (-15 != (var10 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var15 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var17 = hb.field_u[var10];
                    if (!this.c(4, var9)) {
                        statePc = 88;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var17 == null) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var12 = var8 - -(var7 >> 1352341953);
                    var13_int = um.field_m.a(var17);
                    if ((-(var13_int >> 993598497) + var12 ^ -1) < (param0 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if ((var13_int >> -1357613919) + var12 <= param0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    return var9;
                }
                case 83: {
                    if (var15 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var12 = kh.field_p[rf.field_q[this.field_h][var9]];
                    var13 = dj.field_a[var12];
                    if ((param0 ^ -1) <= (var8 - -var13.field_v ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    return -1;
                }
                case 86: {
                    if ((var13.field_v + var8 + var13.field_s ^ -1) > (param0 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    return var9;
                }
                case 88: {
                    var8 = var8 + var7;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    var9++;
                    if (var15 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    return -1;
                }
                case 91: {
                    if ((param0 ^ -1) > (var4 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (param0 < var5) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    return -1;
                }
                case 95: {
                    if ((param2 ^ -1) <= (var6 ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    return -1;
                }
                case 97: {
                    var8 = (-var6 + param2) / var7;
                    if (this.field_a.field_i <= var8) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    return -1;
                }
                case 100: {
                    if (var7 <= 40) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (param2 <= 40 + (var7 * var8 + var6)) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var8 = -1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    return var8;
                }
                case 104: {
                    return stackIn_104_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static of a(int param0, df param1) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        of stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        of var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            var2_int = param1.e(8, 62);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = df.a(param1, -47) ? 1 : 0;
                var4 = df.a(param1, -44) ? 1 : 0;
                var5 = new of();
                var5.field_f = (short)param1.e(16, param0 ^ -191);
                var5.field_B = fh.a(param1, 0, var5.field_B, 16);
                var5.field_j = fh.a(param1, 0, var5.field_j, 16);
                var5.field_d = fh.a(param1, 0, var5.field_d, 16);
                var5.field_R = (short)param1.e(16, -85);
                var5.field_G = fh.a(param1, 0, var5.field_G, 16);
                var5.field_r = fh.a(param1, param0 ^ param0, var5.field_r, 16);
                var5.field_I = fh.a(param1, 0, var5.field_I, 16);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_C = (short)param1.e(16, -105);
                  var5.field_q = fh.a(param1, 0, var5.field_q, 16);
                  var5.field_P = fh.a(param1, 0, var5.field_P, 16);
                  var5.field_a = fh.a(param1, param0 + -255, var5.field_a, 16);
                  var5.field_O = fh.a(param1, param0 + -255, var5.field_O, 16);
                  var5.field_J = fh.a(param1, 0, var5.field_J, 16);
                  var5.field_F = fh.a(param1, 0, var5.field_F, 16);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  param1.e(16, 72);
                  var5.field_t = fh.a(param1, 0, var5.field_t, 16);
                  var5.field_s = fh.a(param1, 0, var5.field_s, 16);
                  var5.field_z = fh.a(param1, 0, var5.field_z, 16);
                  var5.field_E = fh.a(param1, 0, var5.field_E, 16);
                  var5.field_b = fh.a(param1, param0 ^ 255, var5.field_b, 16);
                  break L2;
                }
              }
              L3: {
                if (df.a(param1, -76)) {
                  var5.field_c = fh.a(param1, 0, var5.field_c, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!df.a(param1, -95)) {
                  break L4;
                } else {
                  var5.field_i = pe.a(112, 16, var5.field_i, param1);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var7 >= var5.field_i.length) {
                          break L7;
                        } else {
                          stackIn_19_0 = var6 ^ -1;

                          stackIn_19_1 = 255 & var5.field_i[var7] ^ -1;

                          if (var8 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_19_0 <= stackIn_19_1) {
                                break L8;
                              } else {
                                var6 = var5.field_i[var7] & 255;
                                break L8;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackIn_19_0 = var6 ^ -1;
                      stackIn_19_1 = -1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_19_0 == stackIn_19_1) {
                        break L9;
                      } else {
                        var5.field_M = (byte)(var6 - -1);
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5.field_i = null;
                    break L4;
                  }
                }
              }
              stackIn_24_0 = (of) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("mh.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    private final int b(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 1) {
            discarded$0 = this.a((byte) -37, -11);
        }
        if (!(!rf.field_x[this.field_h])) {
            return ok.field_C[this.field_h] - -(de.field_c[this.field_h] * param0);
        }
        return bp.field_b[this.field_h];
    }

    final void a(byte param0, boolean param1) {
        if (param0 <= 80) {
            this.field_j = -80;
        }
        int var3 = 0;
        if (this.field_h == 0 && -1 != this.field_a.field_g) {
            var3 = this.field_a.field_g;
        }
        if ((this.field_h ^ -1) == -2 && (this.field_a.field_g ^ -1) != 0 && fn.field_c != -1) {
            var3 = this.field_a.field_g;
        }
        if (!((this.field_h ^ -1) != -5)) {
            var3 = 2;
        }
        if ((this.field_h ^ -1) != -12) {
            this.field_a.a(this.a(n.field_t, 126, k.field_e), (byte) 83, param1, var3);
        }
        this.field_i = 0;
        this.field_e = -1;
    }

    private final void a(int param0, byte param1, boolean param2) {
        this.a(rf.field_q[this.field_h][param0], param2, -73, false);
        if (param1 < 77) {
            this.a(-36, 41, 69, 35, -99, 97, 24, 76);
        }
    }

    private final t e(int param0, int param1) {
        int statePc = 0;
        t var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        t var6 = null;
        hc var7 = null;
        sg var8 = null;
        kh[] var9_ref_kh__ = null;
        int var9 = 0;
        int var10 = 0;
        kh var11_ref_kh = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        tl var15 = null;
        int var16 = 0;
        int[] var17 = null;
        ti[] var18 = null;
        ti var19 = null;
        tl[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Torquing.field_u;
                    var3 = (t) ((Object) wk.field_a.b(0));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 == null) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((-var3.field_t + var3.field_u ^ -1) == (param1 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3.f(0);
                    wk.field_a.b((byte) 68, var3);
                    return var3;
                }
                case 5: {
                    var3 = (t) ((Object) wk.field_a.f(-24059));
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var22 = ph.field_e;
                    var21 = var22;
                    var17 = var21;
                    var3_array = var17;
                    var4 = ph.field_j;
                    var5 = ph.field_d;
                    var6 = new t(160, 120);
                    var6.e();
                    var7 = ol.field_f[param1];
                    var8 = im.field_L.a(-58, var7);
                    var9_ref_kh__ = vc.field_c;
                    var10 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var10 ^ -1) <= (var9_ref_kh__.length ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var11_ref_kh = var9_ref_kh__[var10];
                    if (var11_ref_kh == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var8.a(var11_ref_kh, ub.field_D);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var10++;
                    if (var16 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var8.field_y <= var9) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8.a(var9, 80, 1365, -1, -12, 12);
                    var9++;
                    if (var16 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var16 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    h.field_j = var7.a(false);
                    ap.a(ne.field_a, il.field_m[h.field_j]);
                    im.field_L.a(true, ne.field_a);
                    var9 = vf.field_j[h.field_j][0];
                    var10 = vf.field_j[h.field_j][1];
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var11 = vf.field_j[h.field_j][2];
                    ne.field_a[1] = ne.field_a[1] + (ne.field_a[10] * var11 + (ne.field_a[7] * var10 + var9 * ne.field_a[4]) >> 1946866224);
                    ne.field_a[0] = ne.field_a[0] + (ne.field_a[9] * var11 + ne.field_a[3] * var9 - -(ne.field_a[6] * var10) >> 1184179568);
                    ne.field_a[2] = ne.field_a[2] + (ne.field_a[11] * var11 + (var10 * ne.field_a[8] + var9 * ne.field_a[5]) >> -1944856816);
                    ne.field_a[10] = ne.field_a[10] << 2;
                    ne.field_a[11] = ne.field_a[11] << 2;
                    ne.field_a[9] = ne.field_a[9] << 2;
                    im.field_L.b(1);
                    ph.g(0, 0, 160, 120);
                    var12 = wi.field_a[param1];
                    if (var7.a(false) != 1) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (hi.field_h[var12] != null) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    gm.field_r[var12].a(0, 0, 160, 120);
                    if (var16 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    hi.field_h[var12].a(0, 0, 160, 120);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    be.a(0, 0, 160, 120);
                    var8.a(ne.field_a);
                    if (var7.field_k != null) {
                        statePc = 25;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var18 = var7.field_k;
                    var14 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var18.length <= var14) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var19 = var18[var14];
                    if (var19 != null) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var19.b((byte) 62);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var20 = var7.field_q;
                    var14 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if ((var20.length ^ -1) >= (var14 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var15 = var20[var14];
                    var15.field_c = -1;
                    var15.field_h = null;
                    var14++;
                    if (var16 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var16 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (-3 <= (wk.field_a.a(false) ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    wk.field_a.b((byte) 108);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var6.field_u = param1 + var6.field_t;
                    wk.field_a.b((byte) 68, var6);
                    ph.a(var22, var4, var5);
                    ph.a();
                    be.a(0, 0, param0, 480);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Torquing.field_u;
                    if ((this.field_h ^ -1) == -3) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if ((this.field_h ^ -1) != -4) {
                        statePc = 21;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (1 != ta.field_o) {
                        statePc = 54;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (re.field_c <= -8 + lp.field_c) {
                        statePc = 54;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((8 + (um.field_m.field_x + lp.field_c) ^ -1) < (re.field_c ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((-8 + ea.field_v ^ -1) <= (wh.field_s ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((wh.field_s ^ -1) > (ea.field_v + i.field_N.a('<') ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-8 + vd.field_f >= wh.field_s) {
                        statePc = 54;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((wh.field_s ^ -1) > (vd.field_f + i.field_N.a('>') ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 13: {
                    fieldTemp$0 = ld.field_k + 1;
                    ld.field_k = ld.field_k + 1;
                    if (fieldTemp$0 == 3) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ld.field_k = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    th.a(100, th.field_F[23]);
                    if (var9 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    fieldTemp$1 = ld.field_k - 1;
                    ld.field_k = ld.field_k - 1;
                    if ((fieldTemp$1 ^ -1) > -1) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ld.field_k = 2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    th.a(100, th.field_F[23]);
                    if (var9 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-10 == (this.field_h ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (0 == ta.field_o) {
                        statePc = 54;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (nh.field_k != wi.field_a.length) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = wi.field_a[-1 + nh.field_k];
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = wi.field_a[nh.field_k];
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var2 = stackIn_27_0;
                    var3 = 72;
                    if (re.field_c < var3) {
                        statePc = 38;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((re.field_c ^ -1) <= (var3 + rp.field_b[0].field_u ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 = 168;
                    var5 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var2 ^ -1) > (var5 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_39_0 = wh.field_s ^ -1;
                    stackIn_32_0 = stackIn_39_0;
                    stackIn_39_1 = var4 ^ -1;
                    stackIn_32_1 = stackIn_39_1;
                    if (var9 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 > stackIn_32_1) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if ((wh.field_s ^ -1) <= (rp.field_b[var5].field_s + var4 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var5 != wi.field_a[rn.field_j]) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    rn.field_j = mk.field_c[var5];
                    if (var9 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var4 = var4 + (rp.field_b[var5].field_s - -10);
                    var5++;
                    if (var9 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var4 = wi.field_a[rn.field_j];
                    var5 = qc.field_ab[var4];
                    stackIn_39_0 = var2;
                    stackIn_39_1 = var4;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 > stackIn_39_1) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (nh.field_k == wi.field_a.length) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = hg.field_d[nh.field_k];
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = var5;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var6 = stackIn_43_0;
                    var3 = 157;
                    if ((re.field_c ^ -1) > (var3 ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (re.field_c >= i.field_N.field_t + var3 - -i.field_N.field_x + 6) {
                        statePc = 54;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var7 = 168;
                    var8 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var8 > var6) {
                        statePc = 54;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_55_0 = wh.field_s;
                    stackIn_48_0 = stackIn_55_0;
                    stackIn_55_1 = var7 + -3;
                    stackIn_48_1 = stackIn_55_1;
                    if (var9 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 < stackIn_48_1) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (wh.field_s < var7 - -i.field_N.a((char)(var8 + 49)) - -3) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    rn.field_j = rn.field_j + (-hg.field_d[rn.field_j] + var8);
                    if (var9 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var7 += 40;
                    var8++;
                    if (var9 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = 0;
                    stackIn_55_1 = ta.field_o;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (stackIn_55_0 == stackIn_55_1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_j = wh.field_s;
                    this.field_b = re.field_c;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    this.field_a.a(true, this.a(n.field_t, 88, k.field_e), this.a(wh.field_s, 126, re.field_c));
                    if (param0 == 60) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    return;
                }
                case 59: {
                    if (this.field_a.field_g != -1) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    this.a(this.d(118, this.field_a.field_g), (byte) 96, true);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1) {
        Torquing stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        Torquing stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        Torquing stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        t var6_ref_t = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Torquing.field_u;
                    if (-2 == (this.field_h ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_h == 5) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_h != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    kf.field_F = 0;
                    if (var8 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    kf.field_F = -1 + ie.field_b.field_q;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    ed.a(param1 ^ param1);
                    if (11 == this.field_h) {
                        statePc = 8;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = mo.b(-457010900, param0);
                    if ((var3 ^ -1) == -4) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (1 == var3) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((var3 ^ -1) != -3) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.a(1, true, -54, true);
                    if (var8 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.a(1, false, param1 + 22924, true);
                    if (var8 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.a(24, true, 95, true);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (cm.field_m < 0) {
                        statePc = 21;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (cm.field_m <= 0) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    cm.field_m = cm.field_m - 5;
                    if (0 <= cm.field_m) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    cm.field_m = 0;
                    if (var8 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    cm.field_m = cm.field_m + 5;
                    if (cm.field_m > 0) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    cm.field_m = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (5 == this.field_h) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (this.field_i != 0) {
                        statePc = 40;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (3 == this.field_h) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((this.field_h ^ -1) == -3) {
                        statePc = 29;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 29: {
                    vd.field_f = -2147483648;
                    ea.field_v = -2147483648;
                    lp.field_c = -2147483648;
                    if (var8 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (150 <= this.field_i) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (-1 != (ul.field_d ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (i.field_P[13]) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (i.field_P[84]) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!i.field_P[83]) {
                        statePc = 84;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = this.field_c;
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = 1;
                    stackIn_37_1 = stackIn_38_1;
                    stackIn_38_2 = 3;
                    stackIn_37_2 = stackIn_38_2;
                    stackIn_38_3 = 1;
                    stackIn_37_3 = stackIn_38_3;
                    if ((ul.field_d ^ -1) == -1) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (Torquing) ((Object) stackIn_37_0);
                    stackIn_39_1 = stackIn_37_1;
                    stackIn_39_2 = stackIn_37_2;
                    stackIn_39_3 = stackIn_37_3;
                    stackIn_39_4 = 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (Torquing) ((Object) stackIn_38_0);
                    stackIn_39_1 = stackIn_38_1;
                    stackIn_39_2 = stackIn_38_2;
                    stackIn_39_3 = stackIn_38_3;
                    stackIn_39_4 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    ((Torquing) (Object) stackIn_39_0).a(stackIn_39_1 != 0, stackIn_39_2, stackIn_39_3, stackIn_39_4 != 0);
                    return;
                }
                case 40: {
                    if ((this.field_h ^ -1) != -12) {
                        statePc = 42;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (!np.a((byte) -13)) {
                        statePc = 57;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_59_0 = 13;
                    stackIn_44_0 = stackIn_59_0;
                    stackIn_59_1 = e.field_f;
                    stackIn_44_1 = stackIn_59_1;
                    if (var8 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 != stackIn_44_1) {
                        statePc = 56;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (-2 != (this.field_h ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a(4, false, 71, true);
                    if (var8 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (3 == this.field_h) {
                        statePc = 55;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (0 == this.field_h) {
                        statePc = 42;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (this.field_h == 5) {
                        statePc = 42;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (-8 == (this.field_h ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-12 != (this.field_h ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.a(12, false, -126, true);
                    if (var8 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.a(8, false, -84, true);
                    if (var8 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.a((byte) 79);
                    if (var8 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.a(60);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = this.field_h ^ -1;
                    stackIn_59_1 = -10;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != stackIn_59_1) {
                        statePc = 83;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (!this.field_a.field_k) {
                        statePc = 83;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var3 = -1;
                    if (69 > k.field_e) {
                        statePc = 70;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((rp.field_b[0].field_u + 75 ^ -1) >= (k.field_e ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var4 = 168;
                    var5 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if ((var5 ^ -1) <= -9) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var6_ref_t = rp.field_b[var5];
                    stackIn_71_0 = var4 - 3;
                    stackIn_66_0 = stackIn_71_0;
                    stackIn_71_1 = n.field_t;
                    stackIn_66_1 = stackIn_71_1;
                    if (var8 != 0) {
                        statePc = 71;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 > stackIn_66_1) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (n.field_t >= 3 + var6_ref_t.field_s + var4) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var3 = var5;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var4 = var4 + (10 + var6_ref_t.field_s);
                    var5++;
                    if (var8 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = -156;
                    stackIn_71_1 = k.field_e ^ -1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0 < stackIn_71_1) {
                        statePc = 80;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (6 + (i.field_N.field_t + 157 - -i.field_N.field_x) <= k.field_e) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var4 = wi.field_a[rn.field_j];
                    var5 = qc.field_ab[var4];
                    var6 = 168;
                    var7 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if ((var5 ^ -1) >= (var7 ^ -1)) {
                        statePc = 80;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_81_0 = n.field_t ^ -1;
                    stackIn_76_0 = stackIn_81_0;
                    stackIn_81_1 = var6 + -3 ^ -1;
                    stackIn_76_1 = stackIn_81_1;
                    if (var8 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 > stackIn_76_1) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (n.field_t >= var6 + (i.field_N.a((char)(var7 + 49)) - -3)) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var3 = var7 + 10;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var6 += 40;
                    var7++;
                    if (var8 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = -1;
                    stackIn_81_1 = var3;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    qj.a(stackIn_81_0, stackIn_81_1);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    return;
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_16_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_56_0 = 0;
        int stackIn_68_0 = 0;
        pk stackIn_69_0 = null;
        pk stackIn_70_0 = null;
        pk stackIn_71_0 = null;
        String stackIn_71_1 = null;
        int stackIn_83_0 = 0;
        boolean stackOut_7_0;
        boolean stackOut_23_0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        String var17 = null;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Torquing.field_u;
                    var4 = 85;
                    if (param1 < -117) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(false, 21, -18, 62);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (!param0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = ao.field_f;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = fa.field_b;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    var6 = 0;
                    var7 = -1;
                    var8 = k.field_b.length;
                    var9 = 0;
                    var10 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var8 <= var10) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = param0;
                    stackIn_16_0 = stackOut_7_0 ? 1 : 0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var19 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!stackIn_8_0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var5 & 1 << var10) != 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var19 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (!wc.a(false, var10)) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var9++;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10 = 1;
                    stackIn_16_0 = var9;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var11 = stackIn_16_0;
                    if ((var9 ^ -1) < -8) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = 2;
                    var11 = var9 >> -23312383;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var10 != 1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var4 += 20;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var3 = 4 + (320 + -(40 * var11 >> 1708551521));
                    var12 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var12 >= k.field_b.length) {
                        statePc = 55;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var13 = m.field_q[var12];
                    stackOut_23_0 = wc.a(false, var13);
                    stackIn_56_0 = stackOut_23_0 ? 1 : 0;
                    stackIn_24_0 = stackOut_23_0;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!stackIn_24_0) {
                        statePc = 54;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (0 == (1 << var13 & var5)) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    tj.field_n[var13].e(var3, var4);
                    if (var19 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (param0) {
                        statePc = 54;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (wp.field_w > 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!m.field_y[var13]) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    pe.field_J.e(var3, var4);
                    if (var19 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    kk.field_o.e(var3, var4);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var3 > n.field_t) {
                        statePc = 39;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((n.field_t ^ -1) < (var3 - -32 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((k.field_e ^ -1) > (var4 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (k.field_e > 32 + var4) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ph.e(-2 + var3, var4 - 2, 36, 36, 6, 8421504);
                    var7 = var13;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (-1 == this.field_j) {
                        statePc = 48;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if ((this.field_j ^ -1) > (var3 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var3 + 32 < this.field_j) {
                        statePc = 48;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((var4 ^ -1) < (this.field_b ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (this.field_b > var4 - -32) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_j = -1;
                    if (var13 == this.field_e) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_e = var13;
                    if (var19 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_e = -1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var13 != this.field_e) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ph.e(-2 + var3, -2 + var4, 36, 36, 6, 1579032);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var6++;
                    if ((var11 ^ -1) == (var6 ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var3 += 40;
                    if (var19 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var6 = 0;
                    var11 = -var11 + var9;
                    var4 += 40;
                    var3 = -(40 * var11 >> -791210271) + 324;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 > (this.field_e ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var7 = this.field_e;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var7 ^ -1) != 0) {
                        statePc = 65;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (!je.a((byte) 59)) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    i.field_Q.c(nh.field_p, 320, 230, 0, -1);
                    i.field_Q.a(ti.field_m, 47, 270, 534, 1000, 0, -1, 1, 0, 3 * um.field_m.field_x / 2);
                    if (var19 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    i.field_Q.c(nh.field_p, 320, 275, 0, -1);
                    if (var19 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    i.field_Q.c(k.field_b[var7], 320, 202, 0, -1);
                    if ((var5 & 1 << var7 ^ -1) == -1) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var12 = stackIn_68_0;
                    var13 = 3 * dd.field_c.field_x / 2;
                    var14 = 208;
                    stackIn_70_0 = qh.field_c;
                    stackIn_69_0 = stackIn_70_0;
                    if (var12 != 0) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_71_0 = (pk) ((Object) stackIn_69_0);
                    stackIn_71_1 = uf.field_t;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (pk) ((Object) stackIn_70_0);
                    stackIn_71_1 = qh.field_d;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    ((pk) (Object) stackIn_71_0).c(stackIn_71_1, 321, 1 + var14 - -dd.field_c.field_x, 1, -1);
                    if (var12 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    tj.field_n[var7].d(256, 30 + var14);
                    if (var19 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (wp.field_w > 0) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (!m.field_y[var7]) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    pe.field_J.d(256, 30 + var14);
                    if (var19 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    kk.field_o.d(256, 30 + var14);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var14 = var14 + (i.field_N.field_x - -46);
                    var15 = cn.field_a[var7];
                    if (-15 != (var7 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if ((1 << var7 & var5 ^ -1) != -1) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_83_0 = 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var16 = stackIn_83_0;
                    if (var16 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var15 = al.field_f;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    qh.field_c.a(var15, 65, var14 + -3, 184, 1000, 0, -1, 0, 0, (3 + dd.field_c.field_x * 3) / 2);
                    var17 = Integer.toString(100 * ef.field_d[var7]);
                    if (var16 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var17 = af.field_b;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    qh.field_c.b(tl.field_s + var17, 401, var14 - 3 + qh.field_c.field_q, 0, -1);
                    var14 = var14 + var13;
                    var3 = 401;
                    qh.field_c.b(am.field_j, var3, var14 + (-3 + qh.field_c.field_x), 0, -1);
                    var3 = var3 + qh.field_c.a(am.field_j);
                    if (var16 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    kh.field_r.d(var3, var14 + 1);
                    qh.field_c.b(nl.field_u, var3 - -kh.field_r.field_s, qh.field_c.field_x + (-3 + var14), 0, -1);
                    if (var19 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var18 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (ef.field_d[var7] <= var18) {
                        statePc = 97;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    kh.field_r.d(var3, var14 + 1);
                    var3 = var3 + kh.field_r.field_s / 3;
                    var18++;
                    if (var19 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var19 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -78) {
              if (param0) {
                stackIn_7_0 = sp.field_Q.a(param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = bo.field_e.a(param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -24;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("mh.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final boolean c(int param0, int param1) {
        if (this.field_h == param0) {
            if (-1 == (param1 ^ -1)) {
                if (!((a.field_e ^ -1) != -1)) {
                    return false;
                }
            }
            if (2 == param1) {
                if (hg.field_b.length + -1 != a.field_e) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var25 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pl.b(param2, 88);
                        var7_int = 0;
                        var8 = -param0 + param2;
                        if (-1 >= (var8 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var8 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = param2;
                        var10 = -param2;
                        var11 = var8;
                        var12 = -var8;
                        var13 = -1;
                        var14 = -1;
                        var35 = qd.field_a[param4];
                        if (param5 == 15783) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var16 = param1 + -var8;
                        di.a(-param2 + param1, (byte) 77, param3, var35, var16);
                        var17 = var8 + param1;
                        di.a(var16, (byte) 105, param6, var35, var17);
                        di.a(var17, (byte) 107, param3, var35, param2 + param1);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var9 ^ -1) >= (var7_int ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var14 += 2;
                        var13 += 2;
                        var10 = var10 + var13;
                        var12 = var12 + var14;
                        if (var25 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12 < 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var11 ^ -1) > -2) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        vc.field_a[var11] = var7_int;
                        var11--;
                        var12 = var12 - (var11 << -437514079);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7_int++;
                        if ((var10 ^ -1) <= -1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9--;
                        if ((var8 ^ -1) >= (var9 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var27 = qd.field_a[var9 + param4];
                        var28 = qd.field_a[param4 - var9];
                        var20 = vc.field_a[var9];
                        var21 = param1 + var7_int;
                        var22 = -var7_int + param1;
                        var23 = param1 - -var20;
                        var24 = param1 + -var20;
                        di.a(var22, (byte) 84, param3, var27, var24);
                        di.a(var24, (byte) -120, param6, var27, var23);
                        di.a(var23, (byte) 33, param3, var27, var21);
                        di.a(var22, (byte) -109, param3, var28, var24);
                        di.a(var24, (byte) 25, param6, var28, var23);
                        di.a(var23, (byte) -122, param3, var28, var21);
                        if (var25 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var29 = qd.field_a[param4 - -var9];
                        var30 = qd.field_a[-var9 + param4];
                        var20 = param1 - -var7_int;
                        var21 = -var7_int + param1;
                        di.a(var21, (byte) -97, param3, var29, var20);
                        di.a(var21, (byte) 14, param3, var30, var20);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = var10 - (var9 << 555187073);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var31 = qd.field_a[param4 + var7_int];
                        var32 = qd.field_a[-var7_int + param4];
                        var20 = param1 - -var9;
                        var21 = -var9 + param1;
                        if (var8 <= var7_int) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var7_int ^ -1) >= (var11 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = vc.field_a[var7_int];
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var11;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var22 = stackIn_21_0;
                        var23 = var22 + param1;
                        var24 = param1 - var22;
                        di.a(var21, (byte) 109, param3, var31, var24);
                        di.a(var24, (byte) -121, param6, var31, var23);
                        di.a(var23, (byte) 89, param3, var31, var20);
                        di.a(var21, (byte) 87, param3, var32, var24);
                        di.a(var24, (byte) -97, param6, var32, var23);
                        di.a(var23, (byte) 115, param3, var32, var20);
                        if (var25 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        di.a(var21, (byte) 62, param3, var31, var20);
                        di.a(var21, (byte) 94, param3, var32, var20);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var25 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw rb.a((Throwable) ((Object) runtimeException), "mh.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 26: {
                    return;
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_70_0 = 0;
        Torquing stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Torquing stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        Torquing stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        Torquing stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_104_0 = 0;
        Torquing stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        Torquing stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_114_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_171_0 = 0;
        int var5;
        int var6;
        int var7_int;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          L1: {
            L2: {
              var11 = Torquing.field_u;
              var5 = -86 % ((12 - param2) / 41);
              if (ko.field_c[param0] != -1) {
                break L2;
              } else {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                L11: {
                                  L12: {
                                    L13: {
                                      L14: {
                                        L15: {
                                          L16: {
                                            L17: {
                                              L18: {
                                                L19: {
                                                  L20: {
                                                    L21: {
                                                      L22: {
                                                        L23: {
                                                          var7_int = param0;
                                                          if (-1 == (var7_int ^ -1)) {
                                                            break L23;
                                                          } else {
                                                            L24: {
                                                              if (var7_int != 17) {
                                                                break L24;
                                                              } else {
                                                                if (var11 == 0) {
                                                                  break L22;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            if (4 == var7_int) {
                                                              break L21;
                                                            } else {
                                                              if (12 == var7_int) {
                                                                break L20;
                                                              } else {
                                                                if (-12 == (var7_int ^ -1)) {
                                                                  break L19;
                                                                } else {
                                                                  L25: {
                                                                    if (9 != var7_int) {
                                                                      break L25;
                                                                    } else {
                                                                      if (var11 == 0) {
                                                                        break L18;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var7_int == 18) {
                                                                    break L17;
                                                                  } else {
                                                                    L26: {
                                                                      if (19 != var7_int) {
                                                                        break L26;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L16;
                                                                        } else {
                                                                          break L26;
                                                                        }
                                                                      }
                                                                    }
                                                                    L27: {
                                                                      if (-15 != (var7_int ^ -1)) {
                                                                        break L27;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L15;
                                                                        } else {
                                                                          break L27;
                                                                        }
                                                                      }
                                                                    }
                                                                    L28: {
                                                                      if (-16 != (var7_int ^ -1)) {
                                                                        break L28;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L14;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      }
                                                                    }
                                                                    L29: {
                                                                      if (var7_int != 10) {
                                                                        break L29;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L13;
                                                                        } else {
                                                                          break L29;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (-7 == (var7_int ^ -1)) {
                                                                      break L12;
                                                                    } else {
                                                                      L30: {
                                                                        if (-6 != (var7_int ^ -1)) {
                                                                          break L30;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L11;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        if (21 != var7_int) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L10;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      L32: {
                                                                        if ((var7_int ^ -1) != -9) {
                                                                          break L32;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L9;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      L33: {
                                                                        if (-24 != (var7_int ^ -1)) {
                                                                          break L33;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L8;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      L34: {
                                                                        if (22 != var7_int) {
                                                                          break L34;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L7;
                                                                          } else {
                                                                            break L34;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var7_int == 24) {
                                                                        break L6;
                                                                      } else {
                                                                        L35: {
                                                                          if (2 != var7_int) {
                                                                            break L35;
                                                                          } else {
                                                                            if (var11 == 0) {
                                                                              break L5;
                                                                            } else {
                                                                              break L35;
                                                                            }
                                                                          }
                                                                        }
                                                                        L36: {
                                                                          if (-14 != (var7_int ^ -1)) {
                                                                            break L36;
                                                                          } else {
                                                                            if (var11 == 0) {
                                                                              break L4;
                                                                            } else {
                                                                              break L36;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var7_int != 20) {
                                                                          break L0;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L23;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L37: {
                                                          if (this.field_a.c(-97)) {
                                                            break L37;
                                                          } else {
                                                            if (param3) {
                                                              break L37;
                                                            } else {
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                        th.a(100, th.field_F[23]);
                                                        this.field_c.a(true, 9, 1, param1);
                                                        ta.field_n = 0;
                                                        if (var11 == 0) {
                                                          break L1;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                      L38: {
                                                        if (this.field_a.c(-97)) {
                                                          break L38;
                                                        } else {
                                                          if (!param3) {
                                                            break L1;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                      }
                                                      L39: {
                                                        th.a(100, th.field_F[23]);
                                                        if ((this.field_h ^ -1) == -10) {
                                                          stackIn_60_0 = rn.field_j;
                                                          break L39;
                                                        } else {
                                                          stackIn_60_0 = 0;
                                                          break L39;
                                                        }
                                                      }
                                                      L40: {
                                                        var7_int = stackIn_60_0;
                                                        ie.field_b = new bi(this.field_c, var7_int);
                                                        this.field_c.a(true, wi.field_a[var7_int], 3, param1);
                                                        if (-1 <= (wp.field_w ^ -1)) {
                                                          stackIn_63_0 = 11;
                                                          break L40;
                                                        } else {
                                                          stackIn_63_0 = 0;
                                                          break L40;
                                                        }
                                                      }
                                                      ta.field_n = stackIn_63_0;
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                    L41: {
                                                      if (this.field_a.c(-97)) {
                                                        break L41;
                                                      } else {
                                                        if (param3) {
                                                          break L41;
                                                        } else {
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                    L42: {
                                                      this.field_c.a(true, -1, 10, param1);
                                                      th.a(100, th.field_F[23]);
                                                      if (0 < wp.field_w) {
                                                        stackIn_70_0 = 0;
                                                        break L42;
                                                      } else {
                                                        stackIn_70_0 = 11;
                                                        break L42;
                                                      }
                                                    }
                                                    ta.field_n = stackIn_70_0;
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                  L43: {
                                                    if (this.field_a.c(-97)) {
                                                      break L43;
                                                    } else {
                                                      if (!param3) {
                                                        break L1;
                                                      } else {
                                                        break L43;
                                                      }
                                                    }
                                                  }
                                                  L44: {
                                                    L45: {
                                                      if ((this.field_h ^ -1) != -11) {
                                                        break L45;
                                                      } else {
                                                        if (je.a((byte) 41)) {
                                                          break L45;
                                                        } else {
                                                          L46: {
                                                            stackIn_78_0 = this.field_c;

                                                            stackIn_78_1 = 1;

                                                            if ((ao.field_f ^ -1) != -1) {
                                                              stackIn_79_0 = (Torquing) ((Object) stackIn_78_0);
                                                              stackIn_79_1 = stackIn_78_1;
                                                              stackIn_79_2 = 8;
                                                              break L46;
                                                            } else {
                                                              stackIn_79_0 = (Torquing) ((Object) stackIn_78_0);
                                                              stackIn_79_1 = stackIn_78_1;
                                                              stackIn_79_2 = 2;
                                                              break L46;
                                                            }
                                                          }
                                                          ((Torquing) (Object) stackIn_79_0).a(stackIn_79_1 != 0, stackIn_79_2, 1, param1);
                                                          if (var11 == 0) {
                                                            break L44;
                                                          } else {
                                                            break L45;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L47: {
                                                      if (ta.field_n != 11) {
                                                        break L47;
                                                      } else {
                                                        if (0 >= wp.field_w) {
                                                          break L47;
                                                        } else {
                                                          ta.field_n = 0;
                                                          break L47;
                                                        }
                                                      }
                                                    }
                                                    this.field_c.a(true, ta.field_n, 1, param1);
                                                    break L44;
                                                  }
                                                  th.a(100, th.field_F[23]);
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                                L48: {
                                                  if (this.field_a.c(-97)) {
                                                    break L48;
                                                  } else {
                                                    if (!param3) {
                                                      break L1;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                }
                                                this.field_c.a(true, 4, 1, param1);
                                                cm.field_m = 0;
                                                a.field_e = 0;
                                                th.a(100, th.field_F[23]);
                                                ta.field_n = this.field_h;
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              L49: {
                                                if (this.field_a.c(-97)) {
                                                  break L49;
                                                } else {
                                                  if (!param3) {
                                                    break L1;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                              L50: {
                                                L51: {
                                                  if (je.a((byte) 100)) {
                                                    break L51;
                                                  } else {
                                                    L52: {
                                                      stackIn_96_0 = this.field_c;

                                                      stackIn_96_1 = 1;

                                                      if ((ao.field_f ^ -1) != -1) {
                                                        stackIn_97_0 = (Torquing) ((Object) stackIn_96_0);
                                                        stackIn_97_1 = stackIn_96_1;
                                                        stackIn_97_2 = 8;
                                                        break L52;
                                                      } else {
                                                        stackIn_97_0 = (Torquing) ((Object) stackIn_96_0);
                                                        stackIn_97_1 = stackIn_96_1;
                                                        stackIn_97_2 = 0;
                                                        break L52;
                                                      }
                                                    }
                                                    ((Torquing) (Object) stackIn_97_0).a(stackIn_97_1 != 0, stackIn_97_2, 1, param1);
                                                    if (var11 == 0) {
                                                      break L50;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                }
                                                L53: {
                                                  L54: {
                                                    if (0 != ie.field_b.field_s) {
                                                      break L54;
                                                    } else {
                                                      if ((ao.field_f ^ -1) != -1) {
                                                        break L54;
                                                      } else {
                                                        if (0 == ie.field_b.field_L) {
                                                          stackIn_104_0 = 0;
                                                          break L53;
                                                        } else {
                                                          break L54;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackIn_104_0 = 1;
                                                  break L53;
                                                }
                                                L55: {
                                                  var7_int = stackIn_104_0;
                                                  stackIn_106_0 = this.field_c;

                                                  stackIn_106_1 = 1;

                                                  if (var7_int != 0) {
                                                    stackIn_107_0 = (Torquing) ((Object) stackIn_106_0);
                                                    stackIn_107_1 = stackIn_106_1;
                                                    stackIn_107_2 = 7;
                                                    break L55;
                                                  } else {
                                                    stackIn_107_0 = (Torquing) ((Object) stackIn_106_0);
                                                    stackIn_107_1 = stackIn_106_1;
                                                    stackIn_107_2 = 0;
                                                    break L55;
                                                  }
                                                }
                                                ((Torquing) (Object) stackIn_107_0).a(stackIn_107_1 != 0, stackIn_107_2, 1, param1);
                                                break L50;
                                              }
                                              th.a(100, th.field_F[23]);
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            L56: {
                                              if (this.field_a.e(7632)) {
                                                L57: {
                                                  var7_int = wi.field_a[rn.field_j];
                                                  if (wi.field_a.length == nh.field_k) {
                                                    stackIn_114_0 = wi.field_a[nh.field_k + -1];
                                                    break L57;
                                                  } else {
                                                    stackIn_114_0 = wi.field_a[nh.field_k];
                                                    break L57;
                                                  }
                                                }
                                                var8 = stackIn_114_0;
                                                if (var8 <= var7_int) {
                                                  break L56;
                                                } else {
                                                  rn.field_j = mk.field_c[var7_int + 1];
                                                  break L56;
                                                }
                                              } else {
                                                break L56;
                                              }
                                            }
                                            if (!this.field_a.c((byte) 76)) {
                                              break L1;
                                            } else {
                                              L58: {
                                                var7_int = wi.field_a[rn.field_j];
                                                if (var7_int <= 0) {
                                                  break L58;
                                                } else {
                                                  rn.field_j = mk.field_c[-1 + var7_int];
                                                  break L58;
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L59: {
                                            if (this.field_a.e(7632)) {
                                              L60: {
                                                var7_int = wi.field_a[rn.field_j];
                                                if (wi.field_a.length == nh.field_k) {
                                                  stackIn_125_0 = wi.field_a[-1 + nh.field_k];
                                                  break L60;
                                                } else {
                                                  stackIn_125_0 = wi.field_a[nh.field_k];
                                                  break L60;
                                                }
                                              }
                                              L61: {
                                                L62: {
                                                  var8 = stackIn_125_0;
                                                  var9 = hg.field_d[rn.field_j];
                                                  if ((var8 ^ -1) < (var7_int ^ -1)) {
                                                    break L62;
                                                  } else {
                                                    if (wi.field_a.length == nh.field_k) {
                                                      break L62;
                                                    } else {
                                                      stackIn_129_0 = hg.field_d[nh.field_k];
                                                      break L61;
                                                    }
                                                  }
                                                }
                                                stackIn_129_0 = -1 + qc.field_ab[var7_int];
                                                break L61;
                                              }
                                              var10 = stackIn_129_0;
                                              if (var10 > var9) {
                                                rn.field_j = rn.field_j + 1;
                                                break L59;
                                              } else {
                                                break L59;
                                              }
                                            } else {
                                              break L59;
                                            }
                                          }
                                          if (this.field_a.c((byte) 68)) {
                                            L63: {
                                              var7_int = hg.field_d[rn.field_j];
                                              if (var7_int <= 0) {
                                                break L63;
                                              } else {
                                                rn.field_j = rn.field_j - 1;
                                                break L63;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L0;
                                          }
                                        }
                                        L64: {
                                          if (this.field_a.c(-97)) {
                                            break L64;
                                          } else {
                                            if (!param3) {
                                              break L1;
                                            } else {
                                              break L64;
                                            }
                                          }
                                        }
                                        L65: {
                                          L66: {
                                            if (this.field_h == 6) {
                                              break L66;
                                            } else {
                                              L67: {
                                                if ((this.field_h ^ -1) == -10) {
                                                  break L67;
                                                } else {
                                                  L68: {
                                                    if (-3 == (this.field_h ^ -1)) {
                                                      break L68;
                                                    } else {
                                                      var7_int = 0;
                                                      if (var11 == 0) {
                                                        break L65;
                                                      } else {
                                                        break L68;
                                                      }
                                                    }
                                                  }
                                                  var7_int = 1;
                                                  if (var11 == 0) {
                                                    break L65;
                                                  } else {
                                                    break L67;
                                                  }
                                                }
                                              }
                                              var7_int = 3;
                                              if (var11 == 0) {
                                                break L65;
                                              } else {
                                                break L66;
                                              }
                                            }
                                          }
                                          var7_int = 2;
                                          break L65;
                                        }
                                        pb.field_e = var7_int;
                                        oo.field_b = 0;
                                        th.a(100, th.field_F[23]);
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L69: {
                                        if (this.field_a.c(-97)) {
                                          break L69;
                                        } else {
                                          if (param3) {
                                            break L69;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      }
                                      this.field_c.a(true, 11, 1, param1);
                                      th.a(100, th.field_F[23]);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L70: {
                                      if (this.field_a.b(97)) {
                                        sg.field_f = (sg.field_f + 1) % 3;
                                        th.a(100, th.field_F[23]);
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    }
                                    if (!this.field_a.b((byte) -108)) {
                                      break L1;
                                    } else {
                                      sg.field_f = (2 + sg.field_f) % 3;
                                      th.a(100, th.field_F[23]);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L71: {
                                    if (this.field_a.c(-97)) {
                                      break L71;
                                    } else {
                                      if (param3) {
                                        break L71;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  }
                                  L72: {
                                    if (null != dg.field_i) {
                                      break L72;
                                    } else {
                                      var7_int = param1 ? 1 : 0;
                                      hm.a(var7_int != 0, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, 3 * um.field_m.field_x / 2, 240);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                  th.a(100, th.field_F[23]);
                                  ug.a(-105);
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L11;
                                  }
                                }
                                L73: {
                                  if (this.field_a.c(-97)) {
                                    break L73;
                                  } else {
                                    if (param3) {
                                      break L73;
                                    } else {
                                      break L0;
                                    }
                                  }
                                }
                                L74: {
                                  ie.field_b.b((byte) -103);
                                  th.a(100, th.field_F[23]);
                                  if (0 >= wp.field_w) {
                                    stackIn_171_0 = 11;
                                    break L74;
                                  } else {
                                    stackIn_171_0 = 0;
                                    break L74;
                                  }
                                }
                                ta.field_n = stackIn_171_0;
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L10;
                                }
                              }
                              L75: {
                                if (this.field_a.c(-97)) {
                                  break L75;
                                } else {
                                  if (param3) {
                                    break L75;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                              L76: {
                                th.a(100, th.field_F[23]);
                                if (dg.field_i == null) {
                                  break L76;
                                } else {
                                  ug.a(-124);
                                  break L76;
                                }
                              }
                              to.a(ip.a(9), -46);
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L9;
                              }
                            }
                            L77: {
                              if (this.field_a.c(-97)) {
                                break L77;
                              } else {
                                if (param3) {
                                  break L77;
                                } else {
                                  break L0;
                                }
                              }
                            }
                            ie.field_b.f(1000);
                            this.field_c.a(true, -1, 10, param1);
                            th.a(100, th.field_F[23]);
                            jh.a(la.field_k[ie.field_b.field_q], 0);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          }
                          L78: {
                            if (this.field_a.c(-97)) {
                              break L78;
                            } else {
                              if (!param3) {
                                break L1;
                              } else {
                                break L78;
                              }
                            }
                          }
                          if (hg.field_b.length > a.field_e - -1) {
                            a.field_e = a.field_e + 1;
                            cm.field_m = cm.field_m - 298;
                            th.a(100, th.field_F[23]);
                            if ((-1 + hg.field_b.length ^ -1) != (a.field_e ^ -1)) {
                              break L1;
                            } else {
                              if (param1) {
                                break L1;
                              } else {
                                this.field_a.field_g = 1;
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          } else {
                            break L0;
                          }
                        }
                        L79: {
                          if (this.field_a.c(-97)) {
                            break L79;
                          } else {
                            if (param3) {
                              break L79;
                            } else {
                              break L0;
                            }
                          }
                        }
                        if ((a.field_e ^ -1) < -1) {
                          cm.field_m = cm.field_m + 298;
                          a.field_e = a.field_e - 1;
                          th.a(100, th.field_F[23]);
                          if (0 != a.field_e) {
                            break L1;
                          } else {
                            if (param1) {
                              break L1;
                            } else {
                              this.field_a.field_g = 2;
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                        } else {
                          break L0;
                        }
                      }
                      L80: {
                        if (this.field_a.c(-97)) {
                          break L80;
                        } else {
                          if (param3) {
                            break L80;
                          } else {
                            break L0;
                          }
                        }
                      }
                      cq.a(true, ip.a(9));
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    L81: {
                      var6 = on.field_c;
                      if (this.field_a.e((byte) 110)) {
                        bd.a(false, 0);
                        break L81;
                      } else {
                        break L81;
                      }
                    }
                    L82: {
                      if (!this.field_a.d((byte) 106)) {
                        break L82;
                      } else {
                        bd.a(false, 160);
                        break L82;
                      }
                    }
                    L83: {
                      if (this.field_a.a((byte) -116)) {
                        L84: {
                          var7_int = n.field_t + (-152 + -bp.field_b[this.field_h]);
                          if ((var7_int ^ -1) >= -1) {
                            break L84;
                          } else {
                            L85: {
                              if (-161 < (var7_int ^ -1)) {
                                break L85;
                              } else {
                                bd.a(false, 160);
                                if (var11 == 0) {
                                  break L83;
                                } else {
                                  break L85;
                                }
                              }
                            }
                            bd.a(false, var7_int);
                            if (var11 == 0) {
                              break L83;
                            } else {
                              break L84;
                            }
                          }
                        }
                        bd.a(false, 0);
                        break L83;
                      } else {
                        break L83;
                      }
                    }
                    L86: {
                      if (this.field_a.c((byte) 123)) {
                        b.b(69);
                        break L86;
                      } else {
                        break L86;
                      }
                    }
                    L87: {
                      if (!this.field_a.e(7632)) {
                        break L87;
                      } else {
                        wj.a(123);
                        break L87;
                      }
                    }
                    if (var6 == on.field_c) {
                      break L1;
                    } else {
                      L88: {
                        if (ig.field_r[25] != null) {
                          break L88;
                        } else {
                          ig.field_r[25] = nj.a(th.field_F[25], 100, 96);
                          break L88;
                        }
                      }
                      if (!ig.field_r[25].e(17)) {
                        ig.field_r[25].c(0);
                        ni.a(ig.field_r[25], true);
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                  L89: {
                    if (this.field_a.e((byte) -116)) {
                      ea.b(-47, 0);
                      break L89;
                    } else {
                      break L89;
                    }
                  }
                  L90: {
                    if (this.field_a.d((byte) 106)) {
                      ea.b(-82, 160);
                      break L90;
                    } else {
                      break L90;
                    }
                  }
                  L91: {
                    if (this.field_a.a((byte) -116)) {
                      L92: {
                        var7_int = n.field_t - 152 - bp.field_b[this.field_h];
                        if (0 >= var7_int) {
                          break L92;
                        } else {
                          L93: {
                            if (-161 < (var7_int ^ -1)) {
                              break L93;
                            } else {
                              ea.b(-94, 160);
                              if (var11 == 0) {
                                break L91;
                              } else {
                                break L93;
                              }
                            }
                          }
                          ea.b(-17, var7_int);
                          if (var11 == 0) {
                            break L91;
                          } else {
                            break L92;
                          }
                        }
                      }
                      ea.b(-116, 0);
                      break L91;
                    } else {
                      break L91;
                    }
                  }
                  L94: {
                    if (!this.field_a.c((byte) 41)) {
                      break L94;
                    } else {
                      bd.b(115);
                      break L94;
                    }
                  }
                  if (!this.field_a.e(7632)) {
                    break L1;
                  } else {
                    ia.d(117);
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L95: {
                  if (!this.field_a.e(7632)) {
                    break L95;
                  } else {
                    L96: {
                      fieldTemp$0 = ld.field_k + 1;
                      ld.field_k = ld.field_k + 1;
                      if ((fieldTemp$0 ^ -1) == -4) {
                        ld.field_k = 0;
                        break L96;
                      } else {
                        break L96;
                      }
                    }
                    th.a(100, th.field_F[23]);
                    break L95;
                  }
                }
                L97: {
                  if (!this.field_a.c((byte) 67)) {
                    break L97;
                  } else {
                    L98: {
                      fieldTemp$1 = ld.field_k - 1;
                      ld.field_k = ld.field_k - 1;
                      if (0 <= fieldTemp$1) {
                        break L98;
                      } else {
                        ld.field_k = 2;
                        break L98;
                      }
                    }
                    th.a(100, th.field_F[23]);
                    break L97;
                  }
                }
                if (!this.field_a.a((byte) -116)) {
                  break L1;
                } else {
                  if (!this.field_a.f((byte) -60)) {
                    break L1;
                  } else {
                    var7 = hb.field_u[20];
                    var8 = n.field_t;
                    var9 = -(um.field_m.a(var7) >> 733333025) + 320;
                    var10 = 0;
                    L99: while (true) {
                      L100: {
                        if ((var10 ^ -1) <= (hq.field_d.length ^ -1)) {
                          break L100;
                        } else {
                          if (var11 != 0) {
                            break L1;
                          } else {
                            L101: {
                              if ((var9 ^ -1) < (var8 ^ -1)) {
                                break L101;
                              } else {
                                if (var8 >= um.field_m.a(hq.field_d[var10]) + var9) {
                                  break L101;
                                } else {
                                  ld.field_k = var10;
                                  break L101;
                                }
                              }
                            }
                            var9 = var9 + (um.field_m.a(hq.field_d[var10]) - -um.field_m.a(" / "));
                            var10++;
                            if (var11 == 0) {
                              continue L99;
                            } else {
                              break L100;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            L102: {
              if (this.field_a.c(-97)) {
                break L102;
              } else {
                if (!param3) {
                  break L1;
                } else {
                  break L102;
                }
              }
            }
            this.field_c.a(true, ko.field_c[param0], 1, param1);
            th.a(100, th.field_F[23]);
            if (0 != this.field_h) {
              break L1;
            } else {
              L103: {
                if (tm.field_c == 6) {
                  break L103;
                } else {
                  if (tm.field_c == 2) {
                    break L103;
                  } else {
                    break L0;
                  }
                }
              }
              ta.field_n = this.field_h;
              break L1;
            }
          }
          break L0;
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 32) {
            return;
        }
        field_f = null;
        field_d = null;
    }

    private final int a(byte param0, int param1) {
        if (rf.field_x[this.field_h]) {
            return ok.field_C[this.field_h] + de.field_c[this.field_h] * (1 + param1);
        }
        if (param0 >= -118) {
            this.field_h = -8;
        }
        return up.field_e[this.field_h];
    }

    final void c(int param0) {
        uf dupTemp$0 = null;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        pk stackIn_34_0 = null;
        pk stackIn_35_0 = null;
        pk stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        pk stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        pk stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        pk stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        pk stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        pk stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        pk stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_43_0 = 0;
        pk stackIn_57_0 = null;
        pk stackIn_58_0 = null;
        pk stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        pk stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        pk stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        pk stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        pk stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        pk stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        pk stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        pk stackIn_66_0 = null;
        pk stackIn_67_0 = null;
        pk stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        pk stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        pk stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        pk stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        pk stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        pk stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        pk stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int stackIn_74_4 = 0;
        pk stackIn_75_0 = null;
        pk stackIn_76_0 = null;
        pk stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        pk stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        pk stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        pk stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        pk stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        pk stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        pk stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int stackIn_83_4 = 0;
        int stackIn_96_0 = 0;
        boolean stackIn_104_0 = false;
        Object stackIn_106_0 = null;
        Object stackIn_107_0 = null;
        Object stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        boolean stackOut_103_0;
        int statePc = 0;
        af[] var2_ref_af__ = null;
        int var2 = 0;
        int var3 = 0;
        af var4_ref_af = null;
        int var4 = 0;
        int var5 = 0;
        uf var5_ref_uf = null;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        af[] var9 = null;
        uf var10 = null;
        String var11 = null;
        String var12 = null;
        uf var13 = null;
        hc var14 = null;
        String var15 = null;
        String var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Torquing.field_u;
                    if (-2 == (this.field_h ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (5 == this.field_h) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((this.field_h ^ -1) == -1) {
                        statePc = 4;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 4: {
                    kf.field_F = 0;
                    if (var8 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    kf.field_F = -1 + ie.field_b.field_q;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (!ia.a(-22426, 0)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    kf.field_F = 6;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    k.a(kf.field_F, 1);
                    nc.a(kf.field_F, true);
                    var9 = nn.field_a[this.field_h];
                    var2_ref_af__ = var9;
                    var3 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((var9.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4_ref_af = var9[var3];
                    var4_ref_af.b(6);
                    var3++;
                    if (var8 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var8 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ph.c(0, 0, 640, 480, 16777215);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (param0 == 93) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_i = 4;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if ((this.field_h ^ -1) != -3) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.a(120, (byte) 92);
                    if (var8 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if ((this.field_h ^ -1) != -4) {
                        statePc = 44;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (je.a((byte) 95)) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.a(27, (byte) 107);
                    if (var8 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var11 = om.field_e;
                    qh.field_c.b(var11, 148, um.field_m.field_x + 34, 2, -1);
                    var12 = Integer.toString(ie.field_b.field_s);
                    qh.field_c.a(var12, 517, 34 + um.field_m.field_x, 2, -1);
                    var4 = 135;
                    var5 = re.a(252645135, ao.field_f);
                    if ((-48 + var5 * 48 ^ -1) > -339) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = 338 / (-1 + var5);
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = 48;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var6_int = stackIn_26_0;
                    var7 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((var7 ^ -1) <= (k.field_b.length ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_43_0 = -1;
                    stackIn_29_0 = stackIn_43_0;
                    if (var8 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 != (1 << var7 & ao.field_f ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    tj.field_n[var7].e(var4, 93);
                    var4 = var4 + var6_int;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var7++;
                    if (var8 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = qh.field_c;
                    stackIn_34_0 = stackIn_35_0;
                    if (0 == ie.field_b.field_s) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (pk) ((Object) stackIn_34_0);
                    stackIn_36_1 = 1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (pk) ((Object) stackIn_35_0);
                    stackIn_36_1 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (pk) ((Object) stackIn_36_0);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = stackIn_36_1;
                    stackIn_37_1 = stackIn_38_1;
                    stackIn_38_2 = 100;
                    stackIn_37_2 = stackIn_38_2;
                    if ((ie.field_b.field_L ^ -1) == -1) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (pk) ((Object) stackIn_37_0);
                    stackIn_39_1 = stackIn_37_1;
                    stackIn_39_2 = stackIn_37_2;
                    stackIn_39_3 = 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (pk) ((Object) stackIn_38_0);
                    stackIn_39_1 = stackIn_38_1;
                    stackIn_39_2 = stackIn_38_2;
                    stackIn_39_3 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = (pk) ((Object) stackIn_39_0);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = stackIn_39_1;
                    stackIn_40_1 = stackIn_41_1;
                    stackIn_41_2 = stackIn_39_2;
                    stackIn_40_2 = stackIn_41_2;
                    stackIn_41_3 = stackIn_39_3;
                    stackIn_40_3 = stackIn_41_3;
                    if (-1 == (fa.field_b ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = (pk) ((Object) stackIn_40_0);
                    stackIn_42_1 = stackIn_40_1;
                    stackIn_42_2 = stackIn_40_2;
                    stackIn_42_3 = stackIn_40_3;
                    stackIn_42_4 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (pk) ((Object) stackIn_41_0);
                    stackIn_42_1 = stackIn_41_1;
                    stackIn_42_2 = stackIn_41_2;
                    stackIn_42_3 = stackIn_41_3;
                    stackIn_42_4 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = ((pk) (Object) stackIn_42_0).a(ko.a(stackIn_42_1 != 0, (byte) stackIn_42_2, stackIn_42_3 != 0, stackIn_42_4 != 0), 135, 169 - i.field_N.field_x, 370, 1000, 0, -1, 1, 0, i.field_N.field_x);
                    statePc = 101;
                    continue stateLoop;
                }
                case 44: {
                    if (-5 != (this.field_h ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var2 = cm.field_m + 298 * a.field_e;
                    ph.g(47, 120, 583, 418);
                    var3 = 120 - var2;
                    var4 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var4 >= hg.field_b.length) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var5_ref_uf = hg.field_b[var4];
                    var5_ref_uf.b(47, -116, var3);
                    dd.field_c.a(var4 - -1 + "/" + hg.field_b.length, 573, var3 + (var5_ref_uf.field_k + -3), 8421504, -1);
                    var3 = var3 + var5_ref_uf.field_k;
                    var4++;
                    if (var8 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var8 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ph.a();
                    statePc = 101;
                    continue stateLoop;
                }
                case 51: {
                    if (-6 == (this.field_h ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_h == 9) {
                        statePc = 97;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (this.field_h == 6) {
                        statePc = 93;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if ((this.field_h ^ -1) == -9) {
                        statePc = 93;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (7 != this.field_h) {
                        statePc = 84;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    qh.field_c.c(mf.field_s, 321, 1 + (dd.field_c.field_x + 167), 0, -1);
                    stackIn_58_0 = qh.field_c;
                    stackIn_57_0 = stackIn_58_0;
                    if (0 == ie.field_b.field_s) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = (pk) ((Object) stackIn_57_0);
                    stackIn_59_1 = 1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = (pk) ((Object) stackIn_58_0);
                    stackIn_59_1 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = (pk) ((Object) stackIn_59_0);
                    stackIn_60_0 = stackIn_61_0;
                    stackIn_61_1 = stackIn_59_1;
                    stackIn_60_1 = stackIn_61_1;
                    stackIn_61_2 = 0;
                    stackIn_60_2 = stackIn_61_2;
                    if (-1 == (ie.field_b.field_L ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_62_0 = (pk) ((Object) stackIn_60_0);
                    stackIn_62_1 = stackIn_60_1;
                    stackIn_62_2 = stackIn_60_2;
                    stackIn_62_3 = 1;
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (pk) ((Object) stackIn_61_0);
                    stackIn_62_1 = stackIn_61_1;
                    stackIn_62_2 = stackIn_61_2;
                    stackIn_62_3 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = (pk) ((Object) stackIn_62_0);
                    stackIn_63_0 = stackIn_64_0;
                    stackIn_64_1 = stackIn_62_1;
                    stackIn_63_1 = stackIn_64_1;
                    stackIn_64_2 = stackIn_62_2;
                    stackIn_63_2 = stackIn_64_2;
                    stackIn_64_3 = stackIn_62_3;
                    stackIn_63_3 = stackIn_64_3;
                    if (fa.field_b == 0) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_65_0 = (pk) ((Object) stackIn_63_0);
                    stackIn_65_1 = stackIn_63_1;
                    stackIn_65_2 = stackIn_63_2;
                    stackIn_65_3 = stackIn_63_3;
                    stackIn_65_4 = 1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = (pk) ((Object) stackIn_64_0);
                    stackIn_65_1 = stackIn_64_1;
                    stackIn_65_2 = stackIn_64_2;
                    stackIn_65_3 = stackIn_64_3;
                    stackIn_65_4 = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    ((pk) (Object) stackIn_65_0).c(tf.a(stackIn_65_1 != 0, stackIn_65_2, stackIn_65_3 != 0, stackIn_65_4 != 0), 321, 190 + dd.field_c.field_x - -1, 0, -1);
                    stackIn_67_0 = qh.field_c;
                    stackIn_66_0 = stackIn_67_0;
                    if (-1 == (ie.field_b.field_s ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = (pk) ((Object) stackIn_66_0);
                    stackIn_68_1 = 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = (pk) ((Object) stackIn_67_0);
                    stackIn_68_1 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_70_0 = (pk) ((Object) stackIn_68_0);
                    stackIn_69_0 = stackIn_70_0;
                    stackIn_70_1 = stackIn_68_1;
                    stackIn_69_1 = stackIn_70_1;
                    if (-1 == (fa.field_b ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_71_0 = (pk) ((Object) stackIn_69_0);
                    stackIn_71_1 = stackIn_69_1;
                    stackIn_71_2 = 1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (pk) ((Object) stackIn_70_0);
                    stackIn_71_1 = stackIn_70_1;
                    stackIn_71_2 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_73_0 = (pk) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_73_0;
                    stackIn_73_1 = stackIn_71_1;
                    stackIn_72_1 = stackIn_73_1;
                    stackIn_73_2 = stackIn_71_2;
                    stackIn_72_2 = stackIn_73_2;
                    stackIn_73_3 = param0 ^ 95;
                    stackIn_72_3 = stackIn_73_3;
                    if (-1 == (ie.field_b.field_L ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = (pk) ((Object) stackIn_72_0);
                    stackIn_74_1 = stackIn_72_1;
                    stackIn_74_2 = stackIn_72_2;
                    stackIn_74_3 = stackIn_72_3;
                    stackIn_74_4 = 1;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (pk) ((Object) stackIn_73_0);
                    stackIn_74_1 = stackIn_73_1;
                    stackIn_74_2 = stackIn_73_2;
                    stackIn_74_3 = stackIn_73_3;
                    stackIn_74_4 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    ((pk) (Object) stackIn_74_0).c(pp.a(stackIn_74_1 != 0, stackIn_74_2 != 0, stackIn_74_3, stackIn_74_4 != 0), 321, 280 + dd.field_c.field_x + 1, 0, -1);
                    stackIn_76_0 = qh.field_c;
                    stackIn_75_0 = stackIn_76_0;
                    if (0 == ie.field_b.field_s) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (pk) ((Object) stackIn_75_0);
                    stackIn_77_1 = 1;
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (pk) ((Object) stackIn_76_0);
                    stackIn_77_1 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (pk) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_79_0;
                    stackIn_79_1 = stackIn_77_1;
                    stackIn_78_1 = stackIn_79_1;
                    stackIn_79_2 = 2;
                    stackIn_78_2 = stackIn_79_2;
                    if (-1 == (ie.field_b.field_L ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_80_0 = (pk) ((Object) stackIn_78_0);
                    stackIn_80_1 = stackIn_78_1;
                    stackIn_80_2 = stackIn_78_2;
                    stackIn_80_3 = 1;
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (pk) ((Object) stackIn_79_0);
                    stackIn_80_1 = stackIn_79_1;
                    stackIn_80_2 = stackIn_79_2;
                    stackIn_80_3 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (pk) ((Object) stackIn_80_0);
                    stackIn_81_0 = stackIn_82_0;
                    stackIn_82_1 = stackIn_80_1;
                    stackIn_81_1 = stackIn_82_1;
                    stackIn_82_2 = stackIn_80_2;
                    stackIn_81_2 = stackIn_82_2;
                    stackIn_82_3 = stackIn_80_3;
                    stackIn_81_3 = stackIn_82_3;
                    if ((fa.field_b ^ -1) == -1) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_83_0 = (pk) ((Object) stackIn_81_0);
                    stackIn_83_1 = stackIn_81_1;
                    stackIn_83_2 = stackIn_81_2;
                    stackIn_83_3 = stackIn_81_3;
                    stackIn_83_4 = 1;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (pk) ((Object) stackIn_82_0);
                    stackIn_83_1 = stackIn_82_1;
                    stackIn_83_2 = stackIn_82_2;
                    stackIn_83_3 = stackIn_82_3;
                    stackIn_83_4 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    ((pk) (Object) stackIn_83_0).c(qn.a(stackIn_83_1 != 0, stackIn_83_2, stackIn_83_3 != 0, stackIn_83_4 != 0), 321, 329 + dd.field_c.field_x, 0, -1);
                    if (var8 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (10 != this.field_h) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    i.field_Q.a(vf.field_m, 62, 250 - -um.field_m.field_x, 315, 1000, 0, -1, 0, 0, 3 * um.field_m.field_x / 2);
                    if (var8 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (-12 == (this.field_h ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 89: {
                    wb.b(-1);
                    gd.field_a[da.field_a].b(245, 199);
                    if (mf.field_t < vi.field_a.length << -385993566) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    vi.a(-(mf.field_t >> -862550366) + vi.field_a.length, gd.field_a[gf.field_h], 245, 199, vi.field_a);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    ph.c(243, 197, gd.field_a[0].field_j - -4, 4 + gd.field_a[0].field_e, 1);
                    return;
                }
                case 93: {
                    if (this.field_h == 6) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackIn_96_0 = 1;
                    statePc = 96;
                    continue stateLoop;
                }
                case 95: {
                    stackIn_96_0 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var2 = stackIn_96_0;
                    this.a(var2 != 0, (byte) -128);
                    var3 = 168;
                    ph.b(33, var3, 573, 3355443);
                    ph.b(31, 1 + var3, 577, 15116313);
                    ph.b(33, 2 + var3, 573, 3355443);
                    var4 = 373;
                    ph.b(33, var4, 573, 3355443);
                    ph.b(31, 1 + var4, 577, 15116313);
                    ph.b(33, var4 + 2, 573, 3355443);
                    statePc = 101;
                    continue stateLoop;
                }
                case 97: {
                    var14 = ol.field_f[rn.field_j];
                    if (ti.field_l != null) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    ti.field_l = new uf[hg.field_d.length];
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    dupTemp$0 = new uf(qh.field_c, 0, 359, 166, (sm) null, 0, 0);
                    ti.field_l[rn.field_j] = dupTemp$0;
                    var10 = dupTemp$0;
                    var13 = var10;
                    var13.a((byte) 85, 30);
                    this.field_c.a(0, var14, var13);
                    var13.a((byte) -109, 30);
                    var10.c(0);
                    ti.field_l[rn.field_j].b(51, -116, 195);
                    this.e(param0 ^ 733, rn.field_j).b(414, 216);
                    ph.c(414, 216, 160, 120, 16777215);
                    ph.c(413, 215, 162, 122, 0);
                    var3 = 195;
                    ph.b(37, var3, 554, 3355443);
                    ph.b(35, var3 + 1, 558, 15116313);
                    ph.b(37, 2 + var3, 554, 3355443);
                    var4 = 350;
                    ph.b(37, var4, 554, 3355443);
                    ph.b(35, var4 + 1, 558, 15116313);
                    ph.b(37, 2 + var4, 554, 3355443);
                    statePc = 101;
                    continue stateLoop;
                }
                case 100: {
                    bj.field_L[eq.field_b].a(115, 111);
                    ph.g(0, 150, 640, 480);
                    qd.field_c[eq.field_b].a(0, 0);
                    ph.a();
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var2 = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (var2 >= this.field_a.field_i) {
                        statePc = 110;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackOut_103_0 = this.c(4, var2);
                    stackIn_111_0 = stackOut_103_0 ? 1 : 0;
                    stackIn_104_0 = stackOut_103_0;
                    if (var8 != 0) {
                        statePc = 111;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (!stackIn_104_0) {
                        statePc = 109;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_107_0 = this;
                    stackIn_106_0 = stackIn_107_0;
                    if ((var2 ^ -1) != (this.field_a.field_g ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_108_0 = this;
                    stackIn_108_1 = 1;
                    statePc = 108;
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = this;
                    stackIn_108_1 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    this.a(stackIn_108_1 != 0, this.a(23, var2), var2, 0);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var2++;
                    if (var8 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_111_0 = this.field_h ^ -1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (stackIn_111_0 != -10) {
                        statePc = 136;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var2 = jd.a(param0 ^ 93);
                    if ((wi.field_a.length ^ -1) == (nh.field_k ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_115_0 = wi.field_a[nh.field_k];
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = 1 + wi.field_a[nh.field_k - 1];
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var3 = stackIn_115_0;
                    var4 = wi.field_a[rn.field_j];
                    if (var4 < var3) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_118_0 = hg.field_d[nh.field_k];
                    statePc = 118;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_118_0 = qc.field_ab[var4];
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var5 = stackIn_118_0;
                    var6 = null;
                    if (10 <= var2) {
                        statePc = 128;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if ((var3 ^ -1) <= (var2 ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var15 = ol.field_d;
                    var6 = var15;
                    if (je.a((byte) 46)) {
                        statePc = 122;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var6 = var15 + " " + gn.field_i;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (2 > var2) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (-1 > (wp.field_w ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var16 = bl.field_g;
                    var6 = var16;
                    if (!je.a((byte) 81)) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var6 = var16 + " " + gn.field_i;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if ((var2 ^ -1) < (var5 + 10 ^ -1)) {
                        statePc = 130;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var6 = dd.field_b;
                    if (je.a((byte) 115)) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var6 = v.field_j;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var6 != null) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    ji.a(false, nl.field_s, 0, (String) (var6), 250, 16777120);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (e.field_f == 70) {
          ti.field_k = ti.field_k ^ true;
          return;
        } else {
          try {
            L0: {
              L1: {
                L2: {
                  if (-3 < (ri.field_E ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (9 == this.field_h) {
                        break L3;
                      } else {
                        if (0 != this.field_h) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (48 != e.field_f) {
                      break L2;
                    } else {
                      if (!i.field_P[82]) {
                        break L2;
                      } else {
                        nh.field_k = wi.field_a.length;
                        if (je.field_c) {
                          wp.field_w = 1;
                          ee.field_s = false;
                          lp.field_f = false;
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (4 != this.field_h) {
                    break L4;
                  } else {
                    if (!this.field_a.a((byte) -116)) {
                      L5: {
                        if (104 != e.field_f) {
                          break L5;
                        } else {
                          if (-1 <= (a.field_e ^ -1)) {
                            break L1;
                          } else {
                            a.field_e = a.field_e - 1;
                            cm.field_m = cm.field_m + 298;
                            if (0 != a.field_e) {
                              break L1;
                            } else {
                              if (-1 != (this.field_a.field_g ^ -1)) {
                                break L1;
                              } else {
                                this.field_a.field_g = 2;
                                if (var4 == 0) {
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        if (e.field_f != 105) {
                          break L6;
                        } else {
                          if ((hg.field_b.length ^ -1) < (a.field_e - -1 ^ -1)) {
                            cm.field_m = cm.field_m - 298;
                            a.field_e = a.field_e + 1;
                            if (hg.field_b.length + -1 != a.field_e) {
                              break L1;
                            } else {
                              if (this.field_a.field_g == 2) {
                                this.field_a.field_g = 1;
                                if (var4 == 0) {
                                  break L1;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L1;
                              }
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      L7: {
                        if (102 == e.field_f) {
                          break L7;
                        } else {
                          if (103 == e.field_f) {
                            L8: {
                              var2 = -a.field_e + (-1 + hg.field_b.length);
                              a.field_e = a.field_e + var2;
                              cm.field_m = cm.field_m - var2 * 298;
                              if (this.field_a.field_g == 2) {
                                this.field_a.field_g = 1;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (var4 == 0) {
                              break L1;
                            } else {
                              break L7;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      cm.field_m = cm.field_m + 298 * a.field_e;
                      a.field_e = 0;
                      if ((this.field_a.field_g ^ -1) != -1) {
                        break L1;
                      } else {
                        this.field_a.field_g = 2;
                        if (var4 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if ((this.field_h ^ -1) == -4) {
                  L9: {
                    if ((e.field_f ^ -1) == -99) {
                      break L9;
                    } else {
                      if (-100 != (e.field_f ^ -1)) {
                        if (e.field_f != 96) {
                          if ((e.field_f ^ -1) == -98) {
                            L10: {
                              L11: {
                                if (-1 == this.field_a.field_g) {
                                  break L11;
                                } else {
                                  if (2 <= this.field_a.field_g) {
                                    break L10;
                                  } else {
                                    this.field_a.a(-this.field_a.field_g + 1, -1);
                                    if (var4 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              this.field_a.a(0, -1);
                              break L10;
                            }
                            this.field_a.b(true);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L1;
                          }
                        } else {
                          L12: {
                            L13: {
                              if (this.field_a.field_g == -1) {
                                break L13;
                              } else {
                                if (2 > this.field_a.field_g) {
                                  this.field_a.a(-this.field_a.field_g + 1, -1);
                                  if (var4 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                            this.field_a.a(1, -1);
                            break L12;
                          }
                          this.field_a.b(true);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if (this.field_a.field_g != 2) {
                        break L15;
                      } else {
                        this.field_a.a(mj.field_k, -1);
                        if (var4 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if ((this.field_a.field_g ^ -1) != 0) {
                        break L16;
                      } else {
                        L17: {
                          if (99 == e.field_f) {
                            break L17;
                          } else {
                            this.field_a.a(mj.field_k, -1);
                            if (var4 == 0) {
                              break L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                        this.field_a.a(2, -1);
                        if (var4 == 0) {
                          break L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                    mj.field_k = this.field_a.field_g;
                    this.field_a.a(2, -1);
                    break L14;
                  }
                  this.field_a.b(true);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
              L18: {
                if (param0 >= 65) {
                  break L18;
                } else {
                  this.a(-115, (byte) 99);
                  break L18;
                }
              }
              L19: {
                L20: {
                  var2 = this.field_a.field_g;
                  if (rf.field_x[this.field_h]) {
                    break L20;
                  } else {
                    this.field_a.a(0);
                    if (var4 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                this.field_a.a(false);
                break L19;
              }
              L21: {
                if ((var2 ^ -1) == (this.field_a.field_g ^ -1)) {
                  break L21;
                } else {
                  if (this.c(4, this.field_a.field_g)) {
                    break L21;
                  } else {
                    L22: {
                      if (rf.field_x[this.field_h]) {
                        break L22;
                      } else {
                        this.field_a.a(0);
                        if (var4 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    this.field_a.a(false);
                    break L21;
                  }
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            L23: {
              if (this.field_a.field_g == -1) {
                break L23;
              } else {
                this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
                break L23;
              }
            }
            throw mh.<RuntimeException>$cfr$sneakyThrow(var3);
          }
          L24: {
            if (decompiledRegionSelector0 == 0) {
              if (this.field_a.field_g == -1) {
                break L24;
              } else {
                this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
                return;
              }
            } else {
              if (decompiledRegionSelector0 == 1) {
                if (this.field_a.field_g == -1) {
                  break L24;
                } else {
                  this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
                  return;
                }
              } else {
                if (decompiledRegionSelector0 == 2) {
                  if (this.field_a.field_g == -1) {
                    return;
                  } else {
                    this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
                    return;
                  }
                } else {
                  L25: {
                    if (this.field_a.field_g == -1) {
                      break L25;
                    } else {
                      this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
                      break L25;
                    }
                  }
                  return;
                }
              }
            }
          }
          return;
        }
    }

    private final int d(int param0, int param1) {
        int var3 = -21 % ((8 - param0) / 51);
        if ((this.field_h ^ -1) != -12) {
            return param1;
        }
        if (0 == (param1 ^ -1)) {
            return -1;
        }
        return -param1 + 1;
    }

    private final void a(int param0, byte param1) {
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int statePc = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        int var18 = 0;
        bm var19 = null;
        bm var20 = null;
        long[] var27 = null;
        int[] var28 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = Torquing.field_u;
                    if (je.a((byte) 107)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = 90 + param0;
                    qh.field_c.c(rd.field_v, 320, var3 + qh.field_c.field_x, 0, -1);
                    var3 = var3 + qh.field_c.field_x * 3;
                    qh.field_c.a(ti.field_m, 130, var3, 380, 1000, 0, -1, 1, 0, qh.field_c.field_x * 3 / 2);
                    return;
                }
                case 3: {
                    if (null == vl.field_c) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    vl.field_c = bn.a(11, 3, 1, (byte) 44, 10);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 >= 45) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.a(-7, 127, -114, -69, 82, 6, 92, -22);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var19 = vl.field_c;
                    var20 = var19;
                    if (var20.field_k) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = pm.field_p;
                    if (var18 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (null == var20.field_p) {
                        statePc = 32;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = rd.field_v;
                    var5 = ld.field_k;
                    var6 = var19.field_p[var5];
                    var27 = var19.field_m[var5];
                    var28 = var19.field_n[var5];
                    var9 = 0;
                    var10 = 7 + param0;
                    var11 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (10 < var11) {
                        statePc = 31;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_34_0 = var11 ^ -1;
                    stackIn_14_0 = stackIn_34_0;
                    stackIn_34_1 = -11;
                    stackIn_14_1 = stackIn_34_1;
                    if (var18 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 == stackIn_14_1) {
                        statePc = 26;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (null != var6[var11]) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10 += 20;
                    if (var18 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var12 = 0;
                    if (!bn.a(var6[var11], -17310)) {
                        statePc = 25;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var9 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (null == gn.field_l) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var27[var11] ^ -1L) != (gn.field_l.field_l ^ -1L)) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if ((var28[var11] ^ -1) == (ie.field_b.field_s ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var12 = 2;
                    var9 = 1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var15 = var11 - -1 + ". ";
                    var13 = var28[var11];
                    var4 = "";
                    var14 = var6[var11];
                    if (var18 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (ie.field_b == null) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var9 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = 2;
                    var14 = re.field_e;
                    var13 = ie.field_b.field_s;
                    var15 = "";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    qh.field_c.a(var15, 148, var10 + qh.field_c.field_x, var12, -1);
                    var16 = var14;
                    qh.field_c.b(var16, 148, qh.field_c.field_x + var10, var12, -1);
                    var17 = Integer.toString(var13);
                    qh.field_c.a(var17, 517, var10 + qh.field_c.field_x, var12, -1);
                    var10 += 20;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var11++;
                    if (var18 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var18 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var4 = qp.field_o;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    qh.field_c.a(n.field_r, 130, 13 + param0 + 220, 380, 1000, 0, -1, 1, 0, qh.field_c.field_x * 3 / 2);
                    stackIn_34_0 = param0;
                    stackIn_34_1 = 90;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var5 = stackIn_34_0 + stackIn_34_1;
                    i.field_Q.c(var4, 320, var5 + um.field_m.field_x, 4, -1);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    mh(Torquing param0, int param1) {
        this.field_b = -1;
        this.field_j = -1;
        this.field_e = -1;
        try {
            this.field_c = param0;
            this.field_h = param1;
            this.field_a = new db(rf.field_q[param1].length);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
