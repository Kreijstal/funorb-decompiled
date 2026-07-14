/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ih extends ej {
    static vl field_x;
    static String field_z;
    static String field_u;
    static bd field_v;
    static volatile boolean field_s;
    private td field_t;
    static int field_w;
    static oc[] field_y;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            lm var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_61_0 = 0;
            int stackOut_60_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = HostileSpawn.field_I ? 1 : 0;
                        if (null == ((ih) this).field_t) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = hn.a((byte) 80);
                        var4 = (int)(-((ih) this).field_c + var2_long);
                        if (-201 > (var4 ^ -1)) {
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
                        ((ih) this).field_c = var2_long;
                        ((ih) this).field_f = ((ih) this).field_f + var4;
                        if (((ih) this).field_f > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ih) this).field_t.a(37);
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
                        ((ih) this).field_t = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 < -75) {
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
                        if (((ih) this).field_t != null) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (((ih) this).c((byte) 122) != 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (((ih) this).b((byte) -34) != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return true;
                    }
                    case 16: {
                        return false;
                    }
                    case 17: {
                        try {
                            ((ih) this).field_t.a((byte) -55);
                            var2_ref = (lm) (Object) ((ih) this).field_b.d((byte) -35);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 62;
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
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((ih) this).field_m.field_i = 0;
                            ((ih) this).field_m.d(124, 1);
                            ((ih) this).field_m.a(-113, var2_ref.field_h);
                            ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) -63, 0);
                            ((ih) this).field_j.a((dk) (Object) var2_ref, -126);
                            var2_ref = (lm) (Object) ((ih) this).field_b.b((byte) -59);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var2_ref = (lm) (Object) ((ih) this).field_l.d((byte) -35);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2_ref == null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ih) this).field_m.field_i = 0;
                            ((ih) this).field_m.d(100, 0);
                            ((ih) this).field_m.a(-127, var2_ref.field_h);
                            ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) -127, 0);
                            ((ih) this).field_a.a((dk) (Object) var2_ref, 56);
                            var2_ref = (lm) (Object) ((ih) this).field_l.b((byte) -114);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 60;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((ih) this).field_t.b((byte) 59);
                            if (-1 >= var3_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-1 == var3_int) {
                                statePc = 60;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((ih) this).field_f = 0;
                            var4 = 0;
                            if (null != ((ih) this).field_p) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 62;
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
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((ih) this).field_p.field_x == -1) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 62;
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
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-1 >= var4) {
                                statePc = 45;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var5 = var4 - ((ih) this).field_i.field_i;
                            if (var5 > var3_int) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = var3_int;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            ((ih) this).field_t.a(-1, ((ih) this).field_i.field_n, ((ih) this).field_i.field_i, var5);
                            if (((ih) this).field_r != 0) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 62;
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
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var5 <= var6) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((ih) this).field_i.field_n[var6 + ((ih) this).field_i.field_i] = (byte)bm.a((int) ((ih) this).field_i.field_n[var6 + ((ih) this).field_i.field_i], (int) ((ih) this).field_r);
                            var6++;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((ih) this).field_i.field_i = ((ih) this).field_i.field_i + var5;
                            if (((ih) this).field_i.field_i < var4) {
                                statePc = 43;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var5 = ((ih) this).field_p.field_C.field_n.length + -((ih) this).field_p.field_B;
                            var6 = -((ih) this).field_p.field_x + 512;
                            if (var5 - ((ih) this).field_p.field_C.field_i >= var6) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var6 = -((ih) this).field_p.field_C.field_i + var5;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var6 = var3_int;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((ih) this).field_t.a(-1, ((ih) this).field_p.field_C.field_n, ((ih) this).field_p.field_C.field_i, var6);
                            if (((ih) this).field_r != 0) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var17 >= var6) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((ih) this).field_p.field_C.field_n[((ih) this).field_p.field_C.field_i - -var17] = (byte)bm.a((int) ((ih) this).field_p.field_C.field_n[((ih) this).field_p.field_C.field_i + var17], (int) ((ih) this).field_r);
                            var17++;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((ih) this).field_p.field_x = ((ih) this).field_p.field_x + var6;
                            ((ih) this).field_p.field_C.field_i = ((ih) this).field_p.field_C.field_i + var6;
                            if (((ih) this).field_p.field_C.field_i != var5) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((ih) this).field_p.c(-1);
                            ((ih) this).field_p.field_v = false;
                            ((ih) this).field_p = null;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (-513 == (((ih) this).field_p.field_x ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((ih) this).field_p.field_x = 0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        return stackIn_61_0 != 0;
                    }
                    case 62: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        try {
                            ((ih) this).field_t.a(-98);
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        ((ih) this).field_t = null;
                        ((ih) this).field_k = ((ih) this).field_k + 1;
                        ((ih) this).field_e = -2;
                        if (((ih) this).c((byte) 122) != 0) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        if (0 != ((ih) this).b((byte) -34)) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return true;
                    }
                    case 69: {
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

    final void a(byte param0) {
        if (null != ((ih) this).field_t) {
            ((ih) this).field_t.a(-105);
        }
        int var2 = -92 % ((param0 - -63) / 63);
    }

    final void c(int param0) {
        try {
            if (param0 != 194) {
                boolean discarded$0 = ((ih) this).e(57);
            }
            ((ih) this).field_t.a(-114);
        } catch (Exception exception) {
        }
        ((ih) this).field_e = -1;
        ((ih) this).field_t = null;
        ((ih) this).field_k = ((ih) this).field_k + 1;
        ((ih) this).field_r = (byte)(int)(Math.random() * 255.0 + 1.0);
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
                        if (((ih) this).field_t == null) {
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
                            ((ih) this).field_m.field_i = 0;
                            ((ih) this).field_m.d(param0 + 74, 6);
                            ((ih) this).field_m.e(3, -91);
                            ((ih) this).field_m.a((byte) -119, 0);
                            ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) 32, 0);
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
                            ((ih) this).field_t.a(-54);
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
                        ((ih) this).field_k = ((ih) this).field_k + 1;
                        ((ih) this).field_t = null;
                        ((ih) this).field_e = -2;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 == 24) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((ih) this).field_t = null;
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

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            lm var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = HostileSpawn.field_I ? 1 : 0;
                        if (null != ((ih) this).field_t) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((ih) this).field_t.a(-98);
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
                        ((ih) this).field_t = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((ih) this).field_t = (td) param2;
                        this.g(24);
                        this.a((byte) 47, param0);
                        ((ih) this).field_p = null;
                        ((ih) this).field_i.field_i = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (lm) (Object) ((ih) this).field_j.a((byte) 27);
                        if (var4_ref2 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((ih) this).field_b.a((dk) (Object) var4_ref2, 40);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (lm) (Object) ((ih) this).field_a.a((byte) 27);
                        if (var4_ref2 != null) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((ih) this).field_l.a((dk) (Object) var4_ref2, -127);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param1 == 75) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        field_v = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (((ih) this).field_r == 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((ih) this).field_m.field_i = 0;
                            ((ih) this).field_m.d(106, 4);
                            ((ih) this).field_m.d(param1 ^ 52, (int) ((ih) this).field_r);
                            ((ih) this).field_m.b(0, 25251);
                            ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) 87, 0);
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
                            ((ih) this).field_t.a(-95);
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
                        ((ih) this).field_k = ((ih) this).field_k + 1;
                        ((ih) this).field_e = -2;
                        ((ih) this).field_t = null;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((ih) this).field_f = 0;
                        ((ih) this).field_c = hn.a((byte) 80);
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

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        var5 = 24 + uj.field_p.field_e;
        var6 = uj.field_p.field_g;
        if (param0 == -15587) {
          var2 = 0;
          L0: while (true) {
            if (rc.field_e <= var2) {
              return;
            } else {
              var7 = re.field_n[var2];
              var3 = -var5 + (int)(24.0 * ((double)var7.field_j.field_e + var7.field_l.field_f));
              var4 = -var6 + (int)((var7.field_l.field_a + (double)var7.field_j.field_g) * 24.0);
              if (95 >= (var3 ^ -1)) {
                if ((var4 ^ -1) <= 95) {
                  if (var3 <= 736) {
                    if (576 >= var4) {
                      if (0 == ue.field_d) {
                        L1: {
                          var9 = var7.field_i;
                          if (-130 == (var9 ^ -1)) {
                            break L1;
                          } else {
                            if (var9 != 131) {
                              if ((var9 ^ -1) == -134) {
                                break L1;
                              } else {
                                L2: {
                                  if (var9 == 128) {
                                    break L2;
                                  } else {
                                    if ((var9 ^ -1) == -131) {
                                      break L2;
                                    } else {
                                      if (var9 == 132) {
                                        break L2;
                                      } else {
                                        var2++;
                                        continue L0;
                                      }
                                    }
                                  }
                                }
                                L3: {
                                  var3 = var7.field_j.field_e * 24 - var5;
                                  var4 = 24 * var7.field_j.field_g - var6;
                                  var3 += 24;
                                  var4 += 12;
                                  var8 = var7.field_e / 2;
                                  if ((var8 ^ -1) <= -7) {
                                    var8 = 5;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                var7.field_H[var8].a(true, 128, 0, var3, var4);
                                var7.field_u.a(true, 128, 0, var3, var4);
                                var2++;
                                continue L0;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                        L4: {
                          var3 = var7.field_j.field_e * 24 + -var5;
                          var4 = 24 * var7.field_j.field_g + -var6;
                          var3 += 12;
                          var8 = var7.field_e / 2;
                          if (-7 >= (var8 ^ -1)) {
                            var8 = 5;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var7.field_H[var8].a(true, 128, 64, var3, var4);
                        var7.field_u.a(true, 128, 0, var3, var4);
                        var2++;
                        continue L0;
                      } else {
                        var2++;
                        continue L0;
                      }
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            vi stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            vi stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            vi stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            vi stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            vi stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            vi stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((ih) this).field_t) {
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
                            ((ih) this).field_m.field_i = 0;
                            stackOut_2_0 = ((ih) this).field_m;
                            stackOut_2_1 = 123;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
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
                            stackOut_3_0 = (vi) (Object) stackIn_3_0;
                            stackOut_3_1 = stackIn_3_1;
                            stackOut_3_2 = 3;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_5_2 = stackOut_3_2;
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
                            stackOut_4_0 = (vi) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 2;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            stackIn_5_2 = stackOut_4_2;
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
                            ((vi) (Object) stackIn_5_0).d(stackIn_5_1, stackIn_5_2);
                            ((ih) this).field_m.a(-121, 0L);
                            ((ih) this).field_t.a(((ih) this).field_m.field_n.length, ((ih) this).field_m.field_n, (byte) -105, 0);
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
                            ((ih) this).field_t.a(param0 ^ 127);
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
                        ((ih) this).field_e = -2;
                        ((ih) this).field_k = ((ih) this).field_k + 1;
                        ((ih) this).field_t = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param0 == 47) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((ih) this).a((byte) -29);
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

    public static void f(int param0) {
        if (param0 != 200) {
            field_x = null;
        }
        field_x = null;
        field_u = null;
        field_z = null;
        field_y = null;
        field_v = null;
    }

    public ih() {
    }

    final static int a(oc param0, byte param1, oc param2) {
        if (param1 >= -69) {
            ih.a(-70, -116);
        }
        return (param0.field_g < param2.field_g ? param2.field_g + -param0.field_g : param0.field_g + -param2.field_g) + (param2.field_e <= param0.field_e ? -param2.field_e + param0.field_e : -param0.field_e + param2.field_e);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Activate the reactor on this level, or seal off the breach from environmental controls.";
        field_s = false;
        field_z = "This door is sealed from the other side. I'll have to find another way around.";
        field_x = new vl();
        field_w = 9;
    }
}
