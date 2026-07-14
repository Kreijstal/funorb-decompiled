/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends rqa {
    static String field_o;

    public static void e(byte param0) {
        if (param0 <= 58) {
            ju.e((byte) 89);
        }
        field_o = null;
    }

    ju(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = null;
        }
        return new nc((Object) (Object) frb.a(187, 101));
    }

    final static int a(boolean param0, int param1, String param2, byte param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_50_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = VoidHunters.field_G;
                        if (ov.field_o != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (ne.a(param4, (byte) -11)) {
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
                        if (tc.field_c != wd.field_p) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (!param4) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var11 = null;
                        qva.field_j = sia.a(96, sta.field_p, (String) null, false, param5);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 6: {
                        qva.field_j = fe.a(param2, param5, false, (byte) -70);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        dpa.field_p.field_e = 0;
                        dpa.field_p.c(param3 ^ 13, 14);
                        dpa.field_p.c(0, qva.field_j.a((byte) 56).field_a);
                        lnb.b(-1, 117);
                        tc.field_c = kj.field_o;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (kj.field_o == tc.field_c) {
                            statePc = 10;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (!boa.a(1, 30000)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (ida.field_w != tc.field_c) {
                            statePc = 21;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (!boa.a(8, param3 ^ 30013)) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        iqb.field_p = qga.field_b.k(255);
                        qga.field_b.field_e = 0;
                        dqa.a(-87, param0, param4, qva.field_j, param1);
                        tc.field_c = of.field_a;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 14: {
                        if (ida.field_w != tc.field_c) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (!boa.a(8, param3 ^ 30013)) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        iqb.field_p = qga.field_b.k(255);
                        qga.field_b.field_e = 0;
                        dqa.a(-87, param0, param4, qva.field_j, param1);
                        tc.field_c = of.field_a;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 18: {
                        if (ida.field_w != tc.field_c) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (!boa.a(8, param3 ^ 30013)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        iqb.field_p = qga.field_b.k(255);
                        qga.field_b.field_e = 0;
                        dqa.a(-87, param0, param4, qva.field_j, param1);
                        tc.field_c = of.field_a;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (tc.field_c != of.field_a) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (boa.a(1, 30000)) {
                            statePc = 24;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = qga.field_b.e((byte) -110);
                        ow.field_a = var6;
                        qga.field_b.field_e = 0;
                        vda.field_o = null;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (var6 == 1) {
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
                        vja.field_a = -1;
                        tc.field_c = kw.field_xb;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 28: {
                        ifb.l(-122);
                        hha.field_o = false;
                        return var6;
                    }
                    case 29: {
                        vja.field_a = -1;
                        tc.field_c = htb.field_A;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (tc.field_c != htb.field_A) {
                            statePc = 77;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (ci.b((byte) 113)) {
                            statePc = 33;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        sta.field_p = qga.field_b.k(255);
                        jd.field_p = param5;
                        go.field_p = qga.field_b.e((byte) -94);
                        nfa.field_d = qga.field_b.e((byte) -106);
                        hcb.field_o = qga.field_b.e(param3 + 1856);
                        var12 = qga.field_b.m(0);
                        var7 = qga.field_b.e((byte) -106);
                        if ((var7 & 1) == -1) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        hq.d((byte) 111);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (param4) {
                            statePc = 47;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (-1 == (8 & var7)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        erb.field_p = stackIn_39_0 != 0;
                        if (-1 == (var7 & 2 ^ -1)) {
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
                        hb.field_c = stackIn_42_0 != 0;
                        if ((var7 & 4) == 0) {
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
                        era.field_r = stackIn_45_0 != 0;
                        if (!erb.field_p) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        hb.field_c = true;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if ((16 & var7) == 0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        acb.field_p = stackIn_50_0 != 0;
                        if (!js.field_q) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        int discarded$12 = qga.field_b.e((byte) -117);
                        int discarded$13 = qga.field_b.e((byte) -91);
                        int discarded$14 = qga.field_b.h(86);
                        om.field_e = qga.field_b.e(1869);
                        ap.field_o = new byte[om.field_e];
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (om.field_e <= var8) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        ap.field_o[var8] = qga.field_b.d((byte) -114);
                        var8++;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 54: {
                        kca.field_a = qga.field_b.a(param3 ^ -14);
                        var13 = (CharSequence) (Object) kca.field_a;
                        ffb.field_e = jwa.a(false, var13);
                        jl.field_p = qga.field_b.e((byte) -94);
                        tc.field_c = sp.field_o;
                        if (qva.field_j.a((byte) 124) == bta.field_r) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (qva.field_j.a((byte) 112) == noa.field_p) {
                            statePc = 57;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        hha.field_p.a(vpa.b((byte) -103), 0);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        up.field_o.a(vpa.b((byte) -106), param3 ^ 13);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        hha.field_o = false;
                        if (var12 == null) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        pcb.a(vpa.b((byte) -94), var12, -1);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (-1 > (hcb.field_o ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        if (era.field_r) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$15 = ia.a(vpa.b((byte) -87), "unzap", param3 ^ 12337);
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
                            Object discarded$16 = ia.a(new Object[1], vpa.b((byte) -92), "zap", (byte) 108);
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
                        if (hcb.field_o > 0) {
                            statePc = 72;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        bua.field_o = true;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        dpa.field_p.a(18794, nfa.field_e);
                        var8 = 0;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        if (4 <= var8) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        nfa.field_e[var8] = nfa.field_e[var8] + 50;
                        var8++;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 76: {
                        qga.field_b.a(18794, nfa.field_e);
                        return ow.field_a;
                    }
                    case 77: {
                        if (tc.field_c == kw.field_xb) {
                            statePc = 79;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (!ci.b((byte) 113)) {
                            statePc = 90;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        ifb.l(-117);
                        if (-8 == (ow.field_a ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (ow.field_a != 7) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        ow.field_a = 3;
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 83: {
                        dgb.field_b = qga.field_b.a(-1);
                        hha.field_o = false;
                        return ow.field_a;
                    }
                    case 84: {
                        if (hha.field_o) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        hha.field_o = true;
                        return -1;
                    }
                    case 86: {
                        if (ow.field_a != 7) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        ow.field_a = 3;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        dgb.field_b = qga.field_b.a(-1);
                        hha.field_o = false;
                        return ow.field_a;
                    }
                    case 90: {
                        if (param3 == 13) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        var10 = null;
                        int discarded$17 = ju.a(true, 44, (String) null, (byte) 29, true, (String) null);
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        if (null == ov.field_o) {
                            statePc = 94;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        if (hha.field_o) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        var6 = pcb.field_p;
                        pcb.field_p = bia.field_d;
                        bia.field_d = var6;
                        hha.field_o = true;
                        statePc = 100;
                        continue stateLoop;
                    }
                    case 96: {
                        if (mw.e(0) > 30000L) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    }
                    case 97: {
                        dgb.field_b = uv.field_f;
                        statePc = 99;
                        continue stateLoop;
                    }
                    case 98: {
                        dgb.field_b = fd.field_o;
                        statePc = 99;
                        continue stateLoop;
                    }
                    case 99: {
                        hha.field_o = false;
                        return 3;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Press CTRL-R to reconnect";
    }
}
