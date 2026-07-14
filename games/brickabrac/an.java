/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends pj implements hf, ph {
    ug field_l;
    static String[] field_j;
    static String field_g;
    static th field_i;
    static int field_h;
    static long field_k;

    public static void c(byte param0) {
        field_j = null;
        field_i = null;
        field_g = null;
        if (param0 >= -22) {
            an.c((byte) 116);
        }
    }

    final qh c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        qh stackIn_6_0 = null;
        qh stackIn_9_0 = null;
        qh stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        qh stackOut_5_0;
        qh stackOut_8_0;
        Object stackOut_1_0;
        qh stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((an) this).field_l.a((byte) -89);
                        if (param0 == 4) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (qh) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var3 = ((an) this).field_l.i((byte) -117);
                        var4 = ((an) this).field_l.i(5390);
                        var5 = un.a(1);
                        if (1890 > var4) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = lp.field_xb;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (qh) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        if (var4 <= -3 + var5) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = lp.field_xb;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (qh) (Object) stackIn_9_0;
                }
                case 10: {
                    try {
                        if (!p.a((byte) -49, var2_int, var4, var3)) {
                            statePc = 12;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = lp.field_xb;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return (qh) (Object) stackIn_13_0;
                }
                case 14: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return lp.field_xb;
                }
                case 15: {
                    return ae.field_c;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(vb param0, int param1) {
        if (param1 != -40) {
            field_i = null;
        }
    }

    public final void a(vb param0, byte param1) {
        ((an) this).a(false);
        if (param1 > -39) {
            qh discarded$0 = ((an) this).c(113);
        }
    }

    final String b(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_6_0;
        Object stackOut_1_0;
        Object stackOut_9_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((an) this).field_l.a((byte) -93);
                        var3 = ((an) this).field_l.i((byte) -117);
                        var4 = ((an) this).field_l.i(5390);
                        if (param0 == 28600) {
                            statePc = 3;
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
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (String) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var5 = un.a(1);
                        if ((var4 ^ -1) > -1891) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 + -3 >= var4) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = rd.a(ig.field_J, new String[2], (byte) 103);
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (String) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        if (!p.a((byte) -49, var2_int, var4, var3)) {
                            statePc = 12;
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
                        stackOut_9_0 = null;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return (String) (Object) stackIn_10_0;
                }
                case 11: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return hj.field_Rb;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        for (var1 = 0; var1 < mm.field_Sb; var1++) {
            jk.field_s[var1] = null;
        }
        if (param0 != -56) {
            field_i = null;
        }
        mm.field_Sb = 0;
    }

    public final boolean a(byte param0) {
        if (param0 > -27) {
            field_k = 93L;
        }
        return ((an) this).field_l.h((byte) -124);
    }

    public an() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Show chat (1 unread message)";
        field_i = new th(4, 1, 1, 1);
    }
}
