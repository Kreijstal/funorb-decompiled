/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dh {
    static int[] field_d;
    static String field_b;
    static String field_f;
    static String field_e;
    static String field_c;
    static String field_a;

    final static boolean a(byte param0) {
        if (param0 != 127) {
            field_a = null;
        }
        return rm.a((byte) -125, ie.field_Nb, sm.field_Kb);
    }

    abstract byte[] b(int param0);

    final static void a(int param0, int param1, boolean param2) {
        if (!param2) {
            field_f = null;
        }
        fm.field_d = param1;
        cg.field_d = param0;
        ln.field_d.b(param0, -24066);
    }

    abstract void a(byte[] param0, boolean param1);

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param2.getGraphics();
            if (param1 >= -2) {
                field_d = null;
            }
            ro.field_g.a(var4, param3, 15698, param0);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    final static void a(byte param0, String param1, int param2, String param3, int param4, String param5) {
        if (param0 >= -3) {
            field_a = null;
        }
        tn var6 = new tn(param2, param5, param4, param3, param1);
        in.a(var6, 640);
    }

    final static int a(int param0, boolean param1, String param2, String param3, int param4, boolean param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            CharSequence var12 = null;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_37_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Vertigo2.field_L ? 1 : 0;
                        if (null == lo.field_k) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (ce.a((byte) 13, param5)) {
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
                        if (nn.field_w == rg.field_d) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (param5) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        qn.field_y = kq.a(false, param2, param0 ^ -24430, param3);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = null;
                        qn.field_y = dp.a(param2, (String) null, (byte) -7, false, tn.field_p);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        uh.field_Wb.field_u = 0;
                        uh.field_Wb.f(14, -47);
                        uh.field_Wb.f(qn.field_y.a((byte) -83).field_b, param0 ^ 24323);
                        lf.d(72, -1);
                        rg.field_d = vi.field_D;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (rg.field_d == vi.field_D) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (c.a(1, (byte) -104)) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = id.field_f.h(-11);
                        id.field_f.field_u = 0;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        rg.field_d = gd.field_l;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        lc.field_f = var6;
                        ca.field_b = -1;
                        rg.field_d = hj.field_f;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (gd.field_l != rg.field_d) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (c.a(8, (byte) -104)) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        dc.field_F = id.field_f.i(-31016);
                        id.field_f.field_u = 0;
                        wl.a(param5, param1, (byte) 101, param4, qn.field_y);
                        rg.field_d = ir.field_c;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (ir.field_c != rg.field_d) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (c.a(1, (byte) -104)) {
                            statePc = 24;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = id.field_f.h(-11);
                        lc.field_f = var6;
                        id.field_f.field_u = 0;
                        go.field_g = null;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if ((var6 ^ -1) == -2) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        ca.field_b = -1;
                        rg.field_d = hj.field_f;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 28: {
                        rm.b((byte) -11);
                        gn.field_d = false;
                        return var6;
                    }
                    case 29: {
                        rg.field_d = Vertigo2.field_E;
                        ca.field_b = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (rg.field_d != Vertigo2.field_E) {
                            statePc = 78;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (!dl.b((byte) -126)) {
                            statePc = 78;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        tn.field_p = id.field_f.i(-31016);
                        nb.field_A = param2;
                        fn.field_z = id.field_f.h(-11);
                        uh.field_oc = id.field_f.h(param0 + -24440);
                        q.field_y = id.field_f.a((byte) -11);
                        var6_ref = id.field_f.k(param0 + -24553);
                        var7 = id.field_f.h(-11);
                        if (0 != (var7 & 1)) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        g.a(param0 ^ 24429);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (-1 == (var7 & 16 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        lo.field_i = stackIn_38_0 != 0;
                        if (!param5) {
                            statePc = 40;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        if ((var7 & 8) == 0) {
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
                        pe.field_r = stackIn_43_0 != 0;
                        if ((var7 & 4) == 0) {
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
                        df.field_m = stackIn_46_0 != 0;
                        if ((2 & var7) == 0) {
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
                        hj.field_b = stackIn_49_0 != 0;
                        if (pe.field_r) {
                            statePc = 51;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        hj.field_b = true;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (!lm.field_G) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        int discarded$10 = id.field_f.h(param0 + -24440);
                        int discarded$11 = id.field_f.h(-11);
                        int discarded$12 = id.field_f.b(true);
                        ao.field_H = id.field_f.a((byte) -11);
                        qh.field_d = new byte[ao.field_H];
                        var8 = 0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (var8 >= ao.field_H) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        qh.field_d[var8] = id.field_f.g(96);
                        var8++;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 56: {
                        qe.field_V = id.field_f.f(128);
                        var12 = (CharSequence) (Object) qe.field_V;
                        Vertigo2.field_F = rc.a(var12, 320);
                        rc.field_b = id.field_f.h(-11);
                        rg.field_d = bm.field_I;
                        if (qn.field_y.a((byte) -83) == lb.field_e) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        if (qn.field_y.a((byte) -83) == rf.field_n) {
                            statePc = 59;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        la.field_i.a(ob.e((byte) 116), (byte) -99);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 60: {
                        li.field_j.a(ob.e((byte) -93), (byte) -121);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        gn.field_d = false;
                        if (var6_ref == null) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        be.a(var6_ref, -1, ob.e((byte) -67));
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (-1 > (q.field_y ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        if (df.field_m) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        try {
                            Object discarded$13 = je.a(ob.e((byte) 127), false, "unzap");
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        var8_ref_Throwable = caughtException;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 69: {
                        try {
                            Object discarded$14 = je.a((byte) -63, "zap", ob.e((byte) -117), new Object[1]);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 71;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        var8_ref_Throwable = caughtException;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (0 >= q.field_y) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        pl.field_i = true;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        uh.field_Wb.b(he.field_u, 124);
                        var8 = 0;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        if (-5 >= (var8 ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        he.field_u[var8] = he.field_u[var8] + 50;
                        var8++;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 77: {
                        id.field_f.b(he.field_u, 61);
                        return lc.field_f;
                    }
                    case 78: {
                        if (param0 == 24429) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        var10 = null;
                        dh.a(-113, (byte) 112, (java.awt.Canvas) null, 37);
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        if (rg.field_d != hj.field_f) {
                            statePc = 90;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (!dl.b((byte) 103)) {
                            statePc = 90;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        rm.b((byte) 119);
                        if (7 != lc.field_f) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        if (!gn.field_d) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (7 == lc.field_f) {
                            statePc = 87;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        lc.field_f = 3;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        nk.field_Kb = id.field_f.f(128);
                        gn.field_d = false;
                        return lc.field_f;
                    }
                    case 89: {
                        gn.field_d = true;
                        return -1;
                    }
                    case 90: {
                        if (lo.field_k == null) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (gn.field_d) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        var6 = cl.field_d;
                        cl.field_d = ne.field_P;
                        ne.field_P = var6;
                        gn.field_d = true;
                        statePc = 98;
                        continue stateLoop;
                    }
                    case 94: {
                        if (30000L < qg.b(false)) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        nk.field_Kb = ba.field_c;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 96: {
                        nk.field_Kb = tf.field_m;
                        statePc = 97;
                        continue stateLoop;
                    }
                    case 97: {
                        gn.field_d = false;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_c = "Account created successfully!";
        field_f = "Unpacking animations";
        field_a = "Player";
        field_e = "coop complete";
        field_b = "Single-player game";
    }
}
