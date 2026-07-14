/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String field_c;
    static String[] field_b;
    static boolean field_a;

    final static int a(boolean param0, String param1, int param2, boolean param3, String param4, int param5) {
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
                        var9 = Geoblox.field_C;
                        if (null != oc.field_e) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!w.a(param0, 52)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (pk.field_l == gi.field_d) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = null;
                        ih.field_a = wd.a(true, oa.field_c, (String) null, param1, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        ih.field_a = vf.a(false, param1, param4, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        fj.field_q.field_f = 0;
                        fj.field_q.d((byte) -102, 14);
                        fj.field_q.d((byte) -78, ih.field_a.a((byte) -32).field_c);
                        cm.a(-1, -1);
                        pk.field_l = oe.field_T;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (oe.field_T == pk.field_l) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (el.b(30000, 1)) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = eh.field_d.c((byte) 34);
                        eh.field_d.field_f = 0;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        pk.field_l = f.field_hb;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        p.field_k = -1;
                        pk.field_l = ac.field_v;
                        me.field_l = var6;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (f.field_hb != pk.field_l) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (!el.b(30000, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ak.field_a = eh.field_d.b(2901);
                        eh.field_d.field_f = 0;
                        uk.a(26, param2, param0, ih.field_a, param3);
                        pk.field_l = da.field_g;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (param5 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var10 = null;
                        int discarded$14 = ri.a(false, (String) null, 95, false, (String) null, 13);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (da.field_g == pk.field_l) {
                            statePc = 24;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (!el.b(30000, 1)) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var6 = eh.field_d.c((byte) 34);
                        eh.field_d.field_f = 0;
                        fl.field_b = null;
                        me.field_l = var6;
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (-2 != (var6 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        p.field_k = -1;
                        pk.field_l = da.field_f;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 29: {
                        if (var6 != 8) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        jl.a((byte) -116);
                        ck.field_e = false;
                        return var6;
                    }
                    case 31: {
                        pk.field_l = ac.field_v;
                        p.field_k = -1;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (da.field_f == pk.field_l) {
                            statePc = 34;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!nf.a(false)) {
                            statePc = 75;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        oa.field_c = eh.field_d.b(2901);
                        oc.field_f = eh.field_d.c((byte) 34);
                        int discarded$15 = eh.field_d.c((byte) 34);
                        og.field_n = eh.field_d.b(true);
                        var6_ref = eh.field_d.i((byte) 53);
                        var7 = eh.field_d.c((byte) 34);
                        if (-1 == (1 & var7 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        ic.a((byte) 65);
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (!param0) {
                            statePc = 39;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        if ((var7 & 4) == 0) {
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
                        fe.field_b = stackIn_42_0 != 0;
                        if (-1 == (var7 & 8 ^ -1)) {
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
                        fb.field_l = stackIn_45_0 != 0;
                        if (!fb.field_l) {
                            statePc = 46;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        if (ll.field_e) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        int discarded$16 = eh.field_d.c((byte) 34);
                        int discarded$17 = eh.field_d.c((byte) 34);
                        int discarded$18 = eh.field_d.a((byte) -48);
                        pk.field_n = eh.field_d.b(true);
                        hc.field_K = new byte[pk.field_n];
                        var8 = 0;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (pk.field_n <= var8) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        hc.field_K[var8] = eh.field_d.f((byte) 72);
                        var8++;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 51: {
                        wd.field_f = eh.field_d.e((byte) 105);
                        var12 = (CharSequence) (Object) wd.field_f;
                        vg.field_b = oe.a(var12, 12);
                        ik.field_a = eh.field_d.c((byte) 34);
                        pk.field_l = eh.field_b;
                        if (ih.field_a.a((byte) -32) != ej.field_b) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        mb.field_b.a(k.c(122), 0);
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 53: {
                        if (ih.field_a.a((byte) -32) == Geoblox.field_B) {
                            statePc = 55;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        rl.field_W.a(k.c(108), 0);
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        ck.field_e = false;
                        if (var6_ref != null) {
                            statePc = 58;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        tc.a(100, var6_ref, k.c(112));
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        if (og.field_n > 0) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        if (!fe.field_b) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        try {
                            Object discarded$19 = wk.a(-14882, new Object[1], k.c(param5 + 119), "zap");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var8_ref_Throwable = caughtException;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 65: {
                        try {
                            Object discarded$20 = wk.a((byte) -6, k.c(107), "unzap");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        var8_ref_Throwable = caughtException;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if ((og.field_n ^ -1) < -1) {
                            statePc = 70;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        rb.field_c = true;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        fj.field_q.a(hl.field_D, false);
                        var8 = 0;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (var8 >= 4) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        hl.field_D[var8] = hl.field_D[var8] + 50;
                        var8++;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 74: {
                        eh.field_d.a(hl.field_D, false);
                        return me.field_l;
                    }
                    case 75: {
                        if (pk.field_l == ac.field_v) {
                            statePc = 77;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if (nf.a(false)) {
                            statePc = 79;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        jl.a((byte) -118);
                        if (-8 != (me.field_l ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        if (ck.field_e) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        ck.field_e = true;
                        return -1;
                    }
                    case 82: {
                        if ((me.field_l ^ -1) == -8) {
                            statePc = 84;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        me.field_l = 3;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        kh.field_a = eh.field_d.e((byte) 101);
                        ck.field_e = false;
                        return me.field_l;
                    }
                    case 86: {
                        if (null == oc.field_e) {
                            statePc = 88;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        if (!ck.field_e) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (30000L >= ll.a((byte) 12)) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        kh.field_a = hf.field_e;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 91: {
                        kh.field_a = uj.field_e;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        ck.field_e = false;
                        return 3;
                    }
                    case 93: {
                        var6 = sd.field_x;
                        sd.field_x = ac.field_s;
                        ac.field_s = var6;
                        ck.field_e = true;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
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

    final static void a(int param0, int param1, int param2) {
        int var3 = 2 + (i.field_a.field_s >> 1411036417);
        if (param2 != 29497) {
            return;
        }
        int var4 = (i.field_a.field_o >> -1165451615) - -2;
        fc.field_b[uf.field_b].b(param0 + -var3, param1 + -var4, rj.field_c);
        vh.field_H[nd.field_a].b(-var3 + param0, -var4 + param1, rj.field_c);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 5366) {
            field_b = null;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_b = new String[]{"Clear 3 geoblox of the same colour and shape", "Clear the geoblox avatar", "Finish a stage with the avatar clear of geoblox", "Achieve a 6x bonus multiplier", "Achieve a 7x bonus multiplier", "Achieve an 8x bonus multiplier", "Destroy 5 black orbs", "Destroy 3 black orbs with one shock", "Pass the sun stage", "Pass the sweet stage", "Pass the jewellery stage", "Pass the germ stage", "Pass the space stage", "Pass the sport stage", "Pass the bakery stage", "Get past all stages twice!", "Score 7,000 points during Halloween"};
    }
}
