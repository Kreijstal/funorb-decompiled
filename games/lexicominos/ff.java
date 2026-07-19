/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static ra field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -91) {
            field_b = (ra) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, pk param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        nj var21_ref = null;
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
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        pk var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        nj stackIn_43_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_19_0 = null;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_23_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        short stackOut_31_0 = 0;
        short stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        nj stackOut_41_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var40 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param6 <= -98) {
              L1: {
                L2: {
                  L3: {
                    var44 = param7;
                    if (null == var44.field_J) {
                      break L3;
                    } else {
                      if (1 < var44.field_N) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  mb.a(0);
                  if (var40 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                var60 = var44.field_J;
                td.a(0, bd.field_l, 0, var60, 0);
                break L1;
              }
              var54 = new int[param7.field_A];
              var49 = var54;
              var41 = var49;
              var8_array = var41;
              var64 = new int[param7.field_A];
              var62 = qf.field_q;
              var61 = ee.field_b;
              var63 = wh.field_e;
              var13 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var13 >= param7.field_A) {
                      break L6;
                    } else {
                      var14 = param2 * var61[var13] + (var62[var13] * param1 + var63[var13] * param5) >> 1062890696;
                      stackOut_11_0 = var14;
                      stackIn_24_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var40 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_12_0 >= 0) {
                            break L7;
                          } else {
                            var14 = -var14;
                            break L7;
                          }
                        }
                        L8: {
                          if ((var14 ^ -1) > -1) {
                            stackOut_18_0 = 128;
                            stackIn_19_0 = stackOut_18_0;
                            break L8;
                          } else {
                            if (var14 < 128) {
                              stackOut_17_0 = var14 + 128;
                              stackIn_19_0 = stackOut_17_0;
                              break L8;
                            } else {
                              stackOut_16_0 = 256;
                              stackIn_19_0 = stackOut_16_0;
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var14 = stackIn_19_0;
                          var15 = param0 * var61[var13] + param3 * var62[var13] + param4 * var63[var13] >> -489925112;
                          stackOut_19_0 = gl.field_e;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (-1 >= (var15 ^ -1)) {
                            stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                            stackOut_21_1 = var15;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            break L9;
                          } else {
                            stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                            stackOut_20_1 = -var15;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_22_1 = stackOut_20_1;
                            break L9;
                          }
                        }
                        var15 = stackIn_22_0[stackIn_22_1];
                        var14 = (-var15 + 256) * var14 >>> -1937084568;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L5;
                }
                var13 = stackIn_24_0;
                L10: while (true) {
                  L11: {
                    if (wb.field_i <= var13) {
                      break L11;
                    } else {
                      var14 = bf.field_a[var13];
                      var15 = param7.field_a[var14];
                      var16 = param7.field_k[var14];
                      var17 = param7.field_B[var14];
                      if (var40 != 0) {
                        break L11;
                      } else {
                        L12: {
                          if (param7.field_j[var14] < qf.field_q.length) {
                            stackOut_29_0 = param7.field_j[var14];
                            stackIn_30_0 = stackOut_29_0;
                            break L12;
                          } else {
                            stackOut_28_0 = -1;
                            stackIn_30_0 = stackOut_28_0;
                            break L12;
                          }
                        }
                        L13: {
                          var18 = stackIn_30_0;
                          if (param7.field_K[var14] >= qf.field_q.length) {
                            stackOut_32_0 = -1;
                            stackIn_33_0 = stackOut_32_0;
                            break L13;
                          } else {
                            stackOut_31_0 = param7.field_K[var14];
                            stackIn_33_0 = stackOut_31_0;
                            break L13;
                          }
                        }
                        L14: {
                          var19 = stackIn_33_0;
                          if (qf.field_q.length > param7.field_E[var14]) {
                            stackOut_35_0 = param7.field_E[var14];
                            stackIn_36_0 = stackOut_35_0;
                            break L14;
                          } else {
                            stackOut_34_0 = -1;
                            stackIn_36_0 = stackOut_34_0;
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            var20 = stackIn_36_0;
                            if (sh.field_d == null) {
                              break L16;
                            } else {
                              if (param7.field_q == null) {
                                break L16;
                              } else {
                                if (param7.field_q.length <= var14) {
                                  break L16;
                                } else {
                                  if (-1 == param7.field_q[var14]) {
                                    break L16;
                                  } else {
                                    if (param7.field_q[var14] >= sh.field_d.length) {
                                      break L16;
                                    } else {
                                      stackOut_41_0 = sh.field_d[param7.field_q[var14]];
                                      stackIn_43_0 = stackOut_41_0;
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_42_0 = null;
                          stackIn_43_0 = (nj) ((Object) stackOut_42_0);
                          break L15;
                        }
                        L17: {
                          L18: {
                            var21_ref = stackIn_43_0;
                            var22 = ej.field_c[var15];
                            var23 = fk.field_d[var15];
                            var24 = ej.field_c[var16];
                            var25 = fk.field_d[var16];
                            var26 = ej.field_c[var17];
                            var27 = fk.field_d[var17];
                            if (var18 != var19) {
                              break L18;
                            } else {
                              if (var20 != var19) {
                                break L18;
                              } else {
                                L19: {
                                  var28 = var54[var18];
                                  var29 = var64[var18];
                                  if (var21_ref != null) {
                                    stackOut_47_0 = var21_ref.field_c;
                                    stackIn_48_0 = stackOut_47_0;
                                    break L19;
                                  } else {
                                    stackOut_46_0 = 8355711;
                                    stackIn_48_0 = stackOut_46_0;
                                    break L19;
                                  }
                                }
                                var30 = stackIn_48_0;
                                var31 = 16711935 & var30;
                                var32 = var30 & 65280;
                                var33 = (16711773 & var32 * var28) >>> -1452152120 | (-16711764 & var31 * var28) >>> 2132277768;
                                var33 = var33 + 65793 * var29;
                                qg.a((var33 & 16711422) >> 812298529, var22, var25, var24, var27, -74, var26, var23);
                                if (var40 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          L20: {
                            var28 = var54[var18];
                            var29 = var54[var19];
                            var30 = var54[var20];
                            var31 = var64[var18];
                            var32 = var64[var19];
                            var33 = var64[var20];
                            if (var21_ref == null) {
                              stackOut_51_0 = 8355711;
                              stackIn_52_0 = stackOut_51_0;
                              break L20;
                            } else {
                              stackOut_50_0 = var21_ref.field_c;
                              stackIn_52_0 = stackOut_50_0;
                              break L20;
                            }
                          }
                          var34 = stackIn_52_0;
                          var35 = var34 & 16711935;
                          var36 = 65280 & var34;
                          var37 = -1946091776 & var36 * var28 >>> 480720744 | 1207894271 & var28 * var35 >>> -783188952;
                          var38 = (var35 * var29 & -16711819) >>> -962721624 | var36 * var29 >>> 1530568296 & 838926080;
                          var39 = var35 * var30 >>> -276576792 & 201261311 | (var36 * var30 & 16711788) >>> -923410008;
                          var37 = var37 + var31 * 65793;
                          var38 = var38 + 65793 * var32;
                          var39 = var39 + var33 * 65793;
                          uf.a((65474 & var39) >> -1489419768, var22, var39 >> -153559824, (byte) -28, var26, var38 & 255, var25, var38 >> -110227280, var24, var23, var37 & 255, var37 >> -1656301104, 255 & var37 >> 742984872, var38 >> 1255840936 & 255, 255 & var39, var27);
                          break L17;
                        }
                        var13++;
                        if (var40 == 0) {
                          continue L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var8 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var8);
            stackOut_55_1 = new StringBuilder().append("ff.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L21;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L21;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
