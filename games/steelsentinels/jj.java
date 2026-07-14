/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static String field_j;
    static String[] field_h;
    static wk field_e;
    static int field_i;
    static int field_c;
    static int field_d;
    static gh field_a;
    int field_g;
    static String field_f;
    static wk[] field_k;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != -1) {
            field_e = null;
        }
        return gb.field_c.b(64);
    }

    final static String a(boolean param0) {
        if (!(cb.field_j != nj.field_ab)) {
            return bk.field_ab;
        }
        if (nj.field_ab == jn.field_b) {
            return kh.field_z;
        }
        if (!gf.field_a.a((byte) -72)) {
            return kh.field_z;
        }
        if (!param0) {
            field_e = null;
        }
        return cc.field_Xb;
    }

    final static int a(int param0, int param1, String param2, boolean param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_41_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_52_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = SteelSentinels.field_G;
                        if (param0 <= -98) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_d = -13;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != rb.field_h) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if (!rc.a(127, param4)) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return -1;
                    }
                    case 6: {
                        if (lj.field_d == rn.field_v) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (param4) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ic.field_T = ak.a(param2, param5, -20407, false);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 10: {
                        var10 = null;
                        ic.field_T = qi.a(false, li.field_w, param5, 0, (String) null);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        mm.field_g.field_p = 0;
                        mm.field_g.a((byte) 115, 14);
                        mm.field_g.a((byte) 109, ic.field_T.a((byte) 121).field_e);
                        gj.a(0, -1);
                        rn.field_v = f.field_D;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (rn.field_v == f.field_D) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (ve.a((byte) -127, 1)) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var6 = rf.field_d.f((byte) -55);
                        rf.field_d.field_p = 0;
                        if (var6 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        jg.field_f = -1;
                        rn.field_v = mn.field_G;
                        ch.field_N = var6;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        rn.field_v = od.field_d;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (rn.field_v == od.field_d) {
                            statePc = 21;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (!ve.a((byte) -108, 8)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        oa.field_G = rf.field_d.g((byte) -115);
                        rf.field_d.field_p = 0;
                        bc.a(param4, 2, param3, ic.field_T, param1);
                        rn.field_v = uf.field_g;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (rn.field_v == uf.field_g) {
                            statePc = 25;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (ve.a((byte) -86, 1)) {
                            statePc = 27;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        var6 = rf.field_d.f((byte) -68);
                        rf.field_d.field_p = 0;
                        on.field_k = null;
                        ch.field_N = var6;
                        if (0 == var6) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (1 == var6) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (-9 != (var6 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        pm.m(-123);
                        ui.field_T = false;
                        return var6;
                    }
                    case 31: {
                        jg.field_f = -1;
                        rn.field_v = mn.field_G;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        jg.field_f = -1;
                        rn.field_v = wl.field_N;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (wl.field_N != rn.field_v) {
                            statePc = 83;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!pm.n(121)) {
                            statePc = 83;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        li.field_w = rf.field_d.g((byte) -101);
                        gj.field_b = param5;
                        ul.field_d = rf.field_d.f((byte) -65);
                        di.field_h = rf.field_d.f((byte) -54);
                        rd.field_b = rf.field_d.c((byte) -60);
                        var6_ref = rf.field_d.g(-122);
                        var7 = rf.field_d.f((byte) -128);
                        if (0 != (1 & var7)) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        ed.b((byte) -105);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if ((16 & var7) == -1) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        kj.field_B = stackIn_41_0 != 0;
                        if (!param4) {
                            statePc = 43;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (-1 == (8 & var7)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        fj.field_e = stackIn_46_0 != 0;
                        if (0 == (2 & var7)) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        stackOut_47_0 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 48: {
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        uc.field_g = stackIn_49_0 != 0;
                        if (0 == (4 & var7)) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        stackOut_50_0 = 1;
                        stackIn_52_0 = stackOut_50_0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 51: {
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        ok.field_g = stackIn_52_0 != 0;
                        if (fj.field_e) {
                            statePc = 54;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        uc.field_g = true;
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (cd.field_a) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        int discarded$10 = rf.field_d.f((byte) -118);
                        int discarded$11 = rf.field_d.f((byte) -83);
                        int discarded$12 = rf.field_d.i(0);
                        ag.field_q = rf.field_d.c((byte) -60);
                        nj.field_Y = new byte[ag.field_q];
                        var8 = 0;
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        if (var8 >= ag.field_q) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        nj.field_Y[var8] = rf.field_d.d((byte) -2);
                        var8++;
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 60: {
                        g.field_l = rf.field_d.h(1);
                        var11 = (CharSequence) (Object) g.field_l;
                        ng.field_r = ui.a(1, var11);
                        ua.field_o = rf.field_d.f((byte) -106);
                        rn.field_v = jd.field_sb;
                        if (ic.field_T.a((byte) 69) == nk.field_F) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        if (ic.field_T.a((byte) 108) == ol.field_Sb) {
                            statePc = 63;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        mj.field_Vb.a(-70, wl.d((byte) -21));
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 64: {
                        qd.field_o.a(-48, wl.d((byte) -21));
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        ui.field_T = false;
                        if (var6_ref == null) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        ri.a(var6_ref, wl.d((byte) -21), 124);
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (0 < rd.field_b) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        if (!ok.field_g) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        try {
                            Object discarded$13 = hn.a("zap", (byte) -41, wl.d((byte) -21), new Object[1]);
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        var8_ref_Throwable = caughtException;
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 73: {
                        try {
                            Object discarded$14 = hn.a(wl.d((byte) -21), (byte) -96, "unzap");
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        var8_ref_Throwable = caughtException;
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 76: {
                        if (0 < rd.field_b) {
                            statePc = 78;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        ki.field_ib = true;
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        mm.field_g.a(-1833430685, dj.field_k);
                        var8 = 0;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        if (4 <= var8) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        dj.field_k[var8] = dj.field_k[var8] + 50;
                        var8++;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 82: {
                        rf.field_d.a(-1833430685, dj.field_k);
                        return ch.field_N;
                    }
                    case 83: {
                        if (mn.field_G == rn.field_v) {
                            statePc = 85;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (!pm.n(110)) {
                            statePc = 93;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        pm.m(100);
                        if (ch.field_N != 7) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        if (!ui.field_T) {
                            statePc = 92;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if ((ch.field_N ^ -1) != -8) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        ch.field_N = 3;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        di.field_e = rf.field_d.h(1);
                        ui.field_T = false;
                        return ch.field_N;
                    }
                    case 92: {
                        ui.field_T = true;
                        return -1;
                    }
                    case 93: {
                        if (null != rb.field_h) {
                            statePc = 100;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        if (!ui.field_T) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        if (30000L >= ki.l(150)) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 96: {
                        di.field_e = kj.field_E;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 97: {
                        di.field_e = bc.field_mb;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 98: {
                        ui.field_T = false;
                        return 3;
                    }
                    case 99: {
                        var6 = ll.field_l;
                        ll.field_l = fe.field_F;
                        ui.field_T = true;
                        fe.field_F = var6;
                        statePc = 100;
                        continue stateLoop;
                    }
                    case 100: {
                        return -1;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_e = null;
        field_j = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (param0 > -116) {
            field_k = null;
        }
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"HEALTH", "<%0> kPm", "SHIELDS", "<%0> GJ", "ENERGY CAPACITY", "<%0> TJ", "ENERGY GENERATION", "<%0> GJ/s", "JUMP", "<%0>%", "THRUST", "<%0>%"};
        field_c = -1;
        field_j = "<%0> has entered another game.";
        field_e = new wk(28, 28);
        field_f = "Waiting for <%0> to start the game...";
        field_b = "You have been removed from <%0>'s game.";
    }
}
