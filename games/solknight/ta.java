/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static char field_d;
    static boolean field_b;
    static long field_a;
    static kb field_e;
    static String[] field_c;

    final static int a(byte param0) {
        int var1 = 124 / ((43 - param0) / 37);
        return uh.field_d;
    }

    final static void a(byte param0, int param1) {
        if (param0 < 9) {
            return;
        }
        cj.a(-104);
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -28 % ((57 - param0) / 48);
                        ri.a(be.field_I, param1, true, kg.field_c, (byte) -81, bb.field_G, 0);
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (kg.field_c <= var3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        pd.field_e[param1 + var3] = var3;
                        var3++;
                        if (var4 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ri.a(dc.field_o, param1 + param1, false, param1 + kg.field_c, (byte) -81, bi.field_e, param1);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 >= kg.field_c) {
                            statePc = 11;
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
                        kg.field_c = param1;
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var2), "ta.E(" + param0 + ',' + param1 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, o[] param2, int param3, int param4, mg param5, int param6, int param7, int param8, o[] param9, int param10, int param11, mg param12, int param13, boolean param14) {
        try {
            o[] var16 = (o[]) null;
            pk.a(param1, 0, param4, param12, param7, rj.field_c, 480, pb.field_b, param13, param9, param3, (byte) -111, (o[]) null, hc.field_d, param8, param11, param6, param5, 0, param10, param2);
            if (param0) {
                ta.b((byte) 72);
            }
            ck.a(param14, (byte) 66);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ta.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 14) {
            ta.a((byte) -21);
            field_e = null;
            field_c = null;
            return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_a = 20000000L;
        field_e = new kb();
    }
}
