/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rlb {
    private qfa field_b;
    static int[] field_d;
    static int field_e;
    static llb field_a;
    private d field_c;
    private pfb field_f;

    final void b(int param0) {
        try {
            ((rlb) this).field_f.b((byte) 94);
            if (param0 >= 0) {
                field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rlb.C(" + param0 + 41);
        }
    }

    final void a(boolean param0) {
        try {
            ((rlb) this).field_f.a(param0, 5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rlb.A(" + param0 + 41);
        }
    }

    final aia a(byte param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        Object var4 = null;
        aia var5 = null;
        opa var6 = null;
        int var7 = 0;
        int[] var8 = null;
        float[] var8_array = null;
        int var9 = 0;
        aia stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_14_0 = 0;
        aia stackIn_21_0 = null;
        aia stackIn_21_1 = null;
        qfa stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_21_6 = 0;
        aia stackIn_23_0 = null;
        aia stackIn_23_1 = null;
        qfa stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        aia stackIn_24_0 = null;
        aia stackIn_24_1 = null;
        qfa stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        aia stackIn_35_0 = null;
        aia stackIn_35_1 = null;
        qfa stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        aia stackIn_37_0 = null;
        aia stackIn_37_1 = null;
        qfa stackIn_37_2 = null;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        aia stackIn_38_0 = null;
        aia stackIn_38_1 = null;
        qfa stackIn_38_2 = null;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        int stackIn_38_6 = 0;
        int stackIn_38_7 = 0;
        aia stackIn_40_0 = null;
        aia stackOut_2_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        aia stackOut_20_0 = null;
        aia stackOut_20_1 = null;
        qfa stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        aia stackOut_21_0 = null;
        aia stackOut_21_1 = null;
        qfa stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        int stackOut_21_7 = 0;
        aia stackOut_23_0 = null;
        aia stackOut_23_1 = null;
        qfa stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        aia stackOut_34_0 = null;
        aia stackOut_34_1 = null;
        qfa stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        aia stackOut_35_0 = null;
        aia stackOut_35_1 = null;
        qfa stackOut_35_2 = null;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        aia stackOut_37_0 = null;
        aia stackOut_37_1 = null;
        qfa stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        int stackOut_37_7 = 0;
        aia stackOut_39_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = -84 % ((param0 - -54) / 60);
                        var4 = ((rlb) this).field_f.b(0, (long)param1);
                        if (null == var4) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = (aia) var4;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (!((rlb) this).field_c.a(param1, (byte) -42)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = null;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (aia) (Object) stackIn_8_0;
                }
                case 9: {
                    try {
                        var6 = ((rlb) this).field_c.a(-20292, param1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!var6.field_h) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 64;
                        stackIn_14_0 = stackOut_11_0;
                        statePc = 14;
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
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = ((rlb) this).field_b.field_X;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!var6.field_i) {
                            statePc = 26;
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
                        if (!((rlb) this).field_b.s()) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8_array = ((rlb) this).field_c.a(0.699999988079071f, var7, param1, var7, 76, false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = null;
                        stackOut_20_1 = null;
                        stackOut_20_2 = ((rlb) this).field_b;
                        stackOut_20_3 = 3553;
                        stackOut_20_4 = 34842;
                        stackOut_20_5 = var7;
                        stackOut_20_6 = var7;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        stackIn_23_3 = stackOut_20_3;
                        stackIn_23_4 = stackOut_20_4;
                        stackIn_23_5 = stackOut_20_5;
                        stackIn_23_6 = stackOut_20_6;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        stackIn_21_5 = stackOut_20_5;
                        stackIn_21_6 = stackOut_20_6;
                        if ((var6.field_j ^ -1) == -1) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = null;
                        stackOut_21_1 = null;
                        stackOut_21_2 = (qfa) (Object) stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = stackIn_21_4;
                        stackOut_21_5 = stackIn_21_5;
                        stackOut_21_6 = stackIn_21_6;
                        stackOut_21_7 = 1;
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        stackIn_24_3 = stackOut_21_3;
                        stackIn_24_4 = stackOut_21_4;
                        stackIn_24_5 = stackOut_21_5;
                        stackIn_24_6 = stackOut_21_6;
                        stackIn_24_7 = stackOut_21_7;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackOut_23_1 = null;
                        stackOut_23_2 = (qfa) (Object) stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        stackIn_24_4 = stackOut_23_4;
                        stackIn_24_5 = stackOut_23_5;
                        stackIn_24_6 = stackOut_23_6;
                        stackIn_24_7 = stackOut_23_7;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        new aia(stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7 != 0, var8_array, 6408);
                        var5 = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-3 == (var6.field_q ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
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
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (tka.a(97, (int) var6.field_c)) {
                            statePc = 33;
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8 = ((rlb) this).field_c.a(88, var7, var7, false, param1, 0.699999988079071f);
                        if (var9 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8 = ((rlb) this).field_c.a(var7, 0.699999988079071f, true, param1, var7, true);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = null;
                        stackOut_34_1 = null;
                        stackOut_34_2 = ((rlb) this).field_b;
                        stackOut_34_3 = 3553;
                        stackOut_34_4 = 6408;
                        stackOut_34_5 = var7;
                        stackOut_34_6 = var7;
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_37_1 = stackOut_34_1;
                        stackIn_37_2 = stackOut_34_2;
                        stackIn_37_3 = stackOut_34_3;
                        stackIn_37_4 = stackOut_34_4;
                        stackIn_37_5 = stackOut_34_5;
                        stackIn_37_6 = stackOut_34_6;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        stackIn_35_3 = stackOut_34_3;
                        stackIn_35_4 = stackOut_34_4;
                        stackIn_35_5 = stackOut_34_5;
                        stackIn_35_6 = stackOut_34_6;
                        if (var6.field_j == 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = null;
                        stackOut_35_1 = null;
                        stackOut_35_2 = (qfa) (Object) stackIn_35_2;
                        stackOut_35_3 = stackIn_35_3;
                        stackOut_35_4 = stackIn_35_4;
                        stackOut_35_5 = stackIn_35_5;
                        stackOut_35_6 = stackIn_35_6;
                        stackOut_35_7 = 1;
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        stackIn_38_2 = stackOut_35_2;
                        stackIn_38_3 = stackOut_35_3;
                        stackIn_38_4 = stackOut_35_4;
                        stackIn_38_5 = stackOut_35_5;
                        stackIn_38_6 = stackOut_35_6;
                        stackIn_38_7 = stackOut_35_7;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = (qfa) (Object) stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = stackIn_37_4;
                        stackOut_37_5 = stackIn_37_5;
                        stackOut_37_6 = stackIn_37_6;
                        stackOut_37_7 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        stackIn_38_4 = stackOut_37_4;
                        stackIn_38_5 = stackOut_37_5;
                        stackIn_38_6 = stackOut_37_6;
                        stackIn_38_7 = stackOut_37_7;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        new aia(stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, stackIn_38_6, stackIn_38_7 != 0, var8, 0, 0, false);
                        var5 = stackIn_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5.a(var6.field_s, var6.field_k, 10497);
                        ((rlb) this).field_f.a((Object) (Object) var5, (long)param1, (byte) -117);
                        stackOut_39_0 = (aia) var5;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw rta.a((Throwable) (Object) var3, "rlb.D(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_d = null;
            field_a = null;
            int var1_int = 115 / ((-54 - param0) / 51);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rlb.B(" + param0 + 41);
        }
    }

    rlb(qfa param0, d param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((rlb) this).field_f = new pfb(256);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((rlb) this).field_c = param1;
                        ((rlb) this).field_b = param0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("rlb.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
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
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
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
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
