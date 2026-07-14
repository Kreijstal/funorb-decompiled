/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static ed field_b;
    static String field_a;
    static int field_d;
    static String field_c;
    static ed field_f;
    static String[] field_e;

    final static int a(int param0, int param1, String param2, String param3, boolean param4, boolean param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            CharSequence var11 = null;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = EscapeVector.field_A;
                        if (null == pg.field_c) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (sl.a(param4, (byte) 0)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (param0 == 1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 2;
                    }
                    case 6: {
                        if (sf.field_d == al.field_d) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (!param4) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        f.field_m = ei.a(param0 + -1, false, mg.field_d, (String) null, param2);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 10: {
                        f.field_m = bo.a(param3, false, 24564, param2);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        om.field_c.field_m = 0;
                        om.field_c.f(14, -123);
                        om.field_c.f(f.field_m.a((byte) 32).field_d, -123);
                        rn.a(-1, 30785);
                        al.field_d = tc.field_p;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (al.field_d != tc.field_p) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (bo.a(30000, 1)) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var6 = om.field_g.e(0);
                        om.field_g.field_m = 0;
                        if (0 == var6) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        al.field_d = hn.field_q;
                        cd.field_v = var6;
                        hi.field_r = -1;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        al.field_d = ha.field_c;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (al.field_d == ha.field_c) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (bo.a(30000, 8)) {
                            statePc = 22;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        va.field_b = om.field_g.i(param0 + -800509814);
                        om.field_g.field_m = 0;
                        oh.a(f.field_m, param4, param1, param5, (byte) -99);
                        al.field_d = mc.field_b;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (mc.field_b == al.field_d) {
                            statePc = 25;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (bo.a(30000, 1)) {
                            statePc = 27;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        var6 = om.field_g.e(0);
                        cd.field_v = var6;
                        p.field_i = null;
                        om.field_g.field_m = 0;
                        if (0 == var6) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (var6 != 1) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        al.field_d = rn.field_c;
                        hi.field_r = -1;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 31: {
                        if (8 != var6) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        nm.a(16);
                        e.field_c = false;
                        return var6;
                    }
                    case 33: {
                        al.field_d = hn.field_q;
                        hi.field_r = -1;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (al.field_d == rn.field_c) {
                            statePc = 36;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (ll.d(param0 + 10549)) {
                            statePc = 38;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        mg.field_d = om.field_g.i(-800509813);
                        mg.field_b = om.field_g.e(0);
                        int discarded$12 = om.field_g.e(0);
                        s.field_x = om.field_g.f(1952);
                        var6_ref = om.field_g.d(-15208);
                        var7 = om.field_g.e(0);
                        if ((1 & var7) == 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        lm.a((byte) -63);
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (param4) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        if ((8 & var7) == 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        dl.field_a = stackIn_44_0 != 0;
                        if (-1 == (4 & var7 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        ff.field_g = stackIn_47_0 != 0;
                        if (dl.field_a) {
                            statePc = 48;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        if (jc.field_b) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        int discarded$13 = om.field_g.e(param0 ^ 1);
                        int discarded$14 = om.field_g.e(0);
                        int discarded$15 = om.field_g.g(param0 + -5054);
                        kb.field_e = om.field_g.f(1952);
                        lf.field_K = new byte[kb.field_e];
                        var8 = 0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (var8 >= kb.field_e) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        lf.field_K[var8] = om.field_g.a(false);
                        var8++;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 53: {
                        ck.field_r = om.field_g.c(false);
                        var11 = (CharSequence) (Object) ck.field_r;
                        cc.field_k = sf.a(-83, var11);
                        am.field_g = om.field_g.e(param0 + -1);
                        al.field_d = ck.field_t;
                        if (f.field_m.a((byte) 32) == md.field_E) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        if (f.field_m.a((byte) 32) == ja.field_a) {
                            statePc = 56;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        oh.field_n.a(27002, oc.d((byte) -71));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        kf.field_q.a(27002, oc.d((byte) -114));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        e.field_c = false;
                        if (var6_ref != null) {
                            statePc = 60;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        ag.a(var6_ref, (byte) 30, oc.d((byte) -119));
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (s.field_x > 0) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        if (ff.field_g) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$16 = sd.a(oc.d((byte) -107), "unzap", param0 + -29156);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var8_ref_Throwable = caughtException;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 67: {
                        try {
                            Object discarded$17 = sd.a((byte) 116, oc.d((byte) -128), new Object[1], "zap");
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        var8_ref_Throwable = caughtException;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (s.field_x < -1) {
                            statePc = 72;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        ej.field_d = true;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        om.field_c.a(rh.field_O, (byte) 107);
                        var8 = 0;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        if (-5 <= var8) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        rh.field_O[var8] = rh.field_O[var8] + 50;
                        var8++;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 76: {
                        om.field_g.a(rh.field_O, (byte) 85);
                        return cd.field_v;
                    }
                    case 77: {
                        if (hn.field_q != al.field_d) {
                            statePc = 87;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        if (ll.d(param0 + 10549)) {
                            statePc = 80;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        nm.a(16);
                        if ((cd.field_v ^ -1) != -8) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (e.field_c) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        e.field_c = true;
                        return -1;
                    }
                    case 83: {
                        if ((cd.field_v ^ -1) == -8) {
                            statePc = 85;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        cd.field_v = 3;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        ca.field_a = om.field_g.c(false);
                        e.field_c = false;
                        return cd.field_v;
                    }
                    case 87: {
                        if (null == pg.field_c) {
                            statePc = 89;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (e.field_c) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        var6 = ej.field_b;
                        ej.field_b = sj.field_i;
                        e.field_c = true;
                        sj.field_i = var6;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 91: {
                        if (un.e(64655) > 30000L) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        ca.field_a = wk.field_a;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 93: {
                        ca.field_a = fl.field_l;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
                        e.field_c = false;
                        return 3;
                    }
                    case 95: {
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

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_f = null;
        if (!param0) {
            field_e = null;
        }
        field_e = null;
        field_c = null;
    }

    final static mf a(int param0, int param1) {
        if (param1 >= -122) {
            boolean discarded$0 = mj.a((byte) 58);
        }
        return ji.a(false, param0, false, 1, true, (byte) 114);
    }

    final static boolean a(byte param0) {
        if (param0 < 54) {
            Object var2 = null;
            int discarded$0 = mj.a(100, -96, (String) null, (String) null, false, true);
        }
        return tb.field_D;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ed(320, 24);
        field_a = "Unfortunately you are not eligible to create an account.";
        field_c = " - thrust";
    }
}
