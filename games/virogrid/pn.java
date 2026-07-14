/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pn extends dk {
    static lc field_z;
    static String field_C;
    static String field_A;
    static String field_w;
    private el field_B;
    static String field_y;
    static boolean field_x;

    final void d(byte param0) {
        try {
            ((pn) this).field_B.b(4155);
        } catch (Exception exception) {
        }
        ((pn) this).field_b = -1;
        ((pn) this).field_l = ((pn) this).field_l + 1;
        ((pn) this).field_B = null;
        ((pn) this).field_g = (byte)(int)(Math.random() * 255.0 + 1.0);
        if (param0 <= 81) {
            pn.c(false);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 <= -1) {
            // if_icmple L16
        } else {
            var2 += 16;
            param0 = param0 >>> 16;
        }
        if (!(param0 < 256)) {
            param0 = param0 >>> 8;
            var2 += 8;
        }
        if (-17 >= param0) {
            var2 += 4;
            param0 = param0 >>> 4;
        }
        if (!(-5 > param0)) {
            var2 += 2;
            param0 = param0 >>> 2;
        }
        if (param1 >= -40) {
            return -21;
        }
        if ((param0 ^ -1) <= -2) {
            param0 = param0 >>> 1;
            var2++;
        }
        return param0 + var2;
    }

    public static void c(boolean param0) {
        field_C = null;
        field_z = null;
        field_A = null;
        if (!param0) {
            int discarded$0 = pn.a(125, 76, (byte) -34);
        }
        field_y = null;
        field_w = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            jc stackIn_5_0 = null;
            jc stackIn_6_0 = null;
            jc stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            jc stackOut_4_0 = null;
            jc stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            jc stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((pn) this).field_B != null) {
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
                            ((pn) this).field_t.field_l = 0;
                            if (param1 == -13919) {
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
                            field_w = null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = ((pn) this).field_t;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            if (param0) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (jc) (Object) stackIn_5_0;
                            stackOut_5_1 = 3;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (jc) (Object) stackIn_6_0;
                            stackOut_6_1 = 2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
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
                            ((jc) (Object) stackIn_7_0).a(stackIn_7_1, -97);
                            ((pn) this).field_t.a(0L, 65280);
                            ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
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
                            ((pn) this).field_B.b(4155);
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
                        ((pn) this).field_l = ((pn) this).field_l + 1;
                        ((pn) this).field_B = null;
                        ((pn) this).field_b = -2;
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

    final static int a(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var3 = 97 % ((param2 - -57) / 61);
        int var4 = 0;
        int var5 = ih.field_a;
        while (var4 < mn.field_c.length) {
            var6 = wg.field_h[var4];
            if (0 > var6) {
                var5 = var5 + re.field_m;
            } else {
                var7 = gl.a(1492912648, true, mn.field_c[var4]);
                var8 = -(var7 >> 293317281) + hn.field_q;
                var5 = var5 + oh.field_d;
                if (wf.a(-eh.field_d + var8, param1, (eh.field_d << 1126633249) + var7, true, var5, param0, mi.field_c + (bj.field_j << -2114951871))) {
                    return var6;
                }
                var5 = var5 + (mi.field_c + (bj.field_j << 1959035009) - -oh.field_d);
            }
            var4++;
        }
        return -1;
    }

    final void b(int param0) {
        if (param0 <= 17) {
            return;
        }
        if (null != ((pn) this).field_B) {
            ((pn) this).field_B.b(4155);
        }
    }

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ub var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Virogrid.field_F ? 1 : 0;
                        if (null != ((pn) this).field_B) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((pn) this).field_B.b(4155);
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
                        ((pn) this).field_B = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((pn) this).field_B = (el) param2;
                        this.b(false);
                        this.a(param1, -13919);
                        ((pn) this).field_n.field_l = 0;
                        ((pn) this).field_d = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (ub) (Object) ((pn) this).field_c.a((byte) -103);
                        if (var4_ref2 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((pn) this).field_i.a((wb) (Object) var4_ref2, (byte) 93);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (ub) (Object) ((pn) this).field_h.a((byte) -103);
                        if (var4_ref2 != null) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((pn) this).field_p.a((wb) (Object) var4_ref2, (byte) 119);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 13: {
                        if (0 != ((pn) this).field_g) {
                            statePc = 15;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((pn) this).field_t.field_l = 0;
                            ((pn) this).field_t.a(4, 97);
                            ((pn) this).field_t.a((int) ((pn) this).field_g, -101);
                            ((pn) this).field_t.a(0, (byte) -42);
                            ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
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
                            ((pn) this).field_B.b(4155);
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
                        ((pn) this).field_l = ((pn) this).field_l + 1;
                        ((pn) this).field_b = -2;
                        ((pn) this).field_B = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((pn) this).field_k = 0;
                        if (param0 < 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        field_C = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        ((pn) this).field_f = hc.a(-9986);
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

    final static void a(boolean param0) {
        ok.field_L = hd.field_b.a(de.field_pb[14]);
        if (param0) {
            int discarded$0 = pn.a(-7, (byte) 94);
        }
        int var1 = hd.field_b.a(de.field_pb[15]);
        if (!(var1 <= ok.field_L)) {
            ok.field_L = var1;
        }
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ub var2_ref = null;
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
            ub var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_60_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_84_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_83_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Virogrid.field_F ? 1 : 0;
                        if (((pn) this).field_B == null) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = hc.a(-9986);
                        var4 = (int)(-((pn) this).field_f + var2_long);
                        if (200 < var4) {
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
                        ((pn) this).field_f = var2_long;
                        ((pn) this).field_k = ((pn) this).field_k + var4;
                        if (-30001 <= (((pn) this).field_k ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((pn) this).field_B.b(4155);
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
                        ((pn) this).field_B = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((pn) this).field_B) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (((pn) this).a((byte) -16) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((pn) this).e(109) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return true;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        try {
                            ((pn) this).field_B.c(-110);
                            if (param0 <= -9) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            field_w = null;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var2_ref = (ub) (Object) ((pn) this).field_i.d(-1);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((pn) this).field_t.field_l = 0;
                            ((pn) this).field_t.a(1, -83);
                            ((pn) this).field_t.a(var2_ref.field_j, 65280);
                            ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                            ((pn) this).field_c.a((wb) (Object) var2_ref, (byte) 93);
                            var2_ref = (ub) (Object) ((pn) this).field_i.a(26605);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var2_ref = (ub) (Object) ((pn) this).field_p.d(-1);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var2_ref == null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((pn) this).field_t.field_l = 0;
                            ((pn) this).field_t.a(0, 104);
                            ((pn) this).field_t.a(var2_ref.field_j, 65280);
                            ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                            ((pn) this).field_h.a((wb) (Object) var2_ref, (byte) 99);
                            var2_ref = (ub) (Object) ((pn) this).field_p.a(26605);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_int = 0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 83;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_int = ((pn) this).field_B.f(31479);
                            if (-1 > var3_int) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-1 == (var3_int ^ -1)) {
                                statePc = 83;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((pn) this).field_k = 0;
                            var4 = 0;
                            if (null != ((pn) this).field_d) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var4 = 10;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((pn) this).field_d.field_C != 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4 = 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (0 < var4) {
                                statePc = 48;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var5 = -((pn) this).field_d.field_A + ((pn) this).field_d.field_B.field_g.length;
                            var6 = 512 + -((pn) this).field_d.field_C;
                            if (-((pn) this).field_d.field_B.field_l + var5 < var6) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = -((pn) this).field_d.field_B.field_l + var5;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = var3_int;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((pn) this).field_B.a(var6, ((pn) this).field_d.field_B.field_g, -1, ((pn) this).field_d.field_B.field_l);
                            if (-1 != (((pn) this).field_g ^ -1)) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var7 = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var6 <= var7) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((pn) this).field_d.field_B.field_g[((pn) this).field_d.field_B.field_l - -var7] = (byte)jd.a((int) ((pn) this).field_d.field_B.field_g[((pn) this).field_d.field_B.field_l + var7], (int) ((pn) this).field_g);
                            var7++;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((pn) this).field_d.field_C = ((pn) this).field_d.field_C + var6;
                            ((pn) this).field_d.field_B.field_l = ((pn) this).field_d.field_B.field_l + var6;
                            if (var5 == ((pn) this).field_d.field_B.field_l) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (512 == ((pn) this).field_d.field_C) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((pn) this).field_d.field_C = 0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((pn) this).field_d.c(23);
                            ((pn) this).field_d.field_t = false;
                            ((pn) this).field_d = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var5 = -((pn) this).field_n.field_l + var4;
                            if (var5 > var3_int) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var5 = var3_int;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            ((pn) this).field_B.a(var5, ((pn) this).field_n.field_g, -1, ((pn) this).field_n.field_l);
                            if (-1 == (((pn) this).field_g ^ -1)) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var6 = 0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var6 >= var5) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((pn) this).field_n.field_g[((pn) this).field_n.field_l - -var6] = (byte)jd.a((int) ((pn) this).field_n.field_g[((pn) this).field_n.field_l + var6], (int) ((pn) this).field_g);
                            var6++;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((pn) this).field_n.field_l = ((pn) this).field_n.field_l + var5;
                            if (var4 > ((pn) this).field_n.field_l) {
                                statePc = 82;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (((pn) this).field_d != null) {
                                statePc = 76;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((pn) this).field_n.field_l = 0;
                            var6 = ((pn) this).field_n.g(11132);
                            var7 = ((pn) this).field_n.d((byte) 103);
                            var8 = ((pn) this).field_n.g(11132);
                            var9 = ((pn) this).field_n.d((byte) 116);
                            var10 = 127 & var8;
                            if ((128 & var8) == 0) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 1;
                            stackIn_60_0 = stackOut_58_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = 0;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var11 = stackIn_60_0;
                            var12 = ((long)var6 << -1746883872) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 65;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var14_ref = (ub) (Object) ((pn) this).field_c.d(-1);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var14_ref == null) {
                                statePc = 70;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var12 == var14_ref.field_j) {
                                statePc = 70;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (ub) (Object) ((pn) this).field_c.a(26605);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var14_ref = (ub) (Object) ((pn) this).field_h.d(-1);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var14_ref == null) {
                                statePc = 70;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_j ^ -1L)) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var14_ref = (ub) (Object) ((pn) this).field_h.a(26605);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var14_ref != null) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var10 == 0) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackOut_73_0 = 9;
                            stackIn_75_0 = stackOut_73_0;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackOut_74_0 = 5;
                            stackIn_75_0 = stackOut_74_0;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var15 = stackIn_75_0;
                            ((pn) this).field_d = var14_ref;
                            ((pn) this).field_d.field_B = new jc(var15 + var9 - -((pn) this).field_d.field_A);
                            ((pn) this).field_d.field_B.a(var10, 55);
                            ((pn) this).field_d.field_B.a(var9, (byte) -42);
                            ((pn) this).field_n.field_l = 0;
                            ((pn) this).field_d.field_C = 10;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (((pn) this).field_d.field_C == 0) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (0 != (((pn) this).field_n.field_g[0] ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((pn) this).field_d.field_C = 1;
                            ((pn) this).field_n.field_l = 0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((pn) this).field_d = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var2_int++;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackOut_83_0 = 1;
                            stackIn_84_0 = stackOut_83_0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        return stackIn_84_0 != 0;
                    }
                    case 85: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        try {
                            ((pn) this).field_B.b(4155);
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        ((pn) this).field_l = ((pn) this).field_l + 1;
                        ((pn) this).field_B = null;
                        ((pn) this).field_b = -2;
                        if (((pn) this).a((byte) 116) != 0) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (((pn) this).e(108) == 0) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        return false;
                    }
                    case 92: {
                        return false;
                    }
                    case 93: {
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

    public pn() {
    }

    private final void b(boolean param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((pn) this).field_B) {
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
                            ((pn) this).field_t.field_l = 0;
                            ((pn) this).field_t.a(6, 122);
                            ((pn) this).field_t.a(3, param0);
                            ((pn) this).field_t.a((byte) -76, 0);
                            ((pn) this).field_B.a(((pn) this).field_t.field_g, 0, 0, ((pn) this).field_t.field_g.length);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((pn) this).field_B.b(4155);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((pn) this).field_l = ((pn) this).field_l + 1;
                        ((pn) this).field_B = null;
                        ((pn) this).field_b = -2;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Your email address is used to identify this account";
        field_C = "Rotate camera right";
        field_A = "<%0> wants to join";
        field_y = "This is your RuneScape clan if you have one.";
        field_z = new lc(4, 1, 1, 1);
    }
}
