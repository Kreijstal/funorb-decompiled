/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class da extends ae {
    static int field_m;
    private bc field_q;
    static qe field_n;
    static qj[][] field_p;
    static int field_o;

    final static li a(ik param0, int param1, byte param2) {
        if (param2 > -108) {
            da.a(79, (byte) -19);
        }
        return bd.a(-31085, bh.a(param0, 100, param1));
    }

    final void c(byte param0) {
        if (!(((da) this).field_q == null)) {
            ((da) this).field_q.d(param0 ^ 16777114);
        }
        if (param0 != 101) {
            da.a(-15, (byte) 51);
        }
    }

    final static int a(boolean param0, boolean param1, String param2, String param3, int param4, int param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = TrackController.field_F ? 1 : 0;
                        if (r.field_i == null) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!bf.a(param1, (byte) 104)) {
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
                        if (param4 > 67) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 76;
                    }
                    case 7: {
                        if (jc.field_a == gk.field_a) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        if (param1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        af.field_o = rl.a(20, false, param3, param2);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 11: {
                        var10 = null;
                        af.field_o = ie.a(nl.field_e, param3, false, (String) null, (byte) -119);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        ra.field_C.field_k = 0;
                        ra.field_C.a(14, (byte) -72);
                        ra.field_C.a(af.field_o.a(false).field_b, (byte) -100);
                        me.a(-1, -1);
                        jc.field_a = sg.field_d;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (jc.field_a == sg.field_d) {
                            statePc = 15;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (!hf.a(1, false)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (jc.field_a != md.field_e) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (!hf.a(8, false)) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        h.field_d = ne.field_a.f((byte) 110);
                        ne.field_a.field_k = 0;
                        md.a(af.field_o, param5, param1, -1, param0);
                        jc.field_a = ca.field_b;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 19: {
                        if (jc.field_a != md.field_e) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (!hf.a(8, false)) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        h.field_d = ne.field_a.f((byte) 110);
                        ne.field_a.field_k = 0;
                        md.a(af.field_o, param5, param1, -1, param0);
                        jc.field_a = ca.field_b;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 23: {
                        if (jc.field_a != md.field_e) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (!hf.a(8, false)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        h.field_d = ne.field_a.f((byte) 110);
                        ne.field_a.field_k = 0;
                        md.a(af.field_o, param5, param1, -1, param0);
                        jc.field_a = ca.field_b;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if (ca.field_b != jc.field_a) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (!hf.a(1, false)) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        var6 = ne.field_a.h(16383);
                        kg.field_a = null;
                        uk.field_c = var6;
                        ne.field_a.field_k = 0;
                        if (var6 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (var6 != 1) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        hd.field_o = -1;
                        jc.field_a = qe.field_C;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 32: {
                        if (8 == var6) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        jc.field_a = ij.field_j;
                        hd.field_o = -1;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 34: {
                        lj.a((byte) 124);
                        kg.field_f = false;
                        return var6;
                    }
                    case 35: {
                        if (jc.field_a == qe.field_C) {
                            statePc = 37;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (fh.a(520)) {
                            statePc = 39;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        nl.field_e = ne.field_a.f((byte) 28);
                        sl.field_j = ne.field_a.h(16383);
                        int discarded$12 = ne.field_a.h(16383);
                        hk.field_d = ne.field_a.d((byte) -67);
                        var6_ref = ne.field_a.d(19016);
                        var7 = ne.field_a.h(16383);
                        if ((1 & var7) == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        qi.b(8770);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (!param1) {
                            statePc = 43;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if ((4 & var7) == 0) {
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
                        fd.field_i = stackIn_46_0 != 0;
                        if ((8 & var7) == 0) {
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
                        fi.field_o = stackIn_49_0 != 0;
                        if (fi.field_o) {
                            statePc = 50;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        if (!mk.field_c) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        int discarded$13 = ne.field_a.h(16383);
                        int discarded$14 = ne.field_a.h(16383);
                        int discarded$15 = ne.field_a.e((byte) 113);
                        jd.field_d = ne.field_a.d((byte) -118);
                        qa.field_a = new byte[jd.field_d];
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (jd.field_d <= var8) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        qa.field_a[var8] = ne.field_a.f(-127);
                        var8++;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 54: {
                        ue.field_a = ne.field_a.g(0);
                        var11 = (CharSequence) (Object) ue.field_a;
                        dd.field_p = r.a(var11, -11133);
                        si.field_d = ne.field_a.h(16383);
                        jc.field_a = ka.field_b;
                        if (af.field_o.a(false) != nd.field_M) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        rd.field_o.a(gd.b((byte) 77), -4);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 56: {
                        if (af.field_o.a(false) == ji.field_a) {
                            statePc = 58;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        qi.field_f.a(gd.b((byte) 77), -4);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        kg.field_f = false;
                        if (var6_ref != null) {
                            statePc = 61;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        dh.a(-19136, var6_ref, gd.b((byte) 77));
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (hk.field_d > 0) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        if (fd.field_i) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        try {
                            Object discarded$16 = sj.a((byte) -128, "unzap", gd.b((byte) 77));
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        var8_ref_Throwable = caughtException;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 68: {
                        try {
                            Object discarded$17 = sj.a(gd.b((byte) 77), new Object[1], 7648, "zap");
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        var8_ref_Throwable = caughtException;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        if (-1 > (hk.field_d ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        oc.field_i = true;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        ra.field_C.a((byte) -83, pl.field_a);
                        var8 = 0;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        if (4 <= var8) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        pl.field_a[var8] = pl.field_a[var8] + 50;
                        var8++;
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 77: {
                        ne.field_a.a((byte) -83, pl.field_a);
                        return uk.field_c;
                    }
                    case 78: {
                        if (jc.field_a != ij.field_j) {
                            statePc = 87;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (!fh.a(520)) {
                            statePc = 87;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        lj.a((byte) 124);
                        if (-8 != uk.field_c) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (kg.field_f) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        kg.field_f = true;
                        return -1;
                    }
                    case 83: {
                        if (-8 == uk.field_c) {
                            statePc = 85;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        uk.field_c = 3;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        fi.field_t = ne.field_a.g(0);
                        kg.field_f = false;
                        return uk.field_c;
                    }
                    case 87: {
                        if (r.field_i != null) {
                            statePc = 94;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        if (!kg.field_f) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if ((bj.b(-21676) ^ -1L) >= -30001L) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        fi.field_t = nk.field_j;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 91: {
                        fi.field_t = cf.field_m;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        kg.field_f = false;
                        return 3;
                    }
                    case 93: {
                        var6 = ke.field_c;
                        ke.field_c = ma.field_c;
                        ma.field_c = var6;
                        kg.field_f = true;
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

    final void b(byte param0) {
        try {
            ((da) this).field_q.d(16777215);
        } catch (Exception exception) {
        }
        ((da) this).field_q = null;
        if (param0 <= 95) {
            field_m = 57;
        }
        ((da) this).field_b = -1;
        ((da) this).field_e = ((da) this).field_e + 1;
        ((da) this).field_i = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void e(int param0) {
        field_n = null;
        field_p = null;
        if (param0 < 63) {
            field_p = null;
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            be stackIn_3_0 = null;
            be stackIn_4_0 = null;
            be stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            be stackOut_2_0 = null;
            be stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            be stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((da) this).field_q) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((da) this).field_g.field_k = 0;
                            stackOut_2_0 = ((da) this).field_g;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_3_0 = stackOut_2_0;
                            if (!param0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (be) (Object) stackIn_3_0;
                            stackOut_3_1 = 2;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (be) (Object) stackIn_4_0;
                            stackOut_4_1 = 3;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((be) (Object) stackIn_5_0).a(stackIn_5_1, (byte) -127);
                            ((da) this).field_g.a(2488, 0L);
                            ((da) this).field_q.a(-103, ((da) this).field_g.field_j, ((da) this).field_g.field_j.length, param1);
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
                            ((da) this).field_q.d(16777215);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((da) this).field_b = -2;
                        ((da) this).field_e = ((da) this).field_e + 1;
                        ((da) this).field_q = null;
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

    final static void a(int param0, byte param1) {
        int var3 = TrackController.field_F ? 1 : 0;
        qd.field_d = param0;
        li var2 = (li) (Object) kd.field_a.b(2);
        if (param1 != -74) {
            field_p = null;
        }
        while (var2 != null) {
            if (!var2.field_k.b(10000536)) {
                var2.a(-76);
            } else {
                var2.field_j.g(128 + var2.field_m * qd.field_d >> -892832824);
            }
            var2 = (li) (Object) kd.field_a.a(param1 ^ -68);
        }
        if (jk.field_c == null) {
        } else {
            var2 = (li) (Object) jk.field_c.b(2);
            while (var2 != null) {
                if (var2.field_k.b(param1 ^ -10000594)) {
                    var2.field_j.g(128 + qd.field_d * var2.field_m >> -1893181208);
                } else {
                    var2.a(-33);
                }
                var2 = (li) (Object) jk.field_c.a(10);
            }
        }
    }

    public da() {
    }

    private final void d(byte param0) {
        try {
            IOException var2 = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((da) this).field_q == null) {
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
                        try {
                            ((da) this).field_g.field_k = 0;
                            ((da) this).field_g.a(6, (byte) -59);
                            ((da) this).field_g.c((byte) -38, 3);
                            ((da) this).field_g.b(0, (byte) -118);
                            ((da) this).field_q.a(-102, ((da) this).field_g.field_j, ((da) this).field_g.field_j.length, 0);
                            if (param0 < -5) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            field_p = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((da) this).field_q.d(16777215);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((da) this).field_e = ((da) this).field_e + 1;
                        ((da) this).field_b = -2;
                        ((da) this).field_q = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
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

    final void a(byte param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            hi var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TrackController.field_F ? 1 : 0;
                        if (null != ((da) this).field_q) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((da) this).field_q.d(16777215);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((da) this).field_q = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((da) this).field_q = (bc) param2;
                        this.d((byte) -42);
                        this.a(param1, 0);
                        ((da) this).field_l = null;
                        ((da) this).field_a.field_k = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (hi) (Object) ((da) this).field_c.a(-58);
                        if (var4_ref2 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((da) this).field_f.a((gb) (Object) var4_ref2, true);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (hi) (Object) ((da) this).field_k.a(-58);
                        if (var4_ref2 == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((da) this).field_h.a((gb) (Object) var4_ref2, true);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param0 == 121) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((da) this).c((byte) 104);
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((da) this).field_i != 0) {
                            statePc = 16;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((da) this).field_g.field_k = 0;
                            ((da) this).field_g.a(4, (byte) -112);
                            ((da) this).field_g.a((int) ((da) this).field_i, (byte) -99);
                            ((da) this).field_g.b(false, 0);
                            ((da) this).field_q.a(-126, ((da) this).field_g.field_j, ((da) this).field_g.field_j.length, 0);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            ((da) this).field_q.d(16777215);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((da) this).field_b = -2;
                        ((da) this).field_q = null;
                        ((da) this).field_e = ((da) this).field_e + 1;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((da) this).field_d = 0;
                        ((da) this).field_j = qg.a(false);
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

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            hi var2_ref = null;
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
            hi var14_ref = null;
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
                        var16 = TrackController.field_F ? 1 : 0;
                        if (null != ((da) this).field_q) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = qg.a(false);
                        var4 = (int)(-((da) this).field_j + var2_long);
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
                        ((da) this).field_j = var2_long;
                        ((da) this).field_d = ((da) this).field_d + var4;
                        if (30000 < ((da) this).field_d) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((da) this).field_q.d(param0 + 16748049);
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
                        ((da) this).field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != ((da) this).field_q) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((da) this).a((byte) 105)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 == ((da) this).a(param0 ^ 29161)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        return true;
                    }
                    case 16: {
                        if (param0 == 29166) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        return true;
                    }
                    case 18: {
                        try {
                            ((da) this).field_q.a(true);
                            var2_ref = (hi) (Object) ((da) this).field_f.b(48);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2_ref == null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((da) this).field_g.field_k = 0;
                            ((da) this).field_g.a(1, (byte) -96);
                            ((da) this).field_g.a(2488, var2_ref.field_m);
                            ((da) this).field_q.a(-124, ((da) this).field_g.field_j, ((da) this).field_g.field_j.length, 0);
                            ((da) this).field_c.a((gb) (Object) var2_ref, true);
                            var2_ref = (hi) (Object) ((da) this).field_f.a((byte) 108);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_ref = (hi) (Object) ((da) this).field_h.b(48);
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
                            if (var2_ref == null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((da) this).field_g.field_k = 0;
                            ((da) this).field_g.a(0, (byte) -74);
                            ((da) this).field_g.a(2488, var2_ref.field_m);
                            ((da) this).field_q.a(-106, ((da) this).field_g.field_j, ((da) this).field_g.field_j.length, 0);
                            ((da) this).field_k.a((gb) (Object) var2_ref, true);
                            var2_ref = (hi) (Object) ((da) this).field_h.a((byte) 113);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var2_int = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 85;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((da) this).field_q.b(0);
                            if ((var3_int ^ -1) > -1) {
                                statePc = 28;
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
                            statePc = 29;
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
                            if (0 == var3_int) {
                                statePc = 85;
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
                            ((da) this).field_d = 0;
                            var4 = 0;
                            if (null == ((da) this).field_l) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((da) this).field_l.field_z == 0) {
                                statePc = 33;
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
                            statePc = 35;
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
                            if ((var4 ^ -1) < -1) {
                                statePc = 50;
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
                            var5 = -((da) this).field_l.field_B + ((da) this).field_l.field_x.field_j.length;
                            var6 = -((da) this).field_l.field_z + 512;
                            if (var6 > -((da) this).field_l.field_x.field_k + var5) {
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
                            var6 = var5 - ((da) this).field_l.field_x.field_k;
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
                            if (var3_int < var6) {
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
                            ((da) this).field_q.a(((da) this).field_l.field_x.field_j, 0, var6, ((da) this).field_l.field_x.field_k);
                            if (-1 == (((da) this).field_i ^ -1)) {
                                statePc = 46;
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
                            var7 = 0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var7 >= var6) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((da) this).field_l.field_x.field_j[((da) this).field_l.field_x.field_k - -var7] = (byte)ma.a((int) ((da) this).field_l.field_x.field_j[((da) this).field_l.field_x.field_k + var7], (int) ((da) this).field_i);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((da) this).field_l.field_x.field_k = ((da) this).field_l.field_x.field_k + var6;
                            ((da) this).field_l.field_z = ((da) this).field_l.field_z + var6;
                            if (var5 != ((da) this).field_l.field_x.field_k) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((da) this).field_l.e(param0 + -29166);
                            ((da) this).field_l.field_w = false;
                            ((da) this).field_l = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-513 != (((da) this).field_l.field_z ^ -1)) {
                                statePc = 84;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((da) this).field_l.field_z = 0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var5 = var4 + -((da) this).field_a.field_k;
                            if (var3_int >= var5) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = var3_int;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((da) this).field_q.a(((da) this).field_a.field_j, 0, var5, ((da) this).field_a.field_k);
                            if (((da) this).field_i == 0) {
                                statePc = 56;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var6 = 0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var5 <= var6) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((da) this).field_a.field_j[((da) this).field_a.field_k + var6] = (byte)ma.a((int) ((da) this).field_a.field_j[((da) this).field_a.field_k + var6], (int) ((da) this).field_i);
                            var6++;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((da) this).field_a.field_k = ((da) this).field_a.field_k + var5;
                            if (((da) this).field_a.field_k >= var4) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (null != ((da) this).field_l) {
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
                            ((da) this).field_a.field_k = 0;
                            var6 = ((da) this).field_a.h(16383);
                            var7 = ((da) this).field_a.e((byte) 113);
                            var8 = ((da) this).field_a.h(16383);
                            var9 = ((da) this).field_a.e((byte) 113);
                            var10 = var8 & 127;
                            if (-1 == (128 & var8 ^ -1)) {
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
                            var12 = (long)var7 + ((long)var6 << -1146053600);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 67;
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
                            var14_ref = (hi) (Object) ((da) this).field_k.b(48);
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
                            if ((var12 ^ -1L) == (var14_ref.field_m ^ -1L)) {
                                statePc = 72;
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
                            var14_ref = (hi) (Object) ((da) this).field_k.a((byte) 109);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14_ref = (hi) (Object) ((da) this).field_c.b(48);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var14_ref == null) {
                                statePc = 72;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var12 != var14_ref.field_m) {
                                statePc = 71;
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
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var14_ref = (hi) (Object) ((da) this).field_c.a((byte) 118);
                            statePc = 68;
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
                            if (0 == var10) {
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
                            stackOut_76_0 = 9;
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
                            stackOut_77_0 = 5;
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
                            ((da) this).field_l = var14_ref;
                            ((da) this).field_l.field_x = new be(var9 - (-var15 + -((da) this).field_l.field_B));
                            ((da) this).field_l.field_x.a(var10, (byte) -120);
                            ((da) this).field_l.field_x.b(false, var9);
                            ((da) this).field_l.field_z = 10;
                            ((da) this).field_a.field_k = 0;
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
                            if (0 != ((da) this).field_l.field_z) {
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
                            if (((da) this).field_a.field_j[0] == -1) {
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
                            ((da) this).field_l = null;
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
                            ((da) this).field_l.field_z = 1;
                            ((da) this).field_a.field_k = 0;
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
                            statePc = 25;
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
                            ((da) this).field_q.d(16777215);
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
                        ((da) this).field_q = null;
                        ((da) this).field_b = -2;
                        ((da) this).field_e = ((da) this).field_e + 1;
                        if (((da) this).a((byte) 105) != 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (0 == ((da) this).a(7)) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        return false;
                    }
                    case 95: {
                        return true;
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
        field_m = 20;
    }
}
