/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ch {
    static int field_o;
    private jd field_m;
    static sg field_n;

    final static jk e(int param0) {
        if (param0 != 48) {
            field_n = (sg) null;
        }
        return new jk(ja.a(-7705), oj.a(104));
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != -14282) {
            field_o = -16;
        }
    }

    final void c(byte param0) {
        try {
            ((a) this).field_m.a(true);
        } catch (Exception exception) {
        }
        if (param0 != 0) {
            a.d((byte) 104);
        }
        ((a) this).field_b = ((a) this).field_b + 1;
        ((a) this).field_m = null;
        ((a) this).field_l = -1;
        ((a) this).field_f = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final void a(int param0) {
        if (!(((a) this).field_m == null)) {
            ((a) this).field_m.a(true);
        }
        if (param0 <= 22) {
            a.a(124, 36, 81, 117, -47, 33);
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            na var2_ref = null;
            Exception var3 = null;
            na var3_ref = null;
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
            na var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_46_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_83_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_82_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Main.field_T;
                        if (null == ((a) this).field_m) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = id.a(25);
                        var4 = (int)(-((a) this).field_d + var2_long);
                        ((a) this).field_d = var2_long;
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
                        ((a) this).field_k = ((a) this).field_k + var4;
                        if ((((a) this).field_k ^ -1) < -30001) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((a) this).field_m.a(true);
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
                        ((a) this).field_m = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((a) this).field_m) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (0 != ((a) this).a((byte) -35)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((a) this).b(-21040) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return false;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        return true;
                    }
                    case 15: {
                        try {
                            ((a) this).field_m.b((byte) -44);
                            var2_int = -9 / ((-82 - param0) / 34);
                            var3_ref = (na) ((a) this).field_g.c((byte) -112);
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
                            if (var3_ref == null) {
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
                            ((a) this).field_c.field_i = 0;
                            ((a) this).field_c.b(-9469, 1);
                            ((a) this).field_c.a(((na) var3_ref).field_j, 101);
                            ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                            ((a) this).field_h.a((byte) -90, (he) (Object) var3_ref);
                            var3_ref = (na) ((a) this).field_g.b((byte) -122);
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
                            var2_ref = (na) ((a) this).field_a.c((byte) -107);
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
                            ((a) this).field_c.field_i = 0;
                            ((a) this).field_c.b(-9469, 0);
                            ((a) this).field_c.a(((na) var2_ref).field_j, 100);
                            ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                            ((a) this).field_e.a((byte) -96, (he) (Object) var2_ref);
                            var2_ref = (na) ((a) this).field_a.b((byte) -122);
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
                            if (-101 >= (var2_int ^ -1)) {
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
                            var3_int = ((a) this).field_m.b(-125);
                            if (var3_int > -1) {
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
                            if (-1 == var3_int) {
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
                            ((a) this).field_k = 0;
                            var4 = 0;
                            if (((a) this).field_j != null) {
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
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (((a) this).field_j.field_t == 0) {
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
                            var4 = 1;
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
                            if (0 >= var4) {
                                statePc = 68;
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
                            var5 = -((a) this).field_i.field_i + var4;
                            if (var5 <= var3_int) {
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
                            var5 = var3_int;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ((a) this).field_m.a((byte) 66, ((a) this).field_i.field_g, var5, ((a) this).field_i.field_i);
                            if (-1 != (((a) this).field_f ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = 0;
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
                            if (var6 >= var5) {
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
                            ((a) this).field_i.field_g[var6 + ((a) this).field_i.field_i] = (byte)hi.a((int) ((a) this).field_i.field_g[var6 + ((a) this).field_i.field_i], (int) ((a) this).field_f);
                            var6++;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((a) this).field_i.field_i = ((a) this).field_i.field_i + var5;
                            if (var4 <= ((a) this).field_i.field_i) {
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
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (((a) this).field_j != null) {
                                statePc = 62;
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
                            ((a) this).field_i.field_i = 0;
                            var6 = ((a) this).field_i.f(64);
                            var7 = ((a) this).field_i.e((byte) 125);
                            var8 = ((a) this).field_i.f(16);
                            var9 = ((a) this).field_i.e((byte) 126);
                            var10 = var8 & 127;
                            if (-1 == (var8 & 128 ^ -1)) {
                                statePc = 45;
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
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
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
                            var11 = stackIn_46_0;
                            var12 = (long)var7 + ((long)var6 << -1238988832);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 51;
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
                            var14_ref = (na) ((a) this).field_h.c((byte) -128);
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
                            if (var14_ref == null) {
                                statePc = 55;
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
                            if ((((na) var14_ref).field_j ^ -1L) == (var12 ^ -1L)) {
                                statePc = 55;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var14_ref = (na) ((a) this).field_h.b((byte) -122);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (na) ((a) this).field_e.c((byte) -109);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var14_ref == null) {
                                statePc = 55;
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
                            if ((var12 ^ -1L) == (((na) var14_ref).field_j ^ -1L)) {
                                statePc = 55;
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
                            var14_ref = (na) ((a) this).field_e.b((byte) -122);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var14_ref == null) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var10 != 0) {
                                statePc = 60;
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
                            stackOut_59_0 = 5;
                            stackIn_61_0 = stackOut_59_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 9;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var15 = stackIn_61_0;
                            ((a) this).field_j = var14_ref;
                            ((a) this).field_j.field_s = new pb(((a) this).field_j.field_u + (var15 + var9));
                            ((a) this).field_j.field_s.b(-9469, var10);
                            ((a) this).field_j.field_s.a(-246, var9);
                            ((a) this).field_i.field_i = 0;
                            ((a) this).field_j.field_t = 10;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (-1 == (((a) this).field_j.field_t ^ -1)) {
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
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (((a) this).field_i.field_g[0] != -1) {
                                statePc = 66;
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
                            ((a) this).field_j.field_t = 1;
                            ((a) this).field_i.field_i = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ((a) this).field_j = null;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var5 = -((a) this).field_j.field_u + ((a) this).field_j.field_s.field_g.length;
                            var6 = -((a) this).field_j.field_t + 512;
                            if (var6 <= -((a) this).field_j.field_s.field_i + var5) {
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
                            var6 = var5 - ((a) this).field_j.field_s.field_i;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 84;
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
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            ((a) this).field_m.a((byte) 66, ((a) this).field_j.field_s.field_g, var6, ((a) this).field_j.field_s.field_i);
                            if (-1 == (((a) this).field_f ^ -1)) {
                                statePc = 76;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var7 = 0;
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
                            if (var6 <= var7) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((a) this).field_j.field_s.field_g[var7 + ((a) this).field_j.field_s.field_i] = (byte)hi.a((int) ((a) this).field_j.field_s.field_g[var7 + ((a) this).field_j.field_s.field_i], (int) ((a) this).field_f);
                            var7++;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((a) this).field_j.field_t = ((a) this).field_j.field_t + var6;
                            ((a) this).field_j.field_s.field_i = ((a) this).field_j.field_s.field_i + var6;
                            if (((a) this).field_j.field_s.field_i == var5) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 84;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((((a) this).field_j.field_t ^ -1) == -513) {
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
                            ((a) this).field_j.field_t = 0;
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
                            ((a) this).field_j.d(12);
                            ((a) this).field_j.field_n = false;
                            ((a) this).field_j = null;
                            statePc = 81;
                            continue stateLoop;
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
                            ((a) this).field_m.a(true);
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
                        ((a) this).field_m = null;
                        ((a) this).field_b = ((a) this).field_b + 1;
                        ((a) this).field_l = -2;
                        if (((a) this).a((byte) 74) != 0) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (0 == ((a) this).b(-21040)) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ah.field_c[ei.field_f] = param4;
        if (param3 != -23576) {
            field_o = 23;
        }
        re.field_c[ei.field_f] = ei.field_f;
        p.field_n[ei.field_f] = param1;
        if (bd.field_F < param1) {
            ah.field_d = param1;
        }
        if (param1 < fk.field_h) {
            mf.field_g = param1;
        }
        q.field_h[ei.field_f] = param2;
        mj.field_b[ei.field_f] = param0;
        ij.field_c[ei.field_f] = param5;
        int var6 = param5 + (param2 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param2 / var6;
        db.field_l[ei.field_f] = var7;
        if (!(mf.field_g <= var7)) {
            mf.field_g = var7;
        }
        if (!(var7 <= ah.field_d)) {
            ah.field_d = var7;
        }
        ei.field_f = ei.field_f + 1;
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            na var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Main.field_T;
                        if (!param2) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_o = 20;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (((a) this).field_m != null) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            ((a) this).field_m.a(true);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        ((a) this).field_m = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((a) this).field_m = (jd) param0;
                        this.f(29034);
                        this.a((byte) 85, param1);
                        ((a) this).field_i.field_i = 0;
                        ((a) this).field_j = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (na) ((a) this).field_h.a(-99);
                        if (var4_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((a) this).field_g.a((byte) -124, (he) (Object) var4_ref2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (na) ((a) this).field_e.a(121);
                        if (var4_ref2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((a) this).field_a.a((byte) -120, (he) (Object) var4_ref2);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((a) this).field_f == 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((a) this).field_c.field_i = 0;
                            ((a) this).field_c.b(-9469, 4);
                            ((a) this).field_c.b(-9469, (int) ((a) this).field_f);
                            ((a) this).field_c.a(-246, 0);
                            ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
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
                            ((a) this).field_m.a(true);
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
                        ((a) this).field_m = null;
                        ((a) this).field_l = -2;
                        ((a) this).field_b = ((a) this).field_b + 1;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((a) this).field_k = 0;
                        ((a) this).field_d = id.a(114);
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

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Main.field_T;
        while (true) {
            param2--;
            if ((param2 ^ -1) > -1) {
                break;
            }
            var9 = param3;
            int[] var5 = var9;
            var6 = param0;
            var7 = param1;
            var9[var6] = bc.a(8355711, var9[var6] >> -1483723263) + var7;
            param0++;
        }
        if (param4 != -1483723263) {
            field_n = (sg) null;
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            int var3 = 0;
            Exception var5 = null;
            pb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            pb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            pb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            pb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            pb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            pb stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((a) this).field_m) {
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
                        var3 = -115 / ((param0 - -61) / 55);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            ((a) this).field_c.field_i = 0;
                            stackOut_3_0 = ((a) this).field_c;
                            stackOut_3_1 = -9469;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (!param1) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (pb) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 2;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_6_2 = stackOut_4_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (pb) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 3;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((pb) (Object) stackIn_6_0).b(stackIn_6_1, stackIn_6_2);
                            ((a) this).field_c.a(0L, 121);
                            ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((a) this).field_m.a(true);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        ((a) this).field_l = -2;
                        ((a) this).field_m = null;
                        ((a) this).field_b = ((a) this).field_b + 1;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
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

    final static wb a(wb param0, int[] param1, int param2) {
        wb var3 = new wb(0, 0, 0);
        var3.field_c = ((wb) param0).field_c;
        var3.field_j = param1;
        var3.field_b = ((wb) param0).field_b;
        var3.field_i = ((wb) param0).field_i;
        var3.field_g = ((wb) param0).field_g;
        var3.field_h = ((wb) param0).field_h;
        var3.field_e = ((wb) param0).field_e;
        var3.field_f = ((wb) param0).field_f;
        int var4 = 69 % ((69 - param2) / 42);
        return var3;
    }

    private final void f(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((a) this).field_m == null) {
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
                        if (param0 == 29034) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        field_n = (sg) null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((a) this).field_c.field_i = 0;
                            ((a) this).field_c.b(-9469, 6);
                            ((a) this).field_c.a(3, (byte) 60);
                            ((a) this).field_c.e(0, param0 ^ 5330);
                            ((a) this).field_m.a(0, (byte) -89, ((a) this).field_c.field_g.length, ((a) this).field_c.field_g);
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
                            ((a) this).field_m.a(true);
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
                        ((a) this).field_b = ((a) this).field_b + 1;
                        ((a) this).field_m = null;
                        ((a) this).field_l = -2;
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

    final static void d(byte param0) {
        if (param0 <= 28) {
            field_n = (sg) null;
        }
        vb.field_h.c((lk) (Object) new tj(), (byte) 35);
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var9 = Main.field_T;
        var6 = -3;
        L0: while (true) {
          if (-4 > var6) {
            qa.field_b.b(param1, param3, param5, param4, param2);
            return;
          } else {
            var7 = -3;
            L1: while (true) {
              if (-4 < var7) {
                var6++;
                continue L0;
              } else {
                L2: {
                  if (-1 < var6) {
                    stackOut_6_0 = -var6;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var6;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  stackOut_7_0 = stackIn_7_0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (-1 > var7) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = -var7;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L3;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = var7;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L3;
                  }
                }
                var8 = stackIn_10_0 + stackIn_10_1;
                if (4 >= var8) {
                  qa.field_b.a(param1, var6 + param3, var7 + param5, param0, -1, 256 - var8 * 48);
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public a() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new sg();
    }
}
