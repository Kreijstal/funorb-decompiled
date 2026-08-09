/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static int field_j;
    int field_a;
    static int field_e;
    int field_d;
    static int field_f;
    static String field_b;
    int field_l;
    int field_k;
    int field_c;
    static int field_g;
    int field_i;
    static String field_h;

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != -8765) {
            bh.a(68);
        }
    }

    abstract void a(int param0, int param1);

    final static String a(byte param0) {
        String stackIn_9_0 = null;
        String stackIn_19_0 = null;
        String stackIn_26_0 = null;
        String stackIn_36_0 = null;
        int statePc = 0;
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var12 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param0 < 0) {
                        statePc = 20;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_j = -79;
                    var12 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
                    var1 = var12;
                    if (-1 > (rc.field_f ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return var1;
                }
                case 4: {
                    var1 = var12 + ":";
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (rc.field_f > var2) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return var1;
                }
                case 8: {
                    stackIn_19_0 = var1 + ' ';
                    stackIn_9_0 = stackIn_19_0;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var16 = stackIn_9_0;
                    var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                    var4 = var3 >> -1395198204;
                    var3 = var3 & 15;
                    if ((var4 ^ -1) <= -11) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 += 48;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 += 55;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var17 = var16 + (char)var4;
                    if (-11 < (var3 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3 += 55;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3 += 48;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var1 = var17 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (String) (var1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var18 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
                    var1 = var18;
                    if (-1 > (rc.field_f ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return var1;
                }
                case 22: {
                    var1 = var18 + ":";
                    var2 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (rc.field_f > var2) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return var1;
                }
                case 25: {
                    stackIn_36_0 = var1 + ' ';
                    stackIn_26_0 = stackIn_36_0;
                    if (var5 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var19 = stackIn_26_0;
                    var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
                    var4 = var3 >> -1395198204;
                    var3 = var3 & 15;
                    if ((var4 ^ -1) <= -11) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var4 += 48;
                    if (var5 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 += 55;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var20 = var19 + (char)var4;
                    if (-11 < (var3 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3 += 55;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var3 += 48;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var1 = var20 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (String) (var1);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    return stackIn_36_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = 0;
        field_h = "Account created successfully!";
    }
}
