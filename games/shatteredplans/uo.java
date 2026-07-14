/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    static String field_b;
    static int[] field_f;
    static int[] field_h;
    static String field_d;
    static String field_c;
    static pf field_a;
    static int field_g;
    static boolean field_e;

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        boolean discarded$12 = le.field_e.a(kd.field_a, true, oo.field_e, (byte) 0);
                        le.field_e.i(120);
                        if (param0 == -75) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = -107;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (!cc.e((byte) 55)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        boolean discarded$13 = le.field_e.a(oq.field_j, ho.field_h, true);
                        if (var2 != 0) {
                            statePc = 12;
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
                        if (var2 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 != (cr.field_b ^ -1)) {
                            statePc = 12;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1_int = cr.field_b;
                        qj.a((byte) -127, -1);
                        stackOut_12_0 = var1_int;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        if (!mg.field_C) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 3;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        if (fj.field_s != ue.field_a) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    try {
                        if (!wh.field_a.b(14)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    try {
                        if (ee.field_l != ue.field_a) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = 2;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    try {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "uo.A(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        try {
            field_d = null;
            field_a = null;
            field_h = null;
            field_f = null;
            field_c = null;
            field_b = null;
            if (!param0) {
                uo.a((byte) 46, false, 50, true, true);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "uo.C(" + param0 + 41);
        }
    }

    final static void a(byte param0, bi param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 16711935 & param2;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 > 70) {
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
                        uo.a(true);
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param2 = param2 & 65280;
                        var4 = -1;
                        var5 = -param1.field_w;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var5 ^ -1;
                        stackOut_7_1 = -1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= stackIn_8_1) {
                            statePc = 29;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = -param1.field_z;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 >= 0) {
                            statePc = 21;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4++;
                        var7 = param1.field_B[var4];
                        stackOut_12_0 = -1;
                        stackOut_12_1 = var7 ^ -1;
                        stackIn_8_0 = stackOut_12_0;
                        stackIn_8_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (var9 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 != stackIn_13_1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = ((var7 & 16711680) >> 1886003600) + (var7 & 255) + ((65280 & var7) >> -691009817) >> -50217598;
                        var7 = (param2 * var8 & 16711680 | var8 * var3_int & -16711936) >>> 1018675432;
                        if (0 != var7) {
                            statePc = 19;
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
                        var7 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param1.field_B[var4] = var7;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5++;
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) var3;
                        stackOut_24_1 = new StringBuilder().append("uo.D(").append(param0).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param1 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param2 + 41);
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        qr var5_ref = null;
        qr var6 = null;
        qr var7 = null;
        qr var8 = null;
        String var9_ref = null;
        int var9 = 0;
        String var10_ref = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        pf var17 = null;
        int var17_int = 0;
        mj var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_21_0 = false;
        qr stackIn_29_0 = null;
        qr stackIn_30_0 = null;
        long stackIn_30_1 = 0L;
        qr stackIn_31_0 = null;
        qr stackIn_33_0 = null;
        qr stackIn_35_0 = null;
        qr stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_102_0 = 0;
        Object stackIn_112_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_120_0 = null;
        Object stackIn_129_0 = null;
        Object stackIn_130_0 = null;
        boolean[][] stackIn_130_1 = null;
        boolean[][] stackIn_134_0 = null;
        boolean stackIn_178_0 = false;
        mj stackIn_188_0 = null;
        int stackIn_218_0 = 0;
        boolean stackIn_243_0 = false;
        int stackIn_251_0 = 0;
        qr stackIn_267_0 = null;
        qr stackIn_268_0 = null;
        boolean stackIn_268_1 = false;
        qr stackIn_269_0 = null;
        qr stackIn_271_0 = null;
        qr stackIn_272_0 = null;
        boolean stackIn_272_1 = false;
        qr stackIn_273_0 = null;
        qr stackIn_275_0 = null;
        qr stackIn_277_0 = null;
        qr stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        qr stackIn_279_0 = null;
        qr stackIn_280_0 = null;
        boolean stackIn_280_1 = false;
        qr stackIn_281_0 = null;
        qr stackIn_283_0 = null;
        qr stackIn_284_0 = null;
        boolean stackIn_284_1 = false;
        qr stackIn_285_0 = null;
        qr stackIn_287_0 = null;
        qr stackIn_289_0 = null;
        qr stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        qr stackIn_291_0 = null;
        qr stackIn_292_0 = null;
        boolean stackIn_292_1 = false;
        qr stackIn_293_0 = null;
        qr stackIn_295_0 = null;
        qr stackIn_296_0 = null;
        boolean stackIn_296_1 = false;
        qr stackIn_297_0 = null;
        qr stackIn_299_0 = null;
        qr stackIn_301_0 = null;
        qr stackIn_302_0 = null;
        int stackIn_302_1 = 0;
        Object stackIn_304_0 = null;
        Object stackIn_306_0 = null;
        Throwable caughtException = null;
        boolean stackOut_20_0 = false;
        qr stackOut_28_0 = null;
        qr stackOut_29_0 = null;
        long stackOut_29_1 = 0L;
        qr stackOut_30_0 = null;
        qr stackOut_31_0 = null;
        qr stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        qr stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_101_0 = 0;
        Object stackOut_111_0 = null;
        Object stackOut_115_0 = null;
        Object stackOut_119_0 = null;
        Object stackOut_128_0 = null;
        Object stackOut_129_0 = null;
        boolean[][] stackOut_129_1 = null;
        boolean[][] stackOut_133_0 = null;
        boolean stackOut_177_0 = false;
        mj stackOut_187_0 = null;
        int stackOut_217_0 = 0;
        boolean stackOut_242_0 = false;
        int stackOut_250_0 = 0;
        qr stackOut_266_0 = null;
        qr stackOut_267_0 = null;
        boolean stackOut_267_1 = false;
        qr stackOut_268_0 = null;
        qr stackOut_269_0 = null;
        qr stackOut_271_0 = null;
        boolean stackOut_271_1 = false;
        qr stackOut_272_0 = null;
        qr stackOut_273_0 = null;
        qr stackOut_275_0 = null;
        int stackOut_275_1 = 0;
        qr stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        qr stackOut_278_0 = null;
        qr stackOut_279_0 = null;
        boolean stackOut_279_1 = false;
        qr stackOut_280_0 = null;
        qr stackOut_281_0 = null;
        qr stackOut_283_0 = null;
        boolean stackOut_283_1 = false;
        qr stackOut_284_0 = null;
        qr stackOut_285_0 = null;
        qr stackOut_287_0 = null;
        int stackOut_287_1 = 0;
        qr stackOut_289_0 = null;
        int stackOut_289_1 = 0;
        qr stackOut_290_0 = null;
        qr stackOut_291_0 = null;
        boolean stackOut_291_1 = false;
        qr stackOut_292_0 = null;
        qr stackOut_293_0 = null;
        qr stackOut_295_0 = null;
        boolean stackOut_295_1 = false;
        qr stackOut_296_0 = null;
        qr stackOut_297_0 = null;
        qr stackOut_299_0 = null;
        int stackOut_299_1 = 0;
        qr stackOut_301_0 = null;
        int stackOut_301_1 = 0;
        Object stackOut_303_0 = null;
        Object stackOut_304_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    qo.a(22353, ee.field_k);
                    if (null != np.field_a) {
                        statePc = 4;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 4: {
                    i.field_g.field_s = true;
                    go.field_I.field_mb = 0;
                    var5_ref = go.field_I;
                    var5_ref.field_K = 0;
                    var6 = aq.field_j;
                    aq.field_j.field_mb = 0;
                    var6.field_K = 0;
                    dn.field_f.field_mb = 0;
                    var7 = dn.field_f;
                    var7.field_K = 0;
                    if (!ip.a((byte) -94)) {
                        statePc = 260;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    tj.field_f.field_z = n.field_m.toUpperCase();
                    var9 = (pf.field_g.field_K + 2) / 2;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    go.field_I.a(-2 + var9, 40, (byte) 124, pf.field_g.field_mb - 40, 0);
                    if ((np.field_a.field_Lb ^ -1) <= (np.field_a.field_Eb ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    go.field_I.field_z = ph.field_c.toUpperCase();
                    go.field_I.field_s = true;
                    if (var19 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    go.field_I.field_z = gm.field_j.toUpperCase();
                    go.field_I.field_s = false;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    go.field_I.field_F = ea.field_a.field_F;
                    if (0 < ah.field_X) {
                        statePc = 16;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (ah.field_X != 1) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10_ref = ui.field_k;
                    if (var19 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10_ref = re.a(jg.field_e, 4371, new String[1]);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (-1 != (16 & ln.field_w ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = ti.field_e;
                    stackIn_21_0 = stackOut_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    go.field_I.field_F = ea.field_a.field_lb;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    go.field_I.field_z = go.field_I.field_z + "<br>" + var10_ref;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    aq.field_j.a(-var9 + pf.field_g.field_K, 40, (byte) 82, pf.field_g.field_mb - 40, var9);
                    aq.field_j.field_z = lp.field_u.toUpperCase();
                    stackOut_28_0 = aq.field_j;
                    stackIn_35_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (!param3) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (qr) (Object) stackIn_29_0;
                    stackOut_29_1 = sf.field_e;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (qr) (Object) stackIn_30_0;
                    stackIn_35_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (stackIn_30_1 != 0L) {
                        statePc = 35;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (qr) (Object) stackIn_31_0;
                    stackIn_33_0 = stackOut_31_0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = (qr) (Object) stackIn_33_0;
                    stackOut_33_1 = 1;
                    stackIn_36_0 = stackOut_33_0;
                    stackIn_36_1 = stackOut_33_1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = (qr) (Object) stackIn_35_0;
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_36_0.field_s = stackIn_36_1 != 0;
                    var8 = aq.field_j;
                    var10 = 2;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (pe.field_D != null) {
                        statePc = 40;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (lr.field_c == null) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    lr.field_c = new byte[em.field_k];
                    ek.field_F = new boolean[em.field_k];
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var11_int = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if ((var11_int ^ -1) <= (em.field_k ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ek.field_F[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var19 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if ((var10 ^ -1) <= -3) {
                        statePc = 101;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var11_int = 0;
                    stackOut_52_0 = 0;
                    stackIn_102_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (var19 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var12 = stackIn_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = pe.field_D.length;
                    stackOut_54_1 = var12;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (stackIn_55_0 <= stackIn_55_1) {
                        statePc = 93;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var13_array = pe.field_D[var12];
                    stackOut_56_0 = 0;
                    stackIn_94_0 = stackOut_56_0;
                    stackIn_57_0 = stackOut_56_0;
                    if (var19 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var14_int = stackIn_57_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var14_int >= var13_array.length) {
                        statePc = 84;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var15 = var13_array[var14_int];
                    var16 = var13_array[var14_int + 1];
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = 0;
                    stackOut_60_1 = var15 ^ -1;
                    stackIn_86_0 = stackOut_60_0;
                    stackIn_86_1 = stackOut_60_1;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    if (var19 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 != stackIn_61_1) {
                        statePc = 78;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((var10 ^ -1) == -1) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = np.field_a.field_Lb;
                    stackIn_70_0 = stackOut_67_0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = np.field_a.field_Eb;
                    stackIn_70_0 = stackOut_69_0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var17_int = stackIn_70_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if ((var16 ^ -1) == (var17_int ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var19 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var19 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((255 & np.field_a.field_dc[var15] ^ -1) != (var16 ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    stackOut_85_0 = var13_array.length ^ -1;
                    stackOut_85_1 = var15 ^ -1;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 >= stackIn_86_1) {
                        statePc = 91;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var16 = var13_array[var15];
                    stackOut_87_0 = var16;
                    stackOut_87_1 = var14_int;
                    stackIn_55_0 = stackOut_87_0;
                    stackIn_55_1 = stackOut_87_1;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    if (var19 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0 <= stackIn_88_1) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var14_int = var16;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    ek.field_F[var14_int] = true;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = var11_int;
                    stackIn_94_0 = stackOut_93_0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (stackIn_94_0 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var19 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = 2;
                    stackIn_102_0 = stackOut_101_0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 > bs.field_b) {
                        statePc = 107;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (!di.field_p[12]) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var10 = 2;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (-3 < (var10 ^ -1)) {
                        statePc = 237;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (null != td.field_E) {
                        statePc = 125;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackOut_111_0 = null;
                    stackIn_112_0 = stackOut_111_0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (stackIn_112_0 != (Object) (Object) ci.field_h) {
                        statePc = 125;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = null;
                    stackIn_116_0 = stackOut_115_0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 != (Object) (Object) pg.field_A) {
                        statePc = 125;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = null;
                    stackIn_120_0 = stackOut_119_0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (stackIn_120_0 != (Object) (Object) ji.field_D) {
                        statePc = 125;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (em.field_k <= var16) {
                        statePc = 175;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var17_int = 255 & np.field_a.field_dc[var16];
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = null;
                    stackIn_306_0 = stackOut_128_0;
                    stackIn_129_0 = stackOut_128_0;
                    if (var19 != 0) {
                        statePc = 306;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = stackIn_129_0;
                    stackOut_129_1 = td.field_E;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 == (Object) (Object) stackIn_130_1) {
                        statePc = 143;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = td.field_E;
                    stackIn_134_0 = stackOut_133_0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (stackIn_134_0[var16] != null) {
                        statePc = 139;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (td.field_E[var16][var17_int]) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var11_int = 1;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (null == ci.field_h) {
                        statePc = 155;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (ci.field_h[var16] == null) {
                        statePc = 155;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var18_int = ci.field_h[var16][var17_int];
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (hm.field_o) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var11_int = 1;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var18_int <= var13_int) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var13_int = var18_int;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (pg.field_A == null) {
                        statePc = 169;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (null == pg.field_A[var16]) {
                        statePc = 169;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var18_int = pg.field_A[var16][var17_int];
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (var14_int < var18_int) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var14_int = var18_int;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (hm.field_o) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var11_int = 1;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (null == ji.field_D) {
                        statePc = 174;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (ji.field_D[var16] == null) {
                        statePc = 174;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var15 = var15 | ji.field_D[var16][var17_int];
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var16 = 0;
                    var17 = ro.field_a.field_xb.field_M;
                    var18 = (mj) (Object) var17.d(0);
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (null == var18) {
                        statePc = 217;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    stackOut_177_0 = var18.h(-80);
                    stackIn_218_0 = stackOut_177_0 ? 1 : 0;
                    stackIn_178_0 = stackOut_177_0;
                    if (var19 != 0) {
                        statePc = 218;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (!stackIn_178_0) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (var19 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var11_int == 0) {
                        statePc = 195;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    stackOut_187_0 = (mj) var18;
                    stackIn_188_0 = stackOut_187_0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if (!stackIn_188_0.field_Ub) {
                        statePc = 193;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var16 = 1;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (var19 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if ((var18.field_Qb ^ -1) <= (var13_int ^ -1)) {
                        statePc = 200;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var16 = 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var19 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if ((var14_int ^ -1) >= (var18.field_Fb ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var16 = 1;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var19 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (-1 <= (var15 & (var18.field_Wb ^ -1) ^ -1)) {
                        statePc = 210;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var16 = 1;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (var19 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (var12 != 0) {
                        statePc = 215;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var18 = (mj) (Object) var17.a((byte) -71);
                    if (var19 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    stackOut_217_0 = 2;
                    stackIn_218_0 = stackOut_217_0;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    if (stackIn_218_0 > bs.field_b) {
                        statePc = 223;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (!di.field_p[12]) {
                        statePc = 223;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var16 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var16 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    aq.field_j.field_s = false;
                    if (!aq.field_j.field_v) {
                        statePc = 236;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (-1 == (n.field_h.field_d.field_zb ^ -1)) {
                        statePc = 233;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    dn.field_k = re.a(jr.field_l, param0 ^ 4356, new String[1]);
                    if (var19 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    dn.field_k = on.field_a;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (var19 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    aq.field_j.field_s = false;
                    if (!aq.field_j.field_v) {
                        statePc = 259;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (em.field_k <= var13_int) {
                        statePc = 250;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    stackOut_242_0 = ek.field_F[var13_int];
                    stackIn_251_0 = stackOut_242_0 ? 1 : 0;
                    stackIn_243_0 = stackOut_242_0;
                    if (var19 != 0) {
                        statePc = 251;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (!stackIn_243_0) {
                        statePc = 249;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var14 = "<col=A00000>" + gm.field_l[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var11 = var11 + ", " + var14;
                    var12 = 1;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var11 = var14;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    stackOut_250_0 = var10;
                    stackIn_251_0 = stackOut_250_0;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if (stackIn_251_0 != 0) {
                        statePc = 255;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var13 = up.field_e;
                    if (var12 != 0) {
                        statePc = 254;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var14 = re.a(js.field_h, 4371, new String[1]);
                    if (var19 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var14 = br.field_l + var11;
                    statePc = 258;
                    continue stateLoop;
                }
                case 255: {
                    var13 = md.field_I;
                    if (var12 == 0) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var14 = mi.field_b + var11;
                    if (var19 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var14 = re.a(r.field_f, 4371, new String[1]);
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    dn.field_k = "<col=A00000>" + var13 + "<br>" + var14;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (var19 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var9_ref = np.field_a.field_Xb;
                    tj.field_f.field_z = re.a(he.field_q, 4371, new String[1]).toUpperCase();
                    dn.field_f.a(pf.field_g.field_K, 40, (byte) 56, pf.field_g.field_mb + -40, 0);
                    dn.field_f.field_z = re.a(gq.field_a, 4371, new String[1]);
                    var8 = dn.field_f;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if ((sf.field_e ^ -1L) == -1L) {
                        statePc = 265;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var9 = (int)(sf.field_e - pr.a(14274));
                    var9 = (var9 + 999) / 1000;
                    if ((var9 ^ -1) <= -2) {
                        statePc = 264;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var9 = 1;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    var8.field_z = re.a(oe.field_b, 4371, new String[1]);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    ac.field_x.field_z = re.a(eg.field_r, 4371, new String[2]);
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    stackOut_266_0 = am.field_xb;
                    stackIn_277_0 = stackOut_266_0;
                    stackIn_267_0 = stackOut_266_0;
                    if (!param1) {
                        statePc = 277;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    stackOut_267_0 = (qr) (Object) stackIn_267_0;
                    stackOut_267_1 = param4;
                    stackIn_268_0 = stackOut_267_0;
                    stackIn_268_1 = stackOut_267_1;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    stackOut_268_0 = (qr) (Object) stackIn_268_0;
                    stackIn_277_0 = stackOut_268_0;
                    stackIn_269_0 = stackOut_268_0;
                    if (stackIn_268_1) {
                        statePc = 277;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    stackOut_269_0 = (qr) (Object) stackIn_269_0;
                    stackIn_271_0 = stackOut_269_0;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    stackOut_271_0 = (qr) (Object) stackIn_271_0;
                    stackOut_271_1 = ti.field_e;
                    stackIn_272_0 = stackOut_271_0;
                    stackIn_272_1 = stackOut_271_1;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackOut_272_0 = (qr) (Object) stackIn_272_0;
                    stackIn_277_0 = stackOut_272_0;
                    stackIn_273_0 = stackOut_272_0;
                    if (stackIn_272_1) {
                        statePc = 277;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = (qr) (Object) stackIn_273_0;
                    stackIn_275_0 = stackOut_273_0;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = (qr) (Object) stackIn_275_0;
                    stackOut_275_1 = 1;
                    stackIn_278_0 = stackOut_275_0;
                    stackIn_278_1 = stackOut_275_1;
                    statePc = 278;
                    continue stateLoop;
                }
                case 277: {
                    stackOut_277_0 = (qr) (Object) stackIn_277_0;
                    stackOut_277_1 = 0;
                    stackIn_278_0 = stackOut_277_0;
                    stackIn_278_1 = stackOut_277_1;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    ((qr) (Object) stackIn_278_0).a(stackIn_278_1 != 0, -20429);
                    stackOut_278_0 = pf.field_g;
                    stackIn_289_0 = stackOut_278_0;
                    stackIn_279_0 = stackOut_278_0;
                    if (!param1) {
                        statePc = 289;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    stackOut_279_0 = (qr) (Object) stackIn_279_0;
                    stackOut_279_1 = param4;
                    stackIn_280_0 = stackOut_279_0;
                    stackIn_280_1 = stackOut_279_1;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    stackOut_280_0 = (qr) (Object) stackIn_280_0;
                    stackIn_289_0 = stackOut_280_0;
                    stackIn_281_0 = stackOut_280_0;
                    if (stackIn_280_1) {
                        statePc = 289;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (qr) (Object) stackIn_281_0;
                    stackIn_283_0 = stackOut_281_0;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (qr) (Object) stackIn_283_0;
                    stackOut_283_1 = ti.field_e;
                    stackIn_284_0 = stackOut_283_0;
                    stackIn_284_1 = stackOut_283_1;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    stackOut_284_0 = (qr) (Object) stackIn_284_0;
                    stackIn_289_0 = stackOut_284_0;
                    stackIn_285_0 = stackOut_284_0;
                    if (stackIn_284_1) {
                        statePc = 289;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (qr) (Object) stackIn_285_0;
                    stackIn_287_0 = stackOut_285_0;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (qr) (Object) stackIn_287_0;
                    stackOut_287_1 = 1;
                    stackIn_290_0 = stackOut_287_0;
                    stackIn_290_1 = stackOut_287_1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (qr) (Object) stackIn_289_0;
                    stackOut_289_1 = 0;
                    stackIn_290_0 = stackOut_289_0;
                    stackIn_290_1 = stackOut_289_1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    ((qr) (Object) stackIn_290_0).a(stackIn_290_1 != 0, -20429);
                    stackOut_290_0 = ed.field_d;
                    stackIn_301_0 = stackOut_290_0;
                    stackIn_291_0 = stackOut_290_0;
                    if (!param1) {
                        statePc = 301;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (qr) (Object) stackIn_291_0;
                    stackOut_291_1 = param4;
                    stackIn_292_0 = stackOut_291_0;
                    stackIn_292_1 = stackOut_291_1;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    stackOut_292_0 = (qr) (Object) stackIn_292_0;
                    stackIn_301_0 = stackOut_292_0;
                    stackIn_293_0 = stackOut_292_0;
                    if (stackIn_292_1) {
                        statePc = 301;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (qr) (Object) stackIn_293_0;
                    stackIn_295_0 = stackOut_293_0;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (qr) (Object) stackIn_295_0;
                    stackOut_295_1 = ti.field_e;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = (qr) (Object) stackIn_296_0;
                    stackIn_301_0 = stackOut_296_0;
                    stackIn_297_0 = stackOut_296_0;
                    if (!stackIn_296_1) {
                        statePc = 301;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (qr) (Object) stackIn_297_0;
                    stackIn_299_0 = stackOut_297_0;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (qr) (Object) stackIn_299_0;
                    stackOut_299_1 = 1;
                    stackIn_302_0 = stackOut_299_0;
                    stackIn_302_1 = stackOut_299_1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (qr) (Object) stackIn_301_0;
                    stackOut_301_1 = 0;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    ((qr) (Object) stackIn_302_0).a(stackIn_302_1 != 0, -20429);
                    n.field_h.field_d.f(false);
                    if (param0 == 23) {
                        statePc = 307;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackOut_303_0 = null;
                    stackIn_304_0 = stackOut_303_0;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    stackOut_304_0 = stackIn_304_0;
                    stackIn_306_0 = stackOut_304_0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    field_c = (String) (Object) stackIn_306_0;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if (np.field_a == null) {
                        statePc = 329;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (0 == i.field_g.field_rb) {
                        statePc = 314;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    tk.a(param2, np.field_a.g(-92), (byte) -2);
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (0 != aq.field_j.field_rb) {
                        statePc = 317;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 317: {
                    ac.field_u = true;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (0 != go.field_I.field_rb) {
                        statePc = 321;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 321: {
                    ti.field_e = true;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (-1 != (oo.field_c.field_rb ^ -1)) {
                        statePc = 325;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 325: {
                    ti.field_e = false;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    sc.a(63, false, np.field_a, param2);
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Offer unrated rematch";
        field_h = new int[128];
        field_d = "Press 'ESC' to exit the game";
        field_c = "You have entered another game.";
    }
}
