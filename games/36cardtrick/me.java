/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static String[] field_a;
    static vk[] field_b;
    static String[] field_d;
    static ee field_c;

    final static void a(boolean param0, boolean param1, int[] param2, boolean param3, mg param4, int[] param5, boolean param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
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
                    var30 = Main.field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param5[3] >> 235766914;
                        var22 = param5[4] >> 72787362;
                        var23 = param5[5] >> -1894977278;
                        var24 = param5[6] >> 748495234;
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = (String[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var25 = param5[7] >> -815553086;
                        var26 = param5[8] >> -1831047262;
                        var27 = param5[9] >> 85299714;
                        var28 = param5[10] >> 1979859714;
                        var12 = param2[5] * var23 + (var21 * param2[3] - -(var22 * param2[4])) >> -358184114;
                        var13 = param2[5] * var26 + (var24 * param2[3] + var25 * param2[4]) >> -732650130;
                        var29 = param5[11] >> 1166479458;
                        var20 = param2[11] * var29 + var27 * param2[9] - -(var28 * param2[10]) >> -53414130;
                        var19 = param2[9] * var24 + (param2[10] * var25 + var26 * param2[11]) >> -528358482;
                        var14 = var28 * param2[4] + (var27 * param2[3] + param2[5] * var29) >> -1629118738;
                        var18 = param2[9] * var21 + (param2[10] * var22 + var23 * param2[11]) >> 1198816974;
                        var15 = var21 * param2[6] + param2[7] * var22 + var23 * param2[8] >> 1411058190;
                        var16 = var25 * param2[7] + param2[6] * var24 - -(param2[8] * var26) >> 1703282766;
                        var17 = param2[8] * var29 + (param2[6] * var27 + var28 * param2[7]) >> -1215394226;
                        var21 = -param5[0] + param2[0];
                        var22 = param2[1] + -param5[1];
                        var23 = param2[2] - param5[2];
                        var9 = var21 * param5[3] + (param5[4] * var22 - -(var23 * param5[5])) >> -th.field_a + 16;
                        var11 = param5[9] * var21 + var22 * param5[10] + param5[11] * var23 >> 845775760;
                        var10 = param5[7] * var22 + (param5[6] * var21 + var23 * param5[8]) >> 16 + -th.field_a;
                        var21 = jb.field_m;
                        var22 = jb.field_g;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4.field_C <= var23) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var24 = param4.field_r[var23];
                        var25 = param4.field_b[var23];
                        var26 = param4.field_O[var23];
                        var27 = var9 + (var25 * var15 + (var24 * var12 - -(var18 * var26)) >> -th.field_a + 16);
                        var28 = var10 - -(var26 * var19 + var25 * var16 + var24 * var13 >> 16 - th.field_a);
                        var29 = var11 + (var24 * var14 + var25 * var17 + var26 * var20 >> 1969058064);
                        stackIn_67_0 = var29 ^ -1;
                        stackIn_7_0 = stackIn_67_0;
                        stackIn_67_1 = -51;
                        stackIn_7_1 = stackIn_67_1;
                        if (var30 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 > stackIn_7_1) {
                            statePc = 19;
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
                        se.field_F[var23] = var27 / var29 + var21;
                        ai.field_j[var23] = var28 / var29 + var22;
                        if (var8 < var29) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = var29;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7_int <= var29) {
                            statePc = 18;
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
                        var7_int = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        lg.field_c[var23] = var29;
                        if (var30 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        lg.field_c[var23] = -2147483648;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!param6) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        fd.field_g[var23] = var27 >> th.field_a;
                        pe.field_a[var23] = var28 >> th.field_a;
                        n.field_F[var23] = var29;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
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
                        if (param4.field_h == null) {
                            statePc = 58;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param4.field_w == null) {
                            statePc = 58;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param4.field_G == null) {
                            statePc = 58;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param4.field_m == null) {
                            statePc = 58;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == param4.field_x) {
                            statePc = 58;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null == param4.field_P) {
                            statePc = 58;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param4.field_o == null) {
                            statePc = 58;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == param4.field_F) {
                            statePc = 58;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param4.field_y != null) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var23 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((param4.field_M ^ -1) >= (var23 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var24 = param4.field_h[var23];
                        var25 = param4.field_w[var23];
                        var26 = param4.field_G[var23];
                        ti.field_d[var23] = var9 + (var18 * var26 + (var12 * var24 - -(var15 * var25)) >> -1333274192);
                        oa.field_a[var23] = var10 - -(var24 * var13 - -(var25 * var16) + var26 * var19 >> -1701729744);
                        j.field_E[var23] = (var24 * var14 - (-(var17 * var25) - var26 * var20) >> -13775728) + var11;
                        var24 = param4.field_m[var23];
                        var25 = param4.field_x[var23];
                        var26 = param4.field_P[var23];
                        fl.field_h[var23] = (var25 * var15 + var12 * var24 + var26 * var18 >> 889581040) + var9;
                        sd.field_b[var23] = var10 - -(var16 * var25 + (var24 * var13 + var19 * var26) >> 955911152);
                        fl.field_e[var23] = var11 + (var26 * var20 + var14 * var24 - -(var25 * var17) >> -242238096);
                        var24 = param4.field_o[var23];
                        var25 = param4.field_F[var23];
                        var26 = param4.field_y[var23];
                        ed.field_e[var23] = (var26 * var18 + (var24 * var12 - -(var15 * var25)) >> 1579059248) + var9;
                        la.field_m[var23] = (var19 * var26 + var24 * var13 - -(var25 * var16) >> 1880475056) + var10;
                        ii.field_b[var23] = (var25 * var17 + (var24 * var14 - -(var26 * var20)) >> 930930096) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var30 == 0) {
                            statePc = 53;
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
                        if (!param3) {
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
                        var9 = param2[3];
                        var10 = param2[4];
                        var11 = param2[5];
                        var12 = param2[6];
                        var13 = param2[7];
                        var14 = param2[8];
                        var15 = param2[9];
                        var16 = param2[10];
                        var17 = param2[11];
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
                        if (var18 >= param4.field_c) {
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
                        stackIn_67_0 = var18;
                        stackIn_62_0 = stackIn_67_0;
                        stackIn_67_1 = ve.field_d.length;
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
                        var19 = param4.field_k[var18];
                        var20 = param4.field_B[var18];
                        var21 = param4.field_I[var18];
                        ve.field_d[var18] = var21 * var15 + (var19 * var9 + var12 * var20) >> -967289552;
                        mc.field_b[var18] = var16 * var21 + var13 * var20 + var19 * var10 >> 1210776880;
                        oa.field_e[var18] = var17 * var21 + var14 * var20 + var19 * var11 >> 1663099920;
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
                        stackIn_67_0 = param0 ? 1 : 0;
                        stackIn_67_1 = var8;
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
                        tf.a(stackIn_67_0 != 0, stackIn_67_1, param4, (byte) 23, var7_int);
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
                    stackIn_72_1 = new StringBuilder().append("me.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_70_1 = stackIn_72_1;
                    if (param2 == null) {
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
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',');
                    stackIn_74_1 = stackIn_76_1;
                    if (param4 == null) {
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
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
                    stackIn_78_1 = stackIn_80_1;
                    if (param5 == null) {
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
                    throw ma.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param6 + ')');
                }
                case 82: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -126) {
            return;
        }
        try {
            field_a = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "me.A(" + param0 + ')');
        }
    }

    final static void a(ee param0, int param1, ee param2, int param3, int param4, int param5, int param6, vg param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, vg param16, int param17, int param18, int param19, vg param20) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            tf.a(param2, (byte) -114, param0, param9);
            kj.a(param15, param8, param10, -112, param11);
            ue.a(param6, -2694, param19);
            if (param12 == -26024) {
              lc.a(param17, 4, param16, param14, param7, param5);
              ra.a(param3, param20, (byte) -106, param4);
              ki.a(param13, (byte) -90, param18, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var21);

            stackIn_7_1 = new StringBuilder().append("me.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');

            if (param20 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
