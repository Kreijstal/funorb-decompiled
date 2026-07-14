/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t extends gd {
    static boolean[] field_p;
    private dt field_r;
    static String field_s;
    static int field_q;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            fv var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Sumoblitz.field_L ? 1 : 0;
                        if (((t) this).field_r == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((t) this).field_r.a((byte) -67);
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
                        ((t) this).field_r = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((t) this).field_r = (dt) param2;
                        this.e(0);
                        this.a(71, param0);
                        ((t) this).field_i = null;
                        ((t) this).field_b.field_p = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref2 = (fv) (Object) ((t) this).field_h.b((byte) 72);
                        if (var4_ref2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((t) this).field_l.a((pj) (Object) var4_ref2, (byte) -128);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (fv) (Object) ((t) this).field_g.b((byte) 72);
                        if (var4_ref2 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((t) this).field_f.a((pj) (Object) var4_ref2, (byte) -101);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 11: {
                        if (param1 > 90) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        if (((t) this).field_m != 0) {
                            statePc = 15;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((t) this).field_n.field_p = 0;
                            ((t) this).field_n.b((byte) 89, 4);
                            ((t) this).field_n.b((byte) 36, (int) ((t) this).field_m);
                            ((t) this).field_n.e(48, 0);
                            ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
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
                            ((t) this).field_r.a((byte) -73);
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
                        ((t) this).field_r = null;
                        ((t) this).field_j = -2;
                        ((t) this).field_d = ((t) this).field_d + 1;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((t) this).field_c = 0;
                        ((t) this).field_e = wq.a(-78);
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

    public static void f(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 1) {
            t.f(-122);
        }
    }

    final void b(int param0) {
        try {
            ((t) this).field_r.a((byte) -65);
        } catch (Exception exception) {
        }
        ((t) this).field_j = -1;
        ((t) this).field_d = ((t) this).field_d + 1;
        ((t) this).field_r = null;
        ((t) this).field_m = (byte)(int)(1.0 + Math.random() * 255.0);
        if (param0 != 14702) {
            field_q = -47;
        }
    }

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fv var2_ref = null;
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
            fv var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
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
                        var16 = Sumoblitz.field_L ? 1 : 0;
                        if (param0 > 78) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return false;
                    }
                    case 2: {
                        if (((t) this).field_r != null) {
                            statePc = 4;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var2_long = wq.a(-113);
                        var4 = (int)(var2_long + -((t) this).field_e);
                        if (var4 <= 200) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var4 = 200;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((t) this).field_e = var2_long;
                        ((t) this).field_c = ((t) this).field_c + var4;
                        if (30000 < ((t) this).field_c) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            ((t) this).field_r.a((byte) -72);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((t) this).field_r = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (((t) this).field_r == null) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (-1 != (((t) this).d(-2115911413) ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (0 == ((t) this).a((byte) -86)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        return false;
                    }
                    case 17: {
                        return false;
                    }
                    case 18: {
                        return true;
                    }
                    case 19: {
                        try {
                            ((t) this).field_r.b(-120);
                            var2_ref = (fv) (Object) ((t) this).field_l.a(32);
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
                            ((t) this).field_n.field_p = 0;
                            ((t) this).field_n.b((byte) 55, 1);
                            ((t) this).field_n.b(var2_ref.field_l, 1105594440);
                            ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
                            ((t) this).field_h.a((pj) (Object) var2_ref, (byte) -107);
                            var2_ref = (fv) (Object) ((t) this).field_l.d(-2);
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
                            var2_ref = (fv) (Object) ((t) this).field_f.a(37);
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
                            ((t) this).field_n.field_p = 0;
                            ((t) this).field_n.b((byte) 86, 0);
                            ((t) this).field_n.b(var2_ref.field_l, 1105594440);
                            ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
                            ((t) this).field_g.a((pj) (Object) var2_ref, (byte) -103);
                            var2_ref = (fv) (Object) ((t) this).field_f.d(-2);
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
                            if (var2_int >= 100) {
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
                            var3_int = ((t) this).field_r.c(-128);
                            if (-1 < (var3_int ^ -1)) {
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
                            if (var3_int == 0) {
                                statePc = 88;
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
                            ((t) this).field_c = 0;
                            var4 = 0;
                            if (((t) this).field_i == null) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (0 == ((t) this).field_i.field_x) {
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
                            var4 = 1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var4 = 10;
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
                            if (-1 > (var4 ^ -1)) {
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
                            var5 = ((t) this).field_i.field_w.field_n.length + -((t) this).field_i.field_z;
                            var6 = -((t) this).field_i.field_x + 512;
                            if (var6 <= var5 - ((t) this).field_i.field_w.field_p) {
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
                            var6 = var5 - ((t) this).field_i.field_w.field_p;
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
                            if (var3_int >= var6) {
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
                            ((t) this).field_r.a(-115, ((t) this).field_i.field_w.field_p, var6, ((t) this).field_i.field_w.field_n);
                            if (-1 != (((t) this).field_m ^ -1)) {
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
                            ((t) this).field_i.field_w.field_n[((t) this).field_i.field_w.field_p + var7] = (byte)jg.a((int) ((t) this).field_i.field_w.field_n[((t) this).field_i.field_w.field_p + var7], (int) ((t) this).field_m);
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
                            ((t) this).field_i.field_x = ((t) this).field_i.field_x + var6;
                            ((t) this).field_i.field_w.field_p = ((t) this).field_i.field_w.field_p + var6;
                            if (var5 != ((t) this).field_i.field_w.field_p) {
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
                            ((t) this).field_i.c(-5106);
                            ((t) this).field_i.field_u = false;
                            ((t) this).field_i = null;
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
                            if (((t) this).field_i.field_x == 512) {
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
                            ((t) this).field_i.field_x = 0;
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
                            var5 = -((t) this).field_b.field_p + var4;
                            if (var3_int >= var5) {
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
                            var5 = var3_int;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((t) this).field_r.a(-114, ((t) this).field_b.field_p, var5, ((t) this).field_b.field_n);
                            if (0 != ((t) this).field_m) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 90;
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
                            statePc = 90;
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
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((t) this).field_b.field_n[var6 + ((t) this).field_b.field_p] = (byte)jg.a((int) ((t) this).field_b.field_n[var6 + ((t) this).field_b.field_p], (int) ((t) this).field_m);
                            var6++;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((t) this).field_b.field_p = ((t) this).field_b.field_p + var5;
                            if (((t) this).field_b.field_p >= var4) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (null == ((t) this).field_i) {
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
                            ((t) this).field_b.field_p = 0;
                            var6 = ((t) this).field_b.e(-31302);
                            var7 = ((t) this).field_b.c(true);
                            var8 = ((t) this).field_b.e(-31302);
                            var9 = ((t) this).field_b.c(true);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
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
                            var12 = ((long)var6 << 1826556384) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
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
                            var14_ref = (fv) (Object) ((t) this).field_h.a(66);
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
                                statePc = 75;
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
                            if ((var12 ^ -1L) != (var14_ref.field_l ^ -1L)) {
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
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (fv) (Object) ((t) this).field_h.d(-2);
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
                            var14_ref = (fv) (Object) ((t) this).field_g.a(64);
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
                                statePc = 75;
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
                            if (var14_ref.field_l == var12) {
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
                            var14_ref = (fv) (Object) ((t) this).field_g.d(-2);
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var14_ref == null) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
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
                            if (0 == var10) {
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
                            ((t) this).field_i = var14_ref;
                            ((t) this).field_i.field_w = new fs(((t) this).field_i.field_z + var15 + var9);
                            ((t) this).field_i.field_w.b((byte) 37, var10);
                            ((t) this).field_i.field_w.e(48, var9);
                            ((t) this).field_i.field_x = 10;
                            ((t) this).field_b.field_p = 0;
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
                            if (0 != ((t) this).field_i.field_x) {
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
                            if (0 == (((t) this).field_b.field_n[0] ^ -1)) {
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
                            ((t) this).field_i = null;
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
                            ((t) this).field_i.field_x = 1;
                            ((t) this).field_b.field_p = 0;
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
                            ((t) this).field_r.a((byte) -60);
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
                        ((t) this).field_r = null;
                        ((t) this).field_d = ((t) this).field_d + 1;
                        ((t) this).field_j = -2;
                        if (0 != ((t) this).d(-2115911413)) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        if (-1 != (((t) this).a((byte) -122) ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 96: {
                        return true;
                    }
                    case 97: {
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

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            fs stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            fs stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            fs stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            fs stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            fs stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            fs stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((t) this).field_r == null) {
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
                            ((t) this).field_n.field_p = 0;
                            stackOut_3_0 = ((t) this).field_n;
                            stackOut_3_1 = 46;
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
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (fs) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 2;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_6_2 = stackOut_4_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (fs) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 3;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((fs) (Object) stackIn_6_0).b((byte) stackIn_6_1, stackIn_6_2);
                            ((t) this).field_n.b(0L, 1105594440);
                            if (param0 >= 63) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        try {
                            ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((t) this).field_r.a((byte) -93);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        ((t) this).field_j = -2;
                        ((t) this).field_d = ((t) this).field_d + 1;
                        ((t) this).field_r = null;
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

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((t) this).field_r == null) {
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
                            ((t) this).field_n.field_p = param0;
                            ((t) this).field_n.b((byte) 19, 6);
                            ((t) this).field_n.d(3, param0 + 102);
                            ((t) this).field_n.b(param0 + 127, 0);
                            ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
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
                            ((t) this).field_r.a((byte) -94);
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
                        ((t) this).field_d = ((t) this).field_d + 1;
                        ((t) this).field_j = -2;
                        ((t) this).field_r = null;
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

    public t() {
    }

    final void c(int param0) {
        if (param0 > -61) {
            field_q = 32;
        }
        if (null != ((t) this).field_r) {
            ((t) this).field_r.a((byte) -46);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[25];
        field_s = null;
    }
}
