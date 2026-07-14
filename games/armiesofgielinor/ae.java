/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae extends bp {
    static String field_w;
    static String field_v;
    private hi field_t;
    static String field_x;
    static String field_s;
    static kl field_u;

    final void c(int param0) {
        if (param0 != -5758) {
            this.d((byte) 55);
        }
        if (null != ((ae) this).field_t) {
            ((ae) this).field_t.c((byte) -45);
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param1);
        var2.b(1, 2);
        var2.b(param0 + -895, 4);
        var2.b(1, gm.f(3));
        if (param0 != 896) {
            field_s = null;
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4_ref_Exception = null;
            int var4 = 0;
            IOException var5 = null;
            jf var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                        if (null == ((ae) this).field_t) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((ae) this).field_t.c((byte) -45);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var4_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((ae) this).field_t = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((ae) this).field_t = (hi) param0;
                        this.d((byte) 116);
                        this.a(82, param1);
                        ((ae) this).field_a = null;
                        var4 = -66 / ((param2 - 25) / 57);
                        ((ae) this).field_h.field_q = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var5_ref = (jf) (Object) ((ae) this).field_n.b(11);
                        if (var5_ref == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((ae) this).field_b.a((ms) (Object) var5_ref, false);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        var5_ref = (jf) (Object) ((ae) this).field_g.b(11);
                        if (var5_ref != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((ae) this).field_f.a((ms) (Object) var5_ref, false);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 == (((ae) this).field_i ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((ae) this).field_o.field_q = 0;
                            ((ae) this).field_o.b(1, 4);
                            ((ae) this).field_o.b(1, (int) ((ae) this).field_i);
                            ((ae) this).field_o.a((byte) -59, 0);
                            ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var5 = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((ae) this).field_t.c((byte) -45);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var6 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((ae) this).field_q = ((ae) this).field_q + 1;
                        ((ae) this).field_t = null;
                        ((ae) this).field_p = -2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((ae) this).field_l = 0;
                        ((ae) this).field_r = vi.b(80);
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

    public static void e(int param0) {
        field_s = null;
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != -4096) {
            field_w = null;
        }
        field_w = null;
    }

    final static void a(long param0, int param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 <= 3) {
            int discarded$0 = ae.b(90, 21);
        }
    }

    public ae() {
    }

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            jf var2_ref = null;
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
            jf var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_60_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_85_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_84_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
                        if (null == ((ae) this).field_t) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = vi.b(-75);
                        var4 = (int)(-((ae) this).field_r + var2_long);
                        ((ae) this).field_r = var2_long;
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
                        ((ae) this).field_l = ((ae) this).field_l + var4;
                        if (30000 < ((ae) this).field_l) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ae) this).field_t.c((byte) -45);
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
                        ((ae) this).field_t = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((ae) this).field_t != null) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 != (((ae) this).a(127) ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((ae) this).b(-110) == 0) {
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
                            ((ae) this).field_t.a(param0);
                            var2_ref = (jf) (Object) ((ae) this).field_b.a((byte) -117);
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
                            ((ae) this).field_o.field_q = 0;
                            ((ae) this).field_o.b(1, 1);
                            ((ae) this).field_o.a(true, var2_ref.field_q);
                            ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                            ((ae) this).field_n.a((ms) (Object) var2_ref, false);
                            var2_ref = (jf) (Object) ((ae) this).field_b.c(24);
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
                            var2_ref = (jf) (Object) ((ae) this).field_f.a((byte) -123);
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
                            ((ae) this).field_o.field_q = 0;
                            ((ae) this).field_o.b(1, 0);
                            ((ae) this).field_o.a(true, var2_ref.field_q);
                            ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                            ((ae) this).field_g.a((ms) (Object) var2_ref, false);
                            var2_ref = (jf) (Object) ((ae) this).field_f.c(24);
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
                                statePc = 84;
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
                            var3_int = ((ae) this).field_t.d((byte) 43);
                            if (var3_int < 0) {
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
                            if (var3_int != 0) {
                                statePc = 29;
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
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ae) this).field_l = 0;
                            var4 = 0;
                            if (((ae) this).field_a != null) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var4 = 10;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((ae) this).field_a.field_F != 0) {
                                statePc = 33;
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
                            if ((var4 ^ -1) < -1) {
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
                            var5 = -((ae) this).field_a.field_B + ((ae) this).field_a.field_E.field_o.length;
                            var6 = 512 + -((ae) this).field_a.field_F;
                            if (-((ae) this).field_a.field_E.field_q + var5 >= var6) {
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
                            var6 = var5 - ((ae) this).field_a.field_E.field_q;
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
                            ((ae) this).field_t.a(0, ((ae) this).field_a.field_E.field_q, var6, ((ae) this).field_a.field_E.field_o);
                            if (0 == ((ae) this).field_i) {
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
                            var7 = 0;
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
                            if (var6 <= var7) {
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
                            ((ae) this).field_a.field_E.field_o[((ae) this).field_a.field_E.field_q - -var7] = (byte)kf.b((int) ((ae) this).field_a.field_E.field_o[((ae) this).field_a.field_E.field_q + var7], (int) ((ae) this).field_i);
                            var7++;
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
                            ((ae) this).field_a.field_F = ((ae) this).field_a.field_F + var6;
                            ((ae) this).field_a.field_E.field_q = ((ae) this).field_a.field_E.field_q + var6;
                            if (((ae) this).field_a.field_E.field_q == var5) {
                                statePc = 46;
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
                            if ((((ae) this).field_a.field_F ^ -1) == -513) {
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
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((ae) this).field_a.field_F = 0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((ae) this).field_a.c((byte) -76);
                            ((ae) this).field_a.field_x = false;
                            ((ae) this).field_a = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var5 = -((ae) this).field_h.field_q + var4;
                            if (var5 <= var3_int) {
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
                            ((ae) this).field_t.a(0, ((ae) this).field_h.field_q, var5, ((ae) this).field_h.field_o);
                            if (0 != ((ae) this).field_i) {
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
                            if (var6 >= var5) {
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
                            ((ae) this).field_h.field_o[((ae) this).field_h.field_q - -var6] = (byte)kf.b((int) ((ae) this).field_h.field_o[((ae) this).field_h.field_q + var6], (int) ((ae) this).field_i);
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
                            ((ae) this).field_h.field_q = ((ae) this).field_h.field_q + var5;
                            if (var4 > ((ae) this).field_h.field_q) {
                                statePc = 83;
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
                            if (null == ((ae) this).field_a) {
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
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((ae) this).field_h.field_q = 0;
                            var6 = ((ae) this).field_h.k(0);
                            var7 = ((ae) this).field_h.i(1);
                            var8 = ((ae) this).field_h.k(0);
                            var9 = ((ae) this).field_h.i(1);
                            var10 = 127 & var8;
                            if (-1 == (var8 & 128 ^ -1)) {
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
                            stackOut_58_0 = 1;
                            stackIn_60_0 = stackOut_58_0;
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
                            stackOut_59_0 = 0;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var11 = stackIn_60_0;
                            var12 = (long)var7 + ((long)var6 << -1036793568);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 66;
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
                            var14_ref = (jf) (Object) ((ae) this).field_n.a((byte) -106);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
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
                            if (var12 != var14_ref.field_q) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var14_ref = (jf) (Object) ((ae) this).field_n.c(24);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14_ref = (jf) (Object) ((ae) this).field_g.a((byte) -110);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var12 != var14_ref.field_q) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (jf) (Object) ((ae) this).field_g.c(24);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var14_ref != null) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            ((ae) this).field_a = var14_ref;
                            if (var10 == 0) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
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
                            stackIn_76_0 = stackOut_74_0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackOut_75_0 = 5;
                            stackIn_76_0 = stackOut_75_0;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var15 = stackIn_76_0;
                            ((ae) this).field_a.field_E = new vh(var15 + var9 - -((ae) this).field_a.field_B);
                            ((ae) this).field_a.field_E.b(1, var10);
                            ((ae) this).field_a.field_E.a((byte) -77, var9);
                            ((ae) this).field_h.field_q = 0;
                            ((ae) this).field_a.field_F = 10;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (-1 == (((ae) this).field_a.field_F ^ -1)) {
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
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (((ae) this).field_h.field_o[0] != -1) {
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
                            ((ae) this).field_a.field_F = 1;
                            ((ae) this).field_h.field_q = 0;
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
                            ((ae) this).field_a = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var2_int++;
                            statePc = 23;
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
                            ((ae) this).field_t.c((byte) -45);
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
                        ((ae) this).field_p = -2;
                        ((ae) this).field_q = ((ae) this).field_q + 1;
                        ((ae) this).field_t = null;
                        if (-1 != ((ae) this).a(106)) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        if (-1 == ((ae) this).b(-109)) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        return false;
                    }
                    case 94: {
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

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 > 70) {
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
                        if (null == ((ae) this).field_t) {
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
                            ((ae) this).field_o.field_q = 0;
                            ((ae) this).field_o.b(1, 6);
                            ((ae) this).field_o.a(3, (byte) 58);
                            ((ae) this).field_o.b(true, 0);
                            ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
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
                            ((ae) this).field_t.c((byte) -45);
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
                        ((ae) this).field_p = -2;
                        ((ae) this).field_t = null;
                        ((ae) this).field_q = ((ae) this).field_q + 1;
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

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            vh stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            vh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            vh stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            vh stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            vh stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            vh stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((ae) this).field_t) {
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
                            if (param0 > 5) {
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
                            this.a(-74, true);
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
                            ((ae) this).field_o.field_q = 0;
                            stackOut_4_0 = ((ae) this).field_o;
                            stackOut_4_1 = 1;
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
                            stackOut_5_0 = (vh) (Object) stackIn_5_0;
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
                            stackOut_6_0 = (vh) (Object) stackIn_6_0;
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
                            ((vh) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2);
                            ((ae) this).field_o.a(true, 0L);
                            ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
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
                            ((ae) this).field_t.c((byte) -45);
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
                        ((ae) this).field_q = ((ae) this).field_q + 1;
                        ((ae) this).field_t = null;
                        ((ae) this).field_p = -2;
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

    final static int b(int param0, int param1) {
        param0 = param0 & 8191;
        if (param1 != 100) {
            field_v = null;
        }
        if (param0 < 4096) {
            return (param0 ^ -1) <= -2049 ? e.field_a[-param0 + 4096] : e.field_a[param0];
        }
        return (param0 ^ -1) > -6145 ? -e.field_a[-4096 + param0] : -e.field_a[8192 - param0];
    }

    final void b(byte param0) {
        if (param0 != 4) {
            return;
        }
        try {
            ((ae) this).field_t.c((byte) -45);
        } catch (Exception exception) {
        }
        ((ae) this).field_t = null;
        ((ae) this).field_p = -1;
        ((ae) this).field_q = ((ae) this).field_q + 1;
        ((ae) this).field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static void a(byte param0, wk[] param1, wk param2) {
        vg.field_q = param1;
        vg.field_q[0].i();
        vg.field_q[1].i();
        tr.field_z = param2;
        ac.field_m = vg.field_q[0].field_v;
        if (param0 < 118) {
            field_x = null;
        }
        cm.field_b = vg.field_q[0].field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "This can be used from turn <%0> onwards.";
        field_x = "Click on the gold-rimmed icons to navigate through the equipment.";
        field_v = "Show all private chat";
        field_s = "Service unavailable";
    }
}
