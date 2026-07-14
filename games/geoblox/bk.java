/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static dm field_a;
    static dm field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = null;
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(rh param0, int param1, int param2, ob param3) {
        uf.field_a = param1 * sb.a(true) / 1000;
        ab.a(99, param0);
        ni.a(param0, 0);
        if (param2 < 97) {
          vd discarded$2 = bk.a(true, -54);
          ul.a(-21541, param0);
          jk.b((byte) -91);
          ad.a((byte) -32);
          gb.field_f = -uf.field_a + 0;
          return;
        } else {
          ul.a(-21541, param0);
          jk.b((byte) -91);
          ad.a((byte) -32);
          gb.field_f = -uf.field_a + 0;
          return;
        }
    }

    final static vd a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pk var8 = null;
        og var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_20_0 = null;
        int[] stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Geoblox.field_C;
                    var8 = eh.field_d;
                    var3 = var8.c((byte) 34);
                    gj.field_u = var3 & 127;
                    if ((param1 & var3) == -1) {
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
                    vd.field_l = stackIn_3_0 != 0;
                    bm.field_s = var8.c((byte) 34);
                    uf.field_c = var8.b(2901);
                    if (-3 != gj.field_u) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    tj.field_b = var8.b(true);
                    uk.field_o = var8.e(105);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    uk.field_o = 0;
                    tj.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var8.c((byte) 34) ^ -1)) {
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
                    cj.field_a = var8.e((byte) 117);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    jc.field_b = var8.e((byte) 124);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    jc.field_b = cj.field_a;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (gj.field_u == 1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((gj.field_u ^ -1) != -5) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var8.b(true);
                    String discarded$5 = var8.e((byte) 112);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var8.b(true);
                    String discarded$7 = var8.e((byte) 112);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = var8.b(true);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = rd.field_r.a((byte) -14, var5);
                        re.field_f = var9.e((byte) -69);
                        if (!jc.field_b.equals((Object) (Object) wd.field_f)) {
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
                        stackOut_20_0 = null;
                        stackIn_22_0 = (int[]) (Object) stackOut_20_0;
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
                        stackOut_21_0 = var9.field_m;
                        stackIn_22_0 = stackOut_21_0;
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
                        vj.field_c = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return new vd(param0);
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    gi.a((Throwable) (Object) var6, "CC1", (byte) 125);
                    vj.field_c = null;
                    re.field_f = null;
                    return new vd(param0);
                }
                case 25: {
                    re.field_f = qa.a((qc) (Object) var8, 0, 80);
                    vj.field_c = null;
                    return new vd(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dm(640, 640);
        field_c = "Username: ";
    }
}
