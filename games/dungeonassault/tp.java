/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tp extends bb {
    static String field_z;
    static ef field_B;
    static String[] field_A;
    private rk field_D;
    static String field_u;
    static String[] field_C;
    static String field_w;
    static ad field_y;
    static String field_v;
    static String field_x;

    public static void h(int param0) {
        field_C = null;
        field_y = null;
        field_u = null;
        field_z = null;
        field_B = null;
        field_x = null;
        field_w = null;
        field_A = null;
        if (param0 < 0) {
            field_B = null;
        }
        field_v = null;
    }

    final void f(int param0) {
        try {
            ((tp) this).field_D.c(-6624);
        } catch (Exception exception) {
        }
        ((tp) this).field_c = -1;
        ((tp) this).field_D = null;
        int var2 = 57 % ((-81 - param0) / 36);
        ((tp) this).field_h = ((tp) this).field_h + 1;
        ((tp) this).field_j = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final static boolean c(byte param0) {
        if (param0 >= -10) {
            return true;
        }
        return in.field_E;
    }

    final void a(int param0) {
        if (!(null == ((tp) this).field_D)) {
            ((tp) this).field_D.c(-6624);
        }
        if (param0 != -1016) {
            field_u = null;
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            em var2_ref = null;
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
            em var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_18_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_88_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_87_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = DungeonAssault.field_K;
                        if (null != ((tp) this).field_D) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = kd.c(-2456);
                        var4 = (int)(-((tp) this).field_n + var2_long);
                        ((tp) this).field_n = var2_long;
                        if (var4 > 200) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = 200;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((tp) this).field_a = ((tp) this).field_a + var4;
                        if ((((tp) this).field_a ^ -1) < -30001) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((tp) this).field_D.c(-6624);
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
                        ((tp) this).field_D = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != ((tp) this).field_D) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((tp) this).c(20) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (0 != ((tp) this).e(20)) {
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
                            if (param0 > 6) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            ((tp) this).field_D.b(-89);
                            var2_ref = (em) (Object) ((tp) this).field_g.c(13395);
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
                            ((tp) this).field_o.field_o = 0;
                            ((tp) this).field_o.a(6, 1);
                            ((tp) this).field_o.a(var2_ref.field_o, 836);
                            ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                            ((tp) this).field_p.a((ll) (Object) var2_ref, -32711);
                            var2_ref = (em) (Object) ((tp) this).field_g.a((byte) 111);
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
                            var2_ref = (em) (Object) ((tp) this).field_d.c(13395);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((tp) this).field_o.field_o = 0;
                            ((tp) this).field_o.a(6, 0);
                            ((tp) this).field_o.a(var2_ref.field_o, 836);
                            ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                            ((tp) this).field_s.a((ll) (Object) var2_ref, -32711);
                            var2_ref = (em) (Object) ((tp) this).field_d.a((byte) 102);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (-101 >= var2_int) {
                                statePc = 87;
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
                            var3_int = ((tp) this).field_D.a(0);
                            if (-1 <= var3_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
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
                            if (var3_int == 0) {
                                statePc = 87;
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
                            ((tp) this).field_a = 0;
                            var4 = 0;
                            if (null != ((tp) this).field_i) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4 = 10;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (((tp) this).field_i.field_G == 0) {
                                statePc = 34;
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
                            var4 = 1;
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
                                statePc = 51;
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
                            var5 = ((tp) this).field_i.field_D.field_m.length + -((tp) this).field_i.field_E;
                            var6 = 512 - ((tp) this).field_i.field_G;
                            if (var6 <= var5 + -((tp) this).field_i.field_D.field_o) {
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
                            var6 = -((tp) this).field_i.field_D.field_o + var5;
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
                            if (var3_int < var6) {
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
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6 = var3_int;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((tp) this).field_D.a(((tp) this).field_i.field_D.field_m, false, var6, ((tp) this).field_i.field_D.field_o);
                            if (((tp) this).field_j != 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 89;
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
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((tp) this).field_i.field_D.field_m[((tp) this).field_i.field_D.field_o - -var7] = (byte)md.b((int) ((tp) this).field_i.field_D.field_m[((tp) this).field_i.field_D.field_o + var7], (int) ((tp) this).field_j);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((tp) this).field_i.field_G = ((tp) this).field_i.field_G + var6;
                            ((tp) this).field_i.field_D.field_o = ((tp) this).field_i.field_D.field_o + var6;
                            if (((tp) this).field_i.field_D.field_o != var5) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((tp) this).field_i.b((byte) -2);
                            ((tp) this).field_i.field_v = false;
                            ((tp) this).field_i = null;
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
                            if ((((tp) this).field_i.field_G ^ -1) == -513) {
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
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((tp) this).field_i.field_G = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = var4 + -((tp) this).field_m.field_o;
                            if (var3_int < var5) {
                                statePc = 53;
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
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 89;
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
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((tp) this).field_D.a(((tp) this).field_m.field_m, false, var5, ((tp) this).field_m.field_o);
                            if (-1 == (((tp) this).field_j ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var6 = 0;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var6 >= var5) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((tp) this).field_m.field_m[var6 + ((tp) this).field_m.field_o] = (byte)md.b((int) ((tp) this).field_m.field_m[var6 + ((tp) this).field_m.field_o], (int) ((tp) this).field_j);
                            var6++;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((tp) this).field_m.field_o = ((tp) this).field_m.field_o + var5;
                            if (var4 > ((tp) this).field_m.field_o) {
                                statePc = 86;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (((tp) this).field_i != null) {
                                statePc = 81;
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
                            ((tp) this).field_m.field_o = 0;
                            var6 = ((tp) this).field_m.c(true);
                            var7 = ((tp) this).field_m.h(-87);
                            var8 = ((tp) this).field_m.c(true);
                            var9 = ((tp) this).field_m.h(-100);
                            var10 = var8 & 127;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 1;
                            stackIn_63_0 = stackOut_61_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackOut_62_0 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var11 = stackIn_63_0;
                            var12 = (long)var7 + ((long)var6 << -1492136096);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (em) (Object) ((tp) this).field_s.c(13395);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref == null) {
                                statePc = 74;
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
                            if ((var12 ^ -1L) != (var14_ref.field_o ^ -1L)) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (em) (Object) ((tp) this).field_s.a((byte) 66);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var14_ref = (em) (Object) ((tp) this).field_p.c(13395);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var14_ref == null) {
                                statePc = 74;
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
                            if ((var14_ref.field_o ^ -1L) != (var12 ^ -1L)) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var14_ref = (em) (Object) ((tp) this).field_p.a((byte) 117);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var14_ref == null) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var10 != 0) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
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
                            stackIn_80_0 = stackOut_78_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 9;
                            stackIn_80_0 = stackOut_79_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var15 = stackIn_80_0;
                            ((tp) this).field_i = var14_ref;
                            ((tp) this).field_i.field_D = new ec(((tp) this).field_i.field_E + var15 + var9);
                            ((tp) this).field_i.field_D.a(6, var10);
                            ((tp) this).field_i.field_D.a((byte) 63, var9);
                            ((tp) this).field_i.field_G = 10;
                            ((tp) this).field_m.field_o = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (((tp) this).field_i.field_G != 0) {
                                statePc = 85;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (-1 == ((tp) this).field_m.field_m[0]) {
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
                            ((tp) this).field_i = null;
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
                            ((tp) this).field_m.field_o = 0;
                            ((tp) this).field_i.field_G = 1;
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
                            statePc = 26;
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
                            ((tp) this).field_D.c(-6624);
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
                        ((tp) this).field_c = -2;
                        ((tp) this).field_h = ((tp) this).field_h + 1;
                        ((tp) this).field_D = null;
                        if (((tp) this).c(20) != 0) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        if (0 == ((tp) this).e(20)) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        return false;
                    }
                    case 96: {
                        return false;
                    }
                    case 97: {
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

    private final void g(int param0) {
        try {
            IOException var2 = null;
            Exception var3 = null;
            Object var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((tp) this).field_D) {
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
                            ((tp) this).field_o.field_o = 0;
                            ((tp) this).field_o.a(6, 6);
                            ((tp) this).field_o.b((byte) -106, 3);
                            ((tp) this).field_o.i(0, -95);
                            ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
                            if (param0 == -30001) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4 = null;
                            eh discarded$2 = tp.a((nh) null, (String) null, (String) null, -28);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((tp) this).field_D.c(-6624);
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
                        ((tp) this).field_c = -2;
                        ((tp) this).field_D = null;
                        ((tp) this).field_h = ((tp) this).field_h + 1;
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

    final static void a(int param0, float param1, String param2) {
        lj.field_e = param2;
        if (param0 != 10) {
            tp.h(-5);
        }
        lc.field_e = param1;
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            em var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = DungeonAssault.field_K;
                        if (null == ((tp) this).field_D) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((tp) this).field_D.c(param2 ^ -6570);
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
                        ((tp) this).field_D = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((tp) this).field_D = (rk) param0;
                        this.g(-30001);
                        this.a(param1, 5391);
                        if (param2 == 118) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_x = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        ((tp) this).field_i = null;
                        ((tp) this).field_m.field_o = 0;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (em) (Object) ((tp) this).field_p.a(-8);
                        if (var4_ref2 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((tp) this).field_g.a((ll) (Object) var4_ref2, -32711);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (em) (Object) ((tp) this).field_s.a(121);
                        if (var4_ref2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((tp) this).field_d.a((ll) (Object) var4_ref2, -32711);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((tp) this).field_j == 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((tp) this).field_o.field_o = 0;
                            ((tp) this).field_o.a(6, 4);
                            ((tp) this).field_o.a(6, (int) ((tp) this).field_j);
                            ((tp) this).field_o.a((byte) 63, 0);
                            ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
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
                            ((tp) this).field_D.c(-6624);
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
                        ((tp) this).field_D = null;
                        ((tp) this).field_c = -2;
                        ((tp) this).field_h = ((tp) this).field_h + 1;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((tp) this).field_a = 0;
                        ((tp) this).field_n = kd.c(-2456);
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

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ec stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            ec stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            ec stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            ec stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            ec stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            ec stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((tp) this).field_D != null) {
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
                            ((tp) this).field_o.field_o = 0;
                            stackOut_2_0 = ((tp) this).field_o;
                            stackOut_2_1 = 6;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (param0) {
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
                            stackOut_3_0 = (ec) (Object) stackIn_3_0;
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
                            stackOut_4_0 = (ec) (Object) stackIn_4_0;
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
                            ((ec) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2);
                            ((tp) this).field_o.a(0L, 836);
                            ((tp) this).field_D.b(((tp) this).field_o.field_m, false, 0, ((tp) this).field_o.field_m.length);
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
                            ((tp) this).field_D.c(param1 + -12015);
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
                        ((tp) this).field_h = ((tp) this).field_h + 1;
                        ((tp) this).field_D = null;
                        ((tp) this).field_c = -2;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param1 == 5391) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        field_x = null;
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

    public tp() {
    }

    final static eh a(nh param0, String param1, String param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = DungeonAssault.field_K;
        eh var11 = new eh();
        eh var13 = var11;
        var13.field_i = param1;
        var13.field_b = param2;
        var13.field_d = param0;
        byte[] var16 = param0.a("config", param2 + "/" + param1, (byte) -128);
        ec var6 = new ec(var16);
        var13.field_c = (var16.length + -4) / 2;
        var13.field_j = new int[var13.field_c];
        var13.field_l = null;
        var13.field_f = 0;
        var13.field_k = new int[var13.field_c];
        var13.field_g = var6.k(0);
        var13.field_m = var6.k(0);
        for (var7 = 0; var13.field_c > var7; var7++) {
            var8 = var6.c(true);
            var9 = 10 * var6.c(true);
            var11.field_k[var7] = var8;
            var11.field_j[var7] = var9;
            var13.field_f = var13.field_f + var9;
        }
        if (param3 != -1998) {
            return null;
        }
        return var13;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Orb of Majesty";
        field_A = new String[]{null, "After selecting your target, you now need to choose which <%raiders> will form the party to send out. Select up to four <%raiders> by <col=FF0000>left-clicking on them</col>, then <col=FF0000>click 'Raid' to continue</col>. Remember to take a selection of <%raiders> with skills to overcome any form of defence you might encounter."};
        field_u = "DUNGEON ASSAULT";
        field_C = new String[]{"Surprise", "There are other aspects to combat between raiders and monsters; first is the element of <%highlight>surprise</col>. If your raider succeeds in surprising the monster, it will be able to <%highlight>strike first</col> - coupled with a high <%attack> skill, your raider may be able to defeat the monster before it gets a chance to strike back."};
        field_B = new ef();
        field_w = "Sort rooms by <%0>";
        field_y = new ad(2, 4, 4, 0);
        field_x = "This password contains your email address, and would be easy to guess";
    }
}
