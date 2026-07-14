/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends fb {
    byte[] field_p;
    gf field_t;
    static am field_s;
    static int[] field_u;
    int field_q;
    static int[] field_v;
    static kj field_o;
    static int field_r;

    final byte[] e(int param0) {
        if (((si) this).field_j) {
            throw new RuntimeException();
        }
        int var2 = -15 / ((25 - param0) / 41);
        return ((si) this).field_p;
    }

    final static hl a(boolean param0, int param1) {
        hb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hb var8 = null;
        pi var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var8 = MonkeyPuzzle2.field_D;
                    var2 = var8;
                    var3 = var8.a((byte) 114);
                    if (-1 == (128 & var3 ^ -1)) {
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
                    eg.field_j = stackIn_3_0 != 0;
                    lf.field_c = var3 & 127;
                    if (param1 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    cd[] discarded$5 = si.f(78);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    o.field_c = var8.a((byte) 114);
                    bi.field_z = var8.i(66);
                    if (2 == lf.field_c) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    sd.field_b = 0;
                    c.field_b = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    sd.field_b = var8.j(param1 + 17277);
                    c.field_b = var8.c((byte) 115);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var8.a((byte) 114) ^ -1) != -2) {
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
                    lc.field_h = var8.f(-1);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    i.field_h = lc.field_h;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    i.field_h = var8.f(-1);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((lf.field_c ^ -1) == -2) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (lf.field_c != 4) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$6 = var8.j(17277);
                    String discarded$7 = var8.f(-1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$8 = var8.j(17277);
                    String discarded$9 = var8.f(-1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ba.field_h = ea.a((byte) 90, (gk) (Object) var8, 80);
                    wh.field_e = null;
                    return new hl(param0);
                }
                case 21: {
                    var5 = var8.j(17277);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = hi.field_a.a(var5, param1 ^ -32769);
                        ba.field_h = var9.b((byte) -54);
                        if (!i.field_h.equals((Object) (Object) cl.field_e)) {
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
                        stackOut_24_0 = var9.field_q;
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
                        wh.field_e = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return new hl(param0);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    kk.a("CC1", (byte) 123, (Throwable) (Object) var6);
                    ba.field_h = null;
                    wh.field_e = null;
                    return new hl(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cd[] f(int param0) {
        if (param0 != 0) {
          field_v = null;
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        } else {
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        }
    }

    public static void b(byte param0) {
        if (param0 != 20) {
          cd[] discarded$2 = si.f(-27);
          field_v = null;
          field_s = null;
          field_o = null;
          field_u = null;
          return;
        } else {
          field_v = null;
          field_s = null;
          field_o = null;
          field_u = null;
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
          if (((si) this).field_j) {
            return 0;
          } else {
            return 100;
          }
        } else {
          cd[] discarded$5 = si.f(-82);
          if (((si) this).field_j) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[4];
        field_v = new int[5];
        field_s = new am();
        field_r = 0;
    }
}
