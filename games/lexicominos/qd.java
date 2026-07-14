/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_b;
    static int[] field_a;

    public static void b(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    final static gb a(boolean param0) {
        String var1 = dg.a(param0);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new gb(dg.a(false), ca.a((byte) 81));
    }

    final static vb a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        vb var8 = null;
        var8 = new vb(param5, param4, param7, param3, param2, param0);
        jl.field_a.b(param1 + -11680, (kd) (Object) var8);
        if (param1 != 11803) {
          gb discarded$2 = qd.a(false);
          vi.a(param6, var8, 1);
          return var8;
        } else {
          vi.a(param6, var8, 1);
          return var8;
        }
    }

    final static df a(int param0, boolean param1) {
        th var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        th var8 = null;
        me var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    var8 = ig.field_a;
                    var2 = var8;
                    var3 = var8.d(true);
                    if ((128 & var3) == param0) {
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
                    tf.field_a = stackIn_3_0 != 0;
                    kb.field_a = var3 & 127;
                    rl.field_E = var8.d(true);
                    jf.field_P = var8.f((byte) 8);
                    if (2 != kb.field_a) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    fd.field_g = var8.b(-1698573656);
                    kc.field_c = var8.a(86);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    kc.field_c = 0;
                    fd.field_g = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (1 != var8.d(true)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    ik.field_k = var8.c(false);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    gk.field_c = ik.field_k;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    gk.field_c = var8.c(false);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 == kb.field_a) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((kb.field_a ^ -1) == -5) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var8.b(-1698573656);
                    String discarded$5 = var8.c(false);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var8.b(-1698573656);
                    String discarded$7 = var8.c(false);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param1) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = var8.b(-1698573656);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = hi.field_d.a(param0 + 27467, var5);
                        oe.field_b = var9.c(-97);
                        if (gk.field_c.equals((Object) (Object) og.field_c)) {
                            statePc = 21;
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
                        stackOut_20_0 = var9.field_r;
                        stackIn_22_0 = stackOut_20_0;
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
                        stackOut_21_0 = null;
                        stackIn_22_0 = (int[]) (Object) stackOut_21_0;
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
                        eb.field_d = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return new df(param1);
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    uj.a("CC1", (Throwable) (Object) var6, 1);
                    eb.field_d = null;
                    oe.field_b = null;
                    return new df(param1);
                }
                case 25: {
                    oe.field_b = ij.a(80, -22651, (wf) (Object) var8);
                    eb.field_d = null;
                    return new df(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
