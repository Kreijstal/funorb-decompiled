/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pf {
    static int field_a;

    final static gg a(byte param0, ae param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        gg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        gg stackOut_0_0 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = 65 / ((-27 - param0) / 52);
                        stackOut_0_0 = sp.a(ra.a(param1, 100, param2), -124);
                        stackIn_1_0 = stackOut_0_0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return stackIn_1_0;
                }
                case 2: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) var3;
                        stackOut_3_1 = new StringBuilder().append("pf.A(").append(param0).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param1 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static tp a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        nj var4 = null;
        tp var5 = null;
        tp var6 = null;
        tp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        b var17 = null;
        String var18 = null;
        int var19 = 0;
        od stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        boolean stackIn_2_3 = false;
        od stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_4_3 = false;
        od stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_5_3 = false;
        int stackIn_5_4 = 0;
        tp stackIn_15_0 = null;
        int stackIn_21_0 = 0;
        tp stackIn_30_0 = null;
        cr stackIn_42_0 = null;
        cr stackIn_44_0 = null;
        cr stackIn_45_0 = null;
        String stackIn_45_1 = null;
        cr stackIn_46_0 = null;
        cr stackIn_48_0 = null;
        cr stackIn_49_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        tp stackIn_65_0 = null;
        int stackIn_74_0 = 0;
        boolean stackIn_78_0 = false;
        int stackIn_92_0 = 0;
        tp stackIn_120_0 = null;
        od stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        boolean stackOut_1_3 = false;
        od stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        boolean stackOut_2_3 = false;
        int stackOut_2_4 = 0;
        od stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        boolean stackOut_4_3 = false;
        int stackOut_4_4 = 0;
        tp stackOut_14_0 = null;
        int stackOut_20_0 = 0;
        tp stackOut_29_0 = null;
        cr stackOut_41_0 = null;
        cr stackOut_42_0 = null;
        String stackOut_42_1 = null;
        cr stackOut_44_0 = null;
        String stackOut_44_1 = null;
        cr stackOut_45_0 = null;
        cr stackOut_46_0 = null;
        String stackOut_46_1 = null;
        cr stackOut_48_0 = null;
        String stackOut_48_1 = null;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        tp stackOut_64_0 = null;
        int stackOut_73_0 = 0;
        boolean stackOut_77_0 = false;
        int stackOut_91_0 = 0;
        tp stackOut_119_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackOut_1_0 = h.field_D.field_Lb;
                        stackOut_1_1 = param2 * ((2 + r.field_f) * 3);
                        stackOut_1_2 = 2;
                        stackOut_1_3 = param1;
                        stackIn_4_0 = stackOut_1_0;
                        stackIn_4_1 = stackOut_1_1;
                        stackIn_4_2 = stackOut_1_2;
                        stackIn_4_3 = stackOut_1_3;
                        stackIn_2_0 = stackOut_1_0;
                        stackIn_2_1 = stackOut_1_1;
                        stackIn_2_2 = stackOut_1_2;
                        stackIn_2_3 = stackOut_1_3;
                        if (wq.field_M != h.field_D.field_Lb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = (od) (Object) stackIn_2_0;
                        stackOut_2_1 = stackIn_2_1;
                        stackOut_2_2 = stackIn_2_2;
                        stackOut_2_3 = stackIn_2_3;
                        stackOut_2_4 = 1;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_5_1 = stackOut_2_1;
                        stackIn_5_2 = stackOut_2_2;
                        stackIn_5_3 = stackOut_2_3;
                        stackIn_5_4 = stackOut_2_4;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (od) (Object) stackIn_4_0;
                        stackOut_4_1 = stackIn_4_1;
                        stackOut_4_2 = stackIn_4_2;
                        stackOut_4_3 = stackIn_4_3;
                        stackOut_4_4 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        stackIn_5_4 = stackOut_4_4;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = ((od) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, -5, 2 + r.field_f) ? 1 : 0;
                        var4 = h.field_D.field_Mb.field_M;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        tp discarded$1 = pf.a(true, true, 108);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = null;
                        if (-3 != (ba.field_d ^ -1)) {
                            statePc = 111;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        wi.field_g.field_lb = true;
                        el.field_a.field_S = Vertigo2.a(new String[1], pq.field_a, 0);
                        h.field_D.field_Lb.field_Lb.field_S = null;
                        var6 = null;
                        var7 = (tp) (Object) var4.a((byte) 100);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 == null) {
                            statePc = 102;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (tp) var7;
                        stackIn_120_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var19 != 0) {
                            statePc = 120;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0.field_M != null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7.field_Jb = new cr(0L, el.field_b);
                        var7.b(var7.field_Jb, 119);
                        var7.field_Kb = new cr(0L, tm.field_b);
                        var7.b(var7.field_Kb, 126);
                        var7.field_Ob = new cr(0L, el.field_b);
                        var7.b(var7.field_Ob, 125);
                        var7.field_Kb.field_O = 2;
                        var8 = 1;
                        var7.i(-2147483648);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7.field_Fb = h.field_D.field_Mb.field_Fb;
                        var9 = 0;
                        if (null != var7.field_Lb) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 = 13369344;
                        var11 = 16737894;
                        stackOut_20_0 = var19;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7.field_Lb != dg.field_d) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var11 = 6750054;
                        var10 = 52224;
                        if (var19 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var11 = 16777062;
                        var10 = 13421568;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var12 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var7.field_Ib == null) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (tp) var7;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!((String) (Object) stackIn_30_0.field_Ib).equals((Object) (Object) "")) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var7.field_Ob.field_Db = qr.field_q;
                        var7.field_Ob.field_B = var11;
                        var12 = 1;
                        var7.field_Ob.a(100, qr.field_q.field_x + 3, r.field_f, var9, 0);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7.field_Kb.field_B = var11;
                        var7.field_Jb.field_B = var11;
                        var7.field_Kb.field_A = var10;
                        var7.field_Jb.field_A = var10;
                        var7.field_Kb.field_K = var11;
                        var7.field_Jb.field_K = var11;
                        var7.field_Kb.field_H = var11;
                        var7.field_Jb.field_H = var11;
                        var13 = 0;
                        var14 = -2 + var7.field_Fb + -80;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var12 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13 = 3 + qr.field_q.field_x;
                        var14 = var14 - var13;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = var7.field_Jb;
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_42_0 = stackOut_41_0;
                        if (var14 <= 0) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (cr) (Object) stackIn_42_0;
                        stackOut_42_1 = cc.a(var7.field_Jb.field_z, var7.field_Mb, var14);
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = (cr) (Object) stackIn_44_0;
                        stackOut_44_1 = var7.field_Mb;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_45_0.field_S = stackIn_45_1;
                        var7.field_Jb.a(81, var14, r.field_f, var9, var13);
                        stackOut_45_0 = var7.field_Kb;
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (null == var7.field_Lb) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (cr) (Object) stackIn_46_0;
                        stackOut_46_1 = var7.field_Lb;
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = (cr) (Object) stackIn_48_0;
                        stackOut_48_1 = aq.field_f;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_49_0.field_S = stackIn_49_1;
                        var7.field_Kb.a(97, 80, r.field_f, var9, -80 + var7.field_Fb);
                        if (var7.field_Jb.field_S.equals((Object) (Object) var7.field_Mb)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = 1;
                        stackIn_53_0 = stackOut_50_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var15 = stackIn_53_0;
                        var9 = var9 + r.field_f;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var3_int != 0) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var7.field_kb = var9 + -var7.field_db;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var8 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        h.field_D.field_Mb.a((byte) 121, (cr) (Object) var6, (cr) (Object) var7, 2);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var6 = var7;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var7.field_Ob == null) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = (tp) var7;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0.field_Ob.field_pb) {
                            statePc = 98;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (-1 == (var7.field_tb ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var16 = var7.field_Mb;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        oq.a(h.field_D.field_Lb, -1, 4462, -1, (String) null, (int[]) null, (cr) (Object) var7, 0L, var16);
                        if (var7.field_Lb == null) {
                            statePc = 86;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = 76;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (ak.a(stackIn_74_0, un.field_Lb.field_k)) {
                            statePc = 86;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = pe.field_r;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0) {
                            statePc = 86;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (hj.field_b) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var17 = un.field_Lb;
                        var18 = Vertigo2.a(new String[1], sc.field_b, -23);
                        var17.field_n.a(var18, 8, 0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var17 = un.field_Lb;
                        var18 = Vertigo2.a(new String[1], hh.field_d, 19);
                        var17.field_n.a(var18, 18, 0);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var5 = var7;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (!var7.field_Jb.field_pb) {
                            statePc = 101;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = var15;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ko.field_S = var7.field_Mb;
                        if (var19 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        ko.field_S = var7.field_Ib;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var7 = (tp) (Object) var4.b(122);
                        if (var19 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (-1 == (h.field_D.field_Hb.field_tb ^ -1)) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        rc.field_d = new un(h.field_D.field_Hb.field_ob, h.field_D.field_Hb.field_C, h.field_D.field_Hb.field_Fb, h.field_D.field_Hb.field_db, kj.field_A, vf.field_B, ee.field_b, ee.field_b);
                        hk.field_n = 0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (-1 != (h.field_D.field_Kb.field_tb ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        rc.field_d = new un(h.field_D.field_Kb.field_ob, h.field_D.field_Kb.field_C, h.field_D.field_Kb.field_Fb, h.field_D.field_Kb.field_db, ce.field_a, vf.field_B, ee.field_b, ee.field_b);
                        hk.field_n = 1;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        wi.field_g.field_lb = false;
                        el.field_a.field_S = b.field_f;
                        if (-2 == (ba.field_d ^ -1)) {
                            statePc = 115;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        h.field_D.field_Lb.field_Lb.field_S = mq.field_t;
                        if (var19 == 0) {
                            statePc = 118;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        h.field_D.field_Lb.field_Lb.field_S = tn.field_r;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        tg.a(0, h.field_D.field_Mb);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = (tp) var5;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    return stackIn_120_0;
                }
                case 121: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) var3, "pf.B(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 2;
    }
}
