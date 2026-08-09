/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_a;
    static ab field_g;
    int field_i;
    String field_f;
    String field_b;
    String field_e;
    sh field_d;
    static String field_h;
    static int field_c;

    final static ij[] a(int param0, ng param1) {
        int incrementValue$0 = 0;
        Object stackIn_3_0 = null;
        ij stackIn_3_1 = null;
        ij[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ij stackIn_8_1 = null;
        ij[] stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ij[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ij var4 = null;
        mk var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new ij[param1.b(2)];
                        var3 = param0;
                        var4 = (ij) ((Object) param1.a(true));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        stackIn_3_1 = (ij) (var4);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 == stackIn_3_1) {
                            statePc = 24;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4.field_i = var3;
                        stackIn_25_0 = (ij[]) (var2);
                        stackIn_5_0 = stackIn_25_0;
                        if (var6 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        incrementValue$0 = var3;
                        var3++;
                        stackIn_5_0[incrementValue$0] = var4;
                        var5 = (mk) ((Object) var4.field_k.a(true));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5 == null) {
                            statePc = 23;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_3_0 = null;
                        stackIn_8_0 = stackIn_3_0;
                        stackIn_3_1 = var5.field_k.field_m;
                        stackIn_8_1 = stackIn_3_1;
                        if (var6 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5.field_k = var5.field_k.field_m;
                        if (var6 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5.field_k == var4) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5.field_k.field_r != var4) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5.field_k.field_t.field_i < var5.field_i) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5.field_k.field_t.b((byte) -124);
                        var5.field_k.field_t = var5;
                        if (var6 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5.b((byte) -126);
                        if (var6 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5.field_k.field_r = var4;
                        var5.field_k.field_t = var5;
                        if (var6 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5.b((byte) -121);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = (mk) ((Object) var4.field_k.f(param0 ^ 2));
                        if (var6 == 0) {
                            statePc = 6;
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
                        var4 = (ij) ((Object) param1.f(2));
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = (ij[]) (var2);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var2_ref);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("sa.A(").append(param0).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param1 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 0) {
            String var2 = (String) null;
            sa.a((byte) 48, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        pf.field_m = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param0 <= 83) {
            return;
        }
        try {
            te.a(var2, var4, param1, var3, 1000);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 != 68) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                sa.a((byte) 6, (java.applet.Applet) null);
            }
            og.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "sa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Email (Login):";
        field_c = 65;
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
