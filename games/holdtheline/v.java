/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class v extends n implements jm {
    ah field_D;
    static int field_C;
    static String[][] field_A;
    static int field_E;
    static int field_B;

    final void a(boolean param0, n param1) {
        if (!param0) {
            return;
        }
        ((v) this).field_D.a((byte) -94, (hl) (Object) param1);
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var7 = 0;
        int var8 = HoldTheLine.field_D;
        if (param1 != 0) {
            return;
        }
        tm var5 = new tm(((v) this).field_D);
        n var6 = (n) (Object) var5.c((byte) -114);
        while (var6 != null) {
            StringBuilder discarded$0 = param3.append(10);
            for (var7 = 0; param2 >= var7; var7++) {
                StringBuilder discarded$1 = param3.append(32);
            }
            StringBuilder discarded$2 = var6.a(1 + param2, (byte) 67, param0, param3);
            var6 = (n) (Object) var5.a((byte) -104);
        }
    }

    final static void a(byte param0, String param1, int param2, int param3, int param4) {
        nj.field_i.a(param3, param4);
        nm.field_c.a(param1, 15 + param3, -2 + (param4 + (nm.field_c.field_G + 30) / 2), param2, -1);
        int var5 = 72 / ((param0 - -43) / 61);
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_37_0 = 0;
            int stackIn_40_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_36_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = HoldTheLine.field_D;
                        if (null == lk.field_h) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (le.a(param4, (byte) 105)) {
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
                        if (a.field_S != d.field_f) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (param4) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        qk.field_j = wi.a((byte) 126, false, param2, param3);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        qk.field_j = eb.a((String) null, vd.field_a, false, param3, true);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        da.field_p.field_l = 0;
                        da.field_p.f(param1 ^ 110, 14);
                        da.field_p.f(param1 + 110, qk.field_j.a(true).field_a);
                        qn.a(-1, param1 ^ 1);
                        d.field_f = um.field_d;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (um.field_d != d.field_f) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (!hi.b(1, (byte) 40)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var6 = rd.field_e.f((byte) -102);
                        rd.field_e.field_l = 0;
                        if (var6 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        vn.field_c = var6;
                        d.field_f = uj.field_d;
                        ad.field_c = -1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        d.field_f = pb.field_c;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (pb.field_c != d.field_f) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (hi.b(8, (byte) 40)) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        qj.field_H = rd.field_e.d(true);
                        rd.field_e.field_l = 0;
                        dd.a(param1 ^ 1, param5, param0, qk.field_j, param4);
                        d.field_f = ui.field_l;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (d.field_f != ui.field_l) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (!hi.b(1, (byte) 40)) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var6 = rd.field_e.f((byte) -128);
                        vn.field_c = var6;
                        rd.field_e.field_l = 0;
                        ok.field_f = null;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (var6 != 1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        ad.field_c = -1;
                        d.field_f = fb.field_s;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var6 == 8) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        d.field_f = uj.field_d;
                        ad.field_c = -1;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        r.a(param1 ^ -28035);
                        uk.field_e = false;
                        return var6;
                    }
                    case 27: {
                        if (fb.field_s != d.field_f) {
                            statePc = 68;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (ok.a((byte) 55)) {
                            statePc = 30;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        vd.field_a = rd.field_e.d(true);
                        rb.field_x = rd.field_e.f((byte) -33);
                        int discarded$12 = rd.field_e.f((byte) -43);
                        fc.field_a = rd.field_e.k(-119);
                        var6_ref = rd.field_e.i(-1);
                        var7 = rd.field_e.f((byte) -57);
                        if (0 == (var7 & 1)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        j.a((byte) 66);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (!param4) {
                            statePc = 34;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (-1 == (4 & var7)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 36: {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        uj.field_c = stackIn_37_0 != 0;
                        if (-1 == (8 & var7)) {
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
                        ci.field_h = stackIn_40_0 != 0;
                        if (!ci.field_h) {
                            statePc = 41;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        if (!mi.field_f) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        int discarded$13 = rd.field_e.f((byte) -53);
                        int discarded$14 = rd.field_e.f((byte) -82);
                        int discarded$15 = rd.field_e.a(-116);
                        ho.field_l = rd.field_e.k(-59);
                        im.field_i = new byte[ho.field_l];
                        var8 = 0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (ho.field_l <= var8) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        im.field_i[var8] = rd.field_e.f(wb.a(param1, 1));
                        var8++;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 45: {
                        ng.field_e = rd.field_e.j(-1231);
                        var11 = (CharSequence) (Object) ng.field_e;
                        co.field_e = kf.a(var11, (byte) -12);
                        q.field_c = rd.field_e.f((byte) -95);
                        d.field_f = ad.field_b;
                        if (qk.field_j.a(true) == sb.field_d) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        if (qk.field_j.a(true) == jh.field_d) {
                            statePc = 48;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        gj.field_s.a(en.a(97), 125);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        ja.field_Wb.a(en.a(87), 127);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        uk.field_e = false;
                        if (var6_ref == null) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        tm.a(-32312, var6_ref, en.a(73));
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (-1 > (fc.field_a ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        if (!uj.field_c) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        try {
                            Object discarded$16 = eo.a(en.a(param1 ^ 79), new Object[1], false, "zap");
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        var8_ref_Throwable = caughtException;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            Object discarded$17 = eo.a(21896, "unzap", en.a(92));
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        var8_ref_Throwable = caughtException;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if ((fc.field_a ^ -1) < -1) {
                            statePc = 63;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        hc.field_b = true;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        da.field_p.a(gb.field_x, false);
                        var8 = 0;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (4 <= var8) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        gb.field_x[var8] = gb.field_x[var8] + 50;
                        var8++;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 67: {
                        rd.field_e.a(gb.field_x, false);
                        return vn.field_c;
                    }
                    case 68: {
                        if (d.field_f != uj.field_d) {
                            statePc = 77;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        if (ok.a((byte) 55)) {
                            statePc = 71;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        r.a(-28036);
                        if ((vn.field_c ^ -1) != -8) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        if (uk.field_e) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        uk.field_e = true;
                        return -1;
                    }
                    case 74: {
                        if ((vn.field_c ^ -1) != -8) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        vn.field_c = 3;
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 76: {
                        um.field_b = rd.field_e.j(param1 + -1232);
                        uk.field_e = false;
                        return vn.field_c;
                    }
                    case 77: {
                        if (null == lk.field_h) {
                            statePc = 79;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (uk.field_e) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        var6 = bo.field_e;
                        bo.field_e = ci.field_b;
                        ci.field_b = var6;
                        uk.field_e = true;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 81: {
                        if (30000L < sf.d(126)) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        um.field_b = dc.field_hb;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 83: {
                        um.field_b = mo.field_y;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 84: {
                        uk.field_e = false;
                        return 3;
                    }
                    case 85: {
                        if (param1 == 1) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        field_B = -82;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 87: {
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

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        int var9 = HoldTheLine.field_D;
        tm var7 = new tm(((v) this).field_D);
        if (param4 != -9) {
            return;
        }
        n var8 = (n) (Object) var7.c((byte) -128);
        while (var8 != null) {
            // ifeq L92
            var8.a(param0, param1, param2 + ((v) this).field_o, ((v) this).field_k + param3, (byte) -9, param5);
            var8 = (n) (Object) var7.a((byte) -104);
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
            Object var3 = null;
            boolean discarded$0 = ((v) this).a(25, (n) null, 78, 2, 104, 42, -126);
        }
        return ((v) this).f((byte) 118) != null ? true : false;
    }

    public static void e(byte param0) {
        field_A = null;
        if (param0 != 70) {
            field_C = -41;
        }
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        int var7 = HoldTheLine.field_D;
        tm var9 = new tm(((v) this).field_D);
        n var8 = (n) (Object) var9.c((byte) -120);
        while (var8 != null) {
            // ifeq L89
            if (var8.c((byte) -20)) {
                if (!(!var8.a(param0, param1, (byte) -78, param3))) {
                    return true;
                }
            }
            var8 = (n) (Object) var9.a((byte) -104);
        }
        int var6 = param1;
        if (!(80 != var6)) {
            return !lk.field_g[81] ? ((v) this).b(param0, 116) : ((v) this).c(param0, param2 + 77);
        }
        if (param2 != -78) {
            field_E = 5;
            return false;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int var10 = HoldTheLine.field_D;
        tm var8 = new tm(((v) this).field_D);
        n var9 = (n) (Object) var8.c((byte) -114);
        if (param4 != -108) {
            return false;
        }
        while (var9 != null) {
            // ifeq L103
            if (var9.a(((v) this).field_k + param0, param1, ((v) this).field_o + param2, param3, (byte) -108, param5, param6)) {
                return true;
            }
            var9 = (n) (Object) var8.a((byte) -104);
        }
        return false;
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var2 = 0;
        tm var3 = new tm(((v) this).field_D);
        if (param0 >= -66) {
            field_A = null;
        }
        n var4 = (n) (Object) var3.c((byte) 119);
        while (var4 != null) {
            var5 = var4.d((byte) -123);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (n) (Object) var3.a((byte) -104);
        }
        return var2;
    }

    void a(int param0, n param1, int param2, byte param3) {
        int var7 = HoldTheLine.field_D;
        super.a(param0, param1, param2, param3);
        tm var5 = new tm(((v) this).field_D);
        n var6 = (n) (Object) var5.c((byte) -115);
        while (var6 != null) {
            // ifeq L90
            var6.a(((v) this).field_k + param0, param1, param2 - -((v) this).field_o, (byte) -3);
            var6 = (n) (Object) var5.a((byte) -104);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param3 == 0) {
            if (null != ((v) this).field_l) {
                ((v) this).field_l.a(true, param2, -76, (n) this, param1);
            }
        }
        tm var5 = new tm(((v) this).field_D);
        if (param0 != -9532) {
            return;
        }
        n var6 = (n) (Object) var5.a(8115);
        while (var6 != null) {
            var6.a(-9532, param1 + ((v) this).field_o, param2 - -((v) this).field_k, param3);
            var6 = (n) (Object) var5.a(false);
        }
    }

    final static boolean a(th param0, byte param1) {
        int var2 = param0.f((byte) -26);
        int var3 = 1 == var2 ? 1 : 0;
        if (param1 <= 56) {
            return false;
        }
        return var3 != 0;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ib param6, boolean param7, long param8, String param9, int param10, int param11, boolean param12, int param13) {
        try {
            rd.field_e = new da(param2);
            da.field_p = new da(param3);
            de.field_L = param11;
            ci.field_n = param13;
            na.field_s = param6;
            hc.field_b = param1 ? true : false;
            ce.field_m = param10;
            ci.field_b = param4;
            if (!param12) {
                field_E = 98;
            }
            uj.field_f = param9;
            ih.field_i = param8;
            bo.field_e = param5;
            oi.field_b = param0;
            mi.field_f = param7 ? true : false;
            if (null != na.field_s.field_a) {
                try {
                    ao.field_c = new ud(na.field_s.field_a, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    v(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (tb) null);
        ((v) this).field_D = new ah();
    }

    final boolean a(n param0, int param1) {
        int var5 = HoldTheLine.field_D;
        tm var3 = new tm(((v) this).field_D);
        if (param1 != -25823) {
            return true;
        }
        n var4 = (n) (Object) var3.c((byte) -2);
        while (var4 != null) {
            if (var4.a(param0, -25823)) {
                return true;
            }
            var4 = (n) (Object) var3.a((byte) -104);
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 <= 97) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 54), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String f(int param0) {
        String var4 = null;
        int var5 = HoldTheLine.field_D;
        tm var2 = new tm(((v) this).field_D);
        n var3 = (n) (Object) var2.c((byte) -118);
        while (var3 != null) {
            var4 = var3.f(param0 + 0);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (n) (Object) var2.a((byte) -104);
        }
        if (param0 == 0) {
            return null;
        }
        Object var6 = null;
        this.a((Hashtable) null, 49, 4, (StringBuilder) null);
        return null;
    }

    final boolean b(n param0, int param1) {
        tm var5 = null;
        n var6 = null;
        int var7 = HoldTheLine.field_D;
        if (param1 < 111) {
            return true;
        }
        if (!(!((v) this).field_D.b(0))) {
            return false;
        }
        tm var3 = new tm(((v) this).field_D);
        n var4 = (n) (Object) var3.c((byte) -119);
        while (var4 != null) {
            if (!(!var4.c((byte) -20))) {
                var5 = new tm(((v) this).field_D);
                hl discarded$0 = var5.a((hl) (Object) var4, (byte) -125);
                var6 = (n) (Object) var5.a((byte) -104);
                while (var6 != null) {
                    if (var6.a(param0, -25823)) {
                        return true;
                    }
                    var6 = (n) (Object) var5.a((byte) -104);
                }
            }
            var4 = (n) (Object) var3.a((byte) -104);
        }
        return false;
    }

    private final void a(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(((v) this).field_D);
        if (param0 != 15) {
            Object var5 = null;
            boolean discarded$0 = ((v) this).a((n) null, 83);
        }
        n var3 = (n) (Object) var2.c((byte) -114);
        while (var3 != null) {
            var3.g(92);
            var3 = (n) (Object) var2.a((byte) -104);
        }
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        if (!(!((v) this).a(20720, param2, param3, param0))) {
            ((v) this).a(param2, param0, true, param3);
            this.a(param2, 0, param0, param3);
        }
        int var5 = -111 % ((0 - param1) / 49);
        return param3;
    }

    final boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        int var10 = HoldTheLine.field_D;
        tm var8 = new tm(((v) this).field_D);
        if (param6 != -24898) {
            return true;
        }
        n var9 = (n) (Object) var8.c((byte) 61);
        while (var9 != null) {
            // ifeq L106
            if (var9.c((byte) -20)) {
                if (!(!var9.a(param0, param1, param2, param3, param4, param5, param6 + 0))) {
                    return true;
                }
            }
            var9 = (n) (Object) var8.a((byte) -104);
        }
        return false;
    }

    final void e(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(((v) this).field_D);
        n var3 = (n) (Object) var2.c((byte) -122);
        if (param0 < 15) {
            return;
        }
        while (var3 != null) {
            var3.e(55);
            var3 = (n) (Object) var2.a((byte) -104);
        }
    }

    final boolean c(n param0, int param1) {
        tm var5 = null;
        n var6 = null;
        int var7 = HoldTheLine.field_D;
        if (((v) this).field_D.b(0)) {
            return false;
        }
        if (param1 != -1) {
            return true;
        }
        tm var3 = new tm(((v) this).field_D);
        n var4 = (n) (Object) var3.a(8115);
        while (var4 != null) {
            if (var4.c((byte) -20)) {
                var5 = new tm(((v) this).field_D);
                hl discarded$0 = var5.a(-10279, (hl) (Object) var4);
                var6 = (n) (Object) var5.a(false);
                while (var6 != null) {
                    if (!(!var6.a(param0, param1 + -25822))) {
                        return true;
                    }
                    var6 = (n) (Object) var5.a(false);
                }
            }
            var4 = (n) (Object) var3.a(false);
        }
        return false;
    }

    n f(byte param0) {
        tm var2 = null;
        n var3 = null;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          var2 = new tm(((v) this).field_D);
          var3 = (n) (Object) var2.c((byte) -122);
          if (param0 > 73) {
            break L0;
          } else {
            field_E = 118;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.c((byte) -20)) {
              return var3;
            } else {
              var3 = (n) (Object) var2.a((byte) -104);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param1 ^ 117);
    }

    final static void a(int param0, int param1, fo param2) {
        if (param0 != 3) {
            field_E = -111;
        }
        da var3 = da.field_p;
        var3.c((byte) 33, param1);
        var3.f(param0 + 108, param2.field_j);
        var3.b(-652561784, param2.field_l);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = -1;
    }
}
