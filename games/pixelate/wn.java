/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wn extends rf {
    static ak field_t;
    static int field_u;
    static int field_r;
    private mo field_s;
    static int[] field_q;

    final void e(byte param0) {
        try {
            ((wn) this).field_s.b(-1);
        } catch (Exception exception) {
        }
        ((wn) this).field_h = ((wn) this).field_h + 1;
        if (param0 != 0) {
            field_r = 79;
        }
        ((wn) this).field_m = -1;
        ((wn) this).field_s = null;
        ((wn) this).field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void d(int param0) {
        io.field_d = hm.a(64);
        if (param0 >= -11) {
            wn.c(16);
        }
        on.field_ob = 0;
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            rj var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Pixelate.field_H ? 1 : 0;
                        if (param2 == 8) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        this.e(-125);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (((wn) this).field_s != null) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            ((wn) this).field_s.b(-1);
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
                        ((wn) this).field_s = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((wn) this).field_s = (mo) param0;
                        this.e(0);
                        this.a((byte) 73, param1);
                        ((wn) this).field_g.field_m = 0;
                        ((wn) this).field_c = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (rj) (Object) ((wn) this).field_f.a((byte) 80);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((wn) this).field_e.a(param2 ^ 84, (lm) (Object) var4_ref2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (rj) (Object) ((wn) this).field_p.a((byte) 80);
                        if (var4_ref2 != null) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ((wn) this).field_l.a(param2 + 104, (lm) (Object) var4_ref2);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        if (0 != ((wn) this).field_a) {
                            statePc = 17;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((wn) this).field_b.field_m = 0;
                            ((wn) this).field_b.e(160, 4);
                            ((wn) this).field_b.e(160, (int) ((wn) this).field_a);
                            ((wn) this).field_b.d(0, param2 + -126);
                            ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -89, 0, ((wn) this).field_b.field_k);
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
                            ((wn) this).field_s.b(param2 ^ -9);
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
                        ((wn) this).field_h = ((wn) this).field_h + 1;
                        ((wn) this).field_s = null;
                        ((wn) this).field_m = -2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        ((wn) this).field_o = 0;
                        ((wn) this).field_k = hm.a(64);
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

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            rj var2_ref = null;
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
            rj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_90_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_89_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Pixelate.field_H ? 1 : 0;
                        if (null == ((wn) this).field_s) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = hm.a(64);
                        var4 = (int)(var2_long - ((wn) this).field_k);
                        ((wn) this).field_k = var2_long;
                        if (200 >= var4) {
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
                        ((wn) this).field_o = ((wn) this).field_o + var4;
                        if (-30001 > (((wn) this).field_o ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((wn) this).field_s.b(-1);
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
                        ((wn) this).field_s = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((wn) this).field_s == null) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 != (((wn) this).b(-97) ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((wn) this).a((byte) 34) == 0) {
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
                            ((wn) this).field_s.b((byte) -106);
                            var2_ref = (rj) (Object) ((wn) this).field_e.c(61);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((wn) this).field_b.field_m = 0;
                            ((wn) this).field_b.e(160, 1);
                            ((wn) this).field_b.a(var2_ref.field_q, 109);
                            ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -118, 0, ((wn) this).field_b.field_k);
                            ((wn) this).field_f.a(98, (lm) (Object) var2_ref);
                            var2_ref = (rj) (Object) ((wn) this).field_e.a(65151);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var2_ref = (rj) (Object) ((wn) this).field_l.c(72);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((wn) this).field_b.field_m = 0;
                            ((wn) this).field_b.e(160, 0);
                            ((wn) this).field_b.a(var2_ref.field_q, 91);
                            ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -113, 0, ((wn) this).field_b.field_k);
                            ((wn) this).field_p.a(-114, (lm) (Object) var2_ref);
                            var2_ref = (rj) (Object) ((wn) this).field_l.a(65151);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2_int = 0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 87;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_int = ((wn) this).field_s.a(-73);
                            if (0 > var3_int) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (0 != var3_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((wn) this).field_o = 0;
                            var4 = 0;
                            if (null == ((wn) this).field_c) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((wn) this).field_c.field_H == 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (0 >= var4) {
                                statePc = 73;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = -((wn) this).field_g.field_m + var4;
                            if (var3_int < var5) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((wn) this).field_s.a(((wn) this).field_g.field_k, ((wn) this).field_g.field_m, (byte) 119, var5);
                            if (0 != ((wn) this).field_a) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6 = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var5 <= var6) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((wn) this).field_g.field_k[var6 + ((wn) this).field_g.field_m] = (byte)bn.a((int) ((wn) this).field_g.field_k[var6 + ((wn) this).field_g.field_m], (int) ((wn) this).field_a);
                            var6++;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((wn) this).field_g.field_m = ((wn) this).field_g.field_m + var5;
                            if (var4 <= ((wn) this).field_g.field_m) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (null == ((wn) this).field_c) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((wn) this).field_g.field_m = 0;
                            var6 = ((wn) this).field_g.f(255);
                            var7 = ((wn) this).field_g.k(0);
                            var8 = ((wn) this).field_g.f(255);
                            var9 = ((wn) this).field_g.k(0);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var11 = stackIn_50_0;
                            var12 = ((long)var6 << 1872827296) - -(long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 56;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (rj) (Object) ((wn) this).field_p.c(62);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var14_ref == null) {
                                statePc = 61;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var14_ref.field_q != var12) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (rj) (Object) ((wn) this).field_p.a(65151);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14_ref = (rj) (Object) ((wn) this).field_f.c(96);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var14_ref == null) {
                                statePc = 61;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if ((var14_ref.field_q ^ -1L) != (var12 ^ -1L)) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var14_ref = (rj) (Object) ((wn) this).field_f.a(65151);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var14_ref != null) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var10 == 0) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 9;
                            stackIn_66_0 = stackOut_64_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 5;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var15 = stackIn_66_0;
                            ((wn) this).field_c = var14_ref;
                            ((wn) this).field_c.field_D = new we(var15 + var9 - -((wn) this).field_c.field_B);
                            ((wn) this).field_c.field_D.e(160, var10);
                            ((wn) this).field_c.field_D.d(var9, -59);
                            ((wn) this).field_c.field_H = 10;
                            ((wn) this).field_g.field_m = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (((wn) this).field_c.field_H == 0) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if ((((wn) this).field_g.field_k[0] ^ -1) == 0) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((wn) this).field_c = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((wn) this).field_c.field_H = 1;
                            ((wn) this).field_g.field_m = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var5 = -((wn) this).field_c.field_B + ((wn) this).field_c.field_D.field_k.length;
                            var6 = -((wn) this).field_c.field_H + 512;
                            if (var5 + -((wn) this).field_c.field_D.field_m < var6) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var6 = -((wn) this).field_c.field_D.field_m + var5;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var6 = var3_int;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((wn) this).field_s.a(((wn) this).field_c.field_D.field_k, ((wn) this).field_c.field_D.field_m, (byte) 119, var6);
                            if (((wn) this).field_a == 0) {
                                statePc = 82;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var17 = 0;
                            var7 = var17;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var17 >= var6) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((wn) this).field_c.field_D.field_k[((wn) this).field_c.field_D.field_m + var17] = (byte)bn.a((int) ((wn) this).field_c.field_D.field_k[((wn) this).field_c.field_D.field_m + var17], (int) ((wn) this).field_a);
                            var17++;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((wn) this).field_c.field_H = ((wn) this).field_c.field_H + var6;
                            ((wn) this).field_c.field_D.field_m = ((wn) this).field_c.field_D.field_m + var6;
                            if (var5 != ((wn) this).field_c.field_D.field_m) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((wn) this).field_c.e(17);
                            ((wn) this).field_c.field_v = false;
                            ((wn) this).field_c = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if ((((wn) this).field_c.field_H ^ -1) != -513) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((wn) this).field_c.field_H = 0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var2_int++;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (!param0) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            wn.c(-11);
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            stackOut_89_0 = 1;
                            stackIn_90_0 = stackOut_89_0;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        return stackIn_90_0 != 0;
                    }
                    case 91: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        try {
                            ((wn) this).field_s.b(-1);
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 95: {
                        ((wn) this).field_h = ((wn) this).field_h + 1;
                        ((wn) this).field_s = null;
                        ((wn) this).field_m = -2;
                        if (0 != ((wn) this).b(-30)) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 96: {
                        if (((wn) this).a((byte) 34) != 0) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    }
                    case 97: {
                        return true;
                    }
                    case 98: {
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

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        if (param0 <= 60) {
            wn.d(81);
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
                        if (((wn) this).field_s == null) {
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
                            ((wn) this).field_b.field_m = 0;
                            ((wn) this).field_b.e(160, 6);
                            ((wn) this).field_b.a(3, (byte) 109);
                            ((wn) this).field_b.b(1276387944, 0);
                            ((wn) this).field_s.a(((wn) this).field_b.field_k.length, param0 ^ -103, param0, ((wn) this).field_b.field_k);
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
                            ((wn) this).field_s.b(-1);
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
                        ((wn) this).field_s = null;
                        ((wn) this).field_m = -2;
                        ((wn) this).field_h = ((wn) this).field_h + 1;
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

    final static void c(int param0) {
        int var2 = 0;
        pj var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        pj[] var5 = up.field_n;
        pj[] var1 = var5;
        for (var2 = param0; var5.length > var2; var2++) {
            var3 = var5[var2];
            var3.a(-110);
        }
    }

    final void b(byte param0) {
        int var2 = -89 % ((param0 - 82) / 33);
        if (!(((wn) this).field_s == null)) {
            ((wn) this).field_s.b(-1);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            we stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            we stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            we stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            int stackIn_8_2 = 0;
            we stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            we stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            we stackOut_7_0 = null;
            int stackOut_7_1 = 0;
            int stackOut_7_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == 73) {
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
                        if (((wn) this).field_s == null) {
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
                            ((wn) this).field_b.field_m = 0;
                            stackOut_5_0 = ((wn) this).field_b;
                            stackOut_5_1 = 160;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            if (!param1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (we) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 2;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = (we) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 3;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((we) (Object) stackIn_8_0).e(stackIn_8_1, stackIn_8_2);
                            ((wn) this).field_b.a(0L, -59);
                            ((wn) this).field_s.a(((wn) this).field_b.field_k.length, -85, 0, ((wn) this).field_b.field_k);
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
                            ((wn) this).field_s.b(-1);
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
                        ((wn) this).field_h = ((wn) this).field_h + 1;
                        ((wn) this).field_m = -2;
                        ((wn) this).field_s = null;
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

    public wn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 256;
        field_q = new int[8192];
    }
}
