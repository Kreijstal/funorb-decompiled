/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb extends bi {
    static int field_s;
    static ff field_t;
    private bh field_x;
    static int field_v;
    static String field_r;
    static ut[] field_q;
    static nu field_w;
    static String field_u;

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ui var2_ref = null;
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
            ui var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_46_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_81_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_80_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Kickabout.field_G;
                        if (null == ((tb) this).field_x) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = nj.a(-70);
                        var4 = (int)(-((tb) this).field_p + var2_long);
                        ((tb) this).field_p = var2_long;
                        if (-201 <= (var4 ^ -1)) {
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
                        ((tb) this).field_f = ((tb) this).field_f + var4;
                        if (((tb) this).field_f > 30000) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((tb) this).field_x.a(1);
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
                        ((tb) this).field_x = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((tb) this).field_x) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (0 != ((tb) this).e(0)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 == ((tb) this).b(-21)) {
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
                            ((tb) this).field_x.b((byte) -113);
                            var2_ref = (ui) (Object) ((tb) this).field_h.a(-116);
                            var3_int = -71 % ((param0 - 30) / 37);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((tb) this).field_d.field_n = 0;
                            ((tb) this).field_d.a(107, 1);
                            ((tb) this).field_d.b((byte) 83, var2_ref.field_l);
                            ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                            ((tb) this).field_b.a(127, (am) (Object) var2_ref);
                            var2_ref = (ui) (Object) ((tb) this).field_h.b(0);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var2_ref = (ui) (Object) ((tb) this).field_c.a(-117);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((tb) this).field_d.field_n = 0;
                            ((tb) this).field_d.a(116, 0);
                            ((tb) this).field_d.b((byte) 18, var2_ref.field_l);
                            ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                            ((tb) this).field_j.a(127, (am) (Object) var2_ref);
                            var2_ref = (ui) (Object) ((tb) this).field_c.b(0);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 80;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_int = ((tb) this).field_x.a((byte) 63);
                            if (var3_int < 0) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var3_int != 0) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((tb) this).field_f = 0;
                            var4 = 0;
                            if (null != ((tb) this).field_k) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var4 = 10;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (0 != ((tb) this).field_k.field_u) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 67;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var5 = -((tb) this).field_n.field_n + var4;
                            if (var3_int >= var5) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ((tb) this).field_x.a(((tb) this).field_n.field_f, var5, ((tb) this).field_n.field_n, -4847);
                            if (-1 == (((tb) this).field_g ^ -1)) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var6 = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var6 >= var5) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((tb) this).field_n.field_f[((tb) this).field_n.field_n - -var6] = (byte)ek.b((int) ((tb) this).field_n.field_f[((tb) this).field_n.field_n + var6], (int) ((tb) this).field_g);
                            var6++;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((tb) this).field_n.field_n = ((tb) this).field_n.field_n + var5;
                            if (((tb) this).field_n.field_n >= var4) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (((tb) this).field_k == null) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((tb) this).field_n.field_n = 0;
                            var6 = ((tb) this).field_n.h((byte) -128);
                            var7 = ((tb) this).field_n.k(4);
                            var8 = ((tb) this).field_n.h((byte) -117);
                            var9 = ((tb) this).field_n.k(4);
                            var10 = var8 & 127;
                            if ((128 & var8) == 0) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 82;
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
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var11 = stackIn_46_0;
                            var12 = ((long)var6 << -753062048) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 52;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var14_ref = (ui) (Object) ((tb) this).field_b.a(-115);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var14_ref == null) {
                                statePc = 56;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_l ^ -1L)) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (ui) (Object) ((tb) this).field_b.b(0);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var14_ref = (ui) (Object) ((tb) this).field_j.a(-127);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var14_ref == null) {
                                statePc = 56;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if ((var12 ^ -1L) == (var14_ref.field_l ^ -1L)) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (ui) (Object) ((tb) this).field_j.b(0);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var14_ref != null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (-1 != (var10 ^ -1)) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 82;
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
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var15 = stackIn_61_0;
                            ((tb) this).field_k = var14_ref;
                            ((tb) this).field_k.field_v = new iw(var15 + var9 + ((tb) this).field_k.field_x);
                            ((tb) this).field_k.field_v.a(110, var10);
                            ((tb) this).field_k.field_v.b(-125, var9);
                            ((tb) this).field_k.field_u = 10;
                            ((tb) this).field_n.field_n = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (-1 != ((tb) this).field_k.field_u) {
                                statePc = 66;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (0 == ((tb) this).field_n.field_f[0]) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            ((tb) this).field_k = null;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            ((tb) this).field_k.field_u = 1;
                            ((tb) this).field_n.field_n = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var5 = ((tb) this).field_k.field_v.field_f.length - ((tb) this).field_k.field_x;
                            var6 = -((tb) this).field_k.field_u + 512;
                            if (var5 - ((tb) this).field_k.field_v.field_n >= var6) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var6 = -((tb) this).field_k.field_v.field_n + var5;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 82;
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
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((tb) this).field_x.a(((tb) this).field_k.field_v.field_f, var6, ((tb) this).field_k.field_v.field_n, -4847);
                            if (0 == ((tb) this).field_g) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var6 <= var17) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((tb) this).field_k.field_v.field_f[((tb) this).field_k.field_v.field_n + var17] = (byte)ek.b((int) ((tb) this).field_k.field_v.field_f[((tb) this).field_k.field_v.field_n + var17], (int) ((tb) this).field_g);
                            var17++;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((tb) this).field_k.field_v.field_n = ((tb) this).field_k.field_v.field_n + var6;
                            ((tb) this).field_k.field_u = ((tb) this).field_k.field_u + var6;
                            if (((tb) this).field_k.field_v.field_n == var5) {
                                statePc = 78;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if ((((tb) this).field_k.field_u ^ -1) != -513) {
                                statePc = 79;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((tb) this).field_k.field_u = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((tb) this).field_k.f(50);
                            ((tb) this).field_k.field_p = false;
                            ((tb) this).field_k = null;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var2_int++;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackOut_80_0 = 1;
                            stackIn_81_0 = stackOut_80_0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 82;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        return stackIn_81_0 != 0;
                    }
                    case 82: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 83: {
                        try {
                            ((tb) this).field_x.a(1);
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        ((tb) this).field_o = ((tb) this).field_o + 1;
                        ((tb) this).field_l = -2;
                        ((tb) this).field_x = null;
                        if (((tb) this).e(0) != 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        if (-1 != (((tb) this).b(-21) ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        return true;
                    }
                    case 89: {
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

    final static void a(byte param0, int param1) {
        jb var5 = null;
        int var3 = Kickabout.field_G;
        if (param0 != 126) {
            Object var4 = null;
            tb.a(5, (sj) null);
        }
        if (-29 == (param1 ^ -1)) {
            if (!(su.field_c == null)) {
                su.field_c.e(19910);
            }
            var5 = (jb) (Object) np.field_Jb.g(24009);
            while (var5 != null) {
                var5.c((byte) -109);
                var5 = (jb) (Object) np.field_Jb.c(33);
            }
        }
        np.field_Jb.a((gn) (Object) new i(param1), 3);
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
                        if (null != ((tb) this).field_x) {
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
                            ((tb) this).field_d.field_n = param0;
                            ((tb) this).field_d.a(param0 ^ 122, 6);
                            ((tb) this).field_d.a(3, (byte) 126);
                            ((tb) this).field_d.g(param0 + -1207444472, 0);
                            ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((tb) this).field_x.a(1);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((tb) this).field_o = ((tb) this).field_o + 1;
                        ((tb) this).field_l = -2;
                        ((tb) this).field_x = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
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

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ui var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Kickabout.field_G;
                        if (((tb) this).field_x == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((tb) this).field_x.a(param1 ^ 21);
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
                        ((tb) this).field_x = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((tb) this).field_x = (bh) param0;
                        this.g(0);
                        if (param1 == 20) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        ((tb) this).b((byte) 19);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        this.a(param2, false);
                        ((tb) this).field_k = null;
                        ((tb) this).field_n.field_n = 0;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (ui) (Object) ((tb) this).field_b.b((byte) 105);
                        if (var4_ref2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((tb) this).field_h.a(127, (am) (Object) var4_ref2);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 10: {
                        var4_ref2 = (ui) (Object) ((tb) this).field_j.b((byte) 118);
                        if (var4_ref2 == null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((tb) this).field_c.a(127, (am) (Object) var4_ref2);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 12: {
                        if (((tb) this).field_g == 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((tb) this).field_d.field_n = 0;
                            ((tb) this).field_d.a(123, 4);
                            ((tb) this).field_d.a(103, (int) ((tb) this).field_g);
                            ((tb) this).field_d.b(param1 ^ -50, 0);
                            ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
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
                            ((tb) this).field_x.a(1);
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
                        ((tb) this).field_l = -2;
                        ((tb) this).field_o = ((tb) this).field_o + 1;
                        ((tb) this).field_x = null;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((tb) this).field_f = 0;
                        ((tb) this).field_p = nj.a(-119);
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
            ((tb) this).field_x.a(1);
        } catch (Exception exception) {
        }
        ((tb) this).field_x = null;
        ((tb) this).field_o = ((tb) this).field_o + 1;
        ((tb) this).field_l = -1;
        int var2 = -89 % ((57 - param0) / 33);
        ((tb) this).field_g = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void a(int param0, sj param1) {
        ll.field_n = wa.a((byte) 126, "basic", param1, "display_name_changed");
        ei.field_d = new al(0L, lh.field_D, le.field_a, qt.field_k);
        nq.field_F = new al(0L, lh.field_D, md.field_j, pb.field_D);
        kk.field_R = new hd(0L, (hd) null);
        du.field_f = new hd(0L, dw.field_e);
        du.field_f.field_A = 1;
        pj.field_E = new hd(0L, dn.field_zb, oh.field_h);
        ph.field_f = new hd(0L, pq.field_P, vg.field_Vb);
        hj.field_h = new hd(0L, ul.field_c);
        kk.field_R.a((byte) -109, du.field_f);
        kk.field_R.a((byte) -122, pj.field_E);
        kk.field_R.a((byte) -108, ph.field_f);
        kk.field_R.a((byte) -124, (hd) (Object) ei.field_d);
        kk.field_R.a((byte) -108, hj.field_h);
        ei.field_d.field_Cb.field_zb.a(dw.field_e, (byte) 87);
        if (param0 >= -59) {
            Object var4 = null;
            tb.a(-39, (sj) null);
        }
        ei.field_d.field_Cb.field_zb.field_p = 1;
        hd var6 = ei.field_d.field_Cb.field_zb;
        hd var7 = var6;
        var7.field_A = 1;
        nq.field_F.field_Cb.field_zb.a(dw.field_e, (byte) -128);
        hd var3 = nq.field_F.field_Cb.field_zb;
        nq.field_F.field_Cb.field_zb.field_p = 1;
        var3.field_A = 1;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            iw stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            iw stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            iw stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            iw stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            iw stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            iw stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((tb) this).field_x) {
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
                            ((tb) this).field_d.field_n = 0;
                            stackOut_3_0 = ((tb) this).field_d;
                            stackOut_3_1 = 105;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (param0) {
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
                            stackOut_4_0 = (iw) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
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
                            stackOut_5_0 = (iw) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
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
                            ((iw) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                            ((tb) this).field_d.b((byte) 89, 0L);
                            ((tb) this).field_x.a(((tb) this).field_d.field_f.length, (byte) -127, 0, ((tb) this).field_d.field_f);
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
                            ((tb) this).field_x.a(1);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        ((tb) this).field_l = -2;
                        ((tb) this).field_o = ((tb) this).field_o + 1;
                        ((tb) this).field_x = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (!param1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        this.a(true, true);
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

    public static void c(byte param0) {
        field_t = null;
        field_r = null;
        field_w = null;
        field_q = null;
        field_u = null;
        if (param0 >= -89) {
            Object var2 = null;
            boolean discarded$0 = tb.a((String) null, -77);
        }
    }

    final static boolean a(String param0, int param1) {
        int var2 = -16 % ((param1 - -16) / 36);
        if (!(null != vl.field_e)) {
            return false;
        }
        return (param0.toLowerCase().indexOf(vl.field_e.toLowerCase()) ^ -1) <= -1 ? true : false;
    }

    final void b(byte param0) {
        if (param0 != 109) {
            field_w = null;
        }
        if (((tb) this).field_x != null) {
            ((tb) this).field_x.a(param0 ^ 108);
        }
    }

    public tb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 1;
        field_t = new ff(4, 1, 1, 1);
        field_r = "Names cannot start or end with space or underscore";
        field_u = "Accept invitation to <%0>'s game";
    }
}
