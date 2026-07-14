/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eg extends tk {
    static er[] field_r;
    static String field_t;
    private pm field_u;
    static String field_q;
    static int[][] field_s;

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ia var2_ref = null;
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
            ia var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_89_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_88_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Vertigo2.field_L ? 1 : 0;
                        if (param0 == -3599) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_q = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (((eg) this).field_u == null) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var2_long = gk.a(param0 + 3686);
                        var4 = (int)(-((eg) this).field_k + var2_long);
                        if (-201 > (var4 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var4 = 200;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((eg) this).field_k = var2_long;
                        ((eg) this).field_o = ((eg) this).field_o + var4;
                        if ((((eg) this).field_o ^ -1) >= -30001) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((eg) this).field_u.b(0);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((eg) this).field_u = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null == ((eg) this).field_u) {
                            statePc = 13;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 != (((eg) this).d((byte) -109) ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (0 == ((eg) this).b(param0 ^ 3598)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return false;
                    }
                    case 17: {
                        return true;
                    }
                    case 18: {
                        try {
                            ((eg) this).field_u.c(-26206);
                            var2_ref = (ia) (Object) ((eg) this).field_b.b((byte) -50);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((eg) this).field_f.field_u = 0;
                            ((eg) this).field_f.f(1, param0 ^ -3703);
                            ((eg) this).field_f.b((byte) 90, var2_ref.field_n);
                            ((eg) this).field_u.a(0, ((eg) this).field_f.field_p.length, param0 ^ -3646, ((eg) this).field_f.field_p);
                            ((eg) this).field_a.a(false, (gp) (Object) var2_ref);
                            var2_ref = (ia) (Object) ((eg) this).field_b.a(true);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_ref = (ia) (Object) ((eg) this).field_d.b((byte) -50);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((eg) this).field_f.field_u = 0;
                            ((eg) this).field_f.f(0, 93);
                            ((eg) this).field_f.b((byte) 125, var2_ref.field_n);
                            ((eg) this).field_u.a(0, ((eg) this).field_f.field_p.length, -93, ((eg) this).field_f.field_p);
                            ((eg) this).field_g.a(false, (gp) (Object) var2_ref);
                            var2_ref = (ia) (Object) ((eg) this).field_d.a(true);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 88;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((eg) this).field_u.a(15166);
                            if (var3_int < 0) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((eg) this).field_o = 0;
                            var4 = 0;
                            if (null == ((eg) this).field_h) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (((eg) this).field_h.field_F != -1) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 1;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var4 = 10;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-1 >= var4) {
                                statePc = 72;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = var4 + -((eg) this).field_i.field_u;
                            if (var3_int < var5) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var5 = var3_int;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((eg) this).field_u.a(((eg) this).field_i.field_p, false, var5, ((eg) this).field_i.field_u);
                            if (((eg) this).field_l != 0) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6 = 0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var6 >= var5) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((eg) this).field_i.field_p[var6 + ((eg) this).field_i.field_u] = (byte)tk.a((int) ((eg) this).field_i.field_p[var6 + ((eg) this).field_i.field_u], (int) ((eg) this).field_l);
                            var6++;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((eg) this).field_i.field_u = ((eg) this).field_i.field_u + var5;
                            if (var4 <= ((eg) this).field_i.field_u) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (((eg) this).field_h != null) {
                                statePc = 67;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((eg) this).field_i.field_u = 0;
                            var6 = ((eg) this).field_i.h(param0 + 3588);
                            var7 = ((eg) this).field_i.b(true);
                            var8 = ((eg) this).field_i.h(-11);
                            var9 = ((eg) this).field_i.b(true);
                            var10 = var8 & 127;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 90;
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
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var11 = stackIn_50_0;
                            var12 = (long)var7 + ((long)var6 << -1130058336);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (ia) (Object) ((eg) this).field_g.b((byte) -50);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if ((var12 ^ -1L) == (var14_ref.field_n ^ -1L)) {
                                statePc = 60;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var14_ref = (ia) (Object) ((eg) this).field_g.a(true);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (ia) (Object) ((eg) this).field_a.b((byte) -50);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var14_ref == null) {
                                statePc = 60;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if ((var14_ref.field_n ^ -1L) != (var12 ^ -1L)) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (ia) (Object) ((eg) this).field_a.a(true);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((eg) this).field_h = var14_ref;
                            if (0 == var10) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 9;
                            stackIn_66_0 = stackOut_64_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 5;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var15 = stackIn_66_0;
                            ((eg) this).field_h.field_J = new ed(var9 + (var15 - -((eg) this).field_h.field_B));
                            ((eg) this).field_h.field_J.f(var10, -127);
                            ((eg) this).field_h.field_J.e(var9, param0 + 3599);
                            ((eg) this).field_h.field_F = 10;
                            ((eg) this).field_i.field_u = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (((eg) this).field_h.field_F != 0) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (-1 != ((eg) this).field_i.field_p[0]) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            ((eg) this).field_h.field_F = 1;
                            ((eg) this).field_i.field_u = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((eg) this).field_h = null;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var5 = ((eg) this).field_h.field_J.field_p.length + -((eg) this).field_h.field_B;
                            var6 = -((eg) this).field_h.field_F + 512;
                            if (var5 - ((eg) this).field_h.field_J.field_u < var6) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var6 = -((eg) this).field_h.field_J.field_u + var5;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var3_int < var6) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((eg) this).field_u.a(((eg) this).field_h.field_J.field_p, false, var6, ((eg) this).field_h.field_J.field_u);
                            if (-1 != (((eg) this).field_l ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var17 >= var6) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((eg) this).field_h.field_J.field_p[((eg) this).field_h.field_J.field_u + var17] = (byte)tk.a((int) ((eg) this).field_h.field_J.field_p[((eg) this).field_h.field_J.field_u + var17], (int) ((eg) this).field_l);
                            var17++;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((eg) this).field_h.field_F = ((eg) this).field_h.field_F + var6;
                            ((eg) this).field_h.field_J.field_u = ((eg) this).field_h.field_J.field_u + var6;
                            if (((eg) this).field_h.field_J.field_u != var5) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((eg) this).field_h.a(param0 ^ 3700);
                            ((eg) this).field_h.field_z = false;
                            ((eg) this).field_h = null;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if ((((eg) this).field_h.field_F ^ -1) != -513) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((eg) this).field_h.field_F = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            stackOut_88_0 = 1;
                            stackIn_89_0 = stackOut_88_0;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        return stackIn_89_0 != 0;
                    }
                    case 90: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        try {
                            ((eg) this).field_u.b(param0 ^ -3599);
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 93;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
                        ((eg) this).field_m = ((eg) this).field_m + 1;
                        ((eg) this).field_j = -2;
                        ((eg) this).field_u = null;
                        if (-1 != (((eg) this).d((byte) -102) ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        if (((eg) this).b(-1) != 0) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 96: {
                        return true;
                    }
                    case 97: {
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4_ref_Exception = null;
            IOException var4_ref_IOException = null;
            ia var4_ref_ia = null;
            int var4 = 0;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Vertigo2.field_L ? 1 : 0;
                        if (((eg) this).field_u == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((eg) this).field_u.b(0);
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
                        ((eg) this).field_u = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((eg) this).field_u = (pm) param0;
                        this.g(0);
                        this.a(param1, (byte) -50);
                        ((eg) this).field_h = null;
                        ((eg) this).field_i.field_u = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref_ia = (ia) (Object) ((eg) this).field_a.a(-67);
                        if (var4_ref_ia == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((eg) this).field_b.a(false, (gp) (Object) var4_ref_ia);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref_ia = (ia) (Object) ((eg) this).field_g.a(-75);
                        if (var4_ref_ia == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((eg) this).field_d.a(false, (gp) (Object) var4_ref_ia);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 10: {
                        if (-1 != (((eg) this).field_l ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((eg) this).field_f.field_u = 0;
                            ((eg) this).field_f.f(4, -84);
                            ((eg) this).field_f.f((int) ((eg) this).field_l, 115);
                            ((eg) this).field_f.e(0, 0);
                            ((eg) this).field_u.a(0, ((eg) this).field_f.field_p.length, -87, ((eg) this).field_f.field_p);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var4_ref_IOException = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((eg) this).field_u.b(0);
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
                        ((eg) this).field_m = ((eg) this).field_m + 1;
                        ((eg) this).field_j = -2;
                        ((eg) this).field_u = null;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        ((eg) this).field_o = 0;
                        ((eg) this).field_k = gk.a(111);
                        var4 = 76 / ((0 - param2) / 43);
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

    public static void h(int param0) {
        if (param0 != 3) {
            eg.h(116);
        }
        field_s = null;
        field_q = null;
        field_t = null;
        field_r = null;
    }

    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (param0) {
            if (on.field_e[param1] >= on.field_e[param3]) {
              if (on.field_e[param1] > on.field_e[param3]) {
                return false;
              } else {
                if (hm.field_A[param1] < hm.field_A[param3]) {
                  return true;
                } else {
                  if (hm.field_A[param1] <= hm.field_A[param3]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            if (hm.field_A[param3] <= hm.field_A[param1]) {
              if (hm.field_A[param1] > hm.field_A[param3]) {
                return false;
              } else {
                if (on.field_e[param1] >= on.field_e[param3]) {
                  if (on.field_e[param3] >= on.field_e[param1]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          }
        }
        var4 = jf.field_N[param1] + li.field_g[param1] - -ub.field_p[param1];
        var5 = jf.field_N[param3] + li.field_g[param3] - -ub.field_p[param3];
        if (var5 > var4) {
          return true;
        } else {
          if (var5 >= var4) {
            L1: {
              var6 = -30 / ((param2 - 0) / 39);
              if (param3 <= param1) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L1;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L1;
              }
            }
            return stackIn_28_0 != 0;
          } else {
            return false;
          }
        }
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
                        if (null == ((eg) this).field_u) {
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
                            ((eg) this).field_f.field_u = 0;
                            ((eg) this).field_f.f(6, 118);
                            ((eg) this).field_f.i(param0 ^ -1725083856, 3);
                            ((eg) this).field_f.d(0, param0 ^ -1783);
                            ((eg) this).field_u.a(param0, ((eg) this).field_f.field_p.length, 34, ((eg) this).field_f.field_p);
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
                            ((eg) this).field_u.b(param0 + 0);
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
                        ((eg) this).field_m = ((eg) this).field_m + 1;
                        ((eg) this).field_u = null;
                        ((eg) this).field_j = -2;
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

    final void e(int param0) {
        try {
            ((eg) this).field_u.b(param0);
        } catch (Exception exception) {
        }
        ((eg) this).field_u = null;
        ((eg) this).field_m = ((eg) this).field_m + 1;
        ((eg) this).field_j = -1;
        ((eg) this).field_l = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void a(int param0, ra param1) {
        if (param0 <= 76) {
            return;
        }
        il.field_g.b((sn) (Object) param1);
    }

    public eg() {
    }

    final void b(byte param0) {
        if (!(null == ((eg) this).field_u)) {
            ((eg) this).field_u.b(0);
        }
        if (param0 != 9) {
            field_q = null;
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ed stackIn_6_0 = null;
            ed stackIn_7_0 = null;
            ed stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            ed stackOut_5_0 = null;
            ed stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            ed stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((eg) this).field_u == null) {
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
                            ((eg) this).field_f.field_u = 0;
                            if (param1 < 0) {
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
                            field_s = null;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = ((eg) this).field_f;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (!param0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (ed) (Object) stackIn_6_0;
                            stackOut_6_1 = 2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = (ed) (Object) stackIn_7_0;
                            stackOut_7_1 = 3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
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
                            ((ed) (Object) stackIn_8_0).f(stackIn_8_1, 100);
                            ((eg) this).field_f.b((byte) 50, 0L);
                            ((eg) this).field_u.a(0, ((eg) this).field_f.field_p.length, 26, ((eg) this).field_f.field_p);
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
                            ((eg) this).field_u.b(0);
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
                        ((eg) this).field_m = ((eg) this).field_m + 1;
                        ((eg) this).field_j = -2;
                        ((eg) this).field_u = null;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = null;
        field_q = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = new int[][]{new int[4], new int[4], new int[6], new int[6]};
    }
}
