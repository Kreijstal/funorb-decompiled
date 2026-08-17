/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static java.security.SecureRandom field_b;
    static ja field_d;
    static String field_c;
    static aa field_a;

    final static void a(int param0, boolean param1, boolean param2, pf param3, int[] param4, int[] param5, boolean param6) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
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
                    var30 = TrackController.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param5[3] >> 1087020898;
                        var22 = param5[4] >> 1728636802;
                        var23 = param5[5] >> -155343006;
                        var24 = param5[6] >> 85123170;
                        var25 = param5[7] >> -1931289214;
                        var26 = param5[8] >> 66453698;
                        var27 = param5[9] >> 1900610;
                        var28 = param5[10] >> 152633122;
                        var29 = param5[11] >> -952591358;
                        var13 = param4[4] * var25 + (param4[3] * var24 + var26 * param4[5]) >> 1094933038;
                        var12 = param4[3] * var21 + (var22 * param4[4] + var23 * param4[5]) >> -915725650;
                        var17 = param4[6] * var27 - -(param4[7] * var28) - -(var29 * param4[8]) >> 1937057582;
                        var20 = var29 * param4[11] + var27 * param4[param0] + var28 * param4[10] >> 2008133166;
                        var15 = var23 * param4[8] + param4[7] * var22 + param4[6] * var21 >> -1034499410;
                        var14 = var29 * param4[5] + (param4[4] * var28 + param4[3] * var27) >> -547922994;
                        var16 = param4[7] * var25 + (var24 * param4[6] - -(var26 * param4[8])) >> 1670370478;
                        var19 = param4[9] * var24 - -(var25 * param4[10]) - -(var26 * param4[11]) >> -1431863858;
                        var18 = param4[11] * var23 + param4[10] * var22 + var21 * param4[9] >> 232026350;
                        var21 = param4[0] - param5[0];
                        var22 = param4[1] - param5[1];
                        var23 = param4[2] + -param5[2];
                        var9 = var21 * param5[3] + (var22 * param5[4] + var23 * param5[5]) >> 16 + -wi.field_b;
                        var11 = var23 * param5[11] + param5[9] * var21 - -(param5[10] * var22) >> 145247312;
                        var10 = var21 * param5[6] + (var22 * param5[7] - -(var23 * param5[8])) >> -wi.field_b + 16;
                        var21 = ig.field_h;
                        var22 = ig.field_a;
                        var23 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3.field_q <= var23) {
                            statePc = 22;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var24 = param3.field_y[var23];
                        var25 = param3.field_o[var23];
                        var26 = param3.field_S[var23];
                        var27 = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> 16 + -wi.field_b);
                        var28 = var10 + (var26 * var19 + (var24 * var13 - -(var16 * var25)) >> 16 - wi.field_b);
                        var29 = (var20 * var26 + var24 * var14 + var25 * var17 >> 1047498288) + var11;
                        stackIn_62_0 = var29 ^ -1;
                        stackIn_4_0 = stackIn_62_0;
                        stackIn_62_1 = -51;
                        stackIn_4_1 = stackIn_62_1;
                        if (var30 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 <= stackIn_4_1) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        od.field_c[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        qa.field_b[var23] = var21 - -(var27 / var29);
                        ui.field_r[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 64;
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        od.field_c[var23] = var29;
                        if (var7_int <= var29) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 64;
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!param6) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        bg.field_a[var23] = var27 >> wi.field_b;
                        pl.field_c[var23] = var28 >> wi.field_b;
                        la.field_p[var23] = var29;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == param3.field_L) {
                            statePc = 53;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param3.field_h == null) {
                            statePc = 53;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param3.field_t == null) {
                            statePc = 53;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param3.field_f == null) {
                            statePc = 53;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param3.field_D == null) {
                            statePc = 53;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param3.field_B == null) {
                            statePc = 53;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null == param3.field_v) {
                            statePc = 53;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param3.field_z == null) {
                            statePc = 53;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == param3.field_s) {
                            statePc = 53;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var23 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (param3.field_E <= var23) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var24 = param3.field_L[var23];
                        var25 = param3.field_h[var23];
                        var26 = param3.field_t[var23];
                        vj.field_c[var23] = (var25 * var15 + var24 * var12 + var26 * var18 >> 267504240) + var9;
                        id.field_k[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> 1736791248) + var10;
                        sd.field_d[var23] = (var14 * var24 - (-(var17 * var25) - var20 * var26) >> -258155472) + var11;
                        var24 = param3.field_f[var23];
                        var25 = param3.field_D[var23];
                        var26 = param3.field_B[var23];
                        u.field_l[var23] = (var26 * var18 + (var25 * var15 + var24 * var12) >> 1089132208) + var9;
                        rd.field_s[var23] = (var26 * var19 + (var16 * var25 + var13 * var24) >> 2038652528) + var10;
                        lf.field_X[var23] = (var25 * var17 + (var14 * var24 - -(var26 * var20)) >> -888488848) + var11;
                        var24 = param3.field_v[var23];
                        var25 = param3.field_z[var23];
                        var26 = param3.field_s[var23];
                        nb.field_s[var23] = (var18 * var26 + var12 * var24 - -(var25 * var15) >> -1838188304) + var9;
                        jb.field_b[var23] = var10 + (var25 * var16 + (var13 * var24 + var26 * var19) >> 817502000);
                        ri.field_B[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 1551556240) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var30 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!param1) {
                            statePc = 61;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var9 = param4[3];
                        var10 = param4[4];
                        var11 = param4[5];
                        var12 = param4[6];
                        var13 = param4[7];
                        var14 = param4[8];
                        var15 = param4[9];
                        var16 = param4[10];
                        var17 = param4[11];
                        var18 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var18 >= param3.field_l) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_62_0 = wf.field_c.length;
                        stackIn_57_0 = stackIn_62_0;
                        stackIn_62_1 = var18;
                        stackIn_57_1 = stackIn_62_1;
                        if (var30 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 <= stackIn_57_1) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var19 = param3.field_j[var18];
                        var20 = param3.field_R[var18];
                        var21 = param3.field_b[var18];
                        wf.field_c[var18] = var15 * var21 + (var9 * var19 + var20 * var12) >> -1601960144;
                        ch.field_y[var18] = var21 * var16 + var10 * var19 - -(var20 * var13) >> 951877008;
                        ea.field_w[var18] = var21 * var17 + var20 * var14 + var11 * var19 >> 1111479760;
                        var18++;
                        if (var30 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_62_0 = -106;
                        stackIn_62_1 = var7_int;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ve.a(stackIn_62_0, stackIn_62_1, var8, param3, param2);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_67_0 = (RuntimeException) (var7);
                    stackIn_65_0 = stackIn_67_0;
                    stackIn_67_1 = new StringBuilder().append("oj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_65_1 = stackIn_67_1;
                    if (param3 == null) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_68_2 = "{...}";
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_68_2 = "null";
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
                    stackIn_69_1 = stackIn_71_1;
                    if (param4 == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_0 = stackIn_75_0;
                    stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
                    stackIn_73_1 = stackIn_75_1;
                    if (param5 == null) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_76_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_76_2 = "{...}";
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_76_2 = "null";
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    throw sl.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param6 + ')');
                }
                case 77: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static hk a(String param0, int param1, int param2) {
        qc var3 = null;
        RuntimeException var3_ref = null;
        qc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new qc();
              if (param2 == 0) {
                break L1;
              } else {
                field_d = (ja) null;
                break L1;
              }
            }
            ((hk) ((Object) var3)).field_b = param0;
            ((hk) ((Object) var3)).field_c = param1;
            stackIn_4_0 = (qc) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("oj.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (hk) ((Object) stackIn_4_0);
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            if (null == og.field_rb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                r.a(-32652, og.field_rb);
                og.field_rb.a(rg.field_c, 5474);
                og.field_rb = null;
                if (param0 <= -74) {
                  break L1;
                } else {
                  field_b = (java.security.SecureRandom) null;
                  break L1;
                }
              }
              L2: {
                if (tk.field_u != null) {
                  tk.field_u.b(6391);
                  break L2;
                } else {
                  break L2;
                }
              }
              ki.field_f.requestFocus();
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "oj.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        try {
            field_c = null;
            field_a = null;
            field_b = null;
            int var1_int = -25 % ((param0 - -56) / 60);
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "oj.B(" + param0 + ')');
        }
    }

    static {
        field_c = "Connection lost - attempting to reconnect";
        field_a = new aa(15, 0, 1, 0);
    }
}
