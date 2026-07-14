/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends kg {
    int field_F;
    static pf field_K;
    int field_L;
    int field_E;
    int field_D;
    int field_M;
    static String field_J;
    static tc field_I;
    int field_H;

    final static nf i(int param0) {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        nf stackIn_6_0 = null;
        Object stackOut_3_0 = null;
        nf stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (da.field_g == param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = null;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return (nf) (Object) stackIn_4_0;
                }
                case 5: {
                    try {
                        stackOut_5_0 = wm.field_d[da.field_g + -1];
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "rp.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static hb a(int param0, wb param1) {
        RuntimeException var2 = null;
        vf stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        vf stackOut_4_0 = null;
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
                        if (param0 < -102) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        rp.h(-96);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = new vf(param1);
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (hb) (Object) stackIn_5_0;
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var2;
                        stackOut_7_1 = new StringBuilder().append("rp.C(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
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
                    throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static gm a(int param0, qf param1, int param2) {
        RuntimeException var3 = null;
        gm stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        gm stackOut_4_0 = null;
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
                        if (param0 == 96) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_J = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = e.a(param2 * param1.field_a / 96, -108, param1.field_f);
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var3;
                        stackOut_7_1 = new StringBuilder().append("rp.D(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
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
                    throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_K = null;
            field_I = null;
            field_J = null;
            if (param0 != 4) {
                field_J = null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rp.F(" + param0 + 41);
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!super.a(param0, param1, (byte) 98, param3, param4, param5, param6)) {
                            statePc = 25;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var8_int = -((rp) this).field_m + (-param4 - (((rp) this).field_M - param1));
                        var9 = param3 - (param5 + ((rp) this).field_q) + -((rp) this).field_L;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((rp) this).field_E * ((rp) this).field_E > var8_int * var8_int + var9 * var9) {
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = Math.atan2((double)var9, (double)var8_int) - n.field_p;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var10 < 0.0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0.0 < var10) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = var10 + 3.141592653589793 / (double)((rp) this).field_F;
                        if (var12 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = var10 - 3.141592653589793 / (double)((rp) this).field_F;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((rp) this).field_H = (int)((double)((rp) this).field_F * var10 / 6.283185307179586);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((((rp) this).field_F ^ -1) < (((rp) this).field_H ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((rp) this).field_H = ((rp) this).field_H - ((rp) this).field_F;
                        if (var12 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (0 <= ((rp) this).field_H) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((rp) this).field_H = ((rp) this).field_H + ((rp) this).field_F;
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        if (param2 > 95) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        nf discarded$1 = rp.i(34);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var8 = (RuntimeException) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        stackOut_32_0 = (RuntimeException) var8;
                        stackOut_32_1 = new StringBuilder().append("rp.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param6 == null) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                        stackOut_33_2 = "{...}";
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_36_2 = stackOut_33_2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                    stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                    stackOut_35_2 = "null";
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    throw r.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void h(int param0) {
        sl var1 = null;
        int var2 = 0;
        mj var3_ref_mj = null;
        int var3 = 0;
        long var3_long = 0L;
        fb var3_ref_fb = null;
        fb var4 = null;
        fb var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        String var5_ref = null;
        fb var5_ref_fb = null;
        mj var6 = null;
        String var7 = null;
        mj var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        mj stackIn_23_0 = null;
        mj stackIn_24_0 = null;
        mj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_91_0 = null;
        String stackIn_92_0 = null;
        String stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        boolean stackIn_170_0 = false;
        boolean stackIn_171_0 = false;
        int stackIn_181_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        mj stackOut_22_0 = null;
        mj stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        mj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_90_0 = null;
        String stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        String stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        boolean stackOut_169_0 = false;
        boolean stackOut_170_0 = false;
        int stackOut_180_0 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var1 = sa.field_a;
          if (param0 >= 69) {
            break L0;
          } else {
            String discarded$1 = rp.a(false, (String) null, (java.applet.Applet) null);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = ((ob) (Object) var1).j(-119);
            if ((var2 ^ -1) == -1) {
              break L2;
            } else {
              if (var2 == 1) {
                break L2;
              } else {
                if ((var2 ^ -1) == -3) {
                  break L2;
                } else {
                  if (-4 == (var2 ^ -1)) {
                    break L2;
                  } else {
                    if (4 == var2) {
                      break L2;
                    } else {
                      L3: {
                        if (var2 != 5) {
                          break L3;
                        } else {
                          L4: {
                            var3_long = ((ob) (Object) var1).d(75);
                            var5_ref = ((ob) (Object) var1).e(-1);
                            var6 = (mj) (Object) ((ob) (Object) var1).e(-1);
                            var7 = ((ob) (Object) var1).e(-1);
                            var8_ref = ta.a(115, var3_long);
                            if (((String) (Object) var6).equals((Object) (Object) "")) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L4;
                            } else {
                              stackOut_14_0 = 1;
                              stackIn_16_0 = stackOut_14_0;
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              var9 = stackIn_16_0;
                              if (null != var8_ref) {
                                break L6;
                              } else {
                                var8_ref = new mj(var5_ref, var7, var3_long);
                                ShatteredPlansClient.field_H.a(var3_long, (df) (Object) var8_ref, true);
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if (var9 != 0) {
                              var8_ref.a(var7, var5_ref, (byte) 64);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L7: {
                            var8_ref.field_zb = pr.a(14274) + -(long)((ob) (Object) var1).a(16711680);
                            var8_ref.field_Qb = ((ob) (Object) var1).f(-20976);
                            var10 = ((ob) (Object) var1).c(false);
                            var8_ref.field_Fb = var10 >> -1804493439;
                            stackOut_22_0 = (mj) var8_ref;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if ((1 & var10) == 0) {
                              stackOut_24_0 = (mj) (Object) stackIn_24_0;
                              stackOut_24_1 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              stackIn_25_1 = stackOut_24_1;
                              break L7;
                            } else {
                              stackOut_23_0 = (mj) (Object) stackIn_23_0;
                              stackOut_23_1 = 1;
                              stackIn_25_0 = stackOut_23_0;
                              stackIn_25_1 = stackOut_23_1;
                              break L7;
                            }
                          }
                          stackIn_25_0.field_Ub = stackIn_25_1 != 0;
                          var8_ref.field_Lb = ((ob) (Object) var1).j(-122);
                          var8_ref.field_Wb = ((ob) (Object) var1).j(-109);
                          f.a((byte) -60, var8_ref);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L8: {
                        if (var2 == 6) {
                          break L8;
                        } else {
                          L9: {
                            if ((var2 ^ -1) == -8) {
                              break L9;
                            } else {
                              L10: {
                                if (8 == var2) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (9 != var2) {
                                      break L11;
                                    } else {
                                      L12: {
                                        var3 = ((ob) (Object) var1).f(-20976);
                                        var4_int = ((ob) (Object) var1).j(-98);
                                        var5_ref_fb = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                        if (var5_ref_fb != null) {
                                          L13: {
                                            L14: {
                                              if (var4_int == 0) {
                                                break L14;
                                              } else {
                                                var5_ref_fb.field_hc = var4_int;
                                                var5_ref_fb.field_Nb = ks.field_i;
                                                if (var11 == 0) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            var5_ref_fb.b((byte) -62);
                                            break L13;
                                          }
                                          var5_ref_fb.a(16);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (10 != var2) {
                                      break L15;
                                    } else {
                                      var3_ref_fb = (fb) (Object) kj.field_a.d(0);
                                      L16: while (true) {
                                        L17: {
                                          if (var3_ref_fb == null) {
                                            break L17;
                                          } else {
                                            var3_ref_fb.b((byte) -63);
                                            var3_ref_fb.a(16);
                                            var3_ref_fb = (fb) (Object) kj.field_a.a((byte) -71);
                                            if (var11 != 0) {
                                              break L1;
                                            } else {
                                              if (var11 == 0) {
                                                continue L16;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  L18: {
                                    L19: {
                                      if ((var2 ^ -1) == -12) {
                                        break L19;
                                      } else {
                                        if ((var2 ^ -1) != -13) {
                                          break L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      var3 = ((ob) (Object) var1).f(-20976);
                                      var4 = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                      if (null != var4) {
                                        L21: {
                                          L22: {
                                            if ((var2 ^ -1) == -12) {
                                              break L22;
                                            } else {
                                              var4.field_Yb = true;
                                              if (var11 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var4.field_Jb = true;
                                          break L21;
                                        }
                                        ei.a(0, var4);
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L23: {
                                    if (-14 == (var2 ^ -1)) {
                                      break L23;
                                    } else {
                                      L24: {
                                        if (var2 == 14) {
                                          break L24;
                                        } else {
                                          if (var2 == 16) {
                                            break L24;
                                          } else {
                                            L25: {
                                              L26: {
                                                if (15 == var2) {
                                                  break L26;
                                                } else {
                                                  if (-18 != (var2 ^ -1)) {
                                                    break L25;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                              L27: {
                                                var3_long = ((ob) (Object) var1).d(127);
                                                var5 = ((ob) (Object) var1).j(-119);
                                                var6 = ta.a(126, var3_long);
                                                if (null != var6) {
                                                  L28: {
                                                    L29: {
                                                      if (15 != var2) {
                                                        break L29;
                                                      } else {
                                                        var6.field_Tb = false;
                                                        if (var11 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                    if (var6.field_Vb) {
                                                      ah.field_X = ah.field_X - 1;
                                                      var6.field_Vb = false;
                                                      break L28;
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                  L30: {
                                                    if (0 == var5) {
                                                      break L30;
                                                    } else {
                                                      var6.field_Gb = ks.field_i;
                                                      var6.field_Eb = var5;
                                                      break L30;
                                                    }
                                                  }
                                                  f.a((byte) -60, var6);
                                                  break L27;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L25;
                                              }
                                            }
                                            L31: {
                                              if ((var2 ^ -1) != -19) {
                                                break L31;
                                              } else {
                                                L32: {
                                                  var3_long = ((ob) (Object) var1).d(26);
                                                  var5_ref = ((ob) (Object) var1).e(-1);
                                                  var6 = (mj) (Object) ((ob) (Object) var1).e(-1);
                                                  var7 = (String) (Object) ik.a(-121, var3_long);
                                                  if (var7 == null) {
                                                    var7 = (String) (Object) new mj(var5_ref, (String) (Object) var6, var3_long);
                                                    qp.field_w.a(var3_long, (df) (Object) var7, true);
                                                    np.field_a.field_Lb = np.field_a.field_Lb + 1;
                                                    break L32;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                                L33: {
                                                  ((mj) (Object) var7).field_Qb = ((ob) (Object) var1).f(-20976);
                                                  var8 = ((ob) (Object) var1).c(false);
                                                  stackOut_90_0 = (String) var7;
                                                  stackIn_92_0 = stackOut_90_0;
                                                  stackIn_91_0 = stackOut_90_0;
                                                  if (-1 == (1 & var8 ^ -1)) {
                                                    stackOut_92_0 = (String) (Object) stackIn_92_0;
                                                    stackOut_92_1 = 0;
                                                    stackIn_93_0 = stackOut_92_0;
                                                    stackIn_93_1 = stackOut_92_1;
                                                    break L33;
                                                  } else {
                                                    stackOut_91_0 = (String) (Object) stackIn_91_0;
                                                    stackOut_91_1 = 1;
                                                    stackIn_93_0 = stackOut_91_0;
                                                    stackIn_93_1 = stackOut_91_1;
                                                    break L33;
                                                  }
                                                }
                                                ((mj) (Object) stackIn_93_0).field_Ub = stackIn_93_1 != 0;
                                                ((mj) (Object) var7).field_Fb = var8 >> -1181202175;
                                                ((mj) (Object) var7).field_Lb = ((ob) (Object) var1).j(-111);
                                                ((mj) (Object) var7).field_Wb = ((ob) (Object) var1).j(-68);
                                                uo.field_a.a((byte) -113, (oh) (Object) var7);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                            }
                                            L34: {
                                              if (-20 != (var2 ^ -1)) {
                                                break L34;
                                              } else {
                                                L35: {
                                                  var3_long = ((ob) (Object) var1).d(105);
                                                  var5 = ((ob) (Object) var1).j(-120);
                                                  var6 = ik.a(-101, var3_long);
                                                  if (var6 == null) {
                                                    break L35;
                                                  } else {
                                                    L36: {
                                                      L37: {
                                                        if (0 != var5) {
                                                          break L37;
                                                        } else {
                                                          var6.b((byte) -124);
                                                          if (var11 == 0) {
                                                            break L36;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                      var6.field_Gb = ks.field_i;
                                                      var6.field_Eb = var5;
                                                      break L36;
                                                    }
                                                    var6.a(16);
                                                    np.field_a.field_Lb = np.field_a.field_Lb - 1;
                                                    break L35;
                                                  }
                                                }
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L34;
                                                }
                                              }
                                            }
                                            L38: {
                                              if ((var2 ^ -1) == -21) {
                                                break L38;
                                              } else {
                                                L39: {
                                                  if (var2 != 21) {
                                                    break L39;
                                                  } else {
                                                    L40: {
                                                      L41: {
                                                        var3 = ((ob) (Object) var1).f(-20976);
                                                        if (-1 != (var3 ^ -1)) {
                                                          break L41;
                                                        } else {
                                                          sf.field_e = 0L;
                                                          if (var11 == 0) {
                                                            break L40;
                                                          } else {
                                                            break L41;
                                                          }
                                                        }
                                                      }
                                                      sf.field_e = pr.a(14274) + (long)var3;
                                                      break L40;
                                                    }
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                }
                                                L42: {
                                                  if (-23 == (var2 ^ -1)) {
                                                    break L42;
                                                  } else {
                                                    L43: {
                                                      if (23 != var2) {
                                                        break L43;
                                                      } else {
                                                        ec.field_p = ((ob) (Object) var1).d(65);
                                                        if (var11 == 0) {
                                                          break L1;
                                                        } else {
                                                          break L43;
                                                        }
                                                      }
                                                    }
                                                    jq.a(-29901, (Throwable) null, "L1: " + w.a(16738));
                                                    q.g(-115);
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L42;
                                                    }
                                                  }
                                                }
                                                a.field_j = ((ob) (Object) var1).f(-20976);
                                                bh.field_h = ((ob) (Object) var1).c(false);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            mi.a((byte) -89, np.field_a, (ob) (Object) var1, false);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                      }
                                      L44: {
                                        var3_long = ((ob) (Object) var1).d(127);
                                        var5_ref = (String) (Object) ta.a(121, var3_long);
                                        if (null == var5_ref) {
                                          break L44;
                                        } else {
                                          L45: {
                                            L46: {
                                              if (var2 != 14) {
                                                break L46;
                                              } else {
                                                ((mj) (Object) var5_ref).field_Tb = true;
                                                if (var11 == 0) {
                                                  break L45;
                                                } else {
                                                  break L46;
                                                }
                                              }
                                            }
                                            if (((mj) (Object) var5_ref).field_Vb) {
                                              break L45;
                                            } else {
                                              ah.field_X = ah.field_X + 1;
                                              ((mj) (Object) var5_ref).field_Vb = true;
                                              break L45;
                                            }
                                          }
                                          f.a((byte) -60, (mj) (Object) var5_ref);
                                          break L44;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  L47: {
                                    var3 = ((ob) (Object) var1).f(-20976);
                                    var4_int = ((ob) (Object) var1).j(-60);
                                    var5_ref_fb = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                    if (var5_ref_fb != null) {
                                      L48: {
                                        var5_ref_fb.field_Yb = false;
                                        var6 = (mj) (Object) var5_ref_fb;
                                        ((fb) (Object) var6).field_Jb = false;
                                        if ((var4_int ^ -1) != -1) {
                                          var5_ref_fb.field_hc = var4_int;
                                          var5_ref_fb.field_Nb = ks.field_i;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      ei.a(0, var5_ref_fb);
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L49: {
                                var3 = ((ob) (Object) var1).f(-20976);
                                var4 = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                if (null != var4) {
                                  break L49;
                                } else {
                                  var4_ref = new fb(em.field_k);
                                  ea.field_b.a((long)var3, (df) (Object) var4_ref, true);
                                  break L49;
                                }
                              }
                              mi.a((byte) -89, var4_ref, (ob) (Object) var1, true);
                              ei.a(0, var4_ref);
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var3_ref_mj = (mj) (Object) gr.field_p.d(0);
                          L50: while (true) {
                            L51: {
                              L52: {
                                if (var3_ref_mj == null) {
                                  break L52;
                                } else {
                                  var3_ref_mj.b((byte) -126);
                                  var3_ref_mj.a(16);
                                  var3_ref_mj = (mj) (Object) gr.field_p.a((byte) -71);
                                  if (var11 != 0) {
                                    break L51;
                                  } else {
                                    if (var11 == 0) {
                                      continue L50;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              ah.field_X = 0;
                              break L51;
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      L53: {
                        var3_long = ((ob) (Object) var1).d(29);
                        var5 = ((ob) (Object) var1).j(-53);
                        var6 = ta.a(-98, var3_long);
                        if (var6 != null) {
                          L54: {
                            if (!var6.field_Vb) {
                              break L54;
                            } else {
                              ah.field_X = ah.field_X - 1;
                              var6.field_Vb = false;
                              break L54;
                            }
                          }
                          L55: {
                            L56: {
                              if ((var5 ^ -1) == -1) {
                                break L56;
                              } else {
                                var6.field_Eb = var5;
                                var6.field_Gb = ks.field_i;
                                if (var11 == 0) {
                                  break L55;
                                } else {
                                  break L56;
                                }
                              }
                            }
                            var6.b((byte) -113);
                            break L55;
                          }
                          var6.a(16);
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
          }
          var3_ref_mj = (mj) (Object) uo.field_a.d(0);
          L57: while (true) {
            L58: {
              L59: {
                if (var3_ref_mj == null) {
                  break L59;
                } else {
                  var3_ref_mj.b((byte) -91);
                  var3_ref_mj.a(16);
                  var3_ref_mj = (mj) (Object) uo.field_a.a((byte) -71);
                  if (var11 != 0) {
                    break L58;
                  } else {
                    if (var11 == 0) {
                      continue L57;
                    } else {
                      break L59;
                    }
                  }
                }
              }
              var3_ref_mj = (mj) (Object) ShatteredPlansClient.field_H.c((byte) -109);
              break L58;
            }
            L60: while (true) {
              L61: {
                L62: {
                  if (var3_ref_mj == null) {
                    break L62;
                  } else {
                    stackOut_169_0 = var3_ref_mj.field_Tb;
                    stackIn_181_0 = stackOut_169_0 ? 1 : 0;
                    stackIn_170_0 = stackOut_169_0;
                    if (var11 != 0) {
                      break L61;
                    } else {
                      stackOut_170_0 = stackIn_170_0;
                      stackIn_171_0 = stackOut_170_0;
                      L63: {
                        L64: {
                          if (stackIn_171_0) {
                            break L64;
                          } else {
                            if (var3_ref_mj.field_Vb) {
                              break L64;
                            } else {
                              break L63;
                            }
                          }
                        }
                        L65: {
                          var3_ref_mj.field_Tb = false;
                          if (!var3_ref_mj.field_Vb) {
                            break L65;
                          } else {
                            ah.field_X = ah.field_X - 1;
                            var3_ref_mj.field_Vb = false;
                            break L65;
                          }
                        }
                        f.a((byte) -60, var3_ref_mj);
                        break L63;
                      }
                      var3_ref_mj = (mj) (Object) ShatteredPlansClient.field_H.b((byte) -107);
                      if (var11 == 0) {
                        continue L60;
                      } else {
                        break L62;
                      }
                    }
                  }
                }
                stackOut_180_0 = -2;
                stackIn_181_0 = stackOut_180_0;
                break L61;
              }
              L66: {
                if (stackIn_181_0 != (var2 ^ -1)) {
                  break L66;
                } else {
                  if (null == np.field_a) {
                    break L66;
                  } else {
                    la.field_h = np.field_a.field_Xb;
                    break L66;
                  }
                }
              }
              L67: {
                if (4 != var2) {
                  np.field_a = null;
                  break L67;
                } else {
                  var3 = ((ob) (Object) var1).f(-20976);
                  np.field_a = new fb(em.field_k);
                  np.field_a.a(16, (long)var3);
                  mi.a((byte) -89, np.field_a, (ob) (Object) var1, false);
                  sf.field_e = 0L;
                  break L67;
                }
              }
              L68: {
                L69: {
                  L70: {
                    if (var2 == 2) {
                      break L70;
                    } else {
                      if ((var2 ^ -1) != -4) {
                        break L69;
                      } else {
                        break L70;
                      }
                    }
                  }
                  if (he.field_p != null) {
                    break L68;
                  } else {
                    he.field_p = new fb(em.field_k);
                    if (var11 == 0) {
                      break L68;
                    } else {
                      break L69;
                    }
                  }
                }
                he.field_p = null;
                break L68;
              }
              L71: {
                if ((var2 ^ -1) != -4) {
                  break L71;
                } else {
                  k.field_i = true;
                  var3 = 0;
                  L72: while (true) {
                    L73: {
                      L74: {
                        if ((var3 ^ -1) <= (id.field_c.length ^ -1)) {
                          break L74;
                        } else {
                          id.field_c[var3] = ((ob) (Object) var1).g(-2852);
                          var3++;
                          if (var11 != 0) {
                            break L73;
                          } else {
                            if (var11 == 0) {
                              continue L72;
                            } else {
                              break L74;
                            }
                          }
                        }
                      }
                      qj.field_b = ((ob) (Object) var1).j(-82);
                      rj.field_q = ((ob) (Object) var1).j(-54);
                      break L73;
                    }
                    var3 = 0;
                    L75: while (true) {
                      L76: {
                        if (qj.field_f.length <= var3) {
                          break L76;
                        } else {
                          qj.field_f[var3] = ((ob) (Object) var1).g(-2852);
                          var3++;
                          if (var11 != 0) {
                            break L1;
                          } else {
                            if (var11 == 0) {
                              continue L75;
                            } else {
                              break L76;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L71;
                      }
                    }
                  }
                }
              }
              k.field_i = false;
              break L1;
            }
          }
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            RuntimeException var3_ref = null;
            Throwable var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_3_0 = null;
            int stackIn_8_0 = 0;
            String[] stackIn_12_0 = null;
            String stackIn_18_0 = null;
            Object stackIn_23_0 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            Object stackOut_2_0 = null;
            int stackOut_7_0 = 0;
            String[] stackOut_11_0 = null;
            String stackOut_17_0 = null;
            Object stackOut_22_0 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) ll.a("getcookies", param2, (byte) 70);
                            var4 = so.a(var3, ';', -116);
                            var5 = 0;
                            if (!param0) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            if ((var5 ^ -1) <= (var4.length ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var7 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = -1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (stackIn_8_0 < (var6 ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (String[]) var4;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (((String) (Object) stackIn_12_0[var5]).substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0;
                    }
                    case 19: {
                        try {
                            var5++;
                            if (var7 == 0) {
                                statePc = 4;
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
                            var3_ref2 = caughtException;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = null;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return (String) (Object) stackIn_23_0;
                    }
                    case 24: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = (RuntimeException) var3_ref;
                            stackOut_25_1 = new StringBuilder().append("rp.G(").append(param0).append(44);
                            stackIn_28_0 = stackOut_25_0;
                            stackIn_28_1 = stackOut_25_1;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            if (param1 == null) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                            stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                            stackOut_26_2 = "{...}";
                            stackIn_29_0 = stackOut_26_0;
                            stackIn_29_1 = stackOut_26_1;
                            stackIn_29_2 = stackOut_26_2;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 28: {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                        stackOut_28_2 = "null";
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
                            stackIn_32_0 = stackOut_29_0;
                            stackIn_32_1 = stackOut_29_1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            if (param2 == null) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                            stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                            stackOut_30_2 = "{...}";
                            stackIn_33_0 = stackOut_30_0;
                            stackIn_33_1 = stackOut_30_1;
                            stackIn_33_2 = stackOut_30_2;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 32: {
                        stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                        stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                        stackOut_32_2 = "null";
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        stackIn_33_2 = stackOut_32_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
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

    private rp() throws Throwable {
        RuntimeException var1 = null;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        throw new Error();
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "rp.<init>()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Total excess research";
    }
}
