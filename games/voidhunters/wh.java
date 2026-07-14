/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wh extends ona {
    private lpb field_p;
    static kb field_o;
    static int field_n;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            km var2_ref = null;
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
            km var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_85_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = VoidHunters.field_G;
                        if (((wh) this).field_p == null) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = wt.a(false);
                        var4 = (int)(var2_long + -((wh) this).field_h);
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
                        ((wh) this).field_h = var2_long;
                        ((wh) this).field_m = ((wh) this).field_m + var4;
                        if ((((wh) this).field_m ^ -1) >= -30001) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((wh) this).field_p.b(param0 + 1);
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
                        ((wh) this).field_p = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == ((wh) this).field_p) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((wh) this).f(param0 ^ 13223)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((wh) this).b(-3666) == 0) {
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
                            ((wh) this).field_p.a((byte) 115);
                            var2_ref = (km) (Object) ((wh) this).field_a.a((byte) -54);
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
                            ((wh) this).field_e.field_e = 0;
                            ((wh) this).field_e.c(0, 1);
                            ((wh) this).field_e.a(117, var2_ref.field_i);
                            ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
                            ((wh) this).field_d.a((fh) (Object) var2_ref, -84);
                            var2_ref = (km) (Object) ((wh) this).field_a.a(param0 + 1900);
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
                            var2_ref = (km) (Object) ((wh) this).field_c.a((byte) -54);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((wh) this).field_e.field_e = 0;
                            ((wh) this).field_e.c(0, 0);
                            ((wh) this).field_e.a(100, var2_ref.field_i);
                            ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
                            ((wh) this).field_f.a((fh) (Object) var2_ref, -65);
                            var2_ref = (km) (Object) ((wh) this).field_c.a(1900);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_int = param0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 85;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_int = ((wh) this).field_p.c(0);
                            if (0 > var3_int) {
                                statePc = 26;
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
                            statePc = 27;
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
                            if (var3_int == 0) {
                                statePc = 85;
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
                            ((wh) this).field_m = 0;
                            var4 = 0;
                            if (null == ((wh) this).field_b) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (((wh) this).field_b.field_r != 0) {
                                statePc = 32;
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
                            var4 = 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4 = 10;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (0 < var4) {
                                statePc = 49;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var5 = -((wh) this).field_b.field_q + ((wh) this).field_b.field_p.field_h.length;
                            var6 = 512 - ((wh) this).field_b.field_r;
                            if (var6 > var5 + -((wh) this).field_b.field_p.field_e) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = -((wh) this).field_b.field_p.field_e + var5;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = var3_int;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((wh) this).field_p.a(param0 ^ -126, ((wh) this).field_b.field_p.field_e, var6, ((wh) this).field_b.field_p.field_h);
                            if (((wh) this).field_j != 0) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var7 >= var6) {
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
                            ((wh) this).field_b.field_p.field_h[var7 + ((wh) this).field_b.field_p.field_e] = (byte)mgb.a((int) ((wh) this).field_b.field_p.field_h[var7 + ((wh) this).field_b.field_p.field_e], (int) ((wh) this).field_j);
                            var7++;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((wh) this).field_b.field_r = ((wh) this).field_b.field_r + var6;
                            ((wh) this).field_b.field_p.field_e = ((wh) this).field_b.field_p.field_e + var6;
                            if (var5 != ((wh) this).field_b.field_p.field_e) {
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
                            ((wh) this).field_b.d((byte) -35);
                            ((wh) this).field_b.field_n = false;
                            ((wh) this).field_b = null;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((((wh) this).field_b.field_r ^ -1) == -513) {
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
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((wh) this).field_b.field_r = 0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var5 = -((wh) this).field_i.field_e + var4;
                            if (var5 > var3_int) {
                                statePc = 51;
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
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = var3_int;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((wh) this).field_p.a(-122, ((wh) this).field_i.field_e, var5, ((wh) this).field_i.field_h);
                            if (0 == ((wh) this).field_j) {
                                statePc = 56;
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
                            var6 = 0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var6 >= var5) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((wh) this).field_i.field_h[((wh) this).field_i.field_e + var6] = (byte)mgb.a((int) ((wh) this).field_i.field_h[((wh) this).field_i.field_e + var6], (int) ((wh) this).field_j);
                            var6++;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((wh) this).field_i.field_e = ((wh) this).field_i.field_e + var5;
                            if (var4 <= ((wh) this).field_i.field_e) {
                                statePc = 58;
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
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((wh) this).field_b != null) {
                                statePc = 79;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((wh) this).field_i.field_e = 0;
                            var6 = ((wh) this).field_i.e((byte) -126);
                            var7 = ((wh) this).field_i.h(125);
                            var8 = ((wh) this).field_i.e((byte) -125);
                            var9 = ((wh) this).field_i.h(24);
                            var10 = var8 & 127;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 87;
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
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var11 = stackIn_62_0;
                            var12 = (long)var7 + ((long)var6 << 2030684384);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (km) (Object) ((wh) this).field_f.a((byte) -54);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref.field_i != var12) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14_ref = (km) (Object) ((wh) this).field_f.a(1900);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (km) (Object) ((wh) this).field_d.a((byte) -54);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 87;
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
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var14_ref.field_i ^ -1L) != (var12 ^ -1L)) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var14_ref = (km) (Object) ((wh) this).field_d.a(1900);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var14_ref != null) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var10 != 0) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackOut_76_0 = 5;
                            stackIn_78_0 = stackOut_76_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackOut_77_0 = 9;
                            stackIn_78_0 = stackOut_77_0;
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
                            var15 = stackIn_78_0;
                            ((wh) this).field_b = var14_ref;
                            ((wh) this).field_b.field_p = new ds(((wh) this).field_b.field_q + var9 + var15);
                            ((wh) this).field_b.field_p.c(0, var10);
                            ((wh) this).field_b.field_p.d(var9, param0 + 332614536);
                            ((wh) this).field_i.field_e = 0;
                            ((wh) this).field_b.field_r = 10;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (0 != ((wh) this).field_b.field_r) {
                                statePc = 83;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (((wh) this).field_i.field_h[0] != -1) {
                                statePc = 82;
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
                            ((wh) this).field_i.field_e = 0;
                            ((wh) this).field_b.field_r = 1;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((wh) this).field_b = null;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var2_int++;
                            statePc = 23;
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
                            ((wh) this).field_p.b(1);
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
                        ((wh) this).field_g = ((wh) this).field_g + 1;
                        ((wh) this).field_p = null;
                        ((wh) this).field_k = -2;
                        if (-1 != ((wh) this).f(13223)) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        if (-1 == ((wh) this).b(param0 + -3666)) {
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

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ds stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ds stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ds stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            ds stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            ds stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            ds stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == -65) {
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
                        if (((wh) this).field_p != null) {
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
                            ((wh) this).field_e.field_e = 0;
                            stackOut_4_0 = ((wh) this).field_e;
                            stackOut_4_1 = 0;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
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
                            stackOut_5_0 = (ds) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 3;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
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
                            stackOut_6_0 = (ds) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 2;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
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
                            ((ds) (Object) stackIn_7_0).c(stackIn_7_1, stackIn_7_2);
                            ((wh) this).field_e.a(param0 ^ -50, 0L);
                            ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
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
                            ((wh) this).field_p.b(1);
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
                        ((wh) this).field_k = -2;
                        ((wh) this).field_g = ((wh) this).field_g + 1;
                        ((wh) this).field_p = null;
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

    public static void h(int param0) {
        field_o = null;
        if (param0 != 0) {
            boolean discarded$0 = wh.g(-53);
        }
    }

    private final void i(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((wh) this).field_p == null) {
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
                            ((wh) this).field_e.field_e = 0;
                            ((wh) this).field_e.c(0, 6);
                            ((wh) this).field_e.a(3, (byte) 125);
                            ((wh) this).field_e.a(0, true);
                            ((wh) this).field_p.a(param0 ^ param0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
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
                            ((wh) this).field_p.b(1);
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
                        ((wh) this).field_g = ((wh) this).field_g + 1;
                        ((wh) this).field_p = null;
                        ((wh) this).field_k = -2;
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

    public wh() {
    }

    final void a(byte param0) {
        try {
            ((wh) this).field_p.b(1);
        } catch (Exception exception) {
        }
        ((wh) this).field_g = ((wh) this).field_g + 1;
        ((wh) this).field_p = null;
        ((wh) this).field_k = -1;
        if (param0 != -25) {
            field_o = null;
        }
        ((wh) this).field_j = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static boolean g(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -113) {
            break L0;
          } else {
            boolean discarded$2 = wh.a(-4, (byte) 35, 31);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ov.field_o) {
              break L2;
            } else {
              if (sp.field_o != tc.field_c) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 >= 90) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((2048 & param2) == 0) {
              break L2;
            } else {
              if (0 == (55 & param0)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0) {
        if (param0 <= 105) {
            field_n = 115;
        }
        if (!(null == ((wh) this).field_p)) {
            ((wh) this).field_p.b(1);
        }
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            km var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = VoidHunters.field_G;
                        if (null != ((wh) this).field_p) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((wh) this).field_p.b(1);
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
                        ((wh) this).field_p = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((wh) this).field_p = (lpb) param0;
                        this.i(7571);
                        this.a((byte) -65, param1);
                        ((wh) this).field_b = null;
                        ((wh) this).field_i.field_e = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref2 = (km) (Object) ((wh) this).field_d.b((byte) 87);
                        if (var4_ref2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((wh) this).field_a.a((fh) (Object) var4_ref2, -116);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (km) (Object) ((wh) this).field_f.b((byte) 109);
                        if (var4_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((wh) this).field_c.a((fh) (Object) var4_ref2, -86);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((wh) this).field_j) {
                            statePc = 13;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((wh) this).field_e.field_e = 0;
                            ((wh) this).field_e.c(0, 4);
                            ((wh) this).field_e.c(0, (int) ((wh) this).field_j);
                            ((wh) this).field_e.d(0, 332614536);
                            ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
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
                            ((wh) this).field_p.b(1);
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
                        ((wh) this).field_p = null;
                        ((wh) this).field_g = ((wh) this).field_g + 1;
                        ((wh) this).field_k = -2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((wh) this).field_m = 0;
                        if (!param2) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        wh.h(-98);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((wh) this).field_h = wt.a(param2);
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
        field_o = new kb(2);
        field_n = 0;
    }
}
