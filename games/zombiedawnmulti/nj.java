/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    byte[] field_e;
    int field_i;
    int field_m;
    static int field_h;
    int field_c;
    int field_b;
    int field_j;
    byte[] field_l;
    static boolean field_f;
    int field_g;
    static String[] field_a;
    int field_k;
    static ri field_d;

    public static void a(byte param0) {
        if (param0 != 78) {
            ka discarded$0 = nj.a(false, (byte) -38);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final static ka a(boolean param0, byte param1) {
        ga var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ga var8 = null;
        tl var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    var8 = s.field_e;
                    var2 = var8;
                    var3 = var8.g(31365);
                    if (param1 > 69) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    wc.field_N = var3 & 127;
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
                    fe.field_R = stackIn_5_0 != 0;
                    of.field_g = var8.g(31365);
                    ek.field_K = var8.a((byte) -30);
                    if (2 == wc.field_N) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    tk.field_m = 0;
                    ti.field_W = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    tk.field_m = var8.d((byte) 69);
                    ti.field_W = var8.e(128);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var8.g(31365) != 1) {
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
                    kk.field_s = var8.f((byte) -71);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    ch.field_h = kk.field_s;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    ch.field_h = var8.f((byte) -121);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == wc.field_N) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-5 != wc.field_N) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ce.field_r = var8.d((byte) 69);
                    sn.field_Ib = var8.f((byte) -62);
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    ce.field_r = var8.d((byte) 69);
                    sn.field_Ib = var8.f((byte) -62);
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    ce.field_r = 0;
                    sn.field_Ib = null;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (!param0) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = var8.d((byte) 69);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = bd.field_c.a(var5, -11452);
                        pg.field_b = var9.e(-18572);
                        if (!ch.field_h.equals((Object) (Object) ta.field_lb)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_25_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var9.field_r;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        af.field_g = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return new ka(param0);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    bd.a("CC1", (Throwable) (Object) var6, false);
                    pg.field_b = null;
                    af.field_g = null;
                    return new ka(param0);
                }
                case 28: {
                    pg.field_b = jg.a((k) (Object) var8, 80, 3460);
                    af.field_g = null;
                    return new ka(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
    }
}
