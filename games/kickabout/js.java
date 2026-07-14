/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class js {
    static int field_e;
    int field_c;
    static String field_f;
    int field_b;
    static tf field_d;
    static ut field_a;

    final static ut a(eg param0, int param1, ut param2, int param3) {
        iw.a(-94, param2);
        on.b();
        t.c();
        t.b(on.field_g >> 581852129, 202);
        param0.a(0, param1, 0, 0, 0, 0, 0, 700);
        if (param3 >= -25) {
            return null;
        }
        ta.e(123);
        return param2;
    }

    abstract void a(int param0, boolean param1);

    abstract boolean a(int param0, int param1, char param2);

    abstract void a(byte param0, boolean param1);

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 125) {
            return;
        }
        field_d = null;
        field_f = null;
    }

    final static void a(String param0, int param1, bu param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        hf.field_e = param2;
        tk.field_yb = param0;
        if (param8) {
            js.a((byte) 44);
        }
        nr.field_e = param4;
        nb.field_b = param7;
        gg.field_Db = param6;
        rc.field_f = param1;
        wo.field_k = param5;
        or.field_c = param3;
        gt.field_t = (bi) (Object) new tb();
        e.field_i = new eb(param2);
        al.field_Ab = new n(gt.field_t, e.field_i);
    }

    final static int a(int param0, String param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_43_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_57_0 = 0;
            int stackIn_62_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Kickabout.field_G;
                        if (op.field_y == null) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!qo.a(param3, (byte) -7)) {
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
                        if (sd.field_d == un.field_c) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        vq.field_h = wp.a(-111, param4, false, param1);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        vq.field_h = ti.a(param4, wq.field_d, (byte) 30, false, (String) null);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        or.field_d.field_n = 0;
                        or.field_d.a(108, 14);
                        or.field_d.a(124, vq.field_h.a((byte) -104).field_a);
                        c.a(-1, false);
                        un.field_c = uk.field_c;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (un.field_c == uk.field_c) {
                            statePc = 13;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (!uj.a((byte) -98, 1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (un.field_c != tl.field_c) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (!uj.a((byte) 115, 8)) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        ld.field_c = un.field_e.i((byte) -124);
                        un.field_e.field_n = 0;
                        nc.a(param2, param3, vq.field_h, -16161, param5);
                        un.field_c = gr.field_c;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 17: {
                        if (un.field_c != tl.field_c) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (!uj.a((byte) 115, 8)) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ld.field_c = un.field_e.i((byte) -124);
                        un.field_e.field_n = 0;
                        nc.a(param2, param3, vq.field_h, -16161, param5);
                        un.field_c = gr.field_c;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 21: {
                        if (un.field_c != tl.field_c) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (!uj.a((byte) 115, 8)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        ld.field_c = un.field_e.i((byte) -124);
                        un.field_e.field_n = 0;
                        nc.a(param2, param3, vq.field_h, -16161, param5);
                        un.field_c = gr.field_c;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (un.field_c == gr.field_c) {
                            statePc = 26;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (uj.a((byte) -127, 1)) {
                            statePc = 28;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        var6 = un.field_e.h((byte) -105);
                        so.field_b = var6;
                        lh.field_A = null;
                        un.field_e.field_n = 0;
                        if (var6 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (1 == var6) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (8 == var6) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        ms.field_b = -1;
                        un.field_c = wv.field_fb;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 32: {
                        lr.b((byte) -116);
                        vu.field_Db = false;
                        return var6;
                    }
                    case 33: {
                        un.field_c = bm.field_H;
                        ms.field_b = -1;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (bm.field_H != un.field_c) {
                            statePc = 91;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if (!ps.a(180)) {
                            statePc = 91;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        wq.field_d = un.field_e.i((byte) -124);
                        vl.field_e = param4;
                        tk.field_Ib = un.field_e.h((byte) -118);
                        bl.field_c = un.field_e.h((byte) -112);
                        eq.field_d = un.field_e.a((byte) 81);
                        var11 = un.field_e.a(true);
                        var7 = un.field_e.h((byte) -106);
                        if ((1 & var7) != 0) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        um.a((byte) 114);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (!param3) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        if ((16 & var7) == 0) {
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
                        ib.field_E = stackIn_43_0 != 0;
                        if (it.field_n) {
                            statePc = 45;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        int discarded$12 = un.field_e.h((byte) -118);
                        vp.field_h = un.field_e.h((byte) -124);
                        int discarded$13 = un.field_e.k(4);
                        field_e = un.field_e.a((byte) 81);
                        nt.field_yb = new byte[field_e];
                        var8 = 0;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var8 >= field_e) {
                            statePc = 67;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        nt.field_yb[var8] = un.field_e.j((byte) -114);
                        var8++;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 48: {
                        if (0 == (2 & var7)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        kb.field_C = stackIn_51_0 != 0;
                        if (-1 == (4 & var7)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        stackOut_52_0 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        fc.field_f = stackIn_54_0 != 0;
                        if (-1 == (var7 & 8)) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        stackOut_55_0 = 1;
                        stackIn_57_0 = stackOut_55_0;
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        stackOut_56_0 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        iw.field_l = stackIn_57_0 != 0;
                        if (!iw.field_l) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        kb.field_C = true;
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        if ((16 & var7) == 0) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        stackOut_60_0 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 61: {
                        stackOut_61_0 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        ib.field_E = stackIn_62_0 != 0;
                        if (it.field_n) {
                            statePc = 64;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        int discarded$14 = un.field_e.h((byte) -118);
                        vp.field_h = un.field_e.h((byte) -124);
                        int discarded$15 = un.field_e.k(4);
                        field_e = un.field_e.a((byte) 81);
                        nt.field_yb = new byte[field_e];
                        var8 = 0;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (var8 >= field_e) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        nt.field_yb[var8] = un.field_e.j((byte) -114);
                        var8++;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 67: {
                        ow.field_e = un.field_e.a(8);
                        var12 = (CharSequence) (Object) ow.field_e;
                        kd.field_w = mo.a(0, var12);
                        rl.field_n = un.field_e.h((byte) -128);
                        un.field_c = jn.field_rb;
                        if (vq.field_h.a((byte) -109) != qq.field_K) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        pb.field_F.a(-123, so.a(36));
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 69: {
                        if (vq.field_h.a((byte) -115) == ap.field_w) {
                            statePc = 71;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        ae.field_I.a(-122, so.a(-115));
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        vu.field_Db = false;
                        if (var11 != null) {
                            statePc = 74;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        mp.a(so.a(47), true, var11);
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        if ((eq.field_d ^ -1) < -1) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (!fc.field_f) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        try {
                            Object discarded$16 = mm.a(new Object[1], so.a(param0 + -122), "zap", param0 + 25449);
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 80;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        var8_ref_Throwable = caughtException;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 81: {
                        try {
                            Object discarded$17 = mm.a(30858, "unzap", so.a(-110));
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 83;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        var8_ref_Throwable = caughtException;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 84: {
                        if (eq.field_d > 0) {
                            statePc = 86;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        fu.field_c = true;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 87: {
                        or.field_d.a((byte) 117, sn.field_f);
                        var8 = 0;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        if (var8 >= 4) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        sn.field_f[var8] = sn.field_f[var8] + 50;
                        var8++;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 90: {
                        un.field_e.a((byte) 125, sn.field_f);
                        return so.field_b;
                    }
                    case 91: {
                        if (wv.field_fb != un.field_c) {
                            statePc = 100;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (!ps.a(180)) {
                            statePc = 100;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        lr.b((byte) -116);
                        if (-8 != (so.field_b ^ -1)) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        if (vu.field_Db) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        vu.field_Db = true;
                        return -1;
                    }
                    case 96: {
                        if (7 == so.field_b) {
                            statePc = 98;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    }
                    case 98: {
                        so.field_b = 3;
                        statePc = 99;
                        continue stateLoop;
                    }
                    case 99: {
                        gd.field_b = un.field_e.a(4);
                        vu.field_Db = false;
                        return so.field_b;
                    }
                    case 100: {
                        if (param0 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    }
                    case 101: {
                        field_d = null;
                        statePc = 102;
                        continue stateLoop;
                    }
                    case 102: {
                        if (op.field_y == null) {
                            statePc = 104;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    }
                    case 104: {
                        if (vu.field_Db) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    }
                    case 105: {
                        var6 = rl.field_o;
                        rl.field_o = pn.field_y;
                        pn.field_y = var6;
                        vu.field_Db = true;
                        statePc = 110;
                        continue stateLoop;
                    }
                    case 106: {
                        if (30000L >= aa.c(29680)) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    }
                    case 107: {
                        gd.field_b = md.field_h;
                        statePc = 109;
                        continue stateLoop;
                    }
                    case 108: {
                        gd.field_b = ic.field_e;
                        statePc = 109;
                        continue stateLoop;
                    }
                    case 109: {
                        vu.field_Db = false;
                        return 3;
                    }
                    case 110: {
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

    abstract void a(int param0, boolean param1, int param2, js param3);

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 20338) {
                js.a((byte) 126);
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(qr.a(param1, var2, 3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    js(int param0) {
        ((js) this).field_c = param0;
        ((js) this).field_b = ((js) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
