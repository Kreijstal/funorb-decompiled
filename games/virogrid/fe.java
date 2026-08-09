/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends km {
    static String field_Kb;
    static boolean field_Fb;
    private StringBuilder field_Eb;
    static String field_Lb;
    private km field_Jb;
    private km field_Hb;
    private int field_Ib;
    static boolean field_Gb;

    final static void a(int[] param0, boolean param1, boolean param2, wm param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
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
        int decompiledRegionSelector0 = 0;
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
                    var30 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param5[3] >> 1565988866;
                        var22 = param5[4] >> 526723426;
                        var23 = param5[5] >> -2098134398;
                        var24 = param5[6] >> 1195488962;
                        var25 = param5[7] >> -379611870;
                        var26 = param5[8] >> -334535326;
                        var27 = param5[9] >> 316028738;
                        var28 = param5[10] >> 1916798914;
                        var12 = param0[5] * var23 + var21 * param0[3] - -(var22 * param0[4]) >> 219513294;
                        var13 = var25 * param0[4] + (param0[3] * var24 - -(param0[5] * var26)) >> -572013234;
                        var29 = param5[11] >> -240602782;
                        var18 = param0[11] * var23 + param0[9] * var21 + var22 * param0[10] >> -391972274;
                        var16 = var26 * param0[8] + var24 * param0[6] - -(var25 * param0[7]) >> -509145714;
                        var14 = param0[5] * var29 + (param0[4] * var28 + param0[3] * var27) >> -767266066;
                        if (param2) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        var15 = param0[8] * var23 + (var21 * param0[6] - -(var22 * param0[7])) >> 585747022;
                        var17 = param0[7] * var28 + (param0[6] * var27 + param0[8] * var29) >> -462163250;
                        var20 = param0[9] * var27 - -(var28 * param0[10]) - -(param0[11] * var29) >> 719371182;
                        var19 = var26 * param0[11] + param0[10] * var25 + var24 * param0[9] >> 1236047246;
                        var21 = param0[0] + -param5[0];
                        var22 = param0[1] - param5[1];
                        var23 = -param5[2] + param0[2];
                        var9 = param5[5] * var23 + (var21 * param5[3] + param5[4] * var22) >> 16 - gb.field_N;
                        var11 = var23 * param5[11] + param5[9] * var21 - -(var22 * param5[10]) >> -362313424;
                        var10 = param5[6] * var21 - (-(var22 * param5[7]) + -(var23 * param5[8])) >> 16 + -gb.field_N;
                        var21 = fk.field_j;
                        var22 = fk.field_k;
                        var23 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var23 >= param3.field_h) {
                            statePc = 25;
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
                        var24 = param3.field_l[var23];
                        var25 = param3.field_b[var23];
                        var26 = param3.field_H[var23];
                        var27 = var9 - -(var26 * var18 + var12 * var24 - -(var15 * var25) >> -gb.field_N + 16);
                        var28 = (var24 * var13 - -(var25 * var16) + var19 * var26 >> -gb.field_N + 16) + var10;
                        var29 = var11 + (var26 * var20 + var14 * var24 + var25 * var17 >> 942273552);
                        stackIn_67_0 = var29;
                        stackIn_6_0 = stackIn_67_0;
                        stackIn_67_1 = 50;
                        stackIn_6_1 = stackIn_67_1;
                        if (var30 != 0) {
                            statePc = 67;
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
                        if (stackIn_6_0 < stackIn_6_1) {
                            statePc = 19;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        en.field_Hb[var23] = var27 / var29 + var21;
                        ld.field_h[var23] = var22 - -(var28 / var29);
                        dn.field_a[var23] = var29;
                        if ((var29 ^ -1) < (var8 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = var29;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7_int > var29) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_int = var29;
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
                        dn.field_a[var23] = -2147483648;
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
                        mk.field_gb[var23] = var27 >> gb.field_N;
                        ea.field_c[var23] = var28 >> gb.field_N;
                        hh.field_b[var23] = var29;
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
                            statePc = 4;
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
                        if (null == param3.field_R) {
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
                        if (param3.field_E == null) {
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
                        if (param3.field_f == null) {
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
                        if (param3.field_q == null) {
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
                        if (null == param3.field_c) {
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
                        if (null == param3.field_o) {
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
                        if (null == param3.field_n) {
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
                        if (param3.field_P == null) {
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
                        if (param3.field_M != null) {
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
                        if (param3.field_k <= var23) {
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
                        var24 = param3.field_R[var23];
                        var25 = param3.field_E[var23];
                        var26 = param3.field_f[var23];
                        nm.field_a[var23] = var9 + (var24 * var12 + var15 * var25 - -(var26 * var18) >> -1942332080);
                        hf.field_A[var23] = (var19 * var26 + (var16 * var25 + var13 * var24) >> 1541210352) + var10;
                        gl.field_b[var23] = var11 - -(var25 * var17 + (var14 * var24 - -(var26 * var20)) >> -354965520);
                        var24 = param3.field_q[var23];
                        var25 = param3.field_c[var23];
                        var26 = param3.field_o[var23];
                        d.field_Lb[var23] = (var18 * var26 + var25 * var15 + var24 * var12 >> 971420400) + var9;
                        qe.field_i[var23] = var10 + (var25 * var16 + (var24 * var13 - -(var26 * var19)) >> 1881032656);
                        pg.field_j[var23] = (var26 * var20 + (var25 * var17 + var14 * var24) >> 1318560112) + var11;
                        var24 = param3.field_n[var23];
                        var25 = param3.field_P[var23];
                        var26 = param3.field_M[var23];
                        hf.field_z[var23] = (var18 * var26 + var15 * var25 + var24 * var12 >> 464598448) + var9;
                        ag.field_i[var23] = var10 - -(var19 * var26 + var24 * var13 - -(var16 * var25) >> -1886333648);
                        ul.field_h[var23] = (var25 * var17 + (var24 * var14 - -(var20 * var26)) >> 350562896) + var11;
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
                        if (!param1) {
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
                        if ((param3.field_i ^ -1) >= (var18 ^ -1)) {
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
                        stackIn_67_0 = u.field_q.length;
                        stackIn_62_0 = stackIn_67_0;
                        stackIn_67_1 = var18;
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
                        if (stackIn_62_0 <= stackIn_62_1) {
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
                        var19 = param3.field_A[var18];
                        var20 = param3.field_G[var18];
                        var21 = param3.field_D[var18];
                        u.field_q[var18] = var21 * var15 + var20 * var12 + var19 * var9 >> -657430768;
                        fb.field_p[var18] = var10 * var19 - (-(var20 * var13) - var16 * var21) >> 869812368;
                        dc.field_Q[var18] = var11 * var19 + (var14 * var20 + var17 * var21) >> 27446352;
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
                        stackIn_67_1 = param2 ? 1 : 0;
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
                        lj.a(stackIn_67_0, stackIn_67_1 != 0, param4, var7_int, param3);
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
                    stackIn_72_1 = new StringBuilder().append("fe.C(");
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
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_74_1 = stackIn_76_1;
                    if (param3 == null) {
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
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param4).append(',');
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
                    throw kg.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param6 + ')');
                }
                case 82: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_2_0 = 0;
        int stackIn_43_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            if ((this.field_Ib ^ -1) == -1) {
              L1: {
                if (um.field_Gb != 85) {
                  break L1;
                } else {
                  if (this.field_Eb.length() <= 0) {
                    break L1;
                  } else {
                    gi.a(this.field_Eb, -18340, -1 + this.field_Eb.length(), ' ');
                    break L1;
                  }
                }
              }
              L2: {
                if (-13 >= (this.field_Eb.length() ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var2_int = Character.toLowerCase(nm.field_d);
                    if (var2_int == 32) {
                      var2_int = 95;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var2_int ^ -1) != -96) {
                      break L4;
                    } else {
                      if (this.field_Eb.length() <= 0) {
                        break L4;
                      } else {
                        discarded$0 = this.field_Eb.append((char) var2_int);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (bm.a((char) var2_int, false)) {
                      break L5;
                    } else {
                      if (!kf.a(0, (char) var2_int)) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  discarded$1 = this.field_Eb.append((char) var2_int);
                  break L2;
                }
              }
              L6: {
                if (-85 == (um.field_Gb ^ -1)) {
                  L7: {
                    if ((this.field_Eb.length() ^ -1) >= -1) {
                      break L7;
                    } else {
                      this.field_V = this.field_Eb.toString();
                      this.field_Ib = 2;
                      if (!Virogrid.field_F) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_Ib = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if ((um.field_Gb ^ -1) == -14) {
                  this.field_Ib = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param0 >= 20) {
                  break L9;
                } else {
                  this.field_Ib = -124;
                  break L9;
                }
              }
              stackIn_43_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "fe.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_43_0 != 0;
        }
    }

    fe(int param0, int param1, int param2, int param3, String param4, km param5, km param6, km param7) {
        super(0L, param5);
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Ib = 0;
        try {
          L0: {
            this.field_Jb = new km(0L, param6, param4);
            this.a(0, this.field_Jb);
            this.field_Hb = new km(0L, param7);
            this.field_Hb.field_E = 16764006;
            this.a(0, this.field_Hb);
            this.field_Hb.field_eb = "|";
            this.field_Eb = new StringBuilder(12);
            var9_int = this.field_Jb.c((byte) 127);
            this.field_Jb.a(5, pg.field_e, var9_int, (byte) -125, 3);
            this.field_Hb.a(5, pg.field_e, var9_int, (byte) -80, pg.field_e + 3);
            var10 = 5 + (5 + var9_int);
            var11 = 3 + 2 * pg.field_e + 3;
            var12 = sh.b(0, param2, param0, var10);
            var13 = p.a(-1, var11, param1, param3);
            this.a(var12, var11, var10, (byte) -55, var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9);

            stackIn_6_1 = new StringBuilder().append("fe.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ')');
        }
    }

    final static void a(byte param0, boolean param1, int param2, boolean param3, String param4) {
        String stackIn_5_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        dm.field_u = param2;
                        rk.field_f = true;
                        var5 = param4;
                        if (param3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = vi.field_m;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = wn.field_z;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = stackIn_5_0;
                        if (0 == dm.field_u) {
                            statePc = 26;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-2 == (dm.field_u ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = sf.a((byte) 121, var5, pm.field_j, 480, gg.field_I);
                        var8 = var7 + 2;
                        vg.field_F = new String[var8];
                        wf.field_f = new int[var8];
                        var9 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var8 ^ -1) >= (var9 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        wf.field_f[var9] = -1;
                        var9++;
                        if (var10 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ia.field_e = new int[1];
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 <= var9) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        vg.field_F[var9] = gg.field_I[var9];
                        var9++;
                        if (var10 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var10 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        vg.field_F[var8 + -2] = "";
                        vg.field_F[-1 + var8] = je.field_I;
                        wf.field_f[-1 + var8] = 0;
                        ia.field_e[0] = 2;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var10 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = sf.a((byte) 124, var5, pm.field_j, 480, gg.field_I);
                        var8 = var7 + 3;
                        wf.field_f = new int[var8];
                        vg.field_F = new String[var8];
                        var9 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var8 <= var9) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        wf.field_f[var9] = -1;
                        var9++;
                        if (var10 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ia.field_e = new int[2];
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var7 <= var9) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        vg.field_F[var9] = gg.field_I[var9];
                        var9++;
                        if (var10 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var10 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        vg.field_F[-3 + var8] = "";
                        vg.field_F[-2 + var8] = var6;
                        wf.field_f[-2 + var8] = 0;
                        ia.field_e[0] = 1;
                        vg.field_F[-1 + var8] = je.field_I;
                        wf.field_f[-1 + var8] = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ia.field_e[1] = 2;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        g.field_b.field_o = ia.field_e.length;
                        var7 = 0;
                        var8 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((vg.field_F.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_60_0 = -1;
                        stackIn_44_0 = stackIn_60_0;
                        stackIn_60_1 = wf.field_f[var8] ^ -1;
                        stackIn_44_1 = stackIn_60_1;
                        if (var10 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 < stackIn_44_1) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_50_0 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9 = an.a(stackIn_50_0 != 0, (byte) 57, vg.field_F[var8]);
                        if (-1 != wf.field_f[var8]) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var9 = var9 + dj.field_e * 2;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var9 > var7) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var7 = var9;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        lj.field_g = g.field_b.field_o * (hd.field_e + ng.field_P << -1119344447);
                        sh.field_rb = -(var7 >> -1679552959) + mh.field_g - -var7;
                        dg.field_x = mh.field_g - (var7 >> 164368225);
                        stackIn_60_0 = param0;
                        stackIn_60_1 = 45;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == stackIn_60_1) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        field_Fb = true;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var8 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var8 ^ -1) <= (vg.field_F.length ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_74_0 = lj.field_g;
                        stackIn_66_0 = stackIn_74_0;
                        stackIn_74_1 = -1;
                        stackIn_66_1 = stackIn_74_1;
                        stackIn_74_2 = wf.field_f[var8] ^ -1;
                        stackIn_66_2 = stackIn_74_2;
                        if (var10 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_71_0 = stackIn_66_0;
                        stackIn_67_0 = stackIn_71_0;
                        if (stackIn_66_1 >= stackIn_66_2) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_69_0 = stackIn_67_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_72_0 = stackIn_69_0;
                        stackIn_72_1 = bn.field_b;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_72_0 = stackIn_71_0;
                        stackIn_72_1 = di.field_o;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        lj.field_g = stackIn_72_0 + stackIn_72_1;
                        var8++;
                        if (var10 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = kn.field_I;
                        stackIn_74_1 = lj.field_g;
                        stackIn_74_2 = 1346030241;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        tl.field_i = stackIn_74_0 + -(stackIn_74_1 >> stackIn_74_2);
                        g.field_b.a(param1, ve.a(hk.field_Jb, nl.field_u, (byte) 66), -563, 0);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_79_0 = (RuntimeException) (var5_ref);
                    stackIn_77_0 = stackIn_79_0;
                    stackIn_79_1 = new StringBuilder().append("fe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_77_1 = stackIn_79_1;
                    if (param4 == null) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_80_2 = "{...}";
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_80_2 = "null";
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    throw kg.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(param0, (byte) 118);
                        if (param1 == -28624) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_Lb = (String) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!nd.b((byte) -128)) {
                            statePc = 45;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((um.field_Gb ^ -1) != -86) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_Eb.length() <= 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        gi.a(this.field_Eb, -18340, -1 + this.field_Eb.length(), ' ');
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (mf.a((CharSequence) ((Object) this.field_Eb), nm.field_d, -13)) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_Eb.length() != 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (91 == nm.field_d) {
                            statePc = 32;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((this.field_Eb.length() ^ -1) != -2) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (nm.field_d == 35) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (93 == nm.field_d) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        discarded$0 = this.field_Eb.append(nm.field_d);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (84 != um.field_Gb) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((this.field_Eb.length() ^ -1) >= -1) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_V = this.field_Eb.toString();
                        stackIn_38_0 = 2;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0;
                }
                case 39: {
                    try {
                        stackIn_40_0 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    try {
                        if ((um.field_Gb ^ -1) != -14) {
                            statePc = 7;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    stackIn_46_0 = stackIn_43_0;
                    stackIn_44_0 = stackIn_46_0;
                    if (var4 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return stackIn_44_0;
                }
                case 45: {
                    try {
                        this.field_Hb.field_V = this.field_Eb.toString();
                        stackIn_46_0 = param0 ? 1 : 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (0 == oi.field_g) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-1 == (this.field_nb ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_Ib = 1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = this.field_Ib;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw kg.a((Throwable) ((Object) var3), "fe.F(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static rm a(rm param0, int[] param1, byte param2) {
        rm var3 = null;
        RuntimeException var3_ref = null;
        rm stackIn_2_0 = null;
        rm stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new rm(0, 0, 0);
            var3.field_d = param0.field_d;
            var3.field_m = param1;
            var3.field_j = param0.field_j;
            var3.field_i = param0.field_i;
            var3.field_n = param0.field_n;
            if (param2 < -10) {
              var3.field_b = param0.field_b;
              var3.field_l = param0.field_l;
              var3.field_a = param0.field_a;
              stackIn_4_0 = (rm) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (rm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("fe.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (vg.field_I.field_t) {
                  break L2;
                } else {
                  L3: {
                    if (0 != (1 << vg.field_I.field_e & vg.field_I.field_C.field_b)) {
                      break L3;
                    } else {
                      L4: {
                        if (vg.field_I.field_C.field_b == 0) {
                          break L4;
                        } else {
                          de.field_pb[18] = rf.field_g;
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (((vg.field_I.field_v | 1 << vg.field_I.field_e) ^ -1) == -4) {
                          break L5;
                        } else {
                          de.field_pb[18] = eb.field_g;
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      de.field_pb[18] = f.field_d;
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  de.field_pb[18] = ic.field_s;
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if ((vg.field_I.field_C.field_b & 1 << vg.field_I.field_e ^ -1) != -1) {
                  break L6;
                } else {
                  L7: {
                    if (0 != vg.field_I.field_C.field_b) {
                      break L7;
                    } else {
                      L8: {
                        if (3 != (1 << vg.field_I.field_e | vg.field_I.field_v)) {
                          break L8;
                        } else {
                          de.field_pb[18] = nk.field_M;
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      de.field_pb[18] = ei.field_e;
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  de.field_pb[18] = pb.field_m;
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              de.field_pb[18] = ic.field_b;
              break L1;
            }
            L9: {
              if (param0 == 1) {
                break L9;
              } else {
                field_Lb = (String) null;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fe.E(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 32498) {
                break L1;
              } else {
                field_Kb = (String) null;
                break L1;
              }
            }
            field_Kb = null;
            field_Lb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "fe.G(" + param0 + ')');
        }
    }

    static {
        field_Fb = false;
        field_Kb = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
