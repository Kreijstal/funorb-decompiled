/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends rk {
    pm field_r;
    boolean field_w;
    static String[] field_s;
    static int field_q;
    double field_u;
    double field_p;
    double field_m;
    double field_t;
    double field_o;
    double field_v;
    double field_n;
    double field_x;

    final static int a(boolean param0, boolean param1, String param2, int param3, String param4, byte param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Confined.field_J ? 1 : 0;
                        if (param5 <= -68) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_s = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != kl.field_G) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if (mb.a(param0, (byte) 17)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return -1;
                    }
                    case 5: {
                        if (si.field_g == lk.field_d) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        kg.field_o = sh.a(12831, param4, param2, false);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        kg.field_o = g.a(-26547, vb.field_d, false, (String) null, param2);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        vh.field_a.field_n = 0;
                        vh.field_a.f(93, 14);
                        vh.field_a.f(90, kg.field_o.b((byte) -42).field_c);
                        tb.a(-1, 111);
                        lk.field_d = oe.field_U;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (lk.field_d == oe.field_U) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (jj.a(1, (byte) 118)) {
                            statePc = 15;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var6 = e.field_c.c(32);
                        if (-1 == (var6 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        lk.field_d = ga.field_J;
                        Confined.field_F = var6;
                        ai.field_i = -1;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        lk.field_d = tb.field_a;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        e.field_c.field_n = 0;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (lk.field_d != tb.field_a) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (jj.a(8, (byte) -120)) {
                            statePc = 22;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        uh.field_b = e.field_c.h((byte) -68);
                        e.field_c.field_n = 0;
                        wb.a(param3, kg.field_o, param0, 25444, param1);
                        lk.field_d = rh.field_ab;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (lk.field_d == rh.field_ab) {
                            statePc = 25;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (jj.a(1, (byte) 8)) {
                            statePc = 27;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        var6 = e.field_c.c(32);
                        ag.field_e = null;
                        e.field_c.field_n = 0;
                        Confined.field_F = var6;
                        if (var6 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (var6 == 1) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if ((var6 ^ -1) == -9) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        lk.field_d = ga.field_J;
                        ai.field_i = -1;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 31: {
                        dc.d(109);
                        sg.field_y = false;
                        return var6;
                    }
                    case 32: {
                        lk.field_d = fm.field_a;
                        ai.field_i = -1;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (fm.field_a != lk.field_d) {
                            statePc = 73;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!jc.a(-72)) {
                            statePc = 73;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        vb.field_d = e.field_c.h((byte) -68);
                        int discarded$14 = e.field_c.c(32);
                        int discarded$15 = e.field_c.c(32);
                        sg.field_x = e.field_c.a((byte) 25);
                        var6_ref = e.field_c.e((byte) 102);
                        var7 = e.field_c.c(32);
                        if (0 != (var7 & 1)) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        wl.a(1607962024);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (param0) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        if (0 == (var7 & 8)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        da.field_i = stackIn_42_0 != 0;
                        if (0 == (4 & var7)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        ul.field_W = stackIn_45_0 != 0;
                        if (!da.field_i) {
                            statePc = 46;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        if (!na.field_W) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        int discarded$16 = e.field_c.c(32);
                        int discarded$17 = e.field_c.c(32);
                        int discarded$18 = e.field_c.f((byte) 51);
                        hd.field_b = e.field_c.a((byte) 25);
                        ka.field_F = new byte[hd.field_b];
                        var8 = 0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var8 >= hd.field_b) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        ka.field_F[var8] = e.field_c.b(true);
                        var8++;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 50: {
                        qc.field_m = e.field_c.d(true);
                        var11 = (CharSequence) (Object) qc.field_m;
                        dc.field_J = hh.a(0, var11);
                        field_q = e.field_c.c(32);
                        lk.field_d = wd.field_f;
                        if (kg.field_o.b((byte) -113) != gh.field_a) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        pi.field_T.a(ii.b(false), (byte) 49);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 52: {
                        if (kg.field_o.b((byte) 126) == vf.field_e) {
                            statePc = 54;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        tj.field_n.a(ii.b(false), (byte) 49);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        sg.field_y = false;
                        if (var6_ref != null) {
                            statePc = 57;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        qc.a(var6_ref, ii.b(false), -1);
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        if (sg.field_x > 0) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        if (!ul.field_W) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        try {
                            Object discarded$19 = kf.a((byte) 53, "zap", ii.b(false), new Object[1]);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var8_ref_Throwable = caughtException;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$20 = kf.a(93, "unzap", ii.b(false));
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var8_ref_Throwable = caughtException;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if ((sg.field_x ^ -1) >= -1) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        d.field_d = true;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        vh.field_a.a(ha.field_c, -55);
                        var8 = 0;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (4 <= var8) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        ha.field_c[var8] = ha.field_c[var8] + 50;
                        var8++;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 72: {
                        e.field_c.a(ha.field_c, -121);
                        return Confined.field_F;
                    }
                    case 73: {
                        if (ga.field_J != lk.field_d) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        if (!jc.a(-93)) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        dc.d(113);
                        if (Confined.field_F != 7) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (sg.field_y) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        sg.field_y = true;
                        return -1;
                    }
                    case 78: {
                        if (7 == Confined.field_F) {
                            statePc = 80;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        Confined.field_F = 3;
                        statePc = 81;
                        continue stateLoop;
                    }
                    case 81: {
                        gl.field_k = e.field_c.d(true);
                        sg.field_y = false;
                        return Confined.field_F;
                    }
                    case 82: {
                        if (kl.field_G == null) {
                            statePc = 84;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        if (!sg.field_y) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (30000L < la.h(124)) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        gl.field_k = ka.field_G;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 87: {
                        gl.field_k = hf.field_S;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        sg.field_y = false;
                        return 3;
                    }
                    case 89: {
                        var6 = nd.field_s;
                        nd.field_s = ac.field_b;
                        ac.field_b = var6;
                        sg.field_y = true;
                        statePc = 90;
                        continue stateLoop;
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

    public static void b(boolean param0) {
        field_s = null;
        if (param0) {
            oi.b(true);
        }
    }

    oi(pm param0) {
        ((oi) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
