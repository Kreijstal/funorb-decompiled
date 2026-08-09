/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static ff field_b;
    private String field_c;
    private boolean field_a;

    final static sd a(int param0, int param1, byte param2, int param3, int param4) {
        sd var5 = null;
        int var6 = 0;
        sd stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        sd stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5 = (sd) ((Object) r.field_b.a((byte) 51));
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    stackIn_12_0 = var5.field_o ^ -1;

                    stackIn_12_1 = param0 ^ -1;

                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (stackIn_12_0 == stackIn_12_1) {
                        stackIn_9_0 = (sd) (var5);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var5 = (sd) ((Object) r.field_b.b(-123));
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = new sd();
                var5.field_l = param1;
                var5.field_o = param0;
                var5.field_k = param3;
                stackIn_12_0 = param2;
                stackIn_12_1 = 105;
                break L2;
              }
              L4: {
                if (stackIn_12_0 > stackIn_12_1) {
                  break L4;
                } else {
                  field_b = (ff) null;
                  break L4;
                }
              }
              r.field_b.a(var5, -7044);
              fi.a(var5, param4, -24045);
              stackIn_16_0 = (sd) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var5_ref), "mb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        try {
            ug.a((byte) -76, bf.field_b[param1], qc.field_l[param1] * param2 >> -613042327);
            if (!param0) {
                field_b = (ff) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "mb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(uh param0, boolean param1, int[] param2, int[] param3, boolean param4, boolean param5, int param6) {
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param2[3] >> 2125712226;
                        var22 = param2[4] >> -1704795422;
                        var23 = param2[5] >> 672611586;
                        var24 = param2[6] >> 1916375586;
                        var25 = param2[7] >> 280135106;
                        var26 = param2[8] >> 1204802754;
                        var27 = param2[9] >> 1382796034;
                        var28 = param2[10] >> -1954958462;
                        var12 = var23 * param3[param6] + param3[3] * var21 - -(var22 * param3[4]) >> -694484242;
                        var29 = param2[11] >> -1716993790;
                        var13 = param3[5] * var26 + (param3[4] * var25 + param3[3] * var24) >> 472493806;
                        var17 = var29 * param3[8] + param3[7] * var28 + var27 * param3[6] >> 517022254;
                        var15 = param3[6] * var21 - -(var22 * param3[7]) - -(param3[8] * var23) >> 1512010030;
                        var18 = param3[11] * var23 + param3[10] * var22 + var21 * param3[9] >> 1320737678;
                        var20 = param3[11] * var29 + (var28 * param3[10] + var27 * param3[9]) >> -604474514;
                        var19 = param3[11] * var26 + (var25 * param3[10] + param3[9] * var24) >> 1824446542;
                        var16 = var26 * param3[8] + (var24 * param3[6] + param3[7] * var25) >> -582515794;
                        var14 = param3[5] * var29 + var27 * param3[3] - -(var28 * param3[4]) >> 1223073134;
                        var21 = param3[0] + -param2[0];
                        var22 = param3[1] - param2[1];
                        var23 = -param2[2] + param3[2];
                        var9 = var22 * param2[4] + (param2[3] * var21 - -(var23 * param2[5])) >> -pj.field_H + 16;
                        var10 = var23 * param2[8] + param2[6] * var21 - -(var22 * param2[7]) >> -pj.field_H + 16;
                        var11 = param2[11] * var23 + var22 * param2[10] + var21 * param2[9] >> -373387952;
                        var21 = hk.field_f;
                        var22 = hk.field_e;
                        var23 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var23 >= param0.field_y) {
                            statePc = 19;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var24 = param0.field_n[var23];
                        var25 = param0.field_q[var23];
                        var26 = param0.field_z[var23];
                        var27 = var9 + (var24 * var12 - (-(var25 * var15) - var18 * var26) >> -pj.field_H + 16);
                        var28 = var10 + (var24 * var13 - -(var16 * var25) + var19 * var26 >> 16 - pj.field_H);
                        var29 = var11 - -(var20 * var26 + var25 * var17 + var14 * var24 >> -443971504);
                        stackIn_56_0 = -51;
                        stackIn_4_0 = stackIn_56_0;
                        stackIn_56_1 = var29 ^ -1;
                        stackIn_4_1 = stackIn_56_1;
                        if (var30 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
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
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qb.field_ab[var23] = var27 / var29 + var21;
                        a.field_d[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) <= (var29 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = var29;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        hl.field_a[var23] = var29;
                        if (var7_int <= var29) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7_int = var29;
                        if (var30 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        hl.field_a[var23] = -2147483648;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param1) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ig.field_D[var23] = var27 >> pj.field_H;
                        ob.field_m[var23] = var28 >> pj.field_H;
                        hf.field_b[var23] = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == param0.field_p) {
                            statePc = 50;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null == param0.field_x) {
                            statePc = 50;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0.field_h == null) {
                            statePc = 50;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == param0.field_i) {
                            statePc = 50;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == param0.field_O) {
                            statePc = 50;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (null == param0.field_I) {
                            statePc = 50;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == param0.field_L) {
                            statePc = 50;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null == param0.field_M) {
                            statePc = 50;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param0.field_u == null) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var23 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var23 >= param0.field_F) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var24 = param0.field_p[var23];
                        var25 = param0.field_x[var23];
                        var26 = param0.field_h[var23];
                        ng.field_b[var23] = var9 - -(var12 * var24 - -(var15 * var25) - -(var26 * var18) >> 958944272);
                        hg.field_B[var23] = (var19 * var26 + (var24 * var13 - -(var16 * var25)) >> -695032752) + var10;
                        cd.field_b[var23] = (var25 * var17 + (var24 * var14 + var20 * var26) >> -551299376) + var11;
                        var24 = param0.field_i[var23];
                        var25 = param0.field_O[var23];
                        var26 = param0.field_I[var23];
                        ab.field_A[var23] = var9 + (var26 * var18 + (var15 * var25 + var24 * var12) >> -214451472);
                        aj.field_o[var23] = (var13 * var24 + (var25 * var16 - -(var26 * var19)) >> -653712112) + var10;
                        pl.field_c[var23] = var11 + (var24 * var14 - (-(var25 * var17) + -(var26 * var20)) >> -1421785616);
                        var24 = param0.field_L[var23];
                        var25 = param0.field_M[var23];
                        var26 = param0.field_u[var23];
                        fa.field_g[var23] = var9 - -(var25 * var15 + (var24 * var12 + var26 * var18) >> 66425104);
                        ci.field_pb[var23] = (var16 * var25 + (var13 * var24 + var19 * var26) >> -1444672816) + var10;
                        pb.field_a[var23] = (var24 * var14 + (var25 * var17 + var26 * var20) >> 845614384) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var30 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param4) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
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
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var18 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = param0.field_b;
                        stackIn_56_1 = var18;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 <= stackIn_56_1) {
                            statePc = 64;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_65_0 = var18 ^ -1;
                        stackIn_58_0 = stackIn_65_0;
                        stackIn_65_1 = mh.field_a.length ^ -1;
                        stackIn_58_1 = stackIn_65_1;
                        if (var30 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackIn_60_0 = stackIn_58_0;
                        stackIn_60_1 = stackIn_58_1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 <= stackIn_60_1) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var19 = param0.field_B[var18];
                        var20 = param0.field_v[var18];
                        var21 = param0.field_J[var18];
                        mh.field_a[var18] = var12 * var20 + var9 * var19 + var21 * var15 >> 1729509936;
                        fa.field_e[var18] = var21 * var16 + var19 * var10 + var20 * var13 >> -29012752;
                        tk.field_r[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> -557878896;
                        var18++;
                        if (var30 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = var8;
                        stackIn_65_1 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        jd.a(stackIn_65_0, stackIn_65_1 != 0, param5, param0, var7_int);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (runtimeException);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("mb.D(");
                    stackIn_68_1 = stackIn_70_1;
                    if (param0 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param2 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param3 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw fc.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static o[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        o[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 4) {
                break L1;
              } else {
                mb.b(-114);
                break L1;
              }
            }
            stackIn_4_0 = ug.a(param0, -8591, 1, param3, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var4), "mb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_c = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = this.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "mb.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final String a(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 34) {
                break L1;
              } else {
                mb.a((uh) null, false, (int[]) null, (int[]) null, false, false, -8);
                break L1;
              }
            }
            stackIn_4_0 = this.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "mb.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    mb(String param0) {
        this(param0, false);
    }

    public static void b(int param0) {
        try {
            field_b = null;
            if (param0 != -694484242) {
                mb.a(-113, -50, (byte) 55, 27, -105);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "mb.G(" + param0 + ')');
        }
    }

    mb(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (this.field_c == null) {
                this.field_c = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_a = param1;
              if (-1 == (this.field_c.length() ^ -1)) {
                this.field_a = false;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("mb.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new ff(11, 0, 1, 2);
    }
}
