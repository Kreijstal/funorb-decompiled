/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wj extends fb {
    private fh field_s;
    static String[] field_t;

    public static void d(byte param0) {
        int var1 = 69 % ((param0 - -39) / 53);
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ka stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ka stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            ka stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            int stackIn_8_2 = 0;
            ka stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            ka stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            ka stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            int stackOut_7_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((wj) this).field_s == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        if (param0 == 24215) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            ((wj) this).field_c.field_k = 0;
                            stackOut_5_0 = ((wj) this).field_c;
                            stackOut_5_1 = 0;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            if (!param1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (ka) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = (ka) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((ka) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2);
                            ((wj) this).field_c.a(param0 + -24175, 0L);
                            ((wj) this).field_s.a(((wj) this).field_c.field_r, 0, 121, ((wj) this).field_c.field_r.length);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((wj) this).field_s.a(true);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        ((wj) this).field_s = null;
                        ((wj) this).field_g = -2;
                        ((wj) this).field_i = ((wj) this).field_i + 1;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
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

    public wj() {
    }

    final static int a(String param0, int param1, boolean param2, String param3, byte param4, boolean param5) {
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
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = stellarshard.field_B;
                        if (ob.field_b != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!nh.a(-1, param5)) {
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
                        if (sl.field_d == oa.field_C) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param5) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = null;
                        le.field_n = wf.a(we.field_a, (String) null, -124, param0, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        le.field_n = h.a(param0, (byte) -117, false, param3);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        pg.field_fb.field_k = 0;
                        pg.field_fb.a(false, 14);
                        pg.field_fb.a(false, le.field_n.a(160).field_h);
                        ue.a((byte) 114, -1);
                        sl.field_d = de.field_a;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        var6 = 119 / ((param4 - -28) / 43);
                        if (sl.field_d == de.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (qe.b(64, 1)) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var7 = ae.field_N.f(4);
                        ae.field_N.field_k = 0;
                        if ((var7 ^ -1) == -1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        sl.field_d = ih.field_a;
                        ue.field_b = -1;
                        ja.field_t = var7;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        sl.field_d = vg.field_p;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (sl.field_d != vg.field_p) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (!qe.b(64, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ob.field_a = ae.field_N.d(0);
                        ae.field_N.field_k = 0;
                        cd.a(54, param2, le.field_n, param1, param5);
                        sl.field_d = lb.field_o;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (sl.field_d == lb.field_o) {
                            statePc = 22;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (!qe.b(64, 1)) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var7 = ae.field_N.f(4);
                        ja.field_t = var7;
                        pk.field_b = null;
                        ae.field_N.field_k = 0;
                        if (-1 == (var7 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-2 == (var7 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (8 != var7) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        oj.c(-2290);
                        ta.field_u = false;
                        return var7;
                    }
                    case 27: {
                        sl.field_d = ih.field_a;
                        ue.field_b = -1;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        ue.field_b = -1;
                        sl.field_d = ge.field_m;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (sl.field_d != ge.field_m) {
                            statePc = 69;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (cd.e((byte) 125)) {
                            statePc = 32;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        we.field_a = ae.field_N.d(0);
                        ph.field_D = ae.field_N.f(4);
                        int discarded$12 = ae.field_N.f(4);
                        mk.field_k = ae.field_N.c((byte) 56);
                        var7_ref = ae.field_N.a(0);
                        var8 = ae.field_N.f(4);
                        if ((var8 & 1 ^ -1) != -1) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        nd.g(-26923);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (param5) {
                            statePc = 43;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (-1 == (8 & var8 ^ -1)) {
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
                        wd.field_c = stackIn_39_0 != 0;
                        if ((var8 & 4 ^ -1) == -1) {
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
                        ta.field_n = stackIn_42_0 != 0;
                        if (wd.field_c) {
                            statePc = 43;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (!tl.field_b) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        int discarded$13 = ae.field_N.f(4);
                        int discarded$14 = ae.field_N.f(4);
                        int discarded$15 = ae.field_N.b(false);
                        aj.field_a = ae.field_N.c((byte) 107);
                        bf.field_a = new byte[aj.field_a];
                        var9 = 0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (aj.field_a <= var9) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        bf.field_a[var9] = ae.field_N.g(102);
                        var9++;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 47: {
                        wf.field_b = ae.field_N.e((byte) 97);
                        var12 = (CharSequence) (Object) wf.field_b;
                        wb.field_b = nh.a(var12, false);
                        ag.field_c = ae.field_N.f(4);
                        sl.field_d = la.field_O;
                        if (le.field_n.a(160) != hc.field_s) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        kk.field_k.a(hf.a((byte) -8), (byte) 73);
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 49: {
                        if (le.field_n.a(160) == ea.field_o) {
                            statePc = 51;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        ak.field_d.a(hf.a((byte) -34), (byte) 73);
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        ta.field_u = false;
                        if (var7_ref == null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        dj.a(false, hf.a((byte) -112), var7_ref);
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (0 < mk.field_k) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (!ta.field_n) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        try {
                            Object discarded$16 = sh.a(new Object[1], false, "zap", hf.a((byte) -62));
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        var9_ref_Throwable = caughtException;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 60: {
                        try {
                            Object discarded$17 = sh.a("unzap", hf.a((byte) -24), (byte) 78);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var9_ref_Throwable = caughtException;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (0 >= mk.field_k) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        uj.field_f = true;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        pg.field_fb.a(dj.field_b, -1001);
                        var9 = 0;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (4 <= var9) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        dj.field_b[var9] = dj.field_b[var9] + 50;
                        var9++;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 68: {
                        ae.field_N.a(dj.field_b, -1001);
                        return ja.field_t;
                    }
                    case 69: {
                        if (ih.field_a == sl.field_d) {
                            statePc = 71;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        if (!cd.e((byte) 123)) {
                            statePc = 79;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        oj.c(-2290);
                        if (ja.field_t != 7) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (!ta.field_u) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        if (7 != ja.field_t) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        ja.field_t = 3;
                        statePc = 77;
                        continue stateLoop;
                    }
                    case 77: {
                        ga.field_a = ae.field_N.e((byte) 116);
                        ta.field_u = false;
                        return ja.field_t;
                    }
                    case 78: {
                        ta.field_u = true;
                        return -1;
                    }
                    case 79: {
                        if (ob.field_b != null) {
                            statePc = 86;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        if (ta.field_u) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        var7 = ue.field_d;
                        ue.field_d = wd.field_a;
                        wd.field_a = var7;
                        ta.field_u = true;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 82: {
                        if ((tk.b(125) ^ -1L) >= -30001L) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        ga.field_a = hj.field_a;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 84: {
                        ga.field_a = wb.field_h;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        ta.field_u = false;
                        return 3;
                    }
                    case 86: {
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

    final boolean f(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ph var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ph var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_85_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = stellarshard.field_B;
                        if (null != ((wj) this).field_s) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ih.a((byte) -98);
                        var4 = (int)(var2_long + -((wj) this).field_l);
                        if (200 >= var4) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((wj) this).field_l = var2_long;
                        ((wj) this).field_m = ((wj) this).field_m + var4;
                        if (-30001 > (((wj) this).field_m ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((wj) this).field_s.a(true);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((wj) this).field_s = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((wj) this).field_s == null) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (-1 != (((wj) this).b((byte) -123) ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 == (((wj) this).a(param0 ^ 26348) ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 17: {
                        try {
                            ((wj) this).field_s.c(param0 + 32614);
                            var2_ref = (ph) (Object) ((wj) this).field_o.a(false);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2_ref == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((wj) this).field_c.field_k = 0;
                            ((wj) this).field_c.a(false, 1);
                            ((wj) this).field_c.a(116, var2_ref.field_o);
                            ((wj) this).field_s.a(((wj) this).field_c.field_r, 0, 107, ((wj) this).field_c.field_r.length);
                            ((wj) this).field_q.a((byte) 125, (ah) (Object) var2_ref);
                            var2_ref = (ph) (Object) ((wj) this).field_o.a(-116);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param0 == 26348) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            wj.d((byte) 71);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref = (ph) (Object) ((wj) this).field_j.a(false);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_ref == null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((wj) this).field_c.field_k = 0;
                            ((wj) this).field_c.a(false, 0);
                            ((wj) this).field_c.a(param0 + -26250, var2_ref.field_o);
                            ((wj) this).field_s.a(((wj) this).field_c.field_r, 0, 114, ((wj) this).field_c.field_r.length);
                            ((wj) this).field_k.a((byte) 126, (ah) (Object) var2_ref);
                            var2_ref = (ph) (Object) ((wj) this).field_j.a(-121);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var2_int = 0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 85;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var3_int = ((wj) this).field_s.b(-93);
                            if ((var3_int ^ -1) <= -1) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-1 != (var3_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((wj) this).field_m = 0;
                            var4 = 0;
                            if (((wj) this).field_r == null) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (((wj) this).field_r.field_C != 0) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 1;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var4 = 10;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (0 < var4) {
                                statePc = 51;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = -((wj) this).field_r.field_F + ((wj) this).field_r.field_G.field_r.length;
                            var6 = -((wj) this).field_r.field_C + 512;
                            if ((var6 ^ -1) < (-((wj) this).field_r.field_G.field_k + var5 ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = -((wj) this).field_r.field_G.field_k + var5;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((var6 ^ -1) < (var3_int ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6 = var3_int;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((wj) this).field_s.a(((wj) this).field_r.field_G.field_k, (byte) -64, ((wj) this).field_r.field_G.field_r, var6);
                            if (-1 != (((wj) this).field_p ^ -1)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var7 = 0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var7 >= var6) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((wj) this).field_r.field_G.field_r[((wj) this).field_r.field_G.field_k + var7] = (byte)ih.a((int) ((wj) this).field_r.field_G.field_r[((wj) this).field_r.field_G.field_k + var7], (int) ((wj) this).field_p);
                            var7++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((wj) this).field_r.field_G.field_k = ((wj) this).field_r.field_G.field_k + var6;
                            ((wj) this).field_r.field_C = ((wj) this).field_r.field_C + var6;
                            if ((var5 ^ -1) != (((wj) this).field_r.field_G.field_k ^ -1)) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((wj) this).field_r.c((byte) 36);
                            ((wj) this).field_r.field_w = false;
                            ((wj) this).field_r = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if ((((wj) this).field_r.field_C ^ -1) != -513) {
                                statePc = 84;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((wj) this).field_r.field_C = 0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = -((wj) this).field_a.field_k + var4;
                            if ((var3_int ^ -1) <= (var5 ^ -1)) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var5 = var3_int;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((wj) this).field_s.a(((wj) this).field_a.field_k, (byte) -64, ((wj) this).field_a.field_r, var5);
                            if (0 == ((wj) this).field_p) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var6 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var5 <= var6) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((wj) this).field_a.field_r[var6 + ((wj) this).field_a.field_k] = (byte)ih.a((int) ((wj) this).field_a.field_r[var6 + ((wj) this).field_a.field_k], (int) ((wj) this).field_p);
                            var6++;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((wj) this).field_a.field_k = ((wj) this).field_a.field_k + var5;
                            if ((var4 ^ -1) < (((wj) this).field_a.field_k ^ -1)) {
                                statePc = 84;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (null != ((wj) this).field_r) {
                                statePc = 79;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((wj) this).field_a.field_k = 0;
                            var6 = ((wj) this).field_a.f(4);
                            var7 = ((wj) this).field_a.b(false);
                            var8 = ((wj) this).field_a.f(4);
                            var9 = ((wj) this).field_a.b(false);
                            var10 = 127 & var8;
                            if (-1 == (var8 & 128 ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_62_0 = stackOut_60_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var11 = stackIn_62_0;
                            var12 = ((long)var6 << 1884392736) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (ph) (Object) ((wj) this).field_q.a(false);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var14_ref == null) {
                                statePc = 72;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_o ^ -1L)) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14_ref = (ph) (Object) ((wj) this).field_q.a(param0 ^ -26262);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (ph) (Object) ((wj) this).field_k.a(false);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var14_ref == null) {
                                statePc = 72;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var12 ^ -1L) == (var14_ref.field_o ^ -1L)) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var14_ref = (ph) (Object) ((wj) this).field_k.a(-102);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var14_ref == null) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((wj) this).field_r = var14_ref;
                            if ((var10 ^ -1) != -1) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackOut_76_0 = 5;
                            stackIn_78_0 = stackOut_76_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackOut_77_0 = 9;
                            stackIn_78_0 = stackOut_77_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var15 = stackIn_78_0;
                            ((wj) this).field_r.field_G = new ka(var15 + var9 - -((wj) this).field_r.field_F);
                            ((wj) this).field_r.field_G.a(false, var10);
                            ((wj) this).field_r.field_G.b(0, var9);
                            ((wj) this).field_a.field_k = 0;
                            ((wj) this).field_r.field_C = 10;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if ((((wj) this).field_r.field_C ^ -1) != -1) {
                                statePc = 83;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (0 == (((wj) this).field_a.field_r[0] ^ -1)) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((wj) this).field_r = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((wj) this).field_a.field_k = 0;
                            ((wj) this).field_r.field_C = 1;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var2_int++;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            stackOut_85_0 = 1;
                            stackIn_86_0 = stackOut_85_0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        return stackIn_86_0 != 0;
                    }
                    case 87: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        try {
                            ((wj) this).field_s.a(true);
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        ((wj) this).field_g = -2;
                        ((wj) this).field_s = null;
                        ((wj) this).field_i = ((wj) this).field_i + 1;
                        if (((wj) this).b((byte) -93) != 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if ((((wj) this).a(param0 ^ 26348) ^ -1) != -1) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        return true;
                    }
                    case 94: {
                        return false;
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

    private final void e(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((wj) this).field_s) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        if (param0 == -84) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        this.a(34, true);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((wj) this).field_c.field_k = 0;
                            ((wj) this).field_c.a(false, 6);
                            ((wj) this).field_c.b(3, (byte) 119);
                            ((wj) this).field_c.c(0, -121);
                            ((wj) this).field_s.a(((wj) this).field_c.field_r, 0, 110, ((wj) this).field_c.field_r.length);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            ((wj) this).field_s.a(true);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((wj) this).field_s = null;
                        ((wj) this).field_i = ((wj) this).field_i + 1;
                        ((wj) this).field_g = -2;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        return;
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

    final static void h(int param0) {
        if (param0 > -124) {
            Boolean discarded$0 = wj.g(-16);
        }
        if (!cg.field_a) {
            throw new IllegalStateException();
        }
        qh.field_d = true;
        va.a(false, -844);
        eg.field_d = 0;
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4_ref_Exception = null;
            ph var4_ref_ph = null;
            int var4 = 0;
            IOException var5 = null;
            Exception var6 = null;
            int var7 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = stellarshard.field_B;
                        if (((wj) this).field_s == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((wj) this).field_s.a(true);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var4_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((wj) this).field_s = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((wj) this).field_s = (fh) param1;
                        this.e((byte) -84);
                        this.a(24215, param0);
                        ((wj) this).field_r = null;
                        ((wj) this).field_a.field_k = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref_ph = (ph) (Object) ((wj) this).field_q.a((byte) 110);
                        if (var4_ref_ph != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((wj) this).field_o.a((byte) 124, (ah) (Object) var4_ref_ph);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref_ph = (ph) (Object) ((wj) this).field_k.a((byte) 61);
                        if (var4_ref_ph == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((wj) this).field_j.a((byte) 125, (ah) (Object) var4_ref_ph);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        var4 = -48 % ((-59 - param2) / 61);
                        if (((wj) this).field_p == 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((wj) this).field_c.field_k = 0;
                            ((wj) this).field_c.a(false, 4);
                            ((wj) this).field_c.a(false, (int) ((wj) this).field_p);
                            ((wj) this).field_c.b(0, 0);
                            ((wj) this).field_s.a(((wj) this).field_c.field_r, 0, 111, ((wj) this).field_c.field_r.length);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var5 = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((wj) this).field_s.a(true);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var6 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((wj) this).field_g = -2;
                        ((wj) this).field_s = null;
                        ((wj) this).field_i = ((wj) this).field_i + 1;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((wj) this).field_m = 0;
                        ((wj) this).field_l = ih.a((byte) -98);
                        return;
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

    final void b(int param0) {
        try {
            ((wj) this).field_s.a(true);
        } catch (Exception exception) {
        }
        ((wj) this).field_g = -1;
        ((wj) this).field_s = null;
        if (param0 > -101) {
            return;
        }
        ((wj) this).field_i = ((wj) this).field_i + 1;
        ((wj) this).field_p = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        pb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        pb var9 = null;
        int var10 = 0;
        pb var11 = null;
        pb var12 = null;
        String var14 = null;
        pb var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        L0: {
          var10 = stellarshard.field_B;
          if (nh.field_g == null) {
            break L0;
          } else {
            if (!nh.field_g.a((byte) -36)) {
              break L0;
            } else {
              if (!nh.field_g.a("benefits", (byte) -109)) {
                break L0;
              } else {
                if (vf.field_E == null) {
                  break L0;
                } else {
                  if (!vf.field_E.a((byte) -36)) {
                    break L0;
                  } else {
                    if (vf.field_E.a("benefits", (byte) -109)) {
                      tk.field_c = qd.a(nh.field_g, "headline", "benefits", (byte) 81);
                      pl.field_T = qd.a(nh.field_g, "blurbpane", "benefits", (byte) 78);
                      fe.field_a = qd.a(nh.field_g, "button", "benefits", (byte) 78);
                      dd.field_a = qd.a(nh.field_g, "signup_text", "benefits", (byte) 57);
                      na.field_e = qd.a(nh.field_g, "menu_text", "benefits", (byte) 42);
                      ui.field_F = qd.a(nh.field_g, "button_frame", "benefits", (byte) 59);
                      ea.field_l = qd.a(nh.field_g, "arrow", "benefits", (byte) 118);
                      o.field_h = (bd) (Object) ae.a("benefits", "large_font", nh.field_g, -109, vf.field_E);
                      fj.field_f = (bd) (Object) ae.a("benefits", "small_font", nh.field_g, -116, vf.field_E);
                      var27 = ti.field_a;
                      var2 = ti.field_i;
                      var3 = ti.field_b;
                      ti.a(pk.field_i);
                      var11 = new pb(ea.field_l.field_v + 4, ea.field_l.field_y + 4);
                      var11.e();
                      ea.field_l.c(2, 2, ki.field_x);
                      oj.a(var11, 1, 0, var11.field_y, 2, 0, var11.field_v, true);
                      ea.field_l = var11;
                      bk.field_b = ea.field_l.f();
                      var12 = new pb(195, 221);
                      var6 = var12.field_v / 2;
                      var12.e();
                      o.field_h.c(h.a(ph.field_E, 0, new String[1]), var6, 40, 16777215, -1);
                      fj.field_f.c(h.a(ch.field_c, 0, new String[1]), var6, 60, 16777215, -1);
                      o.field_h.c(h.a(vd.field_a, 0, new String[1]), var6, 110, 16777215, -1);
                      fj.field_f.c(h.a(rb.field_t, 0, new String[1]), var6, 130, 16777215, -1);
                      o.field_h.c(cm.field_b, var6, 180, 16777215, -1);
                      fj.field_f.c(nl.field_d, var6, 200, 16777215, -1);
                      oj.a(var12, 1, 0, var12.field_y, 3, 0, var12.field_v, true);
                      pl.field_T.e();
                      var12.e(-pl.field_T.field_t + 18, 241 - pl.field_T.field_s);
                      var7 = 0;
                      L1: while (true) {
                        if ((pk.field_d.length ^ -1) >= (var7 ^ -1)) {
                          pk.field_d = null;
                          q.field_b = dd.field_a.a();
                          q.field_b.e();
                          ob.a(117, 0, 64, ti.field_i, ti.field_b * 2 / 3, 0);
                          ti.a(var27, var2, var3);
                          ti.b(pk.field_i);
                          wc.field_y = 231 + (fe.field_a.field_v - ui.field_F.field_v) / 2;
                          cm.field_a = (fe.field_a.field_v - ui.field_F.field_v) / 2 + 434;
                          af.field_l = (fe.field_a.field_y + -ui.field_F.field_y) / 2 + 390;
                          nh.field_g = null;
                          vi.field_a = 390 - -((-ui.field_F.field_y + fe.field_a.field_y) / 2);
                          break L0;
                        } else {
                          dl.field_C[var7].e();
                          int discarded$6 = fj.field_f.a(pk.field_d[var7], 3, 3, -6 + dl.field_C[var7].field_v, dl.field_C[var7].field_y + -6, ki.field_x, -1, 1, 1, fj.field_f.field_N + fj.field_f.field_r);
                          oj.a(dl.field_C[var7], 1, 0, dl.field_C[var7].field_y, 3, 0, dl.field_C[var7].field_v, true);
                          var7++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        if (ve.field_a != null) {
          L2: {
            if (null == ug.field_f) {
              break L2;
            } else {
              if (null != o.field_h) {
                L3: {
                  var28 = ti.field_a;
                  var2 = ti.field_i;
                  var3 = ti.field_b;
                  ti.a(pk.field_i);
                  var14 = h.a(hj.field_b, 0, new String[1]);
                  var5 = o.field_h.b(var14, vh.field_i);
                  var6 = o.field_h.b(var14, vh.field_i, o.field_h.field_N - -o.field_h.field_r);
                  var7 = (vh.field_i + -var5) / 2 + kk.field_o;
                  var8 = (i.field_a - var6) / 2 + vi.field_d;
                  var7 -= 3;
                  var5 += 6;
                  var6 += 6;
                  var8 -= 3;
                  if (-1 < (var7 ^ -1)) {
                    var9_int = -var7;
                    var7 = var7 + var9_int;
                    ug.field_f.field_w = ug.field_f.field_w + 2 * var9_int;
                    pk.field_g = pk.field_g - var9_int;
                    var5 = var5 + var9_int * 2;
                    ug.field_f.field_t = ug.field_f.field_t + var9_int;
                    kk.field_o = kk.field_o + var9_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 + var7 <= ug.field_f.field_w) {
                    break L4;
                  } else {
                    var9_int = var5 + var7 - ug.field_f.field_w;
                    ug.field_f.field_w = ug.field_f.field_w + var9_int * 2;
                    var5 = var5 + 2 * var9_int;
                    pk.field_g = pk.field_g - var9_int;
                    kk.field_o = kk.field_o + var9_int;
                    var7 = var7 + var9_int;
                    ug.field_f.field_t = ug.field_f.field_t + var9_int;
                    break L4;
                  }
                }
                L5: {
                  if ((var8 ^ -1) <= -1) {
                    break L5;
                  } else {
                    var9_int = -var8;
                    vi.field_d = vi.field_d + var9_int;
                    var8 = var8 + var9_int;
                    ug.field_f.field_x = ug.field_f.field_x + 2 * var9_int;
                    var6 = var6 + 2 * var9_int;
                    t.field_a = t.field_a - var9_int;
                    ug.field_f.field_s = ug.field_f.field_s + var9_int;
                    break L5;
                  }
                }
                L6: {
                  if ((ug.field_f.field_x ^ -1) > (var6 + var8 ^ -1)) {
                    var9_int = -ug.field_f.field_x + var8 + var6;
                    ug.field_f.field_s = ug.field_f.field_s + var9_int;
                    ug.field_f.field_x = ug.field_f.field_x + var9_int * 2;
                    var6 = var6 + 2 * var9_int;
                    var8 = var8 + var9_int;
                    t.field_a = t.field_a - var9_int;
                    vi.field_d = vi.field_d + var9_int;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ug.field_f.b();
                var9 = new pb(ug.field_f.field_w, ug.field_f.field_x);
                var9.e();
                int discarded$7 = o.field_h.a(var14, kk.field_o, vi.field_d, vh.field_i, i.field_a, 16777215, -1, 1, 1, o.field_h.field_N + o.field_h.field_r);
                oj.a(var9, 1, 0, var9.field_x, 3, 0, var9.field_w, true);
                ug.field_f.e();
                var9.e(0, 0);
                jd.field_a = new pb(640, 480);
                jd.field_a.e();
                ug.field_f.b(pk.field_g + (ug.field_f.field_w >> -792135007), (ug.field_f.field_x >> 125884513) + t.field_a, bl.field_d, 4096);
                ug.field_f = null;
                jd.field_a.d();
                ti.a(var28, var2, var3);
                ti.b(pk.field_i);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L7: {
            if (be.field_f == null) {
              break L7;
            } else {
              if (null != fj.field_f) {
                var29 = ti.field_a;
                var2 = ti.field_i;
                var3 = ti.field_b;
                ti.a(pk.field_i);
                var16 = new pb(412, 43);
                var5_ref = h.a(wg.field_b, 0, new String[1]);
                be.field_f = null;
                var16.e();
                int discarded$8 = fj.field_f.a(var5_ref, 3, 3, -6 + var16.field_v, var16.field_y - 6, 16777215, -1, 0, 1, fj.field_f.field_r + fj.field_f.field_N);
                oj.a(var16, 1, 0, var16.field_y, 3, 0, var16.field_v, true);
                ve.field_a.e();
                var16.e(199 + -ve.field_a.field_t, 83 - ve.field_a.field_s);
                ti.a(var29, var2, var3);
                ti.b(pk.field_i);
                break L7;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (null == eh.field_f) {
              break L8;
            } else {
              if (null == fj.field_f) {
                break L8;
              } else {
                var30 = ti.field_a;
                var2 = ti.field_i;
                var3 = ti.field_b;
                ti.a(pk.field_i);
                var4 = 6 + fj.field_f.b(li.field_a, 640);
                var5 = 20 + eh.field_f.field_w + var4;
                var6 = 427 + -(var5 / 2);
                var7 = 20 + (var6 - -eh.field_f.field_w);
                ve.field_a.e();
                fj.field_f.a(li.field_a, var7 - ve.field_a.field_t, fj.field_f.field_r + -ve.field_a.field_s + (155 - -fj.field_f.field_N), 16777215, -1);
                oj.a(ve.field_a, 1, -4 + (var7 - ve.field_a.field_t), 50, 3, 155 + -ve.field_a.field_s, var4, true);
                var8 = -ve.field_a.field_s + (155 - (-fj.field_f.field_r + -fj.field_f.field_N + (-3 + eh.field_f.field_x)) / 2);
                eh.field_f.e(-ve.field_a.field_t + var6, var8);
                ti.a(var30, var2, var3);
                ti.b(pk.field_i);
                eh.field_f = null;
                break L8;
              }
            }
          }
          L9: {
            ti.a(pk.field_i);
            ti.a(16, 16, 608, 112, 15, ki.field_t, jb.field_a);
            ti.a(231, 144, 393, 232, 15, ki.field_t, jb.field_a);
            if (null != tk.field_c) {
              tk.field_c.e(0, 0);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (null == pl.field_T) {
              break L10;
            } else {
              pl.field_T.e(0, 0);
              break L10;
            }
          }
          L11: {
            ve.field_a.e(0, 0);
            var1 = -52 % ((2 - param0) / 55);
            if (jd.field_a == null) {
              break L11;
            } else {
              jd.field_a.e(0, 0);
              break L11;
            }
          }
          L12: {
            if (null == fe.field_a) {
              break L12;
            } else {
              if (null == ui.field_F) {
                break L12;
              } else {
                L13: {
                  fe.field_a.e(231, 390);
                  var2_ref = dd.field_a;
                  if (cd.field_L.field_f != 0) {
                    break L13;
                  } else {
                    var2_ref = q.field_b;
                    break L13;
                  }
                }
                L14: {
                  var2_ref.e(0, 0);
                  stackOut_45_0 = 40;
                  stackOut_45_1 = 40;
                  stackOut_45_2 = gj.field_v;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  if ((cd.field_L.field_f ^ -1) == -1) {
                    stackOut_47_0 = stackIn_47_0;
                    stackOut_47_1 = stackIn_47_1;
                    stackOut_47_2 = stackIn_47_2;
                    stackOut_47_3 = 4;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    stackIn_48_3 = stackOut_47_3;
                    break L14;
                  } else {
                    stackOut_46_0 = stackIn_46_0;
                    stackOut_46_1 = stackIn_46_1;
                    stackOut_46_2 = stackIn_46_2;
                    stackOut_46_3 = 3;
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    stackIn_48_2 = stackOut_46_2;
                    stackIn_48_3 = stackOut_46_3;
                    break L14;
                  }
                }
                L15: {
                  var3 = stackIn_48_0 + (stackIn_48_1 * ih.b(stackIn_48_2 << stackIn_48_3, 64763) >> 743059824);
                  if (var3 <= 0) {
                    break L15;
                  } else {
                    fe.field_a.d(230, 389, var3);
                    fe.field_a.d(232, 389, var3);
                    fe.field_a.d(232, 391, var3);
                    fe.field_a.d(230, 391, var3);
                    var2_ref.d(1, 1, var3);
                    var2_ref.d(-1, 1, var3);
                    var2_ref.d(1, -1, var3);
                    var2_ref.d(-1, -1, var3);
                    break L15;
                  }
                }
                L16: {
                  if (-1 != (cd.field_L.field_f ^ -1)) {
                    stackOut_52_0 = 0;
                    stackIn_53_0 = stackOut_52_0;
                    break L16;
                  } else {
                    stackOut_51_0 = 1;
                    stackIn_53_0 = stackOut_51_0;
                    break L16;
                  }
                }
                tk.a(stackIn_53_0 != 0, wc.field_y, vi.field_a, -127);
                break L12;
              }
            }
          }
          L17: {
            if (null == fe.field_a) {
              break L17;
            } else {
              if (null == ui.field_F) {
                break L17;
              } else {
                L18: {
                  fe.field_a.e(434, 390);
                  na.field_e.e(0, 0);
                  if (1 == cd.field_L.field_f) {
                    ob.a(116, 436, 64, fe.field_a.field_v + -4, 7 * fe.field_a.field_y / 12, 392);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (1 != cd.field_L.field_f) {
                    stackOut_61_0 = 0;
                    stackIn_62_0 = stackOut_61_0;
                    break L19;
                  } else {
                    stackOut_60_0 = 1;
                    stackIn_62_0 = stackOut_60_0;
                    break L19;
                  }
                }
                tk.a(stackIn_62_0 != 0, cm.field_a, af.field_l, -108);
                break L17;
              }
            }
          }
          L20: {
            L21: {
              if (null == ea.field_l) {
                break L21;
              } else {
                var2 = 357 + -(ea.field_l.field_x / 2);
                ea.field_l.e(-ea.field_l.field_w + 269, var2);
                bk.field_b.e(586, var2);
                if (var2 >= eb.field_a) {
                  break L21;
                } else {
                  if ((eb.field_a ^ -1) > (ea.field_l.field_y + var2 ^ -1)) {
                    var3 = 40 - -(ih.b(gj.field_v << 277731588, 64763) * 40 >> -770925168);
                    if (-1 > (var3 ^ -1)) {
                      L22: {
                        if ((-ea.field_l.field_v + 269 ^ -1) <= (ni.field_e ^ -1)) {
                          break L22;
                        } else {
                          if (-270 < (ni.field_e ^ -1)) {
                            ea.field_l.d(-ea.field_l.field_w + 268, -1 + var2, var3);
                            ea.field_l.d(1 + (-ea.field_l.field_w + 269), -1 + var2, var3);
                            ea.field_l.d(-1 + (-ea.field_l.field_w + 269), 1 + var2, var3);
                            ea.field_l.d(-ea.field_l.field_w + 269 + 1, 1 + var2, var3);
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (-587 <= (ni.field_e ^ -1)) {
                        break L21;
                      } else {
                        if ((586 - -ea.field_l.field_v ^ -1) >= (ni.field_e ^ -1)) {
                          break L21;
                        } else {
                          bk.field_b.d(585, -1 + var2, var3);
                          bk.field_b.d(587, -1 + var2, var3);
                          bk.field_b.d(585, 1 + var2, var3);
                          bk.field_b.d(587, 1 + var2, var3);
                          break L21;
                        }
                      }
                    } else {
                      kc.a(36);
                      dl.field_C[nk.field_c].e(269, 340);
                      break L20;
                    }
                  } else {
                    break L21;
                  }
                }
              }
            }
            kc.a(36);
            dl.field_C[nk.field_c].e(269, 340);
            break L20;
          }
          return;
        } else {
          return;
        }
    }

    final static Boolean g(int param0) {
        Boolean var1 = nb.field_M;
        nb.field_M = null;
        if (param0 >= -111) {
            Boolean discarded$0 = wj.g(115);
        }
        return var1;
    }

    final void a(byte param0) {
        if (param0 <= 82) {
            wj.d((byte) -54);
        }
        if (((wj) this).field_s != null) {
            ((wj) this).field_s.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[255];
    }
}
