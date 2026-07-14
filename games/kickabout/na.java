/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hd {
    private hd field_Hb;
    private hd field_Cb;
    private hd field_yb;
    static int field_Ab;
    private hd field_Gb;
    private hd field_Fb;
    static String field_Eb;
    static int field_Ib;
    private int field_Db;
    static int[][] field_zb;
    private hd field_Bb;

    na(long param0, hd param1, hd param2, hd param3, hd param4) {
        super(param0, (hd) null);
        RuntimeException var7 = null;
        hd var7_ref = null;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
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
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((na) this).field_Bb = new hd(0L, param1);
                        ((na) this).field_Gb = new hd(0L, param2);
                        ((na) this).a((byte) -107, ((na) this).field_Bb);
                        ((na) this).a((byte) -106, ((na) this).field_Gb);
                        ((na) this).field_Cb = new hd(0L, (hd) null);
                        ((na) this).a((byte) -127, ((na) this).field_Cb);
                        ((na) this).field_Fb = new hd(0L, param3);
                        ((na) this).field_yb = new hd(0L, param3);
                        var7_ref = ((na) this).field_Fb;
                        ((na) this).field_yb.field_ob = true;
                        var7_ref.field_ob = true;
                        ((na) this).field_Cb.a((byte) -127, ((na) this).field_Fb);
                        ((na) this).field_Cb.a((byte) -112, ((na) this).field_yb);
                        ((na) this).field_Hb = new hd(0L, param4);
                        ((na) this).field_Hb.field_Y = true;
                        ((na) this).field_Cb.a((byte) -127, ((na) this).field_Hb);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) var7;
                        stackOut_4_1 = new StringBuilder().append("na.<init>(").append(param0).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param1 == null) {
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
                        if (param2 == null) {
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
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param3 == null) {
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
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param4 == null) {
                            statePc = 19;
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
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
                }
                case 21: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 > 103) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 2;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        var5_int = 0;
                        var6 = ((na) this).field_Cb.field_mb - ((na) this).field_Hb.field_mb;
                        if ((var6 ^ -1) >= -1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = ((na) this).field_Hb.field_J;
                        var8 = param2 - param3;
                        var5_int = (var7 * var8 - -(var6 / 2)) / var6;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1) {
                            statePc = 15;
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
                        if ((var5_int ^ -1) >= (param2 - param3 ^ -1)) {
                            statePc = 10;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5_int = -param3 + param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var5_int ^ -1) > -1) {
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
                        statePc = 23;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5_int = 0;
                        stackOut_13_0 = Kickabout.field_G;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == 0) {
                            statePc = 23;
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
                        if (-1 >= (var5_int ^ -1)) {
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var5_int ^ -1) < (param2 - param3 ^ -1)) {
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5_int = param2 + -param3;
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
                        stackOut_23_0 = var5_int;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var5, "na.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 23028) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        boolean discarded$2 = ((na) this).m(124);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 != ((na) this).field_Fb.field_sb) {
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
                        statePc = 9;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((na) this).field_Db = 20;
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        if (0 != ((na) this).field_Fb.field_qb) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 < ((na) this).field_Db) {
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
                        statePc = 16;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((na) this).field_Db = ((na) this).field_Db - 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 != ((na) this).field_Db) {
                            statePc = 25;
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
                        stackOut_17_0 = n.field_m;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((stackIn_18_0 ^ -1) > (((na) this).field_Hb.field_T - -((na) this).field_Hb.field_v ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 25;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((na) this).field_Db = 3;
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var2, "na.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean m(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        Object stackIn_12_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((na) this).field_yb.field_sb == 0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((na) this).field_Db = 20;
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if ((((na) this).field_yb.field_qb ^ -1) == param0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((na) this).field_Db ^ -1) >= -1) {
                            statePc = 10;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((na) this).field_Db = ((na) this).field_Db - 1;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((na) this).field_Db != 0) {
                            statePc = 19;
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
                        stackOut_11_0 = this;
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
                        if (((na) this).field_Hb.field_T + ((na) this).field_Hb.field_v - -((na) this).field_Hb.field_mb - -((na) this).field_Hb.field_L <= n.field_m) {
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
                        statePc = 19;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((na) this).field_Db = 3;
                        stackOut_17_0 = 1;
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
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    try {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var2, "na.IA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((na) this).field_q = param3;
        ((na) this).field_J = param6;
        ((na) this).field_s = param0;
        if (!param1) {
            return;
        }
        try {
            ((na) this).field_mb = param2;
            ((na) this).a(param4, param5, (byte) 64, param7);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "na.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              m.field_m = new hd(0L, (hd) null);
              if (!ui.field_t) {
                break L0;
              } else {
                m.field_m.a((byte) -127, li.field_a);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          m.field_m.a((byte) -114, mc.field_d);
          tn.field_d = new rf(qt.field_z, m.field_m);
          ss.field_c = new hd((long)param0, (hd) null);
          ss.field_c.a((byte) -127, (hd) (Object) tn.field_d.field_b);
          ss.field_c.a((byte) -116, rg.field_a);
          ml.c(false);
        }
    }

    final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (-1 != (((na) this).field_Bb.field_sb ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((na) this).field_Db = 20;
                        stackOut_3_0 = 1;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (0 == ((na) this).field_Bb.field_qb) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-1 <= (((na) this).field_Db ^ -1)) {
                            statePc = 12;
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
                case 9: {
                    try {
                        ((na) this).field_Db = ((na) this).field_Db - 1;
                        statePc = 10;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((na) this).field_Db == 0) {
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
                        statePc = 17;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((na) this).field_Db = 3;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        if (param0 == -819561055) {
                            statePc = 21;
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
                        field_Eb = null;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var2, "na.J(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_zb = null;
            int var1_int = 42 / ((52 - param0) / 62);
            field_Eb = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "na.L(" + param0 + 41);
        }
    }

    final boolean h(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((((na) this).field_Gb.field_sb ^ -1) == -1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((na) this).field_Db = 20;
                        stackOut_1_0 = 1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (0 == ((na) this).field_Gb.field_qb) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 > (((na) this).field_Db ^ -1)) {
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((na) this).field_Db = ((na) this).field_Db - 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 != ((na) this).field_Db) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((na) this).field_Db = 3;
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    try {
                        if (param0 == -40) {
                            statePc = 17;
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
                        ((na) this).field_Gb = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var2, "na.I(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    na(long param0, na param1) {
        this(param0, param1.field_Bb, param1.field_Gb, param1.field_Fb, param1.field_Hb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hd var13 = null;
        hd stackIn_20_0 = null;
        hd stackIn_20_1 = null;
        hd stackIn_20_2 = null;
        hd stackIn_22_0 = null;
        hd stackIn_22_1 = null;
        hd stackIn_22_2 = null;
        hd stackIn_23_0 = null;
        hd stackIn_23_1 = null;
        hd stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        hd stackOut_19_0 = null;
        hd stackOut_19_1 = null;
        hd stackOut_19_2 = null;
        hd stackOut_20_0 = null;
        hd stackOut_20_1 = null;
        hd stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        hd stackOut_22_0 = null;
        hd stackOut_22_1 = null;
        hd stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((2 * ((na) this).field_q ^ -1) < (((na) this).field_mb ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var6 = ((na) this).field_mb - ((na) this).field_q;
                        var5_int = ((na) this).field_q;
                        if (Kickabout.field_G == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6 = ((na) this).field_mb / 2;
                        var5_int = ((na) this).field_mb / 2;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = var6 + -var5_int;
                        var8 = var7;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 > (param0 ^ -1)) {
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
                        statePc = 14;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = param1 * var8 / param0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (((na) this).field_q > var8) {
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = ((na) this).field_q;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var8 ^ -1) >= (var7 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = var7;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = -param1 + param0;
                        var10 = -var8 + var7;
                        var11 = 0;
                        if (-1 <= (var9 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11 = (param3 * var10 + var9 / 2) / var9;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = var8 / 2 + var11;
                        var13 = ((na) this).field_Bb;
                        var13.field_mb = var5_int;
                        var13.field_s = 0;
                        var13.field_q = ((na) this).field_q;
                        var13.field_J = 0;
                        var13 = ((na) this).field_Gb;
                        var13.field_J = var6;
                        var13.field_mb = -var6 + ((na) this).field_mb;
                        var13.field_s = 0;
                        var13.field_q = ((na) this).field_q;
                        var13 = ((na) this).field_Cb;
                        var13.field_q = ((na) this).field_q;
                        var13.field_mb = var7;
                        var13.field_J = var5_int;
                        var13.field_s = 0;
                        var13 = ((na) this).field_Fb;
                        var13.field_mb = var12;
                        var13.field_q = ((na) this).field_q;
                        var13.field_J = 0;
                        var13.field_s = 0;
                        var13 = ((na) this).field_yb;
                        var13.field_J = var12;
                        var13.field_mb = -var12 + var7;
                        var13.field_s = 0;
                        if (param2 > 33) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var13.field_q = ((na) this).field_q;
                        var13 = ((na) this).field_Hb;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13.field_s = 0;
                        var13.field_J = var11;
                        var13.field_mb = var8;
                        stackOut_19_0 = ((na) this).field_Bb;
                        stackOut_19_1 = ((na) this).field_Gb;
                        stackOut_19_2 = ((na) this).field_Cb;
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        if (param1 >= param0) {
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
                        stackOut_20_0 = (hd) (Object) stackIn_20_0;
                        stackOut_20_1 = (hd) (Object) stackIn_20_1;
                        stackOut_20_2 = (hd) (Object) stackIn_20_2;
                        stackOut_20_3 = 1;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        stackIn_23_3 = stackOut_20_3;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (hd) (Object) stackIn_22_0;
                        stackOut_22_1 = (hd) (Object) stackIn_22_1;
                        stackOut_22_2 = (hd) (Object) stackIn_22_2;
                        stackOut_22_3 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
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
                        stackIn_23_2.field_lb = stackIn_23_3 != 0;
                        stackIn_23_1.field_lb = stackIn_23_3 != 0;
                        stackIn_23_0.field_lb = stackIn_23_3 != 0;
                        var13.field_q = ((na) this).field_q;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var5, "na.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        dg var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_20_0 = 0;
        dg stackIn_28_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        dg stackOut_25_0 = null;
        dg stackOut_27_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = -nb.field_k + so.field_e;
                        nb.field_k = qg.field_k + -(var1_int >> 572159937);
                        so.field_e = nb.field_k - -var1_int;
                        hm.field_I = -(fr.field_G >> 905985825) + eh.field_e;
                        var2 = hm.field_I;
                        var3 = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (j.field_a.length <= var3) {
                            statePc = 40;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = wj.field_x[var3];
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 != 0) {
                            statePc = 40;
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
                        stackOut_5_0 = 0;
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
                        if (stackIn_6_0 > var4) {
                            statePc = 14;
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
                        if (re.field_c.field_e == var4) {
                            statePc = 13;
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
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = ju.field_U;
                        if (var10 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = gt.field_w;
                        if (var10 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = du.field_a;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = j.field_a[var3];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var4 ^ -1) > -1) {
                            statePc = 19;
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
                        stackOut_17_0 = 1;
                        stackIn_20_0 = stackOut_17_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
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
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = ec.a(stackIn_20_0 != 0, var6, -23044);
                        var8 = qg.field_k + -(var7 >> 1534179681);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var4 < 0) {
                            statePc = 34;
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
                        if ((re.field_c.field_e ^ -1) != (var4 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = oh.field_d;
                        stackIn_28_0 = stackOut_25_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = ta.field_B;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = stackIn_28_0;
                        var2 = var2 + of.field_a;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null != var9) {
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9.a(var8 + -vg.field_zb, tk.field_zb - -(pb.field_H << -21119999), var2, (vg.field_zb << 602982305) + var7, 3);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2 = var2 + pb.field_H;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 < (var4 ^ -1)) {
                            statePc = 36;
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
                        sn.field_a.a(var6, var8, var2 + ag.field_g, var5, -1);
                        var2 = var2 + (pb.field_H + of.field_a + tk.field_zb);
                        if (var10 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        sn.field_i.a(var6, var8, var2 - -bs.field_f, var5, -1);
                        var2 = var2 + qp.field_H;
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
                        var3++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var1, "na.B(" + param0 + 41);
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean l(int param0) {
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
                        if (param0 < -30) {
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
                        ((na) this).field_yb = null;
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
                        if (0 == ((na) this).field_Hb.field_qb) {
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
                    throw nb.a((Throwable) (Object) var2, "na.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_15_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param6 >= param5) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if ((param6 + param4 ^ -1) > (param2 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (5 + param6 >= param2) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param3 ^ -1) != (param0 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7_int = -1 + param2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var7_int ^ -1;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 >= (param6 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = param6;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var8 ^ -1) <= (var7_int ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = pf.field_d[var8];
                        var10 = pf.field_d[1 + var8];
                        stackOut_15_0 = gn.a((byte) 8, param1, var9, var10);
                        stackIn_12_0 = stackOut_15_0 ? 1 : 0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var14 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        pf.field_d[var8] = var10;
                        pf.field_d[var8 - -1] = var9;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7_int--;
                        if (var14 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        var7_int = (1 & (param3 & param0)) + (param0 >> 416072801) + (param3 >> -819561055);
                        var8 = param6;
                        var9 = param0;
                        var10 = param3;
                        var11 = param6;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var11 ^ -1) <= (param2 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var12 = pf.field_d[var11];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = param1;
                        stackIn_47_0 = stackOut_25_0 ? 1 : 0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var14 != 0) {
                            statePc = 47;
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
                        if (stackIn_26_0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = w.field_a[var12];
                        stackIn_32_0 = stackOut_29_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = bl.field_m[var12];
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var13 = stackIn_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var13 <= var7_int) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        pf.field_d[var11] = pf.field_d[var8];
                        var8++;
                        pf.field_d[var8] = var12;
                        if (var13 < var9) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 45;
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
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = var13;
                        stackOut_39_0 = var14;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var13 ^ -1) >= (var10 ^ -1)) {
                            statePc = 45;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var10 = var13;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        na.a(param0, param1, var8, var9, 1, param5, param6);
                        stackOut_46_0 = var10;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        na.a(stackIn_47_0, param1, param2, param3, 1, param5, var8);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var7, "na.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                case 50: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void i(int param0) {
        ml var1 = null;
        int var2 = 0;
        he var3_ref_he = null;
        int var3_int = 0;
        long var3 = 0L;
        qb var3_ref_qb = null;
        int var4 = 0;
        qb var4_ref_qb = null;
        qb var4_ref = null;
        String var5 = null;
        int var5_int = 0;
        qb var5_ref = null;
        String var6 = null;
        String var7 = null;
        he var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_31_0 = 0;
        String stackIn_133_0 = null;
        String stackIn_134_0 = null;
        String stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        int stackIn_203_0 = 0;
        he stackIn_210_0 = null;
        he stackIn_211_0 = null;
        he stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_30_0 = 0;
        String stackOut_132_0 = null;
        String stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        String stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int stackOut_202_0 = 0;
        int stackOut_201_0 = 0;
        he stackOut_209_0 = null;
        he stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        he stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        L0: {
          var11 = Kickabout.field_G;
          var1 = un.field_e;
          var2 = ((iw) (Object) var1).h((byte) -118);
          if (param0 == 14) {
            break L0;
          } else {
            field_zb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (-1 == (var2 ^ -1)) {
                break L3;
              } else {
                if (-2 == (var2 ^ -1)) {
                  break L3;
                } else {
                  if (2 == var2) {
                    break L3;
                  } else {
                    if ((var2 ^ -1) == -4) {
                      break L3;
                    } else {
                      if (4 != var2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            var3_ref_he = (he) (Object) lw.field_d.g(24009);
            L4: while (true) {
              L5: {
                L6: {
                  if (var3_ref_he == null) {
                    break L6;
                  } else {
                    var3_ref_he.c((byte) -109);
                    var3_ref_he.f(9);
                    var3_ref_he = (he) (Object) lw.field_d.c(33);
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var3_ref_he = (he) (Object) pq.field_N.b((byte) 72);
                break L5;
              }
              L7: while (true) {
                L8: {
                  L9: {
                    if (null == var3_ref_he) {
                      break L9;
                    } else {
                      stackOut_18_0 = var3_ref_he.field_Gb;
                      stackIn_31_0 = stackOut_18_0 ? 1 : 0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var11 != 0) {
                        break L8;
                      } else {
                        stackOut_19_0 = stackIn_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        L10: {
                          L11: {
                            if (stackIn_20_0) {
                              break L11;
                            } else {
                              if (!var3_ref_he.field_Fb) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var3_ref_he.field_Fb) {
                              fh.field_b = fh.field_b - 1;
                              var3_ref_he.field_Fb = false;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var3_ref_he.field_Gb = false;
                          iw.a((byte) 81, var3_ref_he);
                          break L10;
                        }
                        var3_ref_he = (he) (Object) pq.field_N.a(param0 + -14);
                        if (var11 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = var2 ^ -1;
                  stackIn_31_0 = stackOut_30_0;
                  break L8;
                }
                L13: {
                  if (stackIn_31_0 != -2) {
                    break L13;
                  } else {
                    if (null != uv.field_i) {
                      h.field_f = uv.field_i.field_ec;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if ((var2 ^ -1) != -5) {
                    uv.field_i = null;
                    break L14;
                  } else {
                    var3_int = ((iw) (Object) var1).a((byte) 81);
                    uv.field_i = new qb(ss.field_j);
                    uv.field_i.a((long)var3_int, (byte) -113);
                    ra.a(false, 114, (iw) (Object) var1, uv.field_i);
                    vg.field_Ib = 0L;
                    break L14;
                  }
                }
                L15: {
                  L16: {
                    L17: {
                      if (var2 == 2) {
                        break L17;
                      } else {
                        if (-4 != (var2 ^ -1)) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (null != ow.field_b) {
                      break L15;
                    } else {
                      ow.field_b = new qb(ss.field_j);
                      if (var11 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  ow.field_b = null;
                  break L15;
                }
                L18: {
                  if (-4 != (var2 ^ -1)) {
                    break L18;
                  } else {
                    hw.field_k = true;
                    var3_int = 0;
                    L19: while (true) {
                      L20: {
                        L21: {
                          if ((er.field_h.length ^ -1) >= (var3_int ^ -1)) {
                            break L21;
                          } else {
                            er.field_h[var3_int] = ((iw) (Object) var1).j((byte) -82);
                            var3_int++;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (var11 == 0) {
                                continue L19;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        lk.field_l = ((iw) (Object) var1).h((byte) -110);
                        ru.field_C = ((iw) (Object) var1).h((byte) -105);
                        break L20;
                      }
                      var3_int = 0;
                      L22: while (true) {
                        L23: {
                          if (rf.field_d.length <= var3_int) {
                            break L23;
                          } else {
                            rf.field_d[var3_int] = ((iw) (Object) var1).j((byte) -81);
                            var3_int++;
                            if (var11 != 0) {
                              break L1;
                            } else {
                              if (var11 == 0) {
                                continue L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                }
                hw.field_k = false;
                if (var11 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L24: {
            if (var2 == 5) {
              break L24;
            } else {
              L25: {
                if ((var2 ^ -1) == -7) {
                  break L25;
                } else {
                  L26: {
                    if (7 != var2) {
                      break L26;
                    } else {
                      var3_ref_he = (he) (Object) rp.field_B.g(24009);
                      L27: while (true) {
                        L28: {
                          L29: {
                            if (var3_ref_he == null) {
                              break L29;
                            } else {
                              var3_ref_he.c((byte) -109);
                              var3_ref_he.f(-5);
                              var3_ref_he = (he) (Object) rp.field_B.c(33);
                              if (var11 != 0) {
                                break L28;
                              } else {
                                if (var11 == 0) {
                                  continue L27;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          fh.field_b = 0;
                          break L28;
                        }
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  L30: {
                    if (var2 != 8) {
                      break L30;
                    } else {
                      L31: {
                        var3_int = ((iw) (Object) var1).a((byte) 81);
                        var4_ref_qb = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                        if (var4_ref_qb == null) {
                          var4_ref = new qb(ss.field_j);
                          sr.field_f.a((am) (Object) var4_ref, (byte) -4, (long)var3_int);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      ra.a(true, 116, (iw) (Object) var1, var4_ref);
                      ve.a(var4_ref, (byte) -119);
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L32: {
                    if (-10 == (var2 ^ -1)) {
                      break L32;
                    } else {
                      L33: {
                        if (10 != var2) {
                          break L33;
                        } else {
                          var3_ref_qb = (qb) (Object) kq.field_yb.g(24009);
                          L34: while (true) {
                            L35: {
                              if (var3_ref_qb == null) {
                                break L35;
                              } else {
                                var3_ref_qb.c((byte) -109);
                                var3_ref_qb.f(-98);
                                var3_ref_qb = (qb) (Object) kq.field_yb.c(33);
                                if (var11 != 0) {
                                  break L1;
                                } else {
                                  if (var11 == 0) {
                                    continue L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      L36: {
                        if (11 == var2) {
                          break L36;
                        } else {
                          if (-13 == (var2 ^ -1)) {
                            break L36;
                          } else {
                            L37: {
                              if (var2 == 13) {
                                break L37;
                              } else {
                                L38: {
                                  L39: {
                                    if (var2 == 14) {
                                      break L39;
                                    } else {
                                      if ((var2 ^ -1) != -17) {
                                        break L38;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  L40: {
                                    var3 = ((iw) (Object) var1).i((byte) -124);
                                    var5 = (String) (Object) lo.a(var3, false);
                                    if (var5 == null) {
                                      break L40;
                                    } else {
                                      L41: {
                                        L42: {
                                          if (14 != var2) {
                                            break L42;
                                          } else {
                                            ((he) (Object) var5).field_Gb = true;
                                            if (var11 == 0) {
                                              break L41;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        }
                                        if (!((he) (Object) var5).field_Fb) {
                                          ((he) (Object) var5).field_Fb = true;
                                          fh.field_b = fh.field_b + 1;
                                          break L41;
                                        } else {
                                          break L41;
                                        }
                                      }
                                      iw.a((byte) 72, (he) (Object) var5);
                                      break L40;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L38;
                                  }
                                }
                                L43: {
                                  L44: {
                                    if (-16 == (var2 ^ -1)) {
                                      break L44;
                                    } else {
                                      if (-18 != (var2 ^ -1)) {
                                        break L43;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  L45: {
                                    var3 = ((iw) (Object) var1).i((byte) -124);
                                    var5_int = ((iw) (Object) var1).h((byte) -123);
                                    var6 = (String) (Object) lo.a(var3, false);
                                    if (var6 == null) {
                                      break L45;
                                    } else {
                                      L46: {
                                        if (var5_int == 0) {
                                          break L46;
                                        } else {
                                          ((he) (Object) var6).field_Mb = var5_int;
                                          ((he) (Object) var6).field_Jb = mg.field_c;
                                          break L46;
                                        }
                                      }
                                      L47: {
                                        L48: {
                                          if (-16 != (var2 ^ -1)) {
                                            break L48;
                                          } else {
                                            ((he) (Object) var6).field_Gb = false;
                                            if (var11 == 0) {
                                              break L47;
                                            } else {
                                              break L48;
                                            }
                                          }
                                        }
                                        if (!((he) (Object) var6).field_Fb) {
                                          break L47;
                                        } else {
                                          ((he) (Object) var6).field_Fb = false;
                                          fh.field_b = fh.field_b - 1;
                                          break L47;
                                        }
                                      }
                                      iw.a((byte) 56, (he) (Object) var6);
                                      break L45;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L43;
                                  }
                                }
                                L49: {
                                  if (-19 != (var2 ^ -1)) {
                                    break L49;
                                  } else {
                                    L50: {
                                      var3 = ((iw) (Object) var1).i((byte) -124);
                                      var5 = ((iw) (Object) var1).a(-128);
                                      var6 = ((iw) (Object) var1).a(-114);
                                      var7 = (String) (Object) nk.a(31253, var3);
                                      if (var7 != null) {
                                        break L50;
                                      } else {
                                        var7 = (String) (Object) new he(var5, var6, var3);
                                        pu.field_Eb.a((am) (Object) var7, (byte) -4, var3);
                                        uv.field_i.field_gc = uv.field_i.field_gc + 1;
                                        break L50;
                                      }
                                    }
                                    L51: {
                                      ((he) (Object) var7).field_Qb = ((iw) (Object) var1).a((byte) 81);
                                      var8_int = ((iw) (Object) var1).l(param0 ^ 120);
                                      stackOut_132_0 = (String) var7;
                                      stackIn_134_0 = stackOut_132_0;
                                      stackIn_133_0 = stackOut_132_0;
                                      if (-1 == (1 & var8_int ^ -1)) {
                                        stackOut_134_0 = (String) (Object) stackIn_134_0;
                                        stackOut_134_1 = 0;
                                        stackIn_135_0 = stackOut_134_0;
                                        stackIn_135_1 = stackOut_134_1;
                                        break L51;
                                      } else {
                                        stackOut_133_0 = (String) (Object) stackIn_133_0;
                                        stackOut_133_1 = 1;
                                        stackIn_135_0 = stackOut_133_0;
                                        stackIn_135_1 = stackOut_133_1;
                                        break L51;
                                      }
                                    }
                                    ((he) (Object) stackIn_135_0).field_Cb = stackIn_135_1 != 0;
                                    ((he) (Object) var7).field_Db = var8_int >> 830957377;
                                    ((he) (Object) var7).field_Sb = ((iw) (Object) var1).h((byte) -113);
                                    ((he) (Object) var7).field_Pb = ((iw) (Object) var1).h((byte) -119);
                                    lw.field_d.a((gn) (Object) var7, 3);
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                                L52: {
                                  if (-20 != (var2 ^ -1)) {
                                    break L52;
                                  } else {
                                    L53: {
                                      var3 = ((iw) (Object) var1).i((byte) -124);
                                      var5_int = ((iw) (Object) var1).h((byte) -126);
                                      var6 = (String) (Object) nk.a(31253, var3);
                                      if (var6 != null) {
                                        L54: {
                                          L55: {
                                            if (-1 != (var5_int ^ -1)) {
                                              break L55;
                                            } else {
                                              ((he) (Object) var6).c((byte) -109);
                                              if (var11 == 0) {
                                                break L54;
                                              } else {
                                                break L55;
                                              }
                                            }
                                          }
                                          ((he) (Object) var6).field_Mb = var5_int;
                                          ((he) (Object) var6).field_Jb = mg.field_c;
                                          break L54;
                                        }
                                        ((he) (Object) var6).f(-111);
                                        uv.field_i.field_gc = uv.field_i.field_gc - 1;
                                        break L53;
                                      } else {
                                        break L53;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L56: {
                                  if (-21 == (var2 ^ -1)) {
                                    break L56;
                                  } else {
                                    L57: {
                                      if (21 != var2) {
                                        break L57;
                                      } else {
                                        L58: {
                                          L59: {
                                            var3_int = ((iw) (Object) var1).a((byte) 81);
                                            if (-1 == (var3_int ^ -1)) {
                                              break L59;
                                            } else {
                                              vg.field_Ib = (long)var3_int + nj.a(36);
                                              if (var11 == 0) {
                                                break L58;
                                              } else {
                                                break L59;
                                              }
                                            }
                                          }
                                          vg.field_Ib = 0L;
                                          break L58;
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    L60: {
                                      if (-23 == (var2 ^ -1)) {
                                        break L60;
                                      } else {
                                        L61: {
                                          if (23 == var2) {
                                            break L61;
                                          } else {
                                            bd.a("L1: " + tr.b(0), (Throwable) null, param0 ^ 15);
                                            lr.b((byte) -116);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L61;
                                            }
                                          }
                                        }
                                        dd.field_c = ((iw) (Object) var1).i((byte) -124);
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                    mi.field_d = ((iw) (Object) var1).a((byte) 81);
                                    da.field_o = ((iw) (Object) var1).l(121);
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                ra.a(false, param0 ^ 116, (iw) (Object) var1, uv.field_i);
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L62: {
                              var3_int = ((iw) (Object) var1).a((byte) 81);
                              var4 = ((iw) (Object) var1).h((byte) -110);
                              var5_ref = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                              if (var5_ref != null) {
                                L63: {
                                  var5_ref.field_Tb = false;
                                  var6 = (String) (Object) var5_ref;
                                  if (var4 != 0) {
                                    var5_ref.field_Ab = var4;
                                    var5_ref.field_Db = mg.field_c;
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                                ((qb) (Object) var6).field_hc = false;
                                ve.a(var5_ref, (byte) -119);
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L36;
                            }
                          }
                        }
                      }
                      L64: {
                        var3_int = ((iw) (Object) var1).a((byte) 81);
                        var4_ref_qb = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                        if (null != var4_ref_qb) {
                          L65: {
                            L66: {
                              if (-12 == (var2 ^ -1)) {
                                break L66;
                              } else {
                                var4_ref_qb.field_Tb = true;
                                if (var11 == 0) {
                                  break L65;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            var4_ref_qb.field_hc = true;
                            break L65;
                          }
                          ve.a(var4_ref_qb, (byte) -119);
                          break L64;
                        } else {
                          break L64;
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L67: {
                    var3_int = ((iw) (Object) var1).a((byte) 81);
                    var4 = ((iw) (Object) var1).h((byte) -108);
                    var5_ref = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                    if (null == var5_ref) {
                      break L67;
                    } else {
                      L68: {
                        L69: {
                          if (-1 != (var4 ^ -1)) {
                            break L69;
                          } else {
                            var5_ref.c((byte) -109);
                            if (var11 == 0) {
                              break L68;
                            } else {
                              break L69;
                            }
                          }
                        }
                        var5_ref.field_Ab = var4;
                        var5_ref.field_Db = mg.field_c;
                        break L68;
                      }
                      var5_ref.f(-95);
                      break L67;
                    }
                  }
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L25;
                  }
                }
              }
              L70: {
                var3 = ((iw) (Object) var1).i((byte) -124);
                var5_int = ((iw) (Object) var1).h((byte) -121);
                var6 = (String) (Object) lo.a(var3, false);
                if (var6 == null) {
                  break L70;
                } else {
                  L71: {
                    if (!((he) (Object) var6).field_Fb) {
                      break L71;
                    } else {
                      fh.field_b = fh.field_b - 1;
                      ((he) (Object) var6).field_Fb = false;
                      break L71;
                    }
                  }
                  L72: {
                    L73: {
                      if ((var5_int ^ -1) != -1) {
                        break L73;
                      } else {
                        ((he) (Object) var6).c((byte) -109);
                        if (var11 == 0) {
                          break L72;
                        } else {
                          break L73;
                        }
                      }
                    }
                    ((he) (Object) var6).field_Jb = mg.field_c;
                    ((he) (Object) var6).field_Mb = var5_int;
                    break L72;
                  }
                  ((he) (Object) var6).f(param0 ^ -71);
                  break L70;
                }
              }
              if (var11 == 0) {
                break L1;
              } else {
                break L24;
              }
            }
          }
          L74: {
            var3 = ((iw) (Object) var1).i((byte) -124);
            var5 = ((iw) (Object) var1).a(62);
            var6 = ((iw) (Object) var1).a(param0 + 64);
            var7 = ((iw) (Object) var1).a(-101);
            var8 = lo.a(var3, false);
            if (var6.equals((Object) (Object) "")) {
              stackOut_202_0 = 0;
              stackIn_203_0 = stackOut_202_0;
              break L74;
            } else {
              stackOut_201_0 = 1;
              stackIn_203_0 = stackOut_201_0;
              break L74;
            }
          }
          L75: {
            L76: {
              var9 = stackIn_203_0;
              if (var8 != null) {
                break L76;
              } else {
                var8 = new he(var5, var7, var3);
                pq.field_N.a((am) (Object) var8, (byte) -4, var3);
                if (var11 == 0) {
                  break L75;
                } else {
                  break L76;
                }
              }
            }
            if (var9 != 0) {
              var8.a((byte) -2, var7, var5);
              break L75;
            } else {
              break L75;
            }
          }
          L77: {
            var8.field_Ib = nj.a(-93) + -(long)((iw) (Object) var1).k(4);
            var8.field_Qb = ((iw) (Object) var1).a((byte) 81);
            var10 = ((iw) (Object) var1).l(127);
            var8.field_Db = var10 >> 19134209;
            stackOut_209_0 = (he) var8;
            stackIn_211_0 = stackOut_209_0;
            stackIn_210_0 = stackOut_209_0;
            if ((1 & var10) == 0) {
              stackOut_211_0 = (he) (Object) stackIn_211_0;
              stackOut_211_1 = 0;
              stackIn_212_0 = stackOut_211_0;
              stackIn_212_1 = stackOut_211_1;
              break L77;
            } else {
              stackOut_210_0 = (he) (Object) stackIn_210_0;
              stackOut_210_1 = 1;
              stackIn_212_0 = stackOut_210_0;
              stackIn_212_1 = stackOut_210_1;
              break L77;
            }
          }
          stackIn_212_0.field_Cb = stackIn_212_1 != 0;
          var8.field_Sb = ((iw) (Object) var1).h((byte) -105);
          var8.field_Pb = ((iw) (Object) var1).h((byte) -110);
          iw.a((byte) 84, var8);
          break L1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Player is not involved in an auction.";
        field_Ab = 480;
        field_zb = new int[][]{new int[11], new int[11], new int[11], new int[11]};
    }
}
