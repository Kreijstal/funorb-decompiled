/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                boolean discarded$2 = ((eg) this).a(true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this == (Object) (Object) he.field_o) {
                  break L3;
                } else {
                  if (this == (Object) (Object) vc.field_a) {
                    break L3;
                  } else {
                    if ((Object) (Object) wq.field_e != this) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_13_0 = stackOut_10_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "eg.B(" + param0 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "eg.toString()");
        }
    }

    final static void a(wu param0, int[] param1, int param2, boolean param3, boolean param4, int[] param5) {
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
        int var31 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_54_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
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
        var31 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param1[3] >> 2;
            var22 = param1[4] >> 2;
            var23 = param1[5] >> 2;
            var24 = param1[6] >> 2;
            var25 = param1[7] >> 2;
            var26 = param1[8] >> 2;
            var27 = param1[9] >> 2;
            var28 = param1[10] >> 2;
            var29 = param1[11] >> 2;
            var12 = var23 * param5[5] + var21 * param5[3] - -(param5[4] * var22) >> 14;
            var13 = param5[3] * var24 + (param5[4] * var25 + var26 * param5[5]) >> 14;
            var17 = var27 * param5[6] - -(param5[7] * var28) - -(var29 * param5[8]) >> 14;
            var14 = var29 * param5[5] + (var28 * param5[4] + var27 * param5[3]) >> 14;
            var15 = var21 * param5[6] - -(param5[7] * var22) - -(var23 * param5[8]) >> 14;
            var18 = param5[9] * var21 + var22 * param5[10] + param5[11] * var23 >> 14;
            var19 = param5[10] * var25 + var24 * param5[9] + var26 * param5[11] >> 14;
            var16 = var25 * param5[7] + var24 * param5[6] - -(param5[8] * var26) >> 14;
            var20 = var29 * param5[11] + (param5[10] * var28 + var27 * param5[9]) >> 14;
            var21 = param5[0] - param1[0];
            var22 = -param1[1] + param5[1];
            var23 = -param1[2] + param5[2];
            var9 = param1[4] * var22 + (var21 * param1[3] - -(var23 * param1[5])) >> -im.field_f + 16;
            var11 = param1[9] * var21 + var22 * param1[10] - -(var23 * param1[11]) >> 16;
            var10 = var23 * param1[8] + var21 * param1[6] - -(var22 * param1[7]) >> -im.field_f + 16;
            var21 = re.field_d;
            var23 = 0;
            var22 = re.field_e;
            var24 = 0;
            L1: while (true) {
              if (~var24 <= ~param0.field_r) {
                L2: {
                  if (null == param0.field_p) {
                    break L2;
                  } else {
                    if (param0.field_k == null) {
                      break L2;
                    } else {
                      if (param0.field_o == null) {
                        break L2;
                      } else {
                        if (null == param0.field_Q) {
                          break L2;
                        } else {
                          if (null == param0.field_e) {
                            break L2;
                          } else {
                            if (null == param0.field_j) {
                              break L2;
                            } else {
                              if (null == param0.field_i) {
                                break L2;
                              } else {
                                if (param0.field_M == null) {
                                  break L2;
                                } else {
                                  if (param0.field_a == null) {
                                    break L2;
                                  } else {
                                    var24 = 0;
                                    L3: while (true) {
                                      if (var24 >= param0.field_K) {
                                        break L2;
                                      } else {
                                        var25 = param0.field_p[var24];
                                        var26 = param0.field_k[var24];
                                        var27 = param0.field_o[var24];
                                        ep.field_u[var24] = var9 - -(var18 * var27 + (var26 * var15 + var12 * var25) >> 16);
                                        rs.field_B[var24] = var10 - -(var19 * var27 + var13 * var25 + var16 * var26 >> 16);
                                        pf.field_A[var24] = (var27 * var20 + var25 * var14 - -(var26 * var17) >> 16) + var11;
                                        var25 = param0.field_Q[var24];
                                        var26 = param0.field_e[var24];
                                        var27 = param0.field_j[var24];
                                        ec.field_m[var24] = (var18 * var27 + (var15 * var26 + var25 * var12) >> 16) + var9;
                                        dk.field_g[var24] = (var27 * var19 + (var26 * var16 + var25 * var13) >> 16) + var10;
                                        vo.field_d[var24] = (var25 * var14 - -(var17 * var26) - -(var20 * var27) >> 16) + var11;
                                        var25 = param0.field_i[var24];
                                        var26 = param0.field_M[var24];
                                        var27 = param0.field_a[var24];
                                        wc.field_a[var24] = (var18 * var27 + (var26 * var15 + var12 * var25) >> 16) + var9;
                                        lp.field_e[var24] = var10 + (var26 * var16 + var13 * var25 + var27 * var19 >> 16);
                                        hk.field_i[var24] = (var27 * var20 + var25 * var14 + var26 * var17 >> 16) + var11;
                                        var24++;
                                        continue L3;
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
                  }
                }
                var9 = param5[3];
                var10 = param5[4];
                var11 = param5[5];
                var12 = param5[6];
                var13 = param5[7];
                var14 = param5[8];
                var15 = param5[9];
                var16 = param5[10];
                var17 = param5[11];
                var18 = 0;
                L4: while (true) {
                  L5: {
                    if (param0.field_q <= var18) {
                      break L5;
                    } else {
                      stackOut_54_0 = ~ip.field_b.length;
                      stackIn_56_0 = stackOut_54_0;
                      if (stackIn_56_0 >= ~var18) {
                        break L5;
                      } else {
                        var19 = param0.field_H[var18];
                        var20 = param0.field_L[var18];
                        var21 = param0.field_n[var18];
                        ip.field_b[var18] = var12 * var20 + var9 * var19 - -(var21 * var15) >> 16;
                        ql.field_o[var18] = var21 * var16 + (var19 * var10 + var20 * var13) >> 16;
                        dq.field_c[var18] = var17 * var21 + (var11 * var19 - -(var20 * var14)) >> 16;
                        var18++;
                        continue L4;
                      }
                    }
                  }
                  ed.a(var7_int, param0, (byte) -69, var8, false);
                  break L0;
                }
              } else {
                L6: {
                  var25 = param0.field_z[var24];
                  var26 = param0.field_P[var24];
                  var27 = param0.field_F[var24];
                  var28 = (var27 * var18 + (var12 * var25 + var26 * var15) >> -im.field_f + 16) + var9;
                  var29 = var10 + (var16 * var26 + var25 * var13 + var27 * var19 >> -im.field_f + 16);
                  var30 = (var25 * var14 + var17 * var26 - -(var20 * var27) >> 16) + var11;
                  if (50 > var30) {
                    lp.field_d[var24] = -2147483648;
                    break L6;
                  } else {
                    L7: {
                      qj.field_t[var24] = var28 / var30 + var21;
                      ro.field_t[var24] = var22 + var29 / var30;
                      lp.field_d[var24] = var30;
                      if (~var7_int < ~var30) {
                        var7_int = var30;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (~var8 > ~var30) {
                      var8 = var30;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                var24++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var7;
            stackOut_62_1 = new StringBuilder().append("eg.A(");
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L8;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L8;
            }
          }
          L9: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44);
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L9;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L9;
            }
          }
          L10: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(45).append(44).append(1).append(44).append(0).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L10;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + 0 + 41);
        }
    }

    static {
    }
}
