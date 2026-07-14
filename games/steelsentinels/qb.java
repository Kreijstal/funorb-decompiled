/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends kd {
    static boolean field_J;
    int field_D;
    int field_A;
    boolean field_G;
    int field_B;
    int field_P;
    static gh field_K;
    int field_M;
    int field_O;
    static String[][] field_y;
    static fm field_H;
    ee field_z;
    int field_I;
    int field_F;
    static gh field_E;
    static String field_C;
    static gk[] field_L;
    static String field_N;

    public static void h(int param0) {
        field_E = null;
        field_L = null;
        field_y = null;
        field_H = null;
        field_K = null;
        field_N = null;
        if (param0 != -185837884) {
            return;
        }
        try {
            field_C = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qb.E(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        wk[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_array = pd.field_Q;
                        if (qd.field_g <= 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6_array = bg.field_C;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = 8 * a.field_c / 50 % var6_array.length;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        de.a(-param1 + param4, param3 + -param1, vh.field_b, param0 + 2 * param1, 160, (byte) -31, param1 * 2 - -param5);
                        var6_array[var7].e(param4, param3, 2254472);
                        pb.d(16, 4, -4 + param4, param3 - 4, 8 + param0, param5 + 8);
                        if (param2 >= 26) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        qb.a(112, -62, (String) null, 84, (String) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6_array[var7].e(param4, param3, 17561);
                        pb.d(8, 2, -4 + param4, param3 + -4, 8 + param0, param5 - -8);
                        var6_array[var7].a(param4, param3, 255);
                        var8 = param0 + 2 * param1;
                        var9 = 2 * param1 + param5;
                        var10 = a.field_c / 10 % 2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 >= var8) {
                            statePc = 16;
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
                        pb.f(param4 + (-param1 + var10), param3 - param1, var9, 0, 100);
                        var10 += 2;
                        if (var11 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var6, "qb.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        ek stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        int stackIn_137_4 = 0;
        ek stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        int stackIn_139_3 = 0;
        int stackIn_139_4 = 0;
        ek stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        int stackIn_140_2 = 0;
        int stackIn_140_3 = 0;
        int stackIn_140_4 = 0;
        int stackIn_140_5 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        ek stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        int stackOut_136_3 = 0;
        int stackOut_136_4 = 0;
        ek stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        ek stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        int stackOut_139_2 = 0;
        int stackOut_139_3 = 0;
        int stackOut_139_4 = 0;
        int stackOut_139_5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = (((qb) this).field_F >> -510533528) + param0;
                        var6 = -124 / ((-25 - param3) / 54);
                        var7 = (((qb) this).field_B >> 333824392) + param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int < -32) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = -673;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 > (var5_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var7;
                        stackIn_8_0 = stackOut_7_0;
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
                        if ((stackIn_8_0 ^ -1) > 31) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = -673;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 > (var7 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var8 = ((qb) this).field_I * 8 / ((qb) this).field_D;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 < (var8 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var8 > 7) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8 = 7;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-1 == (((qb) this).field_M ^ -1)) {
                            statePc = 132;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((qb) this).field_M == 1) {
                            statePc = 127;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (((qb) this).field_M == 3) {
                            statePc = 122;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-3 != (((qb) this).field_M ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!param2) {
                            statePc = 143;
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
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                        var9 = 2;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        cc.field_pc[var8].c(-var9 + var5_int, -var9 + var7, 2 * var9, 2 * var9);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((qb) this).field_M != 4) {
                            statePc = 50;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param2) {
                            statePc = 143;
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
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9 = 16;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        bm.field_S[var8].d(-var9 + var5_int, -var9 + var7, var9 * 2, 2 * var9, 128);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-6 == (((qb) this).field_M ^ -1)) {
                            statePc = 117;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((((qb) this).field_M ^ -1) != -7) {
                            statePc = 61;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
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
                        if (param2) {
                            statePc = 143;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9 = 2;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        bm.field_S[var8].d(-var9 + var5_int, var7 + -var9, var9 * 2, 2 * var9, 128);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (7 != ((qb) this).field_M) {
                            statePc = 71;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (!param2) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var9 = 1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        vi.field_gb[var8].d(-var9 + var5_int, var7 + -var9, 2 * var9, var9 * 2, 128);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((((qb) this).field_M ^ -1) == -9) {
                            statePc = 110;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-10 != (((qb) this).field_M ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (param2) {
                            statePc = 143;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var9 = 4;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        vi.field_gb[7 + -var8].a(-var9 + var5_int, -var9 + var7, var9 * 2, var9 * 2, 200 + -(((qb) this).field_I * 200 / ((qb) this).field_D));
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (12 != ((qb) this).field_M) {
                            statePc = 92;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (!param2) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var9 = 2;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        bm.field_S[2 & var8].d(var5_int - var9, -var9 + var7, 2 * var9, 2 * var9, -(((qb) this).field_I * 250 / ((qb) this).field_D) + 250);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (-14 == (((qb) this).field_M ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if ((((qb) this).field_M ^ -1) != -15) {
                            statePc = 143;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (param2) {
                            statePc = 143;
                        } else {
                            statePc = 99;
                        }
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var9 = (500 + -(2 * ((qb) this).field_I)) / 125;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        pb.a(var5_int << 759095524, var7 << -2109422300, var9 << 1724654468, 31, hc.field_W);
                        if (var10 == 0) {
                            statePc = 143;
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
                        if (!param2) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var9 = 16;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        pb.a(var5_int << 833743716, var7 << -865814940, var9 << -1094477020, 249, hc.field_X);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (!param2) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var8 = Math.max(0, Math.min(15, 16 * ((qb) this).field_I / ((qb) this).field_D));
                        var9 = 4;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        cc.field_pc[var8].c(var5_int - var9, var7 - var9, var9 * 2, 2 * var9);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (param2) {
                            statePc = 143;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var9 = 4;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        bm.field_S[var8].d(-var9 + var5_int, -var9 + var7, 2 * var9, 2 * var9, 128);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (param2) {
                            statePc = 143;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var9 = 2;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        vi.field_gb[var8].d(var5_int - var9, var7 - var9, var9 * 2, 2 * var9, 128);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (param2) {
                            statePc = 143;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var9 = 16;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        vi.field_gb[var8].d(var5_int + -var9, var7 + -var9, var9 * 2, 2 * var9, 128);
                        if (var10 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (!param2) {
                            statePc = 143;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var8 = Math.max(0, Math.min(15, ((qb) this).field_I * 16 / ((qb) this).field_D));
                        var9 = 17;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        stackOut_136_0 = cc.field_pc[var8];
                        stackOut_136_1 = -var9 + var5_int;
                        stackOut_136_2 = -var9 + var7;
                        stackOut_136_3 = 2 * var9;
                        stackOut_136_4 = var9 * 2;
                        stackIn_139_0 = stackOut_136_0;
                        stackIn_139_1 = stackOut_136_1;
                        stackIn_139_2 = stackOut_136_2;
                        stackIn_139_3 = stackOut_136_3;
                        stackIn_139_4 = stackOut_136_4;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        stackIn_137_2 = stackOut_136_2;
                        stackIn_137_3 = stackOut_136_3;
                        stackIn_137_4 = stackOut_136_4;
                        if (((qb) this).field_D / 2 > ((qb) this).field_I) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = (ek) (Object) stackIn_137_0;
                        stackOut_137_1 = stackIn_137_1;
                        stackOut_137_2 = stackIn_137_2;
                        stackOut_137_3 = stackIn_137_3;
                        stackOut_137_4 = stackIn_137_4;
                        stackOut_137_5 = 505 - ((qb) this).field_I * 500 / ((qb) this).field_D;
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_140_2 = stackOut_137_2;
                        stackIn_140_3 = stackOut_137_3;
                        stackIn_140_4 = stackOut_137_4;
                        stackIn_140_5 = stackOut_137_5;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = (ek) (Object) stackIn_139_0;
                        stackOut_139_1 = stackIn_139_1;
                        stackOut_139_2 = stackIn_139_2;
                        stackOut_139_3 = stackIn_139_3;
                        stackOut_139_4 = stackIn_139_4;
                        stackOut_139_5 = 255;
                        stackIn_140_0 = stackOut_139_0;
                        stackIn_140_1 = stackOut_139_1;
                        stackIn_140_2 = stackOut_139_2;
                        stackIn_140_3 = stackOut_139_3;
                        stackIn_140_4 = stackOut_139_4;
                        stackIn_140_5 = stackOut_139_5;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        ((ek) (Object) stackIn_140_0).a(stackIn_140_1, stackIn_140_2, stackIn_140_3, stackIn_140_4, stackIn_140_5);
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 142: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var5, "qb.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 143: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -15809) {
                break L0;
              } else {
                field_H = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((qb) this).field_z = null;
        }
    }

    final static boolean g(int param0) {
        RuntimeException var1 = null;
        int stackIn_8_0 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 2) {
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
                        qb.a(-13, 21, (byte) 84, -39, 29, 95);
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
                        if (wb.field_c != null) {
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
                        stackOut_5_0 = kc.field_q;
                        stackIn_8_0 = stackOut_5_0 ? 1 : 0;
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
                        stackOut_7_0 = 1;
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
                    var1 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var1, "qb.C(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        qb var2_ref = null;
        int var3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        Object stackIn_34_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_69_0 = 0;
        Object stackIn_73_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_29_0 = 0;
        Object stackOut_33_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_68_0 = 0;
        Object stackOut_72_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((qb) this).field_z == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        ((qb) this).field_F = ((qb) this).field_F + ((qb) this).field_A;
                        ((qb) this).field_B = ((qb) this).field_B + ((qb) this).field_O;
                        if (param0 >= 1) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        qb.a(-116, -34, (String) null, -4, (String) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (200 > ((qb) this).field_I) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((qb) this).field_I = ((qb) this).field_I + (int)(Math.random() * 4.0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((qb) this).field_z.field_ab.b(110) != 4) {
                            statePc = 15;
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
                        statePc = 90;
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
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((qb) this).field_G) {
                            statePc = 54;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> -1931591708) > -(((qb) this).field_B >> 1824617828)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
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
                case 19: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-3 != (((qb) this).field_z.field_ab.b(51) ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = -2049;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 > (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> -924936188) ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((((qb) this).field_M ^ -1) == -3) {
                            statePc = 45;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 3;
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
                        if (stackIn_30_0 == ((qb) this).field_M) {
                            statePc = 45;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = this;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (((qb) this).field_M == 9) {
                            statePc = 45;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = 10;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == ((qb) this).field_M) {
                            statePc = 45;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = -7;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 != (((qb) this).field_M ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((qb) this).field_z.field_ab.b((byte) 126, ((qb) this).field_F >> -1768096412) ^ -1) == (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 1781033092) ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((qb) this).field_B = -(((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> -2046493820) << -185837884);
                        if (var3 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((qb) this).field_F = ((qb) this).field_F - ((qb) this).field_A;
                        ((qb) this).field_A = 0;
                        if (var3 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (((qb) this).field_z.field_ab.b((byte) 122, ((qb) this).field_F >> 895258980) >= -(((qb) this).field_B >> -860137116)) {
                            statePc = 86;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((((qb) this).field_M ^ -1) == -3) {
                            statePc = 76;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = this;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((((qb) this).field_M ^ -1) == -4) {
                            statePc = 76;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = this;
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
                        if ((((qb) this).field_M ^ -1) == -10) {
                            statePc = 76;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = -11;
                        stackIn_69_0 = stackOut_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 == (((qb) this).field_M ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = this;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((((qb) this).field_M ^ -1) != -7) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (((qb) this).field_z.field_ab.b((byte) 127, ((qb) this).field_F >> -1797909084) == ((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 1775051620)) {
                            statePc = 82;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ((qb) this).field_B = -(((qb) this).field_z.field_ab.b((byte) 118, ((qb) this).field_F >> -952125852) << 929856708);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if ((((qb) this).field_z.field_ab.b((byte) 120, ((qb) this).field_F >> -1277612988) ^ -1) == (((qb) this).field_z.field_ab.a(false, ((qb) this).field_F >> 1627761636) ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((qb) this).field_G = false;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (((qb) this).field_z.field_ab.a((byte) -96, ((qb) this).field_F >> 1213464132) <= -(((qb) this).field_B >> 456330820)) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        ((qb) this).field_B = -(((qb) this).field_z.field_ab.a((byte) -128, ((qb) this).field_F >> 2126624996) << -2138205980);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((((qb) this).field_M ^ -1) == -11) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        ((qb) this).field_A = ((qb) this).field_A * 9 / 10;
                        ((qb) this).field_O = ((qb) this).field_O * 9 / 10;
                        if (var3 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        ((qb) this).field_O = ((qb) this).field_O + ((qb) this).field_z.field_z;
                        var2_ref = nk.a(9, 0, ((qb) this).field_z, 105, ((qb) this).field_B, ((qb) this).field_G, 100, 0, ((qb) this).field_F, ((qb) this).field_P);
                        ((qb) this).field_z.field_O.a(3, (ck) (Object) var2_ref);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        ((qb) this).field_I = ((qb) this).field_I + 1;
                        if ((((qb) this).field_I ^ -1) < (((qb) this).field_D ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        ((qb) this).field_z.field_J.a((byte) 110, (kd) this);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var2, "qb.G(" + param0 + 41);
                }
                case 101: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        vd.field_d.field_zb = vd.field_d.field_zb + wh.field_e.field_zb;
                        vd.field_d.field_Db = param4;
                        vd.field_d.field_S = param2;
                        vd.field_d.field_nb = param1;
                        var5_int = -48 % ((-12 - param0) / 61);
                        wh.field_e.field_Y = wh.field_e.field_Y + wh.field_e.field_zb;
                        wh.field_e.field_zb = param3;
                        vd.field_d.field_zb = vd.field_d.field_zb - wh.field_e.field_zb;
                        wh.field_e.field_Y = wh.field_e.field_Y - wh.field_e.field_zb;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("qb.F(").append(param0).append(44).append(param1).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param2 == null) {
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
                    try {
                        stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                        stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param3).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param4 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qb() {
    }

    final static void a(nk param0, gh param1, byte param2, boolean param3, int param4, int param5) {
        Object var6 = null;
        wk[] var6_array = null;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = SteelSentinels.field_G;
          var6 = null;
          if (!param3) {
            break L0;
          } else {
            if ((param0.field_N ^ -1) > -1) {
              break L0;
            } else {
              if (-2 == (param0.field_Q ^ -1)) {
                break L0;
              } else {
                var6_array = hl.field_p;
                if ((var6_array.length ^ -1) < (param0.field_N ^ -1)) {
                  break L0;
                } else {
                  var6_array = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var6_array == null) {
            break L1;
          } else {
            if (null == var6_array[param0.field_N]) {
              break L1;
            } else {
              param1.field_Pb = var6_array[param0.field_N];
              return;
            }
          }
        }
        L2: {
          var7 = new wk(param4, param5);
          param1.field_Pb = var7;
          if (null != var6_array) {
            var6_array[param0.field_N] = var7;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2 == -93) {
            break L3;
          } else {
            field_C = null;
            break L3;
          }
        }
        L4: {
          L5: {
            param1.field_Pb.d();
            if ((param0.field_Q ^ -1) == -2) {
              break L5;
            } else {
              L6: {
                var8 = param4 / 2;
                var9 = param5 / 2;
                if ((param0.field_Q ^ -1) != -17) {
                  break L6;
                } else {
                  var8 -= 10;
                  break L6;
                }
              }
              L7: {
                var10 = hj.field_w;
                if ((param0.field_N ^ -1) == -32) {
                  var8 -= 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (64 == param0.field_Q) {
                  var8 -= 20;
                  var9 += 7;
                  hj.field_w = 2048;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0.field_Q == 128) {
                  var8 += 5;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (-257 == (param0.field_Q ^ -1)) {
                  var8 += 10;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param0.field_Q != 2) {
                  break L11;
                } else {
                  var8 -= 10;
                  var9 += 10;
                  break L11;
                }
              }
              L12: {
                if ((param0.field_N ^ -1) != -96) {
                  break L12;
                } else {
                  var8 -= 20;
                  break L12;
                }
              }
              L13: {
                if (4 != param0.field_Q) {
                  break L13;
                } else {
                  var9 -= 20;
                  hj.field_w = 3072;
                  break L13;
                }
              }
              L14: {
                if (param0.field_N == 76) {
                  var8 -= 20;
                  param0 = ul.a(102, (byte) 67);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (66 == param0.field_N) {
                  var8 -= 20;
                  param0 = ul.a(99, (byte) 67);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if ((param0.field_Q ^ -1) != -2049) {
                  break L16;
                } else {
                  var9 -= 20;
                  hj.field_w = 2048;
                  break L16;
                }
              }
              L17: {
                if ((param0.field_N ^ -1) != -81) {
                  break L17;
                } else {
                  var8 -= 10;
                  var9 += 10;
                  break L17;
                }
              }
              L18: {
                if ((param0.field_Q ^ -1) == -9) {
                  var9 += 20;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (-60 == (param0.field_N ^ -1)) {
                  var9 -= 25;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (param0.field_N == 71) {
                  var9 -= 15;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (77 != param0.field_N) {
                  break L21;
                } else {
                  var9 -= 10;
                  break L21;
                }
              }
              L22: {
                L23: {
                  L24: {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              L30: {
                                L31: {
                                  L32: {
                                    L33: {
                                      L34: {
                                        L35: {
                                          L36: {
                                            L37: {
                                              L38: {
                                                L39: {
                                                  L40: {
                                                    L41: {
                                                      L42: {
                                                        L43: {
                                                          L44: {
                                                            L45: {
                                                              L46: {
                                                                L47: {
                                                                  L48: {
                                                                    L49: {
                                                                      L50: {
                                                                        L51: {
                                                                          L52: {
                                                                            L53: {
                                                                              L54: {
                                                                                L55: {
                                                                                  L56: {
                                                                                    L57: {
                                                                                      L58: {
                                                                                        L59: {
                                                                                          L60: {
                                                                                            L61: {
                                                                                              L62: {
                                                                                                L63: {
                                                                                                  L64: {
                                                                                                    L65: {
                                                                                                      L66: {
                                                                                                        L67: {
                                                                                                          L68: {
                                                                                                            L69: {
                                                                                                              L70: {
                                                                                                                L71: {
                                                                                                                  L72: {
                                                                                                                    L73: {
                                                                                                                      L74: {
                                                                                                                        var11 = param0.field_N;
                                                                                                                        if (1 == var11) {
                                                                                                                          break L74;
                                                                                                                        } else {
                                                                                                                          L75: {
                                                                                                                            if (53 != var11) {
                                                                                                                              break L75;
                                                                                                                            } else {
                                                                                                                              if (var12 == 0) {
                                                                                                                                break L73;
                                                                                                                              } else {
                                                                                                                                break L75;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          L76: {
                                                                                                                            if (60 != var11) {
                                                                                                                              break L76;
                                                                                                                            } else {
                                                                                                                              if (var12 == 0) {
                                                                                                                                break L72;
                                                                                                                              } else {
                                                                                                                                break L76;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          if ((var11 ^ -1) == -62) {
                                                                                                                            break L71;
                                                                                                                          } else {
                                                                                                                            L77: {
                                                                                                                              if (var11 != 64) {
                                                                                                                                break L77;
                                                                                                                              } else {
                                                                                                                                if (var12 == 0) {
                                                                                                                                  break L70;
                                                                                                                                } else {
                                                                                                                                  break L77;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            if (68 == var11) {
                                                                                                                              break L69;
                                                                                                                            } else {
                                                                                                                              L78: {
                                                                                                                                if ((var11 ^ -1) != -75) {
                                                                                                                                  break L78;
                                                                                                                                } else {
                                                                                                                                  if (var12 == 0) {
                                                                                                                                    break L68;
                                                                                                                                  } else {
                                                                                                                                    break L78;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              if ((var11 ^ -1) == -79) {
                                                                                                                                break L67;
                                                                                                                              } else {
                                                                                                                                L79: {
                                                                                                                                  if (-83 != (var11 ^ -1)) {
                                                                                                                                    break L79;
                                                                                                                                  } else {
                                                                                                                                    if (var12 == 0) {
                                                                                                                                      break L66;
                                                                                                                                    } else {
                                                                                                                                      break L79;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                if (-88 == (var11 ^ -1)) {
                                                                                                                                  break L65;
                                                                                                                                } else {
                                                                                                                                  L80: {
                                                                                                                                    if ((var11 ^ -1) != -92) {
                                                                                                                                      break L80;
                                                                                                                                    } else {
                                                                                                                                      if (var12 == 0) {
                                                                                                                                        break L64;
                                                                                                                                      } else {
                                                                                                                                        break L80;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  L81: {
                                                                                                                                    if (95 != var11) {
                                                                                                                                      break L81;
                                                                                                                                    } else {
                                                                                                                                      if (var12 == 0) {
                                                                                                                                        break L63;
                                                                                                                                      } else {
                                                                                                                                        break L81;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  if (-3 == (var11 ^ -1)) {
                                                                                                                                    break L62;
                                                                                                                                  } else {
                                                                                                                                    if (var11 == 56) {
                                                                                                                                      break L61;
                                                                                                                                    } else {
                                                                                                                                      L82: {
                                                                                                                                        if (var11 != 66) {
                                                                                                                                          break L82;
                                                                                                                                        } else {
                                                                                                                                          if (var12 == 0) {
                                                                                                                                            break L60;
                                                                                                                                          } else {
                                                                                                                                            break L82;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      if (var11 == 99) {
                                                                                                                                        break L60;
                                                                                                                                      } else {
                                                                                                                                        L83: {
                                                                                                                                          if (-71 != (var11 ^ -1)) {
                                                                                                                                            break L83;
                                                                                                                                          } else {
                                                                                                                                            if (var12 == 0) {
                                                                                                                                              break L59;
                                                                                                                                            } else {
                                                                                                                                              break L83;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        if (var11 == 76) {
                                                                                                                                          break L58;
                                                                                                                                        } else {
                                                                                                                                          if (-103 == (var11 ^ -1)) {
                                                                                                                                            break L58;
                                                                                                                                          } else {
                                                                                                                                            if (-86 == (var11 ^ -1)) {
                                                                                                                                              break L57;
                                                                                                                                            } else {
                                                                                                                                              L84: {
                                                                                                                                                if (80 != var11) {
                                                                                                                                                  break L84;
                                                                                                                                                } else {
                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                    break L56;
                                                                                                                                                  } else {
                                                                                                                                                    break L84;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              if (89 == var11) {
                                                                                                                                                break L55;
                                                                                                                                              } else {
                                                                                                                                                if (var11 == 93) {
                                                                                                                                                  break L54;
                                                                                                                                                } else {
                                                                                                                                                  L85: {
                                                                                                                                                    if (var11 != 3) {
                                                                                                                                                      break L85;
                                                                                                                                                    } else {
                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                        break L53;
                                                                                                                                                      } else {
                                                                                                                                                        break L85;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  if (54 == var11) {
                                                                                                                                                    break L52;
                                                                                                                                                  } else {
                                                                                                                                                    if (-68 == (var11 ^ -1)) {
                                                                                                                                                      break L51;
                                                                                                                                                    } else {
                                                                                                                                                      L86: {
                                                                                                                                                        if (var11 != 71) {
                                                                                                                                                          break L86;
                                                                                                                                                        } else {
                                                                                                                                                          if (var12 == 0) {
                                                                                                                                                            break L50;
                                                                                                                                                          } else {
                                                                                                                                                            break L86;
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                      if (-74 == (var11 ^ -1)) {
                                                                                                                                                        break L49;
                                                                                                                                                      } else {
                                                                                                                                                        L87: {
                                                                                                                                                          if (var11 != 77) {
                                                                                                                                                            break L87;
                                                                                                                                                          } else {
                                                                                                                                                            if (var12 == 0) {
                                                                                                                                                              break L48;
                                                                                                                                                            } else {
                                                                                                                                                              break L87;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        L88: {
                                                                                                                                                          if (81 != var11) {
                                                                                                                                                            break L88;
                                                                                                                                                          } else {
                                                                                                                                                            if (var12 == 0) {
                                                                                                                                                              break L47;
                                                                                                                                                            } else {
                                                                                                                                                              break L88;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        if (86 == var11) {
                                                                                                                                                          break L46;
                                                                                                                                                        } else {
                                                                                                                                                          if (-91 == (var11 ^ -1)) {
                                                                                                                                                            break L45;
                                                                                                                                                          } else {
                                                                                                                                                            L89: {
                                                                                                                                                              if (var11 != 83) {
                                                                                                                                                                break L89;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L44;
                                                                                                                                                                } else {
                                                                                                                                                                  break L89;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            L90: {
                                                                                                                                                              if (-29 != (var11 ^ -1)) {
                                                                                                                                                                break L90;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L43;
                                                                                                                                                                } else {
                                                                                                                                                                  break L90;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            L91: {
                                                                                                                                                              if ((var11 ^ -1) != -30) {
                                                                                                                                                                break L91;
                                                                                                                                                              } else {
                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                  break L42;
                                                                                                                                                                } else {
                                                                                                                                                                  break L91;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            if (var11 == 30) {
                                                                                                                                                              break L41;
                                                                                                                                                            } else {
                                                                                                                                                              L92: {
                                                                                                                                                                if (var11 != 31) {
                                                                                                                                                                  break L92;
                                                                                                                                                                } else {
                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                    break L40;
                                                                                                                                                                  } else {
                                                                                                                                                                    break L92;
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                              if (-36 == (var11 ^ -1)) {
                                                                                                                                                                break L39;
                                                                                                                                                              } else {
                                                                                                                                                                if ((var11 ^ -1) == -33) {
                                                                                                                                                                  break L38;
                                                                                                                                                                } else {
                                                                                                                                                                  L93: {
                                                                                                                                                                    if ((var11 ^ -1) != -34) {
                                                                                                                                                                      break L93;
                                                                                                                                                                    } else {
                                                                                                                                                                      if (var12 == 0) {
                                                                                                                                                                        break L37;
                                                                                                                                                                      } else {
                                                                                                                                                                        break L93;
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                  if (34 == var11) {
                                                                                                                                                                    break L36;
                                                                                                                                                                  } else {
                                                                                                                                                                    L94: {
                                                                                                                                                                      if (var11 != 38) {
                                                                                                                                                                        break L94;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (var12 == 0) {
                                                                                                                                                                          break L35;
                                                                                                                                                                        } else {
                                                                                                                                                                          break L94;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                    L95: {
                                                                                                                                                                      if (43 != var11) {
                                                                                                                                                                        break L95;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (var12 == 0) {
                                                                                                                                                                          break L34;
                                                                                                                                                                        } else {
                                                                                                                                                                          break L95;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                    if (var11 == 48) {
                                                                                                                                                                      break L33;
                                                                                                                                                                    } else {
                                                                                                                                                                      if ((var11 ^ -1) == -53) {
                                                                                                                                                                        break L32;
                                                                                                                                                                      } else {
                                                                                                                                                                        if (var11 == 46) {
                                                                                                                                                                          break L31;
                                                                                                                                                                        } else {
                                                                                                                                                                          L96: {
                                                                                                                                                                            if (var11 != 45) {
                                                                                                                                                                              break L96;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (var12 == 0) {
                                                                                                                                                                                break L30;
                                                                                                                                                                              } else {
                                                                                                                                                                                break L96;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                          if ((var11 ^ -1) == -45) {
                                                                                                                                                                            break L29;
                                                                                                                                                                          } else {
                                                                                                                                                                            L97: {
                                                                                                                                                                              if (47 != var11) {
                                                                                                                                                                                break L97;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                                  break L28;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L97;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            L98: {
                                                                                                                                                                              if (-37 != (var11 ^ -1)) {
                                                                                                                                                                                break L98;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                                  break L27;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L98;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            if (37 == var11) {
                                                                                                                                                                              break L26;
                                                                                                                                                                            } else {
                                                                                                                                                                              L99: {
                                                                                                                                                                                if (51 != var11) {
                                                                                                                                                                                  break L99;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                                    break L25;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L99;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                              L100: {
                                                                                                                                                                                if (var11 != 50) {
                                                                                                                                                                                  break L100;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (var12 == 0) {
                                                                                                                                                                                    break L24;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    break L100;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                              if ((var11 ^ -1) != -50) {
                                                                                                                                                                                break L22;
                                                                                                                                                                              } else {
                                                                                                                                                                                if (var12 == 0) {
                                                                                                                                                                                  break L23;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L74;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      var8 += 5;
                                                                                                                      var9 -= 8;
                                                                                                                      if (var12 == 0) {
                                                                                                                        break L22;
                                                                                                                      } else {
                                                                                                                        break L73;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    var9 += 2;
                                                                                                                    var8 -= 7;
                                                                                                                    if (var12 == 0) {
                                                                                                                      break L22;
                                                                                                                    } else {
                                                                                                                      break L72;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  var9 -= 4;
                                                                                                                  var8 += 10;
                                                                                                                  if (var12 == 0) {
                                                                                                                    break L22;
                                                                                                                  } else {
                                                                                                                    break L71;
                                                                                                                  }
                                                                                                                }
                                                                                                                var9 -= 5;
                                                                                                                var8 -= 4;
                                                                                                                if (var12 == 0) {
                                                                                                                  break L22;
                                                                                                                } else {
                                                                                                                  break L70;
                                                                                                                }
                                                                                                              }
                                                                                                              var9 -= 6;
                                                                                                              if (var12 == 0) {
                                                                                                                break L22;
                                                                                                              } else {
                                                                                                                break L69;
                                                                                                              }
                                                                                                            }
                                                                                                            var8 += 4;
                                                                                                            var9 -= 10;
                                                                                                            if (var12 == 0) {
                                                                                                              break L22;
                                                                                                            } else {
                                                                                                              break L68;
                                                                                                            }
                                                                                                          }
                                                                                                          var9 -= 10;
                                                                                                          var8 -= 8;
                                                                                                          if (var12 == 0) {
                                                                                                            break L22;
                                                                                                          } else {
                                                                                                            break L67;
                                                                                                          }
                                                                                                        }
                                                                                                        var9 -= 2;
                                                                                                        if (var12 == 0) {
                                                                                                          break L22;
                                                                                                        } else {
                                                                                                          break L66;
                                                                                                        }
                                                                                                      }
                                                                                                      var8 -= 4;
                                                                                                      var9 += 9;
                                                                                                      if (var12 == 0) {
                                                                                                        break L22;
                                                                                                      } else {
                                                                                                        break L65;
                                                                                                      }
                                                                                                    }
                                                                                                    var9 -= 3;
                                                                                                    if (var12 == 0) {
                                                                                                      break L22;
                                                                                                    } else {
                                                                                                      break L64;
                                                                                                    }
                                                                                                  }
                                                                                                  hj.field_w = 3000;
                                                                                                  var8 += 8;
                                                                                                  if (var12 == 0) {
                                                                                                    break L22;
                                                                                                  } else {
                                                                                                    break L63;
                                                                                                  }
                                                                                                }
                                                                                                var9 += 10;
                                                                                                hj.field_w = 3300;
                                                                                                var8 += 4;
                                                                                                if (var12 == 0) {
                                                                                                  break L22;
                                                                                                } else {
                                                                                                  break L62;
                                                                                                }
                                                                                              }
                                                                                              var8 -= 7;
                                                                                              var9 += 8;
                                                                                              if (var12 == 0) {
                                                                                                break L22;
                                                                                              } else {
                                                                                                break L61;
                                                                                              }
                                                                                            }
                                                                                            var9--;
                                                                                            hj.field_w = 2500;
                                                                                            if (var12 == 0) {
                                                                                              break L22;
                                                                                            } else {
                                                                                              break L60;
                                                                                            }
                                                                                          }
                                                                                          var9 += 4;
                                                                                          hj.field_w = 2500;
                                                                                          if (var12 == 0) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            break L59;
                                                                                          }
                                                                                        }
                                                                                        var9 += 4;
                                                                                        var8 -= 4;
                                                                                        if (var12 == 0) {
                                                                                          break L22;
                                                                                        } else {
                                                                                          break L58;
                                                                                        }
                                                                                      }
                                                                                      hj.field_w = 2700;
                                                                                      if (var12 == 0) {
                                                                                        break L22;
                                                                                      } else {
                                                                                        break L57;
                                                                                      }
                                                                                    }
                                                                                    var9 += 10;
                                                                                    if (var12 == 0) {
                                                                                      break L22;
                                                                                    } else {
                                                                                      break L56;
                                                                                    }
                                                                                  }
                                                                                  var8 += 4;
                                                                                  var9 += 2;
                                                                                  if (var12 == 0) {
                                                                                    break L22;
                                                                                  } else {
                                                                                    break L55;
                                                                                  }
                                                                                }
                                                                                var9 += 8;
                                                                                var8 += 6;
                                                                                hj.field_w = 1600;
                                                                                if (var12 == 0) {
                                                                                  break L22;
                                                                                } else {
                                                                                  break L54;
                                                                                }
                                                                              }
                                                                              var9 += 2;
                                                                              hj.field_w = 1024;
                                                                              var8 -= 2;
                                                                              if (var12 == 0) {
                                                                                break L22;
                                                                              } else {
                                                                                break L53;
                                                                              }
                                                                            }
                                                                            var8 += 12;
                                                                            var9 -= 4;
                                                                            if (var12 == 0) {
                                                                              break L22;
                                                                            } else {
                                                                              break L52;
                                                                            }
                                                                          }
                                                                          var9 -= 14;
                                                                          if (var12 == 0) {
                                                                            break L22;
                                                                          } else {
                                                                            break L51;
                                                                          }
                                                                        }
                                                                        var9 -= 10;
                                                                        var8 += 12;
                                                                        if (var12 == 0) {
                                                                          break L22;
                                                                        } else {
                                                                          break L50;
                                                                        }
                                                                      }
                                                                      var9 -= 8;
                                                                      var8 -= 15;
                                                                      if (var12 == 0) {
                                                                        break L22;
                                                                      } else {
                                                                        break L49;
                                                                      }
                                                                    }
                                                                    hj.field_w = 2900;
                                                                    if (var12 == 0) {
                                                                      break L22;
                                                                    } else {
                                                                      break L48;
                                                                    }
                                                                  }
                                                                  var9 -= 4;
                                                                  var8 += 13;
                                                                  if (var12 == 0) {
                                                                    break L22;
                                                                  } else {
                                                                    break L47;
                                                                  }
                                                                }
                                                                hj.field_w = 3000;
                                                                var9 -= 2;
                                                                if (var12 == 0) {
                                                                  break L22;
                                                                } else {
                                                                  break L46;
                                                                }
                                                              }
                                                              hj.field_w = 2300;
                                                              var8 += 25;
                                                              if (var12 == 0) {
                                                                break L22;
                                                              } else {
                                                                break L45;
                                                              }
                                                            }
                                                            var9 -= 6;
                                                            if (var12 == 0) {
                                                              break L22;
                                                            } else {
                                                              break L44;
                                                            }
                                                          }
                                                          var8 += 8;
                                                          if (var12 == 0) {
                                                            break L22;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                        var8 += 4;
                                                        if (var12 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                      var8 += 3;
                                                      if (var12 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                    var8 += 3;
                                                    var9 -= 4;
                                                    if (var12 == 0) {
                                                      break L22;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                  var8 -= 3;
                                                  hj.field_w = 2800;
                                                  if (var12 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                hj.field_w = 3500;
                                                var8 -= 2;
                                                if (var12 == 0) {
                                                  break L22;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              hj.field_w = 2800;
                                              var8 -= 10;
                                              if (var12 == 0) {
                                                break L22;
                                              } else {
                                                break L37;
                                              }
                                            }
                                            var8 -= 3;
                                            hj.field_w = 3800;
                                            if (var12 == 0) {
                                              break L22;
                                            } else {
                                              break L36;
                                            }
                                          }
                                          var8 -= 4;
                                          hj.field_w = 3800;
                                          if (var12 == 0) {
                                            break L22;
                                          } else {
                                            break L35;
                                          }
                                        }
                                        hj.field_w = 3900;
                                        var8 -= 2;
                                        if (var12 == 0) {
                                          break L22;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      var8 += 8;
                                      if (var12 == 0) {
                                        break L22;
                                      } else {
                                        break L33;
                                      }
                                    }
                                    var9--;
                                    var8 += 4;
                                    if (var12 == 0) {
                                      break L22;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var8 += 3;
                                  hj.field_w = 1800;
                                  if (var12 == 0) {
                                    break L22;
                                  } else {
                                    break L31;
                                  }
                                }
                                var8 += 4;
                                hj.field_w = 1800;
                                if (var12 == 0) {
                                  break L22;
                                } else {
                                  break L30;
                                }
                              }
                              var8 += 2;
                              hj.field_w = 1550;
                              if (var12 == 0) {
                                break L22;
                              } else {
                                break L29;
                              }
                            }
                            var9 -= 2;
                            var8 += 7;
                            if (var12 == 0) {
                              break L22;
                            } else {
                              break L28;
                            }
                          }
                          var8 += 4;
                          if (var12 == 0) {
                            break L22;
                          } else {
                            break L27;
                          }
                        }
                        hj.field_w = 3600;
                        if (var12 == 0) {
                          break L22;
                        } else {
                          break L26;
                        }
                      }
                      hj.field_w = 3600;
                      if (var12 == 0) {
                        break L22;
                      } else {
                        break L25;
                      }
                    }
                    hj.field_w = 3600;
                    if (var12 == 0) {
                      break L22;
                    } else {
                      break L24;
                    }
                  }
                  hj.field_w = 3600;
                  if (var12 == 0) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
                var8 += 3;
                hj.field_w = 2200;
                break L22;
              }
              L101: {
                if (-1 == (3086 & param0.field_Q ^ -1)) {
                  break L101;
                } else {
                  if ((param4 ^ -1) >= -101) {
                    break L101;
                  } else {
                    var8 -= 5;
                    break L101;
                  }
                }
              }
              param0.a(0, false, var8, var9, (byte) 49, 16384);
              hj.field_w = var10;
              if (var12 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          L102: {
            var8 = hj.field_w;
            if (-1 != (param0.field_N ^ -1)) {
              break L102;
            } else {
              hj.field_w = 1200;
              break L102;
            }
          }
          L103: {
            if (55 != param0.field_N) {
              break L103;
            } else {
              hj.field_w = 1200;
              break L103;
            }
          }
          L104: {
            if (57 == param0.field_N) {
              hj.field_w = 1300;
              break L104;
            } else {
              break L104;
            }
          }
          L105: {
            if ((param0.field_N ^ -1) != -63) {
              break L105;
            } else {
              hj.field_w = 1400;
              break L105;
            }
          }
          L106: {
            if (65 != param0.field_N) {
              break L106;
            } else {
              hj.field_w = 1000;
              break L106;
            }
          }
          L107: {
            if ((param0.field_N ^ -1) != -70) {
              break L107;
            } else {
              hj.field_w = 1400;
              break L107;
            }
          }
          L108: {
            if (72 != param0.field_N) {
              break L108;
            } else {
              hj.field_w = 1000;
              break L108;
            }
          }
          L109: {
            if (param0.field_N == 75) {
              hj.field_w = 1000;
              break L109;
            } else {
              break L109;
            }
          }
          L110: {
            if (param0.field_N != 79) {
              break L110;
            } else {
              hj.field_w = 1000;
              break L110;
            }
          }
          L111: {
            if (-85 != (param0.field_N ^ -1)) {
              break L111;
            } else {
              hj.field_w = 1000;
              break L111;
            }
          }
          L112: {
            if (param0.field_N != 88) {
              break L112;
            } else {
              hj.field_w = 1000;
              break L112;
            }
          }
          L113: {
            if (-93 == (param0.field_N ^ -1)) {
              hj.field_w = 700;
              break L113;
            } else {
              break L113;
            }
          }
          param0.a(0, false, param4 / 2, param5, (byte) 49, 0);
          hj.field_w = var8;
          break L4;
        }
        sb.field_bb.b((byte) 123);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[][]{new String[2], new String[5], new String[6]};
        field_H = new fm(10, 2, 2, 0);
        field_C = "Enter multiplayer lobby";
        field_N = "Confirm Password: ";
    }
}
