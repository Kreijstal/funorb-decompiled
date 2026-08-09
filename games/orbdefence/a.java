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
            int stackIn_28_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_110_0 = 0;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            cd var2 = null;
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
            cd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = OrbDefence.field_D ? 1 : 0;
                        if (null != this.field_q) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ji.b(param0 + -278);
                        var4 = (int)(var2_long + -this.field_j);
                        this.field_j = var2_long;
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
                        this.field_e = this.field_e + var4;
                        if ((this.field_e ^ -1) < -30001) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            this.field_q.a(1);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) ((Object) caughtException);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        this.field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (this.field_q == null) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (this.g(-128) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        if (-1 == (this.b(84) ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 18: {
                        try {
                            this.field_q.b(-120);
                            var2 = (cd) ((Object) this.field_d.b((byte) 46));
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2 == null) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            this.field_l.field_i = 0;
                            this.field_l.a(1, -41);
                            this.field_l.b(123, var2.field_h);
                            this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                            this.field_p.a(param0 ^ -143, var2);
                            var2 = (cd) ((Object) this.field_d.b(0));
                            if (var16 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var16 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2 = (cd) ((Object) this.field_k.b((byte) 46));
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2 == null) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            this.field_l.field_i = 0;
                            this.field_l.a(0, -74);
                            this.field_l.b(115, var2.field_h);
                            this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                            this.field_f.a(-90, var2);
                            var2 = (cd) ((Object) this.field_k.b(0));
                            if (var16 == 0) {
                                statePc = 24;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var2_int = 0;
                            if (param0 == 255) {
                                statePc = 29;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackIn_28_0 = 1;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0 != 0;
                    }
                    case 29: {
                        try {
                            if ((var2_int ^ -1) <= -101) {
                                statePc = 109;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var3_int = this.field_q.b((byte) 101);
                            stackIn_110_0 = -1;
                            stackIn_31_0 = stackIn_110_0;
                            if (var16 != 0) {
                                statePc = 110;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (stackIn_31_0 < (var3_int ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-1 != (var3_int ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var16 == 0) {
                                statePc = 109;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.field_e = 0;
                            var4 = 0;
                            if (null == this.field_a) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-1 != (this.field_a.field_v ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var4 = 10;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var4 > 0) {
                                statePc = 59;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var5 = this.field_a.field_u.field_j.length + -this.field_a.field_s;
                            var6 = 512 - this.field_a.field_v;
                            if (var5 - this.field_a.field_u.field_i >= var6) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var6 = var5 - this.field_a.field_u.field_i;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 111;
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
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            this.field_q.a(this.field_a.field_u.field_i, var6, 87, this.field_a.field_u.field_j);
                            if (this.field_h == 0) {
                                statePc = 52;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var7 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var6 <= var7) {
                                statePc = 52;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            this.field_a.field_u.field_j[this.field_a.field_u.field_i - -var7] = (byte)gi.a((int) this.field_a.field_u.field_j[this.field_a.field_u.field_i + var7], (int) this.field_h);
                            var7++;
                            if (var16 != 0) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var16 == 0) {
                                statePc = 48;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            this.field_a.field_v = this.field_a.field_v + var6;
                            this.field_a.field_u.field_i = this.field_a.field_u.field_i + var6;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (this.field_a.field_u.field_i == var5) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (-513 != (this.field_a.field_v ^ -1)) {
                                statePc = 108;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_a.field_v = 0;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            this.field_a.c(-1);
                            this.field_a.field_l = false;
                            this.field_a = null;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var5 = -this.field_m.field_i + var4;
                            if (var5 > var3_int) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var5 = var3_int;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            this.field_q.a(this.field_m.field_i, var5, -117, this.field_m.field_j);
                            if (this.field_h == 0) {
                                statePc = 68;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var6 = 0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var6 >= var5) {
                                statePc = 68;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            this.field_m.field_j[this.field_m.field_i - -var6] = (byte)gi.a((int) this.field_m.field_j[this.field_m.field_i + var6], (int) this.field_h);
                            var6++;
                            if (var16 != 0) {
                                statePc = 69;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var16 == 0) {
                                statePc = 64;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            this.field_m.field_i = this.field_m.field_i + var5;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (this.field_m.field_i >= var4) {
                                statePc = 72;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (this.field_a == null) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            this.field_m.field_i = 0;
                            var6 = this.field_m.b((byte) 90);
                            var7 = this.field_m.l(0);
                            var8 = this.field_m.b((byte) 90);
                            var9 = this.field_m.l(param0 + -255);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 111;
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
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var11 = stackIn_77_0;
                            var12 = ((long)var6 << 1096479136) - -(long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var14_ref = (cd) ((Object) this.field_f.b((byte) 46));
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackIn_96_0 = ((var14_ref.field_h ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_h ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_81_0 = stackIn_96_0;
                            if (var16 != 0) {
                                statePc = 96;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 111;
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
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var14_ref = (cd) ((Object) this.field_f.b(0));
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var14_ref = (cd) ((Object) this.field_p.b((byte) 46));
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackIn_96_0 = ((var14_ref.field_h ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_h ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_88_0 = stackIn_96_0;
                            if (var16 != 0) {
                                statePc = 96;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 111;
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
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var14_ref = (cd) ((Object) this.field_p.b(0));
                            if (var16 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (var14_ref == null) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            this.field_a = var14_ref;
                            stackIn_96_0 = var10 ^ -1;
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (stackIn_96_0 == -1) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            stackIn_99_0 = 9;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            stackIn_99_0 = 5;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var15 = stackIn_99_0;
                            this.field_a.field_u = new mg(this.field_a.field_s + var9 + var15);
                            this.field_a.field_u.a(var10, -99);
                            this.field_a.field_u.b(var9, -1);
                            this.field_a.field_v = 10;
                            this.field_m.field_i = 0;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (0 == this.field_a.field_v) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if ((this.field_m.field_j[0] ^ -1) == 0) {
                                statePc = 105;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            this.field_a = null;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.field_m.field_i = 0;
                            this.field_a.field_v = 1;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            stackIn_110_0 = 1;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        return stackIn_110_0 != 0;
                    }
                    case 111: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        try {
                            this.field_q.a(1);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        this.field_q = null;
                        this.field_b = this.field_b + 1;
                        this.field_n = -2;
                        if (-1 == (this.g(-113) ^ -1)) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    }
                    case 116: {
                        return false;
                    }
                    case 117: {
                        if (this.b(param0 + -207) == 0) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    }
                    case 118: {
                        return false;
                    }
                    case 119: {
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

    final void f(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_q.a(1);
              if (param0 <= -5) {
                break L1;
              } else {
                field_u = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        this.field_n = -1;
        this.field_b = this.field_b + 1;
        this.field_q = null;
        this.field_h = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static rg a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        md var4 = null;
        md stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -55 % ((-3 - param2) / 32);
            var4 = new md();
            ((rg) ((Object) var4)).field_b = param0;
            ((rg) ((Object) var4)).field_a = param1;
            stackIn_1_0 = (md) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("a.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return (rg) ((Object) stackIn_1_0);
    }

    private final void b(byte param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (null != this.field_q) {
              try {
                L0: {
                  L1: {
                    this.field_l.field_i = 0;
                    this.field_l.a(6, -32);
                    if (param0 <= -73) {
                      break L1;
                    } else {
                      field_s = (int[]) null;
                      break L1;
                    }
                  }
                  this.field_l.c(3, 127);
                  this.field_l.b((byte) -60, 0);
                  this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_q = null;
                  this.field_b = this.field_b + 1;
                  this.field_n = -2;
                  break L2;
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
            mg stackIn_6_0 = null;
            mg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (param0 <= -49) {
              if (null != this.field_q) {
                try {
                  L0: {
                    L1: {
                      this.field_l.field_i = 0;
                      stackIn_6_0 = this.field_l;

                      if (param1) {
                        stackIn_7_0 = (mg) ((Object) stackIn_6_0);
                        stackIn_7_1 = 2;
                        break L1;
                      } else {
                        stackIn_7_0 = (mg) ((Object) stackIn_6_0);
                        stackIn_7_1 = 3;
                        break L1;
                      }
                    }
                    ((mg) (Object) stackIn_7_0).a(stackIn_7_1, -105);
                    this.field_l.b(106, 0L);
                    this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        this.field_q.a(1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    this.field_n = -2;
                    this.field_q = null;
                    this.field_b = this.field_b + 1;
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static db[] a(be param0, int param1) {
        db[] stackIn_3_0 = null;
        db[] stackIn_11_0 = null;
        db[] stackIn_15_0 = null;
        db[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        db[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        db var7 = null;
        int var8 = 0;
        eb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.b((byte) -120)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = new db[]{};
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var9 = param0.a((byte) 31);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 != var9.field_a) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        hb.a(10L, 103);
                        if (var8 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9.field_a != 2) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = new db[]{};
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        var11 = (int[]) (var9.field_g);
                        var10 = var11;
                        var3 = var10;
                        var4 = new db[var11.length >> -517371230];
                        var5 = 16 / ((param1 - -29) / 44);
                        var6 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 >= var4.length) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = new db();
                        stackIn_18_0 = (db[]) (var4);
                        stackIn_15_0 = stackIn_18_0;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_15_0[var6] = var7;
                        var7.field_d = var3[var6 << 167270370];
                        var7.field_b = var3[1 + (var6 << 908315682)];
                        var7.field_e = var3[(var6 << 239281666) + 2];
                        var7.field_a = var3[3 + (var6 << 1061708130)];
                        var6++;
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (db[]) (var4);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (var2);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("a.E(");
                    stackIn_20_1 = stackIn_21_1;
                    if (param0 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        if (param0 != 1) {
            return;
        }
        if (!(this.field_q == null)) {
            this.field_q.a(1);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            cd var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != this.field_q) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_q.a(param1 + -19);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 33);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 33;
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
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_q = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_q = (cb) (param0);
                            this.b((byte) -103);
                            this.a(-54, param2);
                            this.field_a = null;
                            this.field_m.field_i = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4_ref = (cd) ((Object) this.field_p.c(30664));
                            if (var4_ref != null) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var6 != 0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var6 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            this.field_d.a(-79, var4_ref);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var6 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4_ref = (cd) ((Object) this.field_f.c(30664));
                            if (var4_ref != null) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var6 != 0) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var6 == 0) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            this.field_k.a(-63, var4_ref);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var6 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (this.field_h != 0) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            this.field_l.field_i = 0;
                            this.field_l.a(4, -80);
                            this.field_l.a((int) this.field_h, -85);
                            this.field_l.b(0, -1);
                            this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof IOException ? 25 : 33);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            this.field_q.a(1);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof Exception ? 28 : 33);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            this.field_b = this.field_b + 1;
                            this.field_n = -2;
                            this.field_q = null;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            this.field_e = 0;
                            this.field_j = ji.b(107);
                            if (param1 == 20) {
                                statePc = 37;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            field_s = (int[]) null;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_35_0 = (RuntimeException) (var4_ref3);
                        stackIn_34_0 = stackIn_35_0;
                        stackIn_35_1 = new StringBuilder().append("a.G(");
                        stackIn_34_1 = stackIn_35_1;
                        if (param0 == null) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                        stackIn_36_1 = (StringBuilder) ((Object) stackIn_34_1);
                        stackIn_36_2 = "{...}";
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 35: {
                        stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackIn_36_2 = "null";
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        throw dd.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ')');
                    }
                    case 37: {
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
            field_t = (int[]) null;
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
        field_v = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new int[8192];
        field_u = "Confirm Email:";
        field_s = new int[8192];
    }
}
