/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    private final static void a(int[] param0, si param1, boolean param2, int[] param3, boolean param4, boolean param5, int param6) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
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
                    var30 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param3[3] >> -420730942;
                        var22 = param3[4] >> 361331042;
                        var23 = param3[5] >> -1087795038;
                        var24 = param3[6] >> -1543918238;
                        if (param6 > 48) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var25 = param3[7] >> -249515774;
                        var26 = param3[8] >> 759706146;
                        var27 = param3[9] >> -1182693054;
                        var28 = param3[10] >> -1328259550;
                        var29 = param3[11] >> 643746210;
                        var12 = var22 * param0[4] + (param0[3] * var21 + param0[5] * var23) >> 1275140366;
                        var13 = param0[5] * var26 + param0[3] * var24 - -(param0[4] * var25) >> 489586734;
                        var16 = param0[8] * var26 + (var25 * param0[7] + var24 * param0[6]) >> -685972018;
                        var18 = param0[11] * var23 + var22 * param0[10] + param0[9] * var21 >> 2091615438;
                        var17 = param0[6] * var27 - (-(param0[7] * var28) - param0[8] * var29) >> -917080562;
                        var19 = var24 * param0[9] + param0[10] * var25 + var26 * param0[11] >> -925249586;
                        var20 = var27 * param0[9] - -(var28 * param0[10]) - -(var29 * param0[11]) >> -157402738;
                        var14 = param0[4] * var28 + param0[3] * var27 + param0[5] * var29 >> 857218510;
                        var15 = var22 * param0[7] + param0[6] * var21 + var23 * param0[8] >> 50484494;
                        var21 = -param3[0] + param0[0];
                        var22 = param0[1] - param3[1];
                        var23 = param0[2] - param3[2];
                        var9 = var23 * param3[5] + var22 * param3[4] + var21 * param3[3] >> -bj.field_l + 16;
                        var11 = var22 * param3[10] + (var21 * param3[9] - -(var23 * param3[11])) >> 1202636176;
                        var10 = param3[7] * var22 + (param3[6] * var21 - -(param3[8] * var23)) >> -bj.field_l + 16;
                        var21 = bl.field_c;
                        var22 = bl.field_a;
                        var23 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1.field_w <= var23) {
                            statePc = 28;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var24 = param1.field_n[var23];
                        var25 = param1.field_f[var23];
                        var26 = param1.field_P[var23];
                        var27 = var9 - -(var18 * var26 + var15 * var25 + var12 * var24 >> 16 - bj.field_l);
                        var28 = (var13 * var24 - (-(var25 * var16) + -(var26 * var19)) >> -bj.field_l + 16) + var10;
                        var29 = var11 - -(var17 * var25 + (var14 * var24 - -(var26 * var20)) >> 266057584);
                        stackIn_68_0 = 50;
                        stackIn_6_0 = stackIn_68_0;
                        stackIn_68_1 = var29;
                        stackIn_6_1 = stackIn_68_1;
                        if (var30 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= stackIn_6_1) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        h.field_c[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        kb.field_o[var23] = var21 - -(var27 / var29);
                        il.field_c[var23] = var22 + var28 / var29;
                        if (var29 > var8) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var29 < var7_int) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7_int = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        h.field_c[var23] = var29;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param2) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        qk.field_f[var23] = var27 >> bj.field_l;
                        ej.field_c[var23] = var28 >> bj.field_l;
                        k.field_l[var23] = var29;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param1.field_L == null) {
                            statePc = 59;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == param1.field_G) {
                            statePc = 59;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param1.field_O == null) {
                            statePc = 59;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param1.field_c == null) {
                            statePc = 59;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param1.field_I == null) {
                            statePc = 59;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param1.field_z == null) {
                            statePc = 59;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param1.field_g == null) {
                            statePc = 59;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param1.field_d == null) {
                            statePc = 59;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param1.field_v == null) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var23 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var23 ^ -1) <= (param1.field_j ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var24 = param1.field_L[var23];
                        var25 = param1.field_G[var23];
                        var26 = param1.field_O[var23];
                        jg.field_b[var23] = var9 + (var15 * var25 + var24 * var12 - -(var18 * var26) >> -492296432);
                        lj.field_d[var23] = (var26 * var19 + var16 * var25 + var13 * var24 >> 1256302896) + var10;
                        ol.field_c[var23] = var11 - -(var20 * var26 + var24 * var14 + var17 * var25 >> -609845680);
                        var24 = param1.field_c[var23];
                        var25 = param1.field_I[var23];
                        var26 = param1.field_z[var23];
                        al.field_b[var23] = var9 + (var25 * var15 + (var12 * var24 + var18 * var26) >> -1300578832);
                        je.field_N[var23] = (var25 * var16 + (var13 * var24 - -(var26 * var19)) >> 1699615600) + var10;
                        pc.field_i[var23] = (var14 * var24 + (var25 * var17 + var26 * var20) >> 1123212112) + var11;
                        var24 = param1.field_g[var23];
                        var25 = param1.field_d[var23];
                        var26 = param1.field_v[var23];
                        di.field_a[var23] = (var18 * var26 + (var24 * var12 + var15 * var25) >> -2079198128) + var9;
                        kl.field_c[var23] = var10 + (var16 * var25 + (var13 * var24 - -(var26 * var19)) >> -1565959472);
                        q.field_a[var23] = var11 - -(var14 * var24 - (-(var25 * var17) + -(var26 * var20)) >> 410050864);
                        var23++;
                        if (var30 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var30 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!param5) {
                            statePc = 67;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 60: {
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
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((param1.field_p ^ -1) >= (var18 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_68_0 = tc.field_b.length ^ -1;
                        stackIn_63_0 = stackIn_68_0;
                        stackIn_68_1 = var18 ^ -1;
                        stackIn_63_1 = stackIn_68_1;
                        if (var30 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 >= stackIn_63_1) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var19 = param1.field_r[var18];
                        var20 = param1.field_K[var18];
                        var21 = param1.field_x[var18];
                        tc.field_b[var18] = var15 * var21 + var9 * var19 - -(var12 * var20) >> 104515216;
                        lj.field_j[var18] = var20 * var13 + var10 * var19 + var16 * var21 >> 554260368;
                        nb.field_d[var18] = var21 * var17 + var20 * var14 + var11 * var19 >> 73422192;
                        var18++;
                        if (var30 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = var7_int;
                        stackIn_68_1 = var8;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ca.a(stackIn_68_0, stackIn_68_1, param1, false, param4);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_73_0 = (RuntimeException) (var7);
                    stackIn_71_0 = stackIn_73_0;
                    stackIn_73_1 = new StringBuilder().append("mj.B(");
                    stackIn_71_1 = stackIn_73_1;
                    if (param0 == null) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_0 = stackIn_77_0;
                    stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
                    stackIn_75_1 = stackIn_77_1;
                    if (param1 == null) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param2).append(',');
                    stackIn_79_1 = stackIn_81_1;
                    if (param3 == null) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw pf.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == rh.field_f) {
                break L1;
              } else {
                L2: {
                  L3: {
                    lg.field_d = 0;
                    var2_int = param0.getKeyCode();
                    if ((var2_int ^ -1) > -1) {
                      break L3;
                    } else {
                      if ((var2_int ^ -1) <= (ah.field_g.length ^ -1)) {
                        break L3;
                      } else {
                        var2_int = -129 & ah.field_g[var2_int];
                        if (!fleas.field_A) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > em.field_f) {
                  break L1;
                } else {
                  if (-1 < (var2_int ^ -1)) {
                    break L1;
                  } else {
                    qk.field_b[em.field_f] = var2_int ^ -1;
                    em.field_f = 127 & em.field_f - -1;
                    if (em.field_f != sd.field_a) {
                      break L1;
                    } else {
                      em.field_f = -1;
                      break L1;
                    }
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (runtimeException);

            stackIn_21_1 = new StringBuilder().append("mj.keyReleased(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (null == rh.field_f) {
                break L1;
              } else {
                var2_int = param0.getKeyChar();
                if (var2_int == 0) {
                  break L1;
                } else {
                  if ((var2_int ^ -1) == -65536) {
                    break L1;
                  } else {
                    if (ol.a((char) var2_int, -103)) {
                      var3 = 127 & 1 + ak.field_e;
                      if ((var3 ^ -1) == (tl.field_o ^ -1)) {
                        break L1;
                      } else {
                        hj.field_b[ak.field_e] = -1;
                        pf.field_d[ak.field_e] = (char) var2_int;
                        ak.field_e = var3;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (runtimeException);

            stackIn_18_1 = new StringBuilder().append("mj.keyTyped(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        si var4_ref_si = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        si var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        jj.field_Z = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
                        var1_int = ij.field_F.length;
                        var2 = new int[var1_int];
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) <= (var1_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_ref_si = ij.field_F[var3];
                        var4_ref_si.b(-23443);
                        vi.a(var3, false);
                        var5 = var4_ref_si.field_m + var4_ref_si.field_B >> -477054751;
                        var6 = var4_ref_si.field_k + var4_ref_si.field_e >> 1531645377;
                        var7 = var4_ref_si.field_b + var4_ref_si.field_A >> -515966495;
                        var8 = jj.field_Z[9] >> 1437000514;
                        var9 = jj.field_Z[10] >> 763665730;
                        var10_int = jj.field_Z[11] >> -2000629854;
                        var11 = var9 * nl.field_a[4] + (var8 * nl.field_a[3] + var10_int * nl.field_a[5]) >> 2136147374;
                        var12 = var8 * nl.field_a[6] - -(var9 * nl.field_a[7]) - -(nl.field_a[8] * var10_int) >> 1423151790;
                        var13 = nl.field_a[11] * var10_int + (var8 * nl.field_a[9] + var9 * nl.field_a[10]) >> 1111826286;
                        var2[var3] = var7 * var13 + (var11 * var5 - -(var6 * var12)) >> -825314064;
                        var3++;
                        if (var19 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var19 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = jj.field_Z[9] >> -341277624;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = jj.field_Z[10] >> -745916376;
                        var5 = jj.field_Z[11] >> 1687027880;
                        var6 = vg.field_z << 2076532772;
                        var7 = 0;
                        var8 = jc.a(var6, 125) >> 2125763400;
                        var9 = we.a((byte) -87, var6) >> 385814856;
                        if (ag.field_f == -1) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1 == kc.field_b) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = -320 + ag.field_f;
                        var9 = -128;
                        var8 = -kc.field_b + 240;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 + var9 * var9));
                        if (param0 == -515966495) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        mj.a((int[]) null, (si) null, false, (int[]) null, true, true, 57);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = (int)((double)var7 * var10);
                        var8 = (int)((double)var8 * var10);
                        var9 = (int)((double)var9 * var10);
                        var12 = var7 + -var3;
                        var13 = -var4 + var8;
                        var14 = var9 - var5;
                        var10 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 + var14 * var14)));
                        var13 = (int)((double)var13 * var10);
                        var14 = (int)((double)var14 * var10);
                        var12 = (int)((double)var12 * var10);
                        var15 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = var15 ^ -1;
                        stackIn_18_1 = ij.field_F.length ^ -1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 <= stackIn_18_1) {
                            statePc = 36;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var16 = 0;
                        if (var19 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var17_int = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var17_int ^ -1) <= (ij.field_F.length ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_18_0 = var2[var17_int] ^ -1;
                        stackIn_23_0 = stackIn_18_0;
                        stackIn_18_1 = var2[var16] ^ -1;
                        stackIn_23_1 = stackIn_18_1;
                        if (var19 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 >= stackIn_23_1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var16 = var17_int;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var17_int++;
                        if (var19 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var2[var16] = -2147483648;
                        var17 = ij.field_F[var16];
                        vi.a(var16, false);
                        var18 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var18 ^ -1) <= -4) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        nl.field_a[var18] = nl.field_a[var18] + gm.field_kb[var15][var18];
                        var18++;
                        if (var19 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var19 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        mj.a(nl.field_a, var17, false, jj.field_Z, false, true, 91);
                        tc.a(var12, var9, var13, var14, param0 ^ -515994062, var8, var7, var17);
                        var15++;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var19 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) runtimeException), "mj.A(" + param0 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (rh.field_f != null) {
                em.field_f = -1;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("mj.focusLost(");

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
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            L1: {
              if (rh.field_f != null) {
                L2: {
                  L3: {
                    lg.field_d = 0;
                    var2_int = param0.getKeyCode();
                    if (-1 < (var2_int ^ -1)) {
                      break L3;
                    } else {
                      if ((ah.field_g.length ^ -1) >= (var2_int ^ -1)) {
                        break L3;
                      } else {
                        var2_int = ah.field_g[var2_int];
                        if ((var2_int & 128 ^ -1) != -1) {
                          var2_int = -1;
                          if (!fleas.field_A) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if ((em.field_f ^ -1) > -1) {
                    break L4;
                  } else {
                    if (0 <= var2_int) {
                      qk.field_b[em.field_f] = var2_int;
                      em.field_f = 127 & em.field_f - -1;
                      if (em.field_f == sd.field_a) {
                        em.field_f = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((var2_int ^ -1) <= -1) {
                    var3 = 1 + ak.field_e & 127;
                    if ((var3 ^ -1) == (tl.field_o ^ -1)) {
                      break L5;
                    } else {
                      hj.field_b[ak.field_e] = var2_int;
                      pf.field_d[ak.field_e] = ' ';
                      ak.field_e = var3;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((var3 & 10) != 0) {
                    break L6;
                  } else {
                    if (var2_int == 85) {
                      break L6;
                    } else {
                      if (10 == var2_int) {
                        break L6;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("mj.keyPressed(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L7;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    static {
    }
}
