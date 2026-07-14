/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static boolean field_h;
    static String field_f;
    static int[] field_d;
    static bd[] field_b;
    static int field_c;
    static vl field_g;
    static bd field_a;
    static String field_e;

    final static ln a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        en var8 = null;
        hj var9 = null;
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
                    var7 = HostileSpawn.field_I ? 1 : 0;
                    var8 = sc.field_g;
                    var3 = var8.l(32270);
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
                    pk.field_k = stackIn_3_0 != 0;
                    lb.field_b = 127 & var3;
                    ja.field_c = var8.l(32270);
                    pm.field_c = var8.c(10818);
                    if (param0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return null;
                }
                case 5: {
                    if (lb.field_b != 2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    jg.field_c = var8.e(8);
                    qa.field_e = var8.h(64);
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    qa.field_e = 0;
                    jg.field_c = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-2 != (var8.l(32270) ^ -1)) {
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
                    qa.field_f = var8.o(32);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    qg.field_o = var8.o(32);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    qg.field_o = qa.field_f;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (lb.field_b == 1) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((lb.field_b ^ -1) != -5) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.e(8);
                    String discarded$5 = var8.o(32);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.e(8);
                    String discarded$7 = var8.o(32);
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
                    var5 = var8.e(8);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = le.field_ub.a(var5, 1);
                        md.field_f = var9.d((byte) -53);
                        if (!qg.field_o.equals((Object) (Object) qg.field_r)) {
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
                        stackOut_23_0 = var9.field_w;
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
                        bn.field_b = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new ln(param1);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    ic.a((byte) -115, "CC1", (Throwable) (Object) var6);
                    md.field_f = null;
                    bn.field_b = null;
                    return new ln(param1);
                }
                case 27: {
                    md.field_f = pk.a(80, 122, (vi) (Object) var8);
                    bn.field_b = null;
                    return new ln(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_g = null;
        if (param0 != 2) {
          field_e = null;
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final static ri a(int param0, int param1) {
        ri var2 = null;
        var2 = new ri();
        ei.field_h.a((am) (Object) var2, 88);
        if (param1 != -2178) {
          field_e = null;
          wg.d(param1 ^ 11338, param0);
          return var2;
        } else {
          wg.d(param1 ^ 11338, param0);
          return var2;
        }
    }

    final static void b(int param0) {
        oj var2 = null;
        int var3 = 0;
        int var4 = 0;
        p var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = mm.field_m[0];
        var3 = -10;
        L0: while (true) {
          if (var3 > 10) {
            if (param0 != 192) {
              ri discarded$2 = wk.a(61, -59);
              return;
            } else {
              return;
            }
          } else {
            var5 = jn.field_F[ib.field_c];
            var5.field_i = 16;
            var5.field_c = var2.field_c + (double)var3;
            var5.field_j.a((byte) 46, var2.field_j);
            var5.field_l.a(var2.field_l, -28860);
            var5.field_e = 0;
            var5.field_l.field_f = var5.field_l.field_f - 0.5;
            var5.field_h = 0;
            var5.field_l.field_a = var5.field_l.field_a - 0.5;
            var5.field_l.a(6, (byte) 94, var5.field_c + 192.0);
            var5.field_l.a(20, (byte) 94, var5.field_c);
            ib.field_c = ib.field_c + 1;
            var3 += 10;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_h = false;
        field_f = "Reach the lift and go down to the next level.";
        field_b = new bd[12];
        field_d = new int[255];
        for (var0 = 0; -256 < (var0 ^ -1); var0++) {
            var1 = -384 + 3 * var0;
            if (255 < var1) {
                var1 = 255;
            }
            if (0 > var1) {
                var1 = 0;
            }
            field_d[var0] = var0 * 257 - -(var1 << 1331033072);
        }
        field_e = "Names can only contain letters, numbers, spaces and underscores";
        field_g = new vl();
    }
}
