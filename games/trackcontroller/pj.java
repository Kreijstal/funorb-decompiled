/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends db {
    final static q a(boolean param0, int param1) {
        la var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        la var8 = null;
        ob var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TrackController.field_F ? 1 : 0;
                    if (param1 == 21552) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var8 = ne.field_a;
                    var2 = var8;
                    var3 = var8.h(16383);
                    fd.field_e = 127 & var3;
                    if (0 == (128 & var3)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    nl.field_b = stackIn_5_0 != 0;
                    id.field_h = var8.h(16383);
                    lg.field_a = var8.f((byte) 84);
                    if ((fd.field_e ^ -1) == -3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ka.field_c = 0;
                    jb.field_d = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    jb.field_d = var8.d((byte) -124);
                    ka.field_c = var8.e(8);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var8.h(16383) != 1) {
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
                    ai.field_c = var8.g(0);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    o.field_b = ai.field_c;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    o.field_b = var8.g(0);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == (fd.field_e ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((fd.field_e ^ -1) != -5) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.d((byte) -117);
                    String discarded$5 = var8.g(0);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.d((byte) -117);
                    String discarded$7 = var8.g(0);
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
                    var5 = var8.d((byte) -67);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = od.field_a.a(98, var5);
                        li.field_l = var9.a((byte) 2);
                        if (o.field_b.equals((Object) (Object) ue.field_a)) {
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
                        stackOut_22_0 = var9.field_r;
                        stackIn_24_0 = stackOut_22_0;
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
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
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
                        hi.field_A = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new q(param0);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    hb.a((Throwable) (Object) var6, param1 ^ 21552, "CC1");
                    li.field_l = null;
                    hi.field_A = null;
                    return new q(param0);
                }
                case 27: {
                    li.field_l = nd.a(-101, (be) (Object) var8, 80);
                    hi.field_A = null;
                    return new q(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pj(vl param0, al param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void b(al param0, int param1) {
        super.b(param0, -77);
        if (param1 >= -61) {
            return;
        }
    }

    final static ng a(kk param0, int param1, int param2, int param3) {
        if (!sk.a(param1, param0, 1, param3)) {
            return null;
        }
        if (param2 >= -123) {
            return null;
        }
        return kj.a((byte) 106);
    }

    static {
    }
}
