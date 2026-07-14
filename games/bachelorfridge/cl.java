/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cl extends vm {
    static boolean[] field_p;
    private pj field_q;
    static String field_o;

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            qfa var2_ref = null;
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
            qfa var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_63_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_87_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_86_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = BachelorFridge.field_y;
                        if (null != ((cl) this).field_q) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = f.b((byte) 73);
                        var4 = (int)(-((cl) this).field_b + var2_long);
                        ((cl) this).field_b = var2_long;
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
                        ((cl) this).field_j = ((cl) this).field_j + var4;
                        if (30000 < ((cl) this).field_j) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((cl) this).field_q.a((byte) 109);
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
                        ((cl) this).field_q = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != ((cl) this).field_q) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (-1 != (((cl) this).d((byte) 0) ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (((cl) this).a(-117) == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 17: {
                        try {
                            ((cl) this).field_q.c((byte) 34);
                            var2_ref = (qfa) (Object) ((cl) this).field_f.a(-102);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((cl) this).field_n.field_g = 0;
                            ((cl) this).field_n.d(1, 0);
                            ((cl) this).field_n.a(4096, var2_ref.field_h);
                            ((cl) this).field_q.a(0, ((cl) this).field_n.field_h, false, ((cl) this).field_n.field_h.length);
                            ((cl) this).field_a.a((eo) (Object) var2_ref, (byte) -64);
                            var2_ref = (qfa) (Object) ((cl) this).field_f.a((byte) 108);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param0 == 69) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            field_p = null;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref = (qfa) (Object) ((cl) this).field_c.a(-78);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((cl) this).field_n.field_g = 0;
                            ((cl) this).field_n.d(0, 0);
                            ((cl) this).field_n.a(param0 + 4027, var2_ref.field_h);
                            ((cl) this).field_q.a(0, ((cl) this).field_n.field_h, false, ((cl) this).field_n.field_h.length);
                            ((cl) this).field_l.a((eo) (Object) var2_ref, (byte) 90);
                            var2_ref = (qfa) (Object) ((cl) this).field_c.a((byte) 94);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var2_int ^ -1) <= -101) {
                                statePc = 86;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var3_int = ((cl) this).field_q.b(-90);
                            if ((var3_int ^ -1) > -1) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (0 == var3_int) {
                                statePc = 86;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((cl) this).field_j = 0;
                            var4 = 0;
                            if (((cl) this).field_h == null) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-1 != (((cl) this).field_h.field_u ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 88;
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
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (0 < var4) {
                                statePc = 50;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var5 = ((cl) this).field_h.field_v.field_h.length - ((cl) this).field_h.field_s;
                            var6 = 512 - ((cl) this).field_h.field_u;
                            if (-((cl) this).field_h.field_v.field_g + var5 < var6) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = var5 - ((cl) this).field_h.field_v.field_g;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((cl) this).field_q.a(((cl) this).field_h.field_v.field_g, (byte) 106, ((cl) this).field_h.field_v.field_h, var6);
                            if (-1 != (((cl) this).field_m ^ -1)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 88;
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
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((cl) this).field_h.field_v.field_h[var7 + ((cl) this).field_h.field_v.field_g] = (byte)lt.a((int) ((cl) this).field_h.field_v.field_h[var7 + ((cl) this).field_h.field_v.field_g], (int) ((cl) this).field_m);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((cl) this).field_h.field_v.field_g = ((cl) this).field_h.field_v.field_g + var6;
                            ((cl) this).field_h.field_u = ((cl) this).field_h.field_u + var6;
                            if (var5 == ((cl) this).field_h.field_v.field_g) {
                                statePc = 49;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (((cl) this).field_h.field_u != 512) {
                                statePc = 85;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((cl) this).field_h.field_u = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((cl) this).field_h.b(0);
                            ((cl) this).field_h.field_n = false;
                            ((cl) this).field_h = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var5 = var4 + -((cl) this).field_d.field_g;
                            if (var5 <= var3_int) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((cl) this).field_q.a(((cl) this).field_d.field_g, (byte) 108, ((cl) this).field_d.field_h, var5);
                            if (0 != ((cl) this).field_m) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var6 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var6 >= var5) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((cl) this).field_d.field_h[var6 + ((cl) this).field_d.field_g] = (byte)lt.a((int) ((cl) this).field_d.field_h[var6 + ((cl) this).field_d.field_g], (int) ((cl) this).field_m);
                            var6++;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((cl) this).field_d.field_g = ((cl) this).field_d.field_g + var5;
                            if (var4 > ((cl) this).field_d.field_g) {
                                statePc = 85;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((cl) this).field_h == null) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((cl) this).field_d.field_g = 0;
                            var6 = ((cl) this).field_d.b(16711935);
                            var7 = ((cl) this).field_d.f(106);
                            var8 = ((cl) this).field_d.b(16711935);
                            var9 = ((cl) this).field_d.f(-127);
                            var10 = var8 & 127;
                            if ((var8 & 128) == 0) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 88;
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
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var11 = stackIn_63_0;
                            var12 = ((long)var6 << 438175072) + (long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 69;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (qfa) (Object) ((cl) this).field_a.a(param0 + -163);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var14_ref.field_h != var12) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (qfa) (Object) ((cl) this).field_a.a((byte) 120);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var14_ref = (qfa) (Object) ((cl) this).field_l.a(-101);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var14_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if ((var14_ref.field_h ^ -1L) == (var12 ^ -1L)) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var14_ref = (qfa) (Object) ((cl) this).field_l.a((byte) 103);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((cl) this).field_h = var14_ref;
                            if (var10 == 0) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 88;
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
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var15 = stackIn_79_0;
                            ((cl) this).field_h.field_v = new lu(var15 + var9 + ((cl) this).field_h.field_s);
                            ((cl) this).field_h.field_v.d(var10, 0);
                            ((cl) this).field_h.field_v.e(var9, -1615464796);
                            ((cl) this).field_h.field_u = 10;
                            ((cl) this).field_d.field_g = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (((cl) this).field_h.field_u != -1) {
                                statePc = 84;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (0 != ((cl) this).field_d.field_h[0]) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((cl) this).field_h.field_u = 1;
                            ((cl) this).field_d.field_g = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((cl) this).field_h = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_int++;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            stackOut_86_0 = 1;
                            stackIn_87_0 = stackOut_86_0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        return stackIn_87_0 != 0;
                    }
                    case 88: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        try {
                            ((cl) this).field_q.a((byte) 56);
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        ((cl) this).field_e = ((cl) this).field_e + 1;
                        ((cl) this).field_k = -2;
                        ((cl) this).field_q = null;
                        if (((cl) this).d((byte) 0) != 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        if (((cl) this).a(-116) == 0) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        return false;
                    }
                    case 96: {
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

    final void c(int param0) {
        if (null != ((cl) this).field_q) {
            ((cl) this).field_q.a((byte) 122);
        }
        if (param0 != 20) {
            int discarded$0 = cl.a(80, (byte) 57, -71);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            qfa var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = BachelorFridge.field_y;
                        if (((cl) this).field_q != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((cl) this).field_q.a((byte) 110);
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
                        ((cl) this).field_q = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((cl) this).field_q = (pj) param1;
                        this.d(param2 ^ 16074);
                        this.a(125, param0);
                        ((cl) this).field_h = null;
                        if (param2 == 16008) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((cl) this).c(-28);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((cl) this).field_d.field_g = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (qfa) (Object) ((cl) this).field_a.a(true);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((cl) this).field_f.a((eo) (Object) var4_ref2, (byte) -126);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (qfa) (Object) ((cl) this).field_l.a(true);
                        if (var4_ref2 != null) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ((cl) this).field_c.a((eo) (Object) var4_ref2, (byte) -58);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        if (((cl) this).field_m != 0) {
                            statePc = 17;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((cl) this).field_n.field_g = 0;
                            ((cl) this).field_n.d(4, 0);
                            ((cl) this).field_n.d((int) ((cl) this).field_m, 0);
                            ((cl) this).field_n.e(0, param2 ^ -1615476692);
                            ((cl) this).field_q.a(0, ((cl) this).field_n.field_h, false, ((cl) this).field_n.field_h.length);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        try {
                            ((cl) this).field_q.a((byte) 52);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((cl) this).field_e = ((cl) this).field_e + 1;
                        ((cl) this).field_q = null;
                        ((cl) this).field_k = -2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        ((cl) this).field_j = 0;
                        ((cl) this).field_b = f.b((byte) 73);
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

    private final void d(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((cl) this).field_q != null) {
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
                            ((cl) this).field_n.field_g = 0;
                            ((cl) this).field_n.d(6, 0);
                            ((cl) this).field_n.c(-1607631824, 3);
                            ((cl) this).field_n.b(0, -124);
                            ((cl) this).field_q.a(0, ((cl) this).field_n.field_h, false, ((cl) this).field_n.field_h.length);
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
                            ((cl) this).field_q.a((byte) 83);
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
                        ((cl) this).field_k = -2;
                        ((cl) this).field_e = ((cl) this).field_e + 1;
                        ((cl) this).field_q = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param0 >= 23) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((cl) this).field_q = null;
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

    final void b(byte param0) {
        int var2 = -102 / ((param0 - -18) / 48);
        try {
            ((cl) this).field_q.a((byte) 76);
        } catch (Exception exception) {
        }
        ((cl) this).field_e = ((cl) this).field_e + 1;
        ((cl) this).field_k = -1;
        ((cl) this).field_q = null;
        ((cl) this).field_m = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    public cl() {
    }

    final static int a(int param0, byte param1, int param2) {
        String var3 = lka.field_E[param2][param0];
        String var3_ref = var3.trim();
        var3_ref = var3_ref.toLowerCase();
        if (param1 < 86) {
            return -113;
        }
        if (!(!var3_ref.equals((Object) (Object) "random"))) {
            return -1;
        }
        return ((ji) (Object) du.field_a.a(true, (long)var3_ref.hashCode())).field_h;
    }

    public static void b(boolean param0) {
        field_p = null;
        if (param0) {
            field_p = null;
        }
        field_o = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            int var3 = 0;
            Exception var4 = null;
            lu stackIn_4_0 = null;
            lu stackIn_5_0 = null;
            lu stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            lu stackOut_3_0 = null;
            lu stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            lu stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((cl) this).field_q) {
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
                            ((cl) this).field_n.field_g = 0;
                            stackOut_3_0 = ((cl) this).field_n;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            if (param1) {
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
                            stackOut_4_0 = (lu) (Object) stackIn_4_0;
                            stackOut_4_1 = 3;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
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
                            stackOut_5_0 = (lu) (Object) stackIn_5_0;
                            stackOut_5_1 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
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
                            ((lu) (Object) stackIn_6_0).d(stackIn_6_1, 0);
                            ((cl) this).field_n.a(4096, 0L);
                            ((cl) this).field_q.a(0, ((cl) this).field_n.field_h, false, ((cl) this).field_n.field_h.length);
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
                            ((cl) this).field_q.a((byte) 123);
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
                        ((cl) this).field_q = null;
                        ((cl) this).field_k = -2;
                        ((cl) this).field_e = ((cl) this).field_e + 1;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        var3 = 81 % ((61 - param0) / 49);
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

    final static kv[] a(kv[] param0, boolean param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param1) {
            return null;
        }
        kv[] var5 = new kv[param0.length];
        kv[] var2 = var5;
        for (var3 = 0; var3 < param0.length; var3++) {
            var5[var3] = new kv(param0[var3].field_n >> -689302431, param0[var3].field_o >> -254097343);
            var5[var3].b();
            param0[var3].f(0, 0);
        }
        hga.field_U.a((byte) 6);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[64];
        field_o = "This game has been updated! Please reload this page.";
    }
}
