/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gv extends qda {
    private jqa field_t;
    static int[] field_q;
    static jpa field_s;
    static String field_r;
    static int field_u;
    static String field_v;
    static String[] field_w;

    public gv() {
    }

    public static void a(boolean param0) {
        field_v = null;
        field_q = null;
        field_s = null;
        field_r = null;
        if (param0) {
            return;
        }
        field_w = null;
    }

    final void a(int param0) {
        if (!(null == ((gv) this).field_t)) {
            ((gv) this).field_t.a((byte) 105);
        }
        if (param0 != -21) {
            field_v = null;
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            qqa var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TombRacer.field_G ? 1 : 0;
                        if (((gv) this).field_t != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((gv) this).field_t.a((byte) 105);
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
                        ((gv) this).field_t = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((gv) this).field_t = (jqa) param0;
                        this.g(param1 + -104);
                        if (param1 == 54) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        field_w = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.a((byte) 117, param2);
                        ((gv) this).field_h.field_h = 0;
                        ((gv) this).field_g = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (qqa) (Object) ((gv) this).field_m.c((byte) 121);
                        if (var4_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((gv) this).field_e.a((od) (Object) var4_ref2, (byte) -81);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (qqa) (Object) ((gv) this).field_k.c((byte) 111);
                        if (var4_ref2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((gv) this).field_c.a((od) (Object) var4_ref2, (byte) -104);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((gv) this).field_d == 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((gv) this).field_o.field_h = 0;
                            ((gv) this).field_o.i(4, param1 + -54);
                            ((gv) this).field_o.i((int) ((gv) this).field_d, param1 ^ 54);
                            ((gv) this).field_o.a(0, (byte) -17);
                            ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 124);
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
                            ((gv) this).field_t.a((byte) 105);
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
                        ((gv) this).field_n = -2;
                        ((gv) this).field_t = null;
                        ((gv) this).field_a = ((gv) this).field_a + 1;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((gv) this).field_p = 0;
                        ((gv) this).field_j = bva.b((byte) -107);
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

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            uia stackIn_3_0 = null;
            uia stackIn_4_0 = null;
            uia stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            uia stackOut_2_0 = null;
            uia stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            uia stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((gv) this).field_t) {
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
                            ((gv) this).field_o.field_h = 0;
                            stackOut_2_0 = ((gv) this).field_o;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_3_0 = stackOut_2_0;
                            if (!param1) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (uia) (Object) stackIn_3_0;
                            stackOut_3_1 = 2;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (uia) (Object) stackIn_4_0;
                            stackOut_4_1 = 3;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((uia) (Object) stackIn_5_0).i(stackIn_5_1, 0);
                            ((gv) this).field_o.a(true, 0L);
                            ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 124);
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
                            ((gv) this).field_t.a((byte) 105);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((gv) this).field_t = null;
                        ((gv) this).field_a = ((gv) this).field_a + 1;
                        ((gv) this).field_n = -2;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param0 == 117) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        field_r = null;
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

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        if (param5 != 0) {
            gv.a(true);
        }
        int var10 = -(param2 * param7 / param8) + param6;
        if (var10 >= param0) {
            if (param9 >= var10) {
                if (param3 <= param6) {
                    // if_icmpgt L118
                    // if_icmpgt L118
                } else {
                    // if_icmplt L118
                    // if_icmpgt L118
                }
                var11 = -(param2 << param1) / param8;
                if (var11 <= -1) {
                    if (1 << param1 > var11) {
                        if (0 != param4) {
                            // if_icmple L118
                        }
                        return var11;
                    }
                }
            }
        }
        return param4;
    }

    final boolean c(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            qqa var2_ref = null;
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
            qqa var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_59_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_85_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_84_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = TombRacer.field_G ? 1 : 0;
                        if (null == ((gv) this).field_t) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = bva.b((byte) -107);
                        var4 = (int)(-((gv) this).field_j + var2_long);
                        ((gv) this).field_j = var2_long;
                        if (var4 <= 200) {
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
                        ((gv) this).field_p = ((gv) this).field_p + var4;
                        if (-30001 > (((gv) this).field_p ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((gv) this).field_t.a((byte) 105);
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
                        ((gv) this).field_t = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((gv) this).field_t == null) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((gv) this).f(-3) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((gv) this).a((byte) 78) == 0) {
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
                            ((gv) this).field_t.b(102);
                            var2_ref = (qqa) (Object) ((gv) this).field_e.b((byte) 38);
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
                            ((gv) this).field_o.field_h = 0;
                            ((gv) this).field_o.i(1, 0);
                            ((gv) this).field_o.a(true, var2_ref.field_j);
                            ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 119);
                            ((gv) this).field_m.a((od) (Object) var2_ref, (byte) -100);
                            var2_ref = (qqa) (Object) ((gv) this).field_e.c(28);
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
                            var2_ref = (qqa) (Object) ((gv) this).field_c.b((byte) 38);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((gv) this).field_o.field_h = 0;
                            ((gv) this).field_o.i(0, 0);
                            ((gv) this).field_o.a(true, var2_ref.field_j);
                            ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 101);
                            ((gv) this).field_k.a((od) (Object) var2_ref, (byte) -99);
                            var2_ref = (qqa) (Object) ((gv) this).field_c.c(28);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 82;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_int = ((gv) this).field_t.c(0);
                            if (0 > var3_int) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var3_int == 0) {
                                statePc = 82;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((gv) this).field_p = 0;
                            var4 = 0;
                            if (((gv) this).field_g != null) {
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
                            var4 = 10;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((gv) this).field_g.field_s == 0) {
                                statePc = 32;
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
                            statePc = 33;
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
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var4 > 0) {
                                statePc = 47;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var5 = ((gv) this).field_g.field_r.field_g.length - ((gv) this).field_g.field_q;
                            var6 = -((gv) this).field_g.field_s + 512;
                            if (var5 + -((gv) this).field_g.field_r.field_h >= var6) {
                                statePc = 36;
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
                            var6 = -((gv) this).field_g.field_r.field_h + var5;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((gv) this).field_t.a(0, ((gv) this).field_g.field_r.field_h, ((gv) this).field_g.field_r.field_g, var6);
                            if (((gv) this).field_d != 0) {
                                statePc = 40;
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
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var7 >= var6) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((gv) this).field_g.field_r.field_g[((gv) this).field_g.field_r.field_h - -var7] = (byte)kha.b((int) ((gv) this).field_g.field_r.field_g[((gv) this).field_g.field_r.field_h + var7], (int) ((gv) this).field_d);
                            var7++;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((gv) this).field_g.field_s = ((gv) this).field_g.field_s + var6;
                            ((gv) this).field_g.field_r.field_h = ((gv) this).field_g.field_r.field_h + var6;
                            if (var5 != ((gv) this).field_g.field_r.field_h) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((gv) this).field_g.c(-7975);
                            ((gv) this).field_g.field_m = false;
                            ((gv) this).field_g = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (-513 != (((gv) this).field_g.field_s ^ -1)) {
                                statePc = 81;
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
                            ((gv) this).field_g.field_s = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var5 = -((gv) this).field_h.field_h + var4;
                            if (var3_int >= var5) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var5 = var3_int;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((gv) this).field_t.a(0, ((gv) this).field_h.field_h, ((gv) this).field_h.field_g, var5);
                            if (0 != ((gv) this).field_d) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 86;
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
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((gv) this).field_h.field_g[var6 + ((gv) this).field_h.field_h] = (byte)kha.b((int) ((gv) this).field_h.field_g[var6 + ((gv) this).field_h.field_h], (int) ((gv) this).field_d);
                            var6++;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((gv) this).field_h.field_h = ((gv) this).field_h.field_h + var5;
                            if (var4 > ((gv) this).field_h.field_h) {
                                statePc = 81;
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
                            if (((gv) this).field_g != null) {
                                statePc = 76;
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
                            ((gv) this).field_h.field_h = 0;
                            var6 = ((gv) this).field_h.h(255);
                            var7 = ((gv) this).field_h.e(105);
                            var8 = ((gv) this).field_h.h(255);
                            var9 = ((gv) this).field_h.e(-60);
                            var10 = 127 & var8;
                            if ((128 & var8) == 0) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackOut_57_0 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 0;
                            stackIn_59_0 = stackOut_58_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var11 = stackIn_59_0;
                            var12 = ((long)var6 << -1765381280) + (long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 64;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var14_ref = (qqa) (Object) ((gv) this).field_m.b((byte) 38);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var14_ref == null) {
                                statePc = 69;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if ((var14_ref.field_j ^ -1L) == (var12 ^ -1L)) {
                                statePc = 69;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (qqa) (Object) ((gv) this).field_m.c(28);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (qqa) (Object) ((gv) this).field_k.b((byte) 38);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref == null) {
                                statePc = 69;
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
                            if ((var14_ref.field_j ^ -1L) != (var12 ^ -1L)) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (qqa) (Object) ((gv) this).field_k.c(28);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var14_ref == null) {
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
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (-1 != (var10 ^ -1)) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackOut_73_0 = 5;
                            stackIn_75_0 = stackOut_73_0;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackOut_74_0 = 9;
                            stackIn_75_0 = stackOut_74_0;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var15 = stackIn_75_0;
                            ((gv) this).field_g = var14_ref;
                            ((gv) this).field_g.field_r = new uia(var9 + var15 - -((gv) this).field_g.field_q);
                            ((gv) this).field_g.field_r.i(var10, 0);
                            ((gv) this).field_g.field_r.a(var9, (byte) 119);
                            ((gv) this).field_h.field_h = 0;
                            ((gv) this).field_g.field_s = 10;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (((gv) this).field_g.field_s != 0) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((((gv) this).field_h.field_g[0] ^ -1) != 0) {
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
                            ((gv) this).field_g.field_s = 1;
                            ((gv) this).field_h.field_h = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((gv) this).field_g = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var2_int++;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (param0 > 26) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            gv.a(false);
                            statePc = 84;
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
                            ((gv) this).field_t.a((byte) 105);
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
                        ((gv) this).field_t = null;
                        ((gv) this).field_n = -2;
                        ((gv) this).field_a = ((gv) this).field_a + 1;
                        if (((gv) this).f(-3) != 0) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        if (((gv) this).a((byte) 78) != 0) {
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

    final void e(int param0) {
        try {
            ((gv) this).field_t.a((byte) 105);
        } catch (Exception exception) {
        }
        ((gv) this).field_t = null;
        ((gv) this).field_a = ((gv) this).field_a + 1;
        ((gv) this).field_n = param0;
        ((gv) this).field_d = (byte)(int)(1.0 + Math.random() * 255.0);
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
                        if (null != ((gv) this).field_t) {
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
                            if (param0 <= -48) {
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
                        try {
                            boolean discarded$3 = ((gv) this).c(21);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((gv) this).field_o.field_h = 0;
                            ((gv) this).field_o.i(6, 0);
                            ((gv) this).field_o.h(-86, 3);
                            ((gv) this).field_o.f(-1477662136, 0);
                            ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 118);
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
                            ((gv) this).field_t.a((byte) 105);
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
                        ((gv) this).field_t = null;
                        ((gv) this).field_n = -2;
                        ((gv) this).field_a = ((gv) this).field_a + 1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "You unlocked a new character!";
        field_r = "<%0> would need a rating of <%1> to play with the current options.";
        field_q = new int[8192];
    }
}
