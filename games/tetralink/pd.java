/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pd extends th {
    private fl field_s;
    static String field_r;
    static String[][] field_t;

    final void b(int param0) {
        try {
            ((pd) this).field_s.d(-15488);
        } catch (Exception exception) {
        }
        ((pd) this).field_h = ((pd) this).field_h + 1;
        if (param0 != 0) {
            return;
        }
        ((pd) this).field_d = -1;
        ((pd) this).field_s = null;
        ((pd) this).field_n = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            rh var2_ref = null;
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
            rh var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_44_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_83_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_82_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = TetraLink.field_J;
                        if (((pd) this).field_s == null) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = k.a(0);
                        var4 = (int)(-((pd) this).field_f + var2_long);
                        ((pd) this).field_f = var2_long;
                        if ((var4 ^ -1) < -201) {
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
                        ((pd) this).field_a = ((pd) this).field_a + var4;
                        if (((pd) this).field_a > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((pd) this).field_s.d(-15488);
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
                        ((pd) this).field_s = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != ((pd) this).field_s) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((pd) this).c((byte) -61)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((pd) this).d(20) == 0) {
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
                            ((pd) this).field_s.a(100);
                            var2_ref = (rh) (Object) ((pd) this).field_k.a((byte) 90);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((pd) this).field_b.field_t = 0;
                            ((pd) this).field_b.a(1, false);
                            ((pd) this).field_b.a(var2_ref.field_n, true);
                            ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                            ((pd) this).field_j.a((gb) (Object) var2_ref, 0);
                            var2_ref = (rh) (Object) ((pd) this).field_k.a(false);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var2_ref = (rh) (Object) ((pd) this).field_o.a((byte) -95);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((pd) this).field_b.field_t = 0;
                            ((pd) this).field_b.a(0, false);
                            ((pd) this).field_b.a(var2_ref.field_n, true);
                            ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                            ((pd) this).field_c.a((gb) (Object) var2_ref, 0);
                            var2_ref = (rh) (Object) ((pd) this).field_o.a(false);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((var2_int ^ -1) <= -101) {
                                statePc = 80;
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
                            var3_int = ((pd) this).field_s.f(0);
                            if (var3_int >= 0) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
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
                                statePc = 80;
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
                            ((pd) this).field_a = 0;
                            var4 = 0;
                            if (null != ((pd) this).field_q) {
                                statePc = 29;
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
                            var4 = 10;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-1 != (((pd) this).field_q.field_I ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
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
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var4 <= 0) {
                                statePc = 66;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var5 = -((pd) this).field_m.field_t + var4;
                            if (var5 <= var3_int) {
                                statePc = 34;
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
                            var5 = var3_int;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ((pd) this).field_s.a(((pd) this).field_m.field_t, var5, ((pd) this).field_m.field_u, 0);
                            if (-1 == (((pd) this).field_n ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = 0;
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
                            if (var6 >= var5) {
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
                            ((pd) this).field_m.field_u[((pd) this).field_m.field_t + var6] = (byte)oj.a((int) ((pd) this).field_m.field_u[((pd) this).field_m.field_t + var6], (int) ((pd) this).field_n);
                            var6++;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((pd) this).field_m.field_t = ((pd) this).field_m.field_t + var5;
                            if (var4 <= ((pd) this).field_m.field_t) {
                                statePc = 40;
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
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((pd) this).field_q != null) {
                                statePc = 61;
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
                            ((pd) this).field_m.field_t = 0;
                            var6 = ((pd) this).field_m.d((byte) -99);
                            var7 = ((pd) this).field_m.f(104);
                            var8 = ((pd) this).field_m.d((byte) -99);
                            var9 = ((pd) this).field_m.f(-125);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackOut_43_0 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var11 = stackIn_44_0;
                            var12 = ((long)var6 << -1637536224) + (long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var14_ref = (rh) (Object) ((pd) this).field_j.a((byte) -93);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var14_ref == null) {
                                statePc = 54;
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
                            if ((var14_ref.field_n ^ -1L) != (var12 ^ -1L)) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var14_ref = (rh) (Object) ((pd) this).field_j.a(false);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var14_ref = (rh) (Object) ((pd) this).field_c.a((byte) -109);
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
                            if (var14_ref == null) {
                                statePc = 54;
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
                            if (var12 == var14_ref.field_n) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var14_ref = (rh) (Object) ((pd) this).field_c.a(param0);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var14_ref == null) {
                                statePc = 56;
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
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var10 != 0) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 5;
                            stackIn_60_0 = stackOut_58_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = 9;
                            stackIn_60_0 = stackOut_59_0;
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
                            var15 = stackIn_60_0;
                            ((pd) this).field_q = var14_ref;
                            ((pd) this).field_q.field_K = new bh(var15 + (var9 - -((pd) this).field_q.field_H));
                            ((pd) this).field_q.field_K.a(var10, false);
                            ((pd) this).field_q.field_K.d(var9, (byte) -124);
                            ((pd) this).field_m.field_t = 0;
                            ((pd) this).field_q.field_I = 10;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (((pd) this).field_q.field_I != 0) {
                                statePc = 65;
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
                            if (((pd) this).field_m.field_u[0] != -1) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((pd) this).field_q.field_I = 1;
                            ((pd) this).field_m.field_t = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            ((pd) this).field_q = null;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var5 = -((pd) this).field_q.field_H + ((pd) this).field_q.field_K.field_u.length;
                            var6 = 512 - ((pd) this).field_q.field_I;
                            if (-((pd) this).field_q.field_K.field_t + var5 < var6) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var6 = -((pd) this).field_q.field_K.field_t + var5;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((pd) this).field_s.a(((pd) this).field_q.field_K.field_t, var6, ((pd) this).field_q.field_K.field_u, 0);
                            if (0 == ((pd) this).field_n) {
                                statePc = 75;
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
                            var7 = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((pd) this).field_q.field_K.field_u[var7 + ((pd) this).field_q.field_K.field_t] = (byte)oj.a((int) ((pd) this).field_q.field_K.field_u[var7 + ((pd) this).field_q.field_K.field_t], (int) ((pd) this).field_n);
                            var7++;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((pd) this).field_q.field_K.field_t = ((pd) this).field_q.field_K.field_t + var6;
                            ((pd) this).field_q.field_I = ((pd) this).field_q.field_I + var6;
                            if (var5 != ((pd) this).field_q.field_K.field_t) {
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
                            ((pd) this).field_q.e(0);
                            ((pd) this).field_q.field_v = false;
                            ((pd) this).field_q = null;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (((pd) this).field_q.field_I != 512) {
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
                            ((pd) this).field_q.field_I = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var2_int++;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (!param0) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            pd.e(81);
                            statePc = 82;
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
                            ((pd) this).field_s.d(-15488);
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
                        ((pd) this).field_h = ((pd) this).field_h + 1;
                        ((pd) this).field_d = -2;
                        ((pd) this).field_s = null;
                        if (-1 != (((pd) this).c((byte) -114) ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (((pd) this).d(20) != 0) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        return true;
                    }
                    case 91: {
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

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        if (param0 != 0) {
            pd.b(true);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void a(byte param0) {
        if (param0 != 80) {
            field_r = null;
        }
        if (((pd) this).field_s != null) {
            ((pd) this).field_s.d(-15488);
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            rh var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TetraLink.field_J;
                        if (((pd) this).field_s == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((pd) this).field_s.d(-15488);
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
                        ((pd) this).field_s = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((pd) this).field_s = (fl) param0;
                        this.c(false);
                        this.a(false, param1);
                        if (param2 <= -73) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_r = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        ((pd) this).field_m.field_t = 0;
                        ((pd) this).field_q = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (rh) (Object) ((pd) this).field_j.c(-15464);
                        if (var4_ref2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((pd) this).field_k.a((gb) (Object) var4_ref2, 0);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (rh) (Object) ((pd) this).field_c.c(-15464);
                        if (var4_ref2 == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((pd) this).field_o.a((gb) (Object) var4_ref2, 0);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 12: {
                        if (((pd) this).field_n == 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((pd) this).field_b.field_t = 0;
                            ((pd) this).field_b.a(4, false);
                            ((pd) this).field_b.a((int) ((pd) this).field_n, false);
                            ((pd) this).field_b.d(0, (byte) -124);
                            ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
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
                            ((pd) this).field_s.d(-15488);
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
                        ((pd) this).field_d = -2;
                        ((pd) this).field_h = ((pd) this).field_h + 1;
                        ((pd) this).field_s = null;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((pd) this).field_a = 0;
                        ((pd) this).field_f = k.a(0);
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

    final static void b(boolean param0) {
        uh.field_f = new hl(0L, (hl) null);
        if (!(!kj.field_b)) {
            uh.field_f.a((byte) -108, uh.field_e);
        }
        uh.field_f.a((byte) -112, hh.field_c);
        gg.field_j = new mk(nm.field_v, uh.field_f);
        if (param0) {
            pd.e(-120);
        }
        hn.field_P = new hl(0L, (hl) null);
        hn.field_P.a((byte) -92, (hl) (Object) gg.field_j.field_g);
        hn.field_P.a((byte) 68, gg.field_i);
        db.a(5);
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
                        if (null == ((pd) this).field_s) {
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
                            ((pd) this).field_b.field_t = 0;
                            ((pd) this).field_b.a(6, param0);
                            ((pd) this).field_b.a(3, (byte) -66);
                            ((pd) this).field_b.b(0, param0);
                            ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
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
                            ((pd) this).field_s.d(-15488);
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
                        ((pd) this).field_d = -2;
                        ((pd) this).field_s = null;
                        ((pd) this).field_h = ((pd) this).field_h + 1;
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

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            bh stackIn_6_0 = null;
            bh stackIn_7_0 = null;
            bh stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            fl stackIn_9_0 = null;
            fl stackIn_10_0 = null;
            fl stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            bh stackOut_5_0 = null;
            bh stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            bh stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            fl stackOut_8_0 = null;
            fl stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            fl stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((pd) this).field_s == null) {
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
                            if (!param0) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((pd) this).field_s = null;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((pd) this).field_b.field_t = 0;
                            stackOut_5_0 = ((pd) this).field_b;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (!param1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (bh) (Object) stackIn_6_0;
                            stackOut_6_1 = 2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = (bh) (Object) stackIn_7_0;
                            stackOut_7_1 = 3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((bh) (Object) stackIn_8_0).a(stackIn_8_1, param0);
                            ((pd) this).field_b.a(0L, true);
                            stackOut_8_0 = ((pd) this).field_s;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            if (param0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = (fl) (Object) stackIn_9_0;
                            stackOut_9_1 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = (fl) (Object) stackIn_10_0;
                            stackOut_10_1 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((fl) (Object) stackIn_11_0).a(stackIn_11_1 != 0, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((pd) this).field_s.d(-15488);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        ((pd) this).field_s = null;
                        ((pd) this).field_h = ((pd) this).field_h + 1;
                        ((pd) this).field_d = -2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
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

    public pd() {
    }

    static {
    }
}
