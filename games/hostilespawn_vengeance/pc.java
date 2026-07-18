/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static int field_c;
    static volatile boolean field_a;
    static int field_d;
    static String field_b;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        boolean[] var5 = null;
        boolean[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        oc var8 = null;
        oj var9_ref_oj = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ArrayIndexOutOfBoundsException var21_ref_ArrayIndexOutOfBoundsException = null;
        int var21 = 0;
        oj var22_ref_oj = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        oc stackIn_13_0 = null;
        oc stackIn_24_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_186_0 = 0;
        int stackIn_186_1 = 0;
        boolean stackIn_226_0 = false;
        int stackIn_238_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_247_0 = 0;
        boolean stackIn_250_0 = false;
        int stackIn_296_0 = 0;
        int stackIn_298_0 = 0;
        boolean stackIn_304_0 = false;
        int stackIn_339_0 = 0;
        Throwable caughtException = null;
        oc stackOut_12_0 = null;
        oc stackOut_23_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        boolean stackOut_82_0 = false;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        int stackOut_184_0 = 0;
        int stackOut_184_1 = 0;
        boolean stackOut_225_0 = false;
        int stackOut_235_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_246_0 = 0;
        boolean stackOut_249_0 = false;
        int stackOut_295_0 = 0;
        int stackOut_297_0 = 0;
        boolean stackOut_303_0 = false;
        int stackOut_338_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (50 > df.field_c) {
                        statePc = 4;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (ik.field_b) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ik.field_b = true;
                    int fieldTemp$1 = aa.field_f + 1;
                    aa.field_f = aa.field_f + 1;
                    if (fieldTemp$1 >= 10) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    return;
                }
                case 10: {
                    aa.field_f = 0;
                    var1_int = ln.field_a.field_d;
                    var2 = ln.field_a.field_a;
                    var3 = ln.field_a.field_n;
                    kf.a(cm.field_c, 0, var3);
                    var4 = ln.field_a.field_c;
                    var5 = ln.field_a.field_e;
                    var6 = ln.field_a.field_q;
                    var7 = ln.field_a.field_f;
                    var8_int = 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (rc.field_e <= var8_int) {
                        statePc = 23;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var9_ref_oj = re.field_n[var8_int];
                    stackOut_12_0 = var9_ref_oj.field_j;
                    stackIn_24_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var26 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var10 = ((oc) (Object) stackIn_13_0).b(param0 + -6);
                    if (var10 < 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (~var3 >= ~var10) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var4[var10] != 3) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var4[var10] = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var8_int++;
                    if (var26 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = mm.field_m[0].field_j;
                    stackIn_24_0 = stackOut_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var8 = stackIn_24_0;
                    var9 = var8.b(-4);
                    var10 = ln.field_a.field_g[var9];
                    if (var10 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var10 = -1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var11 = var8.field_g + -50;
                    var12 = 50 + var8.field_g;
                    var13 = -50 + var8.field_e;
                    if (0 < var11) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var11 = 1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (0 >= var13) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var13 = 1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var14 = var8.field_e + 50;
                    if (var14 >= var1_int + -1) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var14 = var1_int + -2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var2 + -1 <= var12) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var12 = -2 + var2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var15 = 0;
                    var16 = var11;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (~var12 >= ~var16) {
                        statePc = 51;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var15 = var16 * var1_int + var13;
                    stackOut_42_0 = var13;
                    stackIn_52_0 = stackOut_42_0;
                    stackIn_43_0 = stackOut_42_0;
                    if (var26 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var17 = stackIn_43_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var14 <= var17) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var5[var15] = false;
                    var6[var15] = false;
                    var15++;
                    var17++;
                    if (var26 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var26 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var16++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var26 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var16 = var11 * var1_int;
                    stackOut_51_0 = var8.field_e;
                    stackIn_52_0 = stackOut_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var17 = stackIn_52_0;
                    var18 = var8.field_g;
                    var19 = Math.max(-19 + var8.field_e, 1);
                    var20 = Math.min(20 + var8.field_e, ln.field_a.field_d - param0);
                    var21 = Math.max(var8.field_g - 17, 1);
                    var22 = Math.min(16 + var8.field_g, ln.field_a.field_a + -2);
                    var23 = var19;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (~var20 > ~var23) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    ui.a(var21, var17, var18, var23, (byte) -69);
                    ui.a(var22, var17, var18, var23, (byte) -69);
                    var23++;
                    if (var26 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var26 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var23 = 1 + var21;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (var22 + -1 < var23) {
                        statePc = 66;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    ui.a(var23, var17, var18, var19, (byte) -69);
                    ui.a(var23, var17, var18, var20, (byte) -69);
                    var23++;
                    if (var26 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var26 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var10 <= 0) {
                        statePc = 81;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var16 = var21 * ln.field_a.field_d;
                    var23 = var21;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var22 < var23) {
                        statePc = 81;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = var19;
                    stackIn_83_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var26 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var24 = stackIn_70_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (~var20 > ~var24) {
                        statePc = 79;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackOut_72_0 = ~var10;
                    stackOut_72_1 = ~ln.field_a.field_g[var24 + var16];
                    stackIn_80_0 = stackOut_72_0;
                    stackIn_80_1 = stackOut_72_1;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    if (var26 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (stackIn_73_0 == stackIn_73_1) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    ln.field_a.field_e[var16 + var24] = true;
                    ln.field_a.field_f[var16 - -var24] = 2;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var24++;
                    if (var26 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackOut_79_0 = var16;
                    stackOut_79_1 = ln.field_a.field_d;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var16 = stackIn_80_0 + stackIn_80_1;
                    var23++;
                    if (var26 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    cm.field_c[var9] = 50;
                    var6[var9] = true;
                    var19 = 49;
                    var20 = var9;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    stackOut_82_0 = n.field_o;
                    stackIn_83_0 = stackOut_82_0 ? 1 : 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (stackIn_83_0 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var21 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (~var21 <= ~rc.field_e) {
                        statePc = 157;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var22_ref_oj = re.field_n[var21];
                    var23 = var22_ref_oj.field_j.b(param0 ^ -2);
                    if (var26 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (null == var22_ref_oj) {
                        statePc = 156;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (!od.a(var22_ref_oj.field_i, 1)) {
                        statePc = 156;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var22_ref_oj.field_h == 0) {
                        statePc = 156;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (null == q.field_g) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (q.field_g.a(var22_ref_oj, (byte) -5)) {
                        statePc = 156;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var4[var23] = 0;
                    if (rh.a(var22_ref_oj.field_i, true)) {
                        statePc = 132;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var4[1 + var23] = 0;
                    var24 = var4[var23 + ln.field_a.field_d - 1];
                    if (1 != var4[var23 + ln.field_a.field_d]) {
                        statePc = 118;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var24 == 2) {
                        statePc = 118;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (var24 == 3) {
                        statePc = 118;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (4 != var24) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var4[var23 - -ln.field_a.field_d] = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var24 = var4[ln.field_a.field_d + var23];
                    if (var4[ln.field_a.field_d + (var23 + 1)] != 1) {
                        statePc = 131;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (2 == var24) {
                        statePc = 131;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var24 == 3) {
                        statePc = 131;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var24 != 4) {
                        statePc = 130;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var4[1 + ln.field_a.field_d + var23] = 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (var26 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var4[var23 + -ln.field_a.field_d] = 0;
                    var24 = var4[1 + -ln.field_a.field_d + var23];
                    if (1 != var4[1 + var23]) {
                        statePc = 145;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (var24 == 2) {
                        statePc = 145;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var24 == 3) {
                        statePc = 145;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (4 != var24) {
                        statePc = 144;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var4[var23 + 1] = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (var24 != 1) {
                        statePc = 156;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var24 = var4[var23 - (ln.field_a.field_d * 2 + 1)];
                    if (2 == var24) {
                        statePc = 156;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var24 == 3) {
                        statePc = 156;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (var24 != 4) {
                        statePc = 155;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var4[-ln.field_a.field_d + (var23 - -1)] = 0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var21++;
                    if (var26 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    kl.field_c[var19] = var20;
                    cm.field_c[var20] = var19 + 1;
                    var21 = var20 + 1;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var22 = -1 + var20;
                    var23 = -var1_int + var20;
                    var24 = var20 - -var1_int;
                    var25 = cm.field_c[var20] + -1;
                    if (var19 <= 0) {
                        statePc = 171;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = ~var4[var21];
                    stackOut_159_1 = -1;
                    stackIn_186_0 = stackOut_159_0;
                    stackIn_186_1 = stackOut_159_1;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    if (var26 != 0) {
                        statePc = 186;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = stackIn_160_0;
                    stackOut_160_1 = stackIn_160_1;
                    stackIn_162_0 = stackOut_160_0;
                    stackIn_162_1 = stackOut_160_1;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (stackIn_162_0 == stackIn_162_1) {
                        statePc = 168;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (var4[var21] != 5) {
                        statePc = 171;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (cm.field_c[var21] < var25) {
                        statePc = 214;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var19 <= 0) {
                        statePc = 184;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (var4[var23] == 0) {
                        statePc = 180;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var4[var23] != 5) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (var25 <= cm.field_c[var23]) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var20 = var23;
                    var19--;
                    if (var26 == 0) {
                        statePc = 215;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackOut_184_0 = ~var19;
                    stackOut_184_1 = -1;
                    stackIn_186_0 = stackOut_184_0;
                    stackIn_186_1 = stackOut_184_1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (stackIn_186_0 >= stackIn_186_1) {
                        statePc = 196;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var4[var24] == 0) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var4[var24] != 5) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (~cm.field_c[var24] > ~var25) {
                        statePc = 213;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (var19 <= 0) {
                        statePc = 208;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (var4[var22] == 0) {
                        statePc = 205;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (var4[var22] != 5) {
                        statePc = 208;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (var25 > cm.field_c[var22]) {
                        statePc = 212;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var19++;
                    if (var19 >= 50) {
                        statePc = 220;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var20 = kl.field_c[var19];
                    if (var26 == 0) {
                        statePc = 215;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var20 = var22;
                    var19--;
                    if (var26 == 0) {
                        statePc = 215;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var19--;
                    var20 = var24;
                    if (var26 == 0) {
                        statePc = 215;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var19--;
                    var20 = var21;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (var26 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var15 = 0;
                    if (n.field_o) {
                        statePc = 223;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var21 = 0;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (~var21 <= ~rc.field_e) {
                        statePc = 240;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var22_ref_oj = re.field_n[var21];
                    stackOut_225_0 = od.a(var22_ref_oj.field_i, 1);
                    stackIn_241_0 = stackOut_225_0 ? 1 : 0;
                    stackIn_226_0 = stackOut_225_0;
                    if (var26 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (stackIn_226_0) {
                        statePc = 230;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var22_ref_oj.field_e != 0) {
                        statePc = 239;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (0 >= var22_ref_oj.field_I) {
                        statePc = 239;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var23 = var22_ref_oj.field_j.b(-4);
                    if (rh.a(var22_ref_oj.field_i, true)) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    stackOut_235_0 = 1;
                    stackIn_238_0 = stackOut_235_0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 237: {
                    stackOut_237_0 = -ln.field_a.field_d;
                    stackIn_238_0 = stackOut_237_0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    var24 = stackIn_238_0;
                    ln.field_a.field_c[var23] = 2;
                    ln.field_a.field_c[var24 + var23] = 2;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var21++;
                    if (var26 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    stackOut_240_0 = 0;
                    stackIn_241_0 = stackOut_240_0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (stackIn_241_0 != (cj.field_I & 4)) {
                        statePc = 244;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var16 = var1_int;
                    var21 = 1;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (~var21 <= ~(-1 + var2)) {
                        statePc = 297;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    stackOut_246_0 = 1;
                    stackIn_298_0 = stackOut_246_0;
                    stackIn_247_0 = stackOut_246_0;
                    if (var26 != 0) {
                        statePc = 298;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var22 = stackIn_247_0;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (-1 + var1_int <= var22) {
                        statePc = 295;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var15 = var22 + var16;
                    stackOut_249_0 = var5[var15];
                    stackIn_296_0 = stackOut_249_0 ? 1 : 0;
                    stackIn_250_0 = stackOut_249_0;
                    if (var26 != 0) {
                        statePc = 296;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0) {
                        statePc = 294;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (var4[var15] == 1) {
                        statePc = 258;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (!var5[1 + var15]) {
                        statePc = 265;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (var4[1 + var15] == 2) {
                        statePc = 265;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (var4[var15 + 1] != 1) {
                        statePc = 292;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (!var5[var15 + -1]) {
                        statePc = 274;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (var4[var15 + -1] == 2) {
                        statePc = 274;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (var4[var15 - 1] != 1) {
                        statePc = 292;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (!var5[var15 + var1_int]) {
                        statePc = 283;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (var4[var1_int + var15] == 2) {
                        statePc = 283;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (var4[var1_int + var15] != 1) {
                        statePc = 292;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (!var5[var15 + -var1_int]) {
                        statePc = 294;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (var4[var15 - var1_int] == 2) {
                        statePc = 294;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (var4[-var1_int + var15] == 1) {
                        statePc = 294;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var5[var15] = true;
                    var7[var15] = 2;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    var22++;
                    if (var26 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = var16 + var1_int;
                    stackIn_296_0 = stackOut_295_0;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    var16 = stackIn_296_0;
                    var21++;
                    if (var26 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var16 = var1_int;
                    stackOut_297_0 = 1;
                    stackIn_298_0 = stackOut_297_0;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    var21 = stackIn_298_0;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (~var21 <= ~(var2 - 1)) {
                        statePc = 342;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if (var26 != 0) {
                        statePc = 342;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var22 = 1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (~(var1_int + -1) >= ~var22) {
                        statePc = 338;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var15 = var16 + var22;
                    stackOut_303_0 = var5[var15];
                    stackIn_339_0 = stackOut_303_0 ? 1 : 0;
                    stackIn_304_0 = stackOut_303_0;
                    if (var26 != 0) {
                        statePc = 339;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (stackIn_304_0) {
                        statePc = 337;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (2 == var4[var15]) {
                        statePc = 312;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (!var5[var15 - -1]) {
                        statePc = 316;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (var4[var15 - -1] != 2) {
                        statePc = 336;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (!var5[-1 + var15]) {
                        statePc = 322;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (var4[var15 + -1] != 2) {
                        statePc = 336;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (!var5[var1_int + var15]) {
                        statePc = 328;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (var4[var15 - -var1_int] != 2) {
                        statePc = 336;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (!var5[-var1_int + var15]) {
                        statePc = 337;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    if (var4[var15 + -var1_int] != 2) {
                        statePc = 336;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var5[var15] = true;
                    var7[var15] = 2;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    var22++;
                    if (var26 == 0) {
                        statePc = 302;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    stackOut_338_0 = var16 + var1_int;
                    stackIn_339_0 = stackOut_338_0;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    var16 = stackIn_339_0;
                    var21++;
                    if (var26 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, boolean param2, pf param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var19 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param4 > 79) {
              L1: {
                var5_int = vf.b(123, (param0 + -param1) * 3);
                var6 = 3 * param1;
                lk.l(74);
                var7 = var5_int + -10;
                if (param3.field_f <= 0) {
                  break L1;
                } else {
                  if (null != param3.field_x) {
                    fk.a((byte) -74);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              th.field_Lb = 0;
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var8 <= ~param3.field_k) {
                      break L4;
                    } else {
                      var9 = param3.field_i[var8];
                      var10 = param3.field_P[var8];
                      var11 = param3.field_z[var8];
                      stackOut_12_0 = param2;
                      stackIn_48_0 = stackOut_12_0 ? 1 : 0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var19 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (!stackIn_13_0) {
                              break L6;
                            } else {
                              var12 = tb.field_K[var9];
                              var13 = lc.field_c[var9];
                              var14 = tb.field_K[var10] - var12;
                              var15 = -var12 + tb.field_K[var11];
                              var16 = lc.field_c[var10] - var13;
                              var17 = -var13 + lc.field_c[var11];
                              if (var17 * var14 + -(var16 * var15) >= 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var12 = rb.field_p[var9];
                          if (-2147483648 == var12) {
                            break L5;
                          } else {
                            var13 = rb.field_p[var10];
                            if (-2147483648 == var13) {
                              break L5;
                            } else {
                              L7: {
                                var14 = rb.field_p[var11];
                                if (var14 != -2147483648) {
                                  break L7;
                                } else {
                                  if (var19 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                var15 = var14 + (var12 - (-var13 + var6));
                                stackOut_23_0 = -1 + mn.field_a.length;
                                stackIn_26_0 = stackOut_23_0;
                                stackIn_24_0 = stackOut_23_0;
                                if (var7 >= 0) {
                                  stackOut_26_0 = stackIn_26_0;
                                  stackOut_26_1 = var15 >> var7;
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  break L8;
                                } else {
                                  stackOut_24_0 = stackIn_24_0;
                                  stackOut_24_1 = var15 << -var7;
                                  stackIn_27_0 = stackOut_24_0;
                                  stackIn_27_1 = stackOut_24_1;
                                  break L8;
                                }
                              }
                              var16 = stackIn_27_0 + -stackIn_27_1;
                              var17 = mn.field_a[var16];
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if (0 == var17 >> 4) {
                                      break L11;
                                    } else {
                                      var16--;
                                      stackOut_29_0 = var16;
                                      stackIn_38_0 = stackOut_29_0;
                                      stackIn_30_0 = stackOut_29_0;
                                      if (var19 != 0) {
                                        break L10;
                                      } else {
                                        L12: {
                                          if (stackIn_30_0 >= 0) {
                                            break L12;
                                          } else {
                                            System.err.println("Out of range!");
                                            if (var19 == 0) {
                                              break L5;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var17 = mn.field_a[var16];
                                        if (var19 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_37_0 = (var16 << 4) + var17;
                                  stackIn_38_0 = stackOut_37_0;
                                  break L10;
                                }
                                L13: {
                                  var18 = stackIn_38_0;
                                  lh.field_d[var18] = var8;
                                  mn.field_a[var16] = 1 + var17;
                                  if (param3.field_f <= 0) {
                                    break L13;
                                  } else {
                                    if (null != param3.field_x) {
                                      ke.field_z[param3.field_x[var8]] = ke.field_z[param3.field_x[var8]] + 1;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                th.field_Lb = th.field_Lb + 1;
                                break L5;
                              }
                            }
                          }
                        }
                        var8++;
                        if (var19 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_47_0 = 0;
                  stackIn_48_0 = stackOut_47_0;
                  break L3;
                }
                L14: {
                  L15: {
                    if (stackIn_48_0 >= param3.field_f) {
                      break L15;
                    } else {
                      if (null == param3.field_x) {
                        break L15;
                      } else {
                        var8 = 0;
                        var9 = 0;
                        L16: while (true) {
                          if (~var9 <= ~ke.field_z.length) {
                            break L15;
                          } else {
                            var10 = ke.field_z[var9];
                            ke.field_z[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L14;
                            } else {
                              if (var19 == 0) {
                                continue L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L14;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5;
            stackOut_59_1 = new StringBuilder().append("pc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param3 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L17;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L17;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        try {
            ac.a(param1, param0, -1, (String) null);
            if (param2) {
                pc.a(118, 37, true, (pf) null, (byte) -126);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "pc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 14088) {
                break L1;
              } else {
                pc.a(true, true, true);
                break L1;
              }
            }
            stackOut_3_0 = se.field_c.equals((Object) (Object) mf.a(false, (CharSequence) (Object) param1));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("pc.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, String param1, boolean param2, long param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param2) {
                        break L2;
                      } else {
                        field_a = false;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var6_ref2 = param4.getParameter("cookiehost");
                        var7 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var6_ref2;
                        if (param3 >= 0L) {
                          break L4;
                        } else {
                          var7 = var7 + "; Discard;";
                          if (!HostileSpawn.field_I) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7 = var7 + "; Expires=" + dk.a((byte) -41, 1000L * param3 + hn.a((byte) 80)) + "; Max-Age=" + param3;
                      break L3;
                    }
                    a.a(param4, 17467, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var6 = decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var6_ref;
                stackOut_10_1 = new StringBuilder().append("pc.E(");
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L6;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  break L6;
                }
              }
              L7: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L7;
                }
              }
              L8: {
                stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param4 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L8;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L8;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != 1) {
                field_c = -57;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "pc.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "@";
    }
}
