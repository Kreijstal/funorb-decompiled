/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ng field_b;
    static byte[][] field_c;
    static dg field_d;
    static String field_e;
    static int field_a;

    final static void a(byte param0, String param1) {
        try {
            sa.a((byte) 68, param1);
            int var2_int = -34 / ((-25 - param0) / 58);
            m.a(ca.field_o, -127, false);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static db[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int statePc = 0;
        int var9 = 0;
        db[] var10 = null;
        db[] var11_ref_db__ = null;
        int var11 = 0;
        int var12 = 0;
        db var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Lexicominos.field_L ? 1 : 0;
                    var9 = param1 + (param0 + param3);
                    var10 = new db[]{new db(var9, var9), new db(param7, var9), new db(var9, var9), new db(var9, param7), new db(64, 64), new db(var9, param7), new db(var9, var9), new db(param7, var9), new db(var9, var9)};
                    var11_ref_db__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var12 >= var11_ref_db__.length) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_db__[var12];
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
                    if (var14 >= var13.field_y.length) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_y[var14] = param2;
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
                    if (param0 <= var11) {
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
                    var10[6].field_y[var9 * (-var11 + (var9 - 1)) - -var12] = param6;
                    var10[8].field_y[var9 * (-1 + var9 - var11) - -var12] = param6;
                    var10[2].field_y[-var11 - (1 + -var9 - var9 * var12)] = param6;
                    var10[8].field_y[var9 - 1 - var11 + var12 * var9] = param6;
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
                    stackIn_24_0 = param0;
                    stackIn_24_1 = var11;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 <= stackIn_24_1) {
                        statePc = 33;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_34_0 = 0;
                    stackIn_26_0 = stackIn_34_0;
                    if (var15 != 0) {
                        statePc = 34;
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
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10[0].field_y[var12 - -(var9 * var11)] = param4;
                    var10[0].field_y[var11 + var9 * var12] = param4;
                    stackIn_24_0 = var12 ^ -1;
                    stackIn_29_0 = stackIn_24_0;
                    stackIn_24_1 = -var11 + var9 ^ -1;
                    stackIn_29_1 = stackIn_24_1;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 <= stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[2].field_y[var9 * var11 + var12] = param4;
                    var10[6].field_y[var12 * var9 + var11] = param4;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (param7 <= var11) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_45_0 = 0;
                    stackIn_37_0 = stackIn_45_0;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var12 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param0 <= var12) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var10[7].field_y[var11 + (-1 + -var12 + var9) * param7] = param6;
                    var10[5].field_y[-var12 - 1 - -var9 + var9 * var11] = param6;
                    var10[1].field_y[var11 + var12 * param7] = param4;
                    var10[3].field_y[var12 + var11 * var9] = param4;
                    var12++;
                    if (var15 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var15 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var11++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = param5;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 != 1) {
                        statePc = 56;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var11 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (param7 >> 1353960321 <= var11) {
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
                    if (param1 <= var12) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10[1].field_y[var11 + param7 * (var9 + (-var12 - 1))] = param8;
                    var10[3].field_y[-var12 + (var9 - (1 - var11 * var9))] = param8;
                    var10[7].field_y[var11 + var12 * param7] = param8;
                    var10[5].field_y[var11 * var9 + var12] = param8;
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
                case 56: {
                    return (db[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        cg var1 = (cg) ((Object) ca.field_n.a(true));
        if (!(var1 != null)) {
            ck.b((byte) -120);
            return;
        }
        th var2 = ig.field_a;
        if (param0) {
            String var3 = (String) null;
            rb.a((byte) -12, (String) null);
        }
        var2.d((byte) 19);
        var2.d((byte) 19);
        var2.d((byte) 19);
        var2.d((byte) 19);
        var1.b((byte) -121);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 50) {
            field_b = (ng) null;
        }
        field_e = null;
        field_c = (byte[][]) null;
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        wj.c(param3 ^ -8662);
        if (param3 != 14635) {
            return;
        }
        try {
            ug.field_A.h(0);
            eb.field_b = new ti(dd.field_d, (String) null, ca.field_k, param2, param1);
            di.field_x = new qj(ug.field_A, eb.field_b);
            ug.field_A.a(-14579, di.field_x);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "rb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = new byte[250][];
        field_b = new ng();
        field_d = new dg();
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
