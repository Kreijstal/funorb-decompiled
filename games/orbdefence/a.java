/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ge {
    static String[] field_v;
    static int[] field_t;
    static String field_u;
    private cb field_q;
    static int field_r;
    static int[] field_s;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            cd var2_ref = null;
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
            cd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_24_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_88_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_87_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = OrbDefence.field_D ? 1 : 0;
                        if (null != ((a) this).field_q) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ji.b(param0 + -278);
                        var4 = (int)(var2_long + -((a) this).field_j);
                        ((a) this).field_j = var2_long;
                        if (var4 <= 200) {
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
                        ((a) this).field_e = ((a) this).field_e + var4;
                        if ((((a) this).field_e ^ -1) < -30001) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((a) this).field_q.a(1);
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
                        ((a) this).field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((a) this).field_q == null) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((a) this).g(-128) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 != (((a) this).b(84) ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return true;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        try {
                            ((a) this).field_q.b(-120);
                            var2_ref = (cd) (Object) ((a) this).field_d.b((byte) 46);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((a) this).field_l.field_i = 0;
                            ((a) this).field_l.a(1, -41);
                            ((a) this).field_l.b(123, var2_ref.field_h);
                            ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                            ((a) this).field_p.a(param0 ^ -143, (o) (Object) var2_ref);
                            var2_ref = (cd) (Object) ((a) this).field_d.b(0);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var2_ref = (cd) (Object) ((a) this).field_k.b((byte) 46);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((a) this).field_l.field_i = 0;
                            ((a) this).field_l.a(0, -74);
                            ((a) this).field_l.b(115, var2_ref.field_h);
                            ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                            ((a) this).field_f.a(-90, (o) (Object) var2_ref);
                            var2_ref = (cd) (Object) ((a) this).field_k.b(0);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_int = 0;
                            if (param0 == 255) {
                                statePc = 25;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0 != 0;
                    }
                    case 25: {
                        try {
                            if (var2_int <= -101) {
                                statePc = 87;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((a) this).field_q.b((byte) 101);
                            if (-1 > var3_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((a) this).field_e = 0;
                            var4 = 0;
                            if (null == ((a) this).field_a) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-1 != ((a) this).field_a.field_v) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 89;
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
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var4 > 0) {
                                statePc = 48;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = ((a) this).field_a.field_u.field_j.length + -((a) this).field_a.field_s;
                            var6 = 512 - ((a) this).field_a.field_v;
                            if (var5 - ((a) this).field_a.field_u.field_i >= var6) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = var5 - ((a) this).field_a.field_u.field_i;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6 = var3_int;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((a) this).field_q.a(((a) this).field_a.field_u.field_i, var6, 87, ((a) this).field_a.field_u.field_j);
                            if (((a) this).field_h == 0) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var6 <= var7) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((a) this).field_a.field_u.field_j[((a) this).field_a.field_u.field_i - -var7] = (byte)gi.a((int) ((a) this).field_a.field_u.field_j[((a) this).field_a.field_u.field_i + var7], (int) ((a) this).field_h);
                            var7++;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((a) this).field_a.field_v = ((a) this).field_a.field_v + var6;
                            ((a) this).field_a.field_u.field_i = ((a) this).field_a.field_u.field_i + var6;
                            if (((a) this).field_a.field_u.field_i == var5) {
                                statePc = 47;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (-513 != (((a) this).field_a.field_v ^ -1)) {
                                statePc = 86;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((a) this).field_a.field_v = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((a) this).field_a.c(-1);
                            ((a) this).field_a.field_l = false;
                            ((a) this).field_a = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var5 = -((a) this).field_m.field_i + var4;
                            if (var5 > var3_int) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var5 = var3_int;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            ((a) this).field_q.a(((a) this).field_m.field_i, var5, -117, ((a) this).field_m.field_j);
                            if (((a) this).field_h == 0) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var6 = 0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var6 >= var5) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((a) this).field_m.field_j[((a) this).field_m.field_i - -var6] = (byte)gi.a((int) ((a) this).field_m.field_j[((a) this).field_m.field_i + var6], (int) ((a) this).field_h);
                            var6++;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((a) this).field_m.field_i = ((a) this).field_m.field_i + var5;
                            if (((a) this).field_m.field_i >= var4) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (((a) this).field_a == null) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((a) this).field_m.field_i = 0;
                            var6 = ((a) this).field_m.b((byte) 90);
                            var7 = ((a) this).field_m.l(0);
                            var8 = ((a) this).field_m.b((byte) 90);
                            var9 = ((a) this).field_m.l(param0 + -255);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_62_0 = stackOut_60_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var11 = stackIn_62_0;
                            var12 = ((long)var6 << 1096479136) - -(long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (cd) (Object) ((a) this).field_f.b((byte) 46);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var14_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if ((var14_ref.field_h ^ -1L) != (var12 ^ -1L)) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14_ref = (cd) (Object) ((a) this).field_f.b(0);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (cd) (Object) ((a) this).field_p.b((byte) 46);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var14_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var14_ref.field_h ^ -1L) != (var12 ^ -1L)) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var14_ref = (cd) (Object) ((a) this).field_p.b(0);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var14_ref == null) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((a) this).field_a = var14_ref;
                            if (var10 == 0) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackOut_77_0 = 9;
                            stackIn_79_0 = stackOut_77_0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackOut_78_0 = 5;
                            stackIn_79_0 = stackOut_78_0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var15 = stackIn_79_0;
                            ((a) this).field_a.field_u = new mg(((a) this).field_a.field_s + var9 + var15);
                            ((a) this).field_a.field_u.a(var10, -99);
                            ((a) this).field_a.field_u.b(var9, -1);
                            ((a) this).field_a.field_v = 10;
                            ((a) this).field_m.field_i = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (0 == ((a) this).field_a.field_v) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if ((((a) this).field_m.field_j[0] ^ -1) == 0) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((a) this).field_a = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((a) this).field_m.field_i = 0;
                            ((a) this).field_a.field_v = 1;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackOut_87_0 = 1;
                            stackIn_88_0 = stackOut_87_0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        return stackIn_88_0 != 0;
                    }
                    case 89: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 90: {
                        try {
                            ((a) this).field_q.a(1);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 92;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 93;
                        continue stateLoop;
                    }
                    case 93: {
                        ((a) this).field_q = null;
                        ((a) this).field_b = ((a) this).field_b + 1;
                        ((a) this).field_n = -2;
                        if (-1 != (((a) this).g(-113) ^ -1)) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        if (((a) this).b(param0 + -207) != 0) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        return true;
                    }
                    case 96: {
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

    final void f(int param0) {
        try {
            ((a) this).field_q.a(1);
            // if_icmple L25
            field_u = null;
        } catch (Exception exception) {
        }
        ((a) this).field_n = -1;
        ((a) this).field_b = ((a) this).field_b + 1;
        ((a) this).field_q = null;
        ((a) this).field_h = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static rg a(int param0, String param1, int param2) {
        int var3 = -55 % ((-3 - param2) / 32);
        md var4 = new md();
        ((rg) (Object) var4).field_b = param0;
        ((rg) (Object) var4).field_a = param1;
        return (rg) (Object) var4;
    }

    private final void b(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((a) this).field_q) {
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
                            ((a) this).field_l.field_i = 0;
                            ((a) this).field_l.a(6, -32);
                            if (param0 <= -73) {
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
                            field_s = null;
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
                            ((a) this).field_l.c(3, 127);
                            ((a) this).field_l.b((byte) -60, 0);
                            ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
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
                            ((a) this).field_q.a(1);
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
                        ((a) this).field_q = null;
                        ((a) this).field_b = ((a) this).field_b + 1;
                        ((a) this).field_n = -2;
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

    public static void a(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        int var1 = -22 / ((param0 - -30) / 37);
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            mg stackIn_5_0 = null;
            mg stackIn_6_0 = null;
            mg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            mg stackOut_4_0 = null;
            mg stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            mg stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 <= -49) {
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
                        if (null != ((a) this).field_q) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            ((a) this).field_l.field_i = 0;
                            stackOut_4_0 = ((a) this).field_l;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            if (param1) {
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
                            stackOut_5_0 = (mg) (Object) stackIn_5_0;
                            stackOut_5_1 = 3;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
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
                            stackOut_6_0 = (mg) (Object) stackIn_6_0;
                            stackOut_6_1 = 2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
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
                            ((mg) (Object) stackIn_7_0).a(stackIn_7_1, -105);
                            ((a) this).field_l.b(106, 0L);
                            ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
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
                            ((a) this).field_q.a(1);
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
                        ((a) this).field_n = -2;
                        ((a) this).field_q = null;
                        ((a) this).field_b = ((a) this).field_b + 1;
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

    final static db[] a(be param0, int param1) {
        int var6 = 0;
        db var7 = null;
        int var8 = OrbDefence.field_D ? 1 : 0;
        if (!param0.b((byte) -120)) {
            return new db[]{};
        }
        eb var9 = param0.a((byte) 31);
        while (0 == var9.field_a) {
            hb.a(10L, 103);
        }
        if (var9.field_a == 2) {
            return new db[]{};
        }
        int[] var13 = (int[]) var9.field_g;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var3 = var10;
        db[] var4 = new db[var13.length >> -517371230];
        int var5 = 16 / ((param1 - -29) / 44);
        for (var6 = 0; var6 < var4.length; var6++) {
            var7 = new db();
            var4[var6] = var7;
            var7.field_d = var3[var6 << 167270370];
            var7.field_b = var3[1 + (var6 << 908315682)];
            var7.field_e = var3[(var6 << 239281666) + 2];
            var7.field_a = var3[3 + (var6 << 1061708130)];
        }
        return var4;
    }

    final void c(int param0) {
        if (param0 != 1) {
            return;
        }
        if (!(((a) this).field_q == null)) {
            ((a) this).field_q.a(1);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            cd var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = OrbDefence.field_D ? 1 : 0;
                        if (null != ((a) this).field_q) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((a) this).field_q.a(param1 + -19);
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
                        ((a) this).field_q = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((a) this).field_q = (cb) param0;
                        this.b((byte) -103);
                        this.a(-54, param2);
                        ((a) this).field_a = null;
                        ((a) this).field_m.field_i = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (cd) (Object) ((a) this).field_p.c(30664);
                        if (var4_ref2 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((a) this).field_d.a(-79, (o) (Object) var4_ref2);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (cd) (Object) ((a) this).field_f.c(30664);
                        if (var4_ref2 != null) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((a) this).field_k.a(-63, (o) (Object) var4_ref2);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((a) this).field_h != 0) {
                            statePc = 15;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((a) this).field_l.field_i = 0;
                            ((a) this).field_l.a(4, -80);
                            ((a) this).field_l.a((int) ((a) this).field_h, -85);
                            ((a) this).field_l.b(0, -1);
                            ((a) this).field_q.a((byte) 30, ((a) this).field_l.field_j, 0, ((a) this).field_l.field_j.length);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ((a) this).field_q.a(1);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((a) this).field_b = ((a) this).field_b + 1;
                        ((a) this).field_n = -2;
                        ((a) this).field_q = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((a) this).field_e = 0;
                        ((a) this).field_j = ji.b(107);
                        if (param1 == 20) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        field_s = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
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

    public a() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        kk.field_U[rc.field_d] = param0;
        bc.field_o[rc.field_d] = rc.field_d;
        tl.field_d[rc.field_d] = param3;
        if (!(param3 <= hc.field_j)) {
            jl.field_d = param3;
        }
        if (am.field_e > param3) {
            qh.field_a = param3;
        }
        vl.field_g[rc.field_d] = param5;
        th.field_f[rc.field_d] = param1;
        ld.field_b[rc.field_d] = param4;
        int var6 = param4 + (param5 - -param1);
        int var7 = -1 == (var6 ^ -1) ? 0 : 1000 * param5 / var6;
        rh.field_c[rc.field_d] = var7;
        if (param2 != 9664) {
            field_t = null;
        }
        if (!(var7 <= jl.field_d)) {
            jl.field_d = var7;
        }
        rc.field_d = rc.field_d + 1;
        if (qh.field_a > var7) {
            qh.field_a = var7;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new int[8192];
        field_u = "Confirm Email:";
        field_s = new int[8192];
    }
}
