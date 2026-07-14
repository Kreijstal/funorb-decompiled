/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static int field_b;
    static am field_c;
    static ko field_a;

    final static void a(int param0) {
        if (!(oi.field_c == null)) {
            oi.field_c.b((byte) -118);
            oi.field_c = null;
        }
        if (param0 != 4) {
            field_a = null;
        }
    }

    final static int a(String param0, boolean param1, String param2, int param3, boolean param4, boolean param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            md stackIn_21_0 = null;
            md stackIn_22_0 = null;
            md stackIn_23_0 = null;
            int stackIn_23_1 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            Throwable decompiledCaughtException = null;
            md stackOut_20_0 = null;
            md stackOut_22_0 = null;
            int stackOut_22_1 = 0;
            md stackOut_21_0 = null;
            int stackOut_21_1 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = CrazyCrystals.field_B;
                        if (oi.field_c != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (te.a((byte) -19, param4)) {
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
                        if (!param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        field_b = -101;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (gj.field_k == cf.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (param4) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        mk.field_c = oh.a(false, param0, param1, param2);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        mk.field_c = rn.a(0, false, go.field_h, param0, (String) null);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        tp.field_f.field_f = 0;
                        tp.field_f.a(true, 14);
                        tp.field_f.a(true, mk.field_c.a(0).field_b);
                        ak.a(-1, (byte) -48);
                        gj.field_k = of.field_F;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (gj.field_k == of.field_F) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (!fq.a(1, (byte) 50)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = kd.field_n.h(255);
                        kd.field_n.field_f = 0;
                        if (var6 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        bf.field_b = var6;
                        rk.field_b = -1;
                        gj.field_k = pg.field_a;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        gj.field_k = ul.field_j;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (gj.field_k != ul.field_j) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (fq.a(8, (byte) 90)) {
                            statePc = 20;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = kd.field_n;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (param1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (md) (Object) stackIn_21_0;
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (md) (Object) stackIn_22_0;
                        stackOut_22_1 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        md.field_m = ((md) (Object) stackIn_23_0).d(stackIn_23_1 != 0);
                        kd.field_n.field_f = 0;
                        tf.a(param4, (byte) 75, mk.field_c, param3, param5);
                        gj.field_k = tk.field_k;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (tk.field_k != gj.field_k) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (!fq.a(1, (byte) -70)) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        var6 = kd.field_n.h(255);
                        bf.field_b = var6;
                        ld.field_r = null;
                        kd.field_n.field_f = 0;
                        if (-1 == var6) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (-2 != var6) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        gj.field_k = fm.field_y;
                        rk.field_b = -1;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 30: {
                        if (var6 != 8) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        jj.a(4);
                        ec.field_g = false;
                        return var6;
                    }
                    case 32: {
                        rk.field_b = -1;
                        gj.field_k = pg.field_a;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (fm.field_y != gj.field_k) {
                            statePc = 71;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (ol.f((byte) 60)) {
                            statePc = 36;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        go.field_h = kd.field_n.d(true);
                        rb.field_h = kd.field_n.h(255);
                        int discarded$12 = kd.field_n.h(255);
                        mo.field_l = kd.field_n.c((byte) -7);
                        var6_ref = kd.field_n.a(0);
                        var7 = kd.field_n.h(255);
                        if (-1 == (var7 & 1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        jl.b(65);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (param4) {
                            statePc = 46;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        if (-1 == (4 & var7)) {
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
                        qa.field_j = stackIn_42_0 != 0;
                        if (-1 == (8 & var7 ^ -1)) {
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
                        ne.field_b = stackIn_45_0 != 0;
                        if (!ne.field_b) {
                            statePc = 46;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        if (!ag.field_b) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        int discarded$13 = kd.field_n.h(255);
                        int discarded$14 = kd.field_n.h(255);
                        int discarded$15 = kd.field_n.b((byte) -29);
                        um.field_f = kd.field_n.c((byte) -7);
                        km.field_f = new byte[um.field_f];
                        var8 = 0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var8 >= um.field_f) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        km.field_f[var8] = kd.field_n.d((byte) 113);
                        var8++;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 50: {
                        je.field_g = kd.field_n.i(119);
                        var11 = (CharSequence) (Object) je.field_g;
                        lk.field_b = fe.a(60136, var11);
                        kl.field_V = kd.field_n.h(255);
                        gj.field_k = ek.field_h;
                        if (mk.field_c.a(0) == of.field_C) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        if (mk.field_c.a(0) != uo.field_n) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        wp.field_c.a(1, le.b((byte) -20));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        gg.field_d.a(1, le.b((byte) -20));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        ec.field_g = false;
                        if (var6_ref == null) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        ah.a(-77, var6_ref, le.b((byte) -20));
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        if ((mo.field_l ^ -1) < -1) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        if (!qa.field_j) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        try {
                            Object discarded$16 = hi.a(-3729, "zap", le.b((byte) -20), new Object[1]);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var8_ref_Throwable = caughtException;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 62: {
                        try {
                            Object discarded$17 = hi.a(le.b((byte) -20), "unzap", -115);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var8_ref_Throwable = caughtException;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (-1 <= mo.field_l) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        fj.field_d = true;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        tp.field_f.a(pj.field_r, true);
                        var8 = 0;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if (-5 <= var8) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        pj.field_r[var8] = pj.field_r[var8] + 50;
                        var8++;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 70: {
                        kd.field_n.a(pj.field_r, true);
                        return bf.field_b;
                    }
                    case 71: {
                        if (pg.field_a == gj.field_k) {
                            statePc = 73;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (!ol.f((byte) 60)) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        jj.a(4);
                        if (bf.field_b != -8) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        if (!ec.field_g) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if (-8 == bf.field_b) {
                            statePc = 79;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        bf.field_b = 3;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        re.field_j = kd.field_n.i(123);
                        ec.field_g = false;
                        return bf.field_b;
                    }
                    case 81: {
                        ec.field_g = true;
                        return -1;
                    }
                    case 82: {
                        if (oi.field_c != null) {
                            statePc = 89;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        if (!ec.field_g) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        if (30000L < wd.d(-1322)) {
                            statePc = 86;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        re.field_j = re.field_k;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 86: {
                        re.field_j = jm.field_f;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 87: {
                        ec.field_g = false;
                        return 3;
                    }
                    case 88: {
                        var6 = fe.field_j;
                        fe.field_j = gj.field_l;
                        gj.field_l = var6;
                        ec.field_g = true;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
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

    public static void a(byte param0) {
        int var1 = -60 % ((-53 - param0) / 42);
        field_c = null;
        field_a = null;
    }

    static {
    }
}
