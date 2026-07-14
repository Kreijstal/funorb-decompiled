/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_b;
    static int field_e;
    static q[] field_c;
    static nh field_d;
    static String field_a;
    static ae field_g;
    static boolean field_f;

    final static int a(int param0, int param1, int param2) {
        if (param0 < -72) {
          if (param1 < param2) {
            return 2048 + -gj.a((param1 << -910904720) / param2, -111);
          } else {
            return gj.a((param2 << 1703558576) / param1, -106);
          }
        } else {
          int discarded$7 = d.a(48, -124, 86);
          if (param1 < param2) {
            return 2048 + -gj.a((param1 << -910904720) / param2, -111);
          } else {
            return gj.a((param2 << 1703558576) / param1, -106);
          }
        }
    }

    final static la a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        wj var8 = null;
        nf var9 = null;
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
                    var7 = DungeonAssault.field_K;
                    if (param1 > 40) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    d.a(-103, -28, 93, -59, false);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var8 = ra.field_c;
                    var3 = var8.c(true);
                    uk.field_a = 127 & var3;
                    if ((128 & var3) == -1) {
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
                    ac.field_l = stackIn_5_0 != 0;
                    wd.field_j = var8.c(true);
                    gg.field_d = var8.c((byte) 69);
                    if (-3 != uk.field_a) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    di.field_d = var8.k(0);
                    ce.field_w = var8.f(-114);
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    di.field_d = 0;
                    ce.field_w = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var8.c(true) != 1) {
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
                    ri.field_f = var8.d(-124);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    tk.field_v = var8.d(-96);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    tk.field_v = ri.field_f;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == (uk.field_a ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((uk.field_a ^ -1) == -5) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.k(0);
                    String discarded$5 = var8.d(-101);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.k(0);
                    String discarded$7 = var8.d(-101);
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
                    var5 = var8.k(0);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = fm.field_f.a(var5, -19256);
                        sa.field_t = var9.c((byte) -122);
                        if (tk.field_v.equals((Object) (Object) tc.field_u)) {
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
                        stackOut_22_0 = var9.field_D;
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
                        kp.field_a = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new la(param0);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    sm.a((Throwable) (Object) var6, 1, "CC1");
                    kp.field_a = null;
                    sa.field_t = null;
                    return new la(param0);
                }
                case 27: {
                    sa.field_t = sc.a(80, (ec) (Object) var8, 5);
                    kp.field_a = null;
                    return new la(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        ie.a(121);
        if (param4) {
            return;
        }
        gf.a(param0, param3, param2, param1);
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
          field_g = null;
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
        field_a = "Goblin Runt";
        field_f = false;
        field_g = new ae(1);
    }
}
