/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kk extends ji {
    static lh field_w;
    private ba field_u;
    static int field_t;
    static float field_x;
    static String field_v;
    static int[] field_s;

    public static void i(int param0) {
        field_s = null;
        if (param0 > -69) {
            return;
        }
        field_v = null;
        field_w = null;
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            sd var2_ref = null;
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
            sd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_49_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_86_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_85_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Geoblox.field_C;
                        if (((kk) this).field_u != null) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = oa.a(-12520);
                        var4 = (int)(-((kk) this).field_k + var2_long);
                        if (-201 > (var4 ^ -1)) {
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
                        ((kk) this).field_k = var2_long;
                        ((kk) this).field_o = ((kk) this).field_o + var4;
                        if (((kk) this).field_o > 30000) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((kk) this).field_u.b(param0 ^ -43);
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
                        ((kk) this).field_u = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (((kk) this).field_u != null) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((kk) this).a(-78) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (0 != ((kk) this).a(false)) {
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
                            ((kk) this).field_u.d(-108);
                            var2_ref = (sd) (Object) ((kk) this).field_g.c((byte) 121);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((kk) this).field_m.field_f = 0;
                            ((kk) this).field_m.d((byte) -54, 1);
                            ((kk) this).field_m.a((byte) -127, var2_ref.field_i);
                            ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                            ((kk) this).field_e.a(-93, (rc) (Object) var2_ref);
                            var2_ref = (sd) (Object) ((kk) this).field_g.a(param0 ^ 41);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var2_ref = (sd) (Object) ((kk) this).field_p.c((byte) 121);
                            if (param0 == 95) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((kk) this).e(-90);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((kk) this).field_m.field_f = 0;
                            ((kk) this).field_m.d((byte) 8, 0);
                            ((kk) this).field_m.a((byte) -127, var2_ref.field_i);
                            ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                            ((kk) this).field_c.a(112, (rc) (Object) var2_ref);
                            var2_ref = (sd) (Object) ((kk) this).field_p.a(54);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 85;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((kk) this).field_u.a((byte) 82);
                            if (-1 >= (var3_int ^ -1)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            return true;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((kk) this).field_o = 0;
                            var4 = 0;
                            if (((kk) this).field_f != null) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((kk) this).field_f.field_D == 0) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (0 >= var4) {
                                statePc = 72;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = -((kk) this).field_j.field_f + var4;
                            if (var5 > var3_int) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var5 = var3_int;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((kk) this).field_u.a(((kk) this).field_j.field_j, (byte) -97, ((kk) this).field_j.field_f, var5);
                            if (((kk) this).field_i == 0) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var6 >= var5) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((kk) this).field_j.field_j[((kk) this).field_j.field_f + var6] = (byte)h.a((int) ((kk) this).field_j.field_j[((kk) this).field_j.field_f + var6], (int) ((kk) this).field_i);
                            var6++;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((kk) this).field_j.field_f = ((kk) this).field_j.field_f + var5;
                            if (((kk) this).field_j.field_f >= var4) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (null == ((kk) this).field_f) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((kk) this).field_j.field_f = 0;
                            var6 = ((kk) this).field_j.c((byte) 34);
                            var7 = ((kk) this).field_j.a((byte) -90);
                            var8 = ((kk) this).field_j.c((byte) 34);
                            var9 = ((kk) this).field_j.a((byte) -61);
                            var10 = var8 & 127;
                            if ((128 & var8) == 0) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var11 = stackIn_49_0;
                            var12 = (long)var7 + ((long)var6 << -559325984);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 55;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var14_ref = (sd) (Object) ((kk) this).field_e.c((byte) 121);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var14_ref == null) {
                                statePc = 60;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_i ^ -1L)) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var14_ref = (sd) (Object) ((kk) this).field_e.a(72);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (sd) (Object) ((kk) this).field_c.c((byte) 121);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var12 != var14_ref.field_i) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (sd) (Object) ((kk) this).field_c.a(-30);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((kk) this).field_f = var14_ref;
                            if (0 != var10) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 5;
                            stackIn_66_0 = stackOut_64_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 9;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var15 = stackIn_66_0;
                            ((kk) this).field_f.field_A = new qc(var9 + var15 + ((kk) this).field_f.field_E);
                            ((kk) this).field_f.field_A.d((byte) -26, var10);
                            ((kk) this).field_f.field_A.c((byte) 95, var9);
                            ((kk) this).field_j.field_f = 0;
                            ((kk) this).field_f.field_D = 10;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (0 != ((kk) this).field_f.field_D) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (-1 == ((kk) this).field_j.field_j[0]) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            ((kk) this).field_f = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((kk) this).field_j.field_f = 0;
                            ((kk) this).field_f.field_D = 1;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var5 = ((kk) this).field_f.field_A.field_j.length + -((kk) this).field_f.field_E;
                            var6 = 512 - ((kk) this).field_f.field_D;
                            if (-((kk) this).field_f.field_A.field_f + var5 >= var6) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var6 = -((kk) this).field_f.field_A.field_f + var5;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var6 = var3_int;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((kk) this).field_u.a(((kk) this).field_f.field_A.field_j, (byte) -97, ((kk) this).field_f.field_A.field_f, var6);
                            if (((kk) this).field_i == 0) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (var6 <= var17) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((kk) this).field_f.field_A.field_j[((kk) this).field_f.field_A.field_f - -var17] = (byte)h.a((int) ((kk) this).field_f.field_A.field_j[((kk) this).field_f.field_A.field_f + var17], (int) ((kk) this).field_i);
                            var17++;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((kk) this).field_f.field_D = ((kk) this).field_f.field_D + var6;
                            ((kk) this).field_f.field_A.field_f = ((kk) this).field_f.field_A.field_f + var6;
                            if (var5 == ((kk) this).field_f.field_A.field_f) {
                                statePc = 83;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if ((((kk) this).field_f.field_D ^ -1) != -513) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((kk) this).field_f.field_D = 0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((kk) this).field_f.a((byte) 57);
                            ((kk) this).field_f.field_u = false;
                            ((kk) this).field_f = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            stackOut_85_0 = 1;
                            stackIn_86_0 = stackOut_85_0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        return stackIn_86_0 != 0;
                    }
                    case 87: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 88;
                        continue stateLoop;
                    }
                    case 88: {
                        try {
                            ((kk) this).field_u.b(-122);
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        ((kk) this).field_b = ((kk) this).field_b + 1;
                        ((kk) this).field_q = -2;
                        ((kk) this).field_u = null;
                        if (0 != ((kk) this).a(param0 + -216)) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (-1 == (((kk) this).a(false) ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        return false;
                    }
                    case 95: {
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

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var8 = Geoblox.field_C;
        if (param1 == null) {
          return false;
        } else {
          L0: {
            var3 = param1.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (12 < var3) {
                break L0;
              } else {
                var4 = oe.a(param1, param2 ^ 122);
                if (var4 == null) {
                  return false;
                } else {
                  if (var4.length() >= 1) {
                    L1: {
                      if (gg.a((byte) -62, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (gg.a((byte) -98, var4.charAt(-1 + var4.length()))) {
                          break L1;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L2: while (true) {
                            if (var6 >= param1.length()) {
                              if (param2 == 118) {
                                L3: {
                                  if ((var5 ^ -1) < -1) {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    break L3;
                                  } else {
                                    stackOut_29_0 = 1;
                                    stackIn_31_0 = stackOut_29_0;
                                    break L3;
                                  }
                                }
                                return stackIn_31_0 != 0;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = param1.charAt(var6);
                                if (!gg.a((byte) -93, (char) var7)) {
                                  var5 = 0;
                                  break L4;
                                } else {
                                  var5++;
                                  break L4;
                                }
                              }
                              if (var5 >= 2) {
                                if (!param0) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final static rh a(int param0, byte param1) {
        if (param1 != -62) {
            kk.i(118);
        }
        return am.a(param1 + -10, param0, false, 1, true, false);
    }

    public kk() {
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            sd var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Geoblox.field_C;
                        if (null == ((kk) this).field_u) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((kk) this).field_u.b(-120);
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
                        ((kk) this).field_u = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((kk) this).field_u = (ba) param0;
                        this.b((byte) -113);
                        this.a(param1, param2);
                        ((kk) this).field_j.field_f = 0;
                        ((kk) this).field_f = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref2 = (sd) (Object) ((kk) this).field_e.a(true);
                        if (var4_ref2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((kk) this).field_g.a(-74, (rc) (Object) var4_ref2);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        if (!param1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        field_t = 110;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (sd) (Object) ((kk) this).field_c.a(true);
                        if (var4_ref2 != null) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((kk) this).field_p.a(116, (rc) (Object) var4_ref2);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 != (((kk) this).field_i ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((kk) this).field_m.field_f = 0;
                            ((kk) this).field_m.d((byte) -62, 4);
                            ((kk) this).field_m.d((byte) 122, (int) ((kk) this).field_i);
                            ((kk) this).field_m.c((byte) 95, 0);
                            ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
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
                            ((kk) this).field_u.b(-126);
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
                        ((kk) this).field_q = -2;
                        ((kk) this).field_b = ((kk) this).field_b + 1;
                        ((kk) this).field_u = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((kk) this).field_o = 0;
                        ((kk) this).field_k = oa.a(-12520);
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

    final void h(int param0) {
        if (param0 > -50) {
            field_w = null;
        }
        if (!(((kk) this).field_u == null)) {
            ((kk) this).field_u.b(-123);
        }
    }

    private final void b(byte param0) {
        try {
            IOException var2 = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((kk) this).field_u != null) {
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
                            ((kk) this).field_m.field_f = 0;
                            ((kk) this).field_m.d((byte) 126, 6);
                            ((kk) this).field_m.b(-12, 3);
                            ((kk) this).field_m.e(0, 28695);
                            ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                            if (param0 <= -56) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            rh discarded$2 = kk.a(-8, (byte) 62);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((kk) this).field_u.b(-121);
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
                        ((kk) this).field_u = null;
                        ((kk) this).field_q = -2;
                        ((kk) this).field_b = ((kk) this).field_b + 1;
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
            ((kk) this).field_u.b(param0 ^ -106);
        } catch (Exception exception) {
        }
        if (param0 != 20) {
            return;
        }
        ((kk) this).field_b = ((kk) this).field_b + 1;
        ((kk) this).field_q = -1;
        ((kk) this).field_u = null;
        ((kk) this).field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            Exception var4 = null;
            qc stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            qc stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            qc stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            qc stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            qc stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            qc stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((kk) this).field_u) {
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
                            ((kk) this).field_m.field_f = 0;
                            stackOut_3_0 = ((kk) this).field_m;
                            stackOut_3_1 = 124;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (param1) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (qc) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_6_2 = stackOut_4_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (qc) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((qc) (Object) stackIn_6_0).d((byte) stackIn_6_1, stackIn_6_2);
                            ((kk) this).field_m.a((byte) -127, 0L);
                            ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                            if (!param0) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a(false, false);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((kk) this).field_u.b(-126);
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
                        ((kk) this).field_u = null;
                        ((kk) this).field_q = -2;
                        ((kk) this).field_b = ((kk) this).field_b + 1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new lh();
        field_v = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new int[]{1, 2, 5, 3, 3, 5, 5, 5, 1, 1, 1, 2, 2, 2, 3, 10, 3};
    }
}
