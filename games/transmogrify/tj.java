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
            int stackIn_19_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_98_0 = 0;
            int stackIn_108_0 = 0;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            pj var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
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
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Transmogrify.field_A ? 1 : 0;
                        if (null == this.field_x) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = lk.a(0);
                        var4 = (int)(-this.field_l + var2_long);
                        this.field_l = var2_long;
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
                        this.field_b = this.field_b + var4;
                        if (this.field_b <= 30000) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            this.field_x.a(true);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var5_ref_Exception = (Exception) ((Object) caughtException);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.field_x = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == this.field_x) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 == this.a((byte) -68)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return false;
                    }
                    case 13: {
                        if (this.e(-10236) != 0) {
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
                    case 17: {
                        try {
                            this.field_x.d(-60);
                            if (param0 > 115) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackIn_19_0 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        try {
                            var2 = (pj) ((Object) this.field_c.b((byte) 125));
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2 == null) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            this.field_i.field_h = 0;
                            this.field_i.f(6389, 1);
                            this.field_i.a(var2.field_j, true);
                            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                            this.field_h.a((byte) -128, var2);
                            var2 = (pj) ((Object) this.field_c.a(97));
                            if (var16 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var16 == 0) {
                                statePc = 21;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var2 = (pj) ((Object) this.field_a.b((byte) 114));
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2 == null) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_i.field_h = 0;
                            this.field_i.f(6389, 0);
                            this.field_i.a(var2.field_j, true);
                            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                            this.field_n.a((byte) -128, var2);
                            var2 = (pj) ((Object) this.field_a.a(104));
                            if (var16 == 0) {
                                statePc = 26;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var2_int = 0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 107;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var3_int = this.field_x.a((byte) -119);
                            stackIn_108_0 = 0;
                            stackIn_31_0 = stackIn_108_0;
                            if (var16 != 0) {
                                statePc = 108;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (stackIn_31_0 > var3_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (0 != var3_int) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var16 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.field_b = 0;
                            var4 = 0;
                            if (this.field_e != null) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var4 = 10;
                            if (var16 == 0) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (-1 != (this.field_e.field_C ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var4 = 1;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var4 > 0) {
                                statePc = 60;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var5 = -this.field_e.field_z + this.field_e.field_B.field_g.length;
                            var6 = -this.field_e.field_C + 512;
                            if (var5 - this.field_e.field_B.field_h >= var6) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var6 = var5 + -this.field_e.field_B.field_h;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var6 = var3_int;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            this.field_x.a(this.field_e.field_B.field_h, var6, this.field_e.field_B.field_g, 5768);
                            if (this.field_m != 0) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var7 = 0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var7 >= var6) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h] = (byte)ak.a((int) this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h], (int) this.field_m);
                            var7++;
                            if (var16 != 0) {
                                statePc = 54;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var16 == 0) {
                                statePc = 49;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            this.field_e.field_B.field_h = this.field_e.field_B.field_h + var6;
                            this.field_e.field_C = this.field_e.field_C + var6;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (this.field_e.field_B.field_h != var5) {
                                statePc = 57;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_e.b((byte) -79);
                            this.field_e.field_m = false;
                            this.field_e = null;
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (-513 == (this.field_e.field_C ^ -1)) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            this.field_e.field_C = 0;
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var5 = -this.field_g.field_h + var4;
                            if (var5 > var3_int) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var5 = var3_int;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            this.field_x.a(this.field_g.field_h, var5, this.field_g.field_g, 5768);
                            if (this.field_m != 0) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var6 = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var5 <= var6) {
                                statePc = 70;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            this.field_g.field_g[var6 + this.field_g.field_h] = (byte)ak.a((int) this.field_g.field_g[var6 + this.field_g.field_h], (int) this.field_m);
                            var6++;
                            if (var16 != 0) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var16 == 0) {
                                statePc = 66;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            this.field_g.field_h = this.field_g.field_h + var5;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var4 > this.field_g.field_h) {
                                statePc = 106;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (this.field_e == null) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            this.field_g.field_h = 0;
                            var6 = this.field_g.d((byte) 56);
                            var7 = this.field_g.c((byte) -125);
                            var8 = this.field_g.d((byte) 90);
                            var9 = this.field_g.c((byte) -104);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackIn_77_0 = 1;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackIn_77_0 = 0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var11 = stackIn_77_0;
                            var12 = ((long)var6 << 1160970720) - -(long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var14_ref = (pj) ((Object) this.field_n.b((byte) 127));
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var14_ref == null) {
                                statePc = 92;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackIn_95_0 = ((var12 ^ -1L) < (var14_ref.field_j ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_j ^ -1L) ? 0 : 1));
                            stackIn_81_0 = stackIn_95_0;
                            if (var16 != 0) {
                                statePc = 95;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (stackIn_81_0 != 0) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (var16 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var14_ref = (pj) ((Object) this.field_n.a(83));
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var14_ref = (pj) ((Object) this.field_h.b((byte) 124));
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (var14_ref == null) {
                                statePc = 92;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackIn_95_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                            stackIn_88_0 = stackIn_95_0;
                            if (var16 != 0) {
                                statePc = 95;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (stackIn_88_0 != 0) {
                                statePc = 91;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (var16 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var14_ref = (pj) ((Object) this.field_h.a(119));
                            if (var16 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (var14_ref != null) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            this.field_e = var14_ref;
                            stackIn_95_0 = var10;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (stackIn_95_0 == 0) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            stackIn_98_0 = 9;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            stackIn_98_0 = 5;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var15 = stackIn_98_0;
                            this.field_e.field_B = new oa(var15 + (var9 + this.field_e.field_z));
                            this.field_e.field_B.f(6389, var10);
                            this.field_e.field_B.a(-112, var9);
                            this.field_g.field_h = 0;
                            this.field_e.field_C = 10;
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (0 != this.field_e.field_C) {
                                statePc = 105;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if ((this.field_g.field_g[0] ^ -1) == 0) {
                                statePc = 103;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.field_e = null;
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            this.field_g.field_h = 0;
                            this.field_e.field_C = 1;
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            stackIn_108_0 = 1;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        return stackIn_108_0 != 0;
                    }
                    case 109: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 110;
                        continue stateLoop;
                    }
                    case 110: {
                        try {
                            this.field_x.a(true);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 113: {
                        this.field_p = this.field_p + 1;
                        this.field_k = -2;
                        this.field_x = null;
                        if (this.a((byte) 87) == 0) {
                            statePc = 115;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    }
                    case 114: {
                        return false;
                    }
                    case 115: {
                        if (this.e(-10236) != 0) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    }
                    case 116: {
                        return true;
                    }
                    case 117: {
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

    final void a(boolean param0, Object param1, int param2) {
        try {
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            pj var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (this.field_x != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_x.a(true);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 34);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = (Exception) ((Object) caughtException);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_x = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_x = (gj) (param1);
                            this.a(false);
                            this.a(3, param0);
                            this.field_e = null;
                            if (param2 == 20) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            this.field_g.field_h = 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var4_ref = (pj) ((Object) this.field_h.d(-31914));
                            if (var4_ref != null) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var6 != 0) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var6 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            this.field_c.a((byte) -128, var4_ref);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var4_ref = (pj) ((Object) this.field_n.d(param2 + -31934));
                            if (var4_ref != null) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var6 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var6 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            this.field_a.a((byte) -128, var4_ref);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var6 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (this.field_m != 0) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            this.field_i.field_h = 0;
                            this.field_i.f(6389, 4);
                            this.field_i.f(6389, (int) this.field_m);
                            this.field_i.a(-122, 0);
                            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof IOException ? 27 : 34);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            this.field_x.a(true);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof Exception ? 30 : 34);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            this.field_p = this.field_p + 1;
                            this.field_k = -2;
                            this.field_x = null;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            this.field_b = 0;
                            this.field_l = lk.a(param2 + -20);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_36_0 = (RuntimeException) (var4_ref3);
                        stackIn_35_0 = stackIn_36_0;
                        stackIn_36_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
                        stackIn_35_1 = stackIn_36_1;
                        if (param1 == null) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackIn_37_2 = "{...}";
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 36: {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                        stackIn_37_2 = "null";
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        throw ch.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ')');
                    }
                    case 38: {
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
            this.field_x.a(true);
            int var2_int = 19 % ((81 - param0) / 34);
        } catch (Exception exception) {
        }
        this.field_k = -1;
        this.field_x = null;
        this.field_p = this.field_p + 1;
        this.field_m = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            oa stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            oa stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_x != null) {
              try {
                L0: {
                  L1: {
                    if (param0 == 3) {
                      break L1;
                    } else {
                      this.a(-2, false);
                      break L1;
                    }
                  }
                  L2: {
                    this.field_i.field_h = 0;
                    stackIn_6_0 = this.field_i;

                    stackIn_6_1 = 6389;

                    if (param1) {
                      stackIn_7_0 = (oa) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 2;
                      break L2;
                    } else {
                      stackIn_7_0 = (oa) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 3;
                      break L2;
                    }
                  }
                  ((oa) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                  this.field_i.a(0L, true);
                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_x.a(true);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
                  this.field_x = null;
                  break L3;
                }
              }
              return;
            } else {
              return;
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
            gj stackIn_10_0 = null;
            gj stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            L0: {
              if (!param0) {
                break L0;
              } else {
                this.a(-105);
                break L0;
              }
            }
            if (this.field_x == null) {
              return;
            } else {
              try {
                L1: {
                  this.field_i.field_h = 0;
                  this.field_i.f(6389, 6);
                  this.field_i.i(3, 45);
                  this.field_i.c(0, -159688920);
                  this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      L4: {
                        stackIn_10_0 = this.field_x;

                        if (param0) {
                          stackIn_11_0 = (gj) ((Object) stackIn_10_0);
                          stackIn_11_1 = 0;
                          break L4;
                        } else {
                          stackIn_11_0 = (gj) ((Object) stackIn_10_0);
                          stackIn_11_1 = 1;
                          break L4;
                        }
                      }
                      ((gj) (Object) stackIn_11_0).a(stackIn_11_1 != 0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_x = null;
                  this.field_p = this.field_p + 1;
                  this.field_k = -2;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (!(null == this.field_x)) {
            this.field_x.a(true);
        }
        if (param0 != -2025316960) {
            field_A = (String) null;
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
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = "Create a free account to start using this feature";
        field_z = "Submit for ";
        field_A = "Please enter your age in years";
        field_v = null;
    }
}
