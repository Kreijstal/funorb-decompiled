/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends rg {
    int[] field_C;
    private String[] field_A;
    private int[] field_z;
    static long field_y;
    static int[] field_B;
    private int[][] field_x;
    static kf[] field_D;
    static int field_E;
    static int field_G;
    static String field_F;
    static boolean[] field_w;

    final String e(int param0) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_11_0 = null;
        String stackIn_12_0 = null;
        String stackOut_2_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_10_0 = null;
        String stackOut_11_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new StringBuilder(80);
                        if (null != ((ap) this).field_A) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = "";
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        StringBuilder discarded$6 = var2.append(((ap) this).field_A[param0]);
                        var3 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ap) this).field_A.length ^ -1) >= (var3 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        StringBuilder discarded$7 = var2.append("...");
                        stackOut_6_0 = var2.append(((ap) this).field_A[var3]);
                        stackIn_11_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var4 != 0) {
                            statePc = 11;
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
                        var3++;
                        if (var4 == 0) {
                            statePc = 5;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (StringBuilder) var2;
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
                        stackOut_11_0 = ((StringBuilder) (Object) stackIn_11_0).toString();
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var2_ref, "ap.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ap) this).field_C == null) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((ap) this).field_C.length <= var2_int) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((ap) this).field_C[var2_int] = md.a(((ap) this).field_C[var2_int], 32768);
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 14;
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
                        if (var3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_y = 55L;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) runtimeException, "ap.P(" + param0 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        nk.field_h = param0;
                        if (param1 == 3815994) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (null == tl.field_N) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tl.field_N.a(param0, (byte) -46);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (qo.field_C == null) {
                            statePc = 12;
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
                        qo.field_C.b(param0, param1 + -3804437);
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var2, "ap.A(" + param0 + 44 + param1 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ap() {
    }

    final static short[] a(short[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        short[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        short[] stackOut_4_0 = null;
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
                        if (param1 == -73) {
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
                        field_w = null;
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
                        stackOut_4_0 = sk.a((byte) -123, param2, param0, (short) 0);
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
                        stackOut_7_1 = new StringBuilder().append("ap.F(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
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
                    throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, ge param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -20678) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_D = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = param1.g(param0 ^ 20652);
                        if ((var3_int ^ -1) != -1) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 != 0) {
                            statePc = 14;
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
                    try {
                        stackOut_7_0 = var4;
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
                        if (stackIn_8_0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.a(var3_int, param1, (byte) -17);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) var3;
                        stackOut_17_1 = new StringBuilder().append("ap.D(").append(param0).append(44);
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_B = null;
              if (param0 == -111) {
                break L0;
              } else {
                short[] discarded$2 = ap.a((short[]) null, (byte) -77, 7);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_F = null;
          field_w = null;
          field_D = null;
        }
    }

    final static void a(di param0, boolean param1, qb[] param2, int[] param3, di param4) {
        qb[] var5 = null;
        qb[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        an var7 = null;
        vh var8 = null;
        vh var9 = null;
        vh var10 = null;
        vh var11 = null;
        dd[] var12 = null;
        dd[] var13 = null;
        dd[] var14 = null;
        vh var15 = null;
        dd[] var16 = null;
        dd[] var17 = null;
        int var18 = 0;
        L0: {
          var18 = Pool.field_O;
          var5 = gr.a(param4, "lobby", -24155, "crowns");
          gf.field_a = var5.length;
          if (null != param2) {
            var6 = new qb[param2.length + gf.field_a];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((gf.field_a ^ -1) >= (var7_int ^ -1)) {
                    break L3;
                  } else {
                    var6[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if ((var7_int ^ -1) <= (param2.length ^ -1)) {
                    break L5;
                  } else {
                    var6[var7_int + gf.field_a] = param2[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6_array = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if (gf.field_a <= var7_int) {
                    break L10;
                  } else {
                    var6_array[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (param2 != null) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (param3 != null) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (var7_int >= param2.length) {
                        break L13;
                      } else {
                        var6_array[var7_int + gf.field_a] = param2[var7_int].field_b;
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if (var7_int >= param2.length) {
                  break L8;
                } else {
                  var6_array[var7_int + gf.field_a] = param3[var7_int];
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            kj.field_j = 4;
            wh.field_b = 11;
            tk.field_i = 2;
            ad.field_x = 15;
            ja.field_b = 2;
            break L7;
          }
          var7 = he.a(param4, "largefont", 0, param0, "lobby");
          ae.field_a = he.a(param4, "generalfont", 0, param0, "lobby");
          ol.field_c = he.a(param4, "chatfont", 0, param0, "lobby");
          var7.a((bb[]) (Object) var5, var6_array);
          ae.field_a.a((bb[]) (Object) var5, var6_array);
          ol.field_c.a((bb[]) (Object) var5, var6_array);
          var8 = new vh(0L, (vh) null);
          var8.field_I = (lr) (Object) var7;
          var8.field_M = ad.field_x;
          var8.field_N = 16777215;
          var9 = var8;
          var8.field_cb = 1;
          var9.field_Fb = 1;
          var10 = new vh(0L, (vh) null);
          var10.field_M = ad.field_x;
          var10.field_N = 16777215;
          var10.field_I = (lr) (Object) ae.field_a;
          var10.field_cb = 1;
          var11 = var10;
          var11.field_Fb = 1;
          rl.field_d = new vh(0L, var8);
          rl.field_d.field_F = up.a(aj.a(0, "lobby", param4, "heading"), 12519);
          md.field_d = new vh(0L, (vh) null);
          md.field_d.field_F = qi.a(8421504, 4210752, false, 120, -86, false);
          ag.field_f = new vh(0L, (vh) null);
          ag.field_f.field_F = rp.a(32450, 3, 1, 114, 6316128, 6316128);
          wa.field_qb = new vh(0L, (vh) null);
          wa.field_qb.field_F = up.a(aj.a(0, "lobby", param4, "popup"), 12519);
          var12 = up.a(aj.a(0, "lobby", param4, "popup_mouseover"), 12519);
          var13 = aj.a(0, "lobby", param4, "button");
          var14 = up.a(aj.a(0, "lobby", param4, "tab_active"), 12519);
          dg.field_J = new vh(0L, var8);
          dg.field_J.field_F = var14;
          qg.field_f = new vh(0L, (vh) null);
          qg.field_f.field_hb = pf.a("lobby", (byte) 115, "closebutton", param4);
          qg.field_f.field_xb = pf.a("lobby", (byte) 101, "closebutton_mouseover", param4);
          bh.field_b = new vh(0L, var8);
          bh.field_b.field_F = qi.a(3815994, 2039583, true, 40, -86, true);
          lf.field_d = new vh(0L, var10);
          lf.field_d.field_tb = 2;
          lf.field_d.field_F = qi.a(3815994, 2039583, false, 30, -111, true);
          f.field_e = new vh(0L, var10);
          f.field_e.field_tb = 2;
          f.field_e.field_F = qi.a(3815994, 2039583, false, 30, -123, false);
          sd.field_Q = new vh(0L, var10);
          sd.field_Q.field_tb = 2;
          sd.field_Q.field_F = qi.a(3815994, 2039583, true, 30, -107, false);
          uo.field_Lb = new vh(0L, (vh) null);
          uo.field_Lb.field_cb = 1;
          uo.field_Lb.field_I = (lr) (Object) ae.field_a;
          uo.field_Lb.field_N = 13421772;
          uo.field_Lb.field_M = ad.field_x;
          ei.field_A = new vh(0L, uo.field_Lb);
          ei.field_A.field_P = 16777215;
          ei.field_A.field_K = 16777215;
          ei.field_A.field_N = 16764006;
          ei.field_A.field_Bb = 16777215;
          ei.field_A.field_zb = 8421504;
          var15 = new vh(0L, ei.field_A);
          var15.field_M = ad.field_x;
          var15.field_N = 16777215;
          var15.field_I = (lr) (Object) var7;
          pa.field_M = new vh(0L, uo.field_Lb);
          pa.field_M.field_F = qi.a(2236962, 2236962, false, 16, -125, false);
          pa.field_M.field_tb = 2;
          kq.field_a = new vh(0L, uo.field_Lb);
          kq.field_a.field_F = qi.a(1513239, 1513239, false, 16, -97, false);
          kq.field_a.field_tb = 2;
          tm.field_d = new vh(0L, pa.field_M);
          tm.field_d.a((byte) -87, ei.field_A);
          ge.field_s = new vh(0L, kq.field_a);
          ge.field_s.a((byte) -87, ei.field_A);
          var16 = aj.a(0, "lobby", param4, "button_mouseover");
          ko.field_c = new vq(wa.field_qb, var12, uo.field_Lb, ei.field_A, 3, 2, ja.field_b, 3, ad.field_x);
          ug.field_x = new vh(0L, ei.field_A);
          ug.field_x.field_O = 1;
          ug.field_x.field_Z = 1;
          ug.field_x.field_Gb = var16;
          ug.field_x.field_H = 1;
          ug.field_x.field_F = var13;
          ug.field_x.field_Q = 1;
          ug.field_x.field_X = aj.a(0, "lobby", param4, "button_mouseheld");
          ug.field_x.field_Kb = aj.a(0, "lobby", param4, "button_active");
          ug.field_x.field_Y = aj.a(0, "lobby", param4, "button_disabled");
          ug.field_x.field_Fb = 1;
          bb.field_c = new vh(0L, ei.field_A);
          bb.field_c.field_Fb = 1;
          bb.field_c.field_F = up.a(aj.a(0, "lobby", param4, "tab_inactive"), 12519);
          bb.field_c.field_Gb = up.a(aj.a(0, "lobby", param4, "tab_mouseover"), 12519);
          bb.field_c.field_Kb = var14;
          ea.field_u = new vh(0L, (vh) null);
          ea.field_u.field_F = rp.a(32450, 3, -1, 206, 1856141, 1127256);
          ri.field_P = new vh(0L, (vh) null);
          ri.field_P.field_F = rp.a(32450, 3, -1, 290, 11579568, 6052956);
          mg.field_c = new vh(0L, var15);
          mg.field_c.field_O = 1;
          mg.field_c.field_Fb = 1;
          mg.field_c.field_H = 1;
          mg.field_c.field_Q = 1;
          mg.field_c.field_Z = 1;
          rp.field_d = new vh(0L, mg.field_c);
          j.field_a = new vh(0L, ei.field_A);
          j.field_a.field_Q = 1;
          j.field_a.field_Fb = 1;
          j.field_a.field_H = 1;
          j.field_a.field_Z = 1;
          j.field_a.field_O = 1;
          p.field_i = new vh(0L, j.field_a);
          lh.field_g = new vh(0L, j.field_a);
          tg.field_d = new vh(0L, mg.field_c);
          i.field_l = new vh(0L, j.field_a);
          cq.field_d = new vh(0L, j.field_a);
          ef.field_c = new vh(0L, j.field_a);
          j.field_a.field_F = up.a(aj.a(0, "lobby", param4, "smallbutton"), 12519);
          j.field_a.field_Gb = up.a(aj.a(0, "lobby", param4, "smallbutton_mouseover"), 12519);
          j.field_a.field_Kb = up.a(aj.a(0, "lobby", param4, "smallbutton_active"), 12519);
          j.field_a.field_X = up.a(aj.a(0, "lobby", param4, "smallbutton_active"), 12519);
          j.field_a.field_Y = up.a(aj.a(0, "lobby", param4, "smallbutton_disabled"), 12519);
          rp.field_d.field_F = up.a(aj.a(0, "lobby", param4, "mediumbutton"), 12519);
          rp.field_d.field_Gb = up.a(aj.a(0, "lobby", param4, "mediumbutton_mouseover"), 12519);
          rp.field_d.field_X = up.a(aj.a(0, "lobby", param4, "mediumbutton_mouseheld"), 12519);
          mg.field_c.field_F = up.a(aj.a(0, "lobby", param4, "bigbutton"), 12519);
          mg.field_c.field_Gb = up.a(aj.a(0, "lobby", param4, "bigbutton_mouseover"), 12519);
          mg.field_c.field_X = up.a(aj.a(0, "lobby", param4, "bigbutton_mouseheld"), 12519);
          mg.field_c.field_Y = up.a(aj.a(0, "lobby", param4, "bigbutton_disabled"), 12519);
          p.field_i.field_F = up.a(aj.a(0, "lobby", param4, "greenbutton"), 12519);
          p.field_i.field_Gb = up.a(aj.a(0, "lobby", param4, "greenbutton_mouseover"), 12519);
          p.field_i.field_X = up.a(aj.a(0, "lobby", param4, "greenbutton_mouseheld"), 12519);
          lh.field_g.field_F = up.a(aj.a(0, "lobby", param4, "redbutton"), 12519);
          lh.field_g.field_Gb = up.a(aj.a(0, "lobby", param4, "redbutton_mouseover"), 12519);
          lh.field_g.field_X = up.a(aj.a(0, "lobby", param4, "redbutton_mouseheld"), 12519);
          tg.field_d.field_F = up.a(aj.a(0, "lobby", param4, "backbutton"), 12519);
          tg.field_d.field_Gb = up.a(aj.a(0, "lobby", param4, "backbutton_mouseover"), 12519);
          tg.field_d.field_X = up.a(aj.a(0, "lobby", param4, "backbutton_mouseheld"), 12519);
          tg.field_d.field_Y = up.a(aj.a(0, "lobby", param4, "backbutton_disabled"), 12519);
          ef.field_c.field_F = up.a(aj.a(0, "lobby", param4, "gameoptionbutton"), 12519);
          ef.field_c.field_Gb = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_mouseover"), 12519);
          if (!param1) {
            ef.field_c.field_Kb = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_active"), 12519);
            ef.field_c.field_X = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_active"), 12519);
            ef.field_c.field_Y = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_disabled"), 12519);
            i.field_l.field_F = up.a(aj.a(0, "lobby", param4, "chatbutton"), 12519);
            i.field_l.field_Gb = up.a(aj.a(0, "lobby", param4, "chatbutton_mouseover"), 12519);
            i.field_l.field_Kb = up.a(aj.a(0, "lobby", param4, "chatbutton_active"), 12519);
            i.field_l.field_X = up.a(aj.a(0, "lobby", param4, "chatbutton_active"), 12519);
            cq.field_d.field_F = up.a(aj.a(0, "lobby", param4, "chatfilterbutton"), 12519);
            cq.field_d.field_Gb = up.a(aj.a(0, "lobby", param4, "chatfilterbutton_mouseover"), 12519);
            cq.field_d.field_Kb = up.a(aj.a(0, "lobby", param4, "chatfilterbutton_active"), 12519);
            cq.field_d.field_X = up.a(aj.a(0, "lobby", param4, "chatfilterbutton_active"), 12519);
            var17 = aj.a(0, "lobby", param4, "checkbox");
            e.field_e = new wg(0L, var17[1], var17[0], 1, ei.field_A, (String) null);
            n.field_R = new vh(0L, (vh) null);
            n.field_R.field_F = hb.a(-32344, pf.a("lobby", (byte) 121, "slideregion", param4));
            n.field_R.field_Gb = hb.a(-32344, pf.a("lobby", (byte) 74, "slideregion_mouseover", param4));
            n.field_R.field_X = hb.a(-32344, pf.a("lobby", (byte) 47, "slideregion_mouseheld", param4));
            n.field_R.field_Y = hb.a(-32344, pf.a("lobby", (byte) 95, "slideregion_disabled", param4));
            gr.field_y = new vh(0L, (vh) null);
            gr.field_y.field_F = up.a(aj.a(0, "lobby", param4, "dragbar"), 12519);
            gr.field_y.field_Gb = up.a(aj.a(0, "lobby", param4, "dragbar_mouseover"), 12519);
            gr.field_y.field_X = up.a(aj.a(0, "lobby", param4, "dragbar_mouseheld"), 12519);
            gr.field_y.field_Y = up.a(aj.a(0, "lobby", param4, "dragbar_disabled"), 12519);
            uc.field_a = new vh(0L, (vh) null);
            uc.field_a.field_hb = pf.a("lobby", (byte) 86, "upbutton", param4);
            uc.field_a.field_xb = pf.a("lobby", (byte) 111, "upbutton_mouseover", param4);
            uc.field_a.field_G = pf.a("lobby", (byte) 64, "upbutton_mouseheld", param4);
            uc.field_a.field_ab = pf.a("lobby", (byte) 97, "upbutton_disabled", param4);
            kg.field_r = new vh(0L, (vh) null);
            kg.field_r.field_hb = pf.a("lobby", (byte) 73, "downbutton", param4);
            kg.field_r.field_xb = pf.a("lobby", (byte) 88, "downbutton_mouseover", param4);
            kg.field_r.field_G = pf.a("lobby", (byte) 105, "downbutton_mouseheld", param4);
            kg.field_r.field_ab = pf.a("lobby", (byte) 94, "downbutton_disabled", param4);
            iq.field_f = new db(0L, uc.field_a, kg.field_r, n.field_R, gr.field_y);
            em.field_J = new ao(0L, (vh) null, ub.field_n, iq.field_f, j.field_a, (String) null, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, ge param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        hj var7 = null;
        int var8 = 0;
        int var9 = 0;
        hj stackIn_32_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        hj stackOut_31_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 < -16) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_F = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-2 != (param0 ^ -1)) {
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
                        ((ap) this).field_A = jc.a(30634, param1.j(-25), '<');
                        if (var9 == 0) {
                            statePc = 52;
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
                        if (param0 != 2) {
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int = param1.g(-105);
                        ((ap) this).field_C = new int[var4_int];
                        var5 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4_int <= var5) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((ap) this).field_C[var5] = param1.d(-1034);
                        var5++;
                        if (var9 != 0) {
                            statePc = 52;
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
                        if (var9 == 0) {
                            statePc = 13;
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param0 == 3) {
                            statePc = 27;
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
                        if (4 == param0) {
                            statePc = 52;
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
                        statePc = 52;
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4_int = param1.g(-107);
                        ((ap) this).field_x = new int[var4_int][];
                        ((ap) this).field_z = new int[var4_int];
                        var5 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var5 >= var4_int) {
                            statePc = 52;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = param1.d(-1034);
                        var7 = tm.a(var6, -124);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var9 != 0) {
                            statePc = 52;
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
                        stackOut_31_0 = (hj) var7;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 != null) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 43;
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((ap) this).field_z[var5] = var6;
                        ((ap) this).field_x[var5] = new int[var7.field_b];
                        var8 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var8 ^ -1) <= (var7.field_b ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((ap) this).field_x[var5][var8] = param1.d(-1034);
                        var8++;
                        if (var9 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5++;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var9 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    try {
                        stackOut_47_0 = (RuntimeException) var4;
                        stackOut_47_1 = new StringBuilder().append("ap.B(").append(param0).append(44);
                        stackIn_50_0 = stackOut_47_0;
                        stackIn_50_1 = stackOut_47_1;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (param1 == null) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                        stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                        stackOut_48_2 = "{...}";
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_51_2 = stackOut_48_2;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 50: {
                    stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                    stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                    stackOut_50_2 = "null";
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    stackIn_51_2 = stackOut_50_2;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    throw wm.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 44 + param2 + 41);
                }
                case 52: {
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
        field_B = new int[8192];
        field_F = "Retry";
        field_G = 320;
        field_w = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
