/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private ci[] field_a;
    static String field_b;
    static String field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        jl.a(((bm) this).field_a, param2, param4, param0, (byte) -123, param1);
        if (param3 != 0) {
            ((bm) this).a(104, -42, -62, 0, 118);
        }
    }

    final static void a(int param0) {
        vj.a(-24517);
        int var1 = -35 / ((-83 - param0) / 35);
        bm.a(4, (byte) 1);
    }

    final static void a(int param0, byte param1) {
        if (param1 != 1) {
            bm.a(0, (byte) -88);
            ga.field_c = param0;
            return;
        }
        ga.field_c = param0;
    }

    final static void a(int param0, int param1, byte param2) {
        l.e(param1, param0, 16, 0);
        if (param2 < 126) {
          return;
        } else {
          l.e(param1, param0, 12, 16777215);
          l.e(param1, param0, 8, 0);
          return;
        }
    }

    final static dc a(boolean param0, int param1) {
        uc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        uc var8 = null;
        mb var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_22_0 = null;
        int[] stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Terraphoenix.field_V;
                    var8 = mk.field_j;
                    var2 = var8;
                    var3 = var8.a(-16384);
                    if (param1 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    im.field_c = 127 & var3;
                    if ((128 & var3) == 0) {
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
                    ng.field_s = stackIn_5_0 != 0;
                    da.field_d = var8.a(-16384);
                    pl.field_Q = var8.h((byte) 78);
                    if ((im.field_c ^ -1) != -3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    wb.field_c = var8.i(-25578);
                    ji.field_k = var8.d((byte) -114);
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    ji.field_k = 0;
                    wb.field_c = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-2 != (var8.a(-16384) ^ -1)) {
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
                    ge.field_c = var8.e(-1);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    wh.field_a = ge.field_c;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    wh.field_a = var8.e(-1);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (im.field_c == 1) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((im.field_c ^ -1) != -5) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$4 = var8.i(-25578);
                    String discarded$5 = var8.e(-1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$6 = var8.i(-25578);
                    String discarded$7 = var8.e(-1);
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
                    var5 = var8.i(-25578);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = fl.field_c.a(true, var5);
                        ea.field_n = var9.a(false);
                        if (!wh.field_a.equals((Object) (Object) kj.field_f)) {
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
                        stackOut_23_0 = var9.field_r;
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
                        ui.field_e = stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new dc(param0);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    bd.a((Throwable) (Object) var6, "CC1", -77);
                    ui.field_e = null;
                    ea.field_n = null;
                    return new dc(param0);
                }
                case 27: {
                    ea.field_n = ui.a(80, (dh) (Object) var8, param1 ^ -48);
                    ui.field_e = null;
                    return new dc(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bm(ci[] param0) {
        ((bm) this).field_a = param0;
    }

    final static fb a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        fb var9 = null;
        if (param4 < 74) {
          field_b = null;
          var9 = new fb(param1, param5, param0, param6, param8, param7, param2);
          hd.field_p.a((uf) (Object) var9, -16611);
          mh.a(var9, param3, 0);
          return var9;
        } else {
          var9 = new fb(param1, param5, param0, param6, param8, param7, param2);
          hd.field_p.a((uf) (Object) var9, -16611);
          mh.a(var9, param3, 0);
          return var9;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 68) {
            bm.a(36, -120, (byte) -40);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Left click to collect objective";
        field_c = "    Impassable Terrain";
    }
}
