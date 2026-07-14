/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa extends wl {
    static int field_r;
    static int field_p;
    private id field_o;
    static int field_q;

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            Object var5 = null;
            gk stackIn_4_0 = null;
            gk stackIn_5_0 = null;
            gk stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            gk stackOut_3_0 = null;
            gk stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            gk stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == ((fa) this).field_o) {
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
                            ((fa) this).field_l.field_h = 0;
                            stackOut_3_0 = ((fa) this).field_l;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            if (!param0) {
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
                            stackOut_4_0 = (gk) (Object) stackIn_4_0;
                            stackOut_4_1 = 2;
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
                            stackOut_5_0 = (gk) (Object) stackIn_5_0;
                            stackOut_5_1 = 3;
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
                            ((gk) (Object) stackIn_6_0).b(stackIn_6_1, -49152);
                            ((fa) this).field_l.a(0L, -1268490168);
                            ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 46, ((fa) this).field_l.field_g.length);
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
                            ((fa) this).field_o.a((byte) 73);
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
                        ((fa) this).field_b = ((fa) this).field_b + 1;
                        ((fa) this).field_a = -2;
                        ((fa) this).field_o = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param1 == 109) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var5 = null;
                        ((fa) this).a(-90, false, (Object) null);
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

    final void b(int param0) {
        try {
            ((fa) this).field_o.a((byte) 73);
            // if_icmpeq L27
            ((fa) this).field_o = null;
        } catch (Exception exception) {
        }
        ((fa) this).field_b = ((fa) this).field_b + 1;
        ((fa) this).field_o = null;
        ((fa) this).field_a = -1;
        ((fa) this).field_m = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ob var2_ref = null;
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
            ob var14_ref = null;
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
                        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (((fa) this).field_o == null) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = pf.a(0);
                        var4 = (int)(-((fa) this).field_e + var2_long);
                        if (-201 > (var4 ^ -1)) {
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
                        ((fa) this).field_e = var2_long;
                        ((fa) this).field_h = ((fa) this).field_h + var4;
                        if ((((fa) this).field_h ^ -1) < -30001) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((fa) this).field_o.a((byte) 73);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((fa) this).field_o = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((fa) this).field_o != null) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (((fa) this).c(24547) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((fa) this).d((byte) -25) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return true;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        try {
                            ((fa) this).field_o.b((byte) 86);
                            var2_ref = (ob) (Object) ((fa) this).field_n.a(true);
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
                            ((fa) this).field_l.field_h = 0;
                            ((fa) this).field_l.b(1, -49152);
                            ((fa) this).field_l.a(var2_ref.field_f, -1268490168);
                            ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 80, ((fa) this).field_l.field_g.length);
                            ((fa) this).field_j.a((bf) (Object) var2_ref, (byte) 95);
                            var2_ref = (ob) (Object) ((fa) this).field_n.c((byte) -75);
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
                            var2_ref = (ob) (Object) ((fa) this).field_i.a(true);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 88;
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
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((fa) this).field_l.field_h = 0;
                            ((fa) this).field_l.b(0, -49152);
                            ((fa) this).field_l.a(var2_ref.field_f, -1268490168);
                            ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 83, ((fa) this).field_l.field_g.length);
                            ((fa) this).field_c.a((bf) (Object) var2_ref, (byte) 127);
                            var2_ref = (ob) (Object) ((fa) this).field_i.c((byte) -75);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param0 < -33) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((fa) this).b((byte) -60);
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
                            var2_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-101 >= var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((fa) this).field_o.c(126);
                            if (var3_int < 0) {
                                statePc = 27;
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
                            statePc = 28;
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
                            if (-1 != var3_int) {
                                statePc = 30;
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
                            return true;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((fa) this).field_h = 0;
                            var4 = 0;
                            if (null != ((fa) this).field_k) {
                                statePc = 32;
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
                            var4 = 10;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-1 == (((fa) this).field_k.field_p ^ -1)) {
                                statePc = 34;
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
                            var4 = 1;
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
                            if (var4 > 0) {
                                statePc = 49;
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
                            var5 = ((fa) this).field_k.field_o.field_g.length + -((fa) this).field_k.field_q;
                            var6 = 512 + -((fa) this).field_k.field_p;
                            if (-((fa) this).field_k.field_o.field_h + var5 >= var6) {
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
                            var6 = -((fa) this).field_k.field_o.field_h + var5;
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
                            if (var6 > var3_int) {
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
                            statePc = 41;
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
                            ((fa) this).field_o.a(var6, true, ((fa) this).field_k.field_o.field_g, ((fa) this).field_k.field_o.field_h);
                            if (((fa) this).field_m == 0) {
                                statePc = 45;
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
                            var7 = 0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var7 >= var6) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((fa) this).field_k.field_o.field_g[((fa) this).field_k.field_o.field_h + var7] = (byte)gi.a((int) ((fa) this).field_k.field_o.field_g[((fa) this).field_k.field_o.field_h + var7], (int) ((fa) this).field_m);
                            var7++;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((fa) this).field_k.field_p = ((fa) this).field_k.field_p + var6;
                            ((fa) this).field_k.field_o.field_h = ((fa) this).field_k.field_o.field_h + var6;
                            if (((fa) this).field_k.field_o.field_h == var5) {
                                statePc = 48;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((((fa) this).field_k.field_p ^ -1) != -513) {
                                statePc = 85;
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
                            ((fa) this).field_k.field_p = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((fa) this).field_k.a(7847);
                            ((fa) this).field_k.field_j = false;
                            ((fa) this).field_k = null;
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
                            var5 = -((fa) this).field_g.field_h + var4;
                            if (var3_int < var5) {
                                statePc = 51;
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
                            statePc = 52;
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
                            ((fa) this).field_o.a(var5, true, ((fa) this).field_g.field_g, ((fa) this).field_g.field_h);
                            if (((fa) this).field_m != 0) {
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
                            if (var5 <= var6) {
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
                            ((fa) this).field_g.field_g[((fa) this).field_g.field_h + var6] = (byte)gi.a((int) ((fa) this).field_g.field_g[((fa) this).field_g.field_h + var6], (int) ((fa) this).field_m);
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
                            ((fa) this).field_g.field_h = ((fa) this).field_g.field_h + var5;
                            if (var4 > ((fa) this).field_g.field_h) {
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
                            if (((fa) this).field_k == null) {
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
                            ((fa) this).field_g.field_h = 0;
                            var6 = ((fa) this).field_g.a((byte) 114);
                            var7 = ((fa) this).field_g.e(14);
                            var8 = ((fa) this).field_g.a((byte) 114);
                            var9 = ((fa) this).field_g.e(-107);
                            var10 = 127 & var8;
                            if (-1 == (128 & var8 ^ -1)) {
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
                            var12 = ((long)var6 << 320106656) - -(long)var7;
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
                            var14_ref = (ob) (Object) ((fa) this).field_j.a(true);
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
                                statePc = 74;
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
                            if ((var12 ^ -1L) != (var14_ref.field_f ^ -1L)) {
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
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (ob) (Object) ((fa) this).field_j.c((byte) -75);
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
                            var14_ref = (ob) (Object) ((fa) this).field_c.a(true);
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
                                statePc = 74;
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
                            if (var12 != var14_ref.field_f) {
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
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var14_ref = (ob) (Object) ((fa) this).field_c.c((byte) -75);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var14_ref != null) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
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
                            ((fa) this).field_k = var14_ref;
                            if (var10 != 0) {
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
                            stackOut_77_0 = 5;
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
                            stackOut_78_0 = 9;
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
                            ((fa) this).field_k.field_o = new gk(((fa) this).field_k.field_q + var9 + var15);
                            ((fa) this).field_k.field_o.b(var10, -49152);
                            ((fa) this).field_k.field_o.a(-803539344, var9);
                            ((fa) this).field_g.field_h = 0;
                            ((fa) this).field_k.field_p = 10;
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
                            if (0 != ((fa) this).field_k.field_p) {
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
                            if (-1 != ((fa) this).field_g.field_g[0]) {
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
                            ((fa) this).field_g.field_h = 0;
                            ((fa) this).field_k.field_p = 1;
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
                            ((fa) this).field_k = null;
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
                            statePc = 24;
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
                            ((fa) this).field_o.a((byte) 73);
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
                        ((fa) this).field_b = ((fa) this).field_b + 1;
                        ((fa) this).field_o = null;
                        ((fa) this).field_a = -2;
                        if (-1 != (((fa) this).c(24547) ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        if (((fa) this).d((byte) -25) == 0) {
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            ob var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (((fa) this).field_o == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((fa) this).field_o.a((byte) 73);
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
                        ((fa) this).field_o = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((fa) this).field_o = (id) param2;
                        this.e(-1);
                        this.a(param1, (byte) 109);
                        ((fa) this).field_k = null;
                        ((fa) this).field_g.field_h = 0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var4_ref2 = (ob) (Object) ((fa) this).field_j.a((byte) -120);
                        if (var4_ref2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((fa) this).field_n.a((bf) (Object) var4_ref2, (byte) -108);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 8: {
                        var4_ref2 = (ob) (Object) ((fa) this).field_c.a((byte) -120);
                        if (var4_ref2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ((fa) this).field_i.a((bf) (Object) var4_ref2, (byte) -9);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((fa) this).field_m != 0) {
                            statePc = 12;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((fa) this).field_l.field_h = 0;
                            ((fa) this).field_l.b(4, -49152);
                            ((fa) this).field_l.b((int) ((fa) this).field_m, -49152);
                            ((fa) this).field_l.a(-803539344, 0);
                            ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 57, ((fa) this).field_l.field_g.length);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((fa) this).field_o.a((byte) 73);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((fa) this).field_o = null;
                        ((fa) this).field_a = -2;
                        ((fa) this).field_b = ((fa) this).field_b + 1;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (param0 < -84) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        field_r = 64;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((fa) this).field_h = 0;
                        ((fa) this).field_e = pf.a(0);
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
        if (((fa) this).field_o != null) {
            ((fa) this).field_o.a((byte) 73);
        }
        if (param0 != 7) {
            this.a(false, (byte) -93);
        }
    }

    public fa() {
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
                        if (param0 == -1) {
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
                        if (((fa) this).field_o != null) {
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
                            ((fa) this).field_l.field_h = 0;
                            ((fa) this).field_l.b(6, -49152);
                            ((fa) this).field_l.e(param0 + 122, 3);
                            ((fa) this).field_l.c(0, 113);
                            ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 23, ((fa) this).field_l.field_g.length);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((fa) this).field_o.a((byte) 73);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((fa) this).field_b = ((fa) this).field_b + 1;
                        ((fa) this).field_a = -2;
                        ((fa) this).field_o = null;
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

    final static void f(int param0) {
        int var2 = 0;
        he var3 = (he) (Object) mb.field_e.a((byte) -117);
        he var1 = var3;
        if (!(var1 == null)) {
            var2 = em.field_B;
            lb.a(10, pl.field_j, (byte) -128, wc.field_e, var2, ii.field_B);
            ie.field_b[var3.field_h].b(25, var2 + 15);
            int discarded$0 = pl.field_e.a(rb.field_hb[var3.field_h], 67, var2 - -15, pl.field_j + -72, ii.field_B + -30, 1, -1, 1, 1, pl.field_e.field_C - -pl.field_e.field_D);
        }
        if (param0 != 1) {
            fa.f(47);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
    }
}
