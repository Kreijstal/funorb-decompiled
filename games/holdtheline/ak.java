/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String[] field_d;
    static String field_a;
    static sa field_b;
    static int field_c;

    final static hj a(int param0, boolean param1, int param2) {
        hj stackIn_10_0 = null;
        hj stackIn_15_0 = null;
        hj stackIn_21_0 = null;
        hj stackIn_31_0 = null;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    if (param0 <= -24) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ak.a(124);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((param2 ^ -1) == 0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == vm.field_vb) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    vm.field_vb = dl.a(wj.field_n, "basic", false, "unachieved");
                    hi.field_N = new hj(32, 32);
                    vb.a(-79, hi.field_N);
                    vm.field_vb.c(0, 0, 32, 32);
                    ug.b(-1);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (!param1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = hi.field_N;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = vm.field_vb;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    if (null == cd.field_a) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (param1) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = cd.field_a[param2];
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = nl.field_h[param2];
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    if (!fb.field_i.b("achievements_128", 89)) {
                        statePc = 18;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (param1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = ra.field_hb;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = hi.a(32, (byte) -106, 32);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    cd.field_a = si.a(fb.field_i, 33, "achievements_128", "");
                    nl.field_h = new hj[cd.field_a.length];
                    ok.a(32381);
                    var3 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var3 >= cd.field_a.length) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    nl.field_h[var3] = new hj(32, 32);
                    nl.field_h[var3].f();
                    cd.field_a[var3].c(0, 0, 32, 32);
                    var3++;
                    if (var4 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var4 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ug.b(-1);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (param1) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = cd.field_a[param2];
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = nl.field_h[param2];
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    return stackIn_31_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int statePc = 0;
        int var9 = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = HoldTheLine.field_D;
                    var9 = param8 + (param5 + param2);
                    var10 = new hj[]{new hj(var9, var9), new hj(param7, var9), new hj(var9, var9), new hj(var9, param7), new hj(64, 64), new hj(var9, param7), new hj(var9, var9), new hj(param7, var9), new hj(var9, var9)};
                    var11_ref_hj__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var12 >= var11_ref_hj__.length) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_hj__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var14 >= var13.field_z.length) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_z[var14] = param0;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param5 <= var11) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var9 <= var12) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_z[var9 * (-var11 + var9 + -1) - -var12] = param1;
                    var10[8].field_z[var12 + var9 * (-1 + (-var11 + var9))] = param1;
                    var10[2].field_z[-var11 - (-var9 + (1 - var12 * var9))] = param1;
                    var10[8].field_z[var9 * var12 + (-1 + var9) + -var11] = param1;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = param5;
                    stackIn_24_1 = var11;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 <= stackIn_24_1) {
                        statePc = 34;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_35_0 = 0;
                    stackIn_26_0 = stackIn_35_0;
                    if (var15 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 33;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_z[var11 * var9 + var12] = param3;
                    var10[0].field_z[var11 + var9 * var12] = param3;
                    stackIn_24_0 = -var11 + var9;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = var12;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 > stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10[2].field_z[var11 * var9 + var12] = param3;
                    var10[6].field_z[var12 * var9 - -var11] = param3;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = param6;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var11 = stackIn_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var11 >= param7) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_46_0 = 0;
                    stackIn_38_0 = stackIn_46_0;
                    if (var15 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12 = stackIn_38_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param5 <= var12) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10[7].field_z[var11 + (var9 + (-var12 + -1)) * param7] = param1;
                    var10[5].field_z[var9 * var11 - (1 + -var9 - -var12)] = param1;
                    var10[1].field_z[var11 + var12 * param7] = param3;
                    var10[3].field_z[var12 + var11 * var9] = param3;
                    var12++;
                    if (var15 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var15 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var11++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var15 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var11 = stackIn_46_0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var11 >= param7 >> -570040031) {
                        statePc = 55;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var12 >= param8) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10[1].field_z[var11 + (var9 - (var12 + 1)) * param7] = param4;
                    var10[3].field_z[var11 * var9 + var9 - 1 + -var12] = param4;
                    var10[7].field_z[param7 * var12 - -var11] = param4;
                    var10[5].field_z[var12 + var11 * var9] = param4;
                    var12++;
                    if (var15 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var15 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = -1;
    }
}
