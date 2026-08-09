/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up {
    static boolean field_d;
    static int field_a;
    static hr[] field_e;
    static boolean[] field_g;
    static hr[] field_c;
    private static int[] field_f;
    static String field_b;

    final static void a(int[] param0, int[] param1, boolean param2, boolean param3, gk param4, boolean param5, int param6) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var30 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> -1718325534;
            var22 = param0[4] >> -2122448318;
            var23 = param0[5] >> -1579514526;
            var24 = param0[6] >> -654184062;
            var25 = param0[7] >> -988223870;
            var26 = param0[8] >> 2136383522;
            var27 = param0[9] >> 1890904290;
            var28 = param0[10] >> -1557338302;
            var29 = param0[11] >> 341287234;
            var12 = param1[3] * var21 - (-(param1[4] * var22) + -(param1[5] * var23)) >> -1354424690;
            var13 = param1[4] * var25 + (param1[3] * var24 + var26 * param1[5]) >> -834052882;
            if (param6 == -1622738130) {
              var18 = var23 * param1[11] + (param1[10] * var22 + var21 * param1[9]) >> -167767250;
              var19 = param1[11] * var26 + param1[9] * var24 + var25 * param1[10] >> -1411763538;
              var17 = var27 * param1[6] - (-(var28 * param1[7]) + -(param1[8] * var29)) >> 1499657582;
              var14 = var29 * param1[5] + (param1[4] * var28 + param1[3] * var27) >> 546205454;
              var16 = var24 * param1[6] - (-(var25 * param1[7]) - param1[8] * var26) >> 1450549262;
              var15 = param1[6] * var21 - (-(var22 * param1[7]) + -(var23 * param1[8])) >> -1622738130;
              var20 = var29 * param1[11] + (var27 * param1[9] - -(param1[10] * var28)) >> 1248110030;
              var21 = param1[0] - param0[0];
              var22 = -param0[1] + param1[1];
              var23 = -param0[2] + param1[2];
              var9 = var21 * param0[3] + (param0[4] * var22 + param0[5] * var23) >> 16 - jn.field_b;
              var11 = param0[11] * var23 + param0[10] * var22 + var21 * param0[9] >> -970539568;
              var10 = var21 * param0[6] - -(var22 * param0[7]) - -(param0[8] * var23) >> 16 - jn.field_b;
              var21 = nk.field_e;
              var22 = nk.field_b;
              var23 = 0;
              L1: while (true) {
                L2: {
                  if (var23 >= param4.field_D) {
                    L3: {
                      if (null == param4.field_I) {
                        break L3;
                      } else {
                        if (null == param4.field_m) {
                          break L3;
                        } else {
                          if (null == param4.field_M) {
                            break L3;
                          } else {
                            if (null == param4.field_F) {
                              break L3;
                            } else {
                              if (null == param4.field_i) {
                                break L3;
                              } else {
                                if (param4.field_J == null) {
                                  break L3;
                                } else {
                                  if (param4.field_q == null) {
                                    break L3;
                                  } else {
                                    if (null == param4.field_p) {
                                      break L3;
                                    } else {
                                      if (null != param4.field_s) {
                                        var23 = 0;
                                        L4: while (true) {
                                          if (param4.field_n <= var23) {
                                            break L3;
                                          } else {
                                            var24 = param4.field_I[var23];
                                            var25 = param4.field_m[var23];
                                            var26 = param4.field_M[var23];
                                            ci.field_b[var23] = var9 - -(var26 * var18 + var15 * var25 + var12 * var24 >> 1233357008);
                                            au.field_h[var23] = (var26 * var19 + (var24 * var13 - -(var25 * var16)) >> 1435663024) + var10;
                                            bq.field_d[var23] = var11 + (var25 * var17 + var24 * var14 - -(var26 * var20) >> 1036476912);
                                            var24 = param4.field_F[var23];
                                            var25 = param4.field_i[var23];
                                            var26 = param4.field_J[var23];
                                            mp.field_b[var23] = var9 - -(var25 * var15 + (var12 * var24 + var26 * var18) >> 2102628912);
                                            ta.field_e[var23] = (var19 * var26 + (var16 * var25 + var13 * var24) >> 1746846800) + var10;
                                            aa.field_d[var23] = var11 + (var14 * var24 - (-(var17 * var25) + -(var26 * var20)) >> -1694530192);
                                            var24 = param4.field_q[var23];
                                            var25 = param4.field_p[var23];
                                            var26 = param4.field_s[var23];
                                            ua.field_h[var23] = var9 - -(var18 * var26 + (var25 * var15 + var24 * var12) >> -259910224);
                                            jf.field_e[var23] = var10 - -(var24 * var13 + var16 * var25 - -(var19 * var26) >> -1532017360);
                                            tl.field_k[var23] = var11 + (var17 * var25 + var14 * var24 - -(var20 * var26) >> -1890965136);
                                            var23++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (!param5) {
                      break L2;
                    } else {
                      var9 = param1[3];
                      var10 = param1[4];
                      var11 = param1[5];
                      var12 = param1[6];
                      var13 = param1[7];
                      var14 = param1[8];
                      var15 = param1[9];
                      var16 = param1[10];
                      var17 = param1[11];
                      var18 = 0;
                      L5: while (true) {
                        stackIn_61_0 = param4.field_c ^ -1;
                        stackIn_61_1 = var18 ^ -1;
                        if (stackIn_61_0 >= stackIn_61_1) {
                          break L2;
                        } else {
                          stackIn_64_0 = var18;
                          if (stackIn_64_0 >= of.field_t.length) {
                            break L2;
                          } else {
                            var19 = param4.field_x[var18];
                            var20 = param4.field_g[var18];
                            var21 = param4.field_L[var18];
                            of.field_t[var18] = var19 * var9 - (-(var12 * var20) + -(var15 * var21)) >> 1825460976;
                            r.field_r[var18] = var20 * var13 + var19 * var10 + var21 * var16 >> -978897200;
                            qr.field_d[var18] = var17 * var21 + (var11 * var19 - -(var20 * var14)) >> -453832944;
                            var18++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var24 = param4.field_Q[var23];
                    var25 = param4.field_B[var23];
                    var26 = param4.field_r[var23];
                    var27 = (var12 * var24 - -(var25 * var15) + var18 * var26 >> -jn.field_b + 16) + var9;
                    var28 = (var24 * var13 - -(var25 * var16) + var19 * var26 >> -jn.field_b + 16) + var10;
                    var29 = (var26 * var20 + var17 * var25 + var24 * var14 >> 1128474032) + var11;
                    stackIn_61_0 = var29;

                    stackIn_61_1 = 50;

                    L7: {
                      if (stackIn_61_0 < stackIn_61_1) {
                        gi.field_k[var23] = -2147483648;
                        break L7;
                      } else {
                        L8: {
                          we.field_z[var23] = var21 - -(var27 / var29);
                          hp.field_o[var23] = var28 / var29 + var22;
                          if ((var8 ^ -1) > (var29 ^ -1)) {
                            var8 = var29;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        gi.field_k[var23] = var29;
                        if (var29 < var7_int) {
                          var7_int = var29;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (param3) {
                        eq.field_v[var23] = var27 >> jn.field_b;
                        ad.field_q[var23] = var28 >> jn.field_b;
                        field_f[var23] = var29;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var23++;
                    continue L1;
                  }
                }
                ih.a(param2, param4, -1, var8, var7_int);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var7);

            stackIn_73_1 = new StringBuilder().append("up.A(");

            if (param0 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L10;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L11;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "null";
              break L12;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackIn_82_2 = "{...}";
              break L12;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_74_0), stackIn_82_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_e = null;
              field_f = null;
              field_g = null;
              if (param0 <= -9) {
                break L1;
              } else {
                up.a((int[]) null, (int[]) null, true, true, (gk) null, false, 41);
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "up.B(" + param0 + ')');
        }
    }

    static {
        field_d = false;
        field_f = new int[8192];
        field_g = new boolean[25];
        field_b = "Cancel";
    }
}
