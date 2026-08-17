/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends wf {
    static int field_G;
    private Object field_E;
    static String field_H;
    static String field_F;
    static String field_I;

    public static void e(byte param0) {
        try {
            field_I = null;
            field_H = null;
            field_F = null;
            if (param0 != -78) {
                field_H = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "pb.C(" + param0 + ')');
        }
    }

    final boolean c(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 21) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "pb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void a(boolean param0, int param1, int[] param2, boolean param3, qh param4, boolean param5, int[] param6) {
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
                    var30 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param2[3] >> 894592130;
                        var22 = param2[4] >> 1850158882;
                        var23 = param2[5] >> 1374090338;
                        var24 = param2[6] >> 1418780770;
                        var25 = param2[7] >> 1683543650;
                        var26 = param2[8] >> -82610686;
                        var27 = param2[9] >> 2050583458;
                        var28 = param2[10] >> 2056369922;
                        var29 = param2[11] >> 552392514;
                        var12 = var23 * param6[5] + var22 * param6[4] + param6[3] * var21 >> -1315816434;
                        var13 = param6[3] * var24 - (-(var25 * param6[4]) - param6[5] * var26) >> -527932370;
                        var20 = var29 * param6[11] + (param6[9] * var27 - -(var28 * param6[10])) >> -1041165842;
                        var18 = var21 * param6[9] + (param6[10] * var22 + var23 * param6[11]) >> -1853459634;
                        var19 = var26 * param6[11] + var24 * param6[9] + param6[10] * var25 >> -1053503666;
                        var15 = param6[7] * var22 + (var21 * param6[6] + var23 * param6[8]) >> -1058125842;
                        var17 = var28 * param6[7] + (param6[6] * var27 - -(param6[8] * var29)) >> 871059918;
                        var16 = param6[8] * var26 + (var24 * param6[6] + var25 * param6[7]) >> -136278034;
                        var14 = var29 * param6[5] + (param6[4] * var28 + var27 * param6[3]) >> -1316411730;
                        var21 = -param2[0] + param6[0];
                        var22 = param6[1] - param2[1];
                        var23 = param6[2] - param2[2];
                        var9 = var22 * param2[4] + (param2[3] * var21 - -(param2[5] * var23)) >> 16 - lh.field_t;
                        var11 = param2[9] * var21 - -(var22 * param2[10]) - -(param2[11] * var23) >> 565329360;
                        var10 = param2[8] * var23 + (var21 * param2[6] + param2[7] * var22) >> -lh.field_t + 16;
                        var21 = re.field_d;
                        var22 = re.field_h;
                        var23 = param1;
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
                        if (var23 >= param4.field_B) {
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
                        var24 = param4.field_L[var23];
                        var25 = param4.field_S[var23];
                        var26 = param4.field_z[var23];
                        var27 = var9 - -(var15 * var25 + (var12 * var24 + var26 * var18) >> -lh.field_t + 16);
                        var28 = var10 - -(var26 * var19 + (var13 * var24 - -(var25 * var16)) >> 16 + -lh.field_t);
                        var29 = (var26 * var20 + (var17 * var25 + var24 * var14) >> 2001064016) + var11;
                        stackIn_62_0 = -51;
                        stackIn_4_0 = stackIn_62_0;
                        stackIn_62_1 = var29 ^ -1;
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
                        if (stackIn_4_0 >= stackIn_4_1) {
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
                        ko.field_v[var23] = -2147483648;
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
                        nj.field_g[var23] = var21 - -(var27 / var29);
                        ra.field_b[var23] = var28 / var29 + var22;
                        ko.field_v[var23] = var29;
                        if (var29 >= var7_int) {
                            statePc = 14;
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
                        var7_int = var29;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 64;
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
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!param5) {
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
                        ie.field_k[var23] = var27 >> lh.field_t;
                        la.field_l[var23] = var28 >> lh.field_t;
                        ip.field_l[var23] = var29;
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
                        if (null == param4.field_k) {
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
                        if (null == param4.field_g) {
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
                        if (null == param4.field_O) {
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
                        if (param4.field_r == null) {
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
                        if (null == param4.field_m) {
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
                        if (null == param4.field_T) {
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
                        if (param4.field_u == null) {
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
                        if (null == param4.field_K) {
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
                        if (null == param4.field_l) {
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
                        if ((param4.field_h ^ -1) >= (var23 ^ -1)) {
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
                        var24 = param4.field_k[var23];
                        var25 = param4.field_g[var23];
                        var26 = param4.field_O[var23];
                        gi.field_L[var23] = (var24 * var12 - -(var15 * var25) - -(var18 * var26) >> 1789958832) + var9;
                        lp.field_B[var23] = var10 - -(var13 * var24 - -(var25 * var16) + var19 * var26 >> -684948944);
                        ok.field_S[var23] = var11 - -(var17 * var25 + var14 * var24 - -(var26 * var20) >> -1544315312);
                        var24 = param4.field_r[var23];
                        var25 = param4.field_m[var23];
                        var26 = param4.field_T[var23];
                        fg.field_d[var23] = var9 - -(var12 * var24 - (-(var15 * var25) - var18 * var26) >> 1277235856);
                        lm.field_m[var23] = var10 + (var16 * var25 + var13 * var24 - -(var19 * var26) >> 1674330064);
                        tc.field_m[var23] = (var20 * var26 + (var14 * var24 - -(var17 * var25)) >> 2103895248) + var11;
                        var24 = param4.field_u[var23];
                        var25 = param4.field_K[var23];
                        var26 = param4.field_l[var23];
                        i.field_l[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var18 * var26) >> 1170096784);
                        vj.field_d[var23] = (var26 * var19 + var24 * var13 - -(var16 * var25) >> 979585584) + var10;
                        fm.field_h[var23] = (var14 * var24 + var17 * var25 - -(var26 * var20) >> 133829936) + var11;
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
                        if (!param0) {
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
                        var9 = param6[3];
                        var10 = param6[4];
                        var11 = param6[5];
                        var12 = param6[6];
                        var13 = param6[7];
                        var14 = param6[8];
                        var15 = param6[9];
                        var16 = param6[10];
                        var17 = param6[11];
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
                        if (var18 >= param4.field_c) {
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
                        stackIn_62_0 = hk.field_c.length;
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
                        var19 = param4.field_d[var18];
                        var20 = param4.field_P[var18];
                        var21 = param4.field_v[var18];
                        hk.field_c[var18] = var21 * var15 + (var19 * var9 - -(var20 * var12)) >> 4064144;
                        p.field_x[var18] = var10 * var19 - (-(var20 * var13) - var21 * var16) >> -393476816;
                        hd.field_j[var18] = var11 * var19 - -(var20 * var14) - -(var17 * var21) >> -1929410000;
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
                        stackIn_62_0 = var7_int;
                        stackIn_62_1 = var8;
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
                        b.a(stackIn_62_0, stackIn_62_1, (byte) -84, param3, param4);
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
                    stackIn_67_1 = new StringBuilder().append("pb.A(").append(param0).append(',').append(param1).append(',');
                    stackIn_65_1 = stackIn_67_1;
                    if (param2 == null) {
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
                    stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param3).append(',');
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
                    throw vk.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ')');
                }
                case 77: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final Object d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 22698) {
              stackIn_4_0 = this.field_E;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (Object) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "pb.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    pb(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_E = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pb.<init>(");

            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    static {
        field_F = "The changes you have made to your stable have not yet been saved. Would you like them to be saved now?";
        field_I = "TREASURE:";
        field_H = "Continue";
    }
}
