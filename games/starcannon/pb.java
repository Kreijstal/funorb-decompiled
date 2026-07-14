/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static ge field_a;

    final static void b(int param0) {
        int var1 = -66 % ((param0 - -11) / 59);
        sb.field_g = new kh();
        t.field_h.c(20317, (uj) (Object) sb.field_g);
    }

    final static fb a(int param0, boolean param1) {
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ia var8 = null;
        ff var9 = null;
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
                    var7 = StarCannon.field_A;
                    var8 = se.field_p;
                    var2 = var8;
                    var3 = var8.j(7909);
                    if (param0 == 13607) {
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
                    pf.field_e = var3 & 127;
                    if (-1 == (var3 & 128 ^ -1)) {
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
                    cf.field_r = stackIn_5_0 != 0;
                    lj.field_i = var8.j(7909);
                    ne.field_d = var8.c((byte) 5);
                    if ((pf.field_e ^ -1) == -3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    wc.field_f = 0;
                    tk.field_e = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    wc.field_f = var8.i(-1174051992);
                    tk.field_e = var8.g(127);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (1 != var8.j(7909)) {
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
                    ee.field_d = var8.a(-117);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    fb.field_e = ee.field_d;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    fb.field_e = var8.a(-72);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (1 == pf.field_e) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((pf.field_e ^ -1) == -5) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.i(-1174051992);
                    String discarded$5 = var8.a(-95);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.i(-1174051992);
                    String discarded$7 = var8.a(-95);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param1) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.i(param0 + -1174065599);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = ad.field_C.a(var5, -32769);
                        vd.field_e = var9.e(-95);
                        if (fb.field_e.equals((Object) (Object) we.field_i)) {
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
                        stackOut_22_0 = var9.field_s;
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
                        se.field_o = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new fb(param1);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    hc.a((Throwable) (Object) var6, "CC1", (byte) 81);
                    se.field_o = null;
                    vd.field_e = null;
                    return new fb(param1);
                }
                case 27: {
                    vd.field_e = ha.a((rb) (Object) var8, 80, 0);
                    se.field_o = null;
                    return new fb(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 70) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ge();
    }
}
