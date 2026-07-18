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

    final static void a() {
        try {
            int var2_int = -98;
            hb.field_H = 20000000L;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ui.C(" + 50 + ',' + 127 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int[] param3, int[] param4, boolean param5, jk param6) {
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
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
        var31 = Bounce.field_N;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param3[3] >> 2;
            var22 = param3[4] >> 2;
            var23 = param3[5] >> 2;
            var24 = param3[6] >> 2;
            var25 = param3[7] >> 2;
            var26 = param3[8] >> 2;
            var27 = param3[9] >> 2;
            var29 = 59;
            var28 = param3[10] >> 2;
            var30 = param3[11] >> 2;
            var13 = var26 * param4[5] + (param4[3] * var24 + param4[4] * var25) >> 14;
            var12 = param4[3] * var21 + (param4[4] * var22 - -(var23 * param4[5])) >> 14;
            var19 = param4[9] * var24 - (-(var25 * param4[10]) - var26 * param4[11]) >> 14;
            var14 = param4[4] * var28 + (var27 * param4[3] + param4[5] * var30) >> 14;
            var15 = var21 * param4[6] + (param4[7] * var22 - -(var23 * param4[8])) >> 14;
            var18 = param4[10] * var22 + param4[9] * var21 - -(var23 * param4[11]) >> 14;
            var16 = param4[7] * var25 + param4[6] * var24 + param4[8] * var26 >> 14;
            var17 = var30 * param4[8] + param4[7] * var28 + param4[6] * var27 >> 14;
            var20 = var27 * param4[9] + param4[10] * var28 - -(var30 * param4[11]) >> 14;
            var21 = param4[0] - param3[0];
            var22 = param4[1] + -param3[1];
            var23 = param4[2] - param3[2];
            var9 = var23 * param3[5] + (var22 * param3[4] + var21 * param3[3]) >> 16 - kk.field_s;
            var11 = param3[11] * var23 + var22 * param3[10] + param3[9] * var21 >> 16;
            var10 = var21 * param3[6] + var22 * param3[7] + param3[8] * var23 >> 16 - kk.field_s;
            var21 = qk.field_f;
            var22 = qk.field_e;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var23 >= param6.field_k) {
                      break L4;
                    } else {
                      var24 = param6.field_g[var23];
                      var25 = param6.field_C[var23];
                      var26 = param6.field_J[var23];
                      var27 = var9 + (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> 16 + -kk.field_s);
                      var28 = var10 + (var25 * var16 + (var13 * var24 + var19 * var26) >> -kk.field_s + 16);
                      var29 = var11 + (var24 * var14 - -(var17 * var25) + var26 * var20 >> 16);
                      stackOut_3_0 = -51;
                      stackOut_3_1 = ~var29;
                      stackIn_60_0 = stackOut_3_0;
                      stackIn_60_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var31 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_4_0 < stackIn_4_1) {
                              break L6;
                            } else {
                              L7: {
                                ca.field_c[var23] = var27 / var29 + var21;
                                kg.field_g[var23] = var22 + var28 / var29;
                                r.field_c[var23] = var29;
                                if (~var29 <= ~var7_int) {
                                  break L7;
                                } else {
                                  var7_int = var29;
                                  break L7;
                                }
                              }
                              if (var29 <= var8) {
                                break L5;
                              } else {
                                var8 = var29;
                                if (var31 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          r.field_c[var23] = -2147483648;
                          break L5;
                        }
                        var23++;
                        if (var31 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: {
                    if (null == param6.field_G) {
                      break L8;
                    } else {
                      if (param6.field_j == null) {
                        break L8;
                      } else {
                        if (param6.field_A == null) {
                          break L8;
                        } else {
                          if (null == param6.field_c) {
                            break L8;
                          } else {
                            if (param6.field_o == null) {
                              break L8;
                            } else {
                              if (param6.field_r == null) {
                                break L8;
                              } else {
                                if (null == param6.field_z) {
                                  break L8;
                                } else {
                                  if (null == param6.field_h) {
                                    break L8;
                                  } else {
                                    if (null != param6.field_E) {
                                      var23 = 0;
                                      L9: while (true) {
                                        if (var23 >= param6.field_L) {
                                          break L8;
                                        } else {
                                          var24 = param6.field_G[var23];
                                          var25 = param6.field_j[var23];
                                          var26 = param6.field_A[var23];
                                          il.field_d[var23] = var9 - -(var12 * var24 - -(var25 * var15) - -(var18 * var26) >> 16);
                                          nd.field_F[var23] = (var19 * var26 + var16 * var25 + var24 * var13 >> 16) + var10;
                                          pc.field_j[var23] = (var26 * var20 + var17 * var25 + var24 * var14 >> 16) + var11;
                                          var24 = param6.field_c[var23];
                                          var25 = param6.field_o[var23];
                                          var26 = param6.field_r[var23];
                                          ml.field_f[var23] = var9 - -(var12 * var24 + (var15 * var25 - -(var18 * var26)) >> 16);
                                          gh.field_I[var23] = (var26 * var19 + var16 * var25 + var24 * var13 >> 16) + var10;
                                          fl.field_b[var23] = (var20 * var26 + (var14 * var24 - -(var25 * var17)) >> 16) + var11;
                                          var24 = param6.field_z[var23];
                                          var25 = param6.field_h[var23];
                                          var26 = param6.field_E[var23];
                                          ne.field_m[var23] = var9 - -(var18 * var26 + var12 * var24 - -(var25 * var15) >> 16);
                                          qe.field_g[var23] = (var25 * var16 + var13 * var24 + var19 * var26 >> 16) + var10;
                                          nc.field_a[var23] = (var26 * var20 + (var17 * var25 + var24 * var14) >> 16) + var11;
                                          var23++;
                                          if (var31 != 0) {
                                            break L2;
                                          } else {
                                            if (var31 == 0) {
                                              continue L9;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L8;
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
                  L10: while (true) {
                    L11: {
                      if (var18 >= param6.field_d) {
                        break L11;
                      } else {
                        stackOut_54_0 = uc.field_D.length;
                        stackOut_54_1 = var18;
                        stackIn_60_0 = stackOut_54_0;
                        stackIn_60_1 = stackOut_54_1;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        if (var31 != 0) {
                          break L3;
                        } else {
                          if (stackIn_55_0 <= stackIn_55_1) {
                            break L11;
                          } else {
                            var19 = param6.field_f[var18];
                            var20 = param6.field_i[var18];
                            var21 = param6.field_x[var18];
                            uc.field_D[var18] = var9 * var19 - (-(var20 * var12) - var15 * var21) >> 16;
                            ih.field_db[var18] = var20 * var13 + (var19 * var10 - -(var21 * var16)) >> 16;
                            nk.field_b[var18] = var11 * var19 - -(var14 * var20) - -(var21 * var17) >> 16;
                            var18++;
                            if (var31 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_59_0 = 0;
                    stackOut_59_1 = -128;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L3;
                  }
                }
                hj.a(stackIn_60_0 != 0, (byte) stackIn_60_1, param6, var8, var7_int);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var7;
            stackOut_62_1 = new StringBuilder().append("ui.A(").append(-99).append(',').append(false).append(',').append(false).append(',');
            stackIn_65_0 = stackOut_62_0;
            stackIn_65_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param3 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L12;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_66_0 = stackOut_63_0;
              stackIn_66_1 = stackOut_63_1;
              stackIn_66_2 = stackOut_63_2;
              break L12;
            }
          }
          L13: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L13;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L13;
            }
          }
          L14: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(true).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param6 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L14;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L14;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_k = null;
            field_o = null;
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ui.B(" + true + ')');
        }
    }

    ui(int param0, int param1, int param2, int param3, int param4) {
        try {
            ((ui) this).field_q = param0;
            ((ui) this).field_r = param4;
            ((ui) this).field_l = param2;
            ((ui) this).field_h = param1;
            ((ui) this).field_i = param3;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ui.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "This game has been updated! Please reload this page.";
        field_j = "Score - ";
        field_o = new vf();
    }
}
