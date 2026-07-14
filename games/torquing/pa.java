/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pa {
    static gq field_d;
    static int field_b;
    static String field_a;
    static int field_c;
    static sm[] field_e;

    final static hi a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        df var8 = null;
        p var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Torquing.field_u;
                    var8 = kj.field_d;
                    var3 = var8.i((byte) -101);
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
                    fd.field_a = stackIn_3_0 != 0;
                    n.field_u = var3 & 127;
                    hh.field_a = var8.i((byte) -101);
                    pm.field_r = var8.b(9);
                    if (n.field_u != 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    bg.field_n = var8.i(7088);
                    oh.field_b = var8.e((byte) 62);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    bg.field_n = 0;
                    oh.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var8.i((byte) -101) ^ -1)) {
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
                    un.field_c = var8.h((byte) 125);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    dg.field_m = var8.h((byte) 119);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    dg.field_m = un.field_c;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == n.field_u) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-5 != n.field_u) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var8.i(7088);
                    String discarded$5 = var8.h((byte) 125);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var8.i(7088);
                    String discarded$7 = var8.h((byte) 125);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (param0 == -11936) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    field_c = -78;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    np.field_m = Torquing.a(26657, 80, (fj) (Object) var8);
                    md.field_a = null;
                    return new hi(param1);
                }
                case 21: {
                    var5 = var8.i(param0 ^ -13616);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = qg.field_C.a(var5, 32767);
                        np.field_m = var9.c((byte) -127);
                        if (!dg.field_m.equals((Object) (Object) re.field_e)) {
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
                        stackOut_24_0 = var9.field_v;
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
                        md.field_a = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return new hi(param1);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    nn.a("CC1", (Throwable) (Object) var6, -9958);
                    np.field_m = null;
                    md.field_a = null;
                    return new hi(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 >= -48) {
            field_e = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static dn b(int param0, boolean param1) {
        dn var2 = null;
        dn stackIn_2_0 = null;
        dn stackIn_3_0 = null;
        dn stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        dn stackIn_6_0 = null;
        dn stackIn_7_0 = null;
        dn stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        dn stackOut_5_0 = null;
        dn stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        dn stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        dn stackOut_1_0 = null;
        dn stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        dn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 < 6) {
          L0: {
            field_a = null;
            var2 = new dn(true);
            stackOut_5_0 = (dn) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (dn) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (dn) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new dn(true);
            stackOut_1_0 = (dn) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (dn) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (dn) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new gq(0);
        field_a = "Waiting for levels";
    }
}
