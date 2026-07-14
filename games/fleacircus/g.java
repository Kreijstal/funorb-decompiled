/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class g extends w {
    static int field_s;
    private td field_v;
    static String field_t;
    static double field_u;

    public g() {
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
            field_s = 92;
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            fk var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = fleas.field_A ? 1 : 0;
                        if (null != ((g) this).field_v) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((g) this).field_v.h(0);
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
                        ((g) this).field_v = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param2 == 105) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        ((g) this).field_v = (td) param0;
                        this.g(-79);
                        this.a(param2 + 5, param1);
                        ((g) this).field_p = null;
                        ((g) this).field_f.field_i = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (fk) (Object) ((g) this).field_q.a(param2 ^ -30);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((g) this).field_o.a((pa) (Object) var4_ref2, -1089421886);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (fk) (Object) ((g) this).field_h.a(-122);
                        if (var4_ref2 != null) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ((g) this).field_n.a((pa) (Object) var4_ref2, param2 ^ -1089421909);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        if (((g) this).field_g != 0) {
                            statePc = 17;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((g) this).field_d.field_i = 0;
                            ((g) this).field_d.a(-11, 4);
                            ((g) this).field_d.a(param2 + -116, (int) ((g) this).field_g);
                            ((g) this).field_d.a(0, (byte) -58);
                            ((g) this).field_v.a((byte) -117, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        try {
                            ((g) this).field_v.h(0);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((g) this).field_b = -2;
                        ((g) this).field_c = ((g) this).field_c + 1;
                        ((g) this).field_v = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        ((g) this).field_k = 0;
                        ((g) this).field_m = lj.a((byte) -67);
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

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ni stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ni stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ni stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            ni stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            ni stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            ni stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((g) this).field_v != null) {
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
                            ((g) this).field_d.field_i = 0;
                            if (param0 > 48) {
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
                            boolean discarded$3 = ((g) this).b((byte) 48);
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
                            stackOut_4_0 = ((g) this).field_d;
                            stackOut_4_1 = -11;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            if (param1) {
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
                            stackOut_5_0 = (ni) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 3;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
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
                            stackOut_6_0 = (ni) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
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
                            ((ni) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                            ((g) this).field_d.a(0L, (byte) -39);
                            ((g) this).field_v.a((byte) -118, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
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
                            ((g) this).field_v.h(0);
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
                        ((g) this).field_v = null;
                        ((g) this).field_b = -2;
                        ((g) this).field_c = ((g) this).field_c + 1;
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

    final void a(byte param0) {
        try {
            ((g) this).field_v.h(0);
        } catch (Exception exception) {
        }
        ((g) this).field_c = ((g) this).field_c + 1;
        ((g) this).field_b = -1;
        ((g) this).field_v = null;
        ((g) this).field_g = (byte)(int)(1.0 + Math.random() * 255.0);
        int var2 = 116 / ((param0 - -29) / 47);
    }

    final void d(int param0) {
        if (null != ((g) this).field_v) {
            ((g) this).field_v.h(param0 + 14835);
        }
        if (param0 != -14835) {
            ((g) this).d(-128);
        }
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var3 = jc.a(param2, 116);
        int var4 = we.a((byte) 75, param2);
        int var5 = jc.a(param1, 117);
        int var6 = 104 % ((53 - param0) / 58);
        int var7 = we.a((byte) 101, param1);
        int var8 = (int)((long)var5 * (long)var3 >> 922083344);
        int var9 = (int)((long)var7 * (long)var3 >> -961792752);
        int var10 = (int)((long)var4 * (long)var5 >> 21370448);
        int var11 = (int)((long)var7 * (long)var4 >> 484235664);
        return new int[]{0, 0, 0, var7, 0, var5, var8, var4, -var9, -var10, var3, var11};
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((g) this).field_v != null) {
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
                        if (param0 <= -33) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_t = null;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            ((g) this).field_d.field_i = 0;
                            ((g) this).field_d.a(-11, 6);
                            ((g) this).field_d.a(false, 3);
                            ((g) this).field_d.b((byte) 75, 0);
                            ((g) this).field_v.a((byte) -117, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
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
                            ((g) this).field_v.h(0);
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
                        ((g) this).field_b = -2;
                        ((g) this).field_v = null;
                        ((g) this).field_c = ((g) this).field_c + 1;
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

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fk var2_ref = null;
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
            fk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_88_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_87_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = fleas.field_A ? 1 : 0;
                        if (null != ((g) this).field_v) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = lj.a((byte) -24);
                        var4 = (int)(-((g) this).field_m + var2_long);
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
                        ((g) this).field_m = var2_long;
                        ((g) this).field_k = ((g) this).field_k + var4;
                        if (((g) this).field_k > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((g) this).field_v.h(0);
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
                        ((g) this).field_v = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == ((g) this).field_v) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((g) this).f(1) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (((g) this).e(-53) == 0) {
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
                            ((g) this).field_v.c(0);
                            var2_ref = (fk) (Object) ((g) this).field_o.b((byte) 113);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((g) this).field_d.field_i = 0;
                            ((g) this).field_d.a(-11, 1);
                            ((g) this).field_d.a(var2_ref.field_j, (byte) -39);
                            ((g) this).field_v.a((byte) -122, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                            ((g) this).field_q.a((pa) (Object) var2_ref, -1089421886);
                            var2_ref = (fk) (Object) ((g) this).field_o.c((byte) 67);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param0 == 66) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            this.g(-76);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref = (fk) (Object) ((g) this).field_n.b((byte) 120);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((g) this).field_d.field_i = 0;
                            ((g) this).field_d.a(-11, 0);
                            ((g) this).field_d.a(var2_ref.field_j, (byte) -39);
                            ((g) this).field_v.a((byte) -103, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                            ((g) this).field_h.a((pa) (Object) var2_ref, -1089421886);
                            var2_ref = (fk) (Object) ((g) this).field_n.c((byte) 117);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 87;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var3_int = ((g) this).field_v.e(-120);
                            if (0 > var3_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var3_int != 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((g) this).field_k = 0;
                            var4 = 0;
                            if (((g) this).field_p != null) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 10;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((g) this).field_p.field_y != 0) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var4 = 1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var4 <= 0) {
                                statePc = 73;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var5 = var4 + -((g) this).field_f.field_i;
                            if (var3_int < var5) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((g) this).field_v.a(var5, ((g) this).field_f.field_k, ((g) this).field_f.field_i, false);
                            if (-1 != (((g) this).field_g ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var6 >= var5) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((g) this).field_f.field_k[var6 + ((g) this).field_f.field_i] = (byte)df.a((int) ((g) this).field_f.field_k[var6 + ((g) this).field_f.field_i], (int) ((g) this).field_g);
                            var6++;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((g) this).field_f.field_i = ((g) this).field_f.field_i + var5;
                            if (((g) this).field_f.field_i < var4) {
                                statePc = 86;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (((g) this).field_p != null) {
                                statePc = 67;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((g) this).field_f.field_i = 0;
                            var6 = ((g) this).field_f.e(false);
                            var7 = ((g) this).field_f.c((byte) 25);
                            var8 = ((g) this).field_f.e(false);
                            var9 = ((g) this).field_f.c((byte) 124);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var11 = stackIn_50_0;
                            var12 = (long)var7 + ((long)var6 << -919735392);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 56;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (fk) (Object) ((g) this).field_q.b((byte) 117);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var14_ref == null) {
                                statePc = 60;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var12 != var14_ref.field_j) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (fk) (Object) ((g) this).field_q.c((byte) 71);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14_ref = (fk) (Object) ((g) this).field_h.b((byte) 120);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var14_ref == null) {
                                statePc = 60;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if ((var14_ref.field_j ^ -1L) == (var12 ^ -1L)) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (fk) (Object) ((g) this).field_h.c((byte) 97);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (var14_ref == null) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var10 != 0) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 89;
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
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var15 = stackIn_66_0;
                            ((g) this).field_p = var14_ref;
                            ((g) this).field_p.field_A = new ni(((g) this).field_p.field_E + var9 + var15);
                            ((g) this).field_p.field_A.a(-11, var10);
                            ((g) this).field_p.field_A.a(var9, (byte) -106);
                            ((g) this).field_f.field_i = 0;
                            ((g) this).field_p.field_y = 10;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (-1 == (((g) this).field_p.field_y ^ -1)) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if ((((g) this).field_f.field_k[0] ^ -1) == 0) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((g) this).field_p = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((g) this).field_f.field_i = 0;
                            ((g) this).field_p.field_y = 1;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var5 = ((g) this).field_p.field_A.field_k.length + -((g) this).field_p.field_E;
                            var6 = -((g) this).field_p.field_y + 512;
                            if (var5 - ((g) this).field_p.field_A.field_i < var6) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var6 = -((g) this).field_p.field_A.field_i + var5;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var6 = var3_int;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((g) this).field_v.a(var6, ((g) this).field_p.field_A.field_k, ((g) this).field_p.field_A.field_i, false);
                            if (0 == ((g) this).field_g) {
                                statePc = 82;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var7 = 0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var7 >= var6) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((g) this).field_p.field_A.field_k[var7 + ((g) this).field_p.field_A.field_i] = (byte)df.a((int) ((g) this).field_p.field_A.field_k[var7 + ((g) this).field_p.field_A.field_i], (int) ((g) this).field_g);
                            var7++;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((g) this).field_p.field_y = ((g) this).field_p.field_y + var6;
                            ((g) this).field_p.field_A.field_i = ((g) this).field_p.field_A.field_i + var6;
                            if (((g) this).field_p.field_A.field_i == var5) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (512 != ((g) this).field_p.field_y) {
                                statePc = 86;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((g) this).field_p.field_y = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((g) this).field_p.e(-100);
                            ((g) this).field_p.field_q = false;
                            ((g) this).field_p = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var2_int++;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackOut_87_0 = 1;
                            stackIn_88_0 = stackOut_87_0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        return stackIn_88_0 != 0;
                    }
                    case 89: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 90: {
                        try {
                            ((g) this).field_v.h(0);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 92;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 93;
                        continue stateLoop;
                    }
                    case 93: {
                        ((g) this).field_c = ((g) this).field_c + 1;
                        ((g) this).field_b = -2;
                        ((g) this).field_v = null;
                        if (0 != ((g) this).f(1)) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        if (((g) this).e(-64) != 0) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        return true;
                    }
                    case 96: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_t = "Fleas get in each others' way, and can even climb over each other. If you have too many fleas together, be careful, as they can sometimes overflow out of the confined space they are in. On some levels you need to do this to win!";
        field_u = 0.0;
    }
}
