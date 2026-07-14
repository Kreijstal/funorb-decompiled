/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends pi {
    private int field_F;
    private int field_y;
    private int field_n;
    private int field_H;
    static int field_v;
    private int field_A;
    private int field_z;
    private String[] field_t;
    private int field_r;
    private int field_C;
    private int field_J;
    private int field_o;
    private int field_p;
    private int field_w;
    private int field_E;
    int field_s;
    static byte[][] field_u;
    private int field_D;
    private int field_q;
    static int field_I;
    private int field_G;
    private boolean field_B;
    private float field_x;

    public static void a(byte param0) {
        try {
            field_u = null;
            if (param0 >= -60) {
                field_I = 32;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tm.F(" + param0 + 41);
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 8) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((tm) this).field_B = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1.0f > ((tm) this).field_x) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw lj.a((Throwable) (Object) var2, "tm.A(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        try {
            ((tm) this).field_p = db.field_d;
            ((tm) this).field_E = li.field_c;
            if (param0) {
                ((tm) this).field_A = -66;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tm.E(" + param0 + 41);
        }
    }

    final static void a(pb param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_45_0 = null;
        pb stackIn_49_0 = null;
        Object stackIn_53_0 = null;
        pb stackIn_57_0 = null;
        int stackIn_73_0 = 0;
        short stackIn_73_1 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        Object stackOut_28_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        Object stackOut_44_0 = null;
        pb stackOut_48_0 = null;
        Object stackOut_52_0 = null;
        pb stackOut_56_0 = null;
        int stackOut_72_0 = 0;
        short stackOut_72_1 = 0;
        int[] stackOut_74_0 = null;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param2[3] >> -1438759454;
                        var22 = param2[4] >> -2123204094;
                        var23 = param2[5] >> -1260355742;
                        var24 = param2[6] >> 1488546242;
                        var25 = param2[7] >> 1260932258;
                        var26 = param2[8] >> -1178665982;
                        var27 = param2[9] >> -820210558;
                        var28 = param2[10] >> 654968706;
                        var13 = var26 * param3[5] + (var24 * param3[3] + param3[4] * var25) >> 1072901006;
                        var12 = param3[3] * var21 + (param3[4] * var22 + param3[5] * var23) >> -520637138;
                        var29 = param2[11] >> -136854494;
                        var17 = param3[6] * var27 + param3[7] * var28 + var29 * param3[8] >> -1198368530;
                        var18 = var23 * param3[11] + (var21 * param3[9] + param3[10] * var22) >> 349265294;
                        var19 = var24 * param3[9] - (-(var25 * param3[10]) - param3[11] * var26) >> 668381006;
                        var15 = param3[7] * var22 + param3[6] * var21 - -(param3[8] * var23) >> -1539282514;
                        var20 = var29 * param3[11] + var27 * param3[9] + param3[10] * var28 >> 1382583758;
                        var14 = param3[3] * var27 + var28 * param3[4] + param3[5] * var29 >> 761327406;
                        var16 = var26 * param3[8] + (param3[6] * var24 + var25 * param3[7]) >> 745049038;
                        var21 = -param2[0] + param3[0];
                        var22 = param3[1] - param2[1];
                        var23 = param3[2] - param2[2];
                        var9 = var23 * param2[5] + (var22 * param2[4] + param2[3] * var21) >> -ml.field_d + 16;
                        var11 = param2[10] * var22 + var21 * param2[9] + var23 * param2[11] >> -145897456;
                        var10 = var22 * param2[7] + var21 * param2[6] - -(param2[8] * var23) >> -ml.field_d + 16;
                        var21 = dj.field_d;
                        var22 = dj.field_c;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 == -363953584) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_I = 80;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var23 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param0.field_y ^ -1) >= (var23 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var24 = param0.field_n[var23];
                        var25 = param0.field_M[var23];
                        var26 = param0.field_Q[var23];
                        var27 = var9 + (var26 * var18 + var24 * var12 + var25 * var15 >> 16 - ml.field_d);
                        var28 = var10 - -(var19 * var26 + var24 * var13 - -(var25 * var16) >> 16 - ml.field_d);
                        var29 = (var17 * var25 + var14 * var24 + var20 * var26 >> -563390512) + var11;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var29 < 50) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        wa.field_d[var23] = var27 / var29 + var21;
                        ti.field_O[var23] = var28 / var29 + var22;
                        if (var29 <= var8) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = var29;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        oc.field_l[var23] = var29;
                        if ((var29 ^ -1) <= (var7_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7_int = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        oc.field_l[var23] = -2147483648;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!param5) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        kk.field_b[var23] = var27 >> ml.field_d;
                        dm.field_d[var23] = var28 >> ml.field_d;
                        nf.field_d[var23] = var29;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var23++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param0.field_b == null) {
                            statePc = 68;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = null;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == (Object) (Object) param0.field_D) {
                            statePc = 68;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = null;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == (Object) (Object) param0.field_o) {
                            statePc = 68;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = null;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == (Object) (Object) param0.field_p) {
                            statePc = 68;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = null;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == (Object) (Object) param0.field_N) {
                            statePc = 68;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = null;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 == (Object) (Object) param0.field_S) {
                            statePc = 68;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = (pb) param0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0.field_m == null) {
                            statePc = 68;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = null;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == (Object) (Object) param0.field_L) {
                            statePc = 68;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = (pb) param0;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0.field_k != null) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var23 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var23 ^ -1) <= (param0.field_I ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var24 = param0.field_b[var23];
                        var25 = param0.field_D[var23];
                        var26 = param0.field_o[var23];
                        sd.field_g[var23] = var9 - -(var25 * var15 + var24 * var12 + var18 * var26 >> -1613428336);
                        kk.field_c[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> -585034512) + var10;
                        mj.field_n[var23] = (var24 * var14 + (var17 * var25 - -(var20 * var26)) >> -410258832) + var11;
                        var24 = param0.field_p[var23];
                        var25 = param0.field_N[var23];
                        var26 = param0.field_S[var23];
                        bl.field_z[var23] = (var24 * var12 + (var25 * var15 + var18 * var26) >> 1183260560) + var9;
                        jc.field_F[var23] = var10 + (var13 * var24 + var25 * var16 - -(var19 * var26) >> 591515536);
                        id.field_b[var23] = var11 + (var14 * var24 + var17 * var25 + var20 * var26 >> 1079038224);
                        var24 = param0.field_m[var23];
                        var25 = param0.field_L[var23];
                        var26 = param0.field_k[var23];
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        qg.field_n[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> -226410736);
                        pk.field_f[var23] = (var25 * var16 + var13 * var24 + var26 * var19 >> -363953584) + var10;
                        wc.field_a[var23] = (var20 * var26 + var25 * var17 + var24 * var14 >> -34052304) + var11;
                        var23++;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (param4) {
                            statePc = 71;
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
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var9 = param3[3];
                        var10 = param3[4];
                        var11 = param3[5];
                        var12 = param3[6];
                        var13 = param3[7];
                        var14 = param3[8];
                        var15 = param3[9];
                        var16 = param3[10];
                        var17 = param3[11];
                        var18 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = var18;
                        stackOut_72_1 = param0.field_g;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 >= stackIn_73_1) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = fb.field_b;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = stackIn_75_0.length;
                        stackOut_75_1 = var18;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = stackIn_76_0;
                        stackOut_76_1 = stackIn_76_1;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_78_1 = stackOut_76_1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 <= stackIn_78_1) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var19 = param0.field_C[var18];
                        var20 = param0.field_q[var18];
                        var21 = param0.field_B[var18];
                        fb.field_b[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> -1577322032;
                        sf.field_a[var18] = var10 * var19 + (var20 * var13 + var16 * var21) >> 315659824;
                        h.field_a[var18] = var17 * var21 + (var14 * var20 + var19 * var11) >> -254115120;
                        var18++;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ri.a(param6, var7_int, var8, param0, 0);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) var7;
                        stackOut_85_1 = new StringBuilder().append("tm.D(");
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (param0 == null) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                        stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                        stackOut_86_2 = "{...}";
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_89_2 = stackOut_86_2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 88: {
                    stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                    stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
                    stackOut_88_2 = "null";
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    try {
                        stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                        stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(44).append(param1).append(44);
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        if (param2 == null) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
                        stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
                        stackOut_90_2 = "{...}";
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_93_2 = stackOut_90_2;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 92: {
                    stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
                    stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
                    stackOut_92_2 = "null";
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    try {
                        stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                        stackOut_93_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(44);
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        if (param3 == null) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
                        stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
                        stackOut_94_2 = "{...}";
                        stackIn_97_0 = stackOut_94_0;
                        stackIn_97_1 = stackOut_94_1;
                        stackIn_97_2 = stackOut_94_2;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 96: {
                    stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                    stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
                    stackOut_96_2 = "null";
                    stackIn_97_0 = stackOut_96_0;
                    stackIn_97_1 = stackOut_96_1;
                    stackIn_97_2 = stackOut_96_2;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    throw lj.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                case 98: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        Object stackIn_6_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 3) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        var2_int = -li.field_c + ((tm) this).field_E;
                        var3 = -db.field_d + ((tm) this).field_p;
                        var4 = var2_int + ((tm) this).field_z;
                        var5 = ((tm) this).field_C + var3;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((tm) this).field_q ^ -1) <= -1) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
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
                        if (!((tm) this).field_B) {
                            statePc = 28;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((tm) this).field_x < 1.0f) {
                            statePc = 30;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 404;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 < (var4 ^ -1)) {
                            statePc = 28;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = var4;
                        stackIn_17_0 = stackOut_16_0;
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
                        if ((stackIn_17_0 ^ -1) < -641) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var5;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 > 480) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var5;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 >= -40 + -((tm) this).field_A) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw lj.a((Throwable) (Object) var2, "tm.C(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, byte param1) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_float = 1.0f - ((tm) this).field_x;
                        var4 = var3_float * var3_float;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((tm) this).field_z = (int)(0.5f + (((tm) this).field_x * 2.0f * var3_float * (float)((tm) this).field_w + var4 * (float)((tm) this).field_y + ((tm) this).field_x * ((tm) this).field_x * (float)((tm) this).field_o));
                        ((tm) this).field_C = (int)(0.5f + ((float)((tm) this).field_r * (((tm) this).field_x * ((tm) this).field_x) + (var4 * (float)((tm) this).field_H + (float)((tm) this).field_n * (((tm) this).field_x * 2.0f * var3_float))));
                        ((tm) this).field_x = ((tm) this).field_x + 0.019999999552965164f;
                        ((tm) this).field_G = ((tm) this).field_G + ((tm) this).field_F;
                        if (param1 >= 21) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        tm.a((pb) null, 112, (int[]) null, (int[]) null, true, false, true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((tm) this).field_q = ((tm) this).field_q - 1;
                        if (1.0f >= ((tm) this).field_x) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((tm) this).field_x = 1.0f;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (1 > ((tm) this).field_G) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((tm) this).field_G >= 255) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((tm) this).field_F = -10;
                        ((tm) this).field_G = 255;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((tm) this).field_F = 10;
                        ((tm) this).field_G = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw lj.a((Throwable) (Object) var3, "tm.B(" + param0 + 44 + param1 + 41);
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        var28 = MinerDisturbance.field_ab;
        if (d.field_b) {
          L0: {
            var2_int = ce.field_d.field_I + (ce.field_d.field_E - 2);
            if (-471 > (350 + ((tm) this).field_A ^ -1)) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 <= (((tm) this).field_D ^ -1)) {
              break L1;
            } else {
              if ((((tm) this).field_J ^ -1) >= -1) {
                break L1;
              } else {
                ef.field_b[3].a(-li.field_c + (((tm) this).field_D + -ef.field_b[3].field_x), (ef.field_b[3].field_A >> 1179547202) + (((tm) this).field_J - db.field_d), ((tm) this).field_G ^ -1 | ((tm) this).field_G << 1972890860);
                break L1;
              }
            }
          }
          L2: {
            L3: {
              var3 = -li.field_c + ((tm) this).field_E;
              var4 = -db.field_d + ((tm) this).field_p;
              var5 = ca.field_k * 32 + -li.field_c + sk.field_d / 10;
              var6 = -db.field_d + 32 * hf.field_t - -(mf.field_i / 10);
              var7 = 360;
              if ((var5 ^ -1) >= (-96 + (((tm) this).field_z - -var3) - 32 ^ -1)) {
                break L3;
              } else {
                if ((45 + (((tm) this).field_z - -var3 - (-var7 - 96)) ^ -1) >= (var5 ^ -1)) {
                  break L3;
                } else {
                  if (var6 <= -128 + (var4 + ((tm) this).field_C)) {
                    break L3;
                  } else {
                    if (40 + ((tm) this).field_A + (((tm) this).field_C - -var4 + 96) <= var6) {
                      break L3;
                    } else {
                      L4: {
                        if (!((tm) this).field_B) {
                          break L4;
                        } else {
                          if (((tm) this).field_x >= 1.0f) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L2;
          }
          L5: {
            var8 = stackIn_20_0;
            if (var8 != 0) {
              L6: {
                var9 = 0;
                var10 = a.field_a[0].field_x >> 671904225;
                var11 = a.field_a[0].field_A >> 1802860673;
                var12 = var10 + var5 + 96;
                var13 = var11 + var6 + 96;
                var14 = var11 + var6 + -96;
                var15 = var10 + var5 - 96;
                var16 = 0;
                if (-1 >= (var15 ^ -1)) {
                  break L6;
                } else {
                  var16 = var15 * -1;
                  var15 = 0;
                  break L6;
                }
              }
              L7: {
                var17 = 0;
                if (var14 >= 0) {
                  break L7;
                } else {
                  var14 = 0;
                  break L7;
                }
              }
              L8: {
                if (eh.field_g + -1 < var12) {
                  var17 = var12 - -1 - eh.field_g;
                  var12 = -1 + eh.field_g;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var14 <= -1 + eh.field_c) {
                  break L9;
                } else {
                  var14 = eh.field_c - 1;
                  break L9;
                }
              }
              L10: while (true) {
                if ((var14 ^ -1) <= (var13 ^ -1)) {
                  break L5;
                } else {
                  var9 = var9 + var16;
                  var18 = var15;
                  L11: while (true) {
                    if (var18 >= var12) {
                      var9 = var9 + var17;
                      var14++;
                      continue L10;
                    } else {
                      var9++;
                      m.field_j[var9] = eh.field_f[var14 * eh.field_g + var18];
                      var18++;
                      continue L11;
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
          L12: {
            if (!((tm) this).field_B) {
              g.a(var4 + ((tm) this).field_C, 60 + ((tm) this).field_A, var3 + ((tm) this).field_z, var7 + 60, (byte) 93, hd.field_d);
              break L12;
            } else {
              L13: {
                var9 = var7 - -60;
                var9 = var9 - (ah.field_c[2].field_x + ah.field_c[0].field_x);
                var10 = ((tm) this).field_A + 60;
                var9 = var9 / ah.field_c[1].field_x * ah.field_c[1].field_x;
                var9 = var9 + (ah.field_c[2].field_x + ah.field_c[0].field_x);
                var10 = var10 - (ah.field_c[0].field_A - -ah.field_c[6].field_A);
                var10 = (var10 / ah.field_c[3].field_A + 1) * ah.field_c[3].field_A;
                if ((var7 - -60 ^ -1) < (var9 ^ -1)) {
                  var9 = var9 + ah.field_c[1].field_x;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var10 = var10 + (ah.field_c[0].field_A + ah.field_c[6].field_A);
                if (((tm) this).field_A + 60 > var10) {
                  var10 = var10 + ah.field_c[1].field_A;
                  break L14;
                } else {
                  break L14;
                }
              }
              var11 = 60 + var7 - var9;
              var12 = -var10 + 60 + ((tm) this).field_A;
              g.a(((tm) this).field_C + var4 - -(var12 / 2), var10, var3 + (((tm) this).field_z + var11 / 2), var9, (byte) 31, ah.field_c);
              break L12;
            }
          }
          L15: {
            var9 = 0;
            var10 = 30 + ((tm) this).field_z + var3;
            var11 = var4 + (40 + ((tm) this).field_C);
            var12 = 0;
            if (!((tm) this).field_B) {
              break L15;
            } else {
              var12 = mm.field_a.field_I - -mm.field_a.field_E;
              mm.field_a.a(oe.field_f, var10, var11, 1, 8063303);
              break L15;
            }
          }
          var13 = 0;
          if (param0 == 94) {
            L16: while (true) {
              if ((((tm) this).field_t.length ^ -1) >= (var13 ^ -1)) {
                L17: {
                  var13 = 0;
                  if (-4 != (((tm) this).field_s ^ -1)) {
                    if (((tm) this).field_s != 9) {
                      if (-3 == (((tm) this).field_s ^ -1)) {
                        fl.field_j[8].c(var10, var11);
                        var13 = fl.field_j[8].field_j;
                        break L17;
                      } else {
                        L18: {
                          if (0 == ((tm) this).field_s) {
                            break L18;
                          } else {
                            if (16 != ((tm) this).field_s) {
                              if (((tm) this).field_s != 13) {
                                break L17;
                              } else {
                                fl.field_j[9].c(var10, 15 + var11);
                                var13 = fl.field_j[9].field_j;
                                break L17;
                              }
                            } else {
                              break L18;
                            }
                          }
                        }
                        fl.field_j[5].c(var10, var11 + 20);
                        var13 = fl.field_j[5].field_j;
                        break L17;
                      }
                    } else {
                      fl.field_j[3].c(var10, 35 + var11);
                      var13 = fl.field_j[3].field_j;
                      break L17;
                    }
                  } else {
                    fl.field_j[7].c(var10, var11 + 35);
                    break L17;
                  }
                }
                L19: {
                  if (!((tm) this).field_B) {
                    ce.field_d.a(aj.field_a, var10, var12 + (var11 - -(var2_int * (var9 - -1))), 1, -1);
                    ce.field_d.c(qe.field_d, -15 + (var10 - -var7 + var13), var11 - (-(var2_int * (var9 - -1)) + -var12), 1, -1);
                    ce.field_d.c(Integer.toString(((tm) this).field_q / 100), var13 + (var7 + var10), var11 - (-(var2_int * (1 + var9)) - var12), 1, -1);
                    break L19;
                  } else {
                    ce.field_d.a(ni.field_b, var10, (1 + var9) * var2_int + var11 - -var12, 1, -1);
                    break L19;
                  }
                }
                L20: {
                  if (var8 == 0) {
                    break L20;
                  } else {
                    L21: {
                      var14 = 0;
                      var15 = a.field_a[0].field_x >> 675825793;
                      var16 = a.field_a[0].field_A >> 1248886913;
                      var17 = var15 + (var5 + 96);
                      var18 = var16 + (var6 + 96);
                      var19 = var16 + (-96 + var6);
                      var20 = var15 + var5 - 96;
                      var21 = 0;
                      if (-1 >= (var20 ^ -1)) {
                        break L21;
                      } else {
                        var21 = var20 * -1;
                        var20 = 0;
                        break L21;
                      }
                    }
                    L22: {
                      var22 = 0;
                      if (-1 + eh.field_g >= var17) {
                        break L22;
                      } else {
                        var22 = -eh.field_g - -1 + var17;
                        var17 = -1 + eh.field_g;
                        break L22;
                      }
                    }
                    L23: {
                      if (0 > var19) {
                        var19 = 0;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (eh.field_c - 1 >= var19) {
                        break L24;
                      } else {
                        var19 = -1 + eh.field_c;
                        break L24;
                      }
                    }
                    L25: while (true) {
                      if (var19 >= var18) {
                        break L20;
                      } else {
                        var14 = var14 + var21;
                        var23 = var20;
                        L26: while (true) {
                          if (var17 <= var23) {
                            var14 = var14 + var22;
                            var19++;
                            continue L25;
                          } else {
                            var24 = ec.field_b[var14];
                            var25 = -var24 + 256;
                            var26 = eh.field_f[eh.field_g * var19 - -var23];
                            var14++;
                            var27 = m.field_j[var14];
                            eh.field_f[var23 + eh.field_g * var19] = c.a(16711680, var24 * c.a(var27, 65280) - -(c.a(var26, 65280) * var25)) + c.a(-16711936, var25 * c.a(var26, 16711935) + c.a(var27, 16711935) * var24) >> 1964181640;
                            var23++;
                            continue L26;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L27: {
                  L28: {
                    L29: {
                      if (3 != ((tm) this).field_s) {
                        break L29;
                      } else {
                        if (1 >= var13) {
                          break L29;
                        } else {
                          if (5 > var13) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    if (16 == ((tm) this).field_s) {
                      break L28;
                    } else {
                      if ((((tm) this).field_s ^ -1) == -14) {
                        break L28;
                      } else {
                        if ((((tm) this).field_s ^ -1) == -1) {
                          break L28;
                        } else {
                          if (2 == ((tm) this).field_s) {
                            break L28;
                          } else {
                            if ((((tm) this).field_s ^ -1) != -10) {
                              var7 = 360;
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                  }
                  var7 = 313;
                  break L27;
                }
                int discarded$1 = ce.field_d.a(((tm) this).field_t[var13], -var7 + 360 + var10, var12 + var9 * var2_int + var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var2_int);
                var9 = var9 + ce.field_d.a(((tm) this).field_t[var13], var7);
                var13++;
                continue L16;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    tm(int param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_11_0 = null;
        int stackIn_15_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_46_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_14_0 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_45_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (e.field_i[param0].length != 1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((tm) this).field_t = e.field_i[param0][0];
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((tm) this).field_t = e.field_i[param0][cm.field_o];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (null != ((tm) this).field_t) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 7: {
                }
                case 8: {
                    try {
                        ((tm) this).field_J = param2;
                        ((tm) this).field_q = 2000;
                        ((tm) this).field_x = 0.0f;
                        ((tm) this).field_s = param0;
                        ((tm) this).field_D = param1;
                        ((tm) this).field_B = param3;
                        var5_int = ce.field_d.field_I + (ce.field_d.field_E + -2);
                        var6 = 360;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-10 == (((tm) this).field_s ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackIn_11_0 = stackOut_10_0;
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
                        if (((tm) this).field_s == 2) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = -1;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 == (((tm) this).field_s ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = this;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((tm) this).field_s == 16) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((tm) this).field_s != 13) {
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = 313;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var7 >= ((tm) this).field_t.length) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((tm) this).field_s != 3) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var7 ^ -1) >= -2) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6 = 320;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((tm) this).field_A = ((tm) this).field_A + ce.field_d.a(((tm) this).field_t[var7], var6);
                        var7++;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ((tm) this).field_A = ((tm) this).field_A + ce.field_d.a(uf.field_v, var6);
                        ((tm) this).field_A = ((tm) this).field_A * var5_int;
                        ((tm) this).field_A = ((tm) this).field_A + 10;
                        if (((tm) this).field_B) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((tm) this).field_A = ((tm) this).field_A + (mm.field_a.field_E + mm.field_a.field_I);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7 = 380;
                        if (0 < param1) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        param1 = 320;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param1 = param1 - li.field_c;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8 = 20 + ((tm) this).field_A;
                        var9 = -var8 + (-64 + 32 * hf.field_t) - db.field_d;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((tm) this).field_o = 32 * ca.field_k - li.field_c + -180;
                        if ((db.field_d + var9 ^ -1) > -33) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = this;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((tm) this).field_B) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var9 = 64 + (32 * hf.field_t + -db.field_d);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((tm) this).field_z = -var7;
                        ((tm) this).field_C = 480 + var8;
                        if (-1 >= (((tm) this).field_o ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((tm) this).field_o = 64;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((((tm) this).field_o ^ -1) >= (1024 + -li.field_c - 405 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((tm) this).field_o = -li.field_c + 555;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ((tm) this).field_H = ((tm) this).field_C;
                        ((tm) this).field_y = ((tm) this).field_z;
                        ((tm) this).field_r = var9;
                        ((tm) this).field_w = 180 + (((tm) this).field_r + ((tm) this).field_z);
                        ((tm) this).field_E = li.field_c;
                        ((tm) this).field_p = db.field_d;
                        ((tm) this).field_n = ((tm) this).field_C - -((tm) this).field_o + ((tm) this).field_A / 2;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw lj.a((Throwable) (Object) var5, "tm.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 65: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new byte[250][];
    }
}
