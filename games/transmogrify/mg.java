/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private ii[] field_a;
    static boolean field_d;
    private int field_f;
    static volatile boolean field_c;
    static String field_e;
    private int[] field_b;

    public static void a(byte param0) {
        if (param0 != -28) {
            return;
        }
        field_e = null;
    }

    final static String a(String param0, boolean param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    if (param1) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = param3.indexOf(param0);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-1 == var4) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    param3 = param3.substring(0, var4) + param2 + param3.substring(param0.length() + var4);
                    stackIn_6_0 = (String) (param3);
                    stackIn_4_0 = stackIn_6_0;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4 = ((String) (Object) stackIn_4_0).indexOf(param0, param2.length() + var4);
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = (String) (param3);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    return (String) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Transmogrify.field_A ? 1 : 0;
                    var16 = this.field_a[0].field_j;
                    var15 = var16;
                    var14 = var15;
                    var7 = var14;
                    var8 = param0 & 16711935;
                    var9 = param0 >> -1582457240 & 255;
                    var10 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_b.length <= var10) {
                        statePc = 46;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var11 = this.field_b[var10];
                    var18 = var11 >> 870552456 ^ -1;
                    var17 = var11 & 65535 ^ -1;
                    if (var13 != 0) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var17 != var18) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var17 != var18) {
                        statePc = 77;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param3 >= this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    throw new RuntimeException();
                }
                case 8: {
                    sb.a(ic.field_d);
                    this.field_a[0].a(param4, param1);
                    var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                    sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                    var11 = param4 - -this.field_a[0].field_f;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var11 >= var10) {
                        statePc = 23;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_a[1].a(var11, param1);
                    var11 = var11 + this.field_a[1].field_f;
                    if (var13 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var13 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    var12 = this.field_a[2].field_f + var10;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var11 <= var12) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var13 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var13 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    throw new RuntimeException();
                }
                case 23: {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var12 = this.field_a[2].field_f + var10;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var11 <= var12) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var13 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 29: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    throw new RuntimeException();
                }
                case 33: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                case 35: {
                    throw new RuntimeException();
                }
                case 37: {
                    if (var13 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    throw new RuntimeException();
                }
                case 41: {
                    var12 = var11 & 255;
                    var14[var10] = cl.b(vg.c(var12 * var8 >> -413372120, 16711935), vg.c(var9 * var12, 65280));
                    if (var13 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (this.field_f == var10) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var16[var10] = param5;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var10++;
                    if (var13 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (param2 != 3) {
                        statePc = 77;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                        statePc = 75;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    sb.a(ic.field_d);
                    this.field_a[0].a(param4, param1);
                    var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                    sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                    var11 = param4 - -this.field_a[0].field_f;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var11 >= var10) {
                        statePc = 62;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_a[1].a(var11, param1);
                    var11 = var11 + this.field_a[1].field_f;
                    if (var13 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var13 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    var12 = this.field_a[2].field_f + var10;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var11 <= var12) {
                        statePc = 57;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var13 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (var13 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    throw new RuntimeException();
                }
                case 61: {
                    return;
                }
                case 62: {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var12 = this.field_a[2].field_f + var10;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var11 <= var12) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var13 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 68: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    throw new RuntimeException();
                }
                case 70: {
                    return;
                }
                case 71: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    throw new RuntimeException();
                }
                case 73: {
                    return;
                }
                case 74: {
                    if (var13 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    throw new RuntimeException();
                }
                case 76: {
                    return;
                }
                case 77: {
                    this.field_f = -35;
                    if (param3 < this.field_a[4].field_f + this.field_a[2].field_f + this.field_a[0].field_f) {
                        statePc = 108;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    sb.a(ic.field_d);
                    this.field_a[0].a(param4, param1);
                    var10 = param4 + (-this.field_a[4].field_f + -this.field_a[2].field_f + param3 + this.field_a[0].field_f >> 2139130593);
                    sb.g(param4 - -this.field_a[0].field_f, 0, var10, 480);
                    var11 = param4 - -this.field_a[0].field_f;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var11 >= var10) {
                        statePc = 93;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    this.field_a[1].a(var11, param1);
                    var11 = var11 + this.field_a[1].field_f;
                    if (var13 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var13 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    var12 = this.field_a[2].field_f + var10;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (var11 <= var12) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var13 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (var13 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    throw new RuntimeException();
                }
                case 91: {
                    return;
                }
                case 93: {
                    sb.b(ic.field_d);
                    this.field_a[2].b(var10, param1);
                    var11 = -this.field_a[4].field_f + (param4 - -param3);
                    sb.g(var10 - -this.field_a[2].field_f, 0, var11, 480);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var12 = this.field_a[2].field_f + var10;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var11 <= var12) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_a[3].a(var12, param1);
                    var12 = var12 + this.field_a[3].field_f;
                    if (var13 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var13 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 99: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    throw new RuntimeException();
                }
                case 101: {
                    return;
                }
                case 103: {
                    sb.b(ic.field_d);
                    this.field_a[4].a(var11, param1);
                    if (var13 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    throw new RuntimeException();
                }
                case 105: {
                    return;
                }
                case 107: {
                    if (var13 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    throw new RuntimeException();
                }
                case 109: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, boolean param1, int param2, boolean param3) {
        if (!param3) {
            mg.a(124, true, 121, true);
            return wf.a(-1);
        }
        return wf.a(-1);
    }

    final int a(boolean param0) {
        if (!param0) {
            return 117;
        }
        return this.field_a[0].field_g;
    }

    mg(ii[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = param0;
                        this.field_b = new int[param0[0].field_j.length];
                        ji.a(param0[0].field_j, 0, this.field_b, 0, this.field_b.length);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_b.length <= var2_int) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = this.field_b[var2_int];
                        if (var4 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((16756717 & var3) >> 705536496 ^ -1) >= -129) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var3 & 65455) >> 1449862344 <= 128) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-129 >= (255 & var3 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_f = var2_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (runtimeException);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("mg.<init>(");
                    stackIn_12_1 = stackIn_13_1;
                    if (param0 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = false;
        field_d = false;
    }
}
