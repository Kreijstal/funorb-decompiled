/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class b extends bf {
    static int[][] field_j;
    static java.awt.Frame field_i;
    int field_n;
    static int field_m;
    static volatile int field_k;
    static lg field_l;

    public static void e(int param0) {
        try {
            field_i = null;
            field_j = (int[][]) null;
            field_l = null;
            int var1_int = -21 % ((param0 - 32) / 58);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "b.B(" + param0 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, boolean param3, sj param4, byte param5, boolean param6) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param2[3] >> 1995590722;
                        var22 = param2[4] >> 1313923618;
                        var23 = param2[5] >> -2086045502;
                        var24 = param2[6] >> -660916990;
                        var25 = param2[7] >> -42147262;
                        var26 = param2[8] >> -1693838078;
                        var27 = param2[9] >> -951537406;
                        var28 = param2[10] >> -852633470;
                        var29 = param2[11] >> 1349840930;
                        var12 = var23 * param0[5] + param0[3] * var21 - -(var22 * param0[4]) >> 865624718;
                        var13 = var25 * param0[4] + param0[3] * var24 - -(var26 * param0[5]) >> -916498578;
                        var20 = param0[11] * var29 + (param0[9] * var27 + var28 * param0[10]) >> 1346552910;
                        var14 = param0[3] * var27 + param0[4] * var28 - -(var29 * param0[5]) >> -669350002;
                        var16 = param0[7] * var25 + var24 * param0[6] - -(var26 * param0[8]) >> -986832114;
                        var17 = var28 * param0[7] + (param0[6] * var27 - -(var29 * param0[8])) >> 943040174;
                        var19 = var25 * param0[10] + var24 * param0[9] + var26 * param0[11] >> -519995730;
                        var15 = param0[8] * var23 + (var22 * param0[7] + var21 * param0[6]) >> -457578706;
                        var18 = var22 * param0[10] + (param0[9] * var21 + var23 * param0[11]) >> -1539623314;
                        var21 = -param2[0] + param0[0];
                        var22 = -param2[1] + param0[1];
                        var23 = param0[2] - param2[2];
                        var9 = param2[3] * var21 - -(var22 * param2[4]) - -(var23 * param2[5]) >> 16 + -uc.field_b;
                        var10 = param2[8] * var23 + (var22 * param2[7] + param2[6] * var21) >> 16 + -uc.field_b;
                        var11 = var21 * param2[9] - (-(param2[10] * var22) - var23 * param2[11]) >> -1406406960;
                        var21 = ig.field_h;
                        var22 = ig.field_f;
                        var23 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4.field_e <= var23) {
                            statePc = 23;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var24 = param4.field_O[var23];
                        var25 = param4.field_M[var23];
                        var26 = param4.field_z[var23];
                        var27 = (var18 * var26 + var25 * var15 + var12 * var24 >> 16 - uc.field_b) + var9;
                        var28 = var10 - -(var24 * var13 + var25 * var16 - -(var26 * var19) >> 16 - uc.field_b);
                        var29 = (var20 * var26 + var25 * var17 + var24 * var14 >> -1525219248) + var11;
                        stackIn_55_0 = 50;
                        stackIn_4_0 = stackIn_55_0;
                        stackIn_55_1 = var29;
                        stackIn_4_1 = stackIn_55_1;
                        if (var30 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 > stackIn_4_1) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        bg.field_L[var23] = var27 / var29 + var21;
                        sb.field_l[var23] = var28 / var29 + var22;
                        ah.field_i[var23] = var29;
                        if ((var7_int ^ -1) < (var29 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7_int = var29;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var29;
                        if (var30 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ah.field_i[var23] = -2147483648;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param1) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        wf.field_m[var23] = var27 >> uc.field_b;
                        fi.field_c[var23] = var28 >> uc.field_b;
                        jh.field_y[var23] = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null == param4.field_B) {
                            statePc = 54;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == param4.field_E) {
                            statePc = 54;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param4.field_s == null) {
                            statePc = 54;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param4.field_F == null) {
                            statePc = 54;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param4.field_v == null) {
                            statePc = 54;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param4.field_o == null) {
                            statePc = 54;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param4.field_w == null) {
                            statePc = 54;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param4.field_H == null) {
                            statePc = 54;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param4.field_J == null) {
                            statePc = 54;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var23 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((param4.field_k ^ -1) >= (var23 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var24 = param4.field_B[var23];
                        var25 = param4.field_E[var23];
                        var26 = param4.field_s[var23];
                        ci.field_c[var23] = var9 + (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -1222919152);
                        p.field_d[var23] = var10 - -(var25 * var16 + (var24 * var13 - -(var19 * var26)) >> 394975920);
                        ea.field_d[var23] = (var25 * var17 + (var14 * var24 - -(var20 * var26)) >> 680647824) + var11;
                        var24 = param4.field_F[var23];
                        var25 = param4.field_v[var23];
                        var26 = param4.field_o[var23];
                        ke.field_b[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> 1127922576);
                        v.field_d[var23] = var10 - -(var26 * var19 + var13 * var24 - -(var16 * var25) >> -758531824);
                        he.field_g[var23] = var11 + (var17 * var25 + var24 * var14 - -(var26 * var20) >> -542437904);
                        var24 = param4.field_w[var23];
                        var25 = param4.field_H[var23];
                        var26 = param4.field_J[var23];
                        me.field_j[var23] = (var12 * var24 + var15 * var25 + var18 * var26 >> -526125680) + var9;
                        gi.field_j[var23] = (var13 * var24 + (var16 * var25 + var19 * var26) >> -48780176) + var10;
                        wk.field_e[var23] = (var26 * var20 + (var24 * var14 + var25 * var17) >> 1864774288) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var30 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = param5;
                        stackIn_55_1 = -19;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 <= stackIn_55_1) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        field_l = (lg) null;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!param6) {
                            statePc = 66;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9 = param0[3];
                        var10 = param0[4];
                        var11 = param0[5];
                        var12 = param0[6];
                        var13 = param0[7];
                        var14 = param0[8];
                        var15 = param0[9];
                        var16 = param0[10];
                        var17 = param0[11];
                        var18 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var18 ^ -1) <= (param4.field_r ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_67_0 = gj.field_c.length ^ -1;
                        stackIn_62_0 = stackIn_67_0;
                        stackIn_67_1 = var18 ^ -1;
                        stackIn_62_1 = stackIn_67_1;
                        if (var30 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 >= stackIn_62_1) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19 = param4.field_y[var18];
                        var20 = param4.field_p[var18];
                        var21 = param4.field_K[var18];
                        gj.field_c[var18] = var12 * var20 + var19 * var9 - -(var15 * var21) >> 1806200304;
                        vd.field_a[var18] = var20 * var13 + (var19 * var10 + var21 * var16) >> -2043797808;
                        rc.field_j[var18] = var21 * var17 + (var11 * var19 - -(var20 * var14)) >> 1267971216;
                        var18++;
                        if (var30 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = var8;
                        stackIn_67_1 = -10;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        rf.a(stackIn_67_0, stackIn_67_1, var7_int, param3, param4);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_72_0 = (RuntimeException) (var7);
                    stackIn_70_0 = stackIn_72_0;
                    stackIn_72_1 = new StringBuilder().append("b.E(");
                    stackIn_70_1 = stackIn_72_1;
                    if (param0 == null) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_73_2 = "{...}";
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_73_2 = "null";
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_0 = stackIn_76_0;
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',');
                    stackIn_74_1 = stackIn_76_1;
                    if (param2 == null) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_80_0;
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',');
                    stackIn_78_1 = stackIn_80_1;
                    if (param4 == null) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_81_2 = "{...}";
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_81_2 = "null";
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    throw la.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param5 + ',' + param6 + ')');
                }
                case 82: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -21342) {
                break L1;
              } else {
                field_m = 117;
                break L1;
              }
            }
            ec.a(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "b.D(" + param0 + ',' + param1 + ')');
        }
    }

    abstract Object a(byte param0);

    abstract boolean b(byte param0);

    final static ad a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        ad stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          L0: {
            var5_int = 99 % ((param4 - 67) / 48);
            stackIn_1_0 = em.a(false, param3, param0, param2, param1, 50);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var5), "b.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    b(int param0) {
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "b.<init>(" + param0 + ')');
        }
    }

    final static ai[] a(int param0, int param1, ad param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ai[] stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (wg.a(param3, param0, param2, -3)) {
              L1: {
                if (param1 == 10) {
                  break L1;
                } else {
                  field_l = (lg) null;
                  break L1;
                }
              }
              stackIn_7_0 = hk.a((byte) 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("b.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ai[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_j = new int[11][];
        field_k = -1;
    }
}
