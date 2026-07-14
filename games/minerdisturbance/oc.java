/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends hn {
    private String field_k;
    private String field_g;
    static int[] field_e;
    static int field_f;
    static bg field_i;
    static String field_h;
    static int[] field_l;
    static String field_j;

    final ec b(int param0) {
        if (param0 != 0) {
            field_j = null;
        }
        return hk.field_i;
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Exception var5 = null;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_149_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MinerDisturbance.field_ab;
                    if (!fl.field_d) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    tl.field_q = tl.field_q + 1;
                    if (tk.field_a) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ui.field_L = ui.field_L + 32;
                    if ((ui.field_L ^ -1) < -1) {
                        statePc = 5;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 5: {
                    tb.field_e = false;
                    ui.field_L = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 6: {
                    if (-1 != oj.field_J) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (11 >= q.field_c) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var1 = stackIn_10_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 11: {
                    if (nb.field_i[oj.field_J].c(-41)) {
                        statePc = 13;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (11 >= q.field_c) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var1 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var1 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ui.field_L = ui.field_L - 32;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-640 > ui.field_L) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var1 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ui.field_L = -640;
                    tk.field_a = false;
                    if (!el.field_c) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    lb.field_q = false;
                    fl.field_d = true;
                    mc.field_w = -1;
                    tb.field_e = true;
                    if (null == pd.field_b) {
                        statePc = 115;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    pd.field_b.field_K = false;
                    kh.a((byte) 92);
                    return;
                }
                case 26: {
                    if (q.field_c != oj.field_J) {
                        statePc = 28;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ah.field_e = -1;
                    if (oj.field_J == 2) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    sn.field_b[0] = null;
                    sn.field_b[1] = null;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    mc.field_w = oj.field_J;
                    oj.field_J = q.field_c;
                    if (oj.field_J == 5) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (-3 == oj.field_J) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    mc.field_w = 4;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var1 = -2;
                    if (-1 != ui.field_L) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = 0;
                    stackIn_43_0 = stackOut_36_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 37: {
                    if (-1 >= oj.field_J) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackOut_38_0 = 0;
                    stackIn_43_0 = stackOut_38_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 39: {
                    if (nb.field_i[oj.field_J].c(-39)) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = 0;
                    stackIn_43_0 = stackOut_40_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var2 = stackIn_43_0;
                    if (-12 != oj.field_J) {
                        statePc = 161;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (0 > var1) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var2 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    nb.field_i[var1].c(-1, oj.field_J);
                    nb.field_i[var1].b((byte) -108);
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (-1 < oj.field_J) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (1 >= var1) {
                        statePc = 90;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (oj.field_J == var1) {
                        statePc = 90;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    q.field_c = var1;
                    tk.field_a = true;
                    statePc = 90;
                    continue stateLoop;
                }
                case 84: {
                    if (1 <= var1) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (oj.field_J != var1) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (1 >= var1) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (oj.field_J == var1) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    q.field_c = var1;
                    tk.field_a = true;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (jk.field_ab == 0) {
                        statePc = 98;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (3 == oj.field_J) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (8 != oj.field_J) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    ce.a(ui.field_L, false, false, false);
                    statePc = 98;
                    continue stateLoop;
                }
                case 95: {
                    if (5 == oj.field_J) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    ce.a(ui.field_L, false, false, true);
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    fa.field_e = false;
                    if (oj.field_J != 4) {
                        statePc = 112;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (!eg.b(42)) {
                        statePc = 112;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (0 >= qd.field_R) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    qd.field_R = qd.field_R - 1;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var3 = 20 + (-ak.field_c.field_x + 640) + -ui.field_L;
                    var4 = 500 + -ak.field_c.field_A;
                    if (nk.field_w < var3) {
                        statePc = 112;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (640 <= nk.field_w) {
                        statePc = 112;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var4 > gb.field_e) {
                        statePc = 112;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (gb.field_e >= 480) {
                        statePc = 112;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    fa.field_e = true;
                    if (-1 == (jk.field_ab ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (0 != qd.field_R) {
                        statePc = 112;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    try {
                        qd.field_R = 25;
                        cn.a(bm.c(-125), "http://itunes.apple.com/us/app/miner-disturbance/id374275550?mt=8", 11050, true);
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    var5 = (Exception) (Object) caughtException;
                    var5.printStackTrace();
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (param0 == -18627) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    oc.e(5);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    return;
                }
                case 115: {
                    return;
                }
                case 117: {
                    el.field_c = true;
                    var1 = -1;
                    statePc = 133;
                    continue stateLoop;
                }
                case 118: {
                    stackOut_118_0 = 1;
                    stackIn_128_0 = stackOut_118_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = 0;
                    stackIn_128_0 = stackOut_119_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 121: {
                    mc.field_w = 4;
                    statePc = 155;
                    continue stateLoop;
                }
                case 122: {
                    if (mc.field_w == 0) {
                        statePc = 121;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var1 = mc.field_w;
                    statePc = 155;
                    continue stateLoop;
                }
                case 125: {
                    var1 = 4;
                    statePc = 155;
                    continue stateLoop;
                }
                case 126: {
                    if (mc.field_w == 6) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var3 = stackIn_128_0;
                    if (var3 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = 1;
                    stackIn_128_0 = stackOut_130_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 131: {
                    if (-6 == (oj.field_J ^ -1)) {
                        statePc = 130;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (oj.field_J != 2) {
                        statePc = 131;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (0 != oj.field_J) {
                        statePc = 133;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (-7 != oj.field_J) {
                        statePc = 135;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (oj.field_J == -5) {
                        statePc = 157;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var1 = var3;
                    statePc = 155;
                    continue stateLoop;
                }
                case 143: {
                    var3 = nb.field_i[oj.field_J].e(1);
                    if (var3 > -2) {
                        statePc = 142;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var2 != 0) {
                        statePc = 155;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 148: {
                    stackOut_148_0 = 1;
                    stackIn_149_0 = stackOut_148_0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    gd.field_w = stackIn_149_0 != 0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = 0;
                    stackIn_149_0 = stackOut_150_0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 151: {
                    if (gd.field_w) {
                        statePc = 150;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if ((wj.field_j ^ -1) <= -3) {
                        statePc = 151;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if ((lj.field_t ^ -1) != -13) {
                        statePc = 161;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (0 == oj.field_J) {
                        statePc = 155;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (-14 != lj.field_t) {
                        statePc = 157;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (!mm.b((byte) 70)) {
                        statePc = 77;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ih a(bj param0, byte param1, String param2, String param3, bj param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param4.a(127, param2);
        if (param1 != 125) {
          return null;
        } else {
          var6 = param4.a(param3, var5, -103);
          return pk.a(var6, param4, (byte) 82, var5, param0);
        }
    }

    public static void e(int param0) {
        field_i = null;
        field_j = null;
        field_l = null;
        field_e = null;
        if (param0 != -640) {
            oc.f(74);
        }
        field_h = null;
    }

    final static boolean d(int param0) {
        if (param0 <= 42) {
            Object var2 = null;
            ih discarded$0 = oc.a((bj) null, (byte) -68, (String) null, (String) null, (bj) null);
        }
        return cg.field_C;
    }

    oc(String param0, String param1) {
        ((oc) this).field_k = param1;
        ((oc) this).field_g = param0;
    }

    final void a(sb param0, byte param1) {
        if (param1 > -85) {
            return;
        }
        param0.a(8, ((oc) this).field_g);
        param0.a((byte) 97, ((oc) this).field_k);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_i = new bg(9, 0, 4, 1);
        field_l = new int[8192];
        field_h = "Scannox: Detects movement through rock.";
        field_j = "Age:";
    }
}
