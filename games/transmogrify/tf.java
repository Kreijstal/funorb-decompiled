/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int field_b;
    static int field_a;
    int field_c;

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        am var4 = null;
        o var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (am) ((Object) ec.field_b.a((byte) -95));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ei.a(true, param0, var4);
                        var4 = (am) ((Object) ec.field_b.a(true));
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        tf.a(-55, false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = (o) ((Object) mh.field_a.a((byte) -95));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == null) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        nk.a(param0, var5, -31995);
                        var5 = (o) ((Object) mh.field_a.a(true));
                        if (var3 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var2), "tf.B(" + param0 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, boolean param1, int param2) {
        boolean stackIn_79_0 = false;
        int stackIn_84_0 = 0;
        boolean stackIn_89_0 = false;
        int stackIn_95_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        String[] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        String[] stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        String[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        String[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        String stackIn_116_2 = null;
        String[] stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        String[] stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        String[] stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        String[] stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        String[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        String stackIn_124_2 = null;
        String[] stackIn_129_0 = null;
        String stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        String stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        String stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        String[] stackIn_162_0 = null;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        String[] stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_171_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_78_0;
        boolean stackOut_88_0;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    ej.field_n = true;
                    q.field_a = param2;
                    if (q.field_a != 0) {
                        statePc = 15;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) 110);
                    var4 = 3 - -var3_int;
                    ce.field_a = new int[var4];
                    qb.field_f = new String[var4];
                    var5 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var5 >= var4) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ce.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var9 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    uj.field_d = new int[2];
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    qb.field_f[var5] = nc.field_r[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var9 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    qb.field_f[-3 + var4] = "";
                    qb.field_f[var4 - 2] = vg.field_g;
                    ce.field_a[var4 + -2] = 0;
                    uj.field_d[0] = 4;
                    qb.field_f[var4 - 1] = oe.field_a;
                    ce.field_a[-1 + var4] = 1;
                    uj.field_d[1] = 5;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var9 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (1 != q.field_a) {
                        statePc = 29;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) -103);
                    var4 = var3_int + 2;
                    qb.field_f = new String[var4];
                    ce.field_a = new int[var4];
                    var5 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ce.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var9 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    uj.field_d = new int[1];
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var5 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var5 >= var3_int) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    qb.field_f[var5] = nc.field_r[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    qb.field_f[-2 + var4] = "";
                    qb.field_f[var4 - 1] = oe.field_a;
                    ce.field_a[-1 + var4] = 0;
                    uj.field_d[0] = 5;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var9 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((q.field_a ^ -1) == -3) {
                        statePc = 76;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (-4 != (q.field_a ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (!lk.field_b.field_e) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var3_int = vd.a(nc.field_r, gd.field_m, e.field_x, ce.field_b, (byte) -118);
                    if (var9 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var3_int = vd.a(nc.field_r, gd.field_m, nh.field_m, ce.field_b, (byte) -103);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var4 = 2 - -var3_int;
                    ce.field_a = new int[var4];
                    qb.field_f = new String[var4];
                    var5 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ce.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    uj.field_d = new int[1];
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    var5 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (var3_int <= var5) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    qb.field_f[var5] = nc.field_r[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var9 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    qb.field_f[-2 + var4] = "";
                    qb.field_f[-1 + var4] = oe.field_a;
                    ce.field_a[-1 + var4] = 0;
                    uj.field_d[0] = 5;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var9 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (4 != q.field_a) {
                        statePc = 61;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var3_int = vd.a(nc.field_r, gd.field_m, n.field_b, ce.field_b, (byte) -111);
                    var4 = 2 - -var3_int;
                    qb.field_f = new String[var4];
                    ce.field_a = new int[var4];
                    var5 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var5 >= var4) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ce.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var9 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    uj.field_d = new int[1];
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var5 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    qb.field_f[var5] = nc.field_r[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var9 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    qb.field_f[-2 + var4] = "";
                    qb.field_f[-1 + var4] = oe.field_a;
                    ce.field_a[-1 + var4] = 0;
                    uj.field_d[0] = 5;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var9 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (5 != q.field_a) {
                        statePc = 75;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3_int = vd.a(nc.field_r, gd.field_m, dg.field_e, ce.field_b, (byte) 71);
                    var4 = 3 - -var3_int;
                    qb.field_f = new String[var4];
                    ce.field_a = new int[var4];
                    var5 = 0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if ((var4 ^ -1) >= (var5 ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ce.field_a[var5] = -1;
                    var5++;
                    if (var9 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var9 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    uj.field_d = new int[2];
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var5 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((var5 ^ -1) <= (var3_int ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    qb.field_f[var5] = nc.field_r[var5];
                    var5++;
                    if (var9 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var9 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    qb.field_f[-3 + var4] = "";
                    qb.field_f[var4 - 2] = pe.field_a;
                    ce.field_a[var4 - 2] = 0;
                    uj.field_d[0] = 3;
                    qb.field_f[-1 + var4] = oe.field_a;
                    ce.field_a[var4 + -1] = 1;
                    uj.field_d[1] = 5;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var9 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    throw new IllegalArgumentException();
                }
                case 76: {
                    var3_int = vd.a(nc.field_r, gd.field_m, ij.a(ef.field_c, new String[]{"<br><%0><br>"}, (byte) -53), ce.field_b, (byte) -80);
                    var4 = -1;
                    var5 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var5 >= var3_int) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackOut_78_0 = "<%0>".equals(nc.field_r[var5]);
                    stackIn_84_0 = stackOut_78_0 ? 1 : 0;
                    stackIn_79_0 = stackOut_78_0;
                    if (var9 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (!stackIn_79_0) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = var4 ^ -1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    throw new IllegalStateException();
                }
                case 86: {
                    bd.field_p = new String[var4];
                    ji.a(nc.field_r, 0, bd.field_p, 0, var4);
                    ne.field_a = new String[-1 + var3_int - var4];
                    ji.a(nc.field_r, 1 + var4, ne.field_a, 0, -1 + (var3_int - var4));
                    var4 = -1;
                    var3_int = vd.a(nc.field_r, gd.field_m, ij.a(mk.field_C, new String[]{"<br><%0><br>"}, (byte) -46), ce.field_b, (byte) 112);
                    var5 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if ((var3_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackOut_88_0 = "<%0>".equals(nc.field_r[var5]);
                    stackIn_95_0 = stackOut_88_0 ? 1 : 0;
                    stackIn_89_0 = stackOut_88_0;
                    if (var9 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var4 = var5;
                    if (var9 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackIn_95_0 = var4 ^ -1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    throw new IllegalStateException();
                }
                case 98: {
                    ng.field_i = new String[var4];
                    ji.a(nc.field_r, 0, ng.field_i, 0, var4);
                    th.field_d = new String[-1 + var3_int + -var4];
                    ji.a(nc.field_r, var4 - -1, th.field_d, 0, -1 + -var4 + var3_int);
                    if (ng.field_i.length <= bd.field_p.length) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_101_0 = ng.field_i.length;
                    statePc = 101;
                    continue stateLoop;
                }
                case 100: {
                    stackIn_101_0 = bd.field_p.length;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var5 = stackIn_101_0;
                    if ((ne.field_a.length ^ -1) <= (th.field_d.length ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackIn_104_0 = th.field_d.length;
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = ne.field_a.length;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var6 = stackIn_104_0;
                    var7 = var5 + 7 - -var6;
                    ce.field_a = new int[var7];
                    qb.field_f = new String[var7];
                    var8 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var7 ^ -1) >= (var8 ^ -1)) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    ce.field_a[var8] = -1;
                    var8++;
                    if (var9 != 0) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var9 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    uj.field_d = new int[2];
                    qb.field_f[0] = ab.field_a;
                    qb.field_f[1] = wd.field_i;
                    ce.field_a[1] = 0;
                    ce.field_a[3] = 1;
                    qb.field_f[3] = ac.field_h;
                    uj.field_d[0] = 5;
                    qb.field_f[5] = "";
                    uj.field_d[1] = 2;
                    qb.field_f[4] = oi.field_j;
                    qb.field_f[2] = nj.field_l;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    var8 = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if ((var5 ^ -1) >= (var8 ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    stackIn_121_0 = qb.field_f;
                    stackIn_113_0 = stackIn_121_0;
                    stackIn_121_1 = 6 + var8;
                    stackIn_113_1 = stackIn_121_1;
                    stackIn_121_2 = -1;
                    stackIn_113_2 = stackIn_121_2;
                    stackIn_121_3 = -var5 + ng.field_i.length + var8 ^ -1;
                    stackIn_113_3 = stackIn_121_3;
                    if (var9 != 0) {
                        statePc = 121;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_115_0 = (String[]) ((Object) stackIn_113_0);
                    stackIn_114_0 = stackIn_115_0;
                    stackIn_115_1 = stackIn_113_1;
                    stackIn_114_1 = stackIn_115_1;
                    if (stackIn_113_2 >= stackIn_113_3) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_116_0 = (String[]) ((Object) stackIn_114_0);
                    stackIn_116_1 = stackIn_114_1;
                    stackIn_116_2 = "";
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = (String[]) ((Object) stackIn_115_0);
                    stackIn_116_1 = stackIn_115_1;
                    stackIn_116_2 = ng.field_i[-var5 + (var8 - -ng.field_i.length)];
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    stackIn_116_0[stackIn_116_1] = stackIn_116_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    qb.field_f[6 + var5] = null;
                    ce.field_a[var5 + 6] = -2;
                    var8 = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if ((var8 ^ -1) <= (var6 ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_168_0 = qb.field_f;
                    stackIn_120_0 = stackIn_168_0;
                    stackIn_168_1 = 7 - (-var5 - var8);
                    stackIn_120_1 = stackIn_168_1;
                    if (var9 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_121_0 = (String[]) ((Object) stackIn_120_0);
                    stackIn_121_1 = stackIn_120_1;
                    stackIn_121_2 = th.field_d.length ^ -1;
                    stackIn_121_3 = var8 ^ -1;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_123_0 = (String[]) ((Object) stackIn_121_0);
                    stackIn_122_0 = stackIn_123_0;
                    stackIn_123_1 = stackIn_121_1;
                    stackIn_122_1 = stackIn_123_1;
                    if (stackIn_121_2 >= stackIn_121_3) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackIn_124_0 = (String[]) ((Object) stackIn_122_0);
                    stackIn_124_1 = stackIn_122_1;
                    stackIn_124_2 = th.field_d[var8];
                    statePc = 124;
                    continue stateLoop;
                }
                case 123: {
                    stackIn_124_0 = (String[]) ((Object) stackIn_123_0);
                    stackIn_124_1 = stackIn_123_1;
                    stackIn_124_2 = "";
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    stackIn_124_0[stackIn_124_1] = stackIn_124_2;
                    var8++;
                    if (var9 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    c.field_c = lk.a(0);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    bk.field_c.field_a = uj.field_d.length;
                    var3_int = 0;
                    var4 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (var4 >= qb.field_f.length) {
                        statePc = 135;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_162_0 = qb.field_f;
                    stackIn_129_0 = stackIn_162_0;
                    if (var9 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_131_0 = stackIn_129_0[var4];
                    stackIn_130_0 = stackIn_131_0;
                    stackIn_131_1 = 0;
                    stackIn_130_1 = stackIn_131_1;
                    if (0 > ce.field_a[var4]) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_132_0 = (String) ((Object) stackIn_130_0);
                    stackIn_132_1 = stackIn_130_1;
                    stackIn_132_2 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = (String) ((Object) stackIn_131_0);
                    stackIn_132_1 = stackIn_131_1;
                    stackIn_132_2 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var5 = uc.a(stackIn_132_0, stackIn_132_1 != 0, stackIn_132_2 != 0);
                    if (var5 <= var3_int) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var3_int = var5;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if ((q.field_a ^ -1) != -3) {
                        statePc = 150;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var10 = bd.field_p;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var10.length <= var5) {
                        statePc = 143;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var11 = var10[var5];
                    var7 = uc.a(var11, false, false);
                    stackIn_145_0 = var3_int ^ -1;
                    stackIn_139_0 = stackIn_145_0;
                    stackIn_145_1 = var7 ^ -1;
                    stackIn_139_1 = stackIn_145_1;
                    if (var9 != 0) {
                        statePc = 145;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (stackIn_139_0 > stackIn_139_1) {
                        statePc = 141;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var3_int = var7;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var4_ref_String__ = ne.field_a;
                    var5 = 0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    stackIn_145_0 = var4_ref_String__.length;
                    stackIn_145_1 = var5;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (stackIn_145_0 <= stackIn_145_1) {
                        statePc = 150;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var12 = var4_ref_String__[var5];
                    var7 = uc.a(var12, false, false);
                    stackIn_151_0 = var7;
                    stackIn_147_0 = stackIn_151_0;
                    stackIn_151_1 = var3_int;
                    stackIn_147_1 = stackIn_151_1;
                    if (var9 != 0) {
                        statePc = 151;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (stackIn_147_0 <= stackIn_147_1) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var3_int = var7;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    ic.field_b = wd.field_j + -(var3_int >> 270975585);
                    jd.field_a = wd.field_j - (-var3_int + (var3_int >> -771634431));
                    stackIn_151_0 = ee.field_D + jl.field_o << -572514079;
                    stackIn_151_1 = bk.field_c.field_a;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    mf.field_d = stackIn_151_0 * stackIn_151_1;
                    var4 = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (var4 >= qb.field_f.length) {
                        statePc = 158;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    stackIn_159_0 = mf.field_d;
                    stackIn_154_0 = stackIn_159_0;
                    stackIn_159_1 = ce.field_a[var4];
                    stackIn_154_1 = stackIn_159_1;
                    if (var9 != 0) {
                        statePc = 159;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_156_0 = stackIn_154_0;
                    stackIn_155_0 = stackIn_156_0;
                    if (stackIn_154_1 >= 0) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_157_0 = stackIn_155_0;
                    stackIn_157_1 = fi.field_x;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_157_0 = stackIn_156_0;
                    stackIn_157_1 = hi.field_c;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    mf.field_d = stackIn_157_0 + stackIn_157_1;
                    var4++;
                    if (var9 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    qa.field_u = -(mf.field_d >> 512549121) + lb.field_j;
                    stackIn_159_0 = param0;
                    stackIn_159_1 = 33;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (stackIn_159_0 > stackIn_159_1) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    return;
                }
                case 161: {
                    stackIn_162_0 = qb.field_f;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    jj.field_c = new int[stackIn_162_0.length][];
                    var4 = 0;
                    var5 = qa.field_u;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (qb.field_f.length <= var4) {
                        statePc = 170;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var6 = ce.field_a[var4];
                    stackIn_171_0 = var6 ^ -1;
                    stackIn_165_0 = stackIn_171_0;
                    stackIn_171_1 = -1;
                    stackIn_165_1 = stackIn_171_1;
                    if (var9 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (stackIn_165_0 <= stackIn_165_1) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var5 = var5 + fi.field_x;
                    if (var9 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    stackIn_168_0 = qb.field_f;
                    stackIn_168_1 = var4;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var7 = uc.a(stackIn_168_0[stackIn_168_1], false, true);
                    var5 = var5 + ee.field_D;
                    var8 = -(var7 >> 277539905) + wd.field_j;
                    jj.field_c[var4] = new int[4];
                    jj.field_c[var4][0] = var8 + -vh.field_m;
                    jj.field_c[var4][1] = var5;
                    jj.field_c[var4][2] = (vh.field_m << 687384449) + var7;
                    var5 = var5 + (ee.field_D + (jl.field_o << 2062419617) - -hi.field_c);
                    jj.field_c[var4][3] = hi.field_c + (jl.field_o << -3910015);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_171_0 = q.field_a ^ -1;
                    stackIn_171_1 = -3;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (stackIn_171_0 != stackIn_171_1) {
                        statePc = 174;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    bk.field_c.a(-1, -1, (byte) 124, param1);
                    if (var9 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    bk.field_c.a(tl.a(196077633, oa.field_j, bk.field_a), 0, (byte) -104, param1);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tf(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_b = param3;
    }

    static {
    }
}
