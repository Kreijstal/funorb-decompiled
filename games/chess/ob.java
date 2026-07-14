/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ob extends wm {
    static int field_t;
    static hg field_v;
    static String field_r;
    static int field_C;
    static String field_y;
    static boolean field_w;
    static String field_z;
    static int[] field_u;
    private hn field_s;
    static rk field_B;
    static String field_x;
    static String field_A;

    public static void b(boolean param0) {
        if (param0) {
            field_z = null;
        }
        field_B = null;
        field_x = null;
        field_r = null;
        field_y = null;
        field_z = null;
        field_u = null;
        field_v = null;
        field_A = null;
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = Chess.field_G;
        v.field_e.b((byte) 40);
        for (var1 = 0; var1 < 32; var1++) {
            vj.field_f[var1] = 0L;
        }
        for (var1 = param0; (var1 ^ -1) > -33; var1++) {
            fi.field_d[var1] = 0L;
        }
        hk.field_M = 0;
    }

    final void a(byte param0) {
        if (param0 != -103) {
            field_t = -117;
        }
        if (!(null == ((ob) this).field_s)) {
            ((ob) this).field_s.a(-1);
        }
    }

    final void a(byte param0, Object param1, boolean param2) {
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
                        var6 = Chess.field_G;
                        if (null == ((ob) this).field_s) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((ob) this).field_s.a(-1);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((ob) this).field_s = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((ob) this).field_s = (hn) param1;
                        this.c((byte) 67);
                        this.a(param2, true);
                        ((ob) this).field_h = null;
                        ((ob) this).field_a.field_l = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref2 = (cc) (Object) ((ob) this).field_e.a((byte) -75);
                        if (var4_ref2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((ob) this).field_o.a(0, (l) (Object) var4_ref2);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (cc) (Object) ((ob) this).field_p.a((byte) -75);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((ob) this).field_f.a(0, (l) (Object) var4_ref2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-1 != (((ob) this).field_k ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((ob) this).field_l.field_l = 0;
                            ((ob) this).field_l.c(4, (byte) 83);
                            ((ob) this).field_l.c((int) ((ob) this).field_k, (byte) 57);
                            ((ob) this).field_l.d(0, (byte) -81);
                            ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
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
                            ((ob) this).field_s.a(-1);
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
                        ((ob) this).field_g = ((ob) this).field_g + 1;
                        ((ob) this).field_c = -2;
                        ((ob) this).field_s = null;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((ob) this).field_m = 0;
                        if (param0 == 45) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        ((ob) this).field_d = ud.a(2);
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

    final void c(int param0) {
        try {
            if (param0 != 0) {
                this.c((byte) -61);
            }
            ((ob) this).field_s.a(param0 ^ -1);
        } catch (Exception exception) {
        }
        ((ob) this).field_c = -1;
        ((ob) this).field_s = null;
        ((ob) this).field_g = ((ob) this).field_g + 1;
        ((ob) this).field_k = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    private final void c(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((ob) this).field_s) {
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
                            ((ob) this).field_l.field_l = 0;
                            ((ob) this).field_l.c(6, (byte) 51);
                            ((ob) this).field_l.c(param0 ^ -68, 3);
                            ((ob) this).field_l.b(0, 93);
                            if (param0 == 67) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
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
                            ((ob) this).field_s.a(-1);
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
                        ((ob) this).field_s = null;
                        ((ob) this).field_g = ((ob) this).field_g + 1;
                        ((ob) this).field_c = -2;
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

    final static String d(byte param0) {
        if (!(ci.field_ub != g.field_a)) {
            return jd.field_d;
        }
        if (!(ci.field_ub != vl.field_A)) {
            return lc.field_e;
        }
        if (param0 > -98) {
            String discarded$0 = ob.d((byte) 73);
        }
        if (!pi.field_c.b((byte) 107)) {
            return lc.field_e;
        }
        return pi.field_a;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            p stackIn_4_0 = null;
            p stackIn_5_0 = null;
            p stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            p stackOut_3_0 = null;
            p stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            p stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ob) this).field_s == null) {
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
                            ((ob) this).field_l.field_l = 0;
                            stackOut_3_0 = ((ob) this).field_l;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            if (!param0) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (p) (Object) stackIn_4_0;
                            stackOut_4_1 = 2;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (p) (Object) stackIn_5_0;
                            stackOut_5_1 = 3;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((p) (Object) stackIn_6_0).c(stackIn_6_1, (byte) -65);
                            if (param1) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        try {
                            ((ob) this).field_l.a(0L, 1392038664);
                            ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
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
                            ((ob) this).field_s.a(-1);
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
                        ((ob) this).field_c = -2;
                        ((ob) this).field_g = ((ob) this).field_g + 1;
                        ((ob) this).field_s = null;
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

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            cc var2_ref = null;
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
            cc var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_18_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_86_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_85_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Chess.field_G;
                        if (((ob) this).field_s != null) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ud.a(2);
                        var4 = (int)(var2_long + -((ob) this).field_d);
                        ((ob) this).field_d = var2_long;
                        if (var4 <= 200) {
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
                        ((ob) this).field_m = ((ob) this).field_m + var4;
                        if (-30001 > (((ob) this).field_m ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ob) this).field_s.a(-1);
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
                        ((ob) this).field_s = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != ((ob) this).field_s) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((ob) this).d(param0 ^ -17145)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (-1 == (((ob) this).a(-3151) ^ -1)) {
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
                        try {
                            ((ob) this).field_s.a((byte) -41);
                            var2_ref = (cc) (Object) ((ob) this).field_o.b(-22585);
                            if (param0 == -31259) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
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
                            ((ob) this).field_l.field_l = 0;
                            ((ob) this).field_l.c(1, (byte) -52);
                            ((ob) this).field_l.a(var2_ref.field_l, 1392038664);
                            ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                            ((ob) this).field_e.a(0, (l) (Object) var2_ref);
                            var2_ref = (cc) (Object) ((ob) this).field_o.b((byte) -73);
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
                            var2_ref = (cc) (Object) ((ob) this).field_f.b(-22585);
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
                            ((ob) this).field_l.field_l = 0;
                            ((ob) this).field_l.c(0, (byte) -110);
                            ((ob) this).field_l.a(var2_ref.field_l, 1392038664);
                            ((ob) this).field_s.a(0, ((ob) this).field_l.field_o.length, (byte) -92, ((ob) this).field_l.field_o);
                            ((ob) this).field_p.a(0, (l) (Object) var2_ref);
                            var2_ref = (cc) (Object) ((ob) this).field_f.b((byte) -93);
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
                            if (-101 >= var2_int) {
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
                            var3_int = ((ob) this).field_s.c(0);
                            if (-1 > var3_int) {
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
                            if (-1 != var3_int) {
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
                            ((ob) this).field_m = 0;
                            var4 = 0;
                            if (((ob) this).field_h == null) {
                                statePc = 35;
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
                            if (-1 == ((ob) this).field_h.field_w) {
                                statePc = 34;
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
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var4 = 1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var4 = 10;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (0 >= var4) {
                                statePc = 72;
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
                            var5 = -((ob) this).field_a.field_l + var4;
                            if (var5 > var3_int) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var5 = var3_int;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((ob) this).field_s.a(((ob) this).field_a.field_o, var5, (byte) -87, ((ob) this).field_a.field_l);
                            if (-1 != (((ob) this).field_k ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var6 = 0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var5 <= var6) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((ob) this).field_a.field_o[var6 + ((ob) this).field_a.field_l] = (byte)dm.a((int) ((ob) this).field_a.field_o[var6 + ((ob) this).field_a.field_l], (int) ((ob) this).field_k);
                            var6++;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((ob) this).field_a.field_l = ((ob) this).field_a.field_l + var5;
                            if (var4 > ((ob) this).field_a.field_l) {
                                statePc = 84;
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
                            if (((ob) this).field_h == null) {
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
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((ob) this).field_a.field_l = 0;
                            var6 = ((ob) this).field_a.i(-102);
                            var7 = ((ob) this).field_a.e((byte) -99);
                            var8 = ((ob) this).field_a.i(-126);
                            var9 = ((ob) this).field_a.e((byte) -110);
                            var10 = 127 & var8;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 50;
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
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            stackOut_50_0 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var11 = stackIn_51_0;
                            var12 = (long)var7 + ((long)var6 << 1765622944);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 57;
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
                            var14_ref = (cc) (Object) ((ob) this).field_p.b(-22585);
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
                            if (var14_ref == null) {
                                statePc = 61;
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
                            if ((var14_ref.field_l ^ -1L) != (var12 ^ -1L)) {
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
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14_ref = (cc) (Object) ((ob) this).field_p.b((byte) -73);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var14_ref = (cc) (Object) ((ob) this).field_e.b(-22585);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var14_ref == null) {
                                statePc = 61;
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
                            if ((var14_ref.field_l ^ -1L) == (var12 ^ -1L)) {
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
                            var14_ref = (cc) (Object) ((ob) this).field_e.b((byte) -106);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var14_ref != null) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (-1 != (var10 ^ -1)) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 5;
                            stackIn_66_0 = stackOut_64_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 9;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var15 = stackIn_66_0;
                            ((ob) this).field_h = var14_ref;
                            ((ob) this).field_h.field_y = new p(var9 + var15 + ((ob) this).field_h.field_x);
                            ((ob) this).field_h.field_y.c(var10, (byte) 90);
                            ((ob) this).field_h.field_y.d(var9, (byte) -81);
                            ((ob) this).field_a.field_l = 0;
                            ((ob) this).field_h.field_w = 10;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (((ob) this).field_h.field_w != 0) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (((ob) this).field_a.field_o[0] == -1) {
                                statePc = 70;
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
                            ((ob) this).field_h = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((ob) this).field_a.field_l = 0;
                            ((ob) this).field_h.field_w = 1;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var5 = -((ob) this).field_h.field_x + ((ob) this).field_h.field_y.field_o.length;
                            var6 = 512 + -((ob) this).field_h.field_w;
                            if (var6 <= -((ob) this).field_h.field_y.field_l + var5) {
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
                            var6 = var5 + -((ob) this).field_h.field_y.field_l;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var6 = var3_int;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((ob) this).field_s.a(((ob) this).field_h.field_y.field_o, var6, (byte) -87, ((ob) this).field_h.field_y.field_l);
                            if (-1 == (((ob) this).field_k ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var7 = 0;
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
                            if (var7 >= var6) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((ob) this).field_h.field_y.field_o[var7 + ((ob) this).field_h.field_y.field_l] = (byte)dm.a((int) ((ob) this).field_h.field_y.field_o[var7 + ((ob) this).field_h.field_y.field_l], (int) ((ob) this).field_k);
                            var7++;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((ob) this).field_h.field_y.field_l = ((ob) this).field_h.field_y.field_l + var6;
                            ((ob) this).field_h.field_w = ((ob) this).field_h.field_w + var6;
                            if (((ob) this).field_h.field_y.field_l == var5) {
                                statePc = 83;
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
                            if (((ob) this).field_h.field_w != 512) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((ob) this).field_h.field_w = 0;
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
                            ((ob) this).field_h.d(-1);
                            ((ob) this).field_h.field_s = false;
                            ((ob) this).field_h = null;
                            statePc = 84;
                            continue stateLoop;
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
                            ((ob) this).field_s.a(param0 ^ 31258);
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
                        ((ob) this).field_g = ((ob) this).field_g + 1;
                        ((ob) this).field_c = -2;
                        ((ob) this).field_s = null;
                        if (-1 != (((ob) this).d(14562) ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (0 == ((ob) this).a(param0 + 28108)) {
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

    public ob() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 2;
        field_r = "Game options";
        field_y = "Quick Chat Help";
        field_v = new hg(10, 2, 2, 0);
        field_u = new int[8192];
        field_x = "You have not yet unlocked this option for use.";
        field_A = "(1 player wants to join)";
    }
}
