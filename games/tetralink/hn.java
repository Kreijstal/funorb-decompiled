/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends gn implements uc {
    static i field_M;
    private qh field_L;
    static hl field_P;
    static boolean field_K;
    static rb field_Q;
    static oh[] field_O;
    static String field_N;

    void a(int param0, qh param1) {
        ((hn) this).field_L = param1;
        ((hn) this).field_L.field_m = (hn) this;
        if (param0 != 45) {
            field_N = null;
        }
    }

    abstract int g(byte param0);

    abstract int a(boolean param0);

    abstract boolean h(int param0);

    final static int a(byte param0, int param1, int param2) {
        int var4 = TetraLink.field_J;
        if (param0 != -74) {
            field_K = true;
        }
        int var3 = 0;
        while ((param1 ^ -1) < -1) {
            var3 = var3 << -2062465151 | 1 & param2;
            param1--;
            param2 = param2 >>> 1;
        }
        return var3;
    }

    public static void e(byte param0) {
        field_P = null;
        field_O = null;
        field_M = null;
        int var1 = 18 % ((param0 - -29) / 58);
        field_Q = null;
        field_N = null;
    }

    final static int a(boolean param0, String param1, bh param2) {
        if (param0) {
            Object var5 = null;
            int discarded$0 = hn.a(false, (String) null, -28, true, -123, (String) null);
        }
        int var3 = param2.field_t;
        CharSequence var6 = (CharSequence) (Object) param1;
        byte[] var4 = q.a(65, var6);
        param2.b(var4.length, (byte) -93);
        param2.field_t = param2.field_t + ck.field_Z.a(0, param2.field_t, var4, var4.length, param2.field_u, 28677);
        return -var3 + param2.field_t;
    }

    public final vm a(int param0) {
        if (param0 > -100) {
            boolean discarded$0 = ((hn) this).h(-117);
        }
        return (vm) (Object) ((hn) this).field_L;
    }

    hn(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_37_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_49_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_36_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = TetraLink.field_J;
                        if (null != wa.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (om.a(param3, (byte) -70)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return -1;
                    }
                    case 3: {
                        if (qi.field_p != bc.field_z) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (param3) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        c.field_a = sk.a((byte) -79, param5, false, param1);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 6: {
                        var10 = null;
                        c.field_a = ug.a(ua.field_g, (String) null, false, param1, -6336);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        nd.field_Lb.field_t = 0;
                        nd.field_Lb.a(14, false);
                        nd.field_Lb.a(c.field_a.a((byte) -95).field_d, false);
                        ak.a((byte) -116, -1);
                        qi.field_p = qi.field_u;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (qi.field_p != qi.field_u) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        if (!en.b(109, 1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var6 = kb.field_q.d((byte) -99);
                        kb.field_q.field_t = 0;
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        rl.field_d = -1;
                        qi.field_p = mk.field_a;
                        ua.field_c = var6;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 12: {
                        qi.field_p = eh.field_v;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (qi.field_p == eh.field_v) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (en.b(110, 8)) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        ca.field_g = kb.field_q.c(255);
                        kb.field_q.field_t = 0;
                        ng.a((byte) -34, param4, param3, c.field_a, param0);
                        qi.field_p = vb.field_l;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (qi.field_p == vb.field_l) {
                            statePc = 20;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (!en.b(param2 ^ -2513, 1)) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var6 = kb.field_q.d((byte) -99);
                        ua.field_c = var6;
                        kb.field_q.field_t = 0;
                        cl.field_b = null;
                        if (var6 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (var6 == 1) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        rl.field_d = -1;
                        qi.field_p = mk.field_a;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 25: {
                        mk.a(false);
                        vb.field_j = false;
                        return var6;
                    }
                    case 26: {
                        rl.field_d = -1;
                        qi.field_p = sa.field_f;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        if (sa.field_f != qi.field_p) {
                            statePc = 76;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (ua.b(46)) {
                            statePc = 30;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        ua.field_g = kb.field_q.c(255);
                        fd.field_J = param1;
                        dd.field_c = kb.field_q.d((byte) -99);
                        mb.field_z = kb.field_q.d((byte) -99);
                        mb.field_C = kb.field_q.e(param2 + 2599);
                        var6_ref = kb.field_q.i(-53);
                        var7 = kb.field_q.d((byte) -99);
                        if ((var7 & 1) != -1) {
                            statePc = 32;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        qj.b((byte) 115);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (param3) {
                            statePc = 46;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (-1 == (var7 & 4)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 36: {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        dh.field_o = stackIn_37_0 != 0;
                        if (0 == (var7 & 8)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        cd.field_a = stackIn_40_0 != 0;
                        if ((2 & var7) == 0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        fn.field_K = stackIn_43_0 != 0;
                        if (cd.field_a) {
                            statePc = 45;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        fn.field_K = true;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if ((16 & var7) == 0) {
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
                        ef.field_n = stackIn_49_0 != 0;
                        if (mc.field_k) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        int discarded$10 = kb.field_q.d((byte) -99);
                        int discarded$11 = kb.field_q.d((byte) -99);
                        int discarded$12 = kb.field_q.f(-117);
                        bf.field_n = kb.field_q.e(127);
                        ua.field_a = new byte[bf.field_n];
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (bf.field_n <= var8) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        ua.field_a[var8] = kb.field_q.g(oj.a(param2, 1772090971));
                        var8++;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 54: {
                        ph.field_w = kb.field_q.g((byte) 81);
                        var11 = (CharSequence) (Object) ph.field_w;
                        ik.field_f = cc.a(var11, (byte) 119);
                        pg.field_a = kb.field_q.d((byte) -99);
                        qi.field_p = li.field_a;
                        if (c.field_a.a((byte) -106) == t.field_h) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (c.field_a.a((byte) -85) != qf.field_h) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        lc.field_j.a((byte) -90, lk.q(13));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        lh.field_s.a((byte) -86, lk.q(13));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        vb.field_j = false;
                        if (var6_ref != null) {
                            statePc = 60;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        qi.a(var6_ref, -7011, lk.q(13));
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (0 < mb.field_C) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        if (dh.field_o) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$13 = ii.a((byte) 81, "unzap", lk.q(13));
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
                            Object discarded$14 = ii.a(new Object[1], 6760, "zap", lk.q(param2 + 2485));
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
                        if (mb.field_C <= 0) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        pg.field_m = true;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        nd.field_Lb.a(ai.field_e, (byte) 33);
                        var8 = 0;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        if (var8 >= 4) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        ai.field_e[var8] = ai.field_e[var8] + 50;
                        var8++;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 75: {
                        kb.field_q.a(ai.field_e, (byte) 33);
                        return ua.field_c;
                    }
                    case 76: {
                        if (qi.field_p != mk.field_a) {
                            statePc = 86;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if (ua.b(param2 + 2515)) {
                            statePc = 79;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        mk.a(false);
                        if (-8 != (ua.field_c ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        if (!vb.field_j) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (7 != ua.field_c) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        ua.field_c = 3;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 84: {
                        tg.field_d = kb.field_q.g((byte) 81);
                        vb.field_j = false;
                        return ua.field_c;
                    }
                    case 85: {
                        vb.field_j = true;
                        return -1;
                    }
                    case 86: {
                        if (param2 == -2472) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        return 123;
                    }
                    case 88: {
                        if (null != wa.field_e) {
                            statePc = 95;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (vb.field_j) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        var6 = ko.field_t;
                        ko.field_t = oi.field_m;
                        vb.field_j = true;
                        oi.field_m = var6;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 91: {
                        if ((ib.a((byte) 127) ^ -1L) >= -30001L) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        tg.field_d = wc.field_G;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 93: {
                        tg.field_d = ja.field_d;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
                        vb.field_j = false;
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

    abstract int f(byte param0);

    final static void a(boolean param0, String param1, int param2, boolean param3) {
        if (param2 < 21) {
            Object var5 = null;
            int discarded$0 = hn.a(false, (String) null, 8, true, 77, (String) null);
        }
        dd.b(-123);
        mf.field_s.i(0);
        ao.field_c = new tl(mk.field_d, (String) null, qa.field_v, param0, param3);
        mm.field_u = new sd(mf.field_s, (na) (Object) ao.field_c);
        mf.field_s.a((na) (Object) mm.field_u, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = null;
        field_N = "Type your age in years";
    }
}
