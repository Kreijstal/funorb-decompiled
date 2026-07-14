/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends pj {
    static int[] field_r;

    final static br a(boolean param0, byte param1) {
        pl var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pl var8 = null;
        oq var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_22_0 = null;
        int[] stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Sumoblitz.field_L ? 1 : 0;
                    var8 = ig.field_a;
                    var2 = var8;
                    var3 = var8.e(-31302);
                    jb.field_h = 127 & var3;
                    if (0 == (var3 & 128)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    is.field_a = stackIn_3_0 != 0;
                    wn.field_a = var8.e(-31302);
                    bb.field_j = var8.a((byte) 113);
                    if (2 == jb.field_h) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    jt.field_w = 0;
                    eh.field_c = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    eh.field_c = var8.a(255);
                    jt.field_w = var8.c((byte) 126);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 < -51) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_r = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-2 != (var8.e(-31302) ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    wk.field_f = var8.d(-1);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    fu.field_E = var8.d(-1);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    fu.field_E = wk.field_f;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((jb.field_h ^ -1) == -2) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (4 != jb.field_h) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.a(255);
                    String discarded$5 = var8.d(-1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.a(255);
                    String discarded$7 = var8.d(-1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.a(255);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = kb.field_c.a(var5, -32769);
                        oi.field_c = var9.f(1118);
                        if (!fu.field_E.equals((Object) (Object) qv.field_o)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var9.field_u;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        tm.field_c = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new br(param0);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    ms.a("CC1", (Throwable) (Object) var6, 0);
                    tm.field_c = null;
                    oi.field_c = null;
                    return new br(param0);
                }
                case 27: {
                    oi.field_c = jb.a((fs) (Object) var8, 80, -14832);
                    tm.field_c = null;
                    return new br(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        int var1 = -113 % ((param0 - -31) / 47);
        field_r = null;
    }

    protected r() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
    }
}
