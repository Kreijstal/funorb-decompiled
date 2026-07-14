/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends oh {
    int field_j;
    long field_l;
    static qr field_k;
    byte[] field_h;
    static String field_i;

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        if (param0 >= -6) {
            nf discarded$0 = sk.a(false, 27);
        }
    }

    final static nf a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        sl var8 = null;
        dp var9 = null;
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
                    var7 = ShatteredPlansClient.field_F ? 1 : 0;
                    var8 = sa.field_a;
                    var3 = var8.j(param1 ^ 113);
                    if (param1 == (128 & var3 ^ -1)) {
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
                    kr.field_b = stackIn_3_0 != 0;
                    ob.field_k = var3 & 127;
                    nj.field_a = var8.j(-77);
                    sp.field_j = var8.d(param1 ^ -31);
                    if (ob.field_k != 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    el.field_f = var8.f(param1 + -20975);
                    va.field_b = var8.k(param1 + 256);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    el.field_f = 0;
                    va.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (1 != var8.j(param1 + -66)) {
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
                    jc.field_s = var8.e(param1 ^ 0);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    em.field_a = var8.e(-1);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    em.field_a = jc.field_s;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == (ob.field_k ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((ob.field_k ^ -1) == -5) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    fm.field_f = 0;
                    mc.field_q = null;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    fm.field_f = var8.f(param1 + -20975);
                    mc.field_q = var8.e(param1 + 0);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (param0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ke.field_h = pe.a((ob) (Object) var8, param1 + 1, 80);
                    mb.field_p = null;
                    return new nf(param0);
                }
                case 18: {
                    var5 = var8.f(-20976);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = dh.field_c.a((byte) 47, var5);
                        ke.field_h = var9.f(80);
                        if (em.field_a.equals((Object) (Object) ln.field_o)) {
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
                        stackOut_20_0 = var9.field_o;
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
                        mb.field_p = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return new nf(param0);
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    jq.a(param1 + -29900, (Throwable) (Object) var6, "CC1");
                    ke.field_h = null;
                    mb.field_p = null;
                    return new nf(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sk(long param0, int param1, byte[] param2) {
        ((sk) this).field_l = param0;
        ((sk) this).field_j = param1;
        ((sk) this).field_h = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Terraformed system";
    }
}
