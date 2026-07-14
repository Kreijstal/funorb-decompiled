/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb implements uj {
    static String field_b;
    static int field_c;
    static hn field_d;
    static int field_h;
    static boolean field_e;
    static int field_a;
    static String field_g;
    static int field_f;

    public final void a(boolean param0) {
        if (param0) {
            field_d = null;
            gd.field_x = 2;
            field_a = 1;
            return;
        }
        gd.field_x = 2;
        field_a = 1;
    }

    final static id a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ld var8 = null;
        fc var9 = null;
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
                    var7 = MinerDisturbance.field_ab;
                    var8 = kj.field_a;
                    var3 = var8.d((byte) -54);
                    pf.field_i = var3 & 127;
                    if ((128 & var3) == 0) {
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
                    sa.field_u = stackIn_3_0 != 0;
                    mk.field_a = var8.d((byte) -54);
                    il.field_v = var8.h(param1 + 120);
                    if (pf.field_i == 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    pl.field_c = 0;
                    ig.field_e = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    pl.field_c = var8.e(param1 ^ 32);
                    ig.field_e = var8.i(3);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var8.d((byte) -54) ^ -1)) {
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
                    lm.field_L = var8.a(false);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    vd.field_x = var8.a(false);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    vd.field_x = lm.field_L;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((pf.field_i ^ -1) == param1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((pf.field_i ^ -1) == -5) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var8.e(-76);
                    String discarded$5 = var8.a(false);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var8.e(-76);
                    String discarded$7 = var8.a(false);
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
                    var5 = var8.e(param1 ^ 50);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = lf.field_b.a(param1 ^ -25461, var5);
                        bf.field_c = var9.f(1);
                        if (vd.field_x.equals((Object) (Object) ti.field_J)) {
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
                        stackOut_20_0 = var9.field_y;
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
                        pi.field_l = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return new id(param0);
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    di.a((Throwable) (Object) var6, 1, "CC1");
                    bf.field_c = null;
                    pi.field_l = null;
                    return new id(param0);
                }
                case 25: {
                    bf.field_c = dl.a((sb) (Object) var8, 80, -27898);
                    pi.field_l = null;
                    return new id(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 127) {
            return;
        }
        field_g = null;
    }

    public final String a(byte param0) {
        int var2 = -97 % ((-33 - param0) / 62);
        return "Make Ore Gold";
    }

    final static ln[] a(String param0, String param1, bj param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.a(125, param1);
        if (param3 != 1) {
          return null;
        } else {
          var5 = param2.a(param0, var4, -120);
          return ek.a(var4, param2, param3 ^ 20838, var5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept";
        field_e = true;
        field_g = "Shaft: Pre-excavated shaft.";
        field_d = null;
    }
}
