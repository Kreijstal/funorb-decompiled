/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qf extends wb {
    static String field_s;
    private ge field_r;
    static int[] field_q;

    final void b(int param0) {
        if (!(null == ((qf) this).field_r)) {
            ((qf) this).field_r.b(param0 ^ 80);
        }
        if (param0 != 0) {
            boolean discarded$0 = ((qf) this).a((byte) 59);
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        if (param1.equals((Object) (Object) "B")) {
            return Byte.TYPE;
        }
        if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (param0 != -4174) {
            field_q = null;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    final static void f(int param0) {
        if (!(ug.field_A == null)) {
            ug.field_A.g(false);
        }
        if (param0 != -28390) {
            qf.g(-118);
        }
        if (qj.field_fb != null) {
            qj.field_fb.h(param0 + 4239142);
        }
        cb.a((byte) -52);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wf stackIn_4_0 = null;
            wf stackIn_5_0 = null;
            wf stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            wf stackOut_3_0 = null;
            wf stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            wf stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((qf) this).field_r) {
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
                            ((qf) this).field_b.field_h = 0;
                            stackOut_3_0 = ((qf) this).field_b;
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
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (wf) (Object) stackIn_4_0;
                            stackOut_4_1 = 3;
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
                            stackOut_5_0 = (wf) (Object) stackIn_5_0;
                            stackOut_5_1 = 2;
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
                            ((wf) (Object) stackIn_6_0).c(stackIn_6_1, -1);
                            if (param0 < -53) {
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
                            ((qf) this).field_b.a(0L, 687419600);
                            ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 54, 0);
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
                            ((qf) this).field_r.b(33);
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
                        ((qf) this).field_p = ((qf) this).field_p + 1;
                        ((qf) this).field_r = null;
                        ((qf) this).field_j = -2;
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

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            dc var2_ref = null;
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
            dc var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_58_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_83_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_82_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Lexicominos.field_L ? 1 : 0;
                        if (((qf) this).field_r == null) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = rf.c(0);
                        var4 = (int)(-((qf) this).field_n + var2_long);
                        ((qf) this).field_n = var2_long;
                        if ((var4 ^ -1) >= -201) {
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
                        ((qf) this).field_e = ((qf) this).field_e + var4;
                        if ((((qf) this).field_e ^ -1) < -30001) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((qf) this).field_r.b(75);
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
                        ((qf) this).field_r = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == ((qf) this).field_r) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 != (((qf) this).c((byte) 67) ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((qf) this).a(true) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return true;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        try {
                            ((qf) this).field_r.a(0);
                            var2_ref = (dc) (Object) ((qf) this).field_l.a(true);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2_ref == null) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((qf) this).field_b.field_h = 0;
                            ((qf) this).field_b.c(1, -1);
                            ((qf) this).field_b.a(var2_ref.field_j, 687419600);
                            ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 58, 0);
                            ((qf) this).field_k.a(85, (ca) (Object) var2_ref);
                            var2_ref = (dc) (Object) ((qf) this).field_l.a(-256);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var2_ref = (dc) (Object) ((qf) this).field_d.a(true);
                            var3_int = 98 % ((-74 - param0) / 48);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 84;
                            continue stateLoop;
                        }
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((qf) this).field_b.field_h = 0;
                            ((qf) this).field_b.c(0, -1);
                            ((qf) this).field_b.a(var2_ref.field_j, 687419600);
                            ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, -124, 0);
                            ((qf) this).field_f.a(82, (ca) (Object) var2_ref);
                            var2_ref = (dc) (Object) ((qf) this).field_d.a(-256);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_int = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 82;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_int = ((qf) this).field_r.d(-6448);
                            if (-1 < (var3_int ^ -1)) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var3_int == 0) {
                                statePc = 82;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((qf) this).field_e = 0;
                            var4 = 0;
                            if (null == ((qf) this).field_o) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (((qf) this).field_o.field_w == 0) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var4 = 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4 = 10;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (0 < var4) {
                                statePc = 46;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var5 = -((qf) this).field_o.field_A + ((qf) this).field_o.field_x.field_j.length;
                            var6 = -((qf) this).field_o.field_w + 512;
                            if (var6 > -((qf) this).field_o.field_x.field_h + var5) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = var5 + -((qf) this).field_o.field_x.field_h;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 84;
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
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((qf) this).field_r.a(((qf) this).field_o.field_x.field_j, (byte) -109, var6, ((qf) this).field_o.field_x.field_h);
                            if (0 == ((qf) this).field_a) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 84;
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
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((qf) this).field_o.field_x.field_j[((qf) this).field_o.field_x.field_h - -var7] = (byte)dg.a((int) ((qf) this).field_o.field_x.field_j[((qf) this).field_o.field_x.field_h + var7], (int) ((qf) this).field_a);
                            var7++;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((qf) this).field_o.field_w = ((qf) this).field_o.field_w + var6;
                            ((qf) this).field_o.field_x.field_h = ((qf) this).field_o.field_x.field_h + var6;
                            if (((qf) this).field_o.field_x.field_h == var5) {
                                statePc = 45;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (-513 != (((qf) this).field_o.field_w ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((qf) this).field_o.field_w = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((qf) this).field_o.b(12);
                            ((qf) this).field_o.field_v = false;
                            ((qf) this).field_o = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var5 = var4 - ((qf) this).field_h.field_h;
                            if (var5 <= var3_int) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var5 = var3_int;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((qf) this).field_r.a(((qf) this).field_h.field_j, (byte) -109, var5, ((qf) this).field_h.field_h);
                            if (((qf) this).field_a != 0) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var6 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var5 <= var6) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((qf) this).field_h.field_j[var6 + ((qf) this).field_h.field_h] = (byte)dg.a((int) ((qf) this).field_h.field_j[var6 + ((qf) this).field_h.field_h], (int) ((qf) this).field_a);
                            var6++;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((qf) this).field_h.field_h = ((qf) this).field_h.field_h + var5;
                            if (((qf) this).field_h.field_h < var4) {
                                statePc = 81;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (null != ((qf) this).field_o) {
                                statePc = 75;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((qf) this).field_h.field_h = 0;
                            var6 = ((qf) this).field_h.d(true);
                            var7 = ((qf) this).field_h.d((byte) 19);
                            var8 = ((qf) this).field_h.d(true);
                            var9 = ((qf) this).field_h.d((byte) 19);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = stackIn_58_0;
                            var12 = ((long)var6 << 323021600) + (long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 63;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (dc) (Object) ((qf) this).field_f.a(true);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (var14_ref == null) {
                                statePc = 68;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var14_ref.field_j == var12) {
                                statePc = 68;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var14_ref = (dc) (Object) ((qf) this).field_f.a(-256);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (dc) (Object) ((qf) this).field_k.a(true);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var14_ref == null) {
                                statePc = 68;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_j ^ -1L)) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14_ref = (dc) (Object) ((qf) this).field_k.a(-256);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var14_ref == null) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((qf) this).field_o = var14_ref;
                            if (0 != var10) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            stackOut_72_0 = 5;
                            stackIn_74_0 = stackOut_72_0;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackOut_73_0 = 9;
                            stackIn_74_0 = stackOut_73_0;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var15 = stackIn_74_0;
                            ((qf) this).field_o.field_x = new wf(((qf) this).field_o.field_A + var15 + var9);
                            ((qf) this).field_o.field_x.c(var10, -1);
                            ((qf) this).field_o.field_x.f(var9, -32287);
                            ((qf) this).field_o.field_w = 10;
                            ((qf) this).field_h.field_h = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (((qf) this).field_o.field_w == 0) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (0 == (((qf) this).field_h.field_j[0] ^ -1)) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((qf) this).field_o = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((qf) this).field_o.field_w = 1;
                            ((qf) this).field_h.field_h = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var2_int++;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 1;
                            stackIn_83_0 = stackOut_82_0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        return stackIn_83_0 != 0;
                    }
                    case 84: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        try {
                            ((qf) this).field_r.b(41);
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        ((qf) this).field_j = -2;
                        ((qf) this).field_p = ((qf) this).field_p + 1;
                        ((qf) this).field_r = null;
                        if (((qf) this).c((byte) 67) != -1) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (-1 == ((qf) this).a(true)) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        return false;
                    }
                    case 91: {
                        return false;
                    }
                    case 92: {
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

    public static void e(byte param0) {
        if (param0 != -15) {
            qf.g(49);
        }
        field_q = null;
        field_s = null;
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
                        if (null == ((qf) this).field_r) {
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
                            ((qf) this).field_b.field_h = 0;
                            if (param0 == -108) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            field_s = null;
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
                            ((qf) this).field_b.c(6, -1);
                            ((qf) this).field_b.d(3, 48);
                            ((qf) this).field_b.e(97, 0);
                            ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, param0 ^ -124, 0);
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
                            ((qf) this).field_r.b(param0 + 235);
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
                        ((qf) this).field_p = ((qf) this).field_p + 1;
                        ((qf) this).field_r = null;
                        ((qf) this).field_j = -2;
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

    final static void g(int param0) {
        if (null != jj.field_a) {
            jj.field_a.g(true);
        }
        hd.field_a = new r();
        di.field_x.b(122, (w) (Object) hd.field_a);
        if (param0 >= -15) {
            field_q = null;
        }
    }

    final static void a(Lexicominos param0, int param1) {
        qc.field_c[5] = qc.field_c[5] + 43;
        qc.field_a[5] = new int[1];
        vg.field_d[5] = new sg(param0, 5);
        qc.field_a[1] = new int[2];
        vg.field_d[1] = new sg(param0, 1);
        if (param1 < 108) {
            qf.e((byte) 68);
        }
        if (0 < jd.field_c) {
            if (pk.a(jh.field_a, -104)) {
                qc.field_a[2] = new int[6];
                qc.field_c[2] = -(43 * qc.field_a[2].length / 2) + 225;
                vg.field_d[2] = new sg(param0, 2);
                qc.field_a[14] = new int[6];
                qc.field_c[14] = -(qc.field_a[14].length * 43 / 2) + 225;
                vg.field_d[14] = new sg(param0, 14);
            }
        }
    }

    final void a(boolean param0, int param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            dc var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Lexicominos.field_L ? 1 : 0;
                        if (null != ((qf) this).field_r) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((qf) this).field_r.b(17);
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
                        ((qf) this).field_r = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((qf) this).field_r = (ge) param2;
                        this.d((byte) -108);
                        this.a(-82, param0);
                        ((qf) this).field_o = null;
                        ((qf) this).field_h.field_h = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (dc) (Object) ((qf) this).field_k.a((byte) 100);
                        if (var4_ref2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((qf) this).field_l.a(-72, (ca) (Object) var4_ref2);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (dc) (Object) ((qf) this).field_f.a((byte) 100);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((qf) this).field_d.a(-74, (ca) (Object) var4_ref2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-1 == (((qf) this).field_a ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((qf) this).field_b.field_h = 0;
                            ((qf) this).field_b.c(4, -1);
                            ((qf) this).field_b.c((int) ((qf) this).field_a, -1);
                            ((qf) this).field_b.f(0, -32287);
                            ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 67, 0);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((qf) this).field_r.b(84);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((qf) this).field_r = null;
                        ((qf) this).field_j = -2;
                        ((qf) this).field_p = ((qf) this).field_p + 1;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((qf) this).field_e = 0;
                        ((qf) this).field_n = rf.c(0);
                        if (param1 <= -87) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        this.a(1, false);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
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
            ((qf) this).field_r.b(16);
        } catch (Exception exception) {
        }
        if (param0 != -28488) {
            boolean discarded$0 = ((qf) this).a((byte) 46);
        }
        ((qf) this).field_j = -1;
        ((qf) this).field_r = null;
        ((qf) this).field_p = ((qf) this).field_p + 1;
        ((qf) this).field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    public qf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Waiting for graphics";
        field_q = new int[8192];
    }
}
