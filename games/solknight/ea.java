/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea extends va {
    private ad field_r;
    static String field_q;
    static int[] field_p;
    static int field_o;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ic var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = SolKnight.field_L ? 1 : 0;
                        if (((ea) this).field_r != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((ea) this).field_r.d(param1 + -104);
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
                        ((ea) this).field_r = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((ea) this).field_r = (ad) param2;
                        if (param1 == 106) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        this.c(false);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.c(true);
                        this.a(param0, false);
                        ((ea) this).field_a = null;
                        ((ea) this).field_h.field_m = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (ic) (Object) ((ea) this).field_i.c(param1 ^ 106);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((ea) this).field_m.a((ec) (Object) var4_ref2, 0);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (ic) (Object) ((ea) this).field_k.c(0);
                        if (var4_ref2 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((ea) this).field_d.a((ec) (Object) var4_ref2, 0);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((ea) this).field_n != 0) {
                            statePc = 16;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((ea) this).field_e.field_m = 0;
                            ((ea) this).field_e.c(95, 4);
                            ((ea) this).field_e.c(7, (int) ((ea) this).field_n);
                            ((ea) this).field_e.b(0, false);
                            ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
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
                            ((ea) this).field_r.d(2);
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
                        ((ea) this).field_l = ((ea) this).field_l + 1;
                        ((ea) this).field_r = null;
                        ((ea) this).field_c = -2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((ea) this).field_j = 0;
                        ((ea) this).field_b = je.a(1);
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

    final static od e(byte param0) {
        int var1 = -72 / ((param0 - 13) / 63);
        od var2 = new od(kl.field_a, we.field_e, ph.field_h[0], qf.field_d[0], sa.field_l[0], uj.field_b[0], jc.field_c[0], ig.field_H);
        og.a((byte) -97);
        return var2;
    }

    public static void d(boolean param0) {
        field_p = null;
        if (param0) {
            od discarded$0 = ea.e((byte) 96);
        }
        field_q = null;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            gb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            gb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            gb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            gb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            gb stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ea) this).field_r == null) {
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
                            ((ea) this).field_e.field_m = 0;
                            stackOut_3_0 = ((ea) this).field_e;
                            stackOut_3_1 = 31;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (param0) {
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
                            stackOut_4_0 = (gb) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_6_2 = stackOut_4_2;
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
                            stackOut_5_0 = (gb) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
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
                            ((gb) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2);
                            if (!param1) {
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
                        try {
                            ea.d(false);
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
                            ((ea) this).field_e.a(0L, 25576);
                            ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
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
                            ((ea) this).field_r.d(2);
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
                        ((ea) this).field_l = ((ea) this).field_l + 1;
                        ((ea) this).field_c = -2;
                        ((ea) this).field_r = null;
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

    final boolean d(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ic var2_ref = null;
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
            ic var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_48_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_85_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_84_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = SolKnight.field_L ? 1 : 0;
                        if (null == ((ea) this).field_r) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = je.a(1);
                        var4 = (int)(-((ea) this).field_b + var2_long);
                        ((ea) this).field_b = var2_long;
                        if (var4 > 200) {
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
                        ((ea) this).field_j = ((ea) this).field_j + var4;
                        if (((ea) this).field_j > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ea) this).field_r.d(2);
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
                        ((ea) this).field_r = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == ((ea) this).field_r) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 != ((ea) this).b(false)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (((ea) this).c(param0 ^ -25) != 0) {
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
                            ((ea) this).field_r.a(true);
                            var2_ref = (ic) (Object) ((ea) this).field_m.d(122);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((ea) this).field_e.field_m = 0;
                            ((ea) this).field_e.c(param0 ^ 71, 1);
                            ((ea) this).field_e.a(var2_ref.field_l, param0 ^ 25576);
                            ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                            ((ea) this).field_i.a((ec) (Object) var2_ref, 0);
                            var2_ref = (ic) (Object) ((ea) this).field_m.b(param0 ^ -1);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param0 == 0) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ea.d(false);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_ref = (ic) (Object) ((ea) this).field_d.d(123);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((ea) this).field_e.field_m = 0;
                            ((ea) this).field_e.c(117, 0);
                            ((ea) this).field_e.a(var2_ref.field_l, 25576);
                            ((ea) this).field_r.a(param0 ^ -28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                            ((ea) this).field_k.a((ec) (Object) var2_ref, 0);
                            var2_ref = (ic) (Object) ((ea) this).field_d.b(-1);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 84;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((ea) this).field_r.b(-30119);
                            if (0 <= var3_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (-1 != var3_int) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((ea) this).field_j = 0;
                            var4 = 0;
                            if (null == ((ea) this).field_a) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (0 != ((ea) this).field_a.field_s) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var4 <= 0) {
                                statePc = 69;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = -((ea) this).field_h.field_m + var4;
                            if (var5 > var3_int) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var5 = var3_int;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((ea) this).field_r.a((byte) 39, ((ea) this).field_h.field_m, var5, ((ea) this).field_h.field_l);
                            if (((ea) this).field_n == 0) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6 = 0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var6 >= var5) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((ea) this).field_h.field_l[var6 + ((ea) this).field_h.field_m] = (byte)wa.a((int) ((ea) this).field_h.field_l[var6 + ((ea) this).field_h.field_m], (int) ((ea) this).field_n);
                            var6++;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((ea) this).field_h.field_m = ((ea) this).field_h.field_m + var5;
                            if (((ea) this).field_h.field_m >= var4) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (((ea) this).field_a != null) {
                                statePc = 64;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((ea) this).field_h.field_m = 0;
                            var6 = ((ea) this).field_h.j(255);
                            var7 = ((ea) this).field_h.e(true);
                            var8 = ((ea) this).field_h.j(255);
                            var9 = ((ea) this).field_h.e(true);
                            var10 = var8 & 127;
                            if ((128 & var8) == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackOut_46_0 = 1;
                            stackIn_48_0 = stackOut_46_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = 0;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var11 = stackIn_48_0;
                            var12 = (long)var7 + ((long)var6 << -959417440);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 53;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var14_ref = (ic) (Object) ((ea) this).field_k.d(122);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var14_ref == null) {
                                statePc = 57;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if ((var12 ^ -1L) == (var14_ref.field_l ^ -1L)) {
                                statePc = 57;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var14_ref = (ic) (Object) ((ea) this).field_k.b(-1);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var14_ref = (ic) (Object) ((ea) this).field_i.d(124);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var14_ref == null) {
                                statePc = 57;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if ((var14_ref.field_l ^ -1L) == (var12 ^ -1L)) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14_ref = (ic) (Object) ((ea) this).field_i.b(-1);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var14_ref == null) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (0 != var10) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 5;
                            stackIn_63_0 = stackOut_61_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackOut_62_0 = 9;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var15 = stackIn_63_0;
                            ((ea) this).field_a = var14_ref;
                            ((ea) this).field_a.field_v = new gb(var9 + (var15 - -((ea) this).field_a.field_y));
                            ((ea) this).field_a.field_v.c(param0 + 53, var10);
                            ((ea) this).field_a.field_v.b(var9, false);
                            ((ea) this).field_h.field_m = 0;
                            ((ea) this).field_a.field_s = 10;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (((ea) this).field_a.field_s != 0) {
                                statePc = 68;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (((ea) this).field_h.field_l[0] != -1) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ((ea) this).field_h.field_m = 0;
                            ((ea) this).field_a.field_s = 1;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ((ea) this).field_a = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var5 = -((ea) this).field_a.field_y + ((ea) this).field_a.field_v.field_l.length;
                            var6 = -((ea) this).field_a.field_s + 512;
                            if (-((ea) this).field_a.field_v.field_m + var5 >= var6) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var6 = -((ea) this).field_a.field_v.field_m + var5;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var6 = var3_int;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((ea) this).field_r.a((byte) 44, ((ea) this).field_a.field_v.field_m, var6, ((ea) this).field_a.field_v.field_l);
                            if (((ea) this).field_n != 0) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var6 <= var17) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((ea) this).field_a.field_v.field_l[((ea) this).field_a.field_v.field_m + var17] = (byte)wa.a((int) ((ea) this).field_a.field_v.field_l[((ea) this).field_a.field_v.field_m + var17], (int) ((ea) this).field_n);
                            var17++;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((ea) this).field_a.field_v.field_m = ((ea) this).field_a.field_v.field_m + var6;
                            ((ea) this).field_a.field_s = ((ea) this).field_a.field_s + var6;
                            if (var5 != ((ea) this).field_a.field_v.field_m) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((ea) this).field_a.a(97);
                            ((ea) this).field_a.field_m = false;
                            ((ea) this).field_a = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (((ea) this).field_a.field_s != 512) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((ea) this).field_a.field_s = 0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackOut_84_0 = 1;
                            stackIn_85_0 = stackOut_84_0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        return stackIn_85_0 != 0;
                    }
                    case 86: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 87: {
                        try {
                            ((ea) this).field_r.d(param0 + 2);
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 90: {
                        ((ea) this).field_r = null;
                        ((ea) this).field_c = -2;
                        ((ea) this).field_l = ((ea) this).field_l + 1;
                        if (0 != ((ea) this).b(false)) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        if (((ea) this).c(param0 ^ -128) != 0) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        return true;
                    }
                    case 93: {
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

    private final void c(boolean param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ea) this).field_r == null) {
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
                            ((ea) this).field_e.field_m = 0;
                            ((ea) this).field_e.c(-128, 6);
                            ((ea) this).field_e.d(3, 2132504424);
                            ((ea) this).field_e.a(param0, 0);
                            ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ea) this).field_r.d(2);
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
                        ((ea) this).field_l = ((ea) this).field_l + 1;
                        ((ea) this).field_r = null;
                        ((ea) this).field_c = -2;
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

    final void c(byte param0) {
        try {
            ((ea) this).field_r.d(2);
        } catch (Exception exception) {
        }
        ((ea) this).field_l = ((ea) this).field_l + 1;
        ((ea) this).field_r = null;
        if (param0 != 59) {
            return;
        }
        ((ea) this).field_c = -1;
        ((ea) this).field_n = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    public ea() {
    }

    final void a(byte param0) {
        if (param0 != 92) {
            field_q = null;
        }
        if (!(null == ((ea) this).field_r)) {
            ((ea) this).field_r.d(2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Instructions";
        field_p = new int[]{96, 96, 96, 112, 124, 192, 96, 96};
    }
}
