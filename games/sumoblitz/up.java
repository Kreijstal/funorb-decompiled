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

    final static void a(int[] param0, int[] param1, boolean param2, boolean param3, gk param4) {
        RuntimeException var7 = null;
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
        int stackIn_60_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var30 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 2;
            var22 = param0[4] >> 2;
            var23 = param0[5] >> 2;
            var24 = param0[6] >> 2;
            var25 = param0[7] >> 2;
            var26 = param0[8] >> 2;
            var27 = param0[9] >> 2;
            var28 = param0[10] >> 2;
            var29 = param0[11] >> 2;
            var12 = param1[3] * var21 - (-(param1[4] * var22) + -(param1[5] * var23)) >> 14;
            var13 = param1[4] * var25 + (param1[3] * var24 + var26 * param1[5]) >> 14;
            var18 = var23 * param1[11] + (param1[10] * var22 + var21 * param1[9]) >> 14;
            var19 = param1[11] * var26 + param1[9] * var24 + var25 * param1[10] >> 14;
            var17 = var27 * param1[6] - (-(var28 * param1[7]) + -(param1[8] * var29)) >> 14;
            var14 = var29 * param1[5] + (param1[4] * var28 + param1[3] * var27) >> 14;
            var16 = var24 * param1[6] - (-(var25 * param1[7]) - param1[8] * var26) >> 14;
            var15 = param1[6] * var21 - (-(var22 * param1[7]) + -(var23 * param1[8])) >> 14;
            var20 = var29 * param1[11] + (var27 * param1[9] - -(param1[10] * var28)) >> 14;
            var21 = param1[0] - param0[0];
            var22 = -param0[1] + param1[1];
            var23 = -param0[2] + param1[2];
            var9 = var21 * param0[3] + (param0[4] * var22 + param0[5] * var23) >> 16 - jn.field_b;
            var11 = param0[11] * var23 + param0[10] * var22 + var21 * param0[9] >> 16;
            var10 = var21 * param0[6] - -(var22 * param0[7]) - -(param0[8] * var23) >> 16 - jn.field_b;
            var21 = nk.field_e;
            var22 = nk.field_b;
            var23 = 0;
            L1: while (true) {
              if (var23 >= param4.field_D) {
                L2: {
                  if (null == param4.field_I) {
                    break L2;
                  } else {
                    if (null == param4.field_m) {
                      break L2;
                    } else {
                      if (null == param4.field_M) {
                        break L2;
                      } else {
                        if (null == param4.field_F) {
                          break L2;
                        } else {
                          if (null == param4.field_i) {
                            break L2;
                          } else {
                            if (param4.field_J == null) {
                              break L2;
                            } else {
                              if (param4.field_q == null) {
                                break L2;
                              } else {
                                if (null == param4.field_p) {
                                  break L2;
                                } else {
                                  if (null != param4.field_s) {
                                    var23 = 0;
                                    L3: while (true) {
                                      if (param4.field_n <= var23) {
                                        break L2;
                                      } else {
                                        var24 = param4.field_I[var23];
                                        var25 = param4.field_m[var23];
                                        var26 = param4.field_M[var23];
                                        ci.field_b[var23] = var9 - -(var26 * var18 + var15 * var25 + var12 * var24 >> 16);
                                        au.field_h[var23] = (var26 * var19 + (var24 * var13 - -(var25 * var16)) >> 16) + var10;
                                        bq.field_d[var23] = var11 + (var25 * var17 + var24 * var14 - -(var26 * var20) >> 16);
                                        var24 = param4.field_F[var23];
                                        var25 = param4.field_i[var23];
                                        var26 = param4.field_J[var23];
                                        mp.field_b[var23] = var9 - -(var25 * var15 + (var12 * var24 + var26 * var18) >> 16);
                                        ta.field_e[var23] = (var19 * var26 + (var16 * var25 + var13 * var24) >> 16) + var10;
                                        aa.field_d[var23] = var11 + (var14 * var24 - (-(var17 * var25) + -(var26 * var20)) >> 16);
                                        var24 = param4.field_q[var23];
                                        var25 = param4.field_p[var23];
                                        var26 = param4.field_s[var23];
                                        ua.field_h[var23] = var9 - -(var18 * var26 + (var25 * var15 + var24 * var12) >> 16);
                                        jf.field_e[var23] = var10 - -(var24 * var13 + var16 * var25 - -(var19 * var26) >> 16);
                                        tl.field_k[var23] = var11 + (var17 * var25 + var14 * var24 - -(var20 * var26) >> 16);
                                        var23++;
                                        continue L3;
                                      }
                                    }
                                  } else {
                                    break L2;
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
                L4: while (true) {
                  L5: {
                    if (~param4.field_c >= ~var18) {
                      break L5;
                    } else {
                      stackOut_58_0 = var18;
                      stackIn_60_0 = stackOut_58_0;
                      if (stackIn_60_0 >= of.field_t.length) {
                        break L5;
                      } else {
                        var19 = param4.field_x[var18];
                        var20 = param4.field_g[var18];
                        var21 = param4.field_L[var18];
                        of.field_t[var18] = var19 * var9 - (-(var12 * var20) + -(var15 * var21)) >> 16;
                        r.field_r[var18] = var20 * var13 + var19 * var10 + var21 * var16 >> 16;
                        qr.field_d[var18] = var17 * var21 + (var11 * var19 - -(var20 * var14)) >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  ih.a(false, param4, -1, var8, var7_int);
                  break L0;
                }
              } else {
                L6: {
                  var24 = param4.field_Q[var23];
                  var25 = param4.field_B[var23];
                  var26 = param4.field_r[var23];
                  var27 = (var12 * var24 - -(var25 * var15) + var18 * var26 >> -jn.field_b + 16) + var9;
                  var28 = (var24 * var13 - -(var25 * var16) + var19 * var26 >> -jn.field_b + 16) + var10;
                  var29 = (var26 * var20 + var17 * var25 + var24 * var14 >> 16) + var11;
                  if (var29 < 50) {
                    gi.field_k[var23] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      we.field_z[var23] = var21 - -(var27 / var29);
                      hp.field_o[var23] = var28 / var29 + var22;
                      if (~var8 > ~var29) {
                        var8 = var29;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    gi.field_k[var23] = var29;
                    if (var29 < var7_int) {
                      var7_int = var29;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                var23++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("up.A(");
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L8;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L8;
            }
          }
          L9: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L9;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L9;
            }
          }
          L10: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44).append(0).append(44).append(0).append(44);
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L10;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L10;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + 1 + 44 + -1622738130 + 41);
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_c = null;
            field_e = null;
            field_f = null;
            field_g = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "up.B(" + -127 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_f = new int[8192];
        field_g = new boolean[25];
        field_b = "Cancel";
    }
}
