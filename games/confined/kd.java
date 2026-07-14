/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kd extends jf {
    private vd field_p;
    static ci field_t;
    static String field_q;
    static String field_s;
    static double field_r;

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((kd) this).field_p != null) {
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
                            ((kd) this).field_i.field_n = 0;
                            ((kd) this).field_i.f(94, 6);
                            ((kd) this).field_i.a((byte) 120, 3);
                            if (param0 == 22112) {
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
                            ((kd) this).field_i.c(0, 8);
                            ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
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
                            ((kd) this).field_p.a(1);
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
                        ((kd) this).field_a = ((kd) this).field_a + 1;
                        ((kd) this).field_p = null;
                        ((kd) this).field_e = -2;
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

    final void d(int param0) {
        if (param0 >= -57) {
            kd.d((byte) -7);
        }
        if (!(null == ((kd) this).field_p)) {
            ((kd) this).field_p.a(1);
        }
    }

    public static void d(byte param0) {
        if (param0 <= 86) {
            kd.d((byte) 68);
        }
        field_s = null;
        field_t = null;
        field_q = null;
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            tn var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Confined.field_J ? 1 : 0;
                        if (((kd) this).field_p != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((kd) this).field_p.a(param2 ^ -66);
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
                        ((kd) this).field_p = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((kd) this).field_p = (vd) param1;
                        if (param2 == -65) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        kd.d((byte) -56);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.e(22112);
                        this.a(param2 + 67, param0);
                        ((kd) this).field_m.field_n = 0;
                        ((kd) this).field_f = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (tn) (Object) ((kd) this).field_j.c(false);
                        if (var4_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((kd) this).field_o.a((jl) (Object) var4_ref2, (byte) -101);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (tn) (Object) ((kd) this).field_n.c(false);
                        if (var4_ref2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((kd) this).field_g.a((jl) (Object) var4_ref2, (byte) 127);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((kd) this).field_d == 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((kd) this).field_i.field_n = 0;
                            ((kd) this).field_i.f(param2 ^ -43, 4);
                            ((kd) this).field_i.f(param2 ^ -43, (int) ((kd) this).field_d);
                            ((kd) this).field_i.d(-104, 0);
                            ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
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
                            ((kd) this).field_p.a(1);
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
                        ((kd) this).field_e = -2;
                        ((kd) this).field_p = null;
                        ((kd) this).field_a = ((kd) this).field_a + 1;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((kd) this).field_l = 0;
                        ((kd) this).field_h = ri.a(param2 ^ 66);
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

    final void a(boolean param0) {
        try {
            ((kd) this).field_p.a(1);
        } catch (Exception exception) {
        }
        ((kd) this).field_a = ((kd) this).field_a + 1;
        if (!param0) {
            field_r = -1.6995276062907998;
        }
        ((kd) this).field_e = -1;
        ((kd) this).field_p = null;
        ((kd) this).field_d = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            kg stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            kg stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            kg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            kg stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            kg stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            kg stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((kd) this).field_p != null) {
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
                            ((kd) this).field_i.field_n = 0;
                            if (param0 == 2) {
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
                        return;
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = ((kd) this).field_i;
                            stackOut_4_1 = 90;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            if (!param1) {
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
                            stackOut_5_0 = (kg) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
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
                            stackOut_6_0 = (kg) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 3;
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
                            ((kg) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                            ((kd) this).field_i.a(0L, param0 + 8848);
                            ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
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
                            ((kd) this).field_p.a(1);
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
                        ((kd) this).field_a = ((kd) this).field_a + 1;
                        ((kd) this).field_p = null;
                        ((kd) this).field_e = -2;
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

    public kd() {
    }

    final static void a(byte param0, int param1, ca param2) {
        hb var3 = vh.field_a;
        var3.b(true, param1);
        var3.f(111, 2);
        var3.f(100, 0);
        var3.f(119, param2.field_m);
        int var4 = 2 % ((-44 - param0) / 35);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            tn var2_ref = null;
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
            tn var14_ref = null;
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
                        var16 = Confined.field_J ? 1 : 0;
                        if (((kd) this).field_p == null) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = ri.a(-3);
                        var4 = (int)(-((kd) this).field_h + var2_long);
                        ((kd) this).field_h = var2_long;
                        if (-201 <= var4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = 200;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        ((kd) this).field_l = ((kd) this).field_l + var4;
                        if (-30001 >= ((kd) this).field_l) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            ((kd) this).field_p.a(1);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        ((kd) this).field_p = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (((kd) this).field_p == null) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (0 != ((kd) this).a(-28475)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((kd) this).c((byte) -5)) {
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
                            ((kd) this).field_p.b(110);
                            if (param0 >= 11) {
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
                            field_q = null;
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
                            var2_ref = (tn) (Object) ((kd) this).field_o.d(92);
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
                            ((kd) this).field_i.field_n = 0;
                            ((kd) this).field_i.f(95, 1);
                            ((kd) this).field_i.a(var2_ref.field_r, 8850);
                            ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
                            ((kd) this).field_j.a((jl) (Object) var2_ref, (byte) -114);
                            var2_ref = (tn) (Object) ((kd) this).field_o.a((byte) -113);
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
                            var2_ref = (tn) (Object) ((kd) this).field_g.d(-94);
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
                            ((kd) this).field_i.field_n = 0;
                            ((kd) this).field_i.f(90, 0);
                            ((kd) this).field_i.a(var2_ref.field_r, 8850);
                            ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
                            ((kd) this).field_n.a((jl) (Object) var2_ref, (byte) 117);
                            var2_ref = (tn) (Object) ((kd) this).field_g.a((byte) -119);
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
                            if (var2_int >= 100) {
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
                            var3_int = ((kd) this).field_p.c((byte) -99);
                            if (0 <= var3_int) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (-1 != (var3_int ^ -1)) {
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
                            return true;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((kd) this).field_l = 0;
                            var4 = 0;
                            if (((kd) this).field_f == null) {
                                statePc = 32;
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
                            if (0 == ((kd) this).field_f.field_B) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
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
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 10;
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
                            if (0 < var4) {
                                statePc = 48;
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
                            var5 = ((kd) this).field_f.field_A.field_m.length - ((kd) this).field_f.field_z;
                            var6 = -((kd) this).field_f.field_B + 512;
                            if (var6 > -((kd) this).field_f.field_A.field_n + var5) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var6 = -((kd) this).field_f.field_A.field_n + var5;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var3_int >= var6) {
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
                            var6 = var3_int;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((kd) this).field_p.a(((kd) this).field_f.field_A.field_m, -99, var6, ((kd) this).field_f.field_A.field_n);
                            if (((kd) this).field_d != 0) {
                                statePc = 41;
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
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var7 = 0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var7 >= var6) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((kd) this).field_f.field_A.field_m[((kd) this).field_f.field_A.field_n + var7] = (byte)km.a((int) ((kd) this).field_f.field_A.field_m[((kd) this).field_f.field_A.field_n + var7], (int) ((kd) this).field_d);
                            var7++;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((kd) this).field_f.field_B = ((kd) this).field_f.field_B + var6;
                            ((kd) this).field_f.field_A.field_n = ((kd) this).field_f.field_A.field_n + var6;
                            if (var5 != ((kd) this).field_f.field_A.field_n) {
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
                            ((kd) this).field_f.b(true);
                            ((kd) this).field_f.field_v = false;
                            ((kd) this).field_f = null;
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
                            if ((((kd) this).field_f.field_B ^ -1) != -513) {
                                statePc = 82;
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
                            ((kd) this).field_f.field_B = 0;
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
                            var5 = -((kd) this).field_m.field_n + var4;
                            if (var3_int >= var5) {
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
                            var5 = var3_int;
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
                            ((kd) this).field_p.a(((kd) this).field_m.field_m, 49, var5, ((kd) this).field_m.field_n);
                            if (((kd) this).field_d == 0) {
                                statePc = 54;
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
                            var6 = 0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var5 <= var6) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((kd) this).field_m.field_m[((kd) this).field_m.field_n + var6] = (byte)km.a((int) ((kd) this).field_m.field_m[((kd) this).field_m.field_n + var6], (int) ((kd) this).field_d);
                            var6++;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((kd) this).field_m.field_n = ((kd) this).field_m.field_n + var5;
                            if (((kd) this).field_m.field_n < var4) {
                                statePc = 82;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (((kd) this).field_f == null) {
                                statePc = 57;
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
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((kd) this).field_m.field_n = 0;
                            var6 = ((kd) this).field_m.c(32);
                            var7 = ((kd) this).field_m.f((byte) 70);
                            var8 = ((kd) this).field_m.c(32);
                            var9 = ((kd) this).field_m.f((byte) 59);
                            var10 = var8 & 127;
                            if (0 == (var8 & 128)) {
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
                            var12 = ((long)var6 << -1646948512) + (long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 66;
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
                            var14_ref = (tn) (Object) ((kd) this).field_n.d(-103);
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
                            if (var14_ref.field_r != var12) {
                                statePc = 65;
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
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var14_ref = (tn) (Object) ((kd) this).field_n.a((byte) -7);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14_ref = (tn) (Object) ((kd) this).field_j.d(-97);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14_ref == null) {
                                statePc = 70;
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
                            if ((var14_ref.field_r ^ -1L) == (var12 ^ -1L)) {
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
                            var14_ref = (tn) (Object) ((kd) this).field_j.a((byte) -117);
                            statePc = 67;
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
                            ((kd) this).field_f = var14_ref;
                            ((kd) this).field_f.field_A = new kg(var9 + (var15 + ((kd) this).field_f.field_z));
                            ((kd) this).field_f.field_A.f(127, var10);
                            ((kd) this).field_f.field_A.d(-86, var9);
                            ((kd) this).field_f.field_B = 10;
                            ((kd) this).field_m.field_n = 0;
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
                            if (((kd) this).field_f.field_B == 0) {
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
                            if (((kd) this).field_m.field_m[0] != -1) {
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
                            ((kd) this).field_m.field_n = 0;
                            ((kd) this).field_f.field_B = 1;
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
                            ((kd) this).field_f = null;
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
                            ((kd) this).field_p.a(1);
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
                        ((kd) this).field_a = ((kd) this).field_a + 1;
                        ((kd) this).field_p = null;
                        ((kd) this).field_e = -2;
                        if (0 != ((kd) this).a(-28475)) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (-1 != (((kd) this).c((byte) -5) ^ -1)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<col=FFFFFF>Power shots:</col> this upgrade makes your basic weapon a lot more powerful for 30 seconds. The tunnel has never looked so bright.";
        field_s = "Rapid fire";
        field_t = new ci();
    }
}
