/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String[] field_d;
    static int field_b;
    private wb field_c;
    private wb field_a;

    final wb d(int param0) {
        if (param0 != -1) {
            this.field_a = (wb) null;
        }
        wb var2 = this.field_c.field_h;
        if (!(this.field_c != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_h;
        return var2;
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3, boolean param4) {
        km stackIn_16_0 = null;
        km stackIn_17_0 = null;
        km stackIn_18_0 = null;
        km stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        Object stackIn_81_0 = null;
        boolean stackIn_110_0 = false;
        int stackIn_125_0 = 0;
        boolean stackIn_136_0 = false;
        boolean stackIn_152_0 = false;
        int stackIn_158_0 = 0;
        km stackIn_175_0 = null;
        km stackIn_176_0 = null;
        km stackIn_177_0 = null;
        km stackIn_178_0 = null;
        km stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        km stackIn_182_0 = null;
        km stackIn_183_0 = null;
        km stackIn_184_0 = null;
        km stackIn_185_0 = null;
        km stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        km stackIn_187_0 = null;
        km stackIn_188_0 = null;
        km stackIn_189_0 = null;
        km stackIn_190_0 = null;
        km stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        Object stackIn_192_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_109_0;
        boolean stackOut_135_0;
        boolean stackOut_151_0;
        int statePc = 0;
        RuntimeException var5 = null;
        km var6 = null;
        km var7 = null;
        km var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        p var17 = null;
        Object var18 = null;
        int var18_int = 0;
        lk var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        km var22 = null;
        int[] var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var26 = null;
        km var27 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    rf.a(th.field_z, -4);
                    if (wl.field_d == null) {
                        statePc = 174;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    fb.field_o.field_Y = true;
                    var22 = ed.field_c;
                    var27 = var22;
                    ed.field_c.field_ub = 0;
                    var27.field_K = 0;
                    var6 = ii.field_d;
                    ii.field_d.field_ub = 0;
                    var6.field_K = 0;
                    jk.field_b.field_ub = 0;
                    var7 = jk.field_b;
                    var7.field_K = 0;
                    if (!k.b(1000)) {
                        statePc = 167;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    qi.field_e.field_V = ri.field_e.toUpperCase();
                    var9 = (2 + dm.field_r.field_K) / 2;
                    ed.field_c.a(0, 40, var9 - 2, (byte) -68, dm.field_r.field_ub + -40);
                    if ((wl.field_d.field_ic ^ -1) > (wl.field_d.field_vc ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ed.field_c.field_V = oc.field_h.toUpperCase();
                    ed.field_c.field_Y = false;
                    if (var19 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ed.field_c.field_V = lc.field_h.toUpperCase();
                    ed.field_c.field_Y = true;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    ed.field_c.field_vb = bd.field_b.field_vb;
                    if (0 >= ea.field_a) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (1 == ea.field_a) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var10_ref_String = oi.a(new String[]{Integer.toString(ea.field_a)}, l.field_e, 2);
                    if (var19 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var10_ref_String = w.field_M;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((rl.field_y & 16) != 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (ad.field_h) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ed.field_c.field_vb = bd.field_b.field_x;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    ed.field_c.field_V = ed.field_c.field_V + "<br>" + var10_ref_String;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    ii.field_d.a(var9, 40, dm.field_r.field_K + -var9, (byte) -97, dm.field_r.field_ub + -40);
                    ii.field_d.field_V = te.field_c.toUpperCase();
                    stackIn_18_0 = ii.field_d;
                    stackIn_16_0 = stackIn_18_0;
                    if (!param4) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (km) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    if (-1L != (d.field_Eb ^ -1L)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (km) ((Object) stackIn_17_0);
                    stackIn_19_1 = 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (km) ((Object) stackIn_18_0);
                    stackIn_19_1 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_19_0.field_Y = stackIn_19_1 != 0;
                    var8 = ii.field_d;
                    var10 = 2;
                    if (null != nb.field_q) {
                        statePc = 21;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (ub.field_D == null) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    hk.field_Lb = new boolean[vb.field_h];
                    ub.field_D = new byte[vb.field_h];
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11_int = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var11_int >= vb.field_h) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    hk.field_Lb[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var19 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var10 >= 2) {
                        statePc = 68;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11_int = 0;
                    stackIn_69_0 = 0;
                    stackIn_33_0 = stackIn_69_0;
                    if (var19 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var12 = stackIn_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = nb.field_q.length;
                    stackIn_35_1 = var12;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 <= stackIn_35_1) {
                        statePc = 62;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var26 = nb.field_q[var12];
                    var23 = var26;
                    var20 = var23;
                    var13 = var20;
                    stackIn_63_0 = 0;
                    stackIn_37_0 = stackIn_63_0;
                    if (var19 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var14_int = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var14_int >= var26.length) {
                        statePc = 52;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var15 = var26[var14_int];
                    var16 = var20[var14_int - -1];
                    stackIn_54_0 = 0;
                    stackIn_40_0 = stackIn_54_0;
                    stackIn_54_1 = var15 ^ -1;
                    stackIn_40_1 = stackIn_54_1;
                    if (var19 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 == stackIn_40_1) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((255 & wl.field_d.field_Pb[var15] ^ -1) == (var16 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var19 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (0 != var10) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = wl.field_d.field_vc;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = wl.field_d.field_ic;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var17_int = stackIn_47_0;
                    if ((var17_int ^ -1) == (var16 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var19 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = var26.length ^ -1;
                    stackIn_54_1 = var15 ^ -1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 >= stackIn_54_1) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var16 = var26[var15];
                    stackIn_35_0 = var14_int;
                    stackIn_56_0 = stackIn_35_0;
                    stackIn_35_1 = var16;
                    stackIn_56_1 = stackIn_35_1;
                    if (var19 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 < stackIn_56_1) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var14_int = var16;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    hk.field_Lb[var14_int] = true;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = var11_int;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (stackIn_63_0 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var19 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = hd.field_d ^ -1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 > -3) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (!dc.field_Y[12]) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var10 = 2;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (2 > var10) {
                        statePc = 147;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (rf.field_i != null) {
                        statePc = 78;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (null != gg.field_E) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (null != wm.field_B) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (null != mb.field_db) {
                        statePc = 78;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if ((vb.field_h ^ -1) >= (var16 ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var17_int = wl.field_d.field_Pb[var16] & 255;
                    stackIn_192_0 = null;
                    stackIn_81_0 = stackIn_192_0;
                    if (var19 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 == rf.field_i) {
                        statePc = 86;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (rf.field_i[var16] != null) {
                        statePc = 84;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (!rf.field_i[var16][var17_int]) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var11_int = 1;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (gg.field_E == null) {
                        statePc = 94;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (gg.field_E[var16] != null) {
                        statePc = 89;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var18_int = gg.field_E[var16][var17_int];
                    if (var13_int >= var18_int) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var13_int = var18_int;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (gi.field_a) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var11_int = 1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (mb.field_db == null) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (mb.field_db[var16] != null) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var15 = var15 | mb.field_db[var16][var17_int];
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (wm.field_B == null) {
                        statePc = 106;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (null == wm.field_B[var16]) {
                        statePc = 106;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var18_int = wm.field_B[var16][var17_int];
                    if ((var18_int ^ -1) == -1) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (gi.field_a) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var11_int = 1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if ((var18_int ^ -1) < (var14_int ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var14_int = var18_int;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var16 = 0;
                    var17 = wm.field_r.field_Jb.field_W;
                    var18_ref = (lk) ((Object) var17.a((byte) -72));
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (var18_ref == null) {
                        statePc = 124;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackOut_109_0 = var18_ref.g(0);
                    stackIn_125_0 = stackOut_109_0 ? 1 : 0;
                    stackIn_110_0 = stackOut_109_0;
                    if (var19 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (stackIn_110_0) {
                        statePc = 123;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var11_int == 0) {
                        statePc = 114;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (var18_ref.field_Jb) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var13_int <= var18_ref.field_Vb) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if ((var18_ref.field_Rb ^ -1) <= (var14_int ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (0 < ((var18_ref.field_Fb ^ -1) & var15)) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var12 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var18_ref = (lk) ((Object) var17.a(16213));
                    if (var19 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_125_0 = -3;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (stackIn_125_0 < (hd.field_d ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (dc.field_Y[12]) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var16 = 0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (var16 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (var19 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    ii.field_d.field_Y = false;
                    if (ii.field_d.field_G) {
                        statePc = 133;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if ((vb.field_h ^ -1) >= (var13_int ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = hk.field_Lb[var13_int];
                    stackIn_158_0 = stackOut_135_0 ? 1 : 0;
                    stackIn_136_0 = stackOut_135_0;
                    if (var19 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (!stackIn_136_0) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var24 = "<col=A00000>" + bd.field_a[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var11 = (String) (var11) + ", " + var24;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var11 = var24;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    ii.field_d.field_Y = false;
                    if (!ii.field_d.field_G) {
                        statePc = 146;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (0 == he.field_pc.field_c.field_Hb) {
                        statePc = 145;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    wc.field_g = oi.a(new String[]{mj.field_A}, oe.field_a, 2);
                    if (var19 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    wc.field_g = am.field_a;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (var19 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    ii.field_d.field_Y = false;
                    if (ii.field_d.field_G) {
                        statePc = 149;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if ((vb.field_h ^ -1) >= (var13_int ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = hk.field_Lb[var13_int];
                    stackIn_158_0 = stackOut_151_0 ? 1 : 0;
                    stackIn_152_0 = stackOut_151_0;
                    if (var19 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (!stackIn_152_0) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var25 = "<col=A00000>" + bd.field_a[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var11 = (String) (var11) + ", " + var25;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var11 = var25;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_158_0 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 != var10) {
                        statePc = 162;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var13_ref = lj.field_k;
                    if (var12 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var14 = oi.a(new String[]{(String) (var11)}, dk.field_r, 2);
                    if (var19 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var14 = hd.field_c + (String) (var11);
                    statePc = 165;
                    continue stateLoop;
                }
                case 162: {
                    var13_ref = qa.field_a;
                    if (var12 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var14 = s.field_c + (String) (var11);
                    if (var19 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var14 = oi.a(new String[]{(String) (var11)}, pm.field_i, 2);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    wc.field_g = "<col=A00000>" + var13_ref + "<br>" + var14;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (var19 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var9_ref_String = wl.field_d.field_Qb;
                    qi.field_e.field_V = oi.a(new String[]{var9_ref_String}, ra.field_c, 2).toUpperCase();
                    jk.field_b.a(0, 40, dm.field_r.field_K, (byte) -97, dm.field_r.field_ub + -40);
                    jk.field_b.field_V = oi.a(new String[]{var9_ref_String}, fm.field_c, 2);
                    var8 = jk.field_b;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if ((d.field_Eb ^ -1L) == -1L) {
                        statePc = 173;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var9 = (int)(-hc.a(-9986) + d.field_Eb);
                    var9 = (999 + var9) / 1000;
                    if (-2 < (var9 ^ -1)) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var9 = 1;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    var8.field_V = oi.a(new String[]{Integer.toString(var9)}, va.field_a, 2);
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    qh.field_R.field_V = oi.a(new String[]{Integer.toString(wl.field_d.field_ic), Integer.toString(wl.field_d.field_vc)}, gb.field_M, 2);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    stackIn_178_0 = ao.field_Eb;
                    stackIn_175_0 = stackIn_178_0;
                    if (!param3) {
                        statePc = 178;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    stackIn_178_0 = (km) ((Object) stackIn_175_0);
                    stackIn_176_0 = stackIn_178_0;
                    if (param0) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackIn_178_0 = (km) ((Object) stackIn_176_0);
                    stackIn_177_0 = stackIn_178_0;
                    if (ad.field_h) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    stackIn_179_0 = (km) ((Object) stackIn_177_0);
                    stackIn_179_1 = 1;
                    statePc = 179;
                    continue stateLoop;
                }
                case 178: {
                    stackIn_179_0 = (km) ((Object) stackIn_178_0);
                    stackIn_179_1 = 0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    ((km) (Object) stackIn_179_0).a(stackIn_179_1 != 0, (byte) 94);
                    if (param2 >= 1) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    return;
                }
                case 181: {
                    stackIn_185_0 = dm.field_r;
                    stackIn_182_0 = stackIn_185_0;
                    if (!param3) {
                        statePc = 185;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackIn_185_0 = (km) ((Object) stackIn_182_0);
                    stackIn_183_0 = stackIn_185_0;
                    if (param0) {
                        statePc = 185;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackIn_185_0 = (km) ((Object) stackIn_183_0);
                    stackIn_184_0 = stackIn_185_0;
                    if (ad.field_h) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackIn_186_0 = (km) ((Object) stackIn_184_0);
                    stackIn_186_1 = 1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 185: {
                    stackIn_186_0 = (km) ((Object) stackIn_185_0);
                    stackIn_186_1 = 0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    ((km) (Object) stackIn_186_0).a(stackIn_186_1 != 0, (byte) 123);
                    stackIn_190_0 = pm.field_n;
                    stackIn_187_0 = stackIn_190_0;
                    if (!param3) {
                        statePc = 190;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    stackIn_190_0 = (km) ((Object) stackIn_187_0);
                    stackIn_188_0 = stackIn_190_0;
                    if (param0) {
                        statePc = 190;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    stackIn_190_0 = (km) ((Object) stackIn_188_0);
                    stackIn_189_0 = stackIn_190_0;
                    if (!ad.field_h) {
                        statePc = 190;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackIn_191_0 = (km) ((Object) stackIn_189_0);
                    stackIn_191_1 = 1;
                    statePc = 191;
                    continue stateLoop;
                }
                case 190: {
                    stackIn_191_0 = (km) ((Object) stackIn_190_0);
                    stackIn_191_1 = 0;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    ((km) (Object) stackIn_191_0).a(stackIn_191_1 != 0, (byte) 122);
                    he.field_pc.field_c.g(0);
                    stackIn_192_0 = null;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (stackIn_192_0 == wl.field_d) {
                        statePc = 206;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if ((fb.field_o.field_nb ^ -1) != -1) {
                        statePc = 195;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 195: {
                    nn.a(wl.field_d.e((byte) -124), param1, (byte) -128);
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if ((ii.field_d.field_nb ^ -1) == -1) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    ah.field_c = true;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if ((ed.field_c.field_nb ^ -1) != -1) {
                        statePc = 200;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 200: {
                    ad.field_h = true;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (0 == na.field_Ib.field_nb) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    ad.field_h = false;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    co.a(param1, false, -2137400888, wl.field_d);
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(wb param0, byte param1) {
        try {
            if (!(null == param0.field_k)) {
                param0.c(78);
            }
            param0.field_k = this.field_c.field_k;
            if (param1 < 87) {
                wb var4 = (wb) null;
                this.a((wb) null, (byte) 78);
            }
            param0.field_h = this.field_c;
            param0.field_k.field_h = param0;
            param0.field_h.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "qk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 2) {
            field_b = -102;
        }
        field_d = null;
    }

    final static void b(byte param0) {
        String var2 = null;
        if (param0 != 59) {
            return;
        }
        if (null != cf.field_b) {
            var2 = cf.field_b;
            String var1 = var2;
            on.a((byte) 106, oi.a(new String[]{var2}, sa.field_o, 2));
            cf.field_b = null;
        }
    }

    final int b(int param0) {
        int var2;
        wb var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        var2 = param0;
        var3 = this.field_c.field_h;
        L0: while (true) {
          L1: {
            if (this.field_c == var3) {
              break L1;
            } else {
              var3 = var3.field_h;
              var2++;
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
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
                        kb.a(var1, 16865);
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        qk.a(true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fk.a();
                        df.c();
                        kf.field_e = 0;
                        cm.a(11);
                        var2 = var1.d();
                        var3 = 0;
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
                        if (var3 >= 15) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2.d(-2, -2, 16777215);
                        df.d(4, 4, 0, 0, 540, 140);
                        var3++;
                        if (var4 != 0) {
                            statePc = 11;
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
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        cc.field_u.b();
                        var1.e(0, 0);
                        ai.a(true);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw kg.a((Throwable) ((Object) runtimeException), "qk.D(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final wb a(byte param0) {
        wb var2 = this.field_c.field_h;
        if (param0 != -103) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            qk.a((String) null, (java.applet.Applet) null, -78);
        }
        if (this.field_c == var2) {
            return null;
        }
        var2.c(26);
        return var2;
    }

    final wb a(int param0) {
        wb var2 = this.field_a;
        if (this.field_c == var2) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_h;
        if (param0 != 26605) {
            this.field_a = (wb) null;
        }
        return var2;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                jj.field_g = param0;
                try {
                    var3 = param1.getParameter("cookieprefix");
                    var4 = param1.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!((param0.length() ^ -1) != param2)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    q.a("document.cookie=\"" + var5 + "\"", -17107, param1);
                } catch (Throwable throwable) {
                }
                wf.a(param1, 49);
            } catch (RuntimeException runtimeException) {
                throw kg.a((Throwable) ((Object) runtimeException), "qk.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public qk() {
        this.field_c = new wb();
        this.field_c.field_h = this.field_c;
        this.field_c.field_k = this.field_c;
    }

    static {
        field_b = 64;
        field_d = new String[]{"The Easy One", "Perfect Jump", "Virogrid Expert", "Total domination", "Winning streak", "You lose", "Entrapment", "Bunny Hopping", "Virogrid Addict", "Ghost Spotter"};
    }
}
