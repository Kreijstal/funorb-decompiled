/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl extends na {
    static si[] field_o;
    private hi field_p;
    static int field_r;
    static ji[] field_q;

    final void a(boolean param0) {
        try {
            ((sl) this).field_p.b((byte) 76);
        } catch (Exception exception) {
        }
        ((sl) this).field_p = null;
        ((sl) this).field_k = ((sl) this).field_k + 1;
        ((sl) this).field_n = -1;
        ((sl) this).field_h = (byte)(int)(1.0 + 255.0 * Math.random());
        if (!param0) {
            field_o = null;
        }
    }

    final static vi d(byte param0) {
        if (param0 <= 124) {
            sl.e(-10);
        }
        return ol.field_c;
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fi var2_ref = null;
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
            fi var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_20_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_87_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_86_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = wizardrun.field_H;
                        if (null != ((sl) this).field_p) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = d.a((byte) 79);
                        var4 = (int)(var2_long - ((sl) this).field_d);
                        if (200 >= var4) {
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
                        ((sl) this).field_d = var2_long;
                        ((sl) this).field_f = ((sl) this).field_f + var4;
                        if (((sl) this).field_f <= 30000) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((sl) this).field_p.b((byte) 76);
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
                        ((sl) this).field_p = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != ((sl) this).field_p) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (((sl) this).d(-14289) != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((sl) this).c((byte) -96) == 0) {
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
                            ((sl) this).field_p.a(param0 ^ 0);
                            var2_ref = (fi) (Object) ((sl) this).field_b.a(0);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((sl) this).field_i.field_m = 0;
                            ((sl) this).field_i.b((byte) 11, 1);
                            ((sl) this).field_i.a(var2_ref.field_o, (byte) 122);
                            ((sl) this).field_p.a(((sl) this).field_i.field_k.length, ((sl) this).field_i.field_k, 1, 0);
                            ((sl) this).field_a.a((rk) (Object) var2_ref, 14);
                            var2_ref = (fi) (Object) ((sl) this).field_b.d(14);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param0 == 0) {
                                statePc = 21;
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
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return stackIn_20_0 != 0;
                    }
                    case 21: {
                        try {
                            var2_ref = (fi) (Object) ((sl) this).field_j.a(0);
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
                            if (var2_ref == null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((sl) this).field_i.field_m = 0;
                            ((sl) this).field_i.b((byte) 11, 0);
                            ((sl) this).field_i.a(var2_ref.field_o, (byte) 123);
                            ((sl) this).field_p.a(((sl) this).field_i.field_k.length, ((sl) this).field_i.field_k, 1, 0);
                            ((sl) this).field_m.a((rk) (Object) var2_ref, 14);
                            var2_ref = (fi) (Object) ((sl) this).field_j.d(94);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var2_int = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((sl) this).field_p.c((byte) 89);
                            if (-1 >= var3_int) {
                                statePc = 28;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (-1 == var3_int) {
                                statePc = 86;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((sl) this).field_f = 0;
                            var4 = 0;
                            if (null == ((sl) this).field_c) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (0 != ((sl) this).field_c.field_z) {
                                statePc = 33;
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
                            var4 = 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 10;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var4 <= 0) {
                                statePc = 70;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var5 = var4 + -((sl) this).field_g.field_m;
                            if (var3_int >= var5) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = var3_int;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            ((sl) this).field_p.a(((sl) this).field_g.field_k, param0 + -105, var5, ((sl) this).field_g.field_m);
                            if (((sl) this).field_h == 0) {
                                statePc = 40;
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
                            var6 = 0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var5 <= var6) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((sl) this).field_g.field_k[((sl) this).field_g.field_m - -var6] = (byte)sg.a((int) ((sl) this).field_g.field_k[((sl) this).field_g.field_m + var6], (int) ((sl) this).field_h);
                            var6++;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((sl) this).field_g.field_m = ((sl) this).field_g.field_m + var5;
                            if (((sl) this).field_g.field_m >= var4) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (null == ((sl) this).field_c) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((sl) this).field_g.field_m = 0;
                            var6 = ((sl) this).field_g.f(255);
                            var7 = ((sl) this).field_g.i(param0 ^ 255);
                            var8 = ((sl) this).field_g.f(255);
                            var9 = ((sl) this).field_g.i(255);
                            var10 = var8 & 127;
                            if (-1 == (128 & var8 ^ -1)) {
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
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackOut_46_0 = 0;
                            stackIn_47_0 = stackOut_46_0;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var11 = stackIn_47_0;
                            var12 = ((long)var6 << -1806274016) - -(long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 53;
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
                            var14_ref = (fi) (Object) ((sl) this).field_m.a(0);
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var14_ref == null) {
                                statePc = 57;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_o ^ -1L)) {
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
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var14_ref = (fi) (Object) ((sl) this).field_m.d(87);
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var14_ref = (fi) (Object) ((sl) this).field_a.a(0);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (var14_ref == null) {
                                statePc = 57;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var12 == var14_ref.field_o) {
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
                            var14_ref = (fi) (Object) ((sl) this).field_a.d(42);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var14_ref == null) {
                                statePc = 59;
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
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (-1 != (var10 ^ -1)) {
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
                            stackOut_61_0 = 5;
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
                            stackOut_62_0 = 9;
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
                            var15 = stackIn_63_0;
                            ((sl) this).field_c = var14_ref;
                            ((sl) this).field_c.field_C = new va(((sl) this).field_c.field_D + var9 - -var15);
                            ((sl) this).field_c.field_C.b((byte) 11, var10);
                            ((sl) this).field_c.field_C.f(var9, 613003928);
                            ((sl) this).field_c.field_z = 10;
                            ((sl) this).field_g.field_m = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (0 == ((sl) this).field_c.field_z) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if ((((sl) this).field_g.field_k[0] ^ -1) == 0) {
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
                            ((sl) this).field_c = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            ((sl) this).field_g.field_m = 0;
                            ((sl) this).field_c.field_z = 1;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var5 = ((sl) this).field_c.field_C.field_k.length + -((sl) this).field_c.field_D;
                            var6 = 512 - ((sl) this).field_c.field_z;
                            if (var5 - ((sl) this).field_c.field_C.field_m < var6) {
                                statePc = 72;
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
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var6 = var5 + -((sl) this).field_c.field_C.field_m;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var6 <= var3_int) {
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
                            var6 = var3_int;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((sl) this).field_p.a(((sl) this).field_c.field_C.field_k, -124, var6, ((sl) this).field_c.field_C.field_m);
                            if (((sl) this).field_h != 0) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (var17 >= var6) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((sl) this).field_c.field_C.field_k[((sl) this).field_c.field_C.field_m - -var17] = (byte)sg.a((int) ((sl) this).field_c.field_C.field_k[((sl) this).field_c.field_C.field_m + var17], (int) ((sl) this).field_h);
                            var17++;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((sl) this).field_c.field_C.field_m = ((sl) this).field_c.field_C.field_m + var6;
                            ((sl) this).field_c.field_z = ((sl) this).field_c.field_z + var6;
                            if (((sl) this).field_c.field_C.field_m != var5) {
                                statePc = 82;
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
                            ((sl) this).field_c.b(false);
                            ((sl) this).field_c.field_s = false;
                            ((sl) this).field_c = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (((sl) this).field_c.field_z == 512) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
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
                            ((sl) this).field_c.field_z = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_int++;
                            statePc = 25;
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
                            ((sl) this).field_p.b((byte) 76);
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
                        ((sl) this).field_k = ((sl) this).field_k + 1;
                        ((sl) this).field_p = null;
                        ((sl) this).field_n = -2;
                        if (0 != ((sl) this).d(param0 + -14289)) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        if (-1 == (((sl) this).c((byte) -74) ^ -1)) {
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

    private final void f(int param0) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Exception var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = 66 / ((17 - param0) / 48);
                        if (null != ((sl) this).field_p) {
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
                            ((sl) this).field_i.field_m = 0;
                            ((sl) this).field_i.b((byte) 11, 6);
                            ((sl) this).field_i.a(3, false);
                            ((sl) this).field_i.b(-1947079288, 0);
                            ((sl) this).field_p.a(((sl) this).field_i.field_k.length, ((sl) this).field_i.field_k, 1, 0);
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
                            ((sl) this).field_p.b((byte) 76);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((sl) this).field_n = -2;
                        ((sl) this).field_k = ((sl) this).field_k + 1;
                        ((sl) this).field_p = null;
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

    final static void a(int param0, int param1, int param2) {
        if (param2 >= -126) {
            return;
        }
        sf.field_h = 7;
        hk.field_Y = param1;
        n.field_c = param0;
    }

    final void a(byte param0) {
        if (null != ((sl) this).field_p) {
            ((sl) this).field_p.b((byte) 76);
        }
        if (param0 > -73) {
            field_q = null;
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_o = null;
        if (param0 != -1) {
            sl.a(-54, 7, -58);
        }
    }

    final static o g(int param0) {
        int var4_int = 0;
        int var5 = wizardrun.field_H;
        int var1 = tf.field_b[0] * cg.field_k[0];
        byte[] var2 = mf.field_j[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = ic.field_b[kl.b((int) var2[var4_int], 255)];
        }
        o var4 = new o(hk.field_bb, eg.field_v, ph.field_q[0], ne.field_h[0], cg.field_k[param0], tf.field_b[0], var3);
        eb.a(param0 ^ 0);
        return var4;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            va stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            va stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            va stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            va stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            va stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            va stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ((sl) this).field_p) {
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
                            ((sl) this).field_p = null;
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
                            ((sl) this).field_i.field_m = 0;
                            stackOut_4_0 = ((sl) this).field_i;
                            stackOut_4_1 = 11;
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
                            stackOut_5_0 = (va) (Object) stackIn_5_0;
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
                            stackOut_6_0 = (va) (Object) stackIn_6_0;
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
                            ((va) (Object) stackIn_7_0).b((byte) stackIn_7_1, stackIn_7_2);
                            ((sl) this).field_i.a(0L, (byte) 106);
                            ((sl) this).field_p.a(((sl) this).field_i.field_k.length, ((sl) this).field_i.field_k, param0 ^ 2, 0);
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
                            ((sl) this).field_p.b((byte) 76);
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
                        ((sl) this).field_k = ((sl) this).field_k + 1;
                        ((sl) this).field_p = null;
                        ((sl) this).field_n = -2;
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

    public sl() {
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            fi var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = wizardrun.field_H;
                        if (null != ((sl) this).field_p) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((sl) this).field_p.b((byte) 76);
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
                        ((sl) this).field_p = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param2 > 118) {
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
                        ((sl) this).field_p = (hi) param1;
                        this.f(-73);
                        this.a(3, param0);
                        ((sl) this).field_g.field_m = 0;
                        ((sl) this).field_c = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (fi) (Object) ((sl) this).field_a.b(58);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((sl) this).field_b.a((rk) (Object) var4_ref2, 14);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (fi) (Object) ((sl) this).field_m.b(70);
                        if (var4_ref2 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((sl) this).field_j.a((rk) (Object) var4_ref2, 14);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((sl) this).field_h == 0) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((sl) this).field_i.field_m = 0;
                            ((sl) this).field_i.b((byte) 11, 4);
                            ((sl) this).field_i.b((byte) 11, (int) ((sl) this).field_h);
                            ((sl) this).field_i.f(0, 613003928);
                            ((sl) this).field_p.a(((sl) this).field_i.field_k.length, ((sl) this).field_i.field_k, 1, 0);
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
                            ((sl) this).field_p.b((byte) 76);
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
                        ((sl) this).field_k = ((sl) this).field_k + 1;
                        ((sl) this).field_n = -2;
                        ((sl) this).field_p = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((sl) this).field_f = 0;
                        ((sl) this).field_d = d.a((byte) 50);
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
    }
}
