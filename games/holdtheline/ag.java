/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag extends wj {
    static go field_r;
    static String field_p;
    private nn field_q;

    public static void c(boolean param0) {
        field_p = null;
        if (!param0) {
            return;
        }
        field_r = null;
    }

    private final void f(int param0) {
        try {
            IOException var2 = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((ag) this).field_q) {
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
                            ((ag) this).field_b.field_l = 0;
                            ((ag) this).field_b.f(111, 6);
                            ((ag) this).field_b.a(3, false);
                            ((ag) this).field_b.b(-652561784, 0);
                            ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                            if (param0 > 5) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            field_p = null;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ag) this).field_q.d(21135);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((ag) this).field_f = -2;
                        ((ag) this).field_c = ((ag) this).field_c + 1;
                        ((ag) this).field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
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

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            th stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            th stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            th stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            th stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            th stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            th stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((ag) this).field_q) {
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
                            ((ag) this).field_b.field_l = 0;
                            stackOut_2_0 = ((ag) this).field_b;
                            stackOut_2_1 = 111;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (!param0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (th) (Object) stackIn_3_0;
                            stackOut_3_1 = stackIn_3_1;
                            stackOut_3_2 = 2;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_5_2 = stackOut_3_2;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (th) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            stackIn_5_2 = stackOut_4_2;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((th) (Object) stackIn_5_0).f(stackIn_5_1, stackIn_5_2);
                            if (param1 == -11526) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            boolean discarded$3 = ag.a(77, 'J');
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((ag) this).field_b.b(-483502376, 0L);
                            ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((ag) this).field_q.d(21135);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        ((ag) this).field_f = -2;
                        ((ag) this).field_q = null;
                        ((ag) this).field_c = ((ag) this).field_c + 1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            cc var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = HoldTheLine.field_D;
                        if (((ag) this).field_q != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((ag) this).field_q.d(param2 ^ 21147);
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
                        ((ag) this).field_q = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((ag) this).field_q = (nn) param0;
                        this.f(param2 + 83);
                        this.a(param1, -11526);
                        ((ag) this).field_k.field_l = 0;
                        ((ag) this).field_m = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (cc) (Object) ((ag) this).field_i.a((byte) 85);
                        if (var4_ref2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((ag) this).field_d.a(-85, (ln) (Object) var4_ref2);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param2 == 20) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        field_r = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (cc) (Object) ((ag) this).field_e.a((byte) 84);
                        if (var4_ref2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((ag) this).field_g.a(-35, (ln) (Object) var4_ref2);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 == (((ag) this).field_l ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((ag) this).field_b.field_l = 0;
                            ((ag) this).field_b.f(111, 4);
                            ((ag) this).field_b.f(111, (int) ((ag) this).field_l);
                            ((ag) this).field_b.a((byte) -58, 0);
                            ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((ag) this).field_q.d(param2 + 21115);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((ag) this).field_c = ((ag) this).field_c + 1;
                        ((ag) this).field_q = null;
                        ((ag) this).field_f = -2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((ag) this).field_h = 0;
                        ((ag) this).field_j = bb.b(-1);
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

    final static void a(String param0, boolean param1, String param2) {
        if (!(sb.field_c == null)) {
            sb.field_c.h((byte) -98);
        }
        lh.field_a = new vg(param2, param0, param1, true, true);
        sm.field_c.a((n) (Object) lh.field_a, (byte) -99);
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            Exception var3 = null;
            cc var3_ref = null;
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
            int var12 = 0;
            long var13 = 0L;
            Object var15 = null;
            cc var15_ref = null;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int stackIn_46_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_80_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_79_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = HoldTheLine.field_D;
                        if (((ag) this).field_q != null) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = bb.b(-1);
                        var4 = (int)(-((ag) this).field_j + var2_long);
                        ((ag) this).field_j = var2_long;
                        if ((var4 ^ -1) >= -201) {
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
                        ((ag) this).field_h = ((ag) this).field_h + var4;
                        if ((((ag) this).field_h ^ -1) >= -30001) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((ag) this).field_q.d(21135);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((ag) this).field_q = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == ((ag) this).field_q) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 == (((ag) this).b(20) ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return false;
                    }
                    case 13: {
                        if (((ag) this).b(false) == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        return true;
                    }
                    case 17: {
                        try {
                            var2_int = 51 % ((param0 - 24) / 56);
                            ((ag) this).field_q.c(true);
                            var3_ref = (cc) (Object) ((ag) this).field_d.c(105);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var3_ref == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((ag) this).field_b.field_l = 0;
                            ((ag) this).field_b.f(111, 1);
                            ((ag) this).field_b.b(-483502376, var3_ref.field_i);
                            ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                            ((ag) this).field_i.a(123, (ln) (Object) var3_ref);
                            var3_ref = (cc) (Object) ((ag) this).field_d.e(-100);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var3_ref = (cc) (Object) ((ag) this).field_g.c(79);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var3_ref == null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ag) this).field_b.field_l = 0;
                            ((ag) this).field_b.f(111, 0);
                            ((ag) this).field_b.b(-483502376, var3_ref.field_i);
                            ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                            ((ag) this).field_e.a(126, (ln) (Object) var3_ref);
                            var3_ref = (cc) (Object) ((ag) this).field_g.e(-54);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-101 >= (var3_int ^ -1)) {
                                statePc = 79;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var4 = ((ag) this).field_q.b(false);
                            if (var4 <= -1) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-1 != var4) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ag) this).field_h = 0;
                            var5 = 0;
                            if (null != ((ag) this).field_m) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var5 = 10;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((ag) this).field_m.field_x != 0) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var5 = 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var5 <= 0) {
                                statePc = 66;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var6 = -((ag) this).field_k.field_l + var5;
                            if (var6 <= var4) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = var4;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            ((ag) this).field_q.a(((ag) this).field_k.field_i, var6, ((ag) this).field_k.field_l, 14);
                            if (0 == ((ag) this).field_l) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var7 = 0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var6 <= var7) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((ag) this).field_k.field_i[var7 + ((ag) this).field_k.field_l] = (byte)wb.a((int) ((ag) this).field_k.field_i[var7 + ((ag) this).field_k.field_l], (int) ((ag) this).field_l);
                            var7++;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((ag) this).field_k.field_l = ((ag) this).field_k.field_l + var6;
                            if (var5 > ((ag) this).field_k.field_l) {
                                statePc = 78;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (null == ((ag) this).field_m) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((ag) this).field_k.field_l = 0;
                            var7 = ((ag) this).field_k.f((byte) -105);
                            var8 = ((ag) this).field_k.a(94);
                            var9 = ((ag) this).field_k.f((byte) -55);
                            var10 = ((ag) this).field_k.a(127);
                            var11 = 127 & var9;
                            if ((128 & var9) == 0) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var12 = stackIn_46_0;
                            var13 = ((long)var7 << -814256224) + (long)var8;
                            var15 = null;
                            if (var12 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var15_ref = (cc) (Object) ((ag) this).field_e.c(71);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var15_ref == null) {
                                statePc = 55;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var13 == var15_ref.field_i) {
                                statePc = 55;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var15_ref = (cc) (Object) ((ag) this).field_e.e(95);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var15_ref = (cc) (Object) ((ag) this).field_i.c(96);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var15_ref == null) {
                                statePc = 55;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var13 == var15_ref.field_i) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var15_ref = (cc) (Object) ((ag) this).field_i.e(57);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var15_ref != null) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (0 != var11) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 5;
                            stackIn_60_0 = stackOut_58_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = 9;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var16 = stackIn_60_0;
                            ((ag) this).field_m = var15_ref;
                            ((ag) this).field_m.field_z = new th(((ag) this).field_m.field_B + var10 + var16);
                            ((ag) this).field_m.field_z.f(111, var11);
                            ((ag) this).field_m.field_z.a((byte) -58, var10);
                            ((ag) this).field_k.field_l = 0;
                            ((ag) this).field_m.field_x = 10;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (((ag) this).field_m.field_x != 0) {
                                statePc = 65;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (0 == (((ag) this).field_k.field_i[0] ^ -1)) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((ag) this).field_m = null;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            ((ag) this).field_m.field_x = 1;
                            ((ag) this).field_k.field_l = 0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6 = -((ag) this).field_m.field_B + ((ag) this).field_m.field_z.field_i.length;
                            var7 = -((ag) this).field_m.field_x + 512;
                            if (-((ag) this).field_m.field_z.field_l + var6 >= var7) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var7 = var6 + -((ag) this).field_m.field_z.field_l;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var4 >= var7) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var7 = var4;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((ag) this).field_q.a(((ag) this).field_m.field_z.field_i, var7, ((ag) this).field_m.field_z.field_l, -54);
                            if (0 == ((ag) this).field_l) {
                                statePc = 74;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var18 = 0;
                            var8 = var18;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var7 <= var18) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            ((ag) this).field_m.field_z.field_i[((ag) this).field_m.field_z.field_l + var18] = (byte)wb.a((int) ((ag) this).field_m.field_z.field_i[((ag) this).field_m.field_z.field_l + var18], (int) ((ag) this).field_l);
                            var18++;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((ag) this).field_m.field_z.field_l = ((ag) this).field_m.field_z.field_l + var7;
                            ((ag) this).field_m.field_x = ((ag) this).field_m.field_x + var7;
                            if (var6 != ((ag) this).field_m.field_z.field_l) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((ag) this).field_m.a((byte) -42);
                            ((ag) this).field_m.field_u = false;
                            ((ag) this).field_m = null;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (-513 != (((ag) this).field_m.field_x ^ -1)) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((ag) this).field_m.field_x = 0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var3_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 1;
                            stackIn_80_0 = stackOut_79_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 81;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        return stackIn_80_0 != 0;
                    }
                    case 81: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 82;
                        continue stateLoop;
                    }
                    case 82: {
                        try {
                            ((ag) this).field_q.d(21135);
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        ((ag) this).field_f = -2;
                        ((ag) this).field_q = null;
                        ((ag) this).field_c = ((ag) this).field_c + 1;
                        if (-1 == (((ag) this).b(126) ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        return false;
                    }
                    case 87: {
                        if (((ag) this).b(false) != 0) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        return true;
                    }
                    case 89: {
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

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != -2821) {
          return false;
        } else {
          L0: {
            L1: {
              if (160 == param1) {
                break L1;
              } else {
                if (param1 == 32) {
                  break L1;
                } else {
                  if (95 == param1) {
                    break L1;
                  } else {
                    if (45 != param1) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        }
    }

    final void e(int param0) {
        if (param0 != 1) {
            ((ag) this).field_q = null;
        }
        if (!(null == ((ag) this).field_q)) {
            ((ag) this).field_q.d(21135);
        }
    }

    public ag() {
    }

    final void a(boolean param0) {
        try {
            ((ag) this).field_q.d(21135);
        } catch (Exception exception) {
        }
        ((ag) this).field_c = ((ag) this).field_c + 1;
        ((ag) this).field_f = -1;
        ((ag) this).field_q = null;
        if (param0) {
            boolean discarded$0 = ((ag) this).a((byte) -72);
        }
        ((ag) this).field_l = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<%0> kills remaining.";
    }
}
