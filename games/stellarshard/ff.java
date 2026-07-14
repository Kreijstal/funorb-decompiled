/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends nh {
    static int field_k;

    final ua a(int param0) {
        if (param0 != 160) {
            field_k = -55;
            return rg.field_J;
        }
        return rg.field_J;
    }

    final static void a(int param0, int param1) {
        ha var2 = pg.field_fb;
        var2.f(param1, 950);
        var2.a(false, param0);
        var2.a(false, 0);
    }

    ff(long param0, String param1) {
        super(param0, param1);
    }

    final static nj a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        ha var9 = null;
        od var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = stellarshard.field_B;
                    var9 = ae.field_N;
                    var3 = var9.f(4);
                    ii.field_J = var3 & 127;
                    if ((var3 & 128) == 0) {
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
                    eh.field_d = stackIn_3_0 != 0;
                    ha.field_t = var9.f(4);
                    k.field_d = var9.d(0);
                    if (-3 != (ii.field_J ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    mg.field_y = var9.c((byte) 79);
                    il.field_w = var9.c(true);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    il.field_w = 0;
                    mg.field_y = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var9.f(4) ^ -1)) {
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
                    ld.field_z = var9.e((byte) 122);
                    var5 = -101 % ((param1 - 46) / 36);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    oe.field_d = var9.e((byte) 110);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    oe.field_d = ld.field_z;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == (ii.field_J ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (ii.field_J != 4) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var9.c((byte) 105);
                    String discarded$5 = var9.e((byte) 106);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var9.c((byte) 105);
                    String discarded$7 = var9.e((byte) 106);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (param0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ug.field_b = ni.a(false, 80, (ka) (Object) var9);
                    rc.field_k = null;
                    return new nj(param0);
                }
                case 19: {
                    var6 = var9.c((byte) 62);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var10 = qh.field_e.a(32767, var6);
                        ug.field_b = var10.e(0);
                        if (!oe.field_d.equals((Object) (Object) wf.field_b)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = null;
                        stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var10.field_y;
                        stackIn_23_0 = stackOut_22_0;
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
                        rc.field_k = stackIn_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return new nj(param0);
                }
                case 25: {
                    var7 = (Exception) (Object) caughtException;
                    qe.a(-105, "CC1", (Throwable) (Object) var7);
                    rc.field_k = null;
                    ug.field_b = null;
                    return new nj(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
