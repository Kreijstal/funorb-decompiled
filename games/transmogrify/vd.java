/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    ui field_d;
    private int field_k;
    ui field_q;
    int field_c;
    int field_l;
    int field_e;
    int field_g;
    ui field_o;
    ui field_f;
    kg field_m;
    ui field_b;
    static volatile int field_a;
    int field_i;
    int field_j;
    int field_n;
    private boolean field_p;
    static kg field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, e param6, int param7) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        oe stackIn_42_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        oe var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        e var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var40 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 <= -58) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = 15;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var44 = param6;
                        if (var44.field_y == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-2 <= (var44.field_w ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var60 = var44.field_y;
                        vj.a(ca.field_c, var60, (byte) -69, 0, 0);
                        if (var40 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        qa.c(1702);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var54 = new int[param6.field_l];
                        var49 = var54;
                        var41 = var49;
                        var8 = var41;
                        var64 = new int[param6.field_l];
                        var62 = mk.field_w;
                        var63 = nh.field_j;
                        var61 = d.field_b;
                        var13 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var13 >= param6.field_l) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = var61[var13] * param7 + (param2 * var62[var13] + param3 * var63[var13]) >> -1240691992;
                        stackIn_23_0 = -1;
                        stackIn_10_0 = stackIn_23_0;
                        stackIn_23_1 = var14 ^ -1;
                        stackIn_10_1 = stackIn_23_1;
                        if (var40 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 >= stackIn_10_1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = -var14;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 <= var14) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_17_0 = 128;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var14 < 128) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = 256;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 128 + var14;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = stackIn_17_0;
                        var15 = param1 * var61[var13] + (var63[var13] * param5 + var62[var13] * param0) >> 599717448;
                        stackIn_19_0 = ug.field_c;
                        stackIn_18_0 = stackIn_19_0;
                        if (-1 < (var15 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = (int[]) ((Object) stackIn_18_0);
                        stackIn_20_1 = var15;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                        stackIn_20_1 = -var15;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var15 = stackIn_20_0[stackIn_20_1];
                        var14 = var14 * (-var15 + 256) >>> -2081409400;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = var13;
                        stackIn_23_1 = ug.field_h;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 >= stackIn_23_1) {
                            statePc = 58;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var14 = i.field_b[var13];
                        var15 = param6.field_o[var14];
                        var16 = param6.field_s[var14];
                        var17 = param6.field_G[var14];
                        if (var40 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (mk.field_w.length <= param6.field_b[var14]) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_28_0 = param6.field_b[var14];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = -1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18 = stackIn_28_0;
                        if ((mk.field_w.length ^ -1) < (param6.field_n[var14] ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = param6.field_n[var14];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var19 = stackIn_31_0;
                        if ((param6.field_J[var14] ^ -1) > (mk.field_w.length ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = param6.field_J[var14];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var20 = stackIn_34_0;
                        if (rg.field_L == null) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param6.field_f == null) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var14 ^ -1) <= (param6.field_f.length ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (-1 == param6.field_f[var14]) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (rg.field_L.length > param6.field_f[var14]) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_42_0 = null;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = rg.field_L[param6.field_f[var14]];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var21 = stackIn_42_0;
                        var22 = sg.field_a[var15];
                        var23 = d.field_a[var15];
                        var24 = sg.field_a[var16];
                        var25 = d.field_a[var16];
                        var26 = sg.field_a[var17];
                        var27 = d.field_a[var17];
                        if (var18 != var19) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var20 ^ -1) != (var19 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var28 = var54[var18];
                        var29 = var64[var18];
                        if (var21 == null) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_47_0 = var21.field_b;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = 8355711;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var30 = stackIn_47_0;
                        var31 = 16711935 & var30;
                        var32 = var30 & 65280;
                        var33 = (16711908 & var32 * var28) >>> 1848215592 | (-16711885 & var28 * var31) >>> 791840680;
                        var33 = var33 + var29 * 65793;
                        ri.a(var22, (var33 & 16711422) >> 381694881, var26, var27, (byte) -127, var23, var25, var24);
                        if (var40 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_51_0 = 8355711;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = var21.field_b;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var34 = stackIn_51_0;
                        var35 = 16711935 & var34;
                        var36 = 65280 & var34;
                        var37 = (var35 * var28 & -16711934) >>> -1656681048 | (16711865 & var36 * var28) >>> -1976531352;
                        var38 = (var29 * var36 & 16711799) >>> 990719784 | (var29 * var35 & -16711820) >>> 1225087880;
                        var38 = var38 + var32 * 65793;
                        var39 = (16711897 & var30 * var36) >>> -272417144 | (-16711842 & var30 * var35) >>> -628493656;
                        var37 = var37 + 65793 * var31;
                        var39 = var39 + var33 * 65793;
                        kl.a(var38 >> 1696874928, var23, (var39 & 65521) >> 348443848, var27, var24, var25, var39 & 255, var37 >> -1049315600, (65468 & var37) >> 980725064, (byte) 44, var26, var38 & 255, 255 & var38 >> 863241832, var22, var39 >> -250309264, 255 & var37);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var13++;
                        if (var40 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_56_0 = (RuntimeException) (var8_ref);
                    stackIn_55_0 = stackIn_56_0;
                    stackIn_56_1 = new StringBuilder().append("vd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_55_1 = stackIn_56_1;
                    if (param6 == null) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_55_1);
                    stackIn_57_2 = "{...}";
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_57_2 = "null";
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    throw ch.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param7 + ')');
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(String[] args, int param1, String param2, kg param3, byte param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param2);
              if (param1 < var5_int) {
                break L1;
              } else {
                if (-1 == param2.indexOf("<br>")) {
                  args[0] = param2;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (-1 + (var5_int + param1)) / param1;
            param1 = var5_int / var6;
            var6 = 0;
            var8 = 22 % ((5 - param4) / 58);
            var7 = 0;
            var9 = param2.length();
            var10 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var10 >= var9) {
                    break L4;
                  } else {
                    var11 = param2.charAt(var10);
                    stackIn_19_0 = var11;

                    stackIn_19_1 = 32;

                    if (var14 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_19_0 == stackIn_19_1) {
                            break L6;
                          } else {
                            if (var11 != 45) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var12 = param2.substring(var7, 1 + var10).trim();
                        var13 = param3.a(var12);
                        if ((param1 ^ -1) < (var13 ^ -1)) {
                          break L5;
                        } else {
                          incrementValue$0 = var6;
                          var6++;
                          args[incrementValue$0] = var12;
                          var7 = var10 - -1;
                          break L5;
                        }
                      }
                      L7: {
                        if (62 != var11) {
                          break L7;
                        } else {
                          if (!param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                            break L7;
                          } else {
                            incrementValue$1 = var6;
                            var6++;
                            args[incrementValue$1] = param2.substring(var7, -3 + var10).trim();
                            var7 = 1 + var10;
                            break L7;
                          }
                        }
                      }
                      var10++;
                      if (var14 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_19_0 = var7 ^ -1;
                stackIn_19_1 = var9 ^ -1;
                break L3;
              }
              L8: {
                if (stackIn_19_0 > stackIn_19_1) {
                  incrementValue$2 = var6;
                  var6++;
                  args[incrementValue$2] = param2.substring(var7, var9).trim();
                  break L8;
                } else {
                  break L8;
                }
              }
              stackIn_23_0 = var6;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("vd.D(");

            if (args == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static void a(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        o var4 = null;
        int var5 = 0;
        am var6_ref_am = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        kg var27 = null;
        hj var28 = null;
        hj var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var28 = nf.field_l;
                        var29 = var28;
                        var2 = var29.d((byte) 114);
                        if (-1 == (var2 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2 ^ -1) == -2) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        d.a((Throwable) null, 94, "HS1: " + ik.q(48));
                        pc.a(1);
                        if (var26 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = var29.a((byte) -96);
                        var4_long = var29.e((byte) 110);
                        var6_ref_am = (am) ((Object) ec.field_b.a((byte) -95));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6_ref_am == null) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_62_0 = var3 ^ -1;
                        stackIn_8_0 = stackIn_62_0;
                        stackIn_62_1 = var6_ref_am.field_p ^ -1;
                        stackIn_8_1 = stackIn_62_1;
                        if (var26 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6_ref_am = (am) ((Object) ec.field_b.a(true));
                        if (var26 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6_ref_am != null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        pc.a(1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var6_ref_am.field_o = var4_long;
                        var6_ref_am.c(param0 + -11);
                        if (var26 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = var29.a((byte) -97);
                        var4 = (o) ((Object) mh.field_a.a((byte) -95));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4 == null) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_62_0 = var3 ^ -1;
                        stackIn_17_0 = stackIn_62_0;
                        stackIn_62_1 = var4.field_j ^ -1;
                        stackIn_17_1 = stackIn_62_1;
                        if (var26 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 != stackIn_17_1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var26 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = (o) ((Object) mh.field_a.a(true));
                        if (var26 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var4 != null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        pc.a(param0 ^ 17);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var5 = var29.d((byte) 53);
                        if (0 == var5) {
                            statePc = 60;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var6 = var4.field_h;
                        od.field_l[0].field_a = null;
                        od.field_l[0].field_e = w.field_a;
                        od.field_l[0].field_c = false;
                        var7 = var4.field_n;
                        var8_int = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var5 ^ -1) >= (var8_int ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        od.field_l[var8_int].field_e = var28.g(12248);
                        od.field_l[var8_int].field_c = false;
                        stackIn_62_0 = var29.d((byte) 72);
                        stackIn_28_0 = stackIn_62_0;
                        stackIn_62_1 = 1;
                        stackIn_28_1 = stackIn_62_1;
                        if (var26 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        od.field_l[var8_int].field_a = null;
                        if (var26 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        od.field_l[var8_int].field_a = var29.g(12248);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        dupTemp$0 = new String[3][var6];
                        var4.field_m = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = new String[3][var6];
                        dupTemp$1 = new long[3][var6];
                        var4.field_g = dupTemp$1;
                        var10 = dupTemp$1;
                        dupTemp$2 = new int[3][var6 * var7];
                        var4.field_l = dupTemp$2;
                        var11 = dupTemp$2;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var29.d((byte) 41);
                        if (-1 <= (var18 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var19 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var19 >= var18) {
                            statePc = 60;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var20 = var28.d((byte) 102);
                        var21 = od.field_l[var20].field_e;
                        var22 = var29.e((byte) 115);
                        var24 = var29.field_h;
                        stackIn_62_0 = var6 ^ -1;
                        stackIn_37_0 = stackIn_62_0;
                        stackIn_62_1 = var19 ^ -1;
                        stackIn_37_1 = stackIn_62_1;
                        if (var26 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 < stackIn_37_1) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = od.field_l[var20].field_a;
                        var10[0][var12] = var22;
                        var12++;
                        var25 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var7 <= var25) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        incrementValue$3 = var15;
                        var15++;
                        var11[0][incrementValue$3] = var28.c((byte) -126);
                        var25++;
                        if (var26 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var26 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var21 == null) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!qg.a(var21, (byte) 78)) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8[1][var13] = w.field_a;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var13++;
                        var29.field_h = var24;
                        var25 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var25 ^ -1) <= (var7 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        incrementValue$4 = var16;
                        var16++;
                        var11[1][incrementValue$4] = var28.c((byte) -115);
                        var25++;
                        if (var26 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var26 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var6 ^ -1) >= (var14 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (od.field_l[var20].field_c) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        od.field_l[var20].field_c = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = od.field_l[var20].field_a;
                        var10[2][var14] = var22;
                        var14++;
                        var29.field_h = var24;
                        var25 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var25 ^ -1) <= (var7 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        incrementValue$5 = var17;
                        var17++;
                        var11[2][incrementValue$5] = var28.c((byte) -110);
                        var25++;
                        if (var26 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var26 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var19++;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var26 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var4.field_k = true;
                        var4.c(5);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_62_0 = param0;
                        stackIn_62_1 = 16;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 == stackIn_62_1) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var27 = (kg) null;
                        vd.a((String[]) null, 74, (String) null, (kg) null, (byte) 117);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1), "vd.J(" + param0 + ')');
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -111) {
            field_h = (kg) null;
        }
        field_h = null;
    }

    final void a(int param0, kg param1) {
        pa discarded$3 = null;
        ij discarded$4 = null;
        ti dupTemp$5 = null;
        RuntimeException runtimeException = null;
        ki var4 = null;
        ti[] var5 = null;
        ki var6 = null;
        int var7_int = 0;
        ki var7 = null;
        ki var8 = null;
        ti[] var9 = null;
        ti[] var10 = null;
        ki var11 = null;
        ki var12 = null;
        ti var13 = null;
        ki var14 = null;
        int var15 = 0;
        jf var16 = null;
        h var17 = null;
        jf var18 = null;
        ki var19 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new h(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_t + param1.field_y));
                        this.field_q = (ui) ((Object) var17);
                        var17.field_f = 16777215;
                        var4 = new ki();
                        var17.a((byte) -106, var4);
                        this.field_g = 15658734;
                        var4.field_n = 15658734;
                        this.field_l = 3;
                        this.field_j = -1;
                        this.field_c = 3;
                        this.field_e = 3;
                        this.field_n = 5592405;
                        this.field_k = 15658734;
                        var4.field_g = 11711154;
                        this.field_m = param1;
                        this.field_i = 3;
                        var4.a((byte) -21, 0).a(-108, 15658734).a(we.a(8947848, 124, 7829367, 10066329), (byte) 32);
                        var4.a((byte) -21, 1).a(we.a(11184810, 117, 13421772, 10066329), (byte) 32);
                        var4.a((byte) -21, 3).a(we.a(8947848, 112, 10066329, 7829367), (byte) 32).a(1, (byte) 112).a(1, false);
                        var5 = new ti[9];
                        if (param0 < -12) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var16 = new jf(32, 32);
                        var18 = var16;
                        var7_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var18.field_w.length ^ -1) >= (var7_int ^ -1)) {
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
                        var16.field_w[var7_int] = 1077952576;
                        var7_int++;
                        if (var15 != 0) {
                            statePc = 9;
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
                        if (var15 == 0) {
                            statePc = 4;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5[4] = (ti) ((Object) var16);
                        var4.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
                        var4.a((byte) -21, 5).a(bh.a(65793, -118, 0, 0, 0), (byte) 32).a(true, 256).a(-116, -1);
                        this.field_d = (ui) ((Object) var4);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = new ki(var4, true);
                        var6.field_b = 0;
                        var7 = new ki(var4, true);
                        var7.field_b = 0;
                        var7.a(qa.a(68, 8947848), -114);
                        var7.a((byte) -21, 1).a(qa.a(64, 11184810), (byte) 32).a(-81, 2236962);
                        this.field_b = (ui) ((Object) new wi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
                        discarded$3 = new pa(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                        discarded$4 = new ij(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                        var8 = new ki();
                        var17.a((byte) -106, var8);
                        var8.a((byte) -21, 0).a(we.a(15658734, 116, 10066329, 7829367), (byte) 32).a(-62, 1118481).b(-1, (byte) -102);
                        var8.a((byte) -21, 4).a(true, 256).a(var5, (byte) 32);
                        this.field_f = (ui) ((Object) var8);
                        var9 = new ti[9];
                        var10 = new ti[9];
                        var9[4] = new ti(2, 1);
                        var10[4] = new ti(1, 2);
                        dupTemp$5 = var9[4];
                        dupTemp$5.field_w = new int[]{6710886, 7829367};
                        var10[4].field_w = new int[]{6710886, 7829367};
                        var11 = new ki();
                        var12 = new ki();
                        var11.a(0, -19106, var9);
                        var12.a(0, -19106, var10);
                        var13 = new ti(7, 4);
                        var13.field_w = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                        var14 = new ki(var4, true);
                        var14.a(var13.a(), 1);
                        var13.f();
                        var14 = new ki(var4, true);
                        var14.a(var13.a(), 1);
                        var13.f();
                        var14 = new ki(var4, true);
                        var14.a(var13.a(), 1);
                        var13.f();
                        var19 = new ki(var4, true);
                        var19.a(var13, 1);
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
                    stackIn_13_1 = new StringBuilder().append("vd.I(").append(param0).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param1 == null) {
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

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_p) {
                  break L2;
                } else {
                  this.a(param0, (byte) 125, param3, param2);
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.a((byte) 89, param3, param2, param0);
              break L1;
            }
            L3: {
              if (param1 >= 6) {
                break L3;
              } else {
                this.field_f = (ui) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("vd.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_c - -this.field_i;
              var6 = this.field_e + this.field_l;
              var7 = this.field_j;
              if (var7 == -1) {
                var7 = this.field_m.field_t + this.field_m.field_y;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 119) {
                break L2;
              } else {
                vd.a(-109);
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  var8 = sb.field_c >> -2015692798;
                  var9 = this.field_m.a(param3);
                  var10 = this.field_m.field_t + this.field_m.field_y;
                  var11 = 1;
                  if (var9 > var8) {
                    break L5;
                  } else {
                    if ((param3.indexOf("<br>") ^ -1) != 0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (oi.field_l == null) {
                    oi.field_l = new String[16];
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    if ((var8 ^ -1) <= (var9 ^ -1)) {
                      break L8;
                    } else {
                      var13 = var9 / var8;
                      var12 = 2 * ((var9 % var8 - -var13 - 1) / var13) + var8;
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var12 = var8;
                  break L7;
                }
                var11 = this.field_m.a(param3, new int[]{var12}, oi.field_l);
                var10 = var10 + (-1 + var11) * var7;
                var9 = 0;
                var13 = 0;
                L9: while (true) {
                  if (var11 <= var13) {
                    break L4;
                  } else {
                    var14 = this.field_m.a(oi.field_l[var13]);
                    stackIn_22_0 = var9 ^ -1;

                    stackIn_22_1 = var14 ^ -1;

                    if (var15 != 0) {
                      break L3;
                    } else {
                      L10: {
                        if (stackIn_22_0 <= stackIn_22_1) {
                          break L10;
                        } else {
                          var9 = var14;
                          break L10;
                        }
                      }
                      var13++;
                      if (var15 == 0) {
                        continue L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              var12 = param2;
              stackIn_22_0 = var5_int + var12 - -var9;
              stackIn_22_1 = sb.field_c;
              break L3;
            }
            L11: {
              if (stackIn_22_0 > stackIn_22_1) {
                var12 = sb.field_c + -var9 - var5_int;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var13 = 32 + (-this.field_m.field_D + param0);
              if (var13 - -var10 + var6 <= sb.field_g) {
                break L12;
              } else {
                var13 = param0 + -var10 - var6;
                break L12;
              }
            }
            sb.d(var12, var13, var9 - -var5_int, var6 + var10, this.field_g);
            sb.a(1 + var12, var13 + 1, var9 - (-var5_int + 2), var10 - -var6 + -2, this.field_n);
            this.field_m.a(param3, var12 - -this.field_c, this.field_l + var13, var9, var10, this.field_k, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("vd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L13;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_m.a(param2);
              var6 = this.field_m.field_D + this.field_m.field_t;
              var7 = param1;
              if ((var5_int + (var7 + 6) ^ -1) >= (sb.field_c ^ -1)) {
                break L1;
              } else {
                var7 = sb.field_c - var5_int + -6;
                break L1;
              }
            }
            L2: {
              var8 = 32 + -this.field_m.field_D + param3;
              if (var8 - (-var6 + -6) <= sb.field_g) {
                break L2;
              } else {
                var8 = -6 + -var6 + sb.field_g;
                break L2;
              }
            }
            L3: {
              sb.d(var7, var8, var5_int - -6, var6 - -6, this.field_k);
              sb.a(1 + var7, var8 + 1, 4 + var5_int, 4 + var6, this.field_n);
              if (param0 == 89) {
                break L3;
              } else {
                vd.a((byte) -12);
                break L3;
              }
            }
            this.field_m.b(param2, var7 - -3, this.field_m.field_D + 3 + var8, this.field_k, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("vd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param5 != 119) {
            this.field_l = -85;
        }
        sb.e(param0, param3, param4, param2, param1);
    }

    public vd() {
        this.field_p = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 4) {
            this.field_g = 23;
        }
        sb.c(param3, param1, param2, param5, param4, param0);
    }

    static {
        field_a = 0;
    }
}
