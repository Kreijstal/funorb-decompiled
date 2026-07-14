/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends kn {
    static ci field_N;
    static int field_S;
    static long field_U;
    static int field_R;
    static ed field_T;
    static fm field_V;
    static int field_O;
    static String field_Q;
    static boolean field_P;

    public static void i(int param0) {
        field_V = null;
        field_Q = null;
        field_T = null;
        field_N = null;
        if (param0 != 5849) {
            Object var2 = null;
            int discarded$0 = ji.a(-34, true, (String) null, (String) null, (byte) -54, true);
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4 ^ param4, param5);
        kb var7 = vj.field_a;
        if (var7 != null) {
            if (((ji) this).a(param0, param5, param2, (byte) -117, param3)) {
                if (!(((ji) this).field_p instanceof cj)) {
                    // ifeq L119
                    ((cj) (Object) var7.field_p).a(var7, -10925, (ji) this);
                    vj.field_a = null;
                } else {
                    ((cj) (Object) ((ji) this).field_p).a(var7, -10925, (ji) this);
                    vj.field_a = null;
                }
            }
        }
    }

    final static String a(String param0, String param1, String param2, um param3, byte param4) {
        if (param4 < 15) {
            Object var6 = null;
            int discarded$0 = ji.a(74, true, (String) null, (String) null, (byte) 108, true);
        }
        if (!(param3.c((byte) 125))) {
            return param0;
        }
        return param2 + " - " + param3.c(param1, 0) + "%";
    }

    final static int a(int param0, boolean param1, String param2, String param3, byte param4, boolean param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            String var7_ref = null;
            int var8 = 0;
            Throwable var9_ref_Throwable = null;
            int var9 = 0;
            int var10 = 0;
            Object var11 = null;
            CharSequence var12 = null;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_52_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = Chess.field_G;
                        var6 = -87 % ((20 - param4) / 61);
                        if (null == lj.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!gd.a((byte) 68, param1)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return -1;
                    }
                    case 5: {
                        if (tb.field_f == ca.field_h) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (!param1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = null;
                        eh.field_K = l.a(false, param2, (byte) 118, (String) null, sj.field_i);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        eh.field_K = nk.a(false, param2, param3, true);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        qn.field_U.field_l = 0;
                        qn.field_U.c(14, (byte) 61);
                        qn.field_U.c(eh.field_K.b((byte) 70).field_c, (byte) -73);
                        vh.a(-1, (byte) 83);
                        tb.field_f = rm.field_J;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (rm.field_J != tb.field_f) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (!tk.a(5, 1)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var7 = tk.field_h.i(-89);
                        tk.field_h.field_l = 0;
                        if (0 == var7) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        tb.field_f = qd.field_m;
                        wg.field_B = var7;
                        sb.field_sb = -1;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        tb.field_f = tg.field_d;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (tb.field_f != tg.field_d) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (tk.a(120, 8)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        sj.field_h = tk.field_h.d((byte) 116);
                        tk.field_h.field_l = 0;
                        pj.a(param5, -27359, param1, param0, eh.field_K);
                        tb.field_f = dl.field_j;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (tb.field_f != dl.field_j) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (!tk.a(81, 1)) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var7 = tk.field_h.i(-106);
                        wg.field_B = var7;
                        tk.field_h.field_l = 0;
                        lf.field_N = null;
                        if (var7 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if ((var7 ^ -1) != -2) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        sb.field_sb = -1;
                        tb.field_f = gi.field_d;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 26: {
                        if (8 == var7) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        sb.field_sb = -1;
                        tb.field_f = qd.field_m;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        si.d(65280);
                        ja.field_f = false;
                        return var7;
                    }
                    case 29: {
                        if (tb.field_f == gi.field_d) {
                            statePc = 31;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (jl.a(false)) {
                            statePc = 33;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        sj.field_i = tk.field_h.d((byte) 123);
                        gi.field_g = param2;
                        sk.field_t = tk.field_h.i(-79);
                        sb.field_rb = tk.field_h.i(-113);
                        cl.field_d = tk.field_h.f(674914976);
                        var7_ref = tk.field_h.b(true);
                        var8 = tk.field_h.i(-91);
                        if ((1 & var8) == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        bh.f((byte) -74);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (!param1) {
                            statePc = 37;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if ((8 & var8) == 0) {
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
                        qf.field_b = stackIn_40_0 != 0;
                        if (-1 == (var8 & 4 ^ -1)) {
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
                        j.field_u = stackIn_43_0 != 0;
                        if (0 == (var8 & 2)) {
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
                        kh.field_o = stackIn_46_0 != 0;
                        if (qf.field_b) {
                            statePc = 48;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        kh.field_o = true;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if ((16 & var8) == 0) {
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
                        ej.field_f = stackIn_52_0 != 0;
                        if (!on.field_a) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        int discarded$10 = tk.field_h.i(-87);
                        int discarded$11 = tk.field_h.i(-86);
                        int discarded$12 = tk.field_h.e((byte) -106);
                        si.field_n = tk.field_h.f(674914976);
                        jn.field_P = new byte[si.field_n];
                        var9 = 0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (si.field_n <= var9) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        jn.field_P[var9] = tk.field_h.g(0);
                        var9++;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 56: {
                        ci.field_J = tk.field_h.d(0);
                        var12 = (CharSequence) (Object) ci.field_J;
                        cc.field_A = ad.a(var12, -2);
                        gm.field_d = tk.field_h.i(-114);
                        tb.field_f = ik.field_e;
                        if (eh.field_K.b((byte) 31) == ec.field_i) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        if (eh.field_K.b((byte) 68) != kn.field_H) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        le.field_g.a(25799, bh.i(81));
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        ph.field_g.a(25799, bh.i(81));
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        ja.field_f = false;
                        if (var7_ref != null) {
                            statePc = 62;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        aa.a(bh.i(81), -1, var7_ref);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (cl.field_d > 0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        if (j.field_u) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        try {
                            Object discarded$13 = u.a(true, "unzap", bh.i(81));
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        var9_ref_Throwable = caughtException;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 69: {
                        try {
                            Object discarded$14 = u.a(bh.i(81), true, new Object[1], "zap");
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        var9_ref_Throwable = caughtException;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (-1 > (cl.field_d ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        ln.field_Kb = true;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        qn.field_U.a(ol.field_S, (byte) -92);
                        var9 = 0;
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 76: {
                        if ((var9 ^ -1) <= -5) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        ol.field_S[var9] = ol.field_S[var9] + 50;
                        var9++;
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 78: {
                        tk.field_h.a(ol.field_S, (byte) -92);
                        return wg.field_B;
                    }
                    case 79: {
                        if (qd.field_m == tb.field_f) {
                            statePc = 81;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (jl.a(false)) {
                            statePc = 83;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        si.d(65280);
                        if (-8 != (wg.field_B ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        if (!ja.field_f) {
                            statePc = 89;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        if (wg.field_B != 7) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        wg.field_B = 3;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        n.field_c = tk.field_h.d(0);
                        ja.field_f = false;
                        return wg.field_B;
                    }
                    case 89: {
                        ja.field_f = true;
                        return -1;
                    }
                    case 90: {
                        if (lj.field_a == null) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (ja.field_f) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        var7 = qh.field_a;
                        qh.field_a = bk.field_n;
                        bk.field_n = var7;
                        ja.field_f = true;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 94: {
                        if (ea.i((byte) 17) > 30000L) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        n.field_c = li.field_b;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 96: {
                        n.field_c = nc.field_Q;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 97: {
                        ja.field_f = false;
                        return 3;
                    }
                    case 98: {
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

    private ji(int param0, int param1, int param2, int param3, jm param4, rg param5, mf param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ji) this).field_M = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 0;
        field_U = 20000000L;
        field_R = 20;
        field_O = 2;
        field_T = new ed();
        field_Q = "Names cannot contain consecutive spaces";
    }
}
