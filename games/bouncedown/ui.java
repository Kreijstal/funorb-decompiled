/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends ai {
    static String field_j;
    static String field_k;
    static vf field_o;
    static int field_m;
    int field_h;
    int field_q;
    ui field_n;
    int field_i;
    int field_l;
    static int field_g;
    int field_r;
    static int field_p;

    final static void a(int param0, byte param1) {
        try {
            int var2_int = 98 / ((51 - param1) / 61);
            hb.field_H = 1000000000L / (long)param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int[] param3, int[] param4, boolean param5, jk param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
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
        int var31 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var31 = Bounce.field_N;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param3[3] >> 1601515810;
                        var22 = param3[4] >> -526408126;
                        var23 = param3[5] >> -266505982;
                        var24 = param3[6] >> 1693261634;
                        var25 = param3[7] >> 331939234;
                        var26 = param3[8] >> -1884070558;
                        var27 = param3[9] >> -1481233694;
                        var29 = 118 / ((3 - param0) / 47);
                        var28 = param3[10] >> 1461082658;
                        var30 = param3[11] >> 1458425346;
                        var13 = var26 * param4[5] + (param4[3] * var24 + param4[4] * var25) >> -919885490;
                        var12 = param4[3] * var21 + (param4[4] * var22 - -(var23 * param4[5])) >> 272887566;
                        var19 = param4[9] * var24 - (-(var25 * param4[10]) - var26 * param4[11]) >> 848992750;
                        var14 = param4[4] * var28 + (var27 * param4[3] + param4[5] * var30) >> -678438866;
                        var15 = var21 * param4[6] + (param4[7] * var22 - -(var23 * param4[8])) >> 290034318;
                        var18 = param4[10] * var22 + param4[9] * var21 - -(var23 * param4[11]) >> -1378909234;
                        var16 = param4[7] * var25 + param4[6] * var24 + param4[8] * var26 >> 605821230;
                        var17 = var30 * param4[8] + param4[7] * var28 + param4[6] * var27 >> -1787084498;
                        var20 = var27 * param4[9] + param4[10] * var28 - -(var30 * param4[11]) >> 18156366;
                        var21 = param4[0] - param3[0];
                        var22 = param4[1] + -param3[1];
                        var23 = param4[2] - param3[2];
                        var9 = var23 * param3[5] + (var22 * param3[4] + var21 * param3[3]) >> 16 - kk.field_s;
                        var11 = param3[11] * var23 + var22 * param3[10] + param3[9] * var21 >> 335346160;
                        var10 = var21 * param3[6] + var22 * param3[7] + param3[8] * var23 >> 16 - kk.field_s;
                        var21 = qk.field_f;
                        var22 = qk.field_e;
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
                        if (var23 >= param6.field_k) {
                            statePc = 20;
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
                        var24 = param6.field_g[var23];
                        var25 = param6.field_C[var23];
                        var26 = param6.field_J[var23];
                        var27 = var9 + (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> 16 + -kk.field_s);
                        var28 = var10 + (var25 * var16 + (var13 * var24 + var19 * var26) >> -kk.field_s + 16);
                        var29 = var11 + (var24 * var14 - -(var17 * var25) + var26 * var20 >> -207515920);
                        stackIn_62_0 = -51;
                        stackIn_4_0 = stackIn_62_0;
                        stackIn_62_1 = var29 ^ -1;
                        stackIn_4_1 = stackIn_62_1;
                        if (var31 != 0) {
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
                        if (stackIn_4_0 < stackIn_4_1) {
                            statePc = 13;
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
                        ca.field_c[var23] = var27 / var29 + var21;
                        kg.field_g[var23] = var22 + var28 / var29;
                        r.field_c[var23] = var29;
                        if ((var29 ^ -1) <= (var7_int ^ -1)) {
                            statePc = 11;
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
                        var7_int = var29;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var29 <= var8) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = var29;
                        if (var31 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        r.field_c[var23] = -2147483648;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param2) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ld.field_j[var23] = var27 >> kk.field_s;
                        wb.field_c[var23] = var28 >> kk.field_s;
                        bd.field_n[var23] = var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var23++;
                        if (var31 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null == param6.field_G) {
                            statePc = 53;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param6.field_j == null) {
                            statePc = 53;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param6.field_A == null) {
                            statePc = 53;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == param6.field_c) {
                            statePc = 53;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param6.field_o == null) {
                            statePc = 53;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param6.field_r == null) {
                            statePc = 53;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == param6.field_z) {
                            statePc = 53;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == param6.field_h) {
                            statePc = 53;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null != param6.field_E) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 53;
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
                        if (var23 >= param6.field_L) {
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
                        var24 = param6.field_G[var23];
                        var25 = param6.field_j[var23];
                        var26 = param6.field_A[var23];
                        il.field_d[var23] = var9 - -(var12 * var24 - -(var25 * var15) - -(var18 * var26) >> -1457332944);
                        nd.field_F[var23] = (var19 * var26 + var16 * var25 + var24 * var13 >> 1132593136) + var10;
                        pc.field_j[var23] = (var26 * var20 + var17 * var25 + var24 * var14 >> 508131920) + var11;
                        var24 = param6.field_c[var23];
                        var25 = param6.field_o[var23];
                        var26 = param6.field_r[var23];
                        ml.field_f[var23] = var9 - -(var12 * var24 + (var15 * var25 - -(var18 * var26)) >> 635262480);
                        gh.field_I[var23] = (var26 * var19 + var16 * var25 + var24 * var13 >> -1278888496) + var10;
                        fl.field_b[var23] = (var20 * var26 + (var14 * var24 - -(var25 * var17)) >> -45919920) + var11;
                        var24 = param6.field_z[var23];
                        var25 = param6.field_h[var23];
                        var26 = param6.field_E[var23];
                        ne.field_m[var23] = var9 - -(var18 * var26 + var12 * var24 - -(var25 * var15) >> -1904765680);
                        qe.field_g[var23] = (var25 * var16 + var13 * var24 + var19 * var26 >> -1934787152) + var10;
                        nc.field_a[var23] = (var26 * var20 + (var17 * var25 + var24 * var14) >> -309494160) + var11;
                        var23++;
                        if (var31 != 0) {
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
                        if (var31 == 0) {
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
                        if (!param5) {
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
                        if (var18 >= param6.field_d) {
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
                        stackIn_62_0 = uc.field_D.length;
                        stackIn_57_0 = stackIn_62_0;
                        stackIn_62_1 = var18;
                        stackIn_57_1 = stackIn_62_1;
                        if (var31 != 0) {
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
                        var19 = param6.field_f[var18];
                        var20 = param6.field_i[var18];
                        var21 = param6.field_x[var18];
                        uc.field_D[var18] = var9 * var19 - (-(var20 * var12) - var15 * var21) >> 24685648;
                        ih.field_db[var18] = var20 * var13 + (var19 * var10 - -(var21 * var16)) >> -119997904;
                        nk.field_b[var18] = var11 * var19 - -(var14 * var20) - -(var21 * var17) >> -1326185040;
                        var18++;
                        if (var31 == 0) {
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
                        stackIn_62_0 = param1 ? 1 : 0;
                        stackIn_62_1 = -128;
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
                        hj.a(stackIn_62_0 != 0, (byte) stackIn_62_1, param6, var8, var7_int);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_67_0 = (RuntimeException) (runtimeException);
                    stackIn_65_0 = stackIn_67_0;
                    stackIn_67_1 = new StringBuilder().append("ui.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
                    stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param5).append(',');
                    stackIn_73_1 = stackIn_75_1;
                    if (param6 == null) {
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
                    throw ii.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ')');
                }
                case 77: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_o = null;
        if (!param0) {
            return;
        }
        try {
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ui.B(" + param0 + ')');
        }
    }

    ui(int param0, int param1, int param2, int param3, int param4) {
        try {
            this.field_q = param0;
            this.field_r = param4;
            this.field_l = param2;
            this.field_h = param1;
            this.field_i = param3;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ui.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_k = "This game has been updated! Please reload this page.";
        field_j = "Score - ";
        field_o = new vf();
    }
}
