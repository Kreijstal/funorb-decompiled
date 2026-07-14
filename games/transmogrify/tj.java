/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tj extends uh {
    static int[] field_w;
    private gj field_x;
    static String field_t;
    static String field_A;
    static int field_u;
    static ti field_s;
    static String field_z;
    static int field_y;
    static String field_v;

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            pj var2_ref = null;
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
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_18_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_88_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Transmogrify.field_A ? 1 : 0;
                        if (null == ((tj) this).field_x) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = lk.a(0);
                        var4 = (int)(-((tj) this).field_l + var2_long);
                        ((tj) this).field_l = var2_long;
                        if (200 < var4) {
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
                        ((tj) this).field_b = ((tj) this).field_b + var4;
                        if (((tj) this).field_b <= 30000) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((tj) this).field_x.a(true);
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
                        ((tj) this).field_x = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == ((tj) this).field_x) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 != ((tj) this).a((byte) -68)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((tj) this).e(-10236) == 0) {
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
                            ((tj) this).field_x.d(-60);
                            if (param0 > 115) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            var2_ref = (pj) (Object) ((tj) this).field_c.b((byte) 125);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((tj) this).field_i.field_h = 0;
                            ((tj) this).field_i.f(6389, 1);
                            ((tj) this).field_i.a(var2_ref.field_j, true);
                            ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                            ((tj) this).field_h.a((byte) -128, (ri) (Object) var2_ref);
                            var2_ref = (pj) (Object) ((tj) this).field_c.a(97);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_ref = (pj) (Object) ((tj) this).field_a.b((byte) 114);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((tj) this).field_i.field_h = 0;
                            ((tj) this).field_i.f(6389, 0);
                            ((tj) this).field_i.a(var2_ref.field_j, true);
                            ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                            ((tj) this).field_n.a((byte) -128, (ri) (Object) var2_ref);
                            var2_ref = (pj) (Object) ((tj) this).field_a.a(104);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 88;
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
                            var3_int = ((tj) this).field_x.a((byte) -119);
                            if (0 > var3_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (0 != var3_int) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((tj) this).field_b = 0;
                            var4 = 0;
                            if (((tj) this).field_e != null) {
                                statePc = 34;
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
                            var4 = 10;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-1 != (((tj) this).field_e.field_C ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var4 = 1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var4 > 0) {
                                statePc = 51;
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
                            var5 = -((tj) this).field_e.field_z + ((tj) this).field_e.field_B.field_g.length;
                            var6 = -((tj) this).field_e.field_C + 512;
                            if (var5 - ((tj) this).field_e.field_B.field_h >= var6) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = var5 + -((tj) this).field_e.field_B.field_h;
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
                            if (var6 <= var3_int) {
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
                            var6 = var3_int;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((tj) this).field_x.a(((tj) this).field_e.field_B.field_h, var6, ((tj) this).field_e.field_B.field_g, 5768);
                            if (((tj) this).field_m != 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var7 >= var6) {
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
                            ((tj) this).field_e.field_B.field_g[var7 + ((tj) this).field_e.field_B.field_h] = (byte)ak.a((int) ((tj) this).field_e.field_B.field_g[var7 + ((tj) this).field_e.field_B.field_h], (int) ((tj) this).field_m);
                            var7++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((tj) this).field_e.field_B.field_h = ((tj) this).field_e.field_B.field_h + var6;
                            ((tj) this).field_e.field_C = ((tj) this).field_e.field_C + var6;
                            if (((tj) this).field_e.field_B.field_h != var5) {
                                statePc = 48;
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
                            ((tj) this).field_e.b((byte) -79);
                            ((tj) this).field_e.field_m = false;
                            ((tj) this).field_e = null;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-513 == (((tj) this).field_e.field_C ^ -1)) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((tj) this).field_e.field_C = 0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = -((tj) this).field_g.field_h + var4;
                            if (var5 > var3_int) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((tj) this).field_x.a(((tj) this).field_g.field_h, var5, ((tj) this).field_g.field_g, 5768);
                            if (((tj) this).field_m != 0) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var6 = 0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var5 <= var6) {
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
                            ((tj) this).field_g.field_g[var6 + ((tj) this).field_g.field_h] = (byte)ak.a((int) ((tj) this).field_g.field_g[var6 + ((tj) this).field_g.field_h], (int) ((tj) this).field_m);
                            var6++;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((tj) this).field_g.field_h = ((tj) this).field_g.field_h + var5;
                            if (var4 > ((tj) this).field_g.field_h) {
                                statePc = 87;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((tj) this).field_e == null) {
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
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((tj) this).field_g.field_h = 0;
                            var6 = ((tj) this).field_g.d((byte) 56);
                            var7 = ((tj) this).field_g.c((byte) -125);
                            var8 = ((tj) this).field_g.d((byte) 90);
                            var9 = ((tj) this).field_g.c((byte) -104);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var11 = stackIn_65_0;
                            var12 = ((long)var6 << 1160970720) - -(long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14_ref = (pj) (Object) ((tj) this).field_n.b((byte) 127);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14_ref == null) {
                                statePc = 76;
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
                            if ((var12 ^ -1L) != (var14_ref.field_j ^ -1L)) {
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
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (pj) (Object) ((tj) this).field_n.a(83);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var14_ref = (pj) (Object) ((tj) this).field_h.b((byte) 124);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var14_ref == null) {
                                statePc = 76;
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
                            if (var12 != var14_ref.field_j) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var14_ref = (pj) (Object) ((tj) this).field_h.a(119);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var14_ref != null) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((tj) this).field_e = var14_ref;
                            if (var10 == 0) {
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
                            stackOut_79_0 = 9;
                            stackIn_81_0 = stackOut_79_0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackOut_80_0 = 5;
                            stackIn_81_0 = stackOut_80_0;
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
                            var15 = stackIn_81_0;
                            ((tj) this).field_e.field_B = new oa(var15 + (var9 + ((tj) this).field_e.field_z));
                            ((tj) this).field_e.field_B.f(6389, var10);
                            ((tj) this).field_e.field_B.a(-112, var9);
                            ((tj) this).field_g.field_h = 0;
                            ((tj) this).field_e.field_C = 10;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (0 != ((tj) this).field_e.field_C) {
                                statePc = 86;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if ((((tj) this).field_g.field_g[0] ^ -1) == 0) {
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
                            ((tj) this).field_e = null;
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
                            ((tj) this).field_g.field_h = 0;
                            ((tj) this).field_e.field_C = 1;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_int++;
                            statePc = 26;
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
                            ((tj) this).field_x.a(true);
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
                        ((tj) this).field_p = ((tj) this).field_p + 1;
                        ((tj) this).field_k = -2;
                        ((tj) this).field_x = null;
                        if (((tj) this).a((byte) 87) != 0) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        if (((tj) this).e(-10236) == 0) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    }
                    case 97: {
                        return false;
                    }
                    case 98: {
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

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            pj var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Transmogrify.field_A ? 1 : 0;
                        if (((tj) this).field_x != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((tj) this).field_x.a(true);
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
                        ((tj) this).field_x = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((tj) this).field_x = (gj) param1;
                        this.a(false);
                        this.a(3, param0);
                        ((tj) this).field_e = null;
                        if (param2 == 20) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        ((tj) this).field_g.field_h = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (pj) (Object) ((tj) this).field_h.d(-31914);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((tj) this).field_c.a((byte) -128, (ri) (Object) var4_ref2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (pj) (Object) ((tj) this).field_n.d(param2 + -31934);
                        if (var4_ref2 != null) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ((tj) this).field_a.a((byte) -128, (ri) (Object) var4_ref2);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        if (((tj) this).field_m != 0) {
                            statePc = 17;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((tj) this).field_i.field_h = 0;
                            ((tj) this).field_i.f(6389, 4);
                            ((tj) this).field_i.f(6389, (int) ((tj) this).field_m);
                            ((tj) this).field_i.a(-122, 0);
                            ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
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
                            ((tj) this).field_x.a(true);
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
                        ((tj) this).field_p = ((tj) this).field_p + 1;
                        ((tj) this).field_k = -2;
                        ((tj) this).field_x = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        ((tj) this).field_b = 0;
                        ((tj) this).field_l = lk.a(param2 + -20);
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

    final void d(int param0) {
        try {
            ((tj) this).field_x.a(true);
            int var2_int = 19 % ((81 - param0) / 34);
        } catch (Exception exception) {
        }
        ((tj) this).field_k = -1;
        ((tj) this).field_x = null;
        ((tj) this).field_p = ((tj) this).field_p + 1;
        ((tj) this).field_m = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            oa stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            oa stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            oa stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            oa stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            oa stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            oa stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((tj) this).field_x != null) {
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
                            if (param0 == 3) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.a(-2, false);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((tj) this).field_i.field_h = 0;
                            stackOut_4_0 = ((tj) this).field_i;
                            stackOut_4_1 = 6389;
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
                            stackOut_5_0 = (oa) (Object) stackIn_5_0;
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
                            stackOut_6_0 = (oa) (Object) stackIn_6_0;
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
                            ((oa) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                            ((tj) this).field_i.a(0L, true);
                            ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
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
                            ((tj) this).field_x.a(true);
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
                        ((tj) this).field_p = ((tj) this).field_p + 1;
                        ((tj) this).field_k = -2;
                        ((tj) this).field_x = null;
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

    private final void a(boolean param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            gj stackIn_9_0 = null;
            gj stackIn_10_0 = null;
            gj stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            gj stackOut_8_0 = null;
            gj stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            gj stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ((tj) this).a(-105);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (((tj) this).field_x == null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            ((tj) this).field_i.field_h = 0;
                            ((tj) this).field_i.f(6389, 6);
                            ((tj) this).field_i.i(3, 45);
                            ((tj) this).field_i.c(0, -159688920);
                            ((tj) this).field_x.a((byte) 9, ((tj) this).field_i.field_g, ((tj) this).field_i.field_g.length, 0);
                            statePc = 15;
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
                            stackOut_8_0 = ((tj) this).field_x;
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
                            stackOut_9_0 = (gj) (Object) stackIn_9_0;
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
                            stackOut_10_0 = (gj) (Object) stackIn_10_0;
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
                            ((gj) (Object) stackIn_11_0).a(stackIn_11_1 != 0);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        ((tj) this).field_x = null;
                        ((tj) this).field_p = ((tj) this).field_p + 1;
                        ((tj) this).field_k = -2;
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

    final void a(int param0) {
        if (!(null == ((tj) this).field_x)) {
            ((tj) this).field_x.a(true);
        }
        if (param0 != -2025316960) {
            field_A = null;
        }
    }

    public tj() {
    }

    public static void d(byte param0) {
        field_z = null;
        field_w = null;
        field_v = null;
        int var1 = 109 % ((49 - param0) / 45);
        field_t = null;
        field_A = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = "Create a free account to start using this feature";
        field_z = "Submit for ";
        field_A = "Please enter your age in years";
        field_v = null;
    }
}
