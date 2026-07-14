/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qc extends ar {
    static String field_s;
    static qf field_w;
    static String field_t;
    private ke field_v;
    static String field_u;

    final static void a(int param0, int param1, int[] param2, int param3) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        c.c();
        c.a(param2, 0, param2.length);
        if (param1 != 18117) {
            return;
        }
        c.d();
        while (c.a()) {
            gf.f(c.field_e, c.field_h, -c.field_e + c.field_a, param0, param3);
        }
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            tk var2_ref = null;
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
            tk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_44_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_84_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_83_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ShatteredPlansClient.field_F ? 1 : 0;
                        if (((qc) this).field_v == null) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = pr.a(14274);
                        var4 = (int)(-((qc) this).field_k + var2_long);
                        ((qc) this).field_k = var2_long;
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
                        ((qc) this).field_n = ((qc) this).field_n + var4;
                        if ((((qc) this).field_n ^ -1) < -30001) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((qc) this).field_v.b(100);
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
                        ((qc) this).field_v = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((qc) this).field_v) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (-1 != (((qc) this).a((byte) 0) ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((qc) this).b(-5205)) {
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
                            ((qc) this).field_v.a(false);
                            var2_ref = (tk) (Object) ((qc) this).field_h.c(-128);
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
                            ((qc) this).field_c.field_j = 0;
                            ((qc) this).field_c.c(1, (byte) -85);
                            ((qc) this).field_c.a(param0 + 1729379144, var2_ref.field_l);
                            ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
                            ((qc) this).field_j.a((df) (Object) var2_ref, 32);
                            var2_ref = (tk) (Object) ((qc) this).field_h.b(32);
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
                            var2_ref = (tk) (Object) ((qc) this).field_m.c(-128);
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
                            ((qc) this).field_c.field_j = 0;
                            ((qc) this).field_c.c(0, (byte) -109);
                            ((qc) this).field_c.a(param0 ^ 1729379144, var2_ref.field_l);
                            ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, param0 + -13976);
                            ((qc) this).field_f.a((df) (Object) var2_ref, 32);
                            var2_ref = (tk) (Object) ((qc) this).field_m.b(32);
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
                            var2_int = param0;
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
                            if (var2_int >= 100) {
                                statePc = 83;
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
                            var3_int = ((qc) this).field_v.a(-1);
                            if (-1 >= var3_int) {
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
                            if (-1 == var3_int) {
                                statePc = 83;
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
                            ((qc) this).field_n = 0;
                            var4 = 0;
                            if (null != ((qc) this).field_l) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var4 = 10;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (((qc) this).field_l.field_A == 0) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
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
                                statePc = 66;
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
                            var5 = var4 - ((qc) this).field_q.field_j;
                            if (var3_int < var5) {
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
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ((qc) this).field_v.a(((qc) this).field_q.field_h, var5, ((qc) this).field_q.field_j, (byte) -52);
                            if (0 == ((qc) this).field_d) {
                                statePc = 38;
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
                            var6 = 0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var5 <= var6) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            ((qc) this).field_q.field_h[((qc) this).field_q.field_j + var6] = (byte)nc.a((int) ((qc) this).field_q.field_h[((qc) this).field_q.field_j + var6], (int) ((qc) this).field_d);
                            var6++;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((qc) this).field_q.field_j = ((qc) this).field_q.field_j + var5;
                            if (((qc) this).field_q.field_j >= var4) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (null != ((qc) this).field_l) {
                                statePc = 61;
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
                            ((qc) this).field_q.field_j = 0;
                            var6 = ((qc) this).field_q.j(-128);
                            var7 = ((qc) this).field_q.a(16711680);
                            var8 = ((qc) this).field_q.j(-65);
                            var9 = ((qc) this).field_q.a(16711680);
                            var10 = var8 & 127;
                            if (0 == (var8 & 128)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 85;
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
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var11 = stackIn_44_0;
                            var12 = ((long)var6 << 923181408) + (long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 50;
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
                            var14_ref = (tk) (Object) ((qc) this).field_f.c(param0 ^ -127);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var12 != var14_ref.field_l) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var14_ref = (tk) (Object) ((qc) this).field_f.b(32);
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var14_ref = (tk) (Object) ((qc) this).field_j.c(-127);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var12 ^ -1L) == (var14_ref.field_l ^ -1L)) {
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
                            var14_ref = (tk) (Object) ((qc) this).field_j.b(32);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 85;
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
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (-1 == (var10 ^ -1)) {
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
                            stackOut_58_0 = 9;
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
                            stackOut_59_0 = 5;
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
                            var15 = stackIn_60_0;
                            ((qc) this).field_l = var14_ref;
                            ((qc) this).field_l.field_D = new ob(((qc) this).field_l.field_w + var9 - -var15);
                            ((qc) this).field_l.field_D.c(var10, (byte) -106);
                            ((qc) this).field_l.field_D.e(11135, var9);
                            ((qc) this).field_q.field_j = 0;
                            ((qc) this).field_l.field_A = 10;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (-1 != (((qc) this).field_l.field_A ^ -1)) {
                                statePc = 65;
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
                            if (-1 != ((qc) this).field_q.field_h[0]) {
                                statePc = 64;
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
                            ((qc) this).field_q.field_j = 0;
                            ((qc) this).field_l.field_A = 1;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            ((qc) this).field_l = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var5 = -((qc) this).field_l.field_w + ((qc) this).field_l.field_D.field_h.length;
                            var6 = -((qc) this).field_l.field_A + 512;
                            if (var6 > var5 - ((qc) this).field_l.field_D.field_j) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var6 = var5 - ((qc) this).field_l.field_D.field_j;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var6 = var3_int;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            ((qc) this).field_v.a(((qc) this).field_l.field_D.field_h, var6, ((qc) this).field_l.field_D.field_j, (byte) 112);
                            if (((qc) this).field_d != 0) {
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
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var17 = 0;
                            var7 = var17;
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
                            if (var6 <= var17) {
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
                            ((qc) this).field_l.field_D.field_h[((qc) this).field_l.field_D.field_j - -var17] = (byte)nc.a((int) ((qc) this).field_l.field_D.field_h[((qc) this).field_l.field_D.field_j + var17], (int) ((qc) this).field_d);
                            var17++;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((qc) this).field_l.field_A = ((qc) this).field_l.field_A + var6;
                            ((qc) this).field_l.field_D.field_j = ((qc) this).field_l.field_D.field_j + var6;
                            if (var5 != ((qc) this).field_l.field_D.field_j) {
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
                            ((qc) this).field_l.a(16);
                            ((qc) this).field_l.field_u = false;
                            ((qc) this).field_l = null;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (((qc) this).field_l.field_A == 512) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
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
                            ((qc) this).field_l.field_A = 0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var2_int++;
                            statePc = 21;
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
                            ((qc) this).field_v.b(117);
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
                        ((qc) this).field_v = null;
                        ((qc) this).field_a = ((qc) this).field_a + 1;
                        ((qc) this).field_p = -2;
                        if (-1 != (((qc) this).a((byte) 0) ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        if (0 != ((qc) this).b(-5205)) {
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ua.field_f.a(param4, param0, (byte) 46, param1, param5);
        if (!(mr.field_h == null)) {
            mr.field_h.a(-1, param2, param0, -jj.field_m + param2, param6, param0);
        }
        if (param3 != 3) {
            field_t = null;
        }
    }

    final void a(byte param0, boolean param1, Object param2) {
        try {
            Exception var4_ref_Exception = null;
            IOException var4_ref_IOException = null;
            tk var4_ref_tk = null;
            int var4 = 0;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ShatteredPlansClient.field_F ? 1 : 0;
                        if (((qc) this).field_v == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((qc) this).field_v.b(116);
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
                        ((qc) this).field_v = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((qc) this).field_v = (ke) param2;
                        this.g(-20189);
                        this.a(param1, 3);
                        ((qc) this).field_l = null;
                        ((qc) this).field_q.field_j = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref_tk = (tk) (Object) ((qc) this).field_j.a(-44);
                        if (var4_ref_tk != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((qc) this).field_h.a((df) (Object) var4_ref_tk, 32);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref_tk = (tk) (Object) ((qc) this).field_f.a(110);
                        if (var4_ref_tk != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((qc) this).field_m.a((df) (Object) var4_ref_tk, 32);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 != ((qc) this).field_d) {
                            statePc = 14;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((qc) this).field_c.field_j = 0;
                            ((qc) this).field_c.c(4, (byte) -86);
                            ((qc) this).field_c.c((int) ((qc) this).field_d, (byte) -88);
                            ((qc) this).field_c.e(11135, 0);
                            ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var4_ref_IOException = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((qc) this).field_v.b(127);
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
                        ((qc) this).field_v = null;
                        ((qc) this).field_p = -2;
                        ((qc) this).field_a = ((qc) this).field_a + 1;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((qc) this).field_n = 0;
                        ((qc) this).field_k = pr.a(14274);
                        var4 = 50 % ((-11 - param0) / 48);
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

    final void b(byte param0) {
        try {
            ((qc) this).field_v.b(param0 + 209);
        } catch (Exception exception) {
        }
        if (param0 != -91) {
            return;
        }
        ((qc) this).field_v = null;
        ((qc) this).field_p = -1;
        ((qc) this).field_a = ((qc) this).field_a + 1;
        ((qc) this).field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final void e(int param0) {
        if (param0 != -16363) {
            field_s = null;
        }
        if (null != ((qc) this).field_v) {
            ((qc) this).field_v.b(126);
        }
    }

    public static void f(int param0) {
        int var1 = 67 % ((35 - param0) / 48);
        field_t = null;
        field_u = null;
        field_s = null;
        field_w = null;
    }

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ob stackIn_4_0 = null;
            ob stackIn_5_0 = null;
            ob stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ob stackOut_3_0 = null;
            ob stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            ob stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((qc) this).field_v) {
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
                            ((qc) this).field_c.field_j = 0;
                            stackOut_3_0 = ((qc) this).field_c;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
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
                            stackOut_4_0 = (ob) (Object) stackIn_4_0;
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
                            stackOut_5_0 = (ob) (Object) stackIn_5_0;
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
                            ((ob) (Object) stackIn_6_0).c(stackIn_6_1, (byte) -97);
                            if (param1 == 3) {
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
                            qc.f(88);
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
                            ((qc) this).field_c.a(param1 + 1729379141, 0L);
                            ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, param1 + -13979);
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
                            ((qc) this).field_v.b(89);
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
                        ((qc) this).field_a = ((qc) this).field_a + 1;
                        ((qc) this).field_p = -2;
                        ((qc) this).field_v = null;
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

    final static boolean a(String param0, int param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > -108) {
            return true;
        }
        de var2 = (de) (Object) qi.field_h.d(0);
        while (var2 != null) {
            if (!(!param0.equalsIgnoreCase(var2.field_l))) {
                return false;
            }
            var2 = (de) (Object) qi.field_h.a((byte) -71);
        }
        qi.field_h.a((byte) -113, (oh) (Object) new de(param0));
        return true;
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Object var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((qc) this).field_v) {
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
                            ((qc) this).field_c.field_j = 0;
                            ((qc) this).field_c.c(6, (byte) -59);
                            ((qc) this).field_c.a(true, 3);
                            ((qc) this).field_c.d(0, 255);
                            if (param0 == -20189) {
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
                            var4 = null;
                            qc.a(88, -57, (int[]) null, 10);
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
                            ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
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
                            ((qc) this).field_v.b(124);
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
                        ((qc) this).field_a = ((qc) this).field_a + 1;
                        ((qc) this).field_v = null;
                        ((qc) this).field_p = -2;
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

    final static void h(int param0) {
        qj.a((byte) -127, 4);
        if (param0 != 30252) {
            field_u = null;
        }
    }

    public qc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Cancel rematch";
        field_u = "Remove friend";
        field_t = "N/A";
    }
}
