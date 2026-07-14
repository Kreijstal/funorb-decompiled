/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lh extends pc {
    private gm field_n;

    private final void f(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 <= -54) {
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
                        if (null == ((lh) this).field_n) {
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
                            ((lh) this).field_b.field_j = 0;
                            ((lh) this).field_b.i(6, 13);
                            ((lh) this).field_b.c(3, -105);
                            ((lh) this).field_b.a(0, (byte) 105);
                            ((lh) this).field_n.a(((lh) this).field_b.field_h.length, true, 0, ((lh) this).field_b.field_h);
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
                            ((lh) this).field_n.a(100);
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
                        ((lh) this).field_e = -2;
                        ((lh) this).field_h = ((lh) this).field_h + 1;
                        ((lh) this).field_n = null;
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

    final boolean c(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            og var2_ref = null;
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
            og var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_90_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_89_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ZombieDawn.field_J;
                        if (null == ((lh) this).field_n) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = pd.a(param0 + -22805);
                        var4 = (int)(var2_long + -((lh) this).field_g);
                        if (-201 > var4) {
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
                        ((lh) this).field_g = var2_long;
                        ((lh) this).field_i = ((lh) this).field_i + var4;
                        if (-30001 < ((lh) this).field_i) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((lh) this).field_n.a(-59);
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
                        ((lh) this).field_n = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 == -21) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return true;
                    }
                    case 12: {
                        if (null == ((lh) this).field_n) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (((lh) this).e(-1216122784) != 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (((lh) this).a(true) == 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        return false;
                    }
                    case 17: {
                        return false;
                    }
                    case 18: {
                        return true;
                    }
                    case 19: {
                        try {
                            ((lh) this).field_n.c((byte) 85);
                            var2_ref = (og) (Object) ((lh) this).field_a.c((byte) 34);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((lh) this).field_b.field_j = 0;
                            ((lh) this).field_b.i(1, 114);
                            ((lh) this).field_b.b(var2_ref.field_n, param0 ^ -21);
                            ((lh) this).field_n.a(((lh) this).field_b.field_h.length, true, 0, ((lh) this).field_b.field_h);
                            ((lh) this).field_l.a((nb) (Object) var2_ref, (byte) -117);
                            var2_ref = (og) (Object) ((lh) this).field_a.a((byte) 117);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref = (og) (Object) ((lh) this).field_f.c((byte) 34);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((lh) this).field_b.field_j = 0;
                            ((lh) this).field_b.i(0, -123);
                            ((lh) this).field_b.b(var2_ref.field_n, 0);
                            ((lh) this).field_n.a(((lh) this).field_b.field_h.length, true, 0, ((lh) this).field_b.field_h);
                            ((lh) this).field_m.a((nb) (Object) var2_ref, (byte) -95);
                            var2_ref = (og) (Object) ((lh) this).field_f.a((byte) 112);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 89;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var3_int = ((lh) this).field_n.b((byte) -59);
                            if (var3_int >= 0) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((lh) this).field_i = 0;
                            var4 = 0;
                            if (((lh) this).field_d != null) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 10;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (((lh) this).field_d.field_v != 0) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var4 = 1;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-1 > (var4 ^ -1)) {
                                statePc = 51;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = ((lh) this).field_d.field_w.field_h.length - ((lh) this).field_d.field_C;
                            var6 = 512 + -((lh) this).field_d.field_v;
                            if (var6 > -((lh) this).field_d.field_w.field_j + var5) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = var5 - ((lh) this).field_d.field_w.field_j;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6 = var3_int;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((lh) this).field_n.a(((lh) this).field_d.field_w.field_j, var6, ((lh) this).field_d.field_w.field_h, 0);
                            if (((lh) this).field_c == 0) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var7 = 0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var6 <= var7) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((lh) this).field_d.field_w.field_h[var7 + ((lh) this).field_d.field_w.field_j] = (byte)rd.b((int) ((lh) this).field_d.field_w.field_h[var7 + ((lh) this).field_d.field_w.field_j], (int) ((lh) this).field_c);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((lh) this).field_d.field_w.field_j = ((lh) this).field_d.field_w.field_j + var6;
                            ((lh) this).field_d.field_v = ((lh) this).field_d.field_v + var6;
                            if (((lh) this).field_d.field_w.field_j == var5) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (512 == ((lh) this).field_d.field_v) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((lh) this).field_d.field_v = 0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((lh) this).field_d.c((byte) -15);
                            ((lh) this).field_d.field_q = false;
                            ((lh) this).field_d = null;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = -((lh) this).field_j.field_j + var4;
                            if (var5 > var3_int) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var5 = var3_int;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((lh) this).field_n.a(((lh) this).field_j.field_j, var5, ((lh) this).field_j.field_h, 0);
                            if (((lh) this).field_c != 0) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6 = 0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var6 >= var5) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((lh) this).field_j.field_h[var6 + ((lh) this).field_j.field_j] = (byte)rd.b((int) ((lh) this).field_j.field_h[var6 + ((lh) this).field_j.field_j], (int) ((lh) this).field_c);
                            var6++;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((lh) this).field_j.field_j = ((lh) this).field_j.field_j + var5;
                            if (((lh) this).field_j.field_j >= var4) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (null != ((lh) this).field_d) {
                                statePc = 82;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((lh) this).field_j.field_j = 0;
                            var6 = ((lh) this).field_j.d((byte) -127);
                            var7 = ((lh) this).field_j.c(param0 ^ -111);
                            var8 = ((lh) this).field_j.d((byte) -117);
                            var9 = ((lh) this).field_j.c(-121);
                            var10 = 127 & var8;
                            if ((128 & var8) == 0) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var11 = stackIn_65_0;
                            var12 = (long)var7 + ((long)var6 << -772763744);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 71;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14_ref = (og) (Object) ((lh) this).field_l.c((byte) 34);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14_ref == null) {
                                statePc = 75;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_n ^ -1L)) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (og) (Object) ((lh) this).field_l.a((byte) 125);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var14_ref = (og) (Object) ((lh) this).field_m.c((byte) 34);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var14_ref == null) {
                                statePc = 75;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var12 == var14_ref.field_n) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var14_ref = (og) (Object) ((lh) this).field_m.a((byte) 122);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var14_ref == null) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (0 != var10) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 5;
                            stackIn_81_0 = stackOut_79_0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackOut_80_0 = 9;
                            stackIn_81_0 = stackOut_80_0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var15 = stackIn_81_0;
                            ((lh) this).field_d = var14_ref;
                            ((lh) this).field_d.field_w = new de(((lh) this).field_d.field_C + var9 - -var15);
                            ((lh) this).field_d.field_w.i(var10, -100);
                            ((lh) this).field_d.field_w.h(-120, var9);
                            ((lh) this).field_d.field_v = 10;
                            ((lh) this).field_j.field_j = 0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (((lh) this).field_d.field_v == 0) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (((lh) this).field_j.field_h[0] == -1) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((lh) this).field_d = null;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((lh) this).field_j.field_j = 0;
                            ((lh) this).field_d.field_v = 1;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_int++;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            stackOut_89_0 = 1;
                            stackIn_90_0 = stackOut_89_0;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        return stackIn_90_0 != 0;
                    }
                    case 91: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        try {
                            ((lh) this).field_n.a(param0 + -52);
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 95: {
                        ((lh) this).field_n = null;
                        ((lh) this).field_e = -2;
                        ((lh) this).field_h = ((lh) this).field_h + 1;
                        if (((lh) this).e(param0 + -1216122763) != 0) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 96: {
                        if (((lh) this).a(true) == 0) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 98: {
                        return false;
                    }
                    case 99: {
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

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            de stackIn_3_0 = null;
            de stackIn_4_0 = null;
            de stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            de stackOut_2_0 = null;
            de stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            de stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((lh) this).field_n) {
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
                            ((lh) this).field_b.field_j = 0;
                            stackOut_2_0 = ((lh) this).field_b;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_3_0 = stackOut_2_0;
                            if (param1) {
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
                            stackOut_3_0 = (de) (Object) stackIn_3_0;
                            stackOut_3_1 = 3;
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
                            stackOut_4_0 = (de) (Object) stackIn_4_0;
                            stackOut_4_1 = 2;
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
                            ((de) (Object) stackIn_5_0).i(stackIn_5_1, -98);
                            ((lh) this).field_b.b(0L, 0);
                            ((lh) this).field_n.a(((lh) this).field_b.field_h.length, true, 0, ((lh) this).field_b.field_h);
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
                            ((lh) this).field_n.a(-103);
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
                        ((lh) this).field_e = -2;
                        ((lh) this).field_h = ((lh) this).field_h + 1;
                        ((lh) this).field_n = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param0 >= 58) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((lh) this).field_n = null;
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

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4_ref_Exception = null;
            IOException var4_ref_IOException = null;
            og var4_ref_og = null;
            int var4 = 0;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ZombieDawn.field_J;
                        if (((lh) this).field_n == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((lh) this).field_n.a(100);
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
                        ((lh) this).field_n = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((lh) this).field_n = (gm) param1;
                        this.f(-87);
                        this.a(67, param0);
                        ((lh) this).field_j.field_j = 0;
                        ((lh) this).field_d = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref_og = (og) (Object) ((lh) this).field_l.a(116);
                        if (var4_ref_og != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((lh) this).field_a.a((nb) (Object) var4_ref_og, (byte) -120);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref_og = (og) (Object) ((lh) this).field_m.a(-61);
                        if (var4_ref_og != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((lh) this).field_f.a((nb) (Object) var4_ref_og, (byte) -97);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 == ((lh) this).field_c) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((lh) this).field_b.field_j = 0;
                            ((lh) this).field_b.i(4, 29);
                            ((lh) this).field_b.i((int) ((lh) this).field_c, -112);
                            ((lh) this).field_b.h(-104, 0);
                            ((lh) this).field_n.a(((lh) this).field_b.field_h.length, true, 0, ((lh) this).field_b.field_h);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var4_ref_IOException = (IOException) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((lh) this).field_n.a(69);
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
                        ((lh) this).field_n = null;
                        ((lh) this).field_e = -2;
                        ((lh) this).field_h = ((lh) this).field_h + 1;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var4 = -50 % ((-1 - param2) / 63);
                        ((lh) this).field_i = 0;
                        ((lh) this).field_g = pd.a(-22826);
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
        try {
            ((lh) this).field_n.a(123);
        } catch (Exception exception) {
        }
        ((lh) this).field_e = -1;
        ((lh) this).field_h = ((lh) this).field_h + 1;
        ((lh) this).field_n = null;
        ((lh) this).field_c = (byte)(int)(1.0 + 255.0 * Math.random());
        if (param0 > -89) {
            ((lh) this).field_n = null;
        }
    }

    final void d(int param0) {
        if (null != ((lh) this).field_n) {
            ((lh) this).field_n.a(108);
        }
        if (param0 != 31239) {
            this.a(-79, true);
        }
    }

    public lh() {
    }

    static {
    }
}
