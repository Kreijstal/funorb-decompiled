/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static nd field_a;
    private long field_c;
    private RandomAccessFile field_i;
    static nd field_h;
    private long field_f;
    static fk field_b;
    static bd field_g;
    static bd[] field_d;
    static int field_e;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            ee.b(121);
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_d = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        if (param2) {
            return 95;
        }
        if ((ln.field_a.field_o[param1] ^ -1) <= -1) {
            return sa.a((byte) -118, param1) >> -1595378879;
        }
        return sa.a((byte) -115, param1);
    }

    final void c(int param0) throws IOException {
        if (param0 != -1) {
            Object var3 = null;
            int discarded$0 = ee.a(true, 30, true, -25, (String) null, (String) null);
        }
        if (((ee) this).field_i != null) {
            ((ee) this).field_i.close();
            ((ee) this).field_i = null;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((ee) this).field_i == null)) {
            System.out.println("");
            ((ee) this).c(-1);
        }
    }

    final void a(int param0, long param1) throws IOException {
        ((ee) this).field_i.seek(param1);
        if (param0 != -18127) {
            ee.b(35);
        }
        ((ee) this).field_f = param1;
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        if (param1) {
            field_b = null;
        }
        int var5 = ((ee) this).field_i.read(param0, param3, param2);
        if (!(-1 <= (var5 ^ -1))) {
            ((ee) this).field_f = ((ee) this).field_f + (long)var5;
        }
        return var5;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (((ee) this).field_c < (long)param3 + ((ee) this).field_f) {
            ((ee) this).field_i.seek(((ee) this).field_c);
            ((ee) this).field_i.write(1);
            throw new EOFException();
        }
        ((ee) this).field_i.write(param1, param2, param3);
        ((ee) this).field_f = ((ee) this).field_f + (long)param3;
    }

    final static int a(boolean param0, int param1, boolean param2, int param3, String param4, String param5) {
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
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = HostileSpawn.field_I ? 1 : 0;
                        if (null == ag.field_t) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (me.a(param0, 107)) {
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
                        if (param3 <= -85) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var10 = null;
                        int discarded$14 = ee.a(true, 46, false, -119, (String) null, (String) null);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (rc.field_a != sa.field_c) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (!param0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = null;
                        t.field_i = ul.a(false, (String) null, ib.field_d, param5, 112);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 9: {
                        t.field_i = mk.a(false, param5, 113, param4);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        s.field_b.field_i = 0;
                        s.field_b.d(94, 14);
                        s.field_b.d(89, t.field_i.a(false).field_a);
                        mb.d(-1, -22370);
                        rc.field_a = ci.field_h;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (rc.field_a != ci.field_h) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (re.c((byte) 33, 1)) {
                            statePc = 14;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var6 = sc.field_g.l(32270);
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        rc.field_a = dc.field_e;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        jd.field_q = -1;
                        wa.field_k = var6;
                        rc.field_a = bi.field_a;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        sc.field_g.field_i = 0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (dc.field_e == rc.field_a) {
                            statePc = 20;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (!re.c((byte) 33, 8)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        d.field_y = sc.field_g.c(10818);
                        sc.field_g.field_i = 0;
                        ln.a(t.field_i, (byte) -73, param1, param0, param2);
                        rc.field_a = ej.field_q;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (ej.field_q == rc.field_a) {
                            statePc = 24;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (!re.c((byte) 33, 1)) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var6 = sc.field_g.l(32270);
                        wa.field_k = var6;
                        sc.field_g.field_i = 0;
                        fl.field_b = null;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if ((var6 ^ -1) != -2) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        rc.field_a = wj.field_N;
                        jd.field_q = -1;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 29: {
                        if ((var6 ^ -1) != -9) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        le.c((byte) 67);
                        jn.field_C = false;
                        return var6;
                    }
                    case 31: {
                        jd.field_q = -1;
                        rc.field_a = bi.field_a;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (rc.field_a == wj.field_N) {
                            statePc = 34;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (eb.a(13372)) {
                            statePc = 36;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        ib.field_d = sc.field_g.c(10818);
                        li.field_q = sc.field_g.l(32270);
                        int discarded$15 = sc.field_g.l(32270);
                        wb.field_S = sc.field_g.e(8);
                        var12 = sc.field_g.a((byte) 28);
                        var7 = sc.field_g.l(32270);
                        if (-1 != (1 & var7 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        rd.a(-6);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (!param0) {
                            statePc = 41;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        if ((4 & var7) == 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        wg.field_ub = stackIn_44_0 != 0;
                        if ((8 & var7) == 0) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        ei.field_t = stackIn_47_0 != 0;
                        if (!ei.field_t) {
                            statePc = 48;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        if (sd.field_u) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        int discarded$16 = sc.field_g.l(32270);
                        int discarded$17 = sc.field_g.l(32270);
                        int discarded$18 = sc.field_g.d(8195);
                        l.field_a = sc.field_g.e(8);
                        qj.field_h = new byte[l.field_a];
                        var8 = 0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (l.field_a <= var8) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        qj.field_h[var8] = sc.field_g.j(0);
                        var8++;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 53: {
                        qg.field_r = sc.field_g.o(32);
                        var13 = (CharSequence) (Object) qg.field_r;
                        se.field_c = mf.a(false, var13);
                        ca.field_a = sc.field_g.l(32270);
                        rc.field_a = ci.field_d;
                        if (t.field_i.a(false) == uk.field_a) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        if (t.field_i.a(false) == ln.field_l) {
                            statePc = 56;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        wh.field_c.a((byte) -109, bn.c(-1));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        ub.field_b.a((byte) -126, bn.c(-1));
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        jn.field_C = false;
                        if (var12 != null) {
                            statePc = 60;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        gb.a((byte) 62, bn.c(-1), var12);
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (0 < wb.field_S) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        if (wg.field_ub) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            Object discarded$19 = a.a("unzap", bn.c(-1), -124);
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
                            Object discarded$20 = a.a(bn.c(-1), new Object[1], "zap", -13730);
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
                        if (-1 <= (wb.field_S ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        wc.field_g = true;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        s.field_b.a(he.field_s, 8);
                        var8 = 0;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        if (var8 >= 4) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        he.field_s[var8] = he.field_s[var8] + 50;
                        var8++;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 75: {
                        sc.field_g.a(he.field_s, 8);
                        return wa.field_k;
                    }
                    case 76: {
                        if (bi.field_a != rc.field_a) {
                            statePc = 85;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if (!eb.a(13372)) {
                            statePc = 85;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        le.c((byte) 83);
                        if (wa.field_k != 7) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (jn.field_C) {
                            statePc = 81;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        jn.field_C = true;
                        return -1;
                    }
                    case 81: {
                        if (7 == wa.field_k) {
                            statePc = 83;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        wa.field_k = 3;
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 84: {
                        km.field_x = sc.field_g.o(32);
                        jn.field_C = false;
                        return wa.field_k;
                    }
                    case 85: {
                        if (ag.field_t != null) {
                            statePc = 92;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        if (!jn.field_C) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        if (m.a(true) <= 30000L) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        km.field_x = od.field_H;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 89: {
                        km.field_x = fl.field_d;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 90: {
                        jn.field_C = false;
                        return 3;
                    }
                    case 91: {
                        var6 = cb.field_c;
                        cb.field_c = fh.field_b;
                        fh.field_b = var6;
                        jn.field_C = true;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
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

    final long a(int param0) throws IOException {
        if (param0 != -1) {
            return -92L;
        }
        return ((ee) this).field_i.length();
    }

    ee(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((ee) this).field_i = new RandomAccessFile(param0, param1);
        ((ee) this).field_f = 0L;
        ((ee) this).field_c = param2;
        int var5 = ((ee) this).field_i.read();
        if ((var5 ^ -1) != 0) {
            if (!param1.equals((Object) (Object) "r")) {
                ((ee) this).field_i.seek(0L);
                ((ee) this).field_i.write(var5);
            }
        }
        ((ee) this).field_i.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nd(15, 0, 1, 0);
        field_h = new nd(8, 0, 4, 1);
        field_b = new fk();
        field_e = 0;
    }
}
