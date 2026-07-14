/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl extends vb {
    private wb field_u;
    static int[][] field_t;
    static int field_v;
    static ka[] field_s;

    public static void e(int param0) {
        field_s = null;
        if (param0 != -25984) {
            field_s = null;
        }
        field_t = null;
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            uf stackIn_6_0 = null;
            uf stackIn_7_0 = null;
            uf stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            uf stackOut_5_0 = null;
            uf stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            uf stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param1 <= -50) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        this.d((byte) -9);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == ((fl) this).field_u) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            ((fl) this).field_d.field_q = 0;
                            stackOut_5_0 = ((fl) this).field_d;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (!param0) {
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
                            stackOut_6_0 = (uf) (Object) stackIn_6_0;
                            stackOut_6_1 = 2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
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
                            stackOut_7_0 = (uf) (Object) stackIn_7_0;
                            stackOut_7_1 = 3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
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
                            ((uf) (Object) stackIn_8_0).d(stackIn_8_1, (byte) 122);
                            ((fl) this).field_d.a(0L, -1709073240);
                            ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 98, ((fl) this).field_d.field_m);
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
                            ((fl) this).field_u.a((byte) -35);
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
                        ((fl) this).field_u = null;
                        ((fl) this).field_b = -2;
                        ((fl) this).field_h = ((fl) this).field_h + 1;
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

    final void a(int param0) {
        if (!(null == ((fl) this).field_u)) {
            ((fl) this).field_u.a((byte) 111);
        }
        if (param0 != -19315) {
            ((fl) this).field_u = null;
        }
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            db var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TorChallenge.field_F ? 1 : 0;
                        if (null != ((fl) this).field_u) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((fl) this).field_u.a((byte) 107);
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
                        ((fl) this).field_u = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((fl) this).field_u = (wb) param1;
                        this.d((byte) 2);
                        this.a(param0, (byte) -71);
                        ((fl) this).field_o.field_q = 0;
                        ((fl) this).field_p = null;
                        if (param2 == 115) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var7 = null;
                        boolean discarded$1 = fl.a((pa) null, (byte) 59);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (db) (Object) ((fl) this).field_l.c(-1);
                        if (var4_ref2 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((fl) this).field_c.a((w) (Object) var4_ref2, 3329);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (db) (Object) ((fl) this).field_i.c(-1);
                        if (var4_ref2 != null) {
                            statePc = 13;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((fl) this).field_k.a((w) (Object) var4_ref2, param2 + 3214);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 14: {
                        if (0 == ((fl) this).field_f) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((fl) this).field_d.field_q = 0;
                            ((fl) this).field_d.d(4, (byte) 122);
                            ((fl) this).field_d.d((int) ((fl) this).field_f, (byte) 122);
                            ((fl) this).field_d.a(0, false);
                            ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 112, ((fl) this).field_d.field_m);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ((fl) this).field_u.a((byte) 127);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((fl) this).field_b = -2;
                        ((fl) this).field_h = ((fl) this).field_h + 1;
                        ((fl) this).field_u = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((fl) this).field_g = 0;
                        ((fl) this).field_j = ol.a(256);
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

    public fl() {
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        lg.field_b = param2;
        ja.field_b = param3;
        if (param0 >= -57) {
            field_s = null;
        }
        gh.a((byte) -116, nk.field_c, param1);
    }

    final void c(int param0) {
        try {
            ((fl) this).field_u.a((byte) 115);
            // if_icmpeq L26
            ((fl) this).c(86);
        } catch (Exception exception) {
        }
        ((fl) this).field_b = -1;
        ((fl) this).field_u = null;
        ((fl) this).field_h = ((fl) this).field_h + 1;
        ((fl) this).field_f = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((fl) this).field_u) {
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
                        if (param0 == 2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_s = null;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            ((fl) this).field_d.field_q = 0;
                            ((fl) this).field_d.d(6, (byte) 122);
                            ((fl) this).field_d.a((byte) -124, 3);
                            ((fl) this).field_d.a(0, (byte) 106);
                            ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 121, ((fl) this).field_d.field_m);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((fl) this).field_u.a((byte) 100);
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
                        ((fl) this).field_h = ((fl) this).field_h + 1;
                        ((fl) this).field_b = -2;
                        ((fl) this).field_u = null;
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

    final static boolean a(pa param0, byte param1) {
        if (param1 < 103) {
            int discarded$0 = fl.f(97);
        }
        return param0.e(1, -53) == 1 ? true : false;
    }

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            db var2_ref = null;
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
            db var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_63_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_89_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_88_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = TorChallenge.field_F ? 1 : 0;
                        if (((fl) this).field_u == null) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = ol.a(256);
                        var4 = (int)(var2_long + -((fl) this).field_j);
                        ((fl) this).field_j = var2_long;
                        if (-201 > (var4 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((fl) this).field_g = ((fl) this).field_g + var4;
                        if (((fl) this).field_g > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((fl) this).field_u.a((byte) -55);
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
                        ((fl) this).field_u = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == ((fl) this).field_u) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 != ((fl) this).a((byte) 120)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (((fl) this).c((byte) 99) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return true;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        try {
                            ((fl) this).field_u.b(127);
                            var2_ref = (db) (Object) ((fl) this).field_c.a(25777);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var2_ref == null) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((fl) this).field_d.field_q = 0;
                            ((fl) this).field_d.d(1, (byte) 122);
                            ((fl) this).field_d.a(var2_ref.field_l, -1709073240);
                            ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 101, ((fl) this).field_d.field_m);
                            ((fl) this).field_l.a((w) (Object) var2_ref, 3329);
                            var2_ref = (db) (Object) ((fl) this).field_c.d(49);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param0 <= -44) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            field_v = -12;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_ref = (db) (Object) ((fl) this).field_k.a(25777);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((fl) this).field_d.field_q = 0;
                            ((fl) this).field_d.d(0, (byte) 122);
                            ((fl) this).field_d.a(var2_ref.field_l, -1709073240);
                            ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 76, ((fl) this).field_d.field_m);
                            ((fl) this).field_i.a((w) (Object) var2_ref, 3329);
                            var2_ref = (db) (Object) ((fl) this).field_k.d(118);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 88;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((fl) this).field_u.a(0);
                            if (-1 > var3_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-1 != var3_int) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((fl) this).field_g = 0;
                            var4 = 0;
                            if (((fl) this).field_p == null) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-1 != ((fl) this).field_p.field_C) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 90;
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
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var4 > 0) {
                                statePc = 51;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = -((fl) this).field_p.field_F + ((fl) this).field_p.field_A.field_m.length;
                            var6 = -((fl) this).field_p.field_C + 512;
                            if (var5 - ((fl) this).field_p.field_A.field_q < var6) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = -((fl) this).field_p.field_A.field_q + var5;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6 = var3_int;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((fl) this).field_u.a(-1, ((fl) this).field_p.field_A.field_q, var6, ((fl) this).field_p.field_A.field_m);
                            if (((fl) this).field_f != 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var6 <= var7) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((fl) this).field_p.field_A.field_m[var7 + ((fl) this).field_p.field_A.field_q] = (byte)TorChallenge.a((int) ((fl) this).field_p.field_A.field_m[var7 + ((fl) this).field_p.field_A.field_q], (int) ((fl) this).field_f);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((fl) this).field_p.field_C = ((fl) this).field_p.field_C + var6;
                            ((fl) this).field_p.field_A.field_q = ((fl) this).field_p.field_A.field_q + var6;
                            if (((fl) this).field_p.field_A.field_q == var5) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (-513 == (((fl) this).field_p.field_C ^ -1)) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((fl) this).field_p.field_C = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((fl) this).field_p.a(12695);
                            ((fl) this).field_p.field_v = false;
                            ((fl) this).field_p = null;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = var4 - ((fl) this).field_o.field_q;
                            if (var5 <= var3_int) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((fl) this).field_u.a(-1, ((fl) this).field_o.field_q, var5, ((fl) this).field_o.field_m);
                            if (0 == ((fl) this).field_f) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var6 >= var5) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((fl) this).field_o.field_m[var6 + ((fl) this).field_o.field_q] = (byte)TorChallenge.a((int) ((fl) this).field_o.field_m[var6 + ((fl) this).field_o.field_q], (int) ((fl) this).field_f);
                            var6++;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((fl) this).field_o.field_q = ((fl) this).field_o.field_q + var5;
                            if (((fl) this).field_o.field_q < var4) {
                                statePc = 87;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (null == ((fl) this).field_p) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((fl) this).field_o.field_q = 0;
                            var6 = ((fl) this).field_o.j(-101);
                            var7 = ((fl) this).field_o.i(39);
                            var8 = ((fl) this).field_o.j(-111);
                            var9 = ((fl) this).field_o.i(64);
                            var10 = var8 & 127;
                            if ((var8 & 128) == 0) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 1;
                            stackIn_63_0 = stackOut_61_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackOut_62_0 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var11 = stackIn_63_0;
                            var12 = ((long)var6 << 850423136) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 69;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (db) (Object) ((fl) this).field_l.a(25777);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref == null) {
                                statePc = 74;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var14_ref.field_l != var12) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (db) (Object) ((fl) this).field_l.d(121);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var14_ref = (db) (Object) ((fl) this).field_i.a(25777);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var14_ref == null) {
                                statePc = 74;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var14_ref.field_l != var12) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var14_ref = (db) (Object) ((fl) this).field_i.d(116);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var14_ref == null) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (0 == var10) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackOut_78_0 = 9;
                            stackIn_80_0 = stackOut_78_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 5;
                            stackIn_80_0 = stackOut_79_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var15 = stackIn_80_0;
                            ((fl) this).field_p = var14_ref;
                            ((fl) this).field_p.field_A = new uf(var15 + var9 - -((fl) this).field_p.field_F);
                            ((fl) this).field_p.field_A.d(var10, (byte) 122);
                            ((fl) this).field_p.field_A.a(var9, false);
                            ((fl) this).field_p.field_C = 10;
                            ((fl) this).field_o.field_q = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (((fl) this).field_p.field_C == 0) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (((fl) this).field_o.field_m[0] == -1) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((fl) this).field_p = null;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((fl) this).field_p.field_C = 1;
                            ((fl) this).field_o.field_q = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            stackOut_88_0 = 1;
                            stackIn_89_0 = stackOut_88_0;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        return stackIn_89_0 != 0;
                    }
                    case 90: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        try {
                            ((fl) this).field_u.a((byte) 118);
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 93;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
                        ((fl) this).field_h = ((fl) this).field_h + 1;
                        ((fl) this).field_u = null;
                        ((fl) this).field_b = -2;
                        if (0 != ((fl) this).a((byte) 117)) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        if (0 == ((fl) this).c((byte) 99)) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    }
                    case 97: {
                        return false;
                    }
                    case 98: {
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

    final static int f(int param0) {
        if (param0 != 0) {
            return -81;
        }
        return sd.field_a - qe.field_R;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[][]{null, null, null, null, null, null, null, null, null, null, null, null, new int[21], null, null, null};
    }
}
