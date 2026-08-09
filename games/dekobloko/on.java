/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on implements gl {
    private int field_b;
    private mm field_j;
    static String field_i;
    static ck[] field_e;
    static boolean field_d;
    private int field_f;
    static String field_h;
    static String field_c;
    static String field_a;
    static int[] field_g;

    final static nj a(byte[] param0, byte param1) {
        nj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        nj stackIn_5_0 = null;
        nj stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 > 7) {
                var2 = new nj(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, mb.field_d, tc.field_Nb);
                oa.a(126);
                stackIn_7_0 = (nj) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (nj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("on.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nj) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(boolean param0, int[] param1, boolean param2, int[] param3, boolean param4, boolean param5, vg param6) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
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
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
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
                    var30 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var8 = -2147483648;
                        var21 = param1[3] >> -271266366;
                        var22 = param1[4] >> -1473161854;
                        var23 = param1[5] >> -1133877790;
                        var24 = param1[6] >> -142707454;
                        var25 = param1[7] >> 1029153442;
                        var26 = param1[8] >> -2000365214;
                        var27 = param1[9] >> 1213195106;
                        var28 = param1[10] >> 1851497538;
                        var29 = param1[11] >> -1209643166;
                        var13 = var26 * param3[5] + var24 * param3[3] + var25 * param3[4] >> -855007538;
                        var12 = param3[5] * var23 + param3[3] * var21 - -(param3[4] * var22) >> 416957870;
                        var15 = param3[6] * var21 - (-(param3[7] * var22) - var23 * param3[8]) >> 1706468014;
                        var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> -896953074;
                        var19 = var26 * param3[11] + (param3[10] * var25 + var24 * param3[9]) >> 699680526;
                        var14 = var29 * param3[5] + (param3[4] * var28 + param3[3] * var27) >> -1719218162;
                        var20 = param3[10] * var28 + (var27 * param3[9] + var29 * param3[11]) >> 323688910;
                        var17 = param3[6] * var27 - -(var28 * param3[7]) + var29 * param3[8] >> 1880148654;
                        var16 = param3[7] * var25 + (var24 * param3[6] - -(var26 * param3[8])) >> -1690955026;
                        var21 = param3[0] - param1[0];
                        var22 = -param1[1] + param3[1];
                        var23 = -param1[2] + param3[2];
                        var9 = var21 * param1[3] - (-(param1[4] * var22) - param1[5] * var23) >> -me.field_y + 16;
                        var10 = param1[6] * var21 - -(param1[7] * var22) + var23 * param1[8] >> 16 + -me.field_y;
                        var11 = var23 * param1[11] + param1[10] * var22 + var21 * param1[9] >> -1661035472;
                        var21 = qg.field_g;
                        var22 = qg.field_c;
                        var23 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var23 ^ -1) <= (param6.field_l ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var24 = param6.field_J[var23];
                        var25 = param6.field_o[var23];
                        var26 = param6.field_e[var23];
                        var27 = (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> -me.field_y + 16) + var9;
                        var28 = (var19 * var26 + (var24 * var13 + var16 * var25) >> 16 + -me.field_y) + var10;
                        var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> -1758160208);
                        stackIn_61_0 = -51;
                        stackIn_6_0 = stackIn_61_0;
                        stackIn_61_1 = var29 ^ -1;
                        stackIn_6_1 = stackIn_61_1;
                        if (var30 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
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
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        kl.field_n[var23] = var27 / var29 + var21;
                        rn.field_b[var23] = var22 - -(var28 / var29);
                        if (var7_int > var29) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_int = var29;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        vg.field_G[var23] = var29;
                        if (var29 > var8) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = var29;
                        if (var30 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        vg.field_G[var23] = -2147483648;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!param5) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        dd.field_a[var23] = var27 >> me.field_y;
                        uk.field_z[var23] = var28 >> me.field_y;
                        vj.field_d[var23] = var29;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
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
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null == param6.field_q) {
                            statePc = 58;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param6.field_K == null) {
                            statePc = 58;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param6.field_m == null) {
                            statePc = 58;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (param6.field_T == null) {
                            statePc = 58;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == param6.field_w) {
                            statePc = 58;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param6.field_S == null) {
                            statePc = 58;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param6.field_g == null) {
                            statePc = 58;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param6.field_v == null) {
                            statePc = 58;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param6.field_R != null) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
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
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((var23 ^ -1) <= (param6.field_L ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var24 = param6.field_q[var23];
                        var25 = param6.field_K[var23];
                        var26 = param6.field_m[var23];
                        ec.field_f[var23] = var9 - -(var15 * var25 + (var24 * var12 + var26 * var18) >> -10040400);
                        fc.field_d[var23] = var10 - -(var25 * var16 + var24 * var13 + var19 * var26 >> -1882097328);
                        jg.field_h[var23] = var11 - -(var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 244466000);
                        var24 = param6.field_T[var23];
                        var25 = param6.field_w[var23];
                        var26 = param6.field_S[var23];
                        kb.field_a[var23] = (var26 * var18 + var12 * var24 - -(var25 * var15) >> -509058384) + var9;
                        cd.field_b[var23] = var10 + (var16 * var25 + var13 * var24 - -(var19 * var26) >> 1942215600);
                        be.field_t[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 394422448) + var11;
                        var24 = param6.field_g[var23];
                        var25 = param6.field_v[var23];
                        var26 = param6.field_R[var23];
                        ke.field_h[var23] = var9 + (var18 * var26 + (var12 * var24 + var25 * var15) >> -1054127888);
                        b.field_M[var23] = var10 - -(var19 * var26 + var13 * var24 + var25 * var16 >> -580391568);
                        d.field_d[var23] = var11 - -(var26 * var20 + var17 * var25 + var14 * var24 >> -222955856);
                        var23++;
                        if (var30 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
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
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!param4) {
                            statePc = 66;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9 = param3[3];
                        var10 = param3[4];
                        var11 = param3[5];
                        var12 = param3[6];
                        var13 = param3[7];
                        var14 = param3[8];
                        var15 = param3[9];
                        var16 = param3[10];
                        var17 = param3[11];
                        var18 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = var18;
                        stackIn_61_1 = param6.field_D;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 >= stackIn_61_1) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (id.field_M.length <= var18) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19 = param6.field_k[var18];
                        var20 = param6.field_u[var18];
                        var21 = param6.field_O[var18];
                        id.field_M[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> -1950371088;
                        bc.field_I[var18] = var16 * var21 + var10 * var19 - -(var20 * var13) >> 1478870704;
                        sf.field_C[var18] = var20 * var14 + var11 * var19 - -(var21 * var17) >> 862528240;
                        var18++;
                        if (var30 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        em.a(param6, param2, var8, (byte) 103, var7_int);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var7);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("on.G(").append(param0).append(',');
                    stackIn_69_1 = stackIn_71_1;
                    if (param1 == null) {
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
                    stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',');
                    stackIn_73_1 = stackIn_75_1;
                    if (param3 == null) {
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
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_0 = stackIn_79_0;
                    stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_77_1 = stackIn_79_1;
                    if (param6 == null) {
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
                    throw dh.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_q) {
                  break L2;
                } else {
                  if (!param4.a(true)) {
                    stackIn_8_0 = 2188450;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_8_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_8_0;
            if (param3 <= -60) {
              L3: {
                this.field_j.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_E + "</u>", param4.field_u + param1, param4.field_D + param2, param4.field_t, param4.field_y, var6_int, -1, this.field_b, this.field_f, this.field_j.field_K + this.field_j.field_R);
                if (!param4.a(true)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var7 = this.field_j.a(param4.field_E);
                      var8 = this.field_j.field_K + this.field_j.field_R;
                      var9 = param4.field_u + param1;
                      if (2 == this.field_b) {
                        break L5;
                      } else {
                        if (-2 != (this.field_b ^ -1)) {
                          break L4;
                        } else {
                          var9 = var9 + (param4.field_t + -var7 >> -1342247295);
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var9 = var9 + (-var7 + param4.field_t);
                    break L4;
                  }
                  L6: {
                    L7: {
                      var10 = param2 + param4.field_D;
                      if ((this.field_f ^ -1) == -3) {
                        break L7;
                      } else {
                        if (-2 != (this.field_f ^ -1)) {
                          break L6;
                        } else {
                          var10 = var10 + (param4.field_y - var8 >> -254285407);
                          if (var11 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var10 = var10 + (param4.field_y + -var8);
                    break L6;
                  }
                  kd.a(4 + var7, -2 + var9, (byte) -96, var10 + 2, var8);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("on.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var1_int = dl.field_M * dl.field_M;
        if (param0 != -100) {
            return;
        }
        try {
            var2 = var1_int - bl.field_T * bl.field_T;
            var3 = qc.field_Y - -((ac.field_B - qc.field_Y) * var2 / var1_int);
            ea.field_D.a(640, param0 + 100, var3, 120, vh.field_g);
            gi.a(ac.field_B - 24, j.field_c, 640, nk.field_b, 0, 5, (byte) -107);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "on.C(" + param0 + ')');
        }
    }

    public on() {
        try {
            this.field_j = hh.field_e;
            this.field_f = 1;
            this.field_b = 1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "on.<init>()");
        }
    }

    on(mm param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_b = param1;
            this.field_j = param0;
            this.field_f = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("on.<init>(");

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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static pi[] a(int param0, byte param1, int param2, ji param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        pi[] stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!gb.a(param2, param3, param0, 38)) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 37) {
                  break L1;
                } else {
                  on.b((byte) 98);
                  break L1;
                }
              }
              stackIn_9_0 = ci.b(-112);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("on.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pi[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_e = null;
        field_i = null;
        if (param0 != 6) {
            return;
        }
        try {
            field_c = null;
            field_a = null;
            field_g = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "on.D(" + param0 + ')');
        }
    }

    final static void a(ck[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 19264) {
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
                        if (null == param0) {
                            statePc = 16;
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
                        var2_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2_int ^ -1) <= (param0.length ^ -1)) {
                            statePc = 16;
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
                        param0[var2_int].b();
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 16;
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
                        if (var3 == 0) {
                            statePc = 5;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("on.E(");
                    stackIn_12_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_i = "No options available";
        field_h = "<%0> AT ONCE";
        field_g = new int[]{200, 100, 200, 300, 200, 1000, 200, 1000, 300, 500, 500, 100, 100, 200, 500, 200, 300, 1000, 100, 200, 500, 300, 500, 500, 100, 100, 100, 100, 200, 200, 300};
        field_c = "Return to Options Menu";
        field_a = "Special Item Bonus: ";
    }
}
