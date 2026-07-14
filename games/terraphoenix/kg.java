/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kg extends h {
    private tf field_p;
    static boolean field_q;
    static ci[] field_r;

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            dh stackIn_4_0 = null;
            dh stackIn_5_0 = null;
            dh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            dh stackOut_3_0 = null;
            dh stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            dh stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((kg) this).field_p) {
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
                            ((kg) this).field_e.field_k = 0;
                            stackOut_3_0 = ((kg) this).field_e;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            if (param1) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (dh) (Object) stackIn_4_0;
                            stackOut_4_1 = 3;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (dh) (Object) stackIn_5_0;
                            stackOut_5_1 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((dh) (Object) stackIn_6_0).i(stackIn_6_1, param0 + -99);
                            ((kg) this).field_e.b((long)param0, -2108648176);
                            ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((kg) this).field_p.a((byte) -127);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        ((kg) this).field_i = ((kg) this).field_i + 1;
                        ((kg) this).field_p = null;
                        ((kg) this).field_l = -2;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
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

    final void a(int param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            nh var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Terraphoenix.field_V;
                        if (null == ((kg) this).field_p) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((kg) this).field_p.a((byte) -127);
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
                        ((kg) this).field_p = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((kg) this).field_p = (tf) param1;
                        this.d(false);
                        this.a(0, param2);
                        ((kg) this).field_k = null;
                        ((kg) this).field_o.field_k = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref2 = (nh) (Object) ((kg) this).field_m.a((byte) -66);
                        if (var4_ref2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((kg) this).field_b.a(param0 + 1456354992, (vh) (Object) var4_ref2);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (nh) (Object) ((kg) this).field_g.a((byte) -61);
                        if (var4_ref2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((kg) this).field_a.a(param0 ^ -1456349328, (vh) (Object) var4_ref2);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 10: {
                        if (-1 != (((kg) this).field_n ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((kg) this).field_e.field_k = 0;
                            ((kg) this).field_e.i(4, -90);
                            ((kg) this).field_e.i((int) ((kg) this).field_n, 68);
                            ((kg) this).field_e.e(0, 8959);
                            ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((kg) this).field_p.a((byte) -123);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((kg) this).field_p = null;
                        ((kg) this).field_l = -2;
                        ((kg) this).field_i = ((kg) this).field_i + 1;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((kg) this).field_h = 0;
                        ((kg) this).field_f = ll.a(1000);
                        if (param0 == -1456343840) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        field_q = false;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
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
        if (param0 > -94) {
            field_r = null;
        }
        if (!(null == ((kg) this).field_p)) {
            ((kg) this).field_p.a((byte) -126);
        }
    }

    private final void d(boolean param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((kg) this).field_p) {
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
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        ((kg) this).b(-29);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((kg) this).field_e.field_k = 0;
                            ((kg) this).field_e.i(6, -108);
                            ((kg) this).field_e.a(3, (byte) -89);
                            ((kg) this).field_e.h(-1564407352, 0);
                            ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
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
                            ((kg) this).field_p.a((byte) -122);
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
                        ((kg) this).field_i = ((kg) this).field_i + 1;
                        ((kg) this).field_l = -2;
                        ((kg) this).field_p = null;
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

    final void b(int param0) {
        try {
            ((kg) this).field_p.a((byte) -124);
        } catch (Exception exception) {
        }
        ((kg) this).field_i = ((kg) this).field_i + 1;
        ((kg) this).field_l = -1;
        if (param0 != -12948) {
            this.d(true);
        }
        ((kg) this).field_p = null;
        ((kg) this).field_n = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final boolean c(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            nh var2_ref = null;
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
            nh var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_43_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_84_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_83_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Terraphoenix.field_V;
                        if (null != ((kg) this).field_p) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ll.a(1000);
                        var4 = (int)(var2_long - ((kg) this).field_f);
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
                        ((kg) this).field_f = var2_long;
                        ((kg) this).field_h = ((kg) this).field_h + var4;
                        if (-30001 <= (((kg) this).field_h ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((kg) this).field_p.a((byte) 71);
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
                        ((kg) this).field_p = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((kg) this).field_p != null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (((kg) this).c(96) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((kg) this).a((byte) -103)) {
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
                            ((kg) this).field_p.c(10509);
                            var2_ref = (nh) (Object) ((kg) this).field_b.c(8192);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var2_ref == null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((kg) this).field_e.field_k = 0;
                            ((kg) this).field_e.i(1, -115);
                            ((kg) this).field_e.b(var2_ref.field_m, -2108648176);
                            ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                            ((kg) this).field_m.a(11152, (vh) (Object) var2_ref);
                            var2_ref = (nh) (Object) ((kg) this).field_b.a(6273);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var2_ref = (nh) (Object) ((kg) this).field_a.c(8192);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((kg) this).field_e.field_k = 0;
                            ((kg) this).field_e.i(0, -124);
                            ((kg) this).field_e.b(var2_ref.field_m, -2108648176);
                            ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                            ((kg) this).field_g.a(11152, (vh) (Object) var2_ref);
                            var2_ref = (nh) (Object) ((kg) this).field_a.a(6273);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var2_int = 0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((var2_int ^ -1) <= -101) {
                                statePc = 81;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3_int = ((kg) this).field_p.a(0);
                            if (var3_int >= 0) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (0 != var3_int) {
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
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((kg) this).field_h = 0;
                            var4 = 0;
                            if (null != ((kg) this).field_k) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var4 = 10;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (((kg) this).field_k.field_F != 0) {
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
                            var4 = 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 65;
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
                            var5 = -((kg) this).field_o.field_k + var4;
                            if (var5 <= var3_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var5 = var3_int;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ((kg) this).field_p.a(((kg) this).field_o.field_i, var5, ((kg) this).field_o.field_k, (byte) 101);
                            if (-1 == (((kg) this).field_n ^ -1)) {
                                statePc = 37;
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
                            var6 = 0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var5 <= var6) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            ((kg) this).field_o.field_i[((kg) this).field_o.field_k + var6] = (byte)sl.a((int) ((kg) this).field_o.field_i[((kg) this).field_o.field_k + var6], (int) ((kg) this).field_n);
                            var6++;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            ((kg) this).field_o.field_k = ((kg) this).field_o.field_k + var5;
                            if (var4 <= ((kg) this).field_o.field_k) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((kg) this).field_k != null) {
                                statePc = 60;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((kg) this).field_o.field_k = 0;
                            var6 = ((kg) this).field_o.a(-16384);
                            var7 = ((kg) this).field_o.f((byte) -107);
                            var8 = ((kg) this).field_o.a(-16384);
                            var9 = ((kg) this).field_o.f((byte) -107);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            stackOut_41_0 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var11 = stackIn_43_0;
                            var12 = (long)var7 + ((long)var6 << -1911674656);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 49;
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
                            var14_ref = (nh) (Object) ((kg) this).field_m.c(8192);
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var14_ref == null) {
                                statePc = 53;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var14_ref.field_m != var12) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var14_ref = (nh) (Object) ((kg) this).field_m.a(6273);
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var14_ref = (nh) (Object) ((kg) this).field_g.c(8192);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var14_ref == null) {
                                statePc = 53;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var12 == var14_ref.field_m) {
                                statePc = 53;
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
                            var14_ref = (nh) (Object) ((kg) this).field_g.a(6273);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var14_ref == null) {
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
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var10 != 0) {
                                statePc = 58;
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
                            stackOut_57_0 = 5;
                            stackIn_59_0 = stackOut_57_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 9;
                            stackIn_59_0 = stackOut_58_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var15 = stackIn_59_0;
                            ((kg) this).field_k = var14_ref;
                            ((kg) this).field_k.field_H = new dh(((kg) this).field_k.field_G + (var15 + var9));
                            ((kg) this).field_k.field_H.i(var10, 89);
                            ((kg) this).field_k.field_H.e(var9, 8959);
                            ((kg) this).field_k.field_F = 10;
                            ((kg) this).field_o.field_k = 0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((kg) this).field_k.field_F != 0) {
                                statePc = 64;
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
                            if (-1 != ((kg) this).field_o.field_i[0]) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((kg) this).field_o.field_k = 0;
                            ((kg) this).field_k.field_F = 1;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((kg) this).field_k = null;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var5 = ((kg) this).field_k.field_H.field_i.length + -((kg) this).field_k.field_G;
                            var6 = -((kg) this).field_k.field_F + 512;
                            if (var6 > var5 - ((kg) this).field_k.field_H.field_k) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var6 = var5 + -((kg) this).field_k.field_H.field_k;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var3_int < var6) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var6 = var3_int;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((kg) this).field_p.a(((kg) this).field_k.field_H.field_i, var6, ((kg) this).field_k.field_H.field_k, (byte) 117);
                            if (((kg) this).field_n == 0) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var7 = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var7 >= var6) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((kg) this).field_k.field_H.field_i[var7 + ((kg) this).field_k.field_H.field_k] = (byte)sl.a((int) ((kg) this).field_k.field_H.field_i[var7 + ((kg) this).field_k.field_H.field_k], (int) ((kg) this).field_n);
                            var7++;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((kg) this).field_k.field_F = ((kg) this).field_k.field_F + var6;
                            ((kg) this).field_k.field_H.field_k = ((kg) this).field_k.field_H.field_k + var6;
                            if (((kg) this).field_k.field_H.field_k != var5) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((kg) this).field_k.c((byte) 13);
                            ((kg) this).field_k.field_A = false;
                            ((kg) this).field_k = null;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (512 == ((kg) this).field_k.field_F) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((kg) this).field_k.field_F = 0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var2_int++;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (param0) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            field_r = null;
                            return true;
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
                            ((kg) this).field_p.a((byte) 116);
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
                        ((kg) this).field_l = -2;
                        ((kg) this).field_p = null;
                        ((kg) this).field_i = ((kg) this).field_i + 1;
                        if (((kg) this).c(79) != 0) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (((kg) this).a((byte) -103) != 0) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        return true;
                    }
                    case 92: {
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

    public kg() {
    }

    public static void e(int param0) {
        if (param0 != 7087) {
            kg.e(96);
        }
        field_r = null;
    }

    static {
    }
}
