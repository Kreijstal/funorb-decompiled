/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    String field_a;
    private int field_g;
    private int field_e;
    private int field_d;
    private qk[] field_b;
    float field_c;
    static hi field_f;

    final boolean a(int param0) {
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        qk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                gg.c(-8);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if ((this.field_g ^ -1) <= (this.field_e ^ -1)) {
                    break L4;
                  } else {
                    var2 = this.field_b[this.field_g];
                    stackOut_5_0 = var2.field_a.a((byte) -121);
                    stackIn_40_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        this.a((byte) -128, var2, 0);
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L5: {
                          if (-1 < (var2.field_f ^ -1)) {
                            break L5;
                          } else {
                            if (!var2.field_a.a((byte) -18, var2.field_f)) {
                              this.a((byte) -111, var2, var2.field_a.a(true, var2.field_f));
                              stackIn_19_0 = 0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var2.field_g == null) {
                            break L6;
                          } else {
                            if (var2.field_a.a((byte) -1, var2.field_g)) {
                              break L6;
                            } else {
                              this.a((byte) -128, var2, var2.field_a.a(param0 + -5, var2.field_g));
                              stackIn_25_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        L7: {
                          if (0 <= var2.field_f) {
                            break L7;
                          } else {
                            if (var2.field_g != null) {
                              break L7;
                            } else {
                              if (null == var2.field_d) {
                                break L7;
                              } else {
                                if (var2.field_a.c(32031)) {
                                  break L7;
                                } else {
                                  this.a((byte) -117, var2, var2.field_a.b(-22884));
                                  stackIn_37_0 = 0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                        this.field_g = this.field_g + 1;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_40_0 = 1;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "gg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_40_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_37_0 != 0;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        try {
            field_f = null;
            int var1_int = 83 % ((27 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gg.A(" + param0 + ')');
        }
    }

    final static void a(byte param0, int[] param1, boolean param2, boolean param3, e param4, boolean param5, int[] param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
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
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
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
                    var30 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        if (param0 >= 72) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gg.b(-92);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var21 = param1[3] >> -1519507710;
                        var22 = param1[4] >> 848569538;
                        var23 = param1[5] >> -1430636062;
                        var24 = param1[6] >> -1583294590;
                        var25 = param1[7] >> 173855682;
                        var26 = param1[8] >> 496793186;
                        var27 = param1[9] >> -664888510;
                        var28 = param1[10] >> 46820450;
                        var29 = param1[11] >> -1059353118;
                        var13 = param6[3] * var24 + param6[4] * var25 - -(param6[5] * var26) >> -55750450;
                        var12 = param6[5] * var23 + var21 * param6[3] - -(var22 * param6[4]) >> 1123797294;
                        var15 = param6[8] * var23 + (var21 * param6[6] + var22 * param6[7]) >> 1524682510;
                        var16 = param6[7] * var25 + param6[6] * var24 - -(param6[8] * var26) >> 782411374;
                        var20 = var28 * param6[10] + var27 * param6[9] + var29 * param6[11] >> 1158086254;
                        var14 = param6[5] * var29 + (var28 * param6[4] + var27 * param6[3]) >> 2122904462;
                        var17 = param6[7] * var28 + (param6[6] * var27 - -(var29 * param6[8])) >> -145393170;
                        var18 = param6[11] * var23 + var21 * param6[9] + param6[10] * var22 >> -1038486418;
                        var19 = var24 * param6[9] - (-(param6[10] * var25) - var26 * param6[11]) >> 879284334;
                        var21 = -param1[0] + param6[0];
                        var22 = -param1[1] + param6[1];
                        var23 = -param1[2] + param6[2];
                        var9 = var23 * param1[5] + param1[3] * var21 - -(param1[4] * var22) >> 16 - nd.field_m;
                        var10 = var23 * param1[8] + var21 * param1[6] + var22 * param1[7] >> -nd.field_m + 16;
                        var11 = var22 * param1[10] + var21 * param1[9] - -(var23 * param1[11]) >> -186019120;
                        var21 = ka.field_f;
                        var22 = ka.field_g;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param4.field_M <= var23) {
                            statePc = 23;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var24 = param4.field_v[var23];
                        var25 = param4.field_d[var23];
                        var26 = param4.field_B[var23];
                        var27 = var9 + (var25 * var15 + var12 * var24 - -(var26 * var18) >> 16 - nd.field_m);
                        var28 = (var25 * var16 + (var24 * var13 - -(var26 * var19)) >> -nd.field_m + 16) + var10;
                        var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> -2142061136);
                        stackIn_62_0 = var29 ^ -1;
                        stackIn_7_0 = stackIn_62_0;
                        stackIn_62_1 = -51;
                        stackIn_7_1 = stackIn_62_1;
                        if (var30 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 <= stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        nd.field_l[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        sg.field_a[var23] = var27 / var29 + var21;
                        d.field_a[var23] = var22 + var28 / var29;
                        if (var7_int <= var29) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7_int = var29;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        nd.field_l[var23] = var29;
                        if ((var8 ^ -1) <= (var29 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!param5) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        el.field_m[var23] = var27 >> nd.field_m;
                        hi.field_h[var23] = var28 >> nd.field_m;
                        rk.field_q[var23] = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param4.field_j == null) {
                            statePc = 56;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param4.field_a == null) {
                            statePc = 56;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == param4.field_c) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == param4.field_g) {
                            statePc = 56;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null == param4.field_Q) {
                            statePc = 56;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param4.field_p == null) {
                            statePc = 56;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param4.field_D == null) {
                            statePc = 56;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == param4.field_E) {
                            statePc = 56;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (null != param4.field_m) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var23 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (param4.field_C <= var23) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var24 = param4.field_j[var23];
                        var25 = param4.field_a[var23];
                        var26 = param4.field_c[var23];
                        db.field_e[var23] = var9 - -(var18 * var26 + (var24 * var12 + var15 * var25) >> 1004514000);
                        me.field_i[var23] = var10 - -(var13 * var24 - (-(var16 * var25) + -(var26 * var19)) >> -1288694832);
                        ec.field_c[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 2123508272) + var11;
                        var24 = param4.field_g[var23];
                        var25 = param4.field_Q[var23];
                        var26 = param4.field_p[var23];
                        nk.field_e[var23] = (var18 * var26 + var24 * var12 + var15 * var25 >> -2050122704) + var9;
                        qe.field_z[var23] = var10 + (var26 * var19 + var16 * var25 + var13 * var24 >> 1827838512);
                        wi.field_d[var23] = (var25 * var17 + var14 * var24 - -(var26 * var20) >> -1486038064) + var11;
                        var24 = param4.field_D[var23];
                        var25 = param4.field_E[var23];
                        var26 = param4.field_m[var23];
                        bl.field_d[var23] = (var15 * var25 + var12 * var24 - -(var18 * var26) >> 1918160240) + var9;
                        rl.field_d[var23] = var10 - -(var19 * var26 + (var25 * var16 + var13 * var24) >> -1183705168);
                        kf.field_g[var23] = (var14 * var24 - -(var17 * var25) - -(var26 * var20) >> -773720144) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var30 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (param2) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 59: {
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
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var18 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_62_0 = var18;
                        stackIn_62_1 = param4.field_l;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 >= stackIn_62_1) {
                            statePc = 70;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_71_0 = var18 ^ -1;
                        stackIn_64_0 = stackIn_71_0;
                        stackIn_71_1 = mk.field_w.length ^ -1;
                        stackIn_64_1 = stackIn_71_1;
                        if (var30 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_66_0 = stackIn_64_0;
                        stackIn_66_1 = stackIn_64_1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 <= stackIn_66_1) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var19 = param4.field_e[var18];
                        var20 = param4.field_F[var18];
                        var21 = param4.field_L[var18];
                        mk.field_w[var18] = var15 * var21 + (var9 * var19 + var12 * var20) >> -577623920;
                        nh.field_j[var18] = var19 * var10 + (var20 * var13 + var21 * var16) >> 291076144;
                        d.field_b[var18] = var21 * var17 + (var14 * var20 + var19 * var11) >> 1438355760;
                        var18++;
                        if (var30 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = var8;
                        stackIn_71_1 = -128;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ej.a(stackIn_71_0, (byte) stackIn_71_1, param4, param3, var7_int);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_76_0 = (RuntimeException) (var7);
                    stackIn_74_0 = stackIn_76_0;
                    stackIn_76_1 = new StringBuilder().append("gg.E(").append(param0).append(',');
                    stackIn_74_1 = stackIn_76_1;
                    if (param1 == null) {
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
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(',');
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
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_0 = stackIn_84_0;
                    stackIn_84_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param5).append(',');
                    stackIn_82_1 = stackIn_84_1;
                    if (param6 == null) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_85_2 = "{...}";
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
                    stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
                    stackIn_85_2 = "null";
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    throw ch.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        try {
            dg.b(-81);
            ba.a(119, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "gg.D(" + param0 + ')');
        }
    }

    private gg() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "gg.<init>()");
        }
    }

    private final void a(byte param0, qk param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -107) {
                break L1;
              } else {
                field_f = (hi) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_float = (float)(1 + this.field_g) + (float)param2 / 100.0f;
                if ((param2 ^ -1) != -1) {
                  break L3;
                } else {
                  this.field_a = param1.field_b;
                  if (!Transmogrify.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_a = param1.field_d + " - " + param2 + "%";
              break L2;
            }
            this.field_c = (float)this.field_d * var4_float / (float)(1 + this.field_e);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("gg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new hi();
    }
}
