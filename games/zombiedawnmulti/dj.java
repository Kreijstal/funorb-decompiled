/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends gf implements fi, qg {
    wk field_n;
    static ak field_k;
    static ri field_p;
    static int field_m;
    static boolean field_l;
    static String field_o;

    public dj() {
    }

    public final void a(pm param0, boolean param1) {
        if (!param1) {
            ((dj) this).field_n = null;
        }
    }

    public static void g(int param0) {
        if (param0 != -3) {
          field_k = null;
          field_o = null;
          field_k = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    public final boolean b(int param0) {
        if (param0 != -3) {
            return false;
        }
        return ((dj) this).field_n.a(1872);
    }

    final re f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        re stackIn_2_0 = null;
        re stackIn_6_0 = null;
        re stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        re stackOut_5_0 = null;
        re stackOut_1_0 = null;
        re stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((dj) this).field_n.i(1);
                        var3 = ((dj) this).field_n.j(param0 + -191);
                        var4 = ((dj) this).field_n.g((byte) -118);
                        var5 = oa.b((byte) -63);
                        if (-1891 >= (var4 ^ -1)) {
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
                        stackOut_1_0 = jq.field_b;
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
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (var4 > var5 + param0) {
                            statePc = 5;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = jq.field_b;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (!dq.a((byte) -82, var3, var2_int, var4)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
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
                        stackOut_9_0 = jq.field_b;
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
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return jq.field_b;
                }
                case 12: {
                    return db.field_b;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(pm param0, int param1) {
        if (param1 != 0) {
            return;
        }
        ((dj) this).a(-1306);
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$3 = ((dj) this).e(-103);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        var2_int = ((dj) this).field_n.i(1);
                        var3 = ((dj) this).field_n.j(param0 + -191);
                        var4 = ((dj) this).field_n.g((byte) -86);
                        var5 = oa.b((byte) -44);
                        if ((var4 ^ -1) > -1891) {
                            statePc = 5;
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
                        if (var4 > var5 + -3) {
                            statePc = 5;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = vl.a(ia.field_v, new String[2], 2);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (!dq.a((byte) -65, var3, var2_int, var4)) {
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
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (String) (Object) stackIn_9_0;
                }
                case 10: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return wm.field_T;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ak();
        field_m = 4;
        field_o = "SCORE";
    }
}
