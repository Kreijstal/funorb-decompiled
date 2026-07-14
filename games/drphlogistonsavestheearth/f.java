/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends gi {
    boolean field_l;
    int field_j;
    static String field_m;
    static volatile int field_h;
    int[] field_k;
    static nh[] field_i;

    public static void d(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            int discarded$0 = f.a(11, -55, true, (String) null, (String) null, false);
        }
        field_m = null;
        field_i = null;
    }

    final static int a(int param0, int param1, boolean param2, String param3, String param4, boolean param5) {
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
            Throwable decompiledCaughtException = null;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        if (uj.field_j != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (ek.a(true, param2)) {
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
                        var6 = -105 % ((param1 - 4) / 34);
                        if (hh.field_b == tl.field_O) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (param2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        dl.field_H = wi.a(param4, 7957, false, param3);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = null;
                        dl.field_H = tc.a(ld.field_b, param3, (String) null, 0, false);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        nj.field_p.field_j = 0;
                        nj.field_p.c(14, (byte) -107);
                        nj.field_p.c(dl.field_H.b((byte) -98).field_c, (byte) -115);
                        qj.a(-1, 14656);
                        tl.field_O = i.field_b;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (i.field_b != tl.field_O) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (jd.a(1, 5929)) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var7 = dh.field_N.l(31760);
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        t.field_b = var7;
                        gf.field_C = -1;
                        tl.field_O = tf.field_qb;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        tl.field_O = bd.field_T;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        dh.field_N.field_j = 0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (tl.field_O != bd.field_T) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (jd.a(8, 5929)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        s.field_c = dh.field_N.a((byte) -53);
                        dh.field_N.field_j = 0;
                        le.a(dl.field_H, param5, param0, param2, 16);
                        tl.field_O = uf.field_c;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (tl.field_O != uf.field_c) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (jd.a(1, 5929)) {
                            statePc = 23;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var7 = dh.field_N.l(31760);
                        dh.field_N.field_j = 0;
                        cj.field_i = null;
                        t.field_b = var7;
                        if (0 == var7) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if ((var7 ^ -1) != -2) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        tl.field_O = sg.field_d;
                        gf.field_C = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 27: {
                        if ((var7 ^ -1) != -9) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        eg.a((byte) 126);
                        dk.field_b = false;
                        return var7;
                    }
                    case 29: {
                        tl.field_O = tf.field_qb;
                        gf.field_C = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (sg.field_d == tl.field_O) {
                            statePc = 32;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (!li.d(-29427)) {
                            statePc = 72;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        ld.field_b = dh.field_N.a((byte) -53);
                        nj.field_j = dh.field_N.l(31760);
                        int discarded$12 = dh.field_N.l(31760);
                        hb.field_g = dh.field_N.j(-788751192);
                        var7_ref = dh.field_N.i(715718304);
                        var8 = dh.field_N.l(31760);
                        if ((1 & var8) == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        cd.a(4);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (!param2) {
                            statePc = 37;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (0 == (8 & var8)) {
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
                        fl.field_i = stackIn_40_0 != 0;
                        if (0 == (var8 & 4)) {
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
                        ka.field_r = stackIn_43_0 != 0;
                        if (!fl.field_i) {
                            statePc = 44;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        if (wg.field_d) {
                            statePc = 46;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        int discarded$13 = dh.field_N.l(31760);
                        int discarded$14 = dh.field_N.l(31760);
                        int discarded$15 = dh.field_N.h(-108);
                        ka.field_n = dh.field_N.j(-788751192);
                        cf.field_b = new byte[ka.field_n];
                        var9 = 0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (var9 >= ka.field_n) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        cf.field_b[var9] = dh.field_N.n(-82);
                        var9++;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 49: {
                        oa.field_d = dh.field_N.b((byte) -64);
                        var12 = (CharSequence) (Object) oa.field_d;
                        tf.field_pb = rh.a(117, var12);
                        rh.field_a = dh.field_N.l(31760);
                        tl.field_O = ik.field_d;
                        if (dl.field_H.b((byte) -98) == ll.field_p) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        if (dl.field_H.b((byte) -98) == si.field_A) {
                            statePc = 52;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        ka.field_q.a(nb.a(124), (byte) -50);
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        p.field_d.a(nb.a(108), (byte) -50);
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        dk.field_b = false;
                        if (var7_ref != null) {
                            statePc = 56;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        aj.a(nb.a(113), 110, var7_ref);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        if (hb.field_g > 0) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        if (ka.field_r) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        try {
                            Object discarded$16 = pb.a("unzap", nb.a(-114), true);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var9_ref_Throwable = caughtException;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 63: {
                        try {
                            Object discarded$17 = pb.a(nb.a(-128), -11455, new Object[1], "zap");
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        var9_ref_Throwable = caughtException;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (0 >= hb.field_g) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        bd.field_N = true;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        nj.field_p.a((byte) -101, fb.field_b);
                        var9 = 0;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        if (4 <= var9) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        fb.field_b[var9] = fb.field_b[var9] + 50;
                        var9++;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 71: {
                        dh.field_N.a((byte) -105, fb.field_b);
                        return t.field_b;
                    }
                    case 72: {
                        if (tl.field_O != tf.field_qb) {
                            statePc = 82;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (li.d(-29427)) {
                            statePc = 75;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        eg.a((byte) 126);
                        if (t.field_b != -8) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (!dk.field_b) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        if (-8 != t.field_b) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        t.field_b = 3;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        cc.field_p = dh.field_N.b((byte) -107);
                        dk.field_b = false;
                        return t.field_b;
                    }
                    case 81: {
                        dk.field_b = true;
                        return -1;
                    }
                    case 82: {
                        if (null == uj.field_j) {
                            statePc = 84;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        if (dk.field_b) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        var7 = ei.field_o;
                        ei.field_o = ia.field_c;
                        dk.field_b = true;
                        ia.field_c = var7;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 86: {
                        if (30000L < of.a((byte) -96)) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        cc.field_p = lf.field_f;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 88: {
                        cc.field_p = dg.field_a;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        dk.field_b = false;
                        return 3;
                    }
                    case 90: {
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

    f() {
        ((f) this).field_l = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_m = "Back";
    }
}
